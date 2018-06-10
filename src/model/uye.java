package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class uye {
	
	  @Id
	  @SequenceGenerator(name = "sq_uye",sequenceName = "sq_tbluye_id",
	                      initialValue = 1,allocationSize = 1)
	  @GeneratedValue(generator = "sq_uye")
	private int id;
	private String ad;
	private String soyadi;
	private int sil_id;
	
	public int getSil_id() {
		return sil_id;
	}
	public void setSil_id(int sil_id) {
		this.sil_id = sil_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	
}
