public class Average
{
    public static double averageArea(Shape[] lst)
    {
        double sum = 0;
        for(int i = 0; i <lst.length; i++)
        {
            sum += lst[i].area();
        }
        double avg = sum / lst.length;
        return avg;
    }
    
}