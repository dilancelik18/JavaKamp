package ikinciOdev;

public class MukemmelSayilar {

	public static void main(String[] args) {
		//bolenlerinin toplami kendisine esit olan sayilar 6->1,2,3
		int number =6;
		int total =0;
		
		for(int i =1; i<number ; i++) 
		{
			if(number % i ==0) 
			{
				total = total +i;
			}
		}
		
		if (total == number) 
		{
			System.out.println("Sayi Mukemmeldir");
			
		}
		
		else
			System.out.println("Sayi Mukemmel Degildir");

	}

}
