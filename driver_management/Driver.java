package driver_management;
import behaviours.*;

public class Driver implements Drivable {


  private String name;
	private int averageSpeed;
	private int averageDistance;
  private String vehicle;
  // private ArrayList<Drivable> vehicle;



	public Driver(String name, int averageSpeed, int averageDistance) {
      this.averageSpeed = averageSpeed;
      this.averageDistance = averageDistance;
      this.name = name;
      // this.vehicle = new ArrayList<Drivable>(); 

    }

   public String getName() {
     return this.name;
    }


	 public int driveTime(int distance) {
     return distance/this.averageSpeed;

	  }

   public int driveDistance(int time) {
    return time*this.averageSpeed;

    }

    // public String createVehicle() {
    //     this.vehicle = vehicle.(name);
    // }

    // public  String getVehicle() {
    //     return vehicle;
    // }

	
}