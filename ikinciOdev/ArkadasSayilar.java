package ikinciOdev;

public class ArkadasSayilar {

	public static void main(String[] args) {
		// birbirlerinin bolenlerinin birbirlerine esit olan  sayilar
		
		int sayi1 = 220;
		int sayi2 = 284;
		int total1 = 0;
		int total2 = 0;
		
		for(int i=1;i<sayi1;i++)
		{
			if(sayi1 % i == 0) 
			{
				total1 +=i;
			}
		}

		
		for(int i=1;i<sayi2;i++)
		{
			if(sayi2 % i == 0) 
			{
				total2 +=i;
			}
		}
		
		if (sayi1 ==total2 && sayi2== total1) 
		{
			System.out.println("Arkadas sayilardir...");
		}
		
		else
			System.out.println("Arkaads sayi degillerdir..");
	}

}
