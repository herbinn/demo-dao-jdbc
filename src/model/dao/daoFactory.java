package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class daoFactory {
	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC();
	}
}
