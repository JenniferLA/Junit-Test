import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;




public class StudentTest {
    private Student bob = null;

    // method to reset bob everytime
    @Before
    public void setup() {
        bob = new Student(1, "bob");

        //preload grades so we don't have to keep typing grades
        bob.addGrade(77);
        bob.addGrade(92);
        bob.addGrade(90);
    }


//    @Test
//    public void testIdAndName() {
//        Student bob = new Student(1L, "bob");
//        asertEquals(1L, bob.getId());
//    }

    @Test
    public void testId() {
        Student bob = new Student(1, "bob");
        assertEquals("bob", bob.getName());
    }

    @Test
    public void testName() {
        Student bob = new Student(1, "bob");
        assertEquals("bob", bob.getName());
    }

    @Test
    public void testEquals() {
        //make a test other "bob
        Student otherBob = new Student(1, "bob");
        assertEquals(bob, otherBob);
    }

    // 86.3 test (DON'T TRUST THE CODE — MAKE SURE YOU TEST IT SEPARATELY TO MAKE SURE THE CODE WORKS)
    // deprecated and needs third parameter - delta
    // changing it to 86.33 and 86.34 works
    @Test
    public void testGradeAverage() {
        assertEquals(86.33, bob.getGradeAverage(), 0.01);
    }

    @Test
    public void testAddGrade() {
        // add a single grade and check to see if it added correctly
        // first clear the grades
        bob.getGrades().clear();
        // add one grade
        bob.addGrade(75);
        assertEquals(1, bob.getGrades().size());
        // needs a wrapper (ArrayList<Integer> grades)
        assertEquals(75, bob.getGrades().get(0).intValue());
    }

}
