package application;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller;

        Date birthDate = new Date();

        //Teste de 'insert' no banco de dados, na tabela "Seller";

        seller = new Seller(null, "Vinícius Souza", "vf.com", birthDate, 4000.0, new Department(2, null));
        sellerDao.insert(seller);

        System.out.println("Objeto inserido no banco de dados!");

        //Teste de 'delete' no banco de dados, na tabela "Seller" utilizando um 'id' como referência para exclusão;

        sellerDao.deleteById(11);

        System.out.println("Objeto excluído do banco de dados!");

        //Teste de 'update' no banco de dados, na tabela "Seller" utilizando um 'id' como referência para atualização;

        seller = sellerDao.findById(1);
        seller.setName("Vinícius Ferreira de Souza");
        sellerDao.update(seller);
        System.out.println("Atualizado com sucesso!");
    }
}
