public class Employeepara{
int data;
String name;
Employeepara(int d,String n){
data=d;
name=n;
System.out.println(" Employee Id: "+data+" Employee name: "+name); 
}
public static void main(String args[]){
 Employeepara e=new Employeepara(29,"Amogh");
}
}