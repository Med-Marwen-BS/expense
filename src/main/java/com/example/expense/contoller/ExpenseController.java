package com.example.expense.contoller;

import com.example.expense.Model.Expense;
import com.example.expense.services.ExpenseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
public class ExpenseController {

    ExpenseService es ;

    @PostMapping("/expense")
    public ResponseEntity <Expense> addExpense(@RequestBody Expense expense)
    {
        Expense e = es.addExpence(expense);

        return new  ResponseEntity<Expense> (e,HttpStatus.OK);
    }

    @GetMapping("/expense")
    public ResponseEntity<List<Expense>> FindAll(){
        return  new ResponseEntity<List<Expense>>(es.findAll(),HttpStatus.OK);

    }

    @PutMapping("/expense")
    public Expense updateExpense(@RequestBody Expense expense){


        return es.updateExpense(expense);
    }

    @GetMapping("/expense/{id}")
    public Optional<Expense> FindExpense(@PathVariable("id") Long id){


        return es.FindExpense(id);
    }

    @DeleteMapping("/expense/{id}")
    public ResponseEntity<String> DeleteExpense(@PathVariable("id") Long id){
        return new ResponseEntity<String>(es.DeleteExpense(id),HttpStatus.OK);
    }

}
