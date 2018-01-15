package foo.bar;

/**
 * Created by yurko on 12.01.18.
 */
public class Property {
    private String location;
    private  int numberOfRoom;
    private  int square;
    private  long price;

    public Property(String location, int numberOfRoom, int square,long price) {
        this.location = location;
        this.numberOfRoom = numberOfRoom;
        this.square = square;
        this.price=price;

    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public int getSquare() {
        return square;
    }
    public long getPrice() {
        return price;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public void setSquare(int square) {
        this.square = square;
    }
    public void setPrice(long price) {
        this.price = price;
    }
}
