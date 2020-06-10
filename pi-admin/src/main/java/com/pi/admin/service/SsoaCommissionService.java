package com.pi.admin.service;





import com.pi.admin.service.impl.CommissionInfo;
import com.pi.admin.service.impl.CommissionPayInfo;

import java.util.List;

/**
 * @author Gturn
 * @Title: SsoaCommissionService
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2020/6/8 15:11
 */

public interface SsoaCommissionService {

    /**
     * 付费会员券归集数据接口
     * @author rzy
     * @date: 2019年8月23日 下午8:04:30
     * @version 1.0
     * @param json
     * @return void
     */
    void syncUsedTicketInfo(String json);

    /**
     * 待支付佣金归集数据接口
     * @author rzy
     * @date: 2019年8月23日 下午8:04:50
     * @version 1.0
     * @param list
     * @return void
     */
    void syncCommissionInfo(List<CommissionInfo> list);

    /**
     * 佣金支付记录数据接口
     * @author rzy
     * @date: 2019年8月23日 下午8:05:00
     * @version 1.0
     * @param list
     * @return void
     */
    void syncCommissionPayInfo(List<CommissionPayInfo> list);
}
