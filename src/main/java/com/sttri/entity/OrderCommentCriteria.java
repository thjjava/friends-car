package com.sttri.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCommentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public OrderCommentCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitSize(Integer limitSize) {
        this.limitSize=limitSize;
    }

    public Integer getLimitSize() {
        return limitSize;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(Integer value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(Integer value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(Integer value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(Integer value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<Integer> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<Integer> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(Integer value1, Integer value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andServiceLevelIsNull() {
            addCriterion("service_level is null");
            return (Criteria) this;
        }

        public Criteria andServiceLevelIsNotNull() {
            addCriterion("service_level is not null");
            return (Criteria) this;
        }

        public Criteria andServiceLevelEqualTo(Integer value) {
            addCriterion("service_level =", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelNotEqualTo(Integer value) {
            addCriterion("service_level <>", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelGreaterThan(Integer value) {
            addCriterion("service_level >", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_level >=", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelLessThan(Integer value) {
            addCriterion("service_level <", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelLessThanOrEqualTo(Integer value) {
            addCriterion("service_level <=", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelIn(List<Integer> values) {
            addCriterion("service_level in", values, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelNotIn(List<Integer> values) {
            addCriterion("service_level not in", values, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelBetween(Integer value1, Integer value2) {
            addCriterion("service_level between", value1, value2, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("service_level not between", value1, value2, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andWaitLevelIsNull() {
            addCriterion("wait_level is null");
            return (Criteria) this;
        }

        public Criteria andWaitLevelIsNotNull() {
            addCriterion("wait_level is not null");
            return (Criteria) this;
        }

        public Criteria andWaitLevelEqualTo(Integer value) {
            addCriterion("wait_level =", value, "waitLevel");
            return (Criteria) this;
        }

        public Criteria andWaitLevelNotEqualTo(Integer value) {
            addCriterion("wait_level <>", value, "waitLevel");
            return (Criteria) this;
        }

        public Criteria andWaitLevelGreaterThan(Integer value) {
            addCriterion("wait_level >", value, "waitLevel");
            return (Criteria) this;
        }

        public Criteria andWaitLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("wait_level >=", value, "waitLevel");
            return (Criteria) this;
        }

        public Criteria andWaitLevelLessThan(Integer value) {
            addCriterion("wait_level <", value, "waitLevel");
            return (Criteria) this;
        }

        public Criteria andWaitLevelLessThanOrEqualTo(Integer value) {
            addCriterion("wait_level <=", value, "waitLevel");
            return (Criteria) this;
        }

        public Criteria andWaitLevelIn(List<Integer> values) {
            addCriterion("wait_level in", values, "waitLevel");
            return (Criteria) this;
        }

        public Criteria andWaitLevelNotIn(List<Integer> values) {
            addCriterion("wait_level not in", values, "waitLevel");
            return (Criteria) this;
        }

        public Criteria andWaitLevelBetween(Integer value1, Integer value2) {
            addCriterion("wait_level between", value1, value2, "waitLevel");
            return (Criteria) this;
        }

        public Criteria andWaitLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("wait_level not between", value1, value2, "waitLevel");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelIsNull() {
            addCriterion("attitude_level is null");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelIsNotNull() {
            addCriterion("attitude_level is not null");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelEqualTo(Integer value) {
            addCriterion("attitude_level =", value, "attitudeLevel");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelNotEqualTo(Integer value) {
            addCriterion("attitude_level <>", value, "attitudeLevel");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelGreaterThan(Integer value) {
            addCriterion("attitude_level >", value, "attitudeLevel");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("attitude_level >=", value, "attitudeLevel");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelLessThan(Integer value) {
            addCriterion("attitude_level <", value, "attitudeLevel");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("attitude_level <=", value, "attitudeLevel");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelIn(List<Integer> values) {
            addCriterion("attitude_level in", values, "attitudeLevel");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelNotIn(List<Integer> values) {
            addCriterion("attitude_level not in", values, "attitudeLevel");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelBetween(Integer value1, Integer value2) {
            addCriterion("attitude_level between", value1, value2, "attitudeLevel");
            return (Criteria) this;
        }

        public Criteria andAttitudeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("attitude_level not between", value1, value2, "attitudeLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIsNull() {
            addCriterion("quality_level is null");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIsNotNull() {
            addCriterion("quality_level is not null");
            return (Criteria) this;
        }

        public Criteria andQualityLevelEqualTo(Integer value) {
            addCriterion("quality_level =", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelNotEqualTo(Integer value) {
            addCriterion("quality_level <>", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelGreaterThan(Integer value) {
            addCriterion("quality_level >", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_level >=", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelLessThan(Integer value) {
            addCriterion("quality_level <", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelLessThanOrEqualTo(Integer value) {
            addCriterion("quality_level <=", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIn(List<Integer> values) {
            addCriterion("quality_level in", values, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelNotIn(List<Integer> values) {
            addCriterion("quality_level not in", values, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelBetween(Integer value1, Integer value2) {
            addCriterion("quality_level between", value1, value2, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_level not between", value1, value2, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelIsNull() {
            addCriterion("timelen_level is null");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelIsNotNull() {
            addCriterion("timelen_level is not null");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelEqualTo(Integer value) {
            addCriterion("timelen_level =", value, "timelenLevel");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelNotEqualTo(Integer value) {
            addCriterion("timelen_level <>", value, "timelenLevel");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelGreaterThan(Integer value) {
            addCriterion("timelen_level >", value, "timelenLevel");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("timelen_level >=", value, "timelenLevel");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelLessThan(Integer value) {
            addCriterion("timelen_level <", value, "timelenLevel");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelLessThanOrEqualTo(Integer value) {
            addCriterion("timelen_level <=", value, "timelenLevel");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelIn(List<Integer> values) {
            addCriterion("timelen_level in", values, "timelenLevel");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelNotIn(List<Integer> values) {
            addCriterion("timelen_level not in", values, "timelenLevel");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelBetween(Integer value1, Integer value2) {
            addCriterion("timelen_level between", value1, value2, "timelenLevel");
            return (Criteria) this;
        }

        public Criteria andTimelenLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("timelen_level not between", value1, value2, "timelenLevel");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andReplyIsNull() {
            addCriterion("reply is null");
            return (Criteria) this;
        }

        public Criteria andReplyIsNotNull() {
            addCriterion("reply is not null");
            return (Criteria) this;
        }

        public Criteria andReplyEqualTo(String value) {
            addCriterion("reply =", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotEqualTo(String value) {
            addCriterion("reply <>", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThan(String value) {
            addCriterion("reply >", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThanOrEqualTo(String value) {
            addCriterion("reply >=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThan(String value) {
            addCriterion("reply <", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThanOrEqualTo(String value) {
            addCriterion("reply <=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLike(String value) {
            addCriterion("reply like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotLike(String value) {
            addCriterion("reply not like", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyIn(List<String> values) {
            addCriterion("reply in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotIn(List<String> values) {
            addCriterion("reply not in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyBetween(String value1, String value2) {
            addCriterion("reply between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotBetween(String value1, String value2) {
            addCriterion("reply not between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceIsNull() {
            addCriterion("next_service_advice is null");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceIsNotNull() {
            addCriterion("next_service_advice is not null");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceEqualTo(String value) {
            addCriterion("next_service_advice =", value, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceNotEqualTo(String value) {
            addCriterion("next_service_advice <>", value, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceGreaterThan(String value) {
            addCriterion("next_service_advice >", value, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("next_service_advice >=", value, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceLessThan(String value) {
            addCriterion("next_service_advice <", value, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceLessThanOrEqualTo(String value) {
            addCriterion("next_service_advice <=", value, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceLike(String value) {
            addCriterion("next_service_advice like", value, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceNotLike(String value) {
            addCriterion("next_service_advice not like", value, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceIn(List<String> values) {
            addCriterion("next_service_advice in", values, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceNotIn(List<String> values) {
            addCriterion("next_service_advice not in", values, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceBetween(String value1, String value2) {
            addCriterion("next_service_advice between", value1, value2, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andNextServiceAdviceNotBetween(String value1, String value2) {
            addCriterion("next_service_advice not between", value1, value2, "nextServiceAdvice");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNull() {
            addCriterion("comment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIsNotNull() {
            addCriterion("comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTimeEqualTo(Date value) {
            addCriterion("comment_time =", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotEqualTo(Date value) {
            addCriterion("comment_time <>", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThan(Date value) {
            addCriterion("comment_time >", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_time >=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThan(Date value) {
            addCriterion("comment_time <", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_time <=", value, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeIn(List<Date> values) {
            addCriterion("comment_time in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotIn(List<Date> values) {
            addCriterion("comment_time not in", values, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeBetween(Date value1, Date value2) {
            addCriterion("comment_time between", value1, value2, "commentTime");
            return (Criteria) this;
        }

        public Criteria andCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_time not between", value1, value2, "commentTime");
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