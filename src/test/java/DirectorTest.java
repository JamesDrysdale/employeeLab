import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Sandy", "9876NI", 50000, "Marketing", 2000);
    }

    @Test
    public void hasAName(){
        assertEquals("Sandy", director.getName());
    }

    @Test
    public void canSetName(){
        director.setName("Lauren");
        assertEquals("Lauren", director.getName());
        director.setName(null);
        assertEquals("Lauren", director.getName());
        director.setName("");
        assertEquals("Lauren", director.getName());
    }

    @Test
    public void hasANI(){
        assertEquals("9876NI", director.getNI());
    }

    @Test
    public void hasASalary(){
        assertEquals(50000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Marketing", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(55000, director.getSalary(), 0.01);
        director.raiseSalary(-2000);
        assertEquals(55000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(2000, director.getBudget(), 0.01);
    }
}
