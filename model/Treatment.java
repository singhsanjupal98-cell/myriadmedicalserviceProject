package model;

public class Treatment {
    private String treatmentId;
    private String patientId;
    private String clinicianId;
    private String status;
    private double cost;

    public Treatment(String treatmentId, String patientId, String clinicianId) {
        this.treatmentId = treatmentId;
        this.patientId = patientId;
        this.clinicianId = clinicianId;
        this.status = "New Treatment";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTreatmentId() {
        return treatmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getClinicianId() {
        return clinicianId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
