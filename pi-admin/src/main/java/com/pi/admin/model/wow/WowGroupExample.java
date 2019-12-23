package com.pi.admin.model.wow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WowGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WowGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_Name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_Name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_Name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_Name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_Name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_Name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_Name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_Name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_Name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_Name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_Name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_Name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_Name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_Name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupDescIsNull() {
            addCriterion("group_desc is null");
            return (Criteria) this;
        }

        public Criteria andGroupDescIsNotNull() {
            addCriterion("group_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDescEqualTo(String value) {
            addCriterion("group_desc =", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotEqualTo(String value) {
            addCriterion("group_desc <>", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescGreaterThan(String value) {
            addCriterion("group_desc >", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescGreaterThanOrEqualTo(String value) {
            addCriterion("group_desc >=", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLessThan(String value) {
            addCriterion("group_desc <", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLessThanOrEqualTo(String value) {
            addCriterion("group_desc <=", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLike(String value) {
            addCriterion("group_desc like", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotLike(String value) {
            addCriterion("group_desc not like", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescIn(List<String> values) {
            addCriterion("group_desc in", values, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotIn(List<String> values) {
            addCriterion("group_desc not in", values, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescBetween(String value1, String value2) {
            addCriterion("group_desc between", value1, value2, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotBetween(String value1, String value2) {
            addCriterion("group_desc not between", value1, value2, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupNumIsNull() {
            addCriterion("group_num is null");
            return (Criteria) this;
        }

        public Criteria andGroupNumIsNotNull() {
            addCriterion("group_num is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNumEqualTo(Integer value) {
            addCriterion("group_num =", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumNotEqualTo(Integer value) {
            addCriterion("group_num <>", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumGreaterThan(Integer value) {
            addCriterion("group_num >", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_num >=", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumLessThan(Integer value) {
            addCriterion("group_num <", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumLessThanOrEqualTo(Integer value) {
            addCriterion("group_num <=", value, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumIn(List<Integer> values) {
            addCriterion("group_num in", values, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumNotIn(List<Integer> values) {
            addCriterion("group_num not in", values, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumBetween(Integer value1, Integer value2) {
            addCriterion("group_num between", value1, value2, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupNumNotBetween(Integer value1, Integer value2) {
            addCriterion("group_num not between", value1, value2, "groupNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumIsNull() {
            addCriterion("group_join_num is null");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumIsNotNull() {
            addCriterion("group_join_num is not null");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumEqualTo(Integer value) {
            addCriterion("group_join_num =", value, "groupJoinNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumNotEqualTo(Integer value) {
            addCriterion("group_join_num <>", value, "groupJoinNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumGreaterThan(Integer value) {
            addCriterion("group_join_num >", value, "groupJoinNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_join_num >=", value, "groupJoinNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumLessThan(Integer value) {
            addCriterion("group_join_num <", value, "groupJoinNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumLessThanOrEqualTo(Integer value) {
            addCriterion("group_join_num <=", value, "groupJoinNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumIn(List<Integer> values) {
            addCriterion("group_join_num in", values, "groupJoinNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumNotIn(List<Integer> values) {
            addCriterion("group_join_num not in", values, "groupJoinNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumBetween(Integer value1, Integer value2) {
            addCriterion("group_join_num between", value1, value2, "groupJoinNum");
            return (Criteria) this;
        }

        public Criteria andGroupJoinNumNotBetween(Integer value1, Integer value2) {
            addCriterion("group_join_num not between", value1, value2, "groupJoinNum");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleIsNull() {
            addCriterion("group_dkp_rule is null");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleIsNotNull() {
            addCriterion("group_dkp_rule is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleEqualTo(String value) {
            addCriterion("group_dkp_rule =", value, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleNotEqualTo(String value) {
            addCriterion("group_dkp_rule <>", value, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleGreaterThan(String value) {
            addCriterion("group_dkp_rule >", value, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleGreaterThanOrEqualTo(String value) {
            addCriterion("group_dkp_rule >=", value, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleLessThan(String value) {
            addCriterion("group_dkp_rule <", value, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleLessThanOrEqualTo(String value) {
            addCriterion("group_dkp_rule <=", value, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleLike(String value) {
            addCriterion("group_dkp_rule like", value, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleNotLike(String value) {
            addCriterion("group_dkp_rule not like", value, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleIn(List<String> values) {
            addCriterion("group_dkp_rule in", values, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleNotIn(List<String> values) {
            addCriterion("group_dkp_rule not in", values, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleBetween(String value1, String value2) {
            addCriterion("group_dkp_rule between", value1, value2, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupDkpRuleNotBetween(String value1, String value2) {
            addCriterion("group_dkp_rule not between", value1, value2, "groupDkpRule");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeIsNull() {
            addCriterion("group_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeIsNotNull() {
            addCriterion("group_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeEqualTo(Date value) {
            addCriterion("group_begin_time =", value, "groupBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeNotEqualTo(Date value) {
            addCriterion("group_begin_time <>", value, "groupBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeGreaterThan(Date value) {
            addCriterion("group_begin_time >", value, "groupBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("group_begin_time >=", value, "groupBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeLessThan(Date value) {
            addCriterion("group_begin_time <", value, "groupBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("group_begin_time <=", value, "groupBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeIn(List<Date> values) {
            addCriterion("group_begin_time in", values, "groupBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeNotIn(List<Date> values) {
            addCriterion("group_begin_time not in", values, "groupBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeBetween(Date value1, Date value2) {
            addCriterion("group_begin_time between", value1, value2, "groupBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("group_begin_time not between", value1, value2, "groupBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeIsNull() {
            addCriterion("group_end_time is null");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeIsNotNull() {
            addCriterion("group_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeEqualTo(Date value) {
            addCriterion("group_end_time =", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeNotEqualTo(Date value) {
            addCriterion("group_end_time <>", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeGreaterThan(Date value) {
            addCriterion("group_end_time >", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("group_end_time >=", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeLessThan(Date value) {
            addCriterion("group_end_time <", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("group_end_time <=", value, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeIn(List<Date> values) {
            addCriterion("group_end_time in", values, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeNotIn(List<Date> values) {
            addCriterion("group_end_time not in", values, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeBetween(Date value1, Date value2) {
            addCriterion("group_end_time between", value1, value2, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("group_end_time not between", value1, value2, "groupEndTime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andEffectIsNull() {
            addCriterion("effect is null");
            return (Criteria) this;
        }

        public Criteria andEffectIsNotNull() {
            addCriterion("effect is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEqualTo(Boolean value) {
            addCriterion("effect =", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotEqualTo(Boolean value) {
            addCriterion("effect <>", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThan(Boolean value) {
            addCriterion("effect >", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectGreaterThanOrEqualTo(Boolean value) {
            addCriterion("effect >=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThan(Boolean value) {
            addCriterion("effect <", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectLessThanOrEqualTo(Boolean value) {
            addCriterion("effect <=", value, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectIn(List<Boolean> values) {
            addCriterion("effect in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotIn(List<Boolean> values) {
            addCriterion("effect not in", values, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectBetween(Boolean value1, Boolean value2) {
            addCriterion("effect between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andEffectNotBetween(Boolean value1, Boolean value2) {
            addCriterion("effect not between", value1, value2, "effect");
            return (Criteria) this;
        }

        public Criteria andSettlementIsNull() {
            addCriterion("settlement is null");
            return (Criteria) this;
        }

        public Criteria andSettlementIsNotNull() {
            addCriterion("settlement is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementEqualTo(Boolean value) {
            addCriterion("settlement =", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementNotEqualTo(Boolean value) {
            addCriterion("settlement <>", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementGreaterThan(Boolean value) {
            addCriterion("settlement >", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementGreaterThanOrEqualTo(Boolean value) {
            addCriterion("settlement >=", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementLessThan(Boolean value) {
            addCriterion("settlement <", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementLessThanOrEqualTo(Boolean value) {
            addCriterion("settlement <=", value, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementIn(List<Boolean> values) {
            addCriterion("settlement in", values, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementNotIn(List<Boolean> values) {
            addCriterion("settlement not in", values, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementBetween(Boolean value1, Boolean value2) {
            addCriterion("settlement between", value1, value2, "settlement");
            return (Criteria) this;
        }

        public Criteria andSettlementNotBetween(Boolean value1, Boolean value2) {
            addCriterion("settlement not between", value1, value2, "settlement");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomIsNull() {
            addCriterion("leader_custom is null");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomIsNotNull() {
            addCriterion("leader_custom is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomEqualTo(String value) {
            addCriterion("leader_custom =", value, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomNotEqualTo(String value) {
            addCriterion("leader_custom <>", value, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomGreaterThan(String value) {
            addCriterion("leader_custom >", value, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomGreaterThanOrEqualTo(String value) {
            addCriterion("leader_custom >=", value, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomLessThan(String value) {
            addCriterion("leader_custom <", value, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomLessThanOrEqualTo(String value) {
            addCriterion("leader_custom <=", value, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomLike(String value) {
            addCriterion("leader_custom like", value, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomNotLike(String value) {
            addCriterion("leader_custom not like", value, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomIn(List<String> values) {
            addCriterion("leader_custom in", values, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomNotIn(List<String> values) {
            addCriterion("leader_custom not in", values, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomBetween(String value1, String value2) {
            addCriterion("leader_custom between", value1, value2, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andLeaderCustomNotBetween(String value1, String value2) {
            addCriterion("leader_custom not between", value1, value2, "leaderCustom");
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(Boolean value) {
            addCriterion("del =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(Boolean value) {
            addCriterion("del <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(Boolean value) {
            addCriterion("del >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("del >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(Boolean value) {
            addCriterion("del <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(Boolean value) {
            addCriterion("del <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<Boolean> values) {
            addCriterion("del in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<Boolean> values) {
            addCriterion("del not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(Boolean value1, Boolean value2) {
            addCriterion("del between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("del not between", value1, value2, "del");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}