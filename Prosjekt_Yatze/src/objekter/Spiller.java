package objekter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(schema = "YatzyDB", name = "spiller")
public class Spiller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int spillerID;
	private String navn;
	
	@ManyToOne
	@JoinColumn(name = "spillID", referencedColumnName = "spillID")
	private Spill spill;
	
	@OneToOne
	@JoinColumn(name = "poengID", referencedColumnName = "poengID")
	private Poeng poeng;
	
	public int getSpillerID() {
		return spillerID;
	}


	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Poeng getPoeng() {
		return poeng;
	}
	 	
}
