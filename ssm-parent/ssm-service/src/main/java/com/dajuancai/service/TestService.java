package com.dajuancai.service;

import com.dajuancai.pojo.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TestService {
    List<Account> findAll();
}
