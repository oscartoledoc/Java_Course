package MyAppCalc;
public class BasicOps extends MyApp {


    public double sumar()
    {
        return getA()+getB();
    }

    public double subs()
    {
        return getA()-getB();
    }

    public double mult(){
        return getA()*getB();
    }

    public double div() {
        if (getB() == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return Double.NaN; // Retorna Not-a-Number para indicar un error
        }
        return getA() / getB();
    }
}