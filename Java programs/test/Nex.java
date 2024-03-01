public class Nex{
    public static void main(String[] args) {
        Andriod oneplus = new Oneplus();
        Andriod xiaomi = new Xiaomi();
        Andriod pixel = new Pixel();
        Iphone ip14= new Iphone14();
        Iphone ipX = new IphoneX();
        Andriod Myphone = new Myphone();
        Andriod [] arr= {oneplus,xiaomi,pixel,Myphone};
        }
}

interface Andriod{
    public void calling(String name);
    public void camera();
    public void playStore();
}
interface Iphone{
    public void calling(String name);
    public void camera();
    public void display();
    public void appStore();
}
class Oneplus implements Andriod{
    @Override
    public void calling(String name) {
        System.out.println(String.format("calling %s",name));
    }
    public void camera(){
        System.out.println("Camera is on");
    }
    public void playStore(){
        System.out.println("You opened playstore");
    }
    public void oneUI(){
        System.out.println("I use One UI ");
    }
}
class Xiaomi implements Andriod{
    @Override
    public void calling(String name) {
        System.out.println(String.format("calling %s",name));
    }
    public void camera(){
        System.out.println("Camera is on");
    }
    public void playStore(){
        System.out.println("You opened playstore");
    }
    public void MIUI(){
        System.out.println("I use One MIUI ");
    }
}
class Pixel implements Andriod{
    @Override
    public void calling(String name) {
        System.out.println(String.format("calling %s",name));
    }
    public void camera(){
        System.out.println("Camera is on");
    }
    public void playStore(){
        System.out.println("You opened playstore");
    }
    public void stockAndriod(){
        System.out.println("I use Stock Andriod which is the best!");
    }
}
class Iphone14 implements Iphone{
    public void calling(String name){
        System.out.println("You are calling "+name);
    }
    public void dynamicDisplay(){
        System.out.println("This is a unique feature of Iphone Dynamic display");
    }
    public void camera(){
        System.out.println("you turned on the camera");
    }
    public void display(){
        System.out.println("I Still use 60 HZ display in 2024");
    }
    public void appStore(){
        System.out.println("You opened the app store");
    }
}
class IphoneX implements Iphone{
    public void calling(String name){
        System.out.println("You are calling "+name);
    }
    public void camera(){
        System.out.println("you turned on the camera");
    }
    public void display(){
        System.out.println("I use 60 HZ in 2017");
    }
    public void appStore(){
        System.out.println("You opened the app store");
    }
}
class Myphone implements Andriod,Iphone{
    public void calling(String name){
        System.out.println("You are calling "+name);
    }
    public void camera(){
        System.out.println("you turned on Iphones camera");
    }
    public void display(){
        System.out.println("I use 144 HZ I copy Andriod");
    }
    public void appStore(){
        System.out.println("You opened the app store");
    }
    public void playStore(){
        System.out.println("You opened playstore");
    }
    public void stockAndriod(){
        System.out.println("I use Stock Andriod which is the best!");
    }
}