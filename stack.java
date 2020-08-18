import java.util.Stack;
import java.util.Scanner;
import java.util.stream.Stream;
public class stack{
    public static void main(String[] args) {    
        int n=9 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("number of elements on the stack");
        n= sc.nextInt();
        Stack<Integer> s=new Stack<Integer>();
        System.out.println("elements of stack");
        for(int i=0;i<n;i++){
            int tmp;
            tmp=sc.nextInt();
            s.push(tmp);
        }
        Stack<Integer> result=new Stack<Integer>();
        while(!s.isEmpty()){
            int tmp=s.pop();
            while(!result.isEmpty()&& result.peek()<tmp){
                s.push(result.pop());
            }
            result.push(tmp);
        }
        while(!result.isEmpty()){
            s.push(result.pop());
        }
        System.out.println("Stack after sort");
        Stream<Integer> stream = s.stream();
        stream.forEach(item -> System.out.println(item));
        
        sc.close();
    }
}
