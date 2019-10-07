/**
   A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
Invoice invoice = new Invoice();
int c = invoice.getCounter();
   public String formatHeader()
   {
      total = 0;
      return "     I N V O I C E\n\n\n";
   }

   public String formatLineItem(LineItem item)
   {
      total += item.getPrice();
      return (String.format(
            "%s: $%.2f (%d)\n",item.toString(),item.getPrice(), c));
   }

   public String formatFooter()
   {
      return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
   }

   private double total;
}