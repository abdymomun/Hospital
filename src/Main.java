import Model.*;
import Model.Service.ServiceImpl.Impl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws MyException {
        Impl impl = new Impl();
        Doctor doctor1 = new Doctor("MR","MR@gmail.com", Gender.Male,34);
        Doctor doctor2 = new Doctor("Ad","Ad@gmail.com", Gender.Female,23);
        Doctor[] doctors = {doctor1,doctor2};
        Patient patient1 = new Patient("Abdu",996700700,Gender.Male,37);
        Patient patient2 = new Patient("Aaku",996335353,Gender.Male,13);
        Patient []patients = {patient1,patient2};
        Hospital hospital = new Hospital("Hospital","Kyrgyxstan",doctors,patients,"number 1 hospital in world");
Hospital []hospitals = {hospital};
      //  System.out.println(impl.DoctorUppdate("MR@gmail.com", doctors));
        System.out.println(Arrays.toString(impl.getAllDoctor(doctors)));
       // System.out.println(impl.getAllPatient(patients));
       // System.out.println(impl.sortGender(Gender.Male,doctors,patients));
       // System.out.println(impl.tooUpperCase(hospitals));
    }
}