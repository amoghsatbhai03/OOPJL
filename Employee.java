import java.util.*;
public class Employee{
int emp_id;
String name;
int salary;
public Employee()
{
 emp_id=29;
 name="Amogh";
 salary=100000;
}
public static void main(String args[]){
Employee e=new Employee();
System.out.println("Employee information:");
System.out.println("Employee emp_id:"+e.emp_id);
System.out.println("Employee name:"+e.name);
System.out.println("Employee salary:"+e.salary);
}
}