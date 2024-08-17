import java.util.Scanner;

class calc
{
    private int n1;
    private int n2;


    // Declaring a constructor
    public calc(int n1, int n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }


    public int add ()
    {
        return n1 + n2;
    }

    public int minus ()
    {
        return n1-n2;
    }

    public int mult ()
    {
        return n1*n2;
    }
    public double div ()
    {
        return n1/n2;
    }

    public int pot ()
    {
        int result = n1;
        for(int i=1; i<n2; i++)
        {
            result = result*n1;
        }
        return result;
    }

    public int fact ()
    {
        int factorial = n2;
        for(int i = n2-1; i>0; i--)
        {
            factorial = factorial*i;
        }
        return factorial;
    }


}



public class calculator
{

    public static void main (String a[])
    {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el dividendo
        System.out.print("Ingrese n1: ");
        int n1 = scanner.nextInt();
        
        // Solicitar al usuario que ingrese el divisor
        System.out.print("Ingrese n2: ");
        int n2 = scanner.nextInt();


        calc obj = new calc(n1,n2);
        System.out.println("===========================");
        System.out.println("The add is: " + obj.add());
        System.out.println("The substraction is: " + obj.minus());
        System.out.println("The multiplication is: " + obj.mult());
        System.out.println("The divition is: " + obj.div());
        System.out.println("The potency is: " + obj.pot()); 
        System.out.println("The factorial is: " + obj.fact());   

        scanner.close();

    }
}