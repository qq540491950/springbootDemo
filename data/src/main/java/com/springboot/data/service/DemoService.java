package com.springboot.data.service;

import com.springboot.data.dao.DemoDao;
import com.springboot.data.dao.DemoRepository;
import com.springboot.data.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lirt
 */
@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;
    @Autowired
    private DemoDao demoDao;

    public void save(Demo demo){
        demoRepository.save(demo);
    }

    public Demo getDemo(String id) {
        return demoDao.getDemo(id);
    }
}
