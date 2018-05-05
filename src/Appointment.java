import java.sql.Date;

public class Appointment {
    private Pacient Pacient;
    private Doctor Medic;
    private Date Date;
    private Date Hour;

    public Appointment(Pacient pacient, Doctor medic, Date date, Date hour){
        this.Pacient = pacient;
        this.Medic = medic;
        this.Date = date;
        this.Hour = hour;
    }

    public void ShowAppointment(){
        System.out.println("Nume Pacient:  " + Pacient.GetName()+
                            "Nume Doctor: " + Medic.GetName() +
                            "Data: " + Date.toString() +
                            "Ora: " + Hour.toString() + "\n");
    }
}
