public class Staff extends Employee{
    String role;
    int yrs_of_exp;
    String dept_name;
    Staff(int id,String name,String phno,String Adress,int  salary,int no_of_days){
        super(id,name,phno,Adress,salary,no_of_days);
    }
    String getdetails(){
        return String.format("The name of the employeee is: %s\nThe phone number is: %s\nThe address of is:%s\nThe salary of is: %d\nThe working days are %d",super.name,super.phno,super.Adress,super.getsalary(),super.calworkdays());
    }
}