import java.util.*;
public class Circle{

void area(float r){
float result=3.14f*r*r;
System.out.println("The area of given circle is:"+result);
}
public static void main(String args[]){
float r;
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius of the circle:");
r=s.nextFloat();
Circle obj=new Circle();
obj.area(r);
}
}