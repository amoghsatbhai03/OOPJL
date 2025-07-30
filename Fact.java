import java.util.*;
public class Fact{
int f(int n){
int total=1;
if(n>=1){
total=n*f(n-1);
}
return total;
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter the number to find the factorial");
n=s.nextInt();
Fact fr=new Fact();
int result=fr.f(n);
System.out.println("The factorial of the given number is :"+result);
}
}