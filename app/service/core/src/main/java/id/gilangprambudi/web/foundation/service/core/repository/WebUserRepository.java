/**
 * gilangprambudi.net
 * Copyright (c) 2019‐2024 All Rights Reserved.
 */
package id.gilangprambudi.web.foundation.service.core.repository;

import id.gilangprambudi.web.foundation.service.core.dataobject.WebUserDO;

import java.util.List;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: WebUserRepository.java, v 0.1 2024‐09‐19 20.07 gilang.prambudi Exp $$
 */

public interface WebUserRepository {
    List<WebUserDO> getAllUserDO();
}