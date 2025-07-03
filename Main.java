class Operation
{
    void perform()
    {
        System.out.println("Perform Operation");
        
    }
    
}
class Add extends Operation
{
    void add()
    {
        System.out.println("Addition");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Operation op=new Operation();
        op.perform();
        Add a1=new Add();
        a1.add();
    }
}