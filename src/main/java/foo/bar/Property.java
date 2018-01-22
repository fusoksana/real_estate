package foo.bar;

import javax.persistence.*;
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
    public Property(){

    }

    public Property(int id, String location, int numberOfRooms, int square, long price) {
        this.id = id;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.square = square;
        this.price = price;
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
}
