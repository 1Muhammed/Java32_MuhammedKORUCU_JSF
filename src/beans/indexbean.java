package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.uye;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class indexbean {

	private String ad;
	private String soyad;
	
	private String adsoyad;
	
	private List<uye> liste = new ArrayList<>();
	
	int i=0;
	
	public void ekle() {
		uye u = new uye();
		u.setId(liste.size()+1);
		u.setAd(ad);
		u.setSoyadi(soyad);
		liste.add(u);		
	}
	
	public void sil(int id) {
		liste.remove(id-1);
		System.out.println(id+" Numaralý Müþteri Silindi");
		
	}
	
	public List<uye> getListe() {
		return liste;
	}
	public void setListe(List<uye> liste) {
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










