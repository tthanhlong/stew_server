/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.User;
import Utils.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author tthanhlong
 */
public class UserController {
    public User userLogin(String userID, String password) {
        Session session = null;
        User user = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from User where userID =:userID and passwordHash=:password");
            query.setParameter("userID", userID);
            query.setParameter("password", password);
            user = (User) query.list().get(0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }            
        }
        return user;
    }
    
//    public static void main(String[] arg){
//        UserController userController = new UserController();
//        userController.userLogin("tvJtuA8JiCx16FDJq88jre6rONY6svZe", "af6d45da1f1181347b9e2139f23c6a5b");
//        System.out.println("user login");
//        
//    }
}
