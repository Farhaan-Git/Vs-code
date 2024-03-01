// WE ARE GOING TO BUILD RAILWAY RESERVATION 

// The Train represents a train in our railway system and encapsulates the following attributes:        
// name, departure time, source station, destination station, passenger strength, and train number.
// - The ReservationSystem class holds information about booked tickets, 
// including the selected train, passenger names, and seat numbers.

// The ReservationSystem class serves as the core of our railway reservation system and encompasses the following functionalities:
// * Display available trains based on source and destination.
// * Check seat availability for a specific train.
// * Book a ticket.
// * Cancel a ticket.
// * Display ticket details.

// create main class and try to create a overall structure component and try to complete getter and setter methods with user input using switch case to access all the methods.






// package RailwaySystem;

// class TrainSeat extends Train{
    
    

// }




// use a array of objects of passenger class(u can also extend to anther class) and store the passenger details for each object in the allocated seat
class Train {
    private final String name;//
    public final int train_number;//
    private short departure_time;//
    private String source_station;//
    private int passenger_strength;//
    private String destination_Station;//


    public String getDestination_Station() {
        return destination_Station;
    }
    public void setDestination_Station(String destination_Station,String username) {
        if(username.equals("ticketcollector")){
            this.destination_Station=destination_Station;
        }
        else{
            System.out.println("Acesss denied");
            return;
        }
    }
    public short getDeparture_time() {
        return departure_time;
    }
    public String getName() {
        return name;
    }
    public void setDeparture_time(short departure_time,String username) {
        if(username.equals("ticketcollector")){
            this.departure_time=departure_time;
        }
        else{
            
            System.out.println("Acesss denied");
            return;
        }
    }
    public String getSource_station() {
        return source_station;
    }
    public void setSource_station(String source_station,String username) {
        if(username.equals("ticketcollector")){
            this.source_station = source_station;return;
            
        }
        else{
            System.out.println("Acesss denied");
            return ;
        }
    }
    public int getPassenger_strength(String username) {
        if(username.equals("ticketcollector")){
            
            return passenger_strength;
        }
        else{
            System.out.println("Acesss denied");return -1;
        }
    }
    public void setPassenger_strength(int passenger_strength,String username) {
        if(username.equals("ticketcollector")){
            this.passenger_strength = passenger_strength;
        }
        else{
            System.out.println("Acesss denied");
        }
        
    }

    public Train(String name, int train_number,String username) {
        if(username.equals("ticketcollector")){
            this.name = name;
            this.train_number = train_number;
            
        }
        else{
            System.out.println("Acesss denied");
            this.name = "";
            this.train_number = -1;
        }
    }


    // Train Seat details 

    public Passenger_details [][][] seat = new Passenger_details[3][3][3];
    private boolean arr [][][] = new boolean[3][3][3];
    private int i=0,j=0,k=0;
    // public int getI() {
    //     return i;
    // }
    // public void setI(int i) {
    //     if(i>=3){
    //         this.i=0;
    //     }
    //     else{
    //     this.i = i;
    //     }
    // }
    // public int getJ() {
    //     return j;
    // }
    // public void setJ(int j) {
    //     if(j>=3){
    //         this.j=0;
    //     }
    //     else{
    //     this.j = j;
    //     }
    // }
    // public int getK() {
    //     return k;
    // }
    // public void setK(int k) {
    //     if(k>=3){
    //         this.k=0;
    //     }
    //     else{
    //     this.k = k;
    //     }
    // }

    public boolean isavailable(int i,int j,int k){
        if(this.arr[i][j][k]){
            return false;
        }
        else{
            return true;
        }
    }
    // private void increment(int i,int j,int k){
    //     setK(k+1);
    //     if(k>=3){
    //         k=0;
    //     }
    // }
    // public void bookSeat(Passenger_details obj){
    //     if(isavailable(i=getI(),j=getJ(),k=getK())){
    //         obj.setSeatnumber(new int[]{i,j,k});
    //         seat[i][j][k] = obj;
    //         arr[i][j][k] = true;
    //         setI(i+1);
    //         setJ(j+1);
    //         setK(k+1);
    //     }
    //     else{
    //         System.out.println("Seats  are full");
    //     }
    // }


        public void bookSeat(Passenger_details obj){
        if(isavailable(this.i, this.j, this.k)){
            obj.setSeatnumber(new int[]{this.i, this.j, this.k});
            this.seat[i][j][k] = obj;
            this.arr[i][j][k] = true;
            System.out.println("i ="+i+"j= "+j+"k= "+k);
            incrementIndices();
        } 
        else {
            System.out.println("Seats are full");
        }
    }

