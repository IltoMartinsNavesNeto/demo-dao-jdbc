package Program;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Application {

	public static void main(String[] args) {

		SellerDAO sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById =====");
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);
		
	}

}
