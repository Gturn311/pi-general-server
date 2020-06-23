package com.pi.admin.mapper;

import com.pi.admin.service.impl.CommissionInfo;

import com.pi.admin.service.impl.CommissionPayInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author wangyunliang
 * @date 2019/8/27 15:52
 */
public interface MemberCommissionMapper {

    List<CommissionInfo> queryCommissionFlowYesterday(@Param("startTime") Date startTime, @Param("endTime") Date endTime);

    List<CommissionPayInfo> queryCommissionWithdrawalFlowYesterday(@Param("startTime") Date startTime, @Param("endTime") Date endTime);

    List<CommissionInfo> queryHomeCommissionFlowYesterday(@Param("startTime") Date startTime,@Param("endTime") Date endTime);

    List<CommissionPayInfo> queryHomeCommissionWithdrawalFlowYesterday(@Param("startTime") Date startTime,@Param("endTime") Date endTime);

    List<Long> getVipMemberIds();
}
