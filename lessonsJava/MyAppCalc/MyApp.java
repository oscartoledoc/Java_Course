package MyAppCalc;
import java.util.Scanner;

public class MyApp{

    protected double a;
    protected double b;

/* Param a = #1
 * Param b = #2 */
    public MyApp(){}

    public double getA(){       //Getter to READ A value
        return a;
    }

    public void setA(double a){     //Getter to SEND A value
        this.a=a;
    }

    public double getB(){
        return b;
    }

    public void setB(double b){
        this.b=b;
    }


    public static void main(String[] args)
    {
/* Here I'm creating the AppCalcu's variables */
        AdvOps op1 = new AdvOps();
        Scanner scanner = new Scanner(System.in);   //Instanzing class of scanner
        char opcion;

        do {
            System.out.print("Introduce the number 1: ");
            op1.setA(scanner.nextDouble());
    
            System.out.print("Introduce the number 2: ");
            op1.setB(scanner.nextDouble());
    
            System.out.println("Number #1 = " + op1.getA());
            System.out.println("Number #2 = " + op1.getB());
            System.out.println("-------------------------");
            System.out.println("The addition is: " + op1.sumar());
            System.out.println("The substraction is: " + op1.subs());
            System.out.println("The multiplication is: " + op1.mult());
            System.out.println("The divition is: " + op1.div());
            System.out.println("The potency is: " + op1.pot());

            System.out.print("Do you want to do other operation(Y/N)?: ");
            opcion = scanner.next().charAt(0);  //Choose option to continue or pass

        } while(opcion =='y' || opcion == 'Y');


        scanner.close();

    }
}