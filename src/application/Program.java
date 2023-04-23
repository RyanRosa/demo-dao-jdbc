package application;

import java.sql.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("Test 1 = Find By Id");

		Seller seller = sellerDao.findById(2);

		System.out.println(seller);

		System.out.println("Test 2 = Find By Deparment");

		Department dep = new Department(2, null);

		List<Seller> seller2 = sellerDao.findById(dep);

		seller2.forEach(System.out::println);
		
		System.out.println("Test 3 = Find All");
		
		List<Seller> seller3 = sellerDao.findAll();
		
		seller3.forEach(System.out::println);
		
		System.out.println("Test 4 = Insert");
		
		Seller seller1 = new Seller(11, "Ruan", "ruan@gmail.com", new Date(2000, 10, 5), 2000.0, dep);
		
		//sellerDao.insert(seller1);
		
		sellerDao.update(seller1);
		//sellerDao.deleteById(10);

	}

}
