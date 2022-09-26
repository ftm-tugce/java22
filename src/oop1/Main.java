package oop1;

public class Main {

	public static void main(String[] args) {
		// veri tipi(String) veri ismi (mesaj) String mesaj;

		Product product1 = new Product();
				// set value (değer verme)
		product1.name = "Delonghi Kahve makinesi ";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "bilmemne1.jpg";

		
				// get (değer okuma)
		//test
		// System.out.println(product1.name);
		
		Product product2 = new Product();
		product2.name = "Smeg Kahve makinesi ";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.unitsInStock = 2;
		product2.imageUrl = "bilmemne2.jpg";
		
		Product product3 = new Product();
		product3.name = "Kitchen Kahve makinesi ";
		product3.unitPrice = 4500;
		product3.discount = 9;
		product3.unitsInStock = 4;
		product3.imageUrl = "bilmemne3.jpg";
		

	}

}
