package foo.bar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @RequestMapping("/proreties")
    public List<Property> showProperties() {
        List<Property> lp = propertyService.getPropertyList();
        return lp;
    }

}