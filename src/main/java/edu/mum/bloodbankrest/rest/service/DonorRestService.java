package edu.mum.bloodbankrest.rest.service;


import edu.mum.bloodbankrest.domain.Donor;
import edu.mum.bloodbankrest.domain.Total;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DonorRestService {
    public void save(Donor donor);
    public void update(Donor donor);
    public List<Donor> findAll();
    public List<Total> findByBloodType();
    public Donor findOne(Long id);
}
