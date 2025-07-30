public class EmployeeCopy{
int emp_id;
String name;
public EmployeeCopy(int id,String n)
{
emp_id=id;
name=n;
System.out.println(" Employee Id: "+emp_id+" Employee name: "+name);
}
public EmployeeCopy(EmployeeCopy obj){
emp_id=obj.emp_id;
name=obj.name;
System.out.println(" Employee Id: "+emp_id+" Employee name: "+name);
}
public static void main(String args[]){
EmployeeCopy e=new EmployeeCopy(29,"Amogh");
EmployeeCopy s=new EmployeeCopy(e);

}
}