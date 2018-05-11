import java.util.ArrayList;
import java.util.*;

/**
 * Created by HV on 05-May-18.
 */
public class Doctor {

    private String name;
    private ArrayList<SpecializationEnum> Specialization;
    private Map<Date, ArrayList<Appointment>> Disponibility;
    private ArrayList<LocationEnume> location;
    private ArrayList<Drug> Drug;

    public Doctor() {
        this.Specialization = new ArrayList<>();
        this.Drug = new ArrayList<>();
        this.Disponibility = new HashMap<>();
        this.location = new ArrayList<>();
    }

    public Doctor(String name, ArrayList<SpecializationEnum> specialization, LocationEnume location) {
        this();
        this.name = name;
        this.Specialization.addAll(specialization);
        this.location.add(location);
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return this.name;
    }

    public void SetSpecialization(ArrayList<SpecializationEnum> specialization) {
        this.Specialization = specialization;
    }

    public ArrayList<SpecializationEnum> GetSpecialization() {
        return Specialization;
    }

    public void SetAppointment(Date date, LocationEnume location, Patient patient) {
        Appointment appointment = new Appointment(patient, this, date);
        ArrayList<Appointment> appointments;
        if (!CheckAppointment(date, location)) {
            appointments = Disponibility.get(date);
            appointments.add(appointment);
        } else {
            appointments = new ArrayList<>();
            appointments.add(appointment);
        }
        Disponibility.put(date, appointments);
    }

    public void SetLocation(LocationEnume location) {
        this.location.add(location);
    }

    public ArrayList<LocationEnume> GetLocation() {
        return location;
    }

    public void SetDrugs(ArrayList<Drug> Drugs) {
        Drug.addAll(Drugs);
    }

    public ArrayList<Drug> GetDrugs() {
        return Drug;
    }

    public void SetDrug(Drug drug) {
        Drug.add(drug);
    }

    public ArrayList<Appointment> SearchAppointment(Date startDate, Date endDate) {
        ArrayList<Appointment> Appointments = new ArrayList<>();
        for (Date item : Disponibility.keySet()) {
            if (item.after(startDate) && item.before(endDate)) {
                Appointments.addAll(Disponibility.get(item));
            }
        }
        return Appointments;
    }

    public boolean CheckAppointment(Date searchedDate, LocationEnume location) {
        if (this.location.contains(location)) {
            for (Date item : Disponibility.keySet()) {
                if (item.toString().equals(searchedDate.toString())) {
                    System.out.println("This doctor has appointment on \"" + searchedDate.toString() + " at " + location.name() + ".");
                    return false;
                }
            }
        } else {
            System.out.println("The doctor does not have a cabinet in " + location.name() + ".");
            return false;
        }
        System.out.println("This doctor doesn't have appointment at " + location.name() + " on " + searchedDate.toString() + ".");
        return true;
    }

    public void ShowDoctor() {
        System.out.println("The information about doctor:");
        System.out.println("\tName: " + this.name + ";");
        System.out.println("\tLocation: " + this.location + ";");
        System.out.print("\tSpecializations: ");
        for (SpecializationEnum specialization : Specialization) {
            System.out.print(specialization + "; ");
        }
        System.out.println();
    }

    public ArrayList<Drug> SearchDrug(ArrayList<AffectionEnum> affections, ArrayList<AllergenEnum> allergens, int age) {
        ArrayList<Drug> drugs = new ArrayList<>();
        boolean containAllergen = false;
        boolean containAffection = false;

        for (Drug drug : this.Drug) {
            for (AffectionEnum affection : affections) {
                if (drug.GetIndications().contains(affection)) {
                    containAffection = true;
                }
            }


            if (!containAffection) {
                for (AllergenEnum allergen : allergens) {
                    if (drug.GetAllergens().contains(allergen) && !containAllergen) {
                        containAllergen = true;
                    }
                }
            }

            if (!containAllergen) {
                drugs.add(drug);
            }
        }

        return drugs;
    }

    public ArrayList<Appointment> GetAppointments() {
        return this.SearchAppointment(new Date(1, 1, 1, 0, 0), new Date(4000, 12, 31, 23, 59));
    }
}

