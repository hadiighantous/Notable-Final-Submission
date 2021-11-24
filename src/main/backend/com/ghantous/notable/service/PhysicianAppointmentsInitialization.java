package com.ghantous.notable.service;

import com.ghantous.notable.entity.AppointmentDTO;
import com.ghantous.notable.entity.PhysicianDTO;

import java.util.LinkedList;
import java.util.List;

public class PhysicianAppointmentsInitialization {
    public static List<PhysicianDTO> getListOfPhysicians() {
        LinkedList<PhysicianDTO> listOfPhysicianDTOS = new LinkedList<>();
        listOfPhysicianDTOS.add(new PhysicianDTO("Julius", "Hibbert", "Hibbert@gmail.com"));
        listOfPhysicianDTOS.add(new PhysicianDTO("Algernop", "Krieger", "Krieger@gmail.com"));
        listOfPhysicianDTOS.add(new PhysicianDTO("Nick", "Riviera", "Riviera@gmail.com"));
        return listOfPhysicianDTOS;
    }

    public static List<AppointmentDTO> getListOfAllAppointments(String physicianEmail) {
        //Here is where we would make a call to the database specific to physician name
        switch (physicianEmail){
            case "Hibbert@gmail.com":
                return getListOfAppointments1();
            case "Krieger@gmail.com":
                return getListOfAppointments2();
            case "Riviera@gmail.com":
                return getListOfAppointments3();
            default:
                return new LinkedList<>();
        }
    }

    private static List<AppointmentDTO> getListOfAppointments1() {
        LinkedList<AppointmentDTO> listOfAppointments = new LinkedList<>();
        listOfAppointments.add(new AppointmentDTO("Sterling Archer", "8:00 AM", "New Patient"));
        listOfAppointments.add(new AppointmentDTO("Cyril Figis", "8:30 AM", "Follow Up"));
        listOfAppointments.add(new AppointmentDTO("Ray Gilette", "9:00 AM", "Follow Up"));
        listOfAppointments.add(new AppointmentDTO("Lana Kane", "9:30 AM", "New Patient"));
        listOfAppointments.add(new AppointmentDTO("Pam Poovey", "10:00 AM", "New Patient"));
        return listOfAppointments;
    }

    private static List<AppointmentDTO> getListOfAppointments2() {
        LinkedList<AppointmentDTO> listOfAppointments = new LinkedList<>();
        listOfAppointments.add(new AppointmentDTO("John Adamns", "8:00 AM", "New Patient"));
        listOfAppointments.add(new AppointmentDTO("John Figis", "8:30 AM", "Follow Up"));
        listOfAppointments.add(new AppointmentDTO("Pam Pom", "9:00 AM", "Follow Up"));
        return listOfAppointments;
    }

    private static List<AppointmentDTO> getListOfAppointments3() {
        LinkedList<AppointmentDTO> listOfAppointmentDTOS = new LinkedList<>();
        listOfAppointmentDTOS.add(new AppointmentDTO("Ryan Sponser", "8:00 AM", "New Patient"));
        listOfAppointmentDTOS.add(new AppointmentDTO("April Higis", "8:30 AM", "Follow Up"));
        listOfAppointmentDTOS.add(new AppointmentDTO("Tom Myers", "9:00 AM", "Follow Up"));
        return listOfAppointmentDTOS;
    }
}