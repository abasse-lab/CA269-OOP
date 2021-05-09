public class Date
{
    private int day;
    private int month;
    private int year;
    
    public Date(int x, int y, int z) {
        
        day = x;
        month = y;
        year = z;
        
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}