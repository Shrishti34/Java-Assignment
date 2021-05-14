package dessertshop;

public class IceCream extends DessertItem{
	double quantity;
	public IceCream(double q)
	{
		quantity=q;
	}
	@Override
	public double getcost() {
		double cost=quantity*60;
		double taxAmount=0.05*cost;
		double totalcost=cost+taxAmount;
		return totalcost;
	}
}