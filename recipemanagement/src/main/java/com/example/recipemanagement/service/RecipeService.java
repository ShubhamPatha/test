package com.example.recipemanagement.service;

import com.example.recipemanagement.model.Recipe;
import com.example.recipemanagement.model.User;
import com.example.recipemanagement.repo.IRecipeRepo;
import com.example.recipemanagement.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {
    @Autowired
    IRecipeRepo iRecipeRepo;
    @Autowired
    IUserRepo iUserRepo;

    public Iterable<Recipe> getallrec() {
       return iRecipeRepo.findAll();
    }

    public Optional<Recipe> getspecific(Integer id) {
    return iRecipeRepo.findById(id);
    }

    public void deletebyid(Integer id) {


        iRecipeRepo.deleteById(id);
        return;

    }

    public String addRec(Recipe rec) {
        iRecipeRepo.save(rec);

        return "Added";
    }

    public String ifsamedelete(String email, Integer id) {

        //Patient patient = patientRepo.findFirstByPatientEmail(email);

        Recipe recipe=iRecipeRepo.findFIrstByRecId(id);
        User us= recipe.getUser();

     String k= us.getUserEmail();

        if(k==email)
        {
            iRecipeRepo.deleteById(id);
            return "deleted";
        }

        //Appointment appointment = appointmentService.getAppointmentForPatient(patient);


        //appointmentService.cancelAppointment(appointment);




return " Cannot be deleted";
    }

    }
