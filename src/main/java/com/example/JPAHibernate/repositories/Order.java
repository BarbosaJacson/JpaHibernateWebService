    package com.example.JPAHibernate.repositories;

    import com.fasterxml.jackson.annotation.JsonFormat;
    import com.fasterxml.jackson.annotation.JsonIgnore;
    import jakarta.persistence.*;

    import java.io.Serializable;
    import java.time.Instant;
    @Entity
    @Table(name="tb_order")
    public class Order implements Serializable {
        private static final long seriaLVersionUTD = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
        private Instant moment;
        private Integer orderStatus;
        @JsonIgnore
        @ManyToOne
        @JoinColumn(name = "client_id")
        private Person client;

        public Order() {
        }

        public Order(Long id, Instant moment, OrderStatus orderStatus, Person client) {
            this.id = id;
            this.moment = moment;
           setOrderStatus(orderStatus);
            this.client = client;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Instant getMoment() {
            return moment;
        }

        public void setMoment(Instant moment) {
            this.moment = moment;
        }

        public OrderStatus getOrderStatus() {
            if (this.orderStatus == null) {
                return null;
            }
            return OrderStatus.valueOf(this.orderStatus);
        }

        public void setOrderStatus(OrderStatus orderStatus) {
            if(orderStatus != null){
                this.orderStatus = orderStatus.getCode();
            } else {
                this.orderStatus = null;
            }
        }

        public Person getClient() {
            return client;
        }

        public void setClient(Person client) {
            this.client = client;
        }
    }
