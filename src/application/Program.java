package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Seller;

public class Program {
	
	public static void main(String[]args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("Test 1 = Find By Id");
		
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
	}

}
