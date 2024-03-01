import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Check {
    public static void main (String[]args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashSet<Integer> hs= new HashSet<Integer>();
        
        hs.add(5);
        hs.add(7);
        hs.add(3);
        hs.add(1);
        hs.add(9);
        for(int i =1;i<6;i++){
            arr.add(i);
        }
        //System.out.println("before reverse:"+arr);
        
        int min=arr.get(0),max=arr.get(0);
        for(int i =0;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
                // System.out.println(max);
            }
            if(arr.get(i)<min){
                min=arr.get(i);
                // System.out.println(min);
            }
        }
        //System.out.println(String.format("The maximum element is: %d\nThe minimum element is: %d",max,min));
        // arr.set(0,19);
        // arr.add(0,21);
        // arr=Rotate.reverse(arr, 0, 3);
        // arr.add(1);
        // arr.add(2);
        // arr.add(4);
        
        System.out.println("Before :"+arr);

        Rotate.removeDuplicates(arr);
        //arr=Rotate.optimizedRotate(arr, 2);
        // System.out.println("Before Rotate :"+arr);
        // arr=Rotate.arrayRotateRight(arr, 2);
        System.out.println("After :"+arr);

    }
    
}
class Rotate{
    //rotation of ArrayList upto n elements
    public static ArrayList<Integer> arrayRotateRight(ArrayList <Integer> arr,int n){
        for(int i=0;i<n;i++){
            // int a = arr.get(arr.size()-1);
            // System.out.println("a val "+a);
            
            arr.addFirst(arr.getLast());   //can also use arr.getLast();
            arr.removeLast();
        }
        return arr;
    }
    public static ArrayList<Integer> arrayRotateLeft(ArrayList <Integer> arr, int n){
        Iterator<Integer> ir = arr.iterator();
        for(int i=0;i<n;i++){
            arr.addLast(arr.getFirst());
            arr.removeFirst();
        }
        return arr;
    }
    public static ArrayList<Integer> optimizedRotate(ArrayList<Integer> arr,int n){
        n%=arr.size();
        arr=Rotate.reverse(arr,0,n-1);
        System.out.println("first rotate :"+arr);
        arr=Rotate.reverse(arr, n, arr.size()-1);
        System.out.println("second rotate :"+arr);

        arr=Rotate.reverse(arr, 0, arr.size()-1);
        System.out.println("third rotate :"+arr);

        return arr;
    }
    
    public static ArrayList<Integer> reverse(ArrayList<Integer> arr,int start,int end){
        int temp;
        while(start<end){
            temp=arr.get(start);
            arr.set(start++, arr.get(end));
            arr.set(end--, temp);
            // start++;
            // end--;
        }
        return arr;
    }
    public static void removeDuplicates(ArrayList<Integer> arr){
        arr.sort(null);
        Iterator ir = arr.iterator();
        // while(ir.hasNext()){
            
        // }
        for(int i=0;i<arr.size()-2;i++){
            if(arr.get(i)==arr.get(i+1)){
                arr.remove(i);
            }
        }
    }
}
