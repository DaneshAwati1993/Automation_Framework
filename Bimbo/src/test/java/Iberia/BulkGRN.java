package Iberia;

public class BulkGRN
{
    private static final int A00001 = 0;
	private static final int A04999 = 0;

	public static void main(String[] args) {
    	
    	int P=A00001;
    	
    	while(P<=A04999)
    	{
            System.out.println("  {");
            System.out.println("    \"ProductCode\": \"" + P + "\",");
            System.out.println("    \"QuantityShipped\": 1000");
    		P++;
    	}
       
       }
}
