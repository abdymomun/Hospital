package Model.Service;

import Model.*;

public interface Service  {
    Doctor DoctorUppdate(String email,Doctor []doctors) throws MyException;
    Doctor[]getAllDoctor(Doctor []doctors);
    String getAllPatient(Patient []patients);
    String sortGender(Gender gender,Doctor []doctors, Patient []patients);
    String tooUpperCase(Hospital []hospitals);
}
