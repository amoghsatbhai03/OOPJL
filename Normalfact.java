import java.util.*;
public class Normalfact{

public static void main(String args[]){
int total=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number to find factorial:");
int num=s.nextInt();
for(int i=1;i<=num;i++){
total=total*i;
}
System.out.println("The factorial of the given number is:"+total);
}
}