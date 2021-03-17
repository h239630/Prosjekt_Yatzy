package objekter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


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
