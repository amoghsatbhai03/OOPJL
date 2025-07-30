import java.util.*;
class Triangle{
void area(float b,float h){
float result=0.5*b*h;
System.out.println("The area of a given triangle is:"+result);
}
public static void main(String args[]){
float base,height;
Traingle obj=new Traingle();
Scanner scn=new Scanner(System.in);
System.out.println("Enter the base and height of a triangle:");
base=scn.nextFloat();
height=scn.nextFloat();
obj.area(base,height);
}
}