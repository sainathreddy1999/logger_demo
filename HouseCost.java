package loggers;

public class HouseCost {
	public double cost,totalcost;
	public String a="std",b="abovestd",c="highstd",d="automated";
double houseCost(String standard,double area)
{
    String standard1=c.concat("_"+d);
	if(a.equals(standard))
		cost=1200;
	else if(b.equals(standard))
		cost=1500;
	else if(c.equals(standard))
		cost=1800;
	else if(standard1.equals("highstd_automated"))
		cost=2500;
    totalcost=(cost*area);
	return totalcost;
}
}
