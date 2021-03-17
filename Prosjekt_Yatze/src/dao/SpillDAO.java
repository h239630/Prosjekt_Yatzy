package dao;

import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import objekter.Spill;
import objekter.Spiller;

@Stateless
public class SpillDAO {
		
		@PersistenceContext(name ="YatzyPU")
		private EntityManager em;
		
		
		public List<Spiller> hentAlleSpillere(int spillID) {
			return em.find(Spill.class, spillID).getSpillere();
		}
		
		public Spiller hentBestemtSpiller(int spillerID) {
			return em.find(Spiller.class, spillerID);
		}
		
		public void lagreNySpiller(String navn) {
			Spiller nySpiller = new Spiller();
			nySpiller.setNavn(navn);
			em.persist(nySpiller);
		}
		
}
