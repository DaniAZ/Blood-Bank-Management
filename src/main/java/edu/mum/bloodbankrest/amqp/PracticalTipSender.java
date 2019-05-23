package edu.mum.bloodbankrest.amqp;

import edu.mum.bloodbankrest.BloodbankrestApplication;
import edu.mum.bloodbankrest.domain.Donor;
import edu.mum.bloodbankrest.domain.MailMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class PracticalTipSender {

    private static final Logger log = LoggerFactory.getLogger(PracticalTipSender.class);

    private final RabbitTemplate rabbitTemplate;

    public PracticalTipSender(final RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

  //  @Scheduled(fixedDelay = 3000L)
    public void sendPracticalTip(Donor donor) {
        //PracticalTipMessage tip = new PracticalTipMessage("Always use Immutable classes in Java", 1, false);
        rabbitTemplate.convertAndSend(BloodbankrestApplication.EXCHANGE_NAME, BloodbankrestApplication.ROUTING_KEY, donor);
        log.info("Practical Tip sent");
    }
    public void sendPracticalMailMessageTip(MailMessage mailMessage) {
        //PracticalTipMessage tip = new PracticalTipMessage("Always use Immutable classes in Java", 1, false);
        rabbitTemplate.convertAndSend(BloodbankrestApplication.EXCHANGE_NAME, BloodbankrestApplication.ROUTING_KEY_Messaging, mailMessage);
        log.info("Practical Tip sent for MailMessage");
    }
}
