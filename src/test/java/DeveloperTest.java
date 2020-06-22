import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bill", "123456NI", 40000);
    }

    @Test
    public void hasAName(){
        assertEquals("Bill", developer.getName());
    }

    @Test
    public void canSetName(){
        developer.setName("John");
        assertEquals("John", developer.getName());
        developer.setName(null);
        assertEquals("John", developer.getName());
        developer.setName("");
        assertEquals("John", developer.getName());
    }

    @Test
    public void hasANI(){
        assertEquals("123456NI", developer.getNI());
    }

    @Test
    public void hasASalary(){
        assertEquals(40000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(4000);
        assertEquals(44000, developer.getSalary(), 0.01);
        developer.raiseSalary(-2000);
        assertEquals(44000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, developer.payBonus(), 0.01);
    }

}
