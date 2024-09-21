
package service.impl;

import service.UserService;
import id.gilangprambudi.web.foundation.service.core.dataobject.WebUserDO;
import id.gilangprambudi.web.foundation.service.core.model.WebUser;
import id.gilangprambudi.web.foundation.service.core.service.UserCoreService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: UserServiceImpl.java, v 0.1 2024‐09‐15 22.38 gilang.prambudi Exp $$
 */

@Named
@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Inject
    UserCoreService userCoreService;

    @Override
    public WebUser getUser() {
        return userCoreService.getUser();
    }

    @Override
    public List<WebUser> getAllUser() {
        return userCoreService.getAllUser();
    }

    @Override
    public List<WebUserDO> getAllUserDO() {
        return userCoreService.getAllUserDO();
    }


}
