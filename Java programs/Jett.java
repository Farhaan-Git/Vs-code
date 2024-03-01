interface Engine{
	void start();
	void stop();
}
interface Features{
	void accelerate(int speed);
	void brake(int bp);
}
abstract class Vehicle{
	String model;
	int year;
	Vehicle(String model,int year){
		this.model=model;
		this.year=year;
		System.out.println("Car model:"+model);
		System.out.println("Manufacture year:"+year);
	}
}
public class Jett extends Vehicle implements Engine,Features{
	float speed=0;
	Jett(String model,int year){
		super(model,year);
	}
	public void start() {
		System.out.println("Car Started...");
	}
	public void stop() {
		System.out.println("Car Stopped...");
	}
	public void accelerate(int speed) {
		this.speed=speed;
		System.out.println("Car acclerated Speed:"+speed);
	}
	public void brake(int bp){
		float brakeRatio=bp*0.01f;
		speed-=speed*brakeRatio;
		System.out.println("Car Brake Applied...");
		if(speed<1)
			stop();
		else
			System.out.printf("Car Speed reduced to:%.0f\n",speed);
	}
	public static void main(String[] args) {
		Jett c = new Jett("Duke200",2021);
		c.start();
		c.accelerate(40);
		c.brake(80);
		c.stop();
	}

}
