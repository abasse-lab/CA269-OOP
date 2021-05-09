
public class Test{
    public static <T> int max(Thing x, Thing y)
    {
        if(x.value > y.value)
        {
            return x.value;
        }
    
        else
        {
            return y.value;
        }
    }
}
