import java.util.Date;

public class Appointment {
    private Patient Patient;
    private Doctor Medic;
    private Date Date;


    public Appointment(Patient patient, Doctor medic, java.util.Date date){
        this.Patient = patient;
        this.Medic = medic;
        this.Date = date;

    }

    public void ShowAppointment(){
        System.out.println("Nume Pacient:  " + Patient.GetName()+
                            "Nume Doctor: " + Medic.GetName() +
                            "Data: " + Date.toString() + "\n");
    }
}
