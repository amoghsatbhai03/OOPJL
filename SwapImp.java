import java.util.*;
public class SwapImp{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a,b;
System.out.println("Enter the 2 numbers:");
a=s.nextInt();
b=s.nextInt();
System.out.println("Before swapping:"+a+" "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping:"+a+" "+b);
}
}