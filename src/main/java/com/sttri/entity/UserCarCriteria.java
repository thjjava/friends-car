package com.sttri.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCarCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitSize;

    public UserCarCriteria() {
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

        public Criteria andCarVinIsNull() {
            addCriterion("car_vin is null");
            return (Criteria) this;
        }

        public Criteria andCarVinIsNotNull() {
            addCriterion("car_vin is not null");
            return (Criteria) this;
        }

        public Criteria andCarVinEqualTo(String value) {
            addCriterion("car_vin =", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotEqualTo(String value) {
            addCriterion("car_vin <>", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinGreaterThan(String value) {
            addCriterion("car_vin >", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinGreaterThanOrEqualTo(String value) {
            addCriterion("car_vin >=", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinLessThan(String value) {
            addCriterion("car_vin <", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinLessThanOrEqualTo(String value) {
            addCriterion("car_vin <=", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinLike(String value) {
            addCriterion("car_vin like", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotLike(String value) {
            addCriterion("car_vin not like", value, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinIn(List<String> values) {
            addCriterion("car_vin in", values, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotIn(List<String> values) {
            addCriterion("car_vin not in", values, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinBetween(String value1, String value2) {
            addCriterion("car_vin between", value1, value2, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarVinNotBetween(String value1, String value2) {
            addCriterion("car_vin not between", value1, value2, "carVin");
            return (Criteria) this;
        }

        public Criteria andCarEngineIsNull() {
            addCriterion("car_engine is null");
            return (Criteria) this;
        }

        public Criteria andCarEngineIsNotNull() {
            addCriterion("car_engine is not null");
            return (Criteria) this;
        }

        public Criteria andCarEngineEqualTo(String value) {
            addCriterion("car_engine =", value, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarEngineNotEqualTo(String value) {
            addCriterion("car_engine <>", value, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarEngineGreaterThan(String value) {
            addCriterion("car_engine >", value, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarEngineGreaterThanOrEqualTo(String value) {
            addCriterion("car_engine >=", value, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarEngineLessThan(String value) {
            addCriterion("car_engine <", value, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarEngineLessThanOrEqualTo(String value) {
            addCriterion("car_engine <=", value, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarEngineLike(String value) {
            addCriterion("car_engine like", value, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarEngineNotLike(String value) {
            addCriterion("car_engine not like", value, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarEngineIn(List<String> values) {
            addCriterion("car_engine in", values, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarEngineNotIn(List<String> values) {
            addCriterion("car_engine not in", values, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarEngineBetween(String value1, String value2) {
            addCriterion("car_engine between", value1, value2, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarEngineNotBetween(String value1, String value2) {
            addCriterion("car_engine not between", value1, value2, "carEngine");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeIsNull() {
            addCriterion("car_buy_time is null");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeIsNotNull() {
            addCriterion("car_buy_time is not null");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeEqualTo(String value) {
            addCriterion("car_buy_time =", value, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeNotEqualTo(String value) {
            addCriterion("car_buy_time <>", value, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeGreaterThan(String value) {
            addCriterion("car_buy_time >", value, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("car_buy_time >=", value, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeLessThan(String value) {
            addCriterion("car_buy_time <", value, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeLessThanOrEqualTo(String value) {
            addCriterion("car_buy_time <=", value, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeLike(String value) {
            addCriterion("car_buy_time like", value, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeNotLike(String value) {
            addCriterion("car_buy_time not like", value, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeIn(List<String> values) {
            addCriterion("car_buy_time in", values, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeNotIn(List<String> values) {
            addCriterion("car_buy_time not in", values, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeBetween(String value1, String value2) {
            addCriterion("car_buy_time between", value1, value2, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarBuyTimeNotBetween(String value1, String value2) {
            addCriterion("car_buy_time not between", value1, value2, "carBuyTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeIsNull() {
            addCriterion("car_last_maintenance_time is null");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeIsNotNull() {
            addCriterion("car_last_maintenance_time is not null");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeEqualTo(String value) {
            addCriterion("car_last_maintenance_time =", value, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeNotEqualTo(String value) {
            addCriterion("car_last_maintenance_time <>", value, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeGreaterThan(String value) {
            addCriterion("car_last_maintenance_time >", value, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("car_last_maintenance_time >=", value, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeLessThan(String value) {
            addCriterion("car_last_maintenance_time <", value, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeLessThanOrEqualTo(String value) {
            addCriterion("car_last_maintenance_time <=", value, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeLike(String value) {
            addCriterion("car_last_maintenance_time like", value, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeNotLike(String value) {
            addCriterion("car_last_maintenance_time not like", value, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeIn(List<String> values) {
            addCriterion("car_last_maintenance_time in", values, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeNotIn(List<String> values) {
            addCriterion("car_last_maintenance_time not in", values, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeBetween(String value1, String value2) {
            addCriterion("car_last_maintenance_time between", value1, value2, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceTimeNotBetween(String value1, String value2) {
            addCriterion("car_last_maintenance_time not between", value1, value2, "carLastMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageIsNull() {
            addCriterion("car_last_maintenance_mileage is null");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageIsNotNull() {
            addCriterion("car_last_maintenance_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageEqualTo(String value) {
            addCriterion("car_last_maintenance_mileage =", value, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageNotEqualTo(String value) {
            addCriterion("car_last_maintenance_mileage <>", value, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageGreaterThan(String value) {
            addCriterion("car_last_maintenance_mileage >", value, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageGreaterThanOrEqualTo(String value) {
            addCriterion("car_last_maintenance_mileage >=", value, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageLessThan(String value) {
            addCriterion("car_last_maintenance_mileage <", value, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageLessThanOrEqualTo(String value) {
            addCriterion("car_last_maintenance_mileage <=", value, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageLike(String value) {
            addCriterion("car_last_maintenance_mileage like", value, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageNotLike(String value) {
            addCriterion("car_last_maintenance_mileage not like", value, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageIn(List<String> values) {
            addCriterion("car_last_maintenance_mileage in", values, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageNotIn(List<String> values) {
            addCriterion("car_last_maintenance_mileage not in", values, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageBetween(String value1, String value2) {
            addCriterion("car_last_maintenance_mileage between", value1, value2, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarLastMaintenanceMileageNotBetween(String value1, String value2) {
            addCriterion("car_last_maintenance_mileage not between", value1, value2, "carLastMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeIsNull() {
            addCriterion("car_insurance_time is null");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeIsNotNull() {
            addCriterion("car_insurance_time is not null");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeEqualTo(String value) {
            addCriterion("car_insurance_time =", value, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeNotEqualTo(String value) {
            addCriterion("car_insurance_time <>", value, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeGreaterThan(String value) {
            addCriterion("car_insurance_time >", value, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("car_insurance_time >=", value, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeLessThan(String value) {
            addCriterion("car_insurance_time <", value, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeLessThanOrEqualTo(String value) {
            addCriterion("car_insurance_time <=", value, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeLike(String value) {
            addCriterion("car_insurance_time like", value, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeNotLike(String value) {
            addCriterion("car_insurance_time not like", value, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeIn(List<String> values) {
            addCriterion("car_insurance_time in", values, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeNotIn(List<String> values) {
            addCriterion("car_insurance_time not in", values, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeBetween(String value1, String value2) {
            addCriterion("car_insurance_time between", value1, value2, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceTimeNotBetween(String value1, String value2) {
            addCriterion("car_insurance_time not between", value1, value2, "carInsuranceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeIsNull() {
            addCriterion("car_next_maintenance_time is null");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeIsNotNull() {
            addCriterion("car_next_maintenance_time is not null");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeEqualTo(String value) {
            addCriterion("car_next_maintenance_time =", value, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeNotEqualTo(String value) {
            addCriterion("car_next_maintenance_time <>", value, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeGreaterThan(String value) {
            addCriterion("car_next_maintenance_time >", value, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("car_next_maintenance_time >=", value, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeLessThan(String value) {
            addCriterion("car_next_maintenance_time <", value, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeLessThanOrEqualTo(String value) {
            addCriterion("car_next_maintenance_time <=", value, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeLike(String value) {
            addCriterion("car_next_maintenance_time like", value, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeNotLike(String value) {
            addCriterion("car_next_maintenance_time not like", value, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeIn(List<String> values) {
            addCriterion("car_next_maintenance_time in", values, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeNotIn(List<String> values) {
            addCriterion("car_next_maintenance_time not in", values, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeBetween(String value1, String value2) {
            addCriterion("car_next_maintenance_time between", value1, value2, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceTimeNotBetween(String value1, String value2) {
            addCriterion("car_next_maintenance_time not between", value1, value2, "carNextMaintenanceTime");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageIsNull() {
            addCriterion("car_next_maintenance_mileage is null");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageIsNotNull() {
            addCriterion("car_next_maintenance_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageEqualTo(String value) {
            addCriterion("car_next_maintenance_mileage =", value, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageNotEqualTo(String value) {
            addCriterion("car_next_maintenance_mileage <>", value, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageGreaterThan(String value) {
            addCriterion("car_next_maintenance_mileage >", value, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageGreaterThanOrEqualTo(String value) {
            addCriterion("car_next_maintenance_mileage >=", value, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageLessThan(String value) {
            addCriterion("car_next_maintenance_mileage <", value, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageLessThanOrEqualTo(String value) {
            addCriterion("car_next_maintenance_mileage <=", value, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageLike(String value) {
            addCriterion("car_next_maintenance_mileage like", value, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageNotLike(String value) {
            addCriterion("car_next_maintenance_mileage not like", value, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageIn(List<String> values) {
            addCriterion("car_next_maintenance_mileage in", values, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageNotIn(List<String> values) {
            addCriterion("car_next_maintenance_mileage not in", values, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageBetween(String value1, String value2) {
            addCriterion("car_next_maintenance_mileage between", value1, value2, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarNextMaintenanceMileageNotBetween(String value1, String value2) {
            addCriterion("car_next_maintenance_mileage not between", value1, value2, "carNextMaintenanceMileage");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeIsNull() {
            addCriterion("car_annual_time is null");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeIsNotNull() {
            addCriterion("car_annual_time is not null");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeEqualTo(String value) {
            addCriterion("car_annual_time =", value, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeNotEqualTo(String value) {
            addCriterion("car_annual_time <>", value, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeGreaterThan(String value) {
            addCriterion("car_annual_time >", value, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeGreaterThanOrEqualTo(String value) {
            addCriterion("car_annual_time >=", value, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeLessThan(String value) {
            addCriterion("car_annual_time <", value, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeLessThanOrEqualTo(String value) {
            addCriterion("car_annual_time <=", value, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeLike(String value) {
            addCriterion("car_annual_time like", value, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeNotLike(String value) {
            addCriterion("car_annual_time not like", value, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeIn(List<String> values) {
            addCriterion("car_annual_time in", values, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeNotIn(List<String> values) {
            addCriterion("car_annual_time not in", values, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeBetween(String value1, String value2) {
            addCriterion("car_annual_time between", value1, value2, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarAnnualTimeNotBetween(String value1, String value2) {
            addCriterion("car_annual_time not between", value1, value2, "carAnnualTime");
            return (Criteria) this;
        }

        public Criteria andCarIllegalIsNull() {
            addCriterion("car_illegal is null");
            return (Criteria) this;
        }

        public Criteria andCarIllegalIsNotNull() {
            addCriterion("car_illegal is not null");
            return (Criteria) this;
        }

        public Criteria andCarIllegalEqualTo(String value) {
            addCriterion("car_illegal =", value, "carIllegal");
            return (Criteria) this;
        }

        public Criteria andCarIllegalNotEqualTo(String value) {
            addCriterion("car_illegal <>", value, "carIllegal");
            return (Criteria) this;
        }

        public Criteria andCarIllegalGreaterThan(String value) {
            addCriterion("car_illegal >", value, "carIllegal");
            return (Criteria) this;
        }

        public Criteria andCarIllegalGreaterThanOrEqualTo(String value) {
            addCriterion("car_illegal >=", value, "carIllegal");
            return (Criteria) this;
        }

        public Criteria andCarIllegalLessThan(String value) {
            addCriterion("car_illegal <", value, "carIllegal");
            return (Criteria) this;
        }

        public Criteria andCarIllegalLessThanOrEqualTo(String value) {
            addCriterion("car_illegal <=", value, "carIllegal");
            return (Criteria) this;
        }

        public Criteria andCarIllegalLike(String value) {
            addCriterion("car_illegal like", value, "carIllegal");
            return (Criteria) this;
        }

        public Criteria andCarIllegalNotLike(String value) {
            addCriterion("car_illegal not like", value, "carIllegal");
            return (Criteria) this;
        }

        public Criteria andCarIllegalIn(List<String> values) {
            addCriterion("car_illegal in", values, "carIllegal");
            return (Criteria) this;
        }

        public Criteria andCarIllegalNotIn(List<String> values) {
            addCriterion("car_illegal not in", values, "carIllegal");
            return (Criteria) this;
        }

        public Criteria andCarIllegalBetween(String value1, String value2) {
            addCriterion("car_illegal between", value1, value2, "carIllegal");
            return (Criteria) this;
        }

        public Criteria andCarIllegalNotBetween(String value1, String value2) {
            addCriterion("car_illegal not between", value1, value2, "carIllegal");
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