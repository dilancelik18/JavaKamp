package ikinciOdev;

public class SayiBulma {

	public static void main(String[] args) {
	int[] sayilar = new int[] {1,2,5,7,9,0};
	int aranacak =5;
	boolean varMi= false;

	for(int i :sayilar)
	{
		if(aranacak == i)
		{
			varMi = true;
		}
	}
	
	if(varMi)
	{
		System.out.println("Sayi Mevcut");
	}
	
	else
		System.out.println("Sayi Mevcut Degil");
	}

}
