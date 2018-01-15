package foo.bar;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PropertyService {

    private static List<Property> props = new ArrayList<>();

    static {
        props.add(new Property("Rutkovyca",4,120,200000));
        props.add(new Property("Khmelnutskogo",2,60,90000));
        props.add(new Property("Franka",3,110,170000));
    }


    public List<Property> getPropertyList(){
        return props;
    }
}
