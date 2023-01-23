import domain.Address;
import domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("kadun");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Member member = new Member();
            member.setName("kadun");
            member.setAddress(new Address("seoul", "song-pa", 12345));

            em.persist(member);

            tx.commit();

        } catch (Exception e) {
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }
}
