package com.example.expense.services;

import com.example.expense.Model.Expense;
import com.example.expense.Repositories.ExpenseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ExpenseService {

    private ExpenseRepository er ;

    public Expense addExpence(Expense expense)
    {


        er.save(expense);

        return expense;
    }

    public List<Expense> findAll(){
        return er.findAll();
    }

    public Optional <Expense> FindExpense(Long id ){
        return er.findById(id);
    }

    public String DeleteExpense(Long id )
    {

        if (er.findById(id).isPresent()) {
            er.delete(er.findById(id).get());
            return "this object is Deleted succefully";

        }


        return "there is no object with this id ";



    }


    public Expense updateExpense(Expense expense ){

        List<Long> ll = new ArrayList<>();
        ll.add(expense.getId());
        Expense expense1 = er.findAllById(ll).get(0);
        if(expense.getExpense()!=null && !expense.getExpense().equals(expense1.getExpense())){
            expense1.setExpense(expense.getExpense());
        }
        if(expense.getDescription()!=null && !expense.getDescription().equals(expense1.getDescription())){
            expense1.setDescription(expense.getDescription());
        }
        if(expense.getAmount()!=null && expense.getAmount() != expense1.getAmount()){
            expense1.setAmount(expense.getAmount());
        }

        er.save(expense1);

        return expense1;
    }
}
