package myHibernate.action;

import java.util.Iterator;
import java.util.List;

import myHibernate.bean.Product;
import myHibernate.bean.User;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;

public class TestHibernate 
{
	//private SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	public static void main(String[] args) throws HibernateException
	{
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		/*User user=new User();
		user.setId("3");
		user.setUsername("obama");
		user.setPassword("13");
		Product product=new Product();
		product.setId("2");
		product.setPname("nima");
		product.setProvider("meng");
		*/
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		//session.save(user);
		//session.save(product);
		String sqlString = "delete  from user  s where id=3";
		SQLQuery query=session.createSQLQuery(sqlString).addEntity("s","User.class");
        query.executeUpdate();

     /*   Iterator it = l.iterator();
        while (it.hasNext())
        {
            //因为将查询结果与Student类关联，因此返回的是Student集合
            User user = (User)it.next();
            System.out.println("55555");
           System.out.println(user.getid()+user.getUsername()+user.getPassword());
       
            }    */  
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		
	}

}
