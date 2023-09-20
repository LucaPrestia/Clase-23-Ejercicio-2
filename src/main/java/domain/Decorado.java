package domain;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Decorado extends Productos {
    @OneToOne
    private Productos producto;
}
