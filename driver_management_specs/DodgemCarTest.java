import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;


public class DodgemCarTest {


	DodgemCar car;


@Before
  public void before(){

  	car = new DodgemCar(10,2);
 
  }

  @Test

  public void driveTime() {

  	assertEquals(1, car.driveTime(10));
  }


  
@Test

  public void hasSeats() {

  	assertEquals(2, car.getSeats());
  }





}