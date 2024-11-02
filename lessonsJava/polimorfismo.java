public class polimorfismo {
    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método sobrecargado para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sobrecargado para sumar dos números en formato double
    public double sumar(double a, double b) {
        return a + b;
    }

    public class Main {
        public static void main(String[] args) {
            polimorfismo calculadora = new polimorfismo();
    
            System.out.println(calculadora.sumar(2, 3));        // Llama al método que suma dos enteros
            System.out.println(calculadora.sumar(2, 3, 4));     // Llama al método que suma tres enteros
            System.out.println(calculadora.sumar(2.5, 3.2));    // Llama al método que suma dos doubles
        }
    }

}


