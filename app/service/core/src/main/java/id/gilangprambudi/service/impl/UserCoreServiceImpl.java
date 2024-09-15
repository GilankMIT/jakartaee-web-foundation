/**
 * DANA.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package id.gilangprambudi.service.impl;

import id.gilangprambudi.model.User;
import id.gilangprambudi.service.UserCoreService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

/**
 * @author gilang.prambudi (gilang.prambudi@dana.id)
 * @version $Id: UserCoreServiceImpl.java, v 0.1 2024‐09‐15 22.42 gilang.prambudi Exp $$
 */

@Named
@ApplicationScoped
public class UserCoreServiceImpl implements UserCoreService {

    @Override
    public User getUser() {
        User user = new User();
        user.setUserId(System.currentTimeMillis() + "");
        user.setFirstName("John");
        user.setLastName("Doe");

        return user;
    }
}
