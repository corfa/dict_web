package ru.sping.lab;

import org.hibernate.Session;
import ru.sping.lab.db.DAO;
import ru.sping.lab.db.FrazaEntity;
import ru.sping.lab.db.HibernateSessionFactory;

public class Test {
    public static void main(String[] args) {
        DAO dao= new DAO();
        FrazaEntity fraza=new FrazaEntity();
        fraza.setId(9);
        fraza.setFraza("привет!");
        dao.saveHero(fraza);

//
//        System.out.println("Hibernate tutorial");
//
//        Session session = HibernateSessionFactory.getSessionFactory().openSession();
//
//        session.beginTransaction();
//
//       FrazaEntity fraza=new FrazaEntity();
//
//       fraza.setId(6);
//        fraza.setFraza("привет!");
//
//        session.save(fraza);
//        session.getTransaction().commit();
//
//        session.close();
    }
}
