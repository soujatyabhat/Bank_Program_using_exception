class LessBalanceException extends Exception
{
   LessBalanceException() 
    {
        super("Withdral Error!!");
        
    }
}
class account 
{
    double ammount;
    account(){ ammount = 0;}
    public void deposite(double ammount) 
    {
       this.ammount += ammount;
    }
    public void withdraw(double ammount) throws LessBalanceException
    {
        double n;
        n = this.ammount - ammount;
        if(500 > n)
        {
                throw new  LessBalanceException();
        }
        else
         {
                this.ammount-= ammount;
                System.out.println("Deposite is Successful!! " + "Your current balance is : " + this.ammount);
         }
    }
}
public class program1  
{
    public static void main(String args[]) throws LessBalanceException
    {
        account first_acc = new account();
        account second_acc = new account();
        try
        {
        first_acc.deposite(4000);
        first_acc.withdraw(3500);

        second_acc.deposite(5000);
        second_acc.withdraw(6000);
        }
        catch(LessBalanceException obj)
        {
            System.out.println(obj.getMessage());
        }
    }
}