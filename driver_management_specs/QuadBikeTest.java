import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;


public class QuadBikeTest {


	QuadBike bike;


@Before
  public void before(){

  	bike = new QuadBike(50,500);
 
  }

  @Test

  public void driveTime() {

  	assertEquals(1, bike.driveTime(50));
  }


  
@Test

  public void hasEngine() {

  	assertEquals(500, bike.getEngine());
  }





}