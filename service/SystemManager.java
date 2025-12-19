package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Clinician;
import model.Patient;
import model.Treatment;

public class SystemManager {
    private Map<String, Patient> patients = new HashMap<>();
    private Map<String, Clinician> clinicians = new HashMap<>();
    private List<Treatment> treatments = new ArrayList<>();

    public void registerPatient(String id, String name, String email) {
        patients.put(id, new Patient(id, name, email, true));
        System.out.println("Patient registered: " + name);
    }

    public void assignClinician(String treatmentId, String patientId, String clinicianId) {
        Treatment t = new Treatment(treatmentId, patientId, clinicianId);
        treatments.add(t);
        System.out.println("Clinician assigned to treatment " + treatmentId);
    }

    public List<Treatment> getTreatmentsByStatus(String status) {
        List<Treatment> filtered = new ArrayList<>();
        for (Treatment t : treatments) {
            if (t.getStatus().equals(status)) filtered.add(t);
        }
        return filtered;
    }
}
