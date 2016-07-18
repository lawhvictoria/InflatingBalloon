/**
 *  *
 *   * @author vhlaw
 *    */
public class Balloon {
    private double radius;
    
    public Balloon (double r)
    {
        this.radius = r;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    public void inflate(double amount)
    {
        this.radius += amount;
    }
    
    public double getVolume()
    {           
        return (4.00 / 3) * Math.PI * Math.pow(getRadius(), 3);
    }    
}

