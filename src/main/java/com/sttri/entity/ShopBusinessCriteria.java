package com.sttri.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopBusinessCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public ShopBusinessCriteria() {
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

        public Criteria andPriceLowIsNull() {
            addCriterion("price_low is null");
            return (Criteria) this;
        }

        public Criteria andPriceLowIsNotNull() {
            addCriterion("price_low is not null");
            return (Criteria) this;
        }

        public Criteria andPriceLowEqualTo(Long value) {
            addCriterion("price_low =", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowNotEqualTo(Long value) {
            addCriterion("price_low <>", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowGreaterThan(Long value) {
            addCriterion("price_low >", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowGreaterThanOrEqualTo(Long value) {
            addCriterion("price_low >=", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowLessThan(Long value) {
            addCriterion("price_low <", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowLessThanOrEqualTo(Long value) {
            addCriterion("price_low <=", value, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowIn(List<Long> values) {
            addCriterion("price_low in", values, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowNotIn(List<Long> values) {
            addCriterion("price_low not in", values, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowBetween(Long value1, Long value2) {
            addCriterion("price_low between", value1, value2, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceLowNotBetween(Long value1, Long value2) {
            addCriterion("price_low not between", value1, value2, "priceLow");
            return (Criteria) this;
        }

        public Criteria andPriceRuleIsNull() {
            addCriterion("price_rule is null");
            return (Criteria) this;
        }

        public Criteria andPriceRuleIsNotNull() {
            addCriterion("price_rule is not null");
            return (Criteria) this;
        }

        public Criteria andPriceRuleEqualTo(String value) {
            addCriterion("price_rule =", value, "priceRule");
            return (Criteria) this;
        }

        public Criteria andPriceRuleNotEqualTo(String value) {
            addCriterion("price_rule <>", value, "priceRule");
            return (Criteria) this;
        }

        public Criteria andPriceRuleGreaterThan(String value) {
            addCriterion("price_rule >", value, "priceRule");
            return (Criteria) this;
        }

        public Criteria andPriceRuleGreaterThanOrEqualTo(String value) {
            addCriterion("price_rule >=", value, "priceRule");
            return (Criteria) this;
        }

        public Criteria andPriceRuleLessThan(String value) {
            addCriterion("price_rule <", value, "priceRule");
            return (Criteria) this;
        }

        public Criteria andPriceRuleLessThanOrEqualTo(String value) {
            addCriterion("price_rule <=", value, "priceRule");
            return (Criteria) this;
        }

        public Criteria andPriceRuleLike(String value) {
            addCriterion("price_rule like", value, "priceRule");
            return (Criteria) this;
        }

        public Criteria andPriceRuleNotLike(String value) {
            addCriterion("price_rule not like", value, "priceRule");
            return (Criteria) this;
        }

        public Criteria andPriceRuleIn(List<String> values) {
            addCriterion("price_rule in", values, "priceRule");
            return (Criteria) this;
        }

        public Criteria andPriceRuleNotIn(List<String> values) {
            addCriterion("price_rule not in", values, "priceRule");
            return (Criteria) this;
        }

        public Criteria andPriceRuleBetween(String value1, String value2) {
            addCriterion("price_rule between", value1, value2, "priceRule");
            return (Criteria) this;
        }

        public Criteria andPriceRuleNotBetween(String value1, String value2) {
            addCriterion("price_rule not between", value1, value2, "priceRule");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNull() {
            addCriterion("car_price is null");
            return (Criteria) this;
        }

        public Criteria andCarPriceIsNotNull() {
            addCriterion("car_price is not null");
            return (Criteria) this;
        }

        public Criteria andCarPriceEqualTo(Long value) {
            addCriterion("car_price =", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotEqualTo(Long value) {
            addCriterion("car_price <>", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThan(Long value) {
            addCriterion("car_price >", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("car_price >=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThan(Long value) {
            addCriterion("car_price <", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceLessThanOrEqualTo(Long value) {
            addCriterion("car_price <=", value, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceIn(List<Long> values) {
            addCriterion("car_price in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotIn(List<Long> values) {
            addCriterion("car_price not in", values, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceBetween(Long value1, Long value2) {
            addCriterion("car_price between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andCarPriceNotBetween(Long value1, Long value2) {
            addCriterion("car_price not between", value1, value2, "carPrice");
            return (Criteria) this;
        }

        public Criteria andSuvPriceIsNull() {
            addCriterion("suv_price is null");
            return (Criteria) this;
        }

        public Criteria andSuvPriceIsNotNull() {
            addCriterion("suv_price is not null");
            return (Criteria) this;
        }

        public Criteria andSuvPriceEqualTo(Long value) {
            addCriterion("suv_price =", value, "suvPrice");
            return (Criteria) this;
        }

        public Criteria andSuvPriceNotEqualTo(Long value) {
            addCriterion("suv_price <>", value, "suvPrice");
            return (Criteria) this;
        }

        public Criteria andSuvPriceGreaterThan(Long value) {
            addCriterion("suv_price >", value, "suvPrice");
            return (Criteria) this;
        }

        public Criteria andSuvPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("suv_price >=", value, "suvPrice");
            return (Criteria) this;
        }

        public Criteria andSuvPriceLessThan(Long value) {
            addCriterion("suv_price <", value, "suvPrice");
            return (Criteria) this;
        }

        public Criteria andSuvPriceLessThanOrEqualTo(Long value) {
            addCriterion("suv_price <=", value, "suvPrice");
            return (Criteria) this;
        }

        public Criteria andSuvPriceIn(List<Long> values) {
            addCriterion("suv_price in", values, "suvPrice");
            return (Criteria) this;
        }

        public Criteria andSuvPriceNotIn(List<Long> values) {
            addCriterion("suv_price not in", values, "suvPrice");
            return (Criteria) this;
        }

        public Criteria andSuvPriceBetween(Long value1, Long value2) {
            addCriterion("suv_price between", value1, value2, "suvPrice");
            return (Criteria) this;
        }

        public Criteria andSuvPriceNotBetween(Long value1, Long value2) {
            addCriterion("suv_price not between", value1, value2, "suvPrice");
            return (Criteria) this;
        }

        public Criteria andBusinessDescIsNull() {
            addCriterion("business_desc is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDescIsNotNull() {
            addCriterion("business_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDescEqualTo(String value) {
            addCriterion("business_desc =", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescNotEqualTo(String value) {
            addCriterion("business_desc <>", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescGreaterThan(String value) {
            addCriterion("business_desc >", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescGreaterThanOrEqualTo(String value) {
            addCriterion("business_desc >=", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescLessThan(String value) {
            addCriterion("business_desc <", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescLessThanOrEqualTo(String value) {
            addCriterion("business_desc <=", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescLike(String value) {
            addCriterion("business_desc like", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescNotLike(String value) {
            addCriterion("business_desc not like", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescIn(List<String> values) {
            addCriterion("business_desc in", values, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescNotIn(List<String> values) {
            addCriterion("business_desc not in", values, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescBetween(String value1, String value2) {
            addCriterion("business_desc between", value1, value2, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescNotBetween(String value1, String value2) {
            addCriterion("business_desc not between", value1, value2, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescIsNull() {
            addCriterion("price_desc is null");
            return (Criteria) this;
        }

        public Criteria andPriceDescIsNotNull() {
            addCriterion("price_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPriceDescEqualTo(String value) {
            addCriterion("price_desc =", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescNotEqualTo(String value) {
            addCriterion("price_desc <>", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescGreaterThan(String value) {
            addCriterion("price_desc >", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescGreaterThanOrEqualTo(String value) {
            addCriterion("price_desc >=", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescLessThan(String value) {
            addCriterion("price_desc <", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescLessThanOrEqualTo(String value) {
            addCriterion("price_desc <=", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescLike(String value) {
            addCriterion("price_desc like", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescNotLike(String value) {
            addCriterion("price_desc not like", value, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescIn(List<String> values) {
            addCriterion("price_desc in", values, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescNotIn(List<String> values) {
            addCriterion("price_desc not in", values, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescBetween(String value1, String value2) {
            addCriterion("price_desc between", value1, value2, "priceDesc");
            return (Criteria) this;
        }

        public Criteria andPriceDescNotBetween(String value1, String value2) {
            addCriterion("price_desc not between", value1, value2, "priceDesc");
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