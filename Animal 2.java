public class Animal
{
    String name;
    public Animal(String x){
        name = x;
    }
    public String greeting()
    {
        return "Hello, my name is" + " " + name;
    }
}