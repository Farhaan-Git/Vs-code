import java.util.ArrayDeque;
class Solution {
    public static int evalRPN(String[] str) {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        int sum=0;
        
        for(int i=0;i<str.length;i++){
            if(str[i]=="+"){
                sum=stack.pop()+stack.pop();
                stack.push(sum);
                System.out.println("inside if + sum is :"+sum);

            }
            else if(str[i]=="-"){
                sum=stack.pop()-stack.pop();
                stack.push(sum);
                System.out.println("inside if - sum is :"+sum);

            }
            else if(str[i]=="*"){
                sum=stack.pop()*stack.pop();
                stack.push(sum);
                System.out.println("inside if * sum is :"+sum);

            }
            else if(str[i]=="/"){
                int temp1 = stack.pop(),temp2 = stack.pop();
                sum=temp2/temp1;
                stack.push(sum);
                System.out.println("inside if / sum is :"+sum);

            }
            else{
                int k=Integer.valueOf(str[i]);
                stack.push(k);
                System.out.println("inside else sum is :"+sum);

            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // String arr[]={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};  //case 3
        // String arr[]={"4","13","5","/","+"};  //case 2
        String arr[]= {"2","1","+","3","*"};  //case 1

        System.out.println(arr[0].hashCode());
        System.out.println("2".hashCode());
        
        int k=Solution.evalRPN(arr);
        System.out.println("this is k: "+k);
    }
}