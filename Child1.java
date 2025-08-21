class parent{
int salary=100000;
public void display()
{
System.out.println("In parent class");
}
}
public class Child1 extends parent{
int bonus =20000;
public void sum(){
System.out.println("In child class");
}
public static void main(String [] args){
Child1 c=new Child1();
int total=c.salary+c.bonus;
System.out.println("Total salary is:"+total);
c.display();
c.sum();
}
}