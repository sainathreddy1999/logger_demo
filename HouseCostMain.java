package loggers;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseCostMain {
	private static final Logger LOGGER=LogManager.getLogger(log_demo.class);
	public static void main(String args[])
	{
		HouseCost hc=new HouseCost();
		Scanner sc=new Scanner(System.in);
		double area;
		String standard;
		LOGGER.info("Enter the standard:");
		standard=sc.next();
		LOGGER.info("Enter area of house:");
		area=sc.nextDouble();
		sc.close();
		LOGGER.info("Total Cost for construction of house if we use "+standard+" material is:");
		hc.houseCost(standard,area);
		LOGGER.info(hc.totalcost);
		
	}
}
