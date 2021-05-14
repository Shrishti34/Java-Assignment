package dessertshop;

public class Cookies extends DessertItem {
    
	double quantity;
	public Cookies(double q)
	{
		quantity=q;
	}
	@Override
	public double getcost() {
		double cost=quantity*3*70;
		double taxAmount=0.05*cost;
		double totalcost=cost+taxAmount;
		return totalcost;
	}

}
