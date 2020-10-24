package com.yichun.service.imp;

import com.yichun.model.AppUser;
import com.yichun.service.AppUserService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void insertAppUser(AppUser appUser) {
        sessionFactory
                .getCurrentSession()
                .save(appUser);
    }
}
