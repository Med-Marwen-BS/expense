package com.example.expense.Repositories;

import com.example.expense.Model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface TestRepository extends JpaRepository<Test,Long> {

}
