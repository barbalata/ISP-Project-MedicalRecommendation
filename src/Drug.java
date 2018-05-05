import java.util.*;

public class Drug {
    private String Name;
    private int minAge;
    private float price;
    private int maxAge;
    private ArrayList<AffectionEnum> Indication;

    public Drug(){
        Indication = new ArrayList<AffectionEnum>();
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
}
