import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "1234NI", 30000, "chicken");
    }
    
    @Test
    public void hasAName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasANI(){
        assertEquals("1234NI", manager.getNI());
    }

    @Test
    public void hasASalary(){
        assertEquals(30000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("chicken", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(4000);
        assertEquals(34000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, manager.payBonus(), 0.01);
    }

}
