interface Parent  
{  
    void foo();  
}  
  
class A implements Parent  
{  
    public void foo()  
    {  
        System.out.println("In the foo method of class A.");  
    }  
}  
  
class B implements Parent  
{  
    public void foo()  
    {  
        System.out.println("In the foo method of class B.");  
    }  
}  
  
public class looseCoupling  
{    
    public static void main(String argvs[])   
    {  
        B obj = new B();  
        obj.foo();  
    }  
}
