package test;

import learnclass.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * @author derlan
 */
public class StudentTest {
    private Student student = new Student("Derlan", 5, 1, "", '男', 5.0f);
    @Test
    public void testGetName() {
        assertEquals("Derlan", student.getStudentName());
    }
    @Test
    public void testGetStudentID() {
        assertEquals(5, student.getStudentID());
    }
    @Test
    public void testGetGPA() {
        assertEquals(5.0f, student.getStudentGPA(), 0.0f);
    }
    @Test
    public void testSetTuition() {
        try {
            student.setTuition(5000f);
        }catch (Exception e) {
            assertEquals(e.getMessage(), "Tuition must be between $0 and $4500");

        }
    }
}


