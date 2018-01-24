package foo.bar;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "properties")
public class Property {
    @Id
    private  int id;
    @Column(name="location")
    private String location;
    @Column(name="number_of_rooms")
    private  int numberOfRooms;
    @Column(name="square")
    private  int square;
    @Column(name="price")
    private  long price;
    @ManyToMany(cascade ={CascadeType.ALL} )
    @JoinTable(
            name = "property_option",
            joinColumns = {@JoinColumn(name = "id")},
            inverseJoinColumns = {@JoinColumn(name = "option_id")}
    )
     private Set<Option> optionsSet=new HashSet<>();

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    public void setOptionsSet(Set<Option> optionsSet){
        this.optionsSet=optionsSet;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getSquare() {
        return square;
    }

    public long getPrice() {
        return price;
    }
    public Set<Option> getOptionsSet(){
        return  optionsSet;
    }

    public Property(){

    }

    public Property(int id, String location, int numberOfRooms, int square, long price,Set<Option> optionsSet) {
        this.id = id;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.square = square;
        this.price = price;
        this.optionsSet=optionsSet;
    }
}
