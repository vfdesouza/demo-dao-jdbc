package application;

import db.DB;
import model.dao.SellerDao;
import model.entities.Seller;
import model.impl.SellerDaoJDBC;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Seller> list = new ArrayList<>();
        SellerDao sellerDao = new SellerDaoJDBC(DB.getConnection());
        list = sellerDao.findAll();

        for(Seller obj : list) {
            System.out.println(obj);
        }
    }
}
