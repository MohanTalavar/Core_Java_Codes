package lambda_expr;

import static utils.ShopUtils.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test1_removeFromMapCategory {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
//get product map
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("Original map");
			productMap.forEach((k,v) -> System.out.println(v));
//			System.out.println("Enter date , to remove products");
//			
//			
//			LocalDate date=LocalDate.parse(sc.next());
//			productMap.values() //Collection<Products>
//			.removeIf(p -> p.getManufactureDate().isBefore(date));
//			System.out.println("Map after remove");
//			productMap.forEach((k,v) -> System.out.println(v));
			
			//works | While using streams you cant perform insert and delete ops.
			
			System.out.println("ENter product type ");
			Category cat = Category.valueOf(sc.next().toUpperCase());
			productMap.values().removeIf(p-> p.getProductCategory()==cat);
			System.out.println("Map after removing specific category");
			productMap.forEach((k,v) -> System.out.println(v));
			
			
			
			
		}//sc.close()

	}

}
