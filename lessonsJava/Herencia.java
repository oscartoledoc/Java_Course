public class Herencia {
    public static void main(String[] args) {
        
        AdvMachine obj1 = new AdvMachine();
        int suma = obj1.sum(8,3);
        int resta = obj1.sub(9,2);
        int multip = obj1.mult(8, 9);
        int division = obj1.div(9, 2);

        System.out.println(suma + " " + resta + " " + multip + " "+ division);

    }
}
