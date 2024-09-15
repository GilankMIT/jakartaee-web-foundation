/**
 * DANA.id
 * Copyright (c) 2017‐2024 All Rights Reserved.
 */
package id.gilangprambudi.service;

import id.gilangprambudi.model.User;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * @author gilang.prambudi (gilang.prambudi@dana.id)
 * @version $Id: UserCoreService.java, v 0.1 2024‐09‐15 22.41 gilang.prambudi Exp $$
 */

public interface UserCoreService {
    User getUser();
}
