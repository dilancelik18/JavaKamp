package ikinciOdev;

public class SwitchYapisi {

	public static void main(String[] args) {
	
		char grade = 'A';
		
		switch(grade)
		{
		case 'A':
			System.out.println("Mukemmel : Gectiniz");
			break;
		case 'B' :
			System.out.println("Cok Guzel : Gectiniz");
			break;
		case 'C' :
			System.out.println("Iyi : Gectiniz");
			break;
		case 'D' :
		    System.out.println("Fena degil : Gectiniz");
		    break;
		case 'F' :
			System.out.println("Malasef kalldiniz");
            break;
            default:
            	System.out.println("Gecersiz not girdiniz");
		}

	}

}
