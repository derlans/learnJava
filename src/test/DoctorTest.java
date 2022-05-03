package test;

import learnclass.Doctor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class DoctorTest {
    private Doctor doctor = new Doctor("derlan","牙科",1f);
    @Test
    public void testGetName() {
        assertEquals("derlan",doctor.name);
    }
    @Test
    public void testSpecialty() {
        assertEquals("牙科",doctor.specialty);
    }
}
