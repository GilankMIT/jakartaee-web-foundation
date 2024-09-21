/**
 * gilangprambudi.net
 * Copyright (c) 2019‐2024 All Rights Reserved.
 */
package id.gilangprambudi.web.foundation.service.core.repository;

import id.gilangprambudi.web.foundation.service.core.dataobject.WebUserDO;
import id.gilangprambudi.web.foundation.service.core.mapper.WebUserMapper;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: WebUserRepositoryImpl.java, v 0.1 2024‐09‐19 20.11 gilang.prambudi Exp $$
 */

@Singleton
public class WebUserRepositoryImpl implements WebUserRepository{

   @Inject
   private WebUserMapper webUserMapper;

   @Override
   public List<WebUserDO> getAllUserDO() {
      return webUserMapper.getAllUser();
   }
}