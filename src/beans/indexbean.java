package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.tbluyeDAO;
import model.tbluye;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped

public class indexbean {

	private String ad;
	private String soyad;
	
	private String adsoyad;
	
	private List<tbluye> liste = new ArrayList<>();
	tbluyeDAO DB = new tbluyeDAO();
	int i=0;
	
	
	public void ekle() {
		tbluye u = new tbluye();
		u.setId(liste.size()+1);
		u.setAd(ad);
		u.setSoyadi(soyad);
		DB.kaydet(u);		
	}
	
	public void sil(int id) {
		DB.Native_sil(id);
		System.out.println(id+" Numaralý Müþteri Silindi");
		
	}
	
	public List<tbluye> getListe() {
		return DB.ActiveList(new tbluye());
	}
	public void setListe(List<tbluye> liste) {
		this.liste = liste;
	}
	public String getAdsoyad() {
		return adsoyad;
	}
	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	
	public void goster() {
		adsoyad = ad + " " + soyad;				
	}
	
	
}










