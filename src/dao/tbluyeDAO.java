package dao;

import javax.persistence.Query;

import org.hibernate.Session;

import model.tbluye;
import util.NewHibernateUtil;
import util.vtisletimcisi;

public class tbluyeDAO extends vtisletimcisi<tbluye> {

	public void Criteria_sil(int id) {
	
		tbluye item = bul(id, new tbluye());
		item.setSil_id(0);
		duzenle(item);
		
	}
	
	public void Native_sil(int id) {
		
		String sql = "update tbluye set sil_id=0 where id="+id;
		
		Session ss1 = NewHibernateUtil.getSessionFactory().openSession();
		ss1.beginTransaction();
		Query query = ss1.createQuery(sql);
		
		query.executeUpdate();
		ss1.getTransaction().commit();
		ss1.close();
	}
	
}






