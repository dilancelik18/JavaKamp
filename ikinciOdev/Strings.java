package ikinciOdev;

public class Strings {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Cok Guzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayýsý : "+mesaj.length());
		System.out.println("5. eleman : "+mesaj.charAt(4));
		System.out.println( mesaj.concat("Yasasin"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 0, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
	}

}
