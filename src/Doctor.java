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
}
