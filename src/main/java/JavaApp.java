import java.util.Scanner;

public class JavaApp {
	static Scanner sc;
String prod;
int size;
	public void searchKey() {
		String prod;
		System.out.println("Enter Type of Product you want like: Clothing, FootWear");
		sc = new Scanner(System.in);
		prod = sc.next();
		switch (prod) {
		case "Clothing":
			clothing();
			break;
			
		case "FootWear":
			footWear();
			break;
		default:
			System.out.println("Currently this product is not available");
			break;
		}
	}
	
	public static String select(){
		sc = new Scanner(System.in);
		String enterKey=sc.next();
		return enterKey;
	}
	public static void category(){
		System.out.println("Enter for whom you want to buy product like Men, Women or Kids");
		System.out.println("Please enter value as suggested");
	}

	public void clothing() {
		JavaApp.category();
		switch (JavaApp.select()) {
		case "Men":
			System.out.println("Winter wear for Mens are Available in Stock");
			System.out.println("Enter in Which Category you want to search WinterWear, EthnicWear or Casual");
				switch (JavaApp.select()) {
				case "WinterWear":
					System.out.println("Enter product name like: sweatshirt, jacket, tracksuite");
					System.out.println(JavaApp.select()
						+ " is available in stock you can Select size and color then your product will be ready to add in Cart");
					
					break;
				case "EthnicWear":
					System.out.println("Enter product name like: Kurta, Sherwani, Dhoti");
					System.out.println(JavaApp.select()
						+ " is available in stock you can Select size and color then your product will be ready to add in Cart");
					break;
				case "Casual":
					System.out.println("Enter product name like: Tshirt, Jeans");
					System.out.println(JavaApp.select()
						+ " is available in stock you can Select size and color then your product will be ready to add in Cart");
					break;
				default:
					System.out.println("Plese enter proper name");
					
				}
				break;	
				
		case "Women":
			System.out.println("Currently not Available");
			break;
			
		case "kids":
			System.out.println("Currently not Available");
			break;
		default:
			System.out.println("Please enter proper Name");
		}
	
	}

	public void footWear(){
		
		JavaApp.category();
		switch (JavaApp.select()) {
		case "Men":
			System.out.println("FootWear for Mens are Available in Stock");
			System.out.println("Enter in Which Category you want to search Sandals or Shoes");
				switch (JavaApp.select()) {
				case "Sandals":
					System.out.println("Enter Size of the Sandal");
					sc= new Scanner(System.in);
					size=sc.nextInt();
					if(size>5 && size<10){
						System.out.println("Product is available in Stock");
						System.out.println("Select color then your product ready to add in cart");
						
					}
					else
						System.out.println(size+" size Sandal currently not avialable");
					break;
				case "Shoes":
					System.out.println("Enter Size of the Shoes");
					sc= new Scanner(System.in);
					size=sc.nextInt();
					if(size>5 && size<10){
						System.out.println("Product is available in Stock");
						System.out.println("Select color then your product ready to add in cart");
						
					}
					else
						System.out.println(size+" size Shoes currently not avialable");
					break;
				default:
					System.out.println("Plese enter proper name");
					
				}
				break;	
				
		case "Women":
			System.out.println("Currently not Available");
			break;
			
		case "kids":
			System.out.println("Currently not Available");
			break;
		default:
			System.out.println("Please Enter Proper Name");
		}
		
	}
	public static void main(String[] args) {

		JavaApp ja = new JavaApp();
		ja.searchKey();

	}

}
