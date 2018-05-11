import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DoctorTest {
    //region Tests for Doctor.CheckAppointment method

    // Existing date in doctor's appointments and correct doctor's location
    @org.junit.jupiter.api.Test
    void checkAppointment_Ok_Ok() {
        System.out.println("\n\tExisting date in doctor's appointments and correct doctor's location.");
        Doctor doctor = SetDoctorTest();
        Date date = setCalendar(1, 1, 2018,0,0,0).getTime();

        assertFalse(doctor.CheckAppointment(date, LocationEnume.Brasov));
    }

    // Existing date in doctor's appointments and incorrect doctor's location.
    @org.junit.jupiter.api.Test
    void checkAppointment_Ok_NotOk() {
        System.out.println("\n\tExisting date in doctor's appointments and incorrect doctor's location.");
        Doctor doctor = SetDoctorTest();
        Date date = setCalendar(1, 1, 2018,0,0,0).getTime();

        assertFalse(doctor.CheckAppointment(date, LocationEnume.Focsani));
    }

    // Not existing date in doctor's appointments and correct doctor's location.
    @org.junit.jupiter.api.Test
    void checkAppointment_NotOk_Ok() {

        System.out.println("\n\tNot existing date in doctor's appointments and correct doctor's location.");
        Doctor doctor = SetDoctorTest();
        Date date = setCalendar(1, 1, 2018,3,1,2).getTime();

        assertTrue(doctor.CheckAppointment(date, LocationEnume.Brasov));
    }

    // Not existing date in doctor's appointments and incorrect doctor's location.
    @org.junit.jupiter.api.Test
    void checkAppointment_NotOk_NotOk() {

        System.out.println("\n\tNot existing date in doctor's appointments and incorrect doctor's location.");
        Doctor doctor = SetDoctorTest();
        Date date = setCalendar(4, 9, 1996,3,4,5).getTime();

        assertFalse(doctor.CheckAppointment(date, LocationEnume.Bucharest));
    }
    //endregion

    //region Private methods

    private Doctor SetDoctorTest() {
        // Declare the doctor specialization
        ArrayList<SpecializationEnum> specializationEnums = new ArrayList<>();
        specializationEnums.add(SpecializationEnum.Cardiologie);

        // Declare the date for appointment
        Date date = setCalendar(1, 1, 2018,0,0,0).getTime();

        // Declare the patient for appointment
        Patient patient = new Patient("Tim", GenderEnum.Masculin, 26);

        //Declare the doctor
        Doctor doctor = new Doctor("John", specializationEnums, LocationEnume.Brasov);

        //Set the appointment for doctor
        doctor.SetAppointment(date, LocationEnume.Brasov, patient);

        return doctor;
    }


    private static Calendar setCalendar(int day, int month, int year, int hour, int minute, int sec) {
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month - 1);
        date.set(Calendar.DAY_OF_MONTH, day);
        date.set(Calendar.HOUR, hour);
        date.set(Calendar.MINUTE, minute);
        date.set(Calendar.SECOND, sec);
        return date;
    }
    //endregion

}