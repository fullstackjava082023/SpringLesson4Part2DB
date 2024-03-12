package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CustomerDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

//    @PostConstruct
    public void doSomething() {
        jdbcTemplate.execute("select 1 from dual");
        System.out.println("connection succesful");
    }

//    @PostConstruct
    public void selectNamesAndPhone() {
        jdbcTemplate.query("select * from customers", rs -> {
            String name = rs.getString("customerName");
            String phone = rs.getString("phone");
            System.out.println("Customer name: " + name + " phone: " + phone);
        });
    }

    @PostConstruct
    public List<Customer> selectAllCustomers()  {
        List<Customer> customers = jdbcTemplate.query("select * from customers", new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Customer(rs.getString("customerName"),rs.getString("phone"));
            }
        });
        System.out.println(customers);
        return customers;
    }





}
