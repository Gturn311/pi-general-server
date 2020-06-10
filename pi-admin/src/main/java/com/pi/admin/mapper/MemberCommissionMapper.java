package com.pi.admin.mapper;

import com.pi.admin.service.impl.CommissionInfo;

import com.pi.admin.service.impl.CommissionPayInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangyunliang
 * @date 2019/8/27 15:52
 */
public interface MemberCommissionMapper {

    List<CommissionInfo> queryCommissionFlowYesterday(@Param("num1") String num1, @Param("num2") String num2);

    List<CommissionPayInfo> queryCommissionWithdrawalFlowYesterday(@Param("num1") String num1, @Param("num2") String num2);

    List<CommissionInfo> queryHomeCommissionFlowYesterday(@Param("num1") String num1,@Param("num2") String num2);

    List<CommissionPayInfo> queryHomeCommissionWithdrawalFlowYesterday(@Param("num1") String num1,@Param("num2") String num2);

    List<Long> getVipMemberIds();
}
