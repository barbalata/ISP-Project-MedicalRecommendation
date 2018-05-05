<<<<<<< HEAD
import jdk.nashorn.internal.runtime.Specialization;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by HV on 05-May-18.
 */
public class Doctor {

    String name;
    public ArrayList<SpecializationEnum> Specialization;
    Map<Date,ArrayList<Apppointment>> Disponibility;
    String location;
    public ArrayList<Drug> Drug;

    public Doctor(String name, ArrayList<SpecializationEnum> Specialization, String location){
        this.name=name;
        this.Specialization= Specialization;
        this.location= location;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setSpecialization(ArrayList<SpecializationEnum> Specialization){
        this.Specialization=Specialization;
    }
=======
public class Doctor {
>>>>>>> 23c1f47d859e0bdf9af941dff39f2d646f6684eb
}
