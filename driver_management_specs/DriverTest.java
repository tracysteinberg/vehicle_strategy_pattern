import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;


public class DriverTest {


	Driver driver;


@Before
  public void before(){

  	driver = new Driver("Fred",60,60);
 
  }

@Test

  public void hasName() {

    assertEquals("Fred", driver.getName());
  }





  @Test

  public void driveTime() {

  	assertEquals(1, driver.driveTime(60));
  }


  
@Test

  public void driveDistance() {

  	assertEquals(60, driver.driveDistance(1));
  }




}
