

package com.usa.reto5.Repository;

import com.usa.reto5.Crud.UserInterface;
import com.usa.reto5.Modelos.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class UserRepo {
    
    @Autowired
    private UserInterface inter;
    
    public List<User> getAll() {
        return inter.findAll();
    }
    
    public List<User> findByMonthBirthtDay(String brith) {
        return inter.findByMonthBirthtDay(brith);
    }
    
    public Optional<User> findById(Integer id) {
        return inter.findById(id);
    }
    
     public Optional<User> findByEmail(String email) {
        return inter.findByEmail(email);
    }
     
     public Optional<User> findByEmailAndPassword(String email, String password) {
        return inter.findByEmailAndPassword(email,password);
    }
    
    public User save(User user) {
        return inter.save(user);
    }
    
    public void delete(User user) {
        inter.delete(user);
    }
    
    public void deleteById(Integer id) {
        inter.deleteById(id);
    }
    
    
}
