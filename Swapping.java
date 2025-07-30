import java.util.*;
public class Swapping{
public static void main(String args[]){
int a,b,temp;
Scanner s=new Scanner(System.in);
System.out.println("ENter the 1st number:");
a=s.nextInt();
System.out.println("ENter the 2nd number:");
b=s.nextInt();
System.out.println("Before swapping:"+a+" "+b);
temp=a;
a=b;
b=temp;
System.out.println("After swapping:"+a+" "+b);
}
}