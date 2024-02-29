package com.examly.springapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Medicine;
import com.examly.springapp.repository.MedicineRepo;

@Service
public class MedicineService {
    
    @Autowired
    private MedicineRepo medicineRepo;

    public boolean addMedicine(Medicine medicine) {
        try{    
            medicineRepo.save(medicine);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<Medicine> getMedicines()
    {
        return medicineRepo.findAll();
    }

    public Optional<Medicine> findMedicineById(int id)
    {
        return medicineRepo.findById(id);
    }
}
