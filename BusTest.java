import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BusTest {

  Bus bus;

  @Before
  public void before() {
    bus = new Bus("Bus 26");
  }

  @Test
  public void checkName() {
    assertEquals("Bus 26", bus.getName());
  }

}