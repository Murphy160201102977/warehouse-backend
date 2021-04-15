package com.nurphy.warehouse.controller;

import com.nurphy.warehouse.pojo.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Administrator

 */
@RestController
public class CardController {
    @PostMapping("/card/add")
    public Response<String> addCard(){
        return null;
    }

}
