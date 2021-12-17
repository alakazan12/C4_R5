

package com.usa.reto5.Repository;

import com.usa.reto5.Crud.GadgetInterface;
import com.usa.reto5.Modelos.Gadget;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class GadgetRepo {
    
    @Autowired
    private GadgetInterface inter;
    
    
    public List<Gadget> findByPrice (double price){
        return inter.findByPrice(price);
    }
    
    public List<Gadget> getAll() {
        return inter.findAll();
    }   
    
    public Optional<Gadget> findById(Integer id) {
        return inter.findById(id);
    }
    
    public Gadget save(Gadget gadget) {
        return inter.save(gadget);
    }
    
    public void delete(Gadget gadget) {
        inter.delete(gadget);
    }
    
    public void deleteById(Integer id) {
        inter.deleteById(id);
    }
    
    
}
