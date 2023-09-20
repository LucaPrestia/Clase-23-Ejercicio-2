package domain;


import javax.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class Productos {
    @Column(name = "marca")
    private String marca;
    @Column(name = "nombre")
    private String nombre;
    @Id
    @GeneratedValue
    private Long id;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
