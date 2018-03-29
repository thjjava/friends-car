package com.sttri.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysOrderCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public SysOrderCriteria() {
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
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

        public Criteria andAppointmentIdIsNull() {
            addCriterion("appointment_id is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdIsNotNull() {
            addCriterion("appointment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdEqualTo(Integer value) {
            addCriterion("appointment_id =", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotEqualTo(Integer value) {
            addCriterion("appointment_id <>", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdGreaterThan(Integer value) {
            addCriterion("appointment_id >", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appointment_id >=", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdLessThan(Integer value) {
            addCriterion("appointment_id <", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("appointment_id <=", value, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdIn(List<Integer> values) {
            addCriterion("appointment_id in", values, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotIn(List<Integer> values) {
            addCriterion("appointment_id not in", values, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdBetween(Integer value1, Integer value2) {
            addCriterion("appointment_id between", value1, value2, "appointmentId");
            return (Criteria) this;
        }

        public Criteria andAppointmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appointment_id not between", value1, value2, "appointmentId");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsCommentIsNull() {
            addCriterion("is_comment is null");
            return (Criteria) this;
        }

        public Criteria andIsCommentIsNotNull() {
            addCriterion("is_comment is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommentEqualTo(Integer value) {
            addCriterion("is_comment =", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotEqualTo(Integer value) {
            addCriterion("is_comment <>", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThan(Integer value) {
            addCriterion("is_comment >", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_comment >=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThan(Integer value) {
            addCriterion("is_comment <", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThanOrEqualTo(Integer value) {
            addCriterion("is_comment <=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentIn(List<Integer> values) {
            addCriterion("is_comment in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotIn(List<Integer> values) {
            addCriterion("is_comment not in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentBetween(Integer value1, Integer value2) {
            addCriterion("is_comment between", value1, value2, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("is_comment not between", value1, value2, "isComment");
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

        public Criteria andCarNoIsNull() {
            addCriterion("car_no is null");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNotNull() {
            addCriterion("car_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarNoEqualTo(String value) {
            addCriterion("car_no =", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotEqualTo(String value) {
            addCriterion("car_no <>", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThan(String value) {
            addCriterion("car_no >", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("car_no >=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThan(String value) {
            addCriterion("car_no <", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThanOrEqualTo(String value) {
            addCriterion("car_no <=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLike(String value) {
            addCriterion("car_no like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotLike(String value) {
            addCriterion("car_no not like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoIn(List<String> values) {
            addCriterion("car_no in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotIn(List<String> values) {
            addCriterion("car_no not in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoBetween(String value1, String value2) {
            addCriterion("car_no between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotBetween(String value1, String value2) {
            addCriterion("car_no not between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("order_source is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("order_source is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(Integer value) {
            addCriterion("order_source =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(Integer value) {
            addCriterion("order_source <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(Integer value) {
            addCriterion("order_source >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_source >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(Integer value) {
            addCriterion("order_source <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(Integer value) {
            addCriterion("order_source <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<Integer> values) {
            addCriterion("order_source in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<Integer> values) {
            addCriterion("order_source not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(Integer value1, Integer value2) {
            addCriterion("order_source between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_source not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(String value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(String value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(String value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(String value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(String value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLike(String value) {
            addCriterion("order_time like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotLike(String value) {
            addCriterion("order_time not like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<String> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<String> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(String value1, String value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(String value1, String value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(String value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(String value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(String value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(String value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(String value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLike(String value) {
            addCriterion("pay_time like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotLike(String value) {
            addCriterion("pay_time not like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<String> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<String> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(String value1, String value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(String value1, String value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andOrderFeeIsNull() {
            addCriterion("order_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderFeeIsNotNull() {
            addCriterion("order_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFeeEqualTo(Long value) {
            addCriterion("order_fee =", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeNotEqualTo(Long value) {
            addCriterion("order_fee <>", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeGreaterThan(Long value) {
            addCriterion("order_fee >", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("order_fee >=", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeLessThan(Long value) {
            addCriterion("order_fee <", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeLessThanOrEqualTo(Long value) {
            addCriterion("order_fee <=", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeIn(List<Long> values) {
            addCriterion("order_fee in", values, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeNotIn(List<Long> values) {
            addCriterion("order_fee not in", values, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeBetween(Long value1, Long value2) {
            addCriterion("order_fee between", value1, value2, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeNotBetween(Long value1, Long value2) {
            addCriterion("order_fee not between", value1, value2, "orderFee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeIsNull() {
            addCriterion("service_employee is null");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeIsNotNull() {
            addCriterion("service_employee is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeEqualTo(String value) {
            addCriterion("service_employee =", value, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeNotEqualTo(String value) {
            addCriterion("service_employee <>", value, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeGreaterThan(String value) {
            addCriterion("service_employee >", value, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeGreaterThanOrEqualTo(String value) {
            addCriterion("service_employee >=", value, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeLessThan(String value) {
            addCriterion("service_employee <", value, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeLessThanOrEqualTo(String value) {
            addCriterion("service_employee <=", value, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeLike(String value) {
            addCriterion("service_employee like", value, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeNotLike(String value) {
            addCriterion("service_employee not like", value, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeIn(List<String> values) {
            addCriterion("service_employee in", values, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeNotIn(List<String> values) {
            addCriterion("service_employee not in", values, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeBetween(String value1, String value2) {
            addCriterion("service_employee between", value1, value2, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServiceEmployeeNotBetween(String value1, String value2) {
            addCriterion("service_employee not between", value1, value2, "serviceEmployee");
            return (Criteria) this;
        }

        public Criteria andServicePic1IsNull() {
            addCriterion("service_pic1 is null");
            return (Criteria) this;
        }

        public Criteria andServicePic1IsNotNull() {
            addCriterion("service_pic1 is not null");
            return (Criteria) this;
        }

        public Criteria andServicePic1EqualTo(String value) {
            addCriterion("service_pic1 =", value, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic1NotEqualTo(String value) {
            addCriterion("service_pic1 <>", value, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic1GreaterThan(String value) {
            addCriterion("service_pic1 >", value, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic1GreaterThanOrEqualTo(String value) {
            addCriterion("service_pic1 >=", value, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic1LessThan(String value) {
            addCriterion("service_pic1 <", value, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic1LessThanOrEqualTo(String value) {
            addCriterion("service_pic1 <=", value, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic1Like(String value) {
            addCriterion("service_pic1 like", value, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic1NotLike(String value) {
            addCriterion("service_pic1 not like", value, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic1In(List<String> values) {
            addCriterion("service_pic1 in", values, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic1NotIn(List<String> values) {
            addCriterion("service_pic1 not in", values, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic1Between(String value1, String value2) {
            addCriterion("service_pic1 between", value1, value2, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic1NotBetween(String value1, String value2) {
            addCriterion("service_pic1 not between", value1, value2, "servicePic1");
            return (Criteria) this;
        }

        public Criteria andServicePic2IsNull() {
            addCriterion("service_pic2 is null");
            return (Criteria) this;
        }

        public Criteria andServicePic2IsNotNull() {
            addCriterion("service_pic2 is not null");
            return (Criteria) this;
        }

        public Criteria andServicePic2EqualTo(String value) {
            addCriterion("service_pic2 =", value, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic2NotEqualTo(String value) {
            addCriterion("service_pic2 <>", value, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic2GreaterThan(String value) {
            addCriterion("service_pic2 >", value, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic2GreaterThanOrEqualTo(String value) {
            addCriterion("service_pic2 >=", value, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic2LessThan(String value) {
            addCriterion("service_pic2 <", value, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic2LessThanOrEqualTo(String value) {
            addCriterion("service_pic2 <=", value, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic2Like(String value) {
            addCriterion("service_pic2 like", value, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic2NotLike(String value) {
            addCriterion("service_pic2 not like", value, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic2In(List<String> values) {
            addCriterion("service_pic2 in", values, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic2NotIn(List<String> values) {
            addCriterion("service_pic2 not in", values, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic2Between(String value1, String value2) {
            addCriterion("service_pic2 between", value1, value2, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic2NotBetween(String value1, String value2) {
            addCriterion("service_pic2 not between", value1, value2, "servicePic2");
            return (Criteria) this;
        }

        public Criteria andServicePic3IsNull() {
            addCriterion("service_pic3 is null");
            return (Criteria) this;
        }

        public Criteria andServicePic3IsNotNull() {
            addCriterion("service_pic3 is not null");
            return (Criteria) this;
        }

        public Criteria andServicePic3EqualTo(String value) {
            addCriterion("service_pic3 =", value, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic3NotEqualTo(String value) {
            addCriterion("service_pic3 <>", value, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic3GreaterThan(String value) {
            addCriterion("service_pic3 >", value, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic3GreaterThanOrEqualTo(String value) {
            addCriterion("service_pic3 >=", value, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic3LessThan(String value) {
            addCriterion("service_pic3 <", value, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic3LessThanOrEqualTo(String value) {
            addCriterion("service_pic3 <=", value, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic3Like(String value) {
            addCriterion("service_pic3 like", value, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic3NotLike(String value) {
            addCriterion("service_pic3 not like", value, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic3In(List<String> values) {
            addCriterion("service_pic3 in", values, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic3NotIn(List<String> values) {
            addCriterion("service_pic3 not in", values, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic3Between(String value1, String value2) {
            addCriterion("service_pic3 between", value1, value2, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic3NotBetween(String value1, String value2) {
            addCriterion("service_pic3 not between", value1, value2, "servicePic3");
            return (Criteria) this;
        }

        public Criteria andServicePic4IsNull() {
            addCriterion("service_pic4 is null");
            return (Criteria) this;
        }

        public Criteria andServicePic4IsNotNull() {
            addCriterion("service_pic4 is not null");
            return (Criteria) this;
        }

        public Criteria andServicePic4EqualTo(String value) {
            addCriterion("service_pic4 =", value, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServicePic4NotEqualTo(String value) {
            addCriterion("service_pic4 <>", value, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServicePic4GreaterThan(String value) {
            addCriterion("service_pic4 >", value, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServicePic4GreaterThanOrEqualTo(String value) {
            addCriterion("service_pic4 >=", value, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServicePic4LessThan(String value) {
            addCriterion("service_pic4 <", value, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServicePic4LessThanOrEqualTo(String value) {
            addCriterion("service_pic4 <=", value, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServicePic4Like(String value) {
            addCriterion("service_pic4 like", value, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServicePic4NotLike(String value) {
            addCriterion("service_pic4 not like", value, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServicePic4In(List<String> values) {
            addCriterion("service_pic4 in", values, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServicePic4NotIn(List<String> values) {
            addCriterion("service_pic4 not in", values, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServicePic4Between(String value1, String value2) {
            addCriterion("service_pic4 between", value1, value2, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServicePic4NotBetween(String value1, String value2) {
            addCriterion("service_pic4 not between", value1, value2, "servicePic4");
            return (Criteria) this;
        }

        public Criteria andServiceContentIsNull() {
            addCriterion("service_content is null");
            return (Criteria) this;
        }

        public Criteria andServiceContentIsNotNull() {
            addCriterion("service_content is not null");
            return (Criteria) this;
        }

        public Criteria andServiceContentEqualTo(String value) {
            addCriterion("service_content =", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotEqualTo(String value) {
            addCriterion("service_content <>", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentGreaterThan(String value) {
            addCriterion("service_content >", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentGreaterThanOrEqualTo(String value) {
            addCriterion("service_content >=", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentLessThan(String value) {
            addCriterion("service_content <", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentLessThanOrEqualTo(String value) {
            addCriterion("service_content <=", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentLike(String value) {
            addCriterion("service_content like", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotLike(String value) {
            addCriterion("service_content not like", value, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentIn(List<String> values) {
            addCriterion("service_content in", values, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotIn(List<String> values) {
            addCriterion("service_content not in", values, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentBetween(String value1, String value2) {
            addCriterion("service_content between", value1, value2, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceContentNotBetween(String value1, String value2) {
            addCriterion("service_content not between", value1, value2, "serviceContent");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestIsNull() {
            addCriterion("service_suggest is null");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestIsNotNull() {
            addCriterion("service_suggest is not null");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestEqualTo(String value) {
            addCriterion("service_suggest =", value, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestNotEqualTo(String value) {
            addCriterion("service_suggest <>", value, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestGreaterThan(String value) {
            addCriterion("service_suggest >", value, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestGreaterThanOrEqualTo(String value) {
            addCriterion("service_suggest >=", value, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestLessThan(String value) {
            addCriterion("service_suggest <", value, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestLessThanOrEqualTo(String value) {
            addCriterion("service_suggest <=", value, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestLike(String value) {
            addCriterion("service_suggest like", value, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestNotLike(String value) {
            addCriterion("service_suggest not like", value, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestIn(List<String> values) {
            addCriterion("service_suggest in", values, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestNotIn(List<String> values) {
            addCriterion("service_suggest not in", values, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestBetween(String value1, String value2) {
            addCriterion("service_suggest between", value1, value2, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceSuggestNotBetween(String value1, String value2) {
            addCriterion("service_suggest not between", value1, value2, "serviceSuggest");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureIsNull() {
            addCriterion("service_ensure is null");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureIsNotNull() {
            addCriterion("service_ensure is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureEqualTo(String value) {
            addCriterion("service_ensure =", value, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureNotEqualTo(String value) {
            addCriterion("service_ensure <>", value, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureGreaterThan(String value) {
            addCriterion("service_ensure >", value, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureGreaterThanOrEqualTo(String value) {
            addCriterion("service_ensure >=", value, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureLessThan(String value) {
            addCriterion("service_ensure <", value, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureLessThanOrEqualTo(String value) {
            addCriterion("service_ensure <=", value, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureLike(String value) {
            addCriterion("service_ensure like", value, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureNotLike(String value) {
            addCriterion("service_ensure not like", value, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureIn(List<String> values) {
            addCriterion("service_ensure in", values, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureNotIn(List<String> values) {
            addCriterion("service_ensure not in", values, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureBetween(String value1, String value2) {
            addCriterion("service_ensure between", value1, value2, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andServiceEnsureNotBetween(String value1, String value2) {
            addCriterion("service_ensure not between", value1, value2, "serviceEnsure");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageIsNull() {
            addCriterion("car_current_mileage is null");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageIsNotNull() {
            addCriterion("car_current_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageEqualTo(String value) {
            addCriterion("car_current_mileage =", value, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageNotEqualTo(String value) {
            addCriterion("car_current_mileage <>", value, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageGreaterThan(String value) {
            addCriterion("car_current_mileage >", value, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageGreaterThanOrEqualTo(String value) {
            addCriterion("car_current_mileage >=", value, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageLessThan(String value) {
            addCriterion("car_current_mileage <", value, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageLessThanOrEqualTo(String value) {
            addCriterion("car_current_mileage <=", value, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageLike(String value) {
            addCriterion("car_current_mileage like", value, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageNotLike(String value) {
            addCriterion("car_current_mileage not like", value, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageIn(List<String> values) {
            addCriterion("car_current_mileage in", values, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageNotIn(List<String> values) {
            addCriterion("car_current_mileage not in", values, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageBetween(String value1, String value2) {
            addCriterion("car_current_mileage between", value1, value2, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andCarCurrentMileageNotBetween(String value1, String value2) {
            addCriterion("car_current_mileage not between", value1, value2, "carCurrentMileage");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIsNull() {
            addCriterion("order_create is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIsNotNull() {
            addCriterion("order_create is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateEqualTo(Date value) {
            addCriterion("order_create =", value, "orderCreate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateNotEqualTo(Date value) {
            addCriterion("order_create <>", value, "orderCreate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateGreaterThan(Date value) {
            addCriterion("order_create >", value, "orderCreate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create >=", value, "orderCreate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateLessThan(Date value) {
            addCriterion("order_create <", value, "orderCreate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateLessThanOrEqualTo(Date value) {
            addCriterion("order_create <=", value, "orderCreate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateIn(List<Date> values) {
            addCriterion("order_create in", values, "orderCreate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateNotIn(List<Date> values) {
            addCriterion("order_create not in", values, "orderCreate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateBetween(Date value1, Date value2) {
            addCriterion("order_create between", value1, value2, "orderCreate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateNotBetween(Date value1, Date value2) {
            addCriterion("order_create not between", value1, value2, "orderCreate");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
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