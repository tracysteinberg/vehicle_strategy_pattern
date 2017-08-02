package driver_management;
import behaviours.*;

public class DodgemCar implements Drivable {

	private int averageSpeed;
	private int numberSeats;



	public DodgemCar(int averageSpeed, int numberSeats) {
      this.averageSpeed = averageSpeed;
      this.numberSeats = numberSeats;

    }


	public int driveTime(int distance) {
     return distance/this.averageSpeed;

	}

    public int getSeats(){
    	return this.numberSeats;


    }
	
}