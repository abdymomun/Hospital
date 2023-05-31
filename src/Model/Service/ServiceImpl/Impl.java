package Model.Service.ServiceImpl;

import Model.*;
import Model.Service.Service;

import java.util.Arrays;

public class Impl implements Service {
    Hospital []hospitals;
    @Override
    public Doctor DoctorUppdate(String email,Doctor []doctors)  {

            for (Doctor d : doctors) {
                if (!email.equals(d.getEmail())) {
                    d.setEmail(email);
                    return d;
                }else {
                    System.out.println("email озгоргон жок, башка email танданыз  !");
                }

            }
        return null;

    }




    @Override
    public Doctor[] getAllDoctor(Doctor[] doctors) {
        for (Doctor d : doctors) {
            if (d.getName().startsWith("A")) {
                System.out.println(d.getName());
            }else if (d.getName().startsWith("Z"))
                System.out.println(d.getName());
        }
        return null;
    }
    @Override
    public String getAllPatient(Patient[] patients) {
        for (Patient a:patients) {
            
            return a.getName();

        }
return null;
    }

    @Override
    public String sortGender(Gender gender,Doctor[]doctors,Patient []patients) {

            for (Doctor d:doctors) {
                for (Patient p: patients) {
                    if (gender.equals(Gender.Male)){
                        System.out.println(p.getName() + " he is " + p.getGender());
                        System.out.println(d.getName() + " he is " + d.getGender());
                    }if (gender.equals(Gender.Female)){
                        System.out.println(p.getName() + " she is " + p.getGender());
                        System.out.println(d.getName() + " she is " + d.getGender());



                }
            }
        }
        return null;
    }

    @Override
    public String tooUpperCase(Hospital []hospitals) {
        for (Hospital h :hospitals) {

        StringBuilder stringBuilder = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : h.getDescription().toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                c = Character.toUpperCase(c);
                capitalizeNext = false;
            }

            stringBuilder.append(c);
        }

        String output = stringBuilder.toString();
        System.out.println(output);
        return h.getDescription();
    }

        return null;
    }
}

