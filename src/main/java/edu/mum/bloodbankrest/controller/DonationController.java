package edu.mum.bloodbankrest.controller;


import edu.mum.bloodbankrest.amqp.PracticalTipSender;
import edu.mum.bloodbankrest.domain.BloodDrive;
import edu.mum.bloodbankrest.domain.Donation;
import edu.mum.bloodbankrest.domain.MailMessage;
import edu.mum.bloodbankrest.domain.Total;
import edu.mum.bloodbankrest.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/donations")
public class DonationController {
    @Autowired
    private DonationService donationService;
    @Autowired
    private BloodTypeService bloodTypeService;
    @Autowired
    private DonorService donorService;
    @Autowired
    private RequestService requestService;
    @Autowired
    PracticalTipSender practicalTipSender;
    @Autowired
    private BloodDriveService bloodDriveService;

    @GetMapping({"","/all"})
    public String getAllDonations(Model model) {
          model.addAttribute("donations",donationService.findAll());
          System.out.println(donationService.findAll());
           return "donation";

    }

    @GetMapping("/{id}")
    public Donation getDonationById( @PathVariable("id") Long donationId) {

        return donationService.findOne(donationId);
    }

    @GetMapping(value = "/add")
    public String getAddNewDonationForm(@ModelAttribute("newDonation") Donation donation, Model model) {
        model.addAttribute("donors",donorService.findAll());
       model.addAttribute("bloodDrives",bloodDriveService.findAll());
        return "addDonation";
    }
    @GetMapping(value = "/home")
    public String getdonationHome(@ModelAttribute("mailMessage") MailMessage mailMessage, Model model) {
         model.addAttribute("requests",requestService.findAll());
         model.addAttribute("totals",donorService.findByBloodType());
        System.out.println(donorService.findByBloodType());
        return "Homedonation";
    }
    @RequestMapping(value="/home", method = RequestMethod.POST)
    public  String ProcessMailMessage(@ModelAttribute("mailMessage") @Valid MailMessage mailMessage , Model model, BindingResult result){
        if(result.hasErrors()){
            return "Homedonation";
        }
        model.addAttribute("confirmation","Email Send Successfully");
        practicalTipSender.sendPracticalMailMessageTip(mailMessage);
        return "Homedonation";
    }


    @RequestMapping(value="/add", method = RequestMethod.POST)
    //  @ResponseStatus(value = HttpStatus.NO_CONTENT )
    public String processAddNewDonationForm(@ModelAttribute("newDonation") @Valid Donation donationTobeAddeded , BindingResult result) {

        if(result.hasErrors())
            return "addDonation";
       donationTobeAddeded.setDonationDate(Date.valueOf(LocalDate.now()));
           donationService.save(donationTobeAddeded);


        return "redirect:/";
    }
}
