import java.sql.Date;

public class Appointment {
    private Pacient Pacient;
    private Doctor Medic;
    private Date Date;


    public Appointment(Pacient pacient, Doctor medic, Date date){
        this.Pacient = pacient;
        this.Medic = medic;
        this.Date = date;

    }

    public void ShowAppointment(){
        System.out.println("Nume Pacient:  " + Pacient.GetName()+
                            "Nume Doctor: " + Medic.GetName() +
                            "Data: " + Date.toString() + "\n");
    }
}
