/**
 * DANA.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package id.gilangprambudi.impl;

import id.gilangprambudi.UserService;
import id.gilangprambudi.model.User;
import id.gilangprambudi.service.UserCoreService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

/**
 * @author gilang.prambudi (gilang.prambudi@dana.id)
 * @version $Id: UserServiceImpl.java, v 0.1 2024‐09‐15 22.38 gilang.prambudi Exp $$
 */

@Named
@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Inject
    UserCoreService userCoreService;

    @Override
    public User getUser() {
        return userCoreService.getUser();
    }
}
