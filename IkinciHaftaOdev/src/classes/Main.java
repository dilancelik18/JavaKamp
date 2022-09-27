package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager= new CustomerManager();

        customerManager.add();

        customerManager.remove();

        customerManager.upDate();


        CustomerManager customerManager2= new CustomerManager();

        customerManager= customerManager2;
	}

}
