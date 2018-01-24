package foo.bar;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "options")
public class Option {
    @Id
    private int option_id;
    @Column(name = "option_name")
    private  String option_name;

    public Option(){

    }

    public Option(int option_id, String option_name) {
        this.option_id = option_id;
        this.option_name = option_name;
    }

    public int getOption_id() {
        return option_id;
    }

    public String getOption_name() {
        return option_name;
    }

    public void setOption_id(int option_id) {
        this.option_id = option_id;
    }

    public void setOption_name(String option_name) {
        this.option_name = option_name;
    }
@ManyToMany(mappedBy = "optionsSet")
private Set<Property> properties=new HashSet<>();
}
