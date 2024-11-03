package MyAppCalc;

public class AdvOps extends BasicOps {
    public double pot()
    {

    return Math.pow(getA(), getB()); // Usa Math.pow para calcular A elevado a B

    // ALL OF THIS PART IS TO CALCULE THE POTENCY OF 2 NUMBERS WITHOUT METHOD
    // Asegúrate de que getB() sea un entero
    // int exponente = (int) getB(); // Convertir a entero
    // double result = 1;

    // // Manejar exponentes negativos
    // if (exponente < 0) {
    //     for (int i = 0; i < -exponente; i++) {
    //         result *= getA();
    //     }
    //     return 1 / result; // Retorna la inversa para exponentes negativos
    // }

    // // Calcular potencia para exponentes no negativos
    // for (int i = 0; i < exponente; i++) {
    //     result *= getA();
    // }
    // return result;
    }
}