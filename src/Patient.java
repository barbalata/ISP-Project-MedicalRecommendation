import java.util.ArrayList;

public class Patient {
    private String Name;
    private GenderEnum Gender;
    private int Age;
    private ArrayList<AllergenEnum> Allergens;
    private ArrayList<AffectionEnum> Affections;

    public Patient(){
        this.Allergens = new ArrayList<>();
        this.Affections = new ArrayList<>();
    }

    public Patient(String name, GenderEnum gender, int age){
        this.Age = age;
        this.Name = name;
        this.Gender = gender;
    }

    //region Gets and Sets
    public void SetName(String name){
        this.Name = name;
    }
    public void SetGender(GenderEnum gender){
        this.Gender = gender;
    }

    public void SetAge(int age){
        this.Age = age;
    }

    public void SetAllergens(ArrayList<AllergenEnum> allergens){
        this.Allergens.addAll(allergens);
    }

    public void SetAllergen(AllergenEnum allergen){
        this.Allergens.add(allergen);
    }

    public void SetAffections (ArrayList<AffectionEnum> affections){
        this.Affections.addAll(affections);
    }

    public void SetAffection (AffectionEnum affection){
        this.Affections.add(affection);
    }

    public String GetName(){
        return this.Name;
    }

    public GenderEnum GetGender(){
        return this.Gender;
    }

    public int GetAge(){
        return this.Age;
    }

    public ArrayList<AllergenEnum> GetAllergens(){
        return Allergens;
    }

    public ArrayList<AffectionEnum> GetAffections(){
        return Affections;
    }
    //endregion

    public void ShowPatient(){
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

    public ArrayList<Drug> SearchDrug(Doctor doctor){
        ArrayList<Drug> drugs = new ArrayList<>();
        return drugs;
    }

    public ArrayList<Drug> SearchDrug(Doctor doctor, ArrayList<AffectionEnum> affections){
        ArrayList<Drug> drugs = new ArrayList<>();

        return drugs;
    }

}
