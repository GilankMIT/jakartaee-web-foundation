/**
 * gilangprambudi.net
 * Copyright (c) 2019‐2024 All Rights Reserved.
 */
package id.gilangprambudi.web.foundation.service.core.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: MapperProducer.java, v 0.1 2024‐09‐19 20.31 gilang.prambudi Exp $$
 */

@ApplicationScoped
public class MapperProducer {

   @Inject
   private SqlSessionFactory sqlSessionFactory;

   @Produces
   @ApplicationScoped
   public WebUserMapper produceUserMapper() {
      SqlSession sqlSession = sqlSessionFactory.openSession(true);
      return sqlSession.getMapper(WebUserMapper.class);
   }
}