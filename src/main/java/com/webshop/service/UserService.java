package com.webshop.service;

import com.webshop.model.User;
import com.webshop.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User user){
        user.setCreateDate(new Date());
        userRepository.save(user);
    }

    public User findUser(String nick){ return userRepository.findByNick(nick);}

    public boolean nickIsValid(String nick){
        System.out.println(userRepository.findByNick(nick));
        if(userRepository.findByNick(nick)!=null){
            return false;
        }else{
            return true;
        }
    }

    public boolean mailIsValid(String mail){
        System.out.println(userRepository.findByEmail(mail));
        if(userRepository.findByEmail(mail)!=null){
            return false;
        }else{
            return true;
        }
    }

    public boolean passwordIsValid(User user, String password){

        if(user.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
