interface Vehicle {
    void speed(int a);
    void fuelC(String fc);
}
class Bicycle implements Vehicle{
    int speed;
    String fc;
    public void speed(int i){
        speed = speed + i;
    }
    public void fuelC (String fc){
        this.fc=fc;
    }
}
class Car implements Vehicle {
    int speed;
    String fc;
    public void speed(int i){
        speed = speed + i;
    }
    public void fuelC (String fc){
        this.fc=fc;
    }
}
class New{
    public static void main (String[] args) {
        Bicycle b = new Bicycle();
        b.speed(3);
        b.fuelC("null");
        System.out.println("Bicycle speed: " +b.speed + ", Bicycle fuel capacity: " +b.fc);
        Car c = new Car();
        c.speed(4);
        c.fuelC("8L");
        System.out.println("Car speed: " + c.speed + ", Car  fuel capacity: " + c.fc);
    }
}