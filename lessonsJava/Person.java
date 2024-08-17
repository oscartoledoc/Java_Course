public class Person 
{
    // Attribute
    private int age;
    private String name;

    // Contructor
    public Person (int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    // Method to get the age
    public int get_age()
    {
        return age;
    }

    // Method to get the name
    public String get_name()
    {
        return name;
    }

    public static void main (String args[])
    {
        Person myPerson1 = new Person(24, "Oscar");
        Person myPerson2 = new Person(22, "Maria");

        System.out.println("My name is: " + myPerson1.get_name() + " and my age is: " + myPerson1.get_age());
        System.out.println("My name is: " + myPerson2.get_name() + " and my age is: " + myPerson2.get_age());
    }

} 