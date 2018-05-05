import java.util.ArrayList;
import java.util.*;

/**
 * Created by HV on 05-May-18.
 */
public class Doctor {

    String name;
    ArrayList<SpecializationEnum> Specialization;
    Map<Date, ArrayList<Appointment>> Disponibility;
    String location;
    Date date;
    ArrayList<Drug> Drug;

    public Doctor(String name, ArrayList<SpecializationEnum> Specialization, String location) {
        this.name = name;
        this.Specialization = new ArrayList<SpecializationEnum>(Specialization) ;
        this.location = location;
        Drug = new ArrayList<Drug>();
    }
    public Doctor(){
        Specialization = new ArrayList<SpecializationEnum>();
        Drug = new ArrayList<Drug>();
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

    public void SetDrugs(ArrayList<Drug> Drugs){
        Drug.addAll(Drugs);
    }

    public ArrayList<Drug> GetDrugs(){
        return Drug;
    }

    public void SetDrug(Drug drug){
        Drug.add(drug);
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

    public boolean SearchAppointment(Date searchedDate){
        for (Date item:Disponibility.keySet()){
            if(item == searchedDate ){
                return true;
            }
        }
        return false;
    }
    public void ShowDoctor(){
        System.out.println("The information about doctor:");
        System.out.println("\tName: " + this.name + ";");
        System.out.println("\tLocation: " + this.location + ";");
        System.out.print("\tSpecializations: ");
        for(SpecializationEnum specialization:Specialization){
            System.out.print(specialization + "; ");
        }
        System.out.println();
    }

    public ArrayList<Drug> SearchDrug(ArrayList<AffectionEnum> affections, ArrayList<AllergenEnum> allergens, int age){
        ArrayList<Drug> drugs = new ArrayList<>();
        boolean containAllergen = false;
        boolean containAffection = false;

        for (Drug drug : this.Drug){
            for(AllergenEnum allergen : allergens){
                if(drug.GetAllergens().contains(allergen) && containAllergen == false){
                    containAllergen = true;
                }
            }

            if(containAllergen == false){
                for(AffectionEnum affection : affections){
                    if (drug.GetIndications().contains(affection)){
                        containAffection = true;
                    }
                }
            }

            if(containAffection == true){
                if(drug.getMaxAge() > age && drug.getMinAge() < age){
                    drugs.add(drug);
                }
            }
        }

        return drugs;
    }
}

