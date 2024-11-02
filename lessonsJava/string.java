// Vamos a aplicar variables y métodos estáticos

class Mascota {
    
    private String name;
    private int edad;
    String sexo;
    static String tipo;

    public Mascota(){ //This is a DEFAULT CONSTRUCTOR
        name = "Carl";
        edad = 11;
    }


    public Mascota(String name, int edad) { //This is a paramaterized constructor
        this.name = name;
        this.edad = edad;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    // public void showData() {
    //     System.out.println("Datos de mascota:" + System.lineSeparator() + 
    //                         "Name: " +  name + System.lineSeparator() + 
    //                         "Edad: " + edad + System.lineSeparator() +
    //                         "Sexo: " + sexo + System.lineSeparator() +
    //                         "Tipo: " + tipo + System.lineSeparator());
    // }

//     public static void showData1(Mascota mascota) {
//         System.out.println("Datos de mascota:" + System.lineSeparator() + 
//                             "Name: " +  mascota.name + System.lineSeparator() + 
//                             "Edad: " + mascota.edad + System.lineSeparator() +
//                             "Sexo: " + mascota.sexo + System.lineSeparator() +
//                             "Tipo: " + Mascota.tipo + System.lineSeparator());
//     }
}



public class string {
    public static void main(String[] args) {    //It's static, so I don't need to instance the class to call the method.

    Mascota mascota1 = new Mascota();
    Mascota mascota2 = new Mascota("Fer",13);
    // mascota1.setName("Fido");
    // mascota1.setEdad(5);

    System.out.println("El nombre es: " + mascota1.getName() + " y su edad es: " + mascota1.getEdad());
    System.out.println("El nombre es: " + mascota2.getName() + " y su edad es: " + mascota2.getEdad());

    // mascota1.showData();
    // mascota2.showData();

    // Mascota.showData1(mascota1);

    }
}