//super can be used to invoke parent class method

class Animal
{  
    void eat()
    {
        System.out.println("eating...");
    
    }  
}  

class Dog extends Animal
{  
    void eat()
    {
        System.out.println("eating bread...");
    
    }  
    void bark()
    {
        System.out.println("barking...");
    
    }  
    void work()
    {  
        super.eat();  
        bark();  
    }  
} 

class SuperForMethod
{  
    public static void main(String args[])
    {  
        Dog d=new Dog();  
        d.work();  
    }
    
}  