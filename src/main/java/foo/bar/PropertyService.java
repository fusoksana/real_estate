package foo.bar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Component
@Service
@Transactional
public class PropertyService {

    private final static int PAGESIZE=2;
    @Autowired
   private PropertyRepository propertyRepository;

    @Autowired
     PropertyService(PropertyRepository propertyRepository){
        this.propertyRepository=propertyRepository;





}

//    public Page <Property> listAllByPage(Pageable pageable) {
//
//
//
//         return (Page<Property>) propertyRepository.findAll();
//    }

    public List<Property> getPage(int pageNumber) {
        PageRequest request = new PageRequest(pageNumber - 1, PAGESIZE, Sort.Direction.ASC, "id");

        return propertyRepository.findAll(request).getContent();
    }





//
//    public Page<Property> listAllByPage(Pageable pageable) {
//
//        Page<Property> propertyPage=new Page<Property>();
//        propertyPage= propertyRepository.findAll(pageable);
//
//
//        return  propertyPage;
//    }
}
