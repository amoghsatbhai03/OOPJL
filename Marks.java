class Student{
String name="Rushabh";
char sec='A';
int roll_no=39;
public void display(){
System.out.println("Name of the student:"+name);
System.out.println("Section of the student:"+sec);
System.out.println("Roll_no of the student:"+roll_no);
}
}
public class Marks extends Student{
int marks_p=90;
int marks_m=98;
int marks_c=80;
public void marks(){
System.out.println("Marks of Physics:"+marks_p);
System.out.println("Marks of Maths:"+marks_m);
System.out.println("Marks of Chemistry:"+marks_c);
}
public static void main(String[] args){
Marks m=new Marks();
m.display();
m.marks();
}
}