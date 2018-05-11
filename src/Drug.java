import java.util.*;

public class Drug {
    private String Name;
    private int MinAge;
    private float Price;
    private int MaxAge;
    private ArrayList<AffectionEnum> Indication;
    private ArrayList<AllergenEnum> Allergens;

    public Drug() {
        Indication = new ArrayList<>();
        Allergens = new ArrayList<>();
    }

    public Drug(String name) {
        this();
        this.Name = name;
    }

    public String GetName() {
        return this.Name;
    }

    public void SetName(String name) {
        this.Name = name;
    }

    public int GetMinAge() {
        return this.MinAge;
    }

    public void SetMinAge(int minAge) {
        this.MinAge = minAge;
    }

    public float GetPrice() {
        return this.Price;
    }

    public void SetPrice(float price) {
        this.Price = price;
    }

    public int GetMaxAge() {
        return this.MaxAge;
    }

    public void SetMaxAge(int maxAge) {
        this.MaxAge = maxAge;
    }

    public void ShowDrug() {
        System.out.println("The information about drug:");
        System.out.println("\tName:" + this.GetName() + ";");
        System.out.println("\tMinim age: " + this.MinAge + ";");
        System.out.println("\tMaxim age: " + this.MaxAge + ";");
        System.out.print("\tIndications: ");
        for (AffectionEnum indication : this.Indication) {
            System.out.print(indication + "; ");
        }
        System.out.println();
        System.out.print("\tAllergens: ");
        for (AllergenEnum allergen : this.Allergens) {
            System.out.print(allergen + "; ");
        }
        System.out.println();
    }

    public void AddAllergen(AllergenEnum allergen) {
        Allergens.add(allergen);
    }

    public void AddAllergens(ArrayList<AllergenEnum> allergens) {
        Allergens.addAll(allergens);

    }

    public void AddIndication(AffectionEnum indication) {
        Indication.add(indication);
    }

    public void AddIndications(ArrayList<AffectionEnum> indications) {
        Indication.addAll(indications);
    }

    public ArrayList<AffectionEnum> GetIndications() {
        return this.Indication;
    }

    public ArrayList<AllergenEnum> GetAllergens() {
        return this.Allergens;
    }
}
