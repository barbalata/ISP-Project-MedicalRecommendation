public  class Main {
    public static void main(String[] args){

        Drug Algocalmin = new Drug("Algocalmin");
        Algocalmin.AddAllergen(AllergenEnum.DioxidDeSulf);
        Algocalmin.AddIndication(AffectionEnum.DureriDentare);
        Algocalmin.setMaxAge(50);
        Algocalmin.setMinAge(12);
        Algocalmin.setPrice(30);

    }
}
