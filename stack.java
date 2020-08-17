import java.util.Stack;
import java.util.Scanner;
import java.util.stream.Stream;
public class stack{
    public static void main(String[] args) {    
        int n=9 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua stack");
        n= sc.nextInt();
        Stack<Integer> s=new Stack<Integer>();
        System.out.println("nhap các phan tu cua stack");
        for(int i=0;i<n;i++){
            int tmp;
            tmp=sc.nextInt();
            s.push(tmp);
        }
        Stack<Integer> result=new Stack<Integer>();
        while(!s.isEmpty()){
            int tmp=s.pop();
            while(!result.isEmpty()&& result.peek()>tmp){
                s.push(result.pop());
            }
            result.push(tmp);
        }
        System.out.println("các phan tu cua stack sau khi xắp xếp");
        Stream<Integer> stream = result.stream();
        stream.forEach(item -> System.out.println(item));
        sc.close();
    }
}
