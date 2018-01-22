package foo.bar;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PropertyService {

    private static List<Property> props = new ArrayList<>();



    public List<Property> getPropertyList(){
        return props;
    }
}
