package clasesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product= new Product(25, "Cep Telefonu", "Real me", 6000, 56, "sarý","96");

        Product product1= new Product();

        
        product1.setId(250);
        product1.setName("Laptop");
        product1.setDescription("Asus");
        product1.setPrice(15000);
        product1.setStockAmount(15);


        ProductManager productManager= new ProductManager();
        productManager.add(product);
        productManager.add(product1);
	}

}
