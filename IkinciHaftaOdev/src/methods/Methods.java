package methods;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	 public static void sayiBulmaca() {

	        System.out.println(" Say� Bulmaca");

	        int[] sayilar = { 1, 2, 5, 7, 9, 0 };
	        int aranacak = 3;
	        boolean varMi = false;

	        // for (int i=0; i<sayilar.length; i++) {
	        // if ( sayilar[i] == aranacak) {
	        // varMi = true;
	        // break;
	        // }
	        // }

	        for (int sayi : sayilar) {
	            if (aranacak == sayi) {
	                varMi = true;
	                break;
	            }

	        }

	        if (varMi == true) {
	           mesajVer(aranacak);
	            // System.out.println(" Say� Mevcuttur :" + aranacak);

	        } else {
	            System.out.println(" Say� Mevcut De�ildir : " + aranacak);

	        }
	    }
	//-----------------------------------------------
	    public static void mesajVer(int aranacak){
	        System.out.println(" Say� Mevcuttur  :" + aranacak);

	    }
}
