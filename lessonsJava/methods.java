// Declaring my class Computer
class Computer
{
    // Declaring method 
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    // Declaring method 
    public String getMeaPen(int cost)
    {
        // when the condition is fulfilled, the run go out the method 
        if(cost>=10)
            return "Pen";

        return "Nothing";
    }
}



public class methods
{
    public static void main (String a[])
    {
        // Declaring object 
        Computer obj = new Computer();
        // Called method 
        obj.playMusic();
        System.out.println(obj.getMeaPen(2));
    }
}