
package id.gilangprambudi.web.foundation.service.core.service;

import id.gilangprambudi.web.foundation.service.core.dataobject.WebUserDO;
import id.gilangprambudi.web.foundation.service.core.model.WebUser;

import java.util.List;

/**
 * @author gilang.prambudi (itgilangprambudi@gmail.com)
 * @version $Id: UserCoreService.java, v 0.1 2024‐09‐15 22.41 gilang.prambudi Exp $$
 */

public interface UserCoreService {
    WebUser getUser();

    List<WebUser> getAllUser();

    List<WebUserDO> getAllUserDO();
}
