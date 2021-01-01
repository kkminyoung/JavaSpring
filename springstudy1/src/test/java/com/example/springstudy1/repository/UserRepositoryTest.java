package com.example.springstudy1.repository;

import com.example.springstudy1.Springstudy1Application;
import com.example.springstudy1.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends Springstudy1Application {

    // Dependency Injection(DI) : 자동적으로 주입 시켜줌!
    @Autowired
    private UserRepository userRepository;

    // CRUD 만들기
    @Test // 테스트용
    public void create(){
        // String sql = insert into user (%s, %s, %d ) value (account, email,age);
        User user = new User();

        user.setAccount("TestUser01");
        user.setEmail("TestUser01@gmail.com");
        user.setPhoneNumber("010-1111-1111");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");


        // 지정하지 않았던 id도 포함되어있음
        User newUser = userRepository.save(user);
        System.out.println("newUser : " + newUser);

    }

    @Test
    public void read(@RequestParam Long id){
        Optional<User> user = userRepository.findById(2L);
        user.ifPresent(selectUser ->{
            System.out.println("user : " + selectUser);
            System.out.println("email : " + selectUser.getEmail());
        });

    }

    @Test
    public void update(){
        // 특정 User를 Select 해서 업데이트
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser ->{
            selectUser.setAccount("pppp");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");

            userRepository.save(selectUser);
        });

    }

    @Test
    @Transactional
    public void delete(){
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser ->{
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser = userRepository.findById(2L);

        if(deleteUser.isPresent()){
            System.out.println("데이터 존재 : " + deleteUser.get());
        }
        else{
            System.out.println("삭제할 데이터 없음!");
        }

    }


}
