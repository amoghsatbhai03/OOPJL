public class Addition{
public void add(){
int a=90,b=2;
int c=a+b;
System.out.println("The void method: "+c);
}
public int add(int a,int b){
int c=a+b;
return c;
}
public float add(float a,float b){
float c=a+b;
return c;
}
public double add(double a,double b){
double c=a+b;
return c;
}
public static void main(String args[]){
Addition a=new Addition();
a.add();
System.out.println("Addition in integer: "+a.add(9,7));
System.out.println("Addition in float: "+a.add(100.2f,7.8f));
System.out.println("Addition in double: "+a.add(98.9,76.1));
}
}