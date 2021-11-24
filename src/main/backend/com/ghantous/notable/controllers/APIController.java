package com.ghantous.notable.controllers;

import com.ghantous.notable.entity.AppointmentDTO;
import com.ghantous.notable.entity.PhysicianDTO;
import com.ghantous.notable.service.PhysicianAppointmentsInitialization;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/")
public class APIController {
    @GetMapping(value = "/physicians")
    public List<PhysicianDTO> getListOfPhysicians(){
        return PhysicianAppointmentsInitialization.getListOfPhysicians();
    }

    @GetMapping(value = "/appointments/{physicianEmail}")
    public List<AppointmentDTO> getListOfAppointments(@PathVariable String physicianEmail){
        return PhysicianAppointmentsInitialization.getListOfAllAppointments(physicianEmail);
    }
}
