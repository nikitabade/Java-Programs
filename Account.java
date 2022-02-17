import java.util.Scanner;

class Account
{  
    int acc_no;  
    String name;  
    float amount;  
    
    void insert(int a,String n,float amt)
    {  
        acc_no=a;  
        name=n;  
        amount=amt;  
    }

    void deposit(float amt)
    {  
        amount=amount+amt;  
        System.out.println(amt+" deposited");  
    }  
 
    void withdraw(float amt)
    {  
        if(amount<amt)
        {  
            System.out.println("Insufficient Balance");  
        }
        else
        {  
            amount=amount-amt;  
            System.out.println(amt+" withdrawn");  
        }  
    }  


    void checkBalance()
    {
        System.out.println("Balance is: "+amount);
        
    }  
 
    void display()
    {
        System.out.println(acc_no+" "+name+" "+amount);
        
    }  
}  

class Account
{  
    public static void main(String[] args)
    {  
        Account aobj=new Account();  
        
        Scanner sobj= new Scanner(System.in);
        
        System.out.println("Enter the account no");
        int accNo=sobj.nextInt();
        
        System.out.println("Enter the name of accountent");
        sobj.nextLine();
        String aname=sobj.nextLine();

        System.out.println("Insert the amount");
        float amount=sobj.nextFloat();
        
        aobj.insert(accNo,aname,amount);  
        
        aobj.display();  
        
        aobj.checkBalance(); 
        
        System.out.println("Enter the amount to be deposited");
        float damount=sobj.nextFloat();
         
        aobj.deposit(damount); 
        
        aobj.checkBalance();  
        
        System.out.println("Enter the  amount to be withdrawn");
        float wamount=sobj.nextFloat();
        
        aobj.withdraw(wamount); 
        
        aobj.checkBalance();  
    }
}