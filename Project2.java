/**
 * 
 * @author preston jones
 * @author caleb marzean
 *
 */
public class Project2 {

	public static void main(String[] args) 
	{
		String book1 = "Three Sisters, Bi Feiyu.";
		String book2 = "Song of Solomon, Toni Morrison.";
		String book3 = "Owls Don't Have to Mean Death, Chip Livingston.";
		
		
		double book1Price = 18.99;
		// price of Three Sisters
		
		double book2Price = 11.99;
		// price of Song of Solomon
		
		double book3Price = 80.50;
		// price of Owls Don't Have to Mean Death
		
		
		
		int quanitiyBook1 = 2;
		// number of Three Sisters copies purchased
		
		int quanitiyBook2 = 4;
		// number of Song of Solomon copies purchased 
		
		int quanitiyBook3 = 1;
		// number of Owls Don't Have to Mean Death copies purchased
		
		
		
		double preTaxPrice = (quanitiyBook1 * book1Price) + (quanitiyBook2 * book2Price) + (quanitiyBook3 * book3Price);
		// price of purchase before tax is added
		
		final double SALES_TAX_RATE = 0.0875;
		double salesTax = SALES_TAX_RATE * preTaxPrice;
		// the sales tax
		
		double totalCost = salesTax + preTaxPrice;
		// the total price for the purchase
		
		System.out.println("Purchase " + quanitiyBook1 + " copies of " + book1 + " Each copy costs $" + book1Price + ".");
		System.out.println("Purchase " + quanitiyBook2 + " copies of " + book2 + " Each copy costs ");
		System.out.println("$" + book2Price + ".");
		System.out.println("Purchase " + quanitiyBook3 + " copy of " + book3 + " Each");
		System.out.println("copy costs $" + String.format("%.2f", book3Price) + ".");
		System.out.println("Total before tax: $" + preTaxPrice);
		System.out.println("Sales tax: $" + String.format("%.2f", salesTax));
		System.out.println("The total cost of your order will be $" + String.format("%.2f", totalCost));
		
	}

}
