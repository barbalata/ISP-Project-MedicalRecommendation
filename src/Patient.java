import java.util.ArrayList;
import java.util.Date;

public class Patient {
    private String Name;
    private GenderEnum Gender;
    private int Age;
    private ArrayList<AllergenEnum> Allergens;
    private ArrayList<AffectionEnum> Affections;

    public Patient() {
        this.Allergens = new ArrayList<>();
        this.Affections = new ArrayList<>();
    }

    public Patient(String name, GenderEnum gender, int age) {
        this.Age = age;
        this.Name = name;
        this.Gender = gender;
    }

    //region Gets and Sets
    public void SetName(String name) {
        this.Name = name;
    }

    public String GetName() {
        return this.Name;
    }

    public void SetGender(GenderEnum gender) {
        this.Gender = gender;
    }

    public GenderEnum GetGender() {
        return this.Gender;
    }

    public void SetAge(int age) {
        this.Age = age;
    }

    public int GetAge() {
        return this.Age;
    }

    public void SetAllergens(ArrayList<AllergenEnum> allergens) {
        this.Allergens.addAll(allergens);
    }

    public void SetAllergen(AllergenEnum allergen) {
        this.Allergens.add(allergen);
    }

    public void SetAffections(ArrayList<AffectionEnum> affections) {
        this.Affections.addAll(affections);
    }

    public void SetAffection(AffectionEnum affection) {
        this.Affections.add(affection);
    }

    public ArrayList<AllergenEnum> GetAllergens() {
        return Allergens;
    }

    public ArrayList<AffectionEnum> GetAffections() {
        return Affections;
    }
    //endregion

    public void ShowPatient() {
        System.out.println("The information about patient:");
        System.out.println("\tName: " + this.Name + ";");

        System.out.println("\tAge: " + this.Age + ";");

        System.out.println("\tGender: " + this.Gender + ";");

        System.out.print("\tThe list of allergens: ");
        for (AllergenEnum allergen : this.Allergens) {
            System.out.print(allergen + ";");
        }
        System.out.print("\n");

        System.out.print("\tThe list of affections: ");
        for (AffectionEnum affection : this.Affections) {
            System.out.print(affection + ";");
        }
        System.out.print("\n");
    }

    public ArrayList<Drug> SearchDrug(Doctor doctor) {
        return doctor.SearchDrug(this.Affections, this.Allergens, this.Age);
    }

    public ArrayList<Drug> SearchDrug(Doctor doctor, ArrayList<AffectionEnum> affections) {
        return doctor.SearchDrug(affections, this.Allergens, this.Age);
    }

    public boolean SetAppointment(Date date, LocationEnume location, Doctor doctor) {
        if (!doctor.CheckAppointment(date, location)) {
            doctor.SetAppointment(date, location, this);
            return true;
        }
        return false;
    }
}
