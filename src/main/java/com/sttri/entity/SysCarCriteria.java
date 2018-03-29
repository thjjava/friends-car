package com.sttri.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysCarCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public SysCarCriteria() {
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

        public Criteria andCarBrandIsNull() {
            addCriterion("car_brand is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNotNull() {
            addCriterion("car_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandEqualTo(String value) {
            addCriterion("car_brand =", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotEqualTo(String value) {
            addCriterion("car_brand <>", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThan(String value) {
            addCriterion("car_brand >", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThanOrEqualTo(String value) {
            addCriterion("car_brand >=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThan(String value) {
            addCriterion("car_brand <", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThanOrEqualTo(String value) {
            addCriterion("car_brand <=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLike(String value) {
            addCriterion("car_brand like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotLike(String value) {
            addCriterion("car_brand not like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandIn(List<String> values) {
            addCriterion("car_brand in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotIn(List<String> values) {
            addCriterion("car_brand not in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandBetween(String value1, String value2) {
            addCriterion("car_brand between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotBetween(String value1, String value2) {
            addCriterion("car_brand not between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarSeriesIsNull() {
            addCriterion("car_series is null");
            return (Criteria) this;
        }

        public Criteria andCarSeriesIsNotNull() {
            addCriterion("car_series is not null");
            return (Criteria) this;
        }

        public Criteria andCarSeriesEqualTo(String value) {
            addCriterion("car_series =", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotEqualTo(String value) {
            addCriterion("car_series <>", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesGreaterThan(String value) {
            addCriterion("car_series >", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("car_series >=", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesLessThan(String value) {
            addCriterion("car_series <", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesLessThanOrEqualTo(String value) {
            addCriterion("car_series <=", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesLike(String value) {
            addCriterion("car_series like", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotLike(String value) {
            addCriterion("car_series not like", value, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesIn(List<String> values) {
            addCriterion("car_series in", values, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotIn(List<String> values) {
            addCriterion("car_series not in", values, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesBetween(String value1, String value2) {
            addCriterion("car_series between", value1, value2, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarSeriesNotBetween(String value1, String value2) {
            addCriterion("car_series not between", value1, value2, "carSeries");
            return (Criteria) this;
        }

        public Criteria andCarModelsIsNull() {
            addCriterion("car_models is null");
            return (Criteria) this;
        }

        public Criteria andCarModelsIsNotNull() {
            addCriterion("car_models is not null");
            return (Criteria) this;
        }

        public Criteria andCarModelsEqualTo(String value) {
            addCriterion("car_models =", value, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarModelsNotEqualTo(String value) {
            addCriterion("car_models <>", value, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarModelsGreaterThan(String value) {
            addCriterion("car_models >", value, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarModelsGreaterThanOrEqualTo(String value) {
            addCriterion("car_models >=", value, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarModelsLessThan(String value) {
            addCriterion("car_models <", value, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarModelsLessThanOrEqualTo(String value) {
            addCriterion("car_models <=", value, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarModelsLike(String value) {
            addCriterion("car_models like", value, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarModelsNotLike(String value) {
            addCriterion("car_models not like", value, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarModelsIn(List<String> values) {
            addCriterion("car_models in", values, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarModelsNotIn(List<String> values) {
            addCriterion("car_models not in", values, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarModelsBetween(String value1, String value2) {
            addCriterion("car_models between", value1, value2, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarModelsNotBetween(String value1, String value2) {
            addCriterion("car_models not between", value1, value2, "carModels");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionIsNull() {
            addCriterion("car_transmission is null");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionIsNotNull() {
            addCriterion("car_transmission is not null");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionEqualTo(Integer value) {
            addCriterion("car_transmission =", value, "carTransmission");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionNotEqualTo(Integer value) {
            addCriterion("car_transmission <>", value, "carTransmission");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionGreaterThan(Integer value) {
            addCriterion("car_transmission >", value, "carTransmission");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_transmission >=", value, "carTransmission");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionLessThan(Integer value) {
            addCriterion("car_transmission <", value, "carTransmission");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionLessThanOrEqualTo(Integer value) {
            addCriterion("car_transmission <=", value, "carTransmission");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionIn(List<Integer> values) {
            addCriterion("car_transmission in", values, "carTransmission");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionNotIn(List<Integer> values) {
            addCriterion("car_transmission not in", values, "carTransmission");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionBetween(Integer value1, Integer value2) {
            addCriterion("car_transmission between", value1, value2, "carTransmission");
            return (Criteria) this;
        }

        public Criteria andCarTransmissionNotBetween(Integer value1, Integer value2) {
            addCriterion("car_transmission not between", value1, value2, "carTransmission");
            return (Criteria) this;
        }

        public Criteria andCarCountryIsNull() {
            addCriterion("car_country is null");
            return (Criteria) this;
        }

        public Criteria andCarCountryIsNotNull() {
            addCriterion("car_country is not null");
            return (Criteria) this;
        }

        public Criteria andCarCountryEqualTo(String value) {
            addCriterion("car_country =", value, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarCountryNotEqualTo(String value) {
            addCriterion("car_country <>", value, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarCountryGreaterThan(String value) {
            addCriterion("car_country >", value, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarCountryGreaterThanOrEqualTo(String value) {
            addCriterion("car_country >=", value, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarCountryLessThan(String value) {
            addCriterion("car_country <", value, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarCountryLessThanOrEqualTo(String value) {
            addCriterion("car_country <=", value, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarCountryLike(String value) {
            addCriterion("car_country like", value, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarCountryNotLike(String value) {
            addCriterion("car_country not like", value, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarCountryIn(List<String> values) {
            addCriterion("car_country in", values, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarCountryNotIn(List<String> values) {
            addCriterion("car_country not in", values, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarCountryBetween(String value1, String value2) {
            addCriterion("car_country between", value1, value2, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarCountryNotBetween(String value1, String value2) {
            addCriterion("car_country not between", value1, value2, "carCountry");
            return (Criteria) this;
        }

        public Criteria andCarSeatIsNull() {
            addCriterion("car_seat is null");
            return (Criteria) this;
        }

        public Criteria andCarSeatIsNotNull() {
            addCriterion("car_seat is not null");
            return (Criteria) this;
        }

        public Criteria andCarSeatEqualTo(Integer value) {
            addCriterion("car_seat =", value, "carSeat");
            return (Criteria) this;
        }

        public Criteria andCarSeatNotEqualTo(Integer value) {
            addCriterion("car_seat <>", value, "carSeat");
            return (Criteria) this;
        }

        public Criteria andCarSeatGreaterThan(Integer value) {
            addCriterion("car_seat >", value, "carSeat");
            return (Criteria) this;
        }

        public Criteria andCarSeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_seat >=", value, "carSeat");
            return (Criteria) this;
        }

        public Criteria andCarSeatLessThan(Integer value) {
            addCriterion("car_seat <", value, "carSeat");
            return (Criteria) this;
        }

        public Criteria andCarSeatLessThanOrEqualTo(Integer value) {
            addCriterion("car_seat <=", value, "carSeat");
            return (Criteria) this;
        }

        public Criteria andCarSeatIn(List<Integer> values) {
            addCriterion("car_seat in", values, "carSeat");
            return (Criteria) this;
        }

        public Criteria andCarSeatNotIn(List<Integer> values) {
            addCriterion("car_seat not in", values, "carSeat");
            return (Criteria) this;
        }

        public Criteria andCarSeatBetween(Integer value1, Integer value2) {
            addCriterion("car_seat between", value1, value2, "carSeat");
            return (Criteria) this;
        }

        public Criteria andCarSeatNotBetween(Integer value1, Integer value2) {
            addCriterion("car_seat not between", value1, value2, "carSeat");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Integer value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Integer value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Integer value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Integer value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Integer value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Integer> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Integer> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Integer value1, Integer value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
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