import java.util.*;

public class Drug {
    private String Name;
    private int minAge;
    private float price;
    private int maxAge;
    private ArrayList<AffectionEnum> Indication;
    private ArrayList<AllergenEnum> Allergens;

    public Drug(){
        Indication = new ArrayList<AffectionEnum>();
        Allergens = new ArrayList<AllergenEnum>();
    }

    public Drug(String name){
        this();
        this.Name = name;
    }

    public String getName(){
        return this.Name;
    }

    public void setNAme(String name){
        this.Name = name;
    }

    public int getMinAge(){
        return this.minAge;
    }

    public void setMinAge(int minAge){
        this.minAge = minAge;
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public int getMaxAge(){
        return this.maxAge;
    }

    public void setMaxAge(int maxAge){
        this.maxAge = maxAge;
    }

    public void ShowDrug(){
        System.out.println(this.getName());
    }

    public void AddAllergen(AllergenEnum allergen){
        Allergens.add(allergen);
    }

    public void AddAllergens(ArrayList<AllergenEnum> allergens){
        Allergens.addAll(allergens);

    }

    public void AddIndication(AffectionEnum indication){
        Indication.add(indication);
    }

    public void AddIndications(ArrayList<AffectionEnum> indications){
        for(AffectionEnum item : indications){
            Indication.add(item);
        }
    }

    public ArrayList<AffectionEnum> GetIndications(){
        return this.Indication;
    }

    public ArrayList<AllergenEnum> GetAllergens(){
        return this.Allergens;
    }
}
