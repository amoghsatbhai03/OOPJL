class Parent{
public void display(){
System.out.println("Inside the Parent class");
}
}
public class Child extends Parent{
public void display(){
System.out.println("Method over rided successfully IN CHILD CLASS ");
} 
public static void main(String args[]){
Child c=new Child();
c.display();
}
}