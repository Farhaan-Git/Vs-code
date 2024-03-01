package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
// import java.util.List;

public class Problem {
    public static void main(String[] args) {
        String str ="Harshavardhan";
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,1,4,4,4,4,2,3,1)); 
        long start =System.currentTimeMillis();
        System.out.println(getDuplicateItems(arr));
        long end = System.currentTimeMillis();
        System.out.println("The time taken to perform :"+(end-start)+" MS");
    }
    // Find frequency of each character in string
    public static HashMap<Character,Integer> getStringFrequency(String str){
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i=0 ;i<str.length();i++){
            char ch = str.charAt(i);
            if(hs.keySet().contains(ch)){
                hs.put(ch, hs.get(ch)+1);
            }
            else{
                hs.put(ch, 1);
            }
        }
        return hs;
    }
    public static ArrayList<Integer> getDuplicateItems(ArrayList<Integer> arr){
        arr.sort(Comparator.naturalOrder());
        int i=0;
        while(i<arr.size()-1){
            if(arr.get(i)!=arr.get(i+1)){
                // if(arr.get(i-1)!=arr.get(i))
                    arr.remove(i+1);   
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
