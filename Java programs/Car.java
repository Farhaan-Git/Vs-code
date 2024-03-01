import java.util.Random;
public class Car{
    int milege;
    int topspeed;
    boolean roof=true;
    boolean ac=false;
    void Ac(){
        if(ac==false){
            this.ac=true;
        }
        else{
            this.ac=false;
        }
    }
    int speedometer(){
        Random rand = new Random();
        return rand.nextInt(topspeed);
    }
    public static void main(String[]args){
        // System.out.println(premium.ezhil);
    }
}
class premium extends Car{
    static int ezhil=12;
    premium(){
        super.milege=55;
        super.topspeed=300;
    }
    void roof(){
        if(roof==true){
            super.roof=false;
        }
        else{
            super.roof=true;
        }
    }
}
