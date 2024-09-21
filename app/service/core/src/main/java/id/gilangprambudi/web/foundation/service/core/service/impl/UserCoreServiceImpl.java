
package id.gilangprambudi.web.foundation.service.core.service.impl;

import id.gilangprambudi.web.foundation.service.core.dataobject.WebUserDO;
import id.gilangprambudi.web.foundation.service.core.model.WebUser;
import id.gilangprambudi.web.foundation.service.core.repository.WebUserRepository;
import id.gilangprambudi.web.foundation.service.core.service.UserCoreService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: UserCoreServiceImpl.java, v 0.1 2024‐09‐15 22.42 gilang.prambudi Exp $$
 */

@Named
@ApplicationScoped
public class UserCoreServiceImpl implements UserCoreService {

    @PersistenceContext
    private EntityManager em;

    @Inject
    private WebUserRepository webUserRepository;

    @Override
    public WebUser getUser() {
        WebUser webUser = new WebUser();
        webUser.setId(System.currentTimeMillis() + "");
        webUser.setUsername("DUMMY USERNAME");
        return webUser;
    }

    @Override
    public List<WebUser> getAllUser() {
        String sql = "SELECT u FROM WebUser u";
        List<WebUser> webUsers = em.createQuery(sql, WebUser.class).getResultList();
        return webUsers;
    }

    @Override
    public List<WebUserDO> getAllUserDO() {
        return webUserRepository.getAllUserDO();
    }


}
