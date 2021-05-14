package dessertshop;

public class Candy extends DessertItem {
	double quantity;
	public Candy(double q)
	{
		quantity=q;
	}
	@Override
	public double getcost() {
		double cost=quantity*2*60;
		double taxAmount=0.05*cost;
		double totalcost=cost+taxAmount;
		return totalcost;
	}
}