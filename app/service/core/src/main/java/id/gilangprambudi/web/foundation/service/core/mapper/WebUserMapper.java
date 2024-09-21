/**
 * gilangprambudi.net
 * Copyright (c) 2019‐2024 All Rights Reserved.
 */
package id.gilangprambudi.web.foundation.service.core.mapper;

import id.gilangprambudi.web.foundation.service.core.dataobject.WebUserDO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: WebUserMapper.java, v 0.1 2024‐09‐19 20.08 gilang.prambudi Exp $$
 */

public interface WebUserMapper {
   List<WebUserDO> getAllUser();
}