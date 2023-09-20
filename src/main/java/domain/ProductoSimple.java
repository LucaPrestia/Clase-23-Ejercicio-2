package domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity

public class ProductoSimple extends Productos {
    @Column
    private Double precio;
    @Column
    private Integer stock;

}
