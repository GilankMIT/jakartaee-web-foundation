/**
 * gilangprambudi.net
 * Copyright (c) 2019‐2024 All Rights Reserved.
 */
package id.gilangprambudi.web.foundation.service.core.config;

import id.gilangprambudi.web.foundation.service.core.mapper.WebUserMapper;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.cdi.SessionFactoryProvider;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: MyBatisConfiguration.java, v 0.1 2024‐09‐19 19.55 gilang.prambudi Exp $$
 */

@ApplicationScoped
public class MyBatisConfiguration {
   @Produces
   @SessionFactoryProvider
   public SqlSessionFactory createSqlSessionFactory() throws Exception {
      try {
         InputStream inputStream = getClass().getResourceAsStream("/mybatis-config.xml");
         return new SqlSessionFactoryBuilder().build(inputStream);
      } catch (Exception e) {
         throw new RuntimeException("Error initializing SqlSessionFactory", e);
      }
   }
}