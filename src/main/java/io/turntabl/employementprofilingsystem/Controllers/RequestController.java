package io.turntabl.employementprofilingsystem.Controllers;

import io.swagger.annotations.ApiOperation;
import io.turntabl.employementprofilingsystem.Gmail.Email;
import io.turntabl.employementprofilingsystem.Models.RequestTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import io.turntabl.employementprofilingsystem.Gmail.*;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class RequestController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @ApiOperation("Make a request")
    @PostMapping("/api/v1/request")
    public void makeARequest(@RequestBody RequestTO request) {
        jdbcTemplate.update("insert into requests(requester_id, requester_start_date, requester_end_date, requester_reason) values(?,?,?,?)",
                request.getRequester_id(), request.getRequester_start_date(), request.getRequester_end_date(), request.getRequester_reason());

//        request.getRequester_start_date() = new Date();

       //String formatDate = DateFormat.getDateInstance().format(request.getRequester_start_date());
         SimpleDateFormat DateFor = new SimpleDateFormat("E, dd MMMM yyyy");
         String startDate = DateFor.format(request.getRequester_start_date());
         String endDate = DateFor.format(request.getRequester_end_date());


        try {
            Email.requestMessage("isaac.agyen@turntabl.io", request.getFrom() ,"Holiday request", startDate, endDate, request.getRequester_name());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }

    @CrossOrigin
    @ApiOperation("Get all requests for requester")
    @GetMapping("/api/v1/request/requester/{id}")
    public List<RequestTO> getRequestByRequesterId(@PathVariable("id") Integer id){
        return this.jdbcTemplate.query(
                "select * from requests where requester_id = ?",
                new Object[]{id},
                new BeanPropertyRowMapper<>(RequestTO.class)
        );
    }

    @CrossOrigin
    @ApiOperation("Get all requests")
    @GetMapping("/api/v1/requests")
    public  List<RequestTO> getAllRequests(){
        return this.jdbcTemplate.query("select * from requests",
                new BeanPropertyRowMapper<RequestTO>(RequestTO.class)
        );
    }

}
