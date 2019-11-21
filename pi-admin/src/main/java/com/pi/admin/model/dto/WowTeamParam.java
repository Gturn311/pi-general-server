package com.pi.admin.model.dto;

import com.pi.admin.model.wow.WowTeam;

/**
 * @author Gturn
 * @Title: WowTeamParam
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2019/11/21 17:06
 */

public class WowTeamParam extends WowTeam {
    private Integer teamMemberNum;
    private Integer teamGroupNum;

    public Integer getTeamMemberNum() {
        return teamMemberNum;
    }

    public void setTeamMemberNum(Integer teamMemberNum) {
        this.teamMemberNum = teamMemberNum;
    }

    public Integer getTeamGroupNum() {
        return teamGroupNum;
    }

    public void setTeamGroupNum(Integer teamGroupNum) {
        this.teamGroupNum = teamGroupNum;
    }
}
