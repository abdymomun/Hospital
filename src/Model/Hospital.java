package Model;

import java.util.Arrays;

public class Hospital {
    private String name;
    private String address;
    private Doctor[]doctors;
    private Patient[]patients;
    private String description;

    public Hospital(String name, String address, Doctor[] doctors, Patient[] patients, String description) {
        this.name = name;
        this.address = address;
        this.doctors = doctors;
        this.patients = patients;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", doctors=" + Arrays.toString(doctors) +
                ", patients=" + Arrays.toString(patients) +
                ", description='" + description + '\'' +
                '}';
    }
}
