package com.example.expense.contoller;

import com.example.expense.Model.Expense;
import com.example.expense.Model.Test;
import com.example.expense.services.TestService;
import lombok.AllArgsConstructor;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ExpenceController {

    TestService ts ;
    @GetMapping("/test")
    public String test(){
        return "Hello My First Application" ;

    }

    @PostMapping("/addTest")
    public Test addTest(){



        return  ts.add();

    }


}
