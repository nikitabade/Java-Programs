//Java Program to demonstrate the use of static variable  
class Student
{  
   int rollno;
   String name;  
   static String college ="Savitribai phule pune";
    
   Student(int r, String n)
   {  
        rollno = r;  
        name = n;  
   }  
   
   void display ()
   {
       System.out.println(rollno+" "+name+" "+college);
       
   }  
}  

public class StaticVariable
{  
    public static void main(String args[])
    {  
        Student s1 = new Student(111,"sita");  
        Student s2 = new Student(222,"gita");  
 
        s1.display();  
        s2.display();  
    }  
}  