
import jdk.nashorn.internal.runtime.Specialization;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by HV on 05-May-18.
 */
public class Doctor {

    String name;
    public ArrayList<SpecializationEnum> Specialization;
    Map<Date, ArrayList<Appointment>> Disponibility;
    String location;
    Date date;
    public ArrayList<Drug> Drug;

    public Doctor(String name, ArrayList<SpecializationEnum> Specialization, String location) {
        this.name = name;
        this.Specialization = Specialization;
        this.location = location;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    public void SetSpecialization(ArrayList<SpecializationEnum> Specialization) {
        this.Specialization = Specialization;
    }

    public ArrayList<SpecializationEnum> GetSpecialization(){
        return Specialization;
    }

    public void SetAppointment (Date date){
        this.date=date;
    }

    public Date GetAppointment(){
        return date;
    }

    public void SetLocation(String location){
        this.location=location;
    }

    public String GetLocation(){
        return location;
    }

    public ArrayList<Appointment> CheckAppointment(Date startDate,Date endDate){
        ArrayList<Appointment> Appointments = new ArrayList<Appointment>();
        for(Date item:Disponibility.keySet()){
            if(item.after(startDate) && item.before(endDate)){
                for(Appointment appointment:Disponibility.get(item)){
                    Appointments.add(appointment);
                }
            }
        }
        return Appointments;
    }

   

    public void ShowDoctor(){
        System.out.println(this.name);
        System.out.println(this.location);
        for(SpecializationEnum specialization:Specialization){
            System.out.println(specialization.toString());
        }
    }




}

