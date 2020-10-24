package com.yichun.service;

import com.yichun.model.AppUser;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;

public interface AppUserService {
    void insertAppUser(AppUser appUser);
}