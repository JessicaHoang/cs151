import javax.swing.*; //to use JPan
public class HTMLFormatter implements InvoiceFormatter{
	
	   public String formatHeader()
	   {
	      total = 0;
	      return "<html><p>     I N V O I C E</p></html>";
	   }

	   public String formatLineItem(Invoice in, LineItem item)
	   {
		   
		      total += item.getPrice();
		      if(item.toString().equals("Hammer")) {
		      
		      return (String.format(
		            "%s: $%.2f (%d)\n",item.toString(),item.getPrice(), in.getHammerCounter()));
		      }
		      else if(item.toString().contains("Bundle")){
		    	  return (String.format(
		    	            "%s: $%.2f (%d)\n",item.toString(),item.getPrice(), in.getBundleCounter()));
		      }
		      return "String not found.";
	   }

	   public String formatFooter()
	   {
	      return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
	   }

	   private double total;
}
