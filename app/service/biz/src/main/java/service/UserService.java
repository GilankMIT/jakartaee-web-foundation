
package service;

import id.gilangprambudi.web.foundation.service.core.dataobject.WebUserDO;
import id.gilangprambudi.web.foundation.service.core.model.WebUser;

import java.util.List;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: IUserService.java, v 0.1 2024‐09‐15 22.37 gilang.prambudi Exp $$
 */
public interface UserService {
    WebUser getUser();
    List<WebUser> getAllUser();
    List<WebUserDO> getAllUserDO();
}
