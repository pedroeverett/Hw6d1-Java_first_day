import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BusTest {

  Bus bus;
  Person passenger;

  @Before
  public void before() {
    bus = new Bus("Bus 26");
    passenger = new Person();
  }

  @Test
  public void checkName() {
    assertEquals("Bus 26", bus.getName());
  }

  @Test
  public void noPassangers() {
    assertEquals(0, bus.passengerCount());
  }

}