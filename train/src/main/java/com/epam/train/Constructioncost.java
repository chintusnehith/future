package com.epam.train;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class Constructioncost {
public static void main(String args[])
{
}
static {
	Scanner sc=new Scanner(System.in);
	Logger l= LogManager.getLogger(Constructioncost.class.getName());
	  l.info("select case");
               int material_standard=sc.nextInt();
               l.info("1 is for standardmaterials"
                  		+ "2 is for above standard"
                  		+ "3 is for high standard"
                  		+ "4 is for high standard with fully furniture");
               int Total_area_of_house=sc.nextInt();
               int result;
              //Total area in square feet          
               switch(material_standard)
               {
               case 1:
              	  result=1200*Total_area_of_house;
					l.info(result);
              	  break;
               case 2:
              	     result=1500*Total_area_of_house;
					l.info(result);
              	     break;
               case 3:
              		  result=1800*Total_area_of_house;
					l.info(result);
              		  break;
               case 4:
              		 result=2500*Total_area_of_house;
					l.info(result);
              		 break;
              		 default:
              			 l.info("select any one");
               }   	 
               }
}