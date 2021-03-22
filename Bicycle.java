public class Bicycle {
	int color;
	int gear;
	int speed;

	//  constructor
	public Bicycle(int color, int gear, int speed) {
		gear = gear;
		color = color;
		speed = speed;
	}

	//  methods
	public void setColor(int value) {
		color = value;
	}

	public void setGear(int value) {
		gear = value;
	}

	public void applyBreaks(int value) {
		speed -= value;
	}

	public void speedUp(int value) {
		speed += value;
	}
}


//  subclass
class MountainBike extends Bicycle {
	public int seatHeight;

	//  constructor
	public MountainBike(int height, int color, int speed, int gear) {
		super(color, gear, speed);
		seatHeight = height;
	}

	//  method
	public void setHeight(int value) {
		seatHeight = value;
	}

}



/*

MountainBike inherits all the fields and methods of Bicycle and adds the field searHeight and a method to set it;

*/







