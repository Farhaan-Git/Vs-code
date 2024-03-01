public class Employee{
    int id;
    String name;
    String phno;
    String Adress;
    private int salary;
    private int no_of_days;
    Employee(int id,String name,String phno,String Adress,int  salary,int no_of_days){
        this.id=id;
        this.phno=phno;
        this.Adress=Adress;
        this.salary=salary;
        this.no_of_days=no_of_days;
        this.name=name;
    }
    int getsalary(){
        return this.salary;
    }
    int getno_of_days(){
        return this.no_of_days;
    }
    int calworkdays(){
        return no_of_days*1000;
    }
}