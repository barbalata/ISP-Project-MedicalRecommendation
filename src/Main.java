import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public  class Main {
    public static Calendar setCalendar(int day, int month, int year) {
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, year);

        // We will have to increment the month field by 1

        date.set(Calendar.MONTH, month+1);

        // As the month indexing starts with 0

        date.set(Calendar.DAY_OF_MONTH, day);

        return date;
    }

    public static void main(String[] args){

        Drug Algocalmin = new Drug("Algocalmin");
        Algocalmin.AddAllergen(AllergenEnum.DioxidDeSulf);
        Algocalmin.AddIndication(AffectionEnum.DureriDentare);
        Algocalmin.SetMaxAge(50);
        Algocalmin.SetMinAge(12);
        Algocalmin.SetPrice(30);

        Algocalmin.ShowDrug();

        Patient patient1 = new Patient();
        patient1.SetName("Ion");
        patient1.SetAge(18);
        patient1.SetAffection(AffectionEnum.DureriDentare);
        patient1.SetAffection(AffectionEnum.Carii);
        patient1.SetAllergen(AllergenEnum.DioxidDeSulf);

        patient1.ShowPatient();
        ArrayList<SpecializationEnum> specialization = new ArrayList<>();
        specialization.add(SpecializationEnum.Cardiologie);
        specialization.add(SpecializationEnum.Dermatologie);

        Doctor doctor1 = new Doctor("Mircea", specialization, LocationEnume.Bucharest);
        doctor1.ShowDoctor();

        Calendar calendar = setCalendar(1,1,2018);
        Date date = calendar.getTime();

        patient1.SetAppointment(date,LocationEnume.Bucharest, doctor1);
        ArrayList<Appointment> appointments = new ArrayList<>();
        appointments = doctor1.GetAppointments();
        for(Appointment appointment : appointments){
            appointment.ShowAppointment();
        }

    }
}
