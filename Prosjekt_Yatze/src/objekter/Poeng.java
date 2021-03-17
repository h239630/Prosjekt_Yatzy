package objekter;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (schema = "YatzyDB", name = "poeng")
public class Poeng {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long poengID; 
	
	@OneToOne(mappedBy = "poeng")
	private Spiller spiller;
	
	private int enere; 
	private int toere; 
	private int trere; 
	private int firere; 
	private int femmere; 
	private int seksere; 
	private int sum; 
	private int bonus; 
	private int etPar; 
	private int toPar; 
	private int treLike; 
	private int fireLike; 
	private int litenStraight; 
	private int storStraight; 
	private int hus; 
	private int sjanse; 
	private int yatzy; 
	private int total;
	
	
	public void setEnere(int enere) {
		this.enere = enere;
	}
	public void setToere(int toere) {
		this.toere = toere;
	}
	public void setTrere(int trere) {
		this.trere = trere;
	}
	public void setFirere(int firere) {
		this.firere = firere;
	}
	public void setFemmere(int femmere) {
		this.femmere = femmere;
	}
	public void setSeksere(int seksere) {
		this.seksere = seksere;
	}
	public void setSum() {
		this.sum = enere + toere + trere + firere + femmere + seksere;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public void setEtPar(int etPar) {
		this.etPar = etPar;
	}
	public void setToPar(int toPar) {
		this.toPar = toPar;
	}
	public void setTreLike(int treLike) {
		this.treLike = treLike;
	}
	public void setFireLike(int fireLike) {
		this.fireLike = fireLike;
	}
	public void setLitenStraight(int litenStraight) {
		this.litenStraight = litenStraight;
	}
	public void setStorStraight(int storStraight) {
		this.storStraight = storStraight;
	}
	public void setHus(int hus) {
		this.hus = hus;
	}
	public void setSjanse(int sjanse) {
		this.sjanse = sjanse;
	}
	public void setYatzy(int yatzy) {
		this.yatzy = yatzy;
	}
	public void setTotal() {
		this.total = sum + bonus + etPar + toPar + treLike + fireLike + litenStraight + storStraight + hus + sjanse + yatzy;
	}
	
	public List<Integer> lagrePoengSomListe() {
		List<Integer> poengListe = new ArrayList<Integer>();
		poengListe.add(enere);
		poengListe.add(toere);
		poengListe.add(trere);
		poengListe.add(firere);
		poengListe.add(femmere);
		poengListe.add(seksere);
		poengListe.add(sum);
		poengListe.add(bonus);
		poengListe.add(etPar);
		poengListe.add(toPar);
		poengListe.add(treLike);
		poengListe.add(fireLike);
		poengListe.add(litenStraight);
		poengListe.add(storStraight);
		poengListe.add(hus);
		poengListe.add(sjanse);
		poengListe.add(yatzy);
		poengListe.add(total);
		return poengListe;
	}
	
}
