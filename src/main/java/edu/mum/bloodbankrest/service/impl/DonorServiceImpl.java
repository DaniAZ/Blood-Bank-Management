package edu.mum.bloodbankrest.service.impl;



import edu.mum.bloodbankrest.domain.BloodType;
import edu.mum.bloodbankrest.domain.Donor;
import edu.mum.bloodbankrest.domain.Total;
import edu.mum.bloodbankrest.rest.service.DonorRestService;
import edu.mum.bloodbankrest.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DonorServiceImpl implements DonorService {

     @Autowired
     private DonorRestService donorRestService;


    @Override
    public void save(Donor donor) {
         donorRestService.save(donor);
    }

    @Override
    public void update(Donor donor) {
        donorRestService.update(donor);
    }

    @Override
    public List<Donor> findAll() {
        return donorRestService.findAll();
    }

    @Override
    public List<Total> findByBloodType() {
        return donorRestService.findByBloodType();
    }


    @Override
    public Donor findOne(Long id) {
        return donorRestService.findOne(id);
    }
}
