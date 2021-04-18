package com.nurphy.warehouse.service.impl;

import com.nurphy.warehouse.mapper.CardMapper;
import com.nurphy.warehouse.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO
 *
 * @author
 * @version: 1.0
 * @date 2021/04/18 22:12
 */
@Service
public class CardServiceImpl implements CardService {
    @Autowired
    CardMapper cardMapper;
    @Override
    public List<String> searchCardType() {
        return cardMapper.findAllType();
    }
}
