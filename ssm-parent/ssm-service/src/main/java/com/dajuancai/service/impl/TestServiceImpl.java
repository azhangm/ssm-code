package com.dajuancai.service.impl;

import com.dajuancai.dao.TestMapper;
import com.dajuancai.pojo.Account;
import com.dajuancai.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServiceImpl implements TestService {

    @Autowired
   private  TestMapper mapper;

    @Override
    public List<Account> findAll() {
        List<Account> all = mapper.findAll();
        return all;
    }
}
