package entities;

import com.example.JPAHibernate.repositories.Person;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
@Entity
@Table(name="tb_order")
public class Order implements Serializable {
    private static final long seriaLVersionUTD = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Instant moment;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Person client;

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }
}
