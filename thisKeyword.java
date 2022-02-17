//using this keyword to distinguish local variable and instance variable.

class Student
{  
    int rollno;  
    String name;  
    float fee;  
    
    Student(int rollno,String name,float fee)
    {  
        this.rollno=rollno;  
        this.name=name;  
        this.fee=fee;  
    }  
    
    void display()
    {   
        System.out.println(rollno+" "+name+" "+fee);
    
    }  
}  
  
class thisKeyword
{  
    public static void main(String args[])
    {  
        
        Student s1=new Student(123,"sita",5000f);  
        Student s2=new Student(234,"Nita",6000f);  
        s1.display();  
        s2.display();  
    }   
    
}  