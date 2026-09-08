package application;

import java.util.Date;

import model.dao.SellerDao;
import model.dao.daoFactory;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		SellerDao sellerDao = daoFactory.creatSellerDao();
		System.out.println("===Test 1: seller findById===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
