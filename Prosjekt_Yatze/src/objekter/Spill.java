package objekter;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(schema = "YatzyDB", name = "spill")
public class Spill {
	
	@Id
	private int spillID;
	
	@OneToMany(mappedBy = "spill")
	private List<Spiller> spillere;
	
	public int getSpillID() {
		return this.spillID;
	}
	
	public List<Spiller> getSpillere() {
		return this.spillere;
	}
}
