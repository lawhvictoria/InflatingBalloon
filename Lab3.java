/**
 *  *
 *   * @author vhlaw
 *    */
public class Lab3 {
    public static void main(String[] args) {
        double r = 0;
        Balloon balloon = new Balloon(r);
        
        System.out.println("The volume of the current balloon is: " + balloon.getVolume());
        
        double inflate = 10;
        System.out.println("Inflating balloon by " + inflate);
        balloon.inflate(inflate);
        
        System.out.println("The volume of the balloon is " + balloon.getVolume());
    }
}
