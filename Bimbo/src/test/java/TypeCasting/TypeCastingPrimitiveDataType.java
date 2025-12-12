package TypeCasting;

public class TypeCastingPrimitiveDataType {

	public static void main(String[] args) {

		//UpCasting : Samller value to larger value
		//int --> long
		
		int intvalue=1000;
		long longvalue=intvalue;
		
		System.out.println(longvalue);
		
		//float ---> Double
		
		float floatvalue=12.4f;
		double doublevalue=floatvalue;
		System.out.println(doublevalue);
		
		
		//Down Casting  : Larger value to smaller value
		//long ----> int
		
		long longvalue1=123456789L;
		int intvalue1=(int) longvalue1;
		System.out.println(intvalue1);
		
		//double ----> float
		double doublevalue1=354.55;
		float floatvalue1=(float) doublevalue1;
		System.out.println(floatvalue1);
		
		int intvalue2=(int) doublevalue1;
		System.out.println(intvalue2);
	}

}
