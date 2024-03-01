interface  Shape{
	void Area(int length,int breath);
	void Area(int radius);
}
abstract class AbstractShape{
	int length=0,breath=0,radius=0;
	AbstractShape(int length,int breath){
		initialize(length,breath);
	}
	AbstractShape(int radius){
		initialize(radius);
	}
	void initialize(int length,int breath){	
		this.length=length;
		this.breath=breath;
	}
	void initialize(int radius){
		this.radius=radius;
	}
	void displayDetails() {
		if(radius!=0) {
			System.out.println("Shape:Circle");
			System.out.println("Radius of Circle:"+radius);
		}
		else {
			System.out.println("Shape:Rectangle");
			System.out.printf("Length and width of rectange is:%d %d\n",length,breath);
		}
	}
}
public class Shapes extends AbstractShape implements Shape{
	Shapes(int length,int breath) {
		super(length,breath);
	}
	Shapes(int radius) {
		super(radius);
	}
	public void Area(int length,int breath) {
		System.out.printf("Area of rectangle:%d\n",(length*breath));
	}
	public void Area(int radius) {
		System.out.printf("Area of circle:%.2f\n",(3.14*radius*radius));
	}

	public static void main(String[] args) {
		Shapes circle = new Shapes(2);
		Shapes rectangle = new Shapes(6,5);
		circle.displayDetails();
		circle.Area(circle.radius);
		rectangle.displayDetails();
		rectangle.Area(rectangle.length, rectangle.breath);
	}

}
