package domain;

import javax.persistence.*;

@Entity
public class DescuentoFijo extends Decorado {
    @Column
    private Double valor;
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
