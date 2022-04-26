package application;

import model.entities.Departament;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Departament departament = new Departament(1, "Books");
        Seller seller = new Seller(1, "Vinicius", "vf.com", new Date(),4000.0);
        System.out.println(departament);
        System.out.println(seller);
    }
}
