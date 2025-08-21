public class Shape{
public void area(){
int l=9,b=6;
int a=l*b;
System.out.println("Area of the rectangle is: "+a);
}
public double area(int b,int h){
double a=0.5*b*h;
return a;
}
public double area(int r){
double a=3.14*r*r;
return a;
}
public static void main(String args[]){
Shape s=new Shape();
s.area();
System.out.println("Area of the triangle is: "+s.area(15,5));
System.out.println("Area of the circle is: "+s.area(7));
}
}