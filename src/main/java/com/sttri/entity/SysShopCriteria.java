package com.sttri.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysShopCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public SysShopCriteria() {
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

        public Criteria andShopNoIsNull() {
            addCriterion("shop_no is null");
            return (Criteria) this;
        }

        public Criteria andShopNoIsNotNull() {
            addCriterion("shop_no is not null");
            return (Criteria) this;
        }

        public Criteria andShopNoEqualTo(String value) {
            addCriterion("shop_no =", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotEqualTo(String value) {
            addCriterion("shop_no <>", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThan(String value) {
            addCriterion("shop_no >", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_no >=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThan(String value) {
            addCriterion("shop_no <", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThanOrEqualTo(String value) {
            addCriterion("shop_no <=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLike(String value) {
            addCriterion("shop_no like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotLike(String value) {
            addCriterion("shop_no not like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoIn(List<String> values) {
            addCriterion("shop_no in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotIn(List<String> values) {
            addCriterion("shop_no not in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoBetween(String value1, String value2) {
            addCriterion("shop_no between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotBetween(String value1, String value2) {
            addCriterion("shop_no not between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeIsNull() {
            addCriterion("business_start_time is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeIsNotNull() {
            addCriterion("business_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeEqualTo(String value) {
            addCriterion("business_start_time =", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeNotEqualTo(String value) {
            addCriterion("business_start_time <>", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeGreaterThan(String value) {
            addCriterion("business_start_time >", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("business_start_time >=", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeLessThan(String value) {
            addCriterion("business_start_time <", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeLessThanOrEqualTo(String value) {
            addCriterion("business_start_time <=", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeLike(String value) {
            addCriterion("business_start_time like", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeNotLike(String value) {
            addCriterion("business_start_time not like", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeIn(List<String> values) {
            addCriterion("business_start_time in", values, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeNotIn(List<String> values) {
            addCriterion("business_start_time not in", values, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeBetween(String value1, String value2) {
            addCriterion("business_start_time between", value1, value2, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeNotBetween(String value1, String value2) {
            addCriterion("business_start_time not between", value1, value2, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeIsNull() {
            addCriterion("business_end_time is null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeIsNotNull() {
            addCriterion("business_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeEqualTo(String value) {
            addCriterion("business_end_time =", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeNotEqualTo(String value) {
            addCriterion("business_end_time <>", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeGreaterThan(String value) {
            addCriterion("business_end_time >", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("business_end_time >=", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeLessThan(String value) {
            addCriterion("business_end_time <", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeLessThanOrEqualTo(String value) {
            addCriterion("business_end_time <=", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeLike(String value) {
            addCriterion("business_end_time like", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeNotLike(String value) {
            addCriterion("business_end_time not like", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeIn(List<String> values) {
            addCriterion("business_end_time in", values, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeNotIn(List<String> values) {
            addCriterion("business_end_time not in", values, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeBetween(String value1, String value2) {
            addCriterion("business_end_time between", value1, value2, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeNotBetween(String value1, String value2) {
            addCriterion("business_end_time not between", value1, value2, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLonIsNull() {
            addCriterion("lon is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("lon is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(String value) {
            addCriterion("lon =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(String value) {
            addCriterion("lon <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(String value) {
            addCriterion("lon >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(String value) {
            addCriterion("lon >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(String value) {
            addCriterion("lon <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(String value) {
            addCriterion("lon <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLike(String value) {
            addCriterion("lon like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotLike(String value) {
            addCriterion("lon not like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<String> values) {
            addCriterion("lon in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<String> values) {
            addCriterion("lon not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(String value1, String value2) {
            addCriterion("lon between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(String value1, String value2) {
            addCriterion("lon not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeIsNull() {
            addCriterion("shop_qrcode is null");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeIsNotNull() {
            addCriterion("shop_qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeEqualTo(String value) {
            addCriterion("shop_qrcode =", value, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeNotEqualTo(String value) {
            addCriterion("shop_qrcode <>", value, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeGreaterThan(String value) {
            addCriterion("shop_qrcode >", value, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_qrcode >=", value, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeLessThan(String value) {
            addCriterion("shop_qrcode <", value, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeLessThanOrEqualTo(String value) {
            addCriterion("shop_qrcode <=", value, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeLike(String value) {
            addCriterion("shop_qrcode like", value, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeNotLike(String value) {
            addCriterion("shop_qrcode not like", value, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeIn(List<String> values) {
            addCriterion("shop_qrcode in", values, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeNotIn(List<String> values) {
            addCriterion("shop_qrcode not in", values, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeBetween(String value1, String value2) {
            addCriterion("shop_qrcode between", value1, value2, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andShopQrcodeNotBetween(String value1, String value2) {
            addCriterion("shop_qrcode not between", value1, value2, "shopQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeIsNull() {
            addCriterion("employees_qrcode is null");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeIsNotNull() {
            addCriterion("employees_qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeEqualTo(String value) {
            addCriterion("employees_qrcode =", value, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeNotEqualTo(String value) {
            addCriterion("employees_qrcode <>", value, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeGreaterThan(String value) {
            addCriterion("employees_qrcode >", value, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("employees_qrcode >=", value, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeLessThan(String value) {
            addCriterion("employees_qrcode <", value, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeLessThanOrEqualTo(String value) {
            addCriterion("employees_qrcode <=", value, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeLike(String value) {
            addCriterion("employees_qrcode like", value, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeNotLike(String value) {
            addCriterion("employees_qrcode not like", value, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeIn(List<String> values) {
            addCriterion("employees_qrcode in", values, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeNotIn(List<String> values) {
            addCriterion("employees_qrcode not in", values, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeBetween(String value1, String value2) {
            addCriterion("employees_qrcode between", value1, value2, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andEmployeesQrcodeNotBetween(String value1, String value2) {
            addCriterion("employees_qrcode not between", value1, value2, "employeesQrcode");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andPicture1IsNull() {
            addCriterion("picture1 is null");
            return (Criteria) this;
        }

        public Criteria andPicture1IsNotNull() {
            addCriterion("picture1 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture1EqualTo(String value) {
            addCriterion("picture1 =", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1NotEqualTo(String value) {
            addCriterion("picture1 <>", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1GreaterThan(String value) {
            addCriterion("picture1 >", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1GreaterThanOrEqualTo(String value) {
            addCriterion("picture1 >=", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1LessThan(String value) {
            addCriterion("picture1 <", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1LessThanOrEqualTo(String value) {
            addCriterion("picture1 <=", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1Like(String value) {
            addCriterion("picture1 like", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1NotLike(String value) {
            addCriterion("picture1 not like", value, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1In(List<String> values) {
            addCriterion("picture1 in", values, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1NotIn(List<String> values) {
            addCriterion("picture1 not in", values, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1Between(String value1, String value2) {
            addCriterion("picture1 between", value1, value2, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture1NotBetween(String value1, String value2) {
            addCriterion("picture1 not between", value1, value2, "picture1");
            return (Criteria) this;
        }

        public Criteria andPicture2IsNull() {
            addCriterion("picture2 is null");
            return (Criteria) this;
        }

        public Criteria andPicture2IsNotNull() {
            addCriterion("picture2 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture2EqualTo(String value) {
            addCriterion("picture2 =", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotEqualTo(String value) {
            addCriterion("picture2 <>", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2GreaterThan(String value) {
            addCriterion("picture2 >", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2GreaterThanOrEqualTo(String value) {
            addCriterion("picture2 >=", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2LessThan(String value) {
            addCriterion("picture2 <", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2LessThanOrEqualTo(String value) {
            addCriterion("picture2 <=", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2Like(String value) {
            addCriterion("picture2 like", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotLike(String value) {
            addCriterion("picture2 not like", value, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2In(List<String> values) {
            addCriterion("picture2 in", values, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotIn(List<String> values) {
            addCriterion("picture2 not in", values, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2Between(String value1, String value2) {
            addCriterion("picture2 between", value1, value2, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture2NotBetween(String value1, String value2) {
            addCriterion("picture2 not between", value1, value2, "picture2");
            return (Criteria) this;
        }

        public Criteria andPicture3IsNull() {
            addCriterion("picture3 is null");
            return (Criteria) this;
        }

        public Criteria andPicture3IsNotNull() {
            addCriterion("picture3 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture3EqualTo(String value) {
            addCriterion("picture3 =", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotEqualTo(String value) {
            addCriterion("picture3 <>", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3GreaterThan(String value) {
            addCriterion("picture3 >", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3GreaterThanOrEqualTo(String value) {
            addCriterion("picture3 >=", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3LessThan(String value) {
            addCriterion("picture3 <", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3LessThanOrEqualTo(String value) {
            addCriterion("picture3 <=", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3Like(String value) {
            addCriterion("picture3 like", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotLike(String value) {
            addCriterion("picture3 not like", value, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3In(List<String> values) {
            addCriterion("picture3 in", values, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotIn(List<String> values) {
            addCriterion("picture3 not in", values, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3Between(String value1, String value2) {
            addCriterion("picture3 between", value1, value2, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture3NotBetween(String value1, String value2) {
            addCriterion("picture3 not between", value1, value2, "picture3");
            return (Criteria) this;
        }

        public Criteria andPicture4IsNull() {
            addCriterion("picture4 is null");
            return (Criteria) this;
        }

        public Criteria andPicture4IsNotNull() {
            addCriterion("picture4 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture4EqualTo(String value) {
            addCriterion("picture4 =", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4NotEqualTo(String value) {
            addCriterion("picture4 <>", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4GreaterThan(String value) {
            addCriterion("picture4 >", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4GreaterThanOrEqualTo(String value) {
            addCriterion("picture4 >=", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4LessThan(String value) {
            addCriterion("picture4 <", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4LessThanOrEqualTo(String value) {
            addCriterion("picture4 <=", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4Like(String value) {
            addCriterion("picture4 like", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4NotLike(String value) {
            addCriterion("picture4 not like", value, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4In(List<String> values) {
            addCriterion("picture4 in", values, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4NotIn(List<String> values) {
            addCriterion("picture4 not in", values, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4Between(String value1, String value2) {
            addCriterion("picture4 between", value1, value2, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture4NotBetween(String value1, String value2) {
            addCriterion("picture4 not between", value1, value2, "picture4");
            return (Criteria) this;
        }

        public Criteria andPicture5IsNull() {
            addCriterion("picture5 is null");
            return (Criteria) this;
        }

        public Criteria andPicture5IsNotNull() {
            addCriterion("picture5 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture5EqualTo(String value) {
            addCriterion("picture5 =", value, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture5NotEqualTo(String value) {
            addCriterion("picture5 <>", value, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture5GreaterThan(String value) {
            addCriterion("picture5 >", value, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture5GreaterThanOrEqualTo(String value) {
            addCriterion("picture5 >=", value, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture5LessThan(String value) {
            addCriterion("picture5 <", value, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture5LessThanOrEqualTo(String value) {
            addCriterion("picture5 <=", value, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture5Like(String value) {
            addCriterion("picture5 like", value, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture5NotLike(String value) {
            addCriterion("picture5 not like", value, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture5In(List<String> values) {
            addCriterion("picture5 in", values, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture5NotIn(List<String> values) {
            addCriterion("picture5 not in", values, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture5Between(String value1, String value2) {
            addCriterion("picture5 between", value1, value2, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture5NotBetween(String value1, String value2) {
            addCriterion("picture5 not between", value1, value2, "picture5");
            return (Criteria) this;
        }

        public Criteria andPicture6IsNull() {
            addCriterion("picture6 is null");
            return (Criteria) this;
        }

        public Criteria andPicture6IsNotNull() {
            addCriterion("picture6 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture6EqualTo(String value) {
            addCriterion("picture6 =", value, "picture6");
            return (Criteria) this;
        }

        public Criteria andPicture6NotEqualTo(String value) {
            addCriterion("picture6 <>", value, "picture6");
            return (Criteria) this;
        }

        public Criteria andPicture6GreaterThan(String value) {
            addCriterion("picture6 >", value, "picture6");
            return (Criteria) this;
        }

        public Criteria andPicture6GreaterThanOrEqualTo(String value) {
            addCriterion("picture6 >=", value, "picture6");
            return (Criteria) this;
        }

        public Criteria andPicture6LessThan(String value) {
            addCriterion("picture6 <", value, "picture6");
            return (Criteria) this;
        }

        public Criteria andPicture6LessThanOrEqualTo(String value) {
            addCriterion("picture6 <=", value, "picture6");
            return (Criteria) this;
        }

        public Criteria andPicture6Like(String value) {
            addCriterion("picture6 like", value, "picture6");
            return (Criteria) this;
        }

        public Criteria andPicture6NotLike(String value) {
            addCriterion("picture6 not like", value, "picture6");
            return (Criteria) this;
        }

        public Criteria andPicture6In(List<String> values) {
            addCriterion("picture6 in", values, "picture6");
            return (Criteria) this;
        }

        public Criteria andPicture6NotIn(List<String> values) {
            addCriterion("picture6 not in", values, "picture6");
            return (Criteria) this;
        }

        public Criteria andPicture6Between(String value1, String value2) {
            addCriterion("picture6 between", value1, value2, "picture6");
            return (Criteria) this;
        }

        public Criteria andPicture6NotBetween(String value1, String value2) {
            addCriterion("picture6 not between", value1, value2, "picture6");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterion("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterion("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterion("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterion("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterion("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterion("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterion("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("register_date not between", value1, value2, "registerDate");
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