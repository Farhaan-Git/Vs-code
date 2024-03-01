public class Onfact{
    public static void main(String[]args){
        Onfact obj = new Onfact();
        int k=obj.fact(5);
        System.out.println(k);
    }
    public int fact(int k){
        System.out.println("this is k: "+k);
        int sum=1;
        if(k==1){
            return 1;
        }
        sum =k* fact(k-1);
        System.out.println("this is sum in "+k+" and sum is "+sum);
        return sum;
    }
    public void func(int k){
        while(fact(k)>0){

        }
    }
}