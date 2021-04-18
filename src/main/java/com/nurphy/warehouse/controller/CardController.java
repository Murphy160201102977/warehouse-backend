package com.nurphy.warehouse.controller;

import com.nurphy.warehouse.pojo.Response;
import com.nurphy.warehouse.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO
 *
 * @author Administrator

 */
@RestController
public class CardController {
    @Autowired
    CardService cardService;
    @PostMapping("/card/add")
    public Response<String> addCard(){
        return null;
    }

    @PostMapping("/card/getAllType")
    public Response<List<String>> findCardType(){
        return Response.returnSuccess(cardService.searchCardType());
    }

}
