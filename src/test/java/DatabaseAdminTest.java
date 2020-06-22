import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Biff", "12345NI", 35000);
    }

    @Test
    public void hasAName(){
        assertEquals("Biff", databaseAdmin.getName());
    }

    @Test
    public void hasANI(){
        assertEquals("12345NI", databaseAdmin.getNI());
    }

    @Test
    public void hasASalary(){
        assertEquals(35000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(4000);
        assertEquals(39000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350, databaseAdmin.payBonus(), 0.01);
    }
}
