package com.sttri.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopAppointmentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public ShopAppointmentCriteria() {
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

        public Criteria andBusinessDateIsNull() {
            addCriterion("business_date is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateIsNotNull() {
            addCriterion("business_date is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDateEqualTo(String value) {
            addCriterion("business_date =", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotEqualTo(String value) {
            addCriterion("business_date <>", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateGreaterThan(String value) {
            addCriterion("business_date >", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateGreaterThanOrEqualTo(String value) {
            addCriterion("business_date >=", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLessThan(String value) {
            addCriterion("business_date <", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLessThanOrEqualTo(String value) {
            addCriterion("business_date <=", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateLike(String value) {
            addCriterion("business_date like", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotLike(String value) {
            addCriterion("business_date not like", value, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateIn(List<String> values) {
            addCriterion("business_date in", values, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotIn(List<String> values) {
            addCriterion("business_date not in", values, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateBetween(String value1, String value2) {
            addCriterion("business_date between", value1, value2, "businessDate");
            return (Criteria) this;
        }

        public Criteria andBusinessDateNotBetween(String value1, String value2) {
            addCriterion("business_date not between", value1, value2, "businessDate");
            return (Criteria) this;
        }

        public Criteria andTimeNoIsNull() {
            addCriterion("time_no is null");
            return (Criteria) this;
        }

        public Criteria andTimeNoIsNotNull() {
            addCriterion("time_no is not null");
            return (Criteria) this;
        }

        public Criteria andTimeNoEqualTo(Integer value) {
            addCriterion("time_no =", value, "timeNo");
            return (Criteria) this;
        }

        public Criteria andTimeNoNotEqualTo(Integer value) {
            addCriterion("time_no <>", value, "timeNo");
            return (Criteria) this;
        }

        public Criteria andTimeNoGreaterThan(Integer value) {
            addCriterion("time_no >", value, "timeNo");
            return (Criteria) this;
        }

        public Criteria andTimeNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_no >=", value, "timeNo");
            return (Criteria) this;
        }

        public Criteria andTimeNoLessThan(Integer value) {
            addCriterion("time_no <", value, "timeNo");
            return (Criteria) this;
        }

        public Criteria andTimeNoLessThanOrEqualTo(Integer value) {
            addCriterion("time_no <=", value, "timeNo");
            return (Criteria) this;
        }

        public Criteria andTimeNoIn(List<Integer> values) {
            addCriterion("time_no in", values, "timeNo");
            return (Criteria) this;
        }

        public Criteria andTimeNoNotIn(List<Integer> values) {
            addCriterion("time_no not in", values, "timeNo");
            return (Criteria) this;
        }

        public Criteria andTimeNoBetween(Integer value1, Integer value2) {
            addCriterion("time_no between", value1, value2, "timeNo");
            return (Criteria) this;
        }

        public Criteria andTimeNoNotBetween(Integer value1, Integer value2) {
            addCriterion("time_no not between", value1, value2, "timeNo");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalIsNull() {
            addCriterion("business_total is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalIsNotNull() {
            addCriterion("business_total is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalEqualTo(Integer value) {
            addCriterion("business_total =", value, "businessTotal");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalNotEqualTo(Integer value) {
            addCriterion("business_total <>", value, "businessTotal");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalGreaterThan(Integer value) {
            addCriterion("business_total >", value, "businessTotal");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_total >=", value, "businessTotal");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalLessThan(Integer value) {
            addCriterion("business_total <", value, "businessTotal");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalLessThanOrEqualTo(Integer value) {
            addCriterion("business_total <=", value, "businessTotal");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalIn(List<Integer> values) {
            addCriterion("business_total in", values, "businessTotal");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalNotIn(List<Integer> values) {
            addCriterion("business_total not in", values, "businessTotal");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalBetween(Integer value1, Integer value2) {
            addCriterion("business_total between", value1, value2, "businessTotal");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("business_total not between", value1, value2, "businessTotal");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
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