    private void incrementIndices() {
        this.k++;
        if(this.k >= 3) {
            this.k = 0;
            this.j++;
            if(this.j >= 3) {
                this.j = 0;
                this.i++;
                if(this.i >= 3) {
                    // System.out.println("All seats are booked.");
                    return;
                }
            }
        }
}

}

class Passenger_details{
    private String passenger_name;
    private short passenger_age;
    private String passenger_gender;
    private String passenger_destination;
    private String passenger_source;
    private int []seatnumber = new int[3];  // false --> seat empty    true --> seat full


    public int[] getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(int[] seatnumber) {
        System.out.println(String.format("inside func the seat number is: %d%d%d",seatnumber[0],seatnumber[1],seatnumber[2]));
        this.seatnumber[0] = seatnumber[0];
        this.seatnumber[1] = seatnumber[1];
        this.seatnumber[2] = seatnumber[2];

    }

    public String getPassenger_source(String username) {
        if(username.equals("ticketcollector")|| username.equals("customer")){
            return passenger_source;
        }
        else{
            
            System.out.println("Acesss denied");
            return "-1";
        }
        
    }

    public void setPassenger_source(String passenger_source,String username) {
        if(username.equals("ticketcollector")|| username.equals("customer")){
            this.passenger_source = passenger_source;
        }
        else{
            System.out.println("Acesss denied");
            return;
        }
    }

    public String getPassenger_destination(String username) {
        if(username.equals("ticketcollector")|| username.equals("customer")){
            return passenger_destination;
        }
        else{
            
            System.out.println("Acesss denied");
            return "-1";
        }
        
    }

    public void setPassenger_destination(String passenger_destination,String username) {
        if(username.equals("ticketcollector")|| username.equals("customer")){
            this.passenger_destination = passenger_destination;
        }
        else{
            System.out.println("Acesss denied");
            return;
        }
        
    }

    public String getPassenger_gender(String username) {
        if(username.equals("ticketcollector")|| username.equals("customer")){
            return passenger_gender;
        }
        else{
            
            System.out.println("Acesss denied");
            return "-1";
        }
        
    }

    public void setPassenger_gender(String passenger_gender,String username) {
        if(username.equals("ticketcollector")|| username.equals("customer")){
            this.passenger_gender = passenger_gender;
        }
        else{
            System.out.println("Acesss denied");
            return;
        }
        
    }

    public short getPassenger_age(String username) {
        if(username.equals("ticketcollector")|| username.equals("customer")){
            return passenger_age;
        }
        else{
            
            System.out.println("Acesss denied");
            return -1;
        }
        
    }

    public void setPassenger_age(short passenger_age,String username) {
        if(username.equals("ticketcollector")|| username.equals("customer")){
            this.passenger_age = passenger_age;
        }
        else{
            
            System.out.println("Acesss denied");
            return;
        }
        
    }

    public String getPassenger_name(String username) {
        if(username.equals("ticketcollector")|| username.equals("customer")){
            return passenger_name;
        }
        else{
            
            System.out.println("Acesss denied");
            return "-1";
        }
        
    }

    public void setPassenger_name(String passenger_name,String username) {
        if(username.equals("ticketcollector")|| username.equals("customer")){
            this.passenger_name = passenger_name;
        }
        else{
            System.out.println("Acesss denied");
            return;
        }
        
    }

}

public class Railway {
    public static void main(String[] args) {
        // System.out.println("in railway");
        
        Passenger_details obj=new Passenger_details();
        Train tr = new Train("tn express", 123, "ticketcollector".toLowerCase());
        obj.setPassenger_age((short)19 ,"ticketcollector".toLowerCase());
        obj.setPassenger_name("Farhaan", "ticketcollector".toLowerCase());
        Passenger_details obj1=new Passenger_details();
        obj1.setPassenger_age((short)19 ,"ticketcollector".toLowerCase());
        obj1.setPassenger_name("Ezhil", "ticketcollector".toLowerCase());
        Passenger_details obj2=new Passenger_details();
        obj2.setPassenger_age((short)19 ,"ticketcollector".toLowerCase());
        obj2.setPassenger_name("Aravind", "ticketcollector".toLowerCase());
        tr.bookSeat(obj);
        tr.bookSeat(obj1);
        tr.bookSeat(obj2);
        // tr.bookSeat(obj);
        // tr.bookSeat(obj);
        String temp = tr.seat[0][0][1].getPassenger_name("customer");
        // int[] arr = tr.seat[0][0][0].getSeatnumber();
        System.out.println("the name is :"+temp);
        System.out.println(String.format("the seat number is: %d %d %d",tr.seat[0][0][0].getSeatnumber()[0],tr.seat[0][0][0].getSeatnumber()[1],tr.seat[0][0][0].getSeatnumber()[2]));


    }
    
}
