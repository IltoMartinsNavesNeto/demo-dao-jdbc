package Program;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Application {

	public static void main(String[] args) {

		SellerDAO sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById =====");
		Seller seller = sellerdao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller findById =====");
		Department department = new Department(2,null);
		List<Seller> list = sellerdao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}

		
	}

}
