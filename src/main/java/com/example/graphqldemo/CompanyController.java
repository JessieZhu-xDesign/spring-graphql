package com.example.graphqldemo;

import com.example.graphqldemo.model.Company;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class CompanyController {

    @QueryMapping
    public List<Company> companyById(@Argument final String id) {
        return null;
    }


}
