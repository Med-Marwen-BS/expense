package com.example.expense.services;

import com.example.expense.Model.Test;
import com.example.expense.Repositories.TestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestService {
    TestRepository tr ;

    public Test add(){

        Test t = new Test();
        t.setName("mouhamad");
        tr.save(t);
        //tr.flush();
        return t ;
    }

}
