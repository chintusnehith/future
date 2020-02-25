import java.util .*;
import java.util.logging.Logger;
public class interest1
{
public static void main (String argu[ ])
{
}
    
static{
	 Logger l= Logger.getLogger(interest1.class.getName());
    double principal, rate, time, simple,compound;
    Scanner sc=new Scanner (System. in);
    l.info("Enter the amount:");
    principal=sc.nextDouble();
    l.info("Enter the No.of years:");
    time=sc.nextDouble();
    l.info("Enter the Rate of  interest");
    rate=sc.nextDouble();
    simple=(principal * time * rate)/100;
    compound=principal * Math.pow(1.0+rate/100.0,time) - principal;
    l.info("Simple Interest="+simple);
    l.info("Compound Interest="+compound);
   }
}
