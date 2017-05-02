package cn.didano.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Wx_official_account_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Wx_official_account_infoExample() {
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

        public Criteria andOfficialaccountidIsNull() {
            addCriterion("officialAccountId is null");
            return (Criteria) this;
        }

        public Criteria andOfficialaccountidIsNotNull() {
            addCriterion("officialAccountId is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialaccountidEqualTo(Long value) {
            addCriterion("officialAccountId =", value, "officialaccountid");
            return (Criteria) this;
        }

        public Criteria andOfficialaccountidNotEqualTo(Long value) {
            addCriterion("officialAccountId <>", value, "officialaccountid");
            return (Criteria) this;
        }

        public Criteria andOfficialaccountidGreaterThan(Long value) {
            addCriterion("officialAccountId >", value, "officialaccountid");
            return (Criteria) this;
        }

        public Criteria andOfficialaccountidGreaterThanOrEqualTo(Long value) {
            addCriterion("officialAccountId >=", value, "officialaccountid");
            return (Criteria) this;
        }

        public Criteria andOfficialaccountidLessThan(Long value) {
            addCriterion("officialAccountId <", value, "officialaccountid");
            return (Criteria) this;
        }

        public Criteria andOfficialaccountidLessThanOrEqualTo(Long value) {
            addCriterion("officialAccountId <=", value, "officialaccountid");
            return (Criteria) this;
        }

        public Criteria andOfficialaccountidIn(List<Long> values) {
            addCriterion("officialAccountId in", values, "officialaccountid");
            return (Criteria) this;
        }

        public Criteria andOfficialaccountidNotIn(List<Long> values) {
            addCriterion("officialAccountId not in", values, "officialaccountid");
            return (Criteria) this;
        }

        public Criteria andOfficialaccountidBetween(Long value1, Long value2) {
            addCriterion("officialAccountId between", value1, value2, "officialaccountid");
            return (Criteria) this;
        }

        public Criteria andOfficialaccountidNotBetween(Long value1, Long value2) {
            addCriterion("officialAccountId not between", value1, value2, "officialaccountid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNull() {
            addCriterion("accountType is null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNotNull() {
            addCriterion("accountType is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeEqualTo(Byte value) {
            addCriterion("accountType =", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotEqualTo(Byte value) {
            addCriterion("accountType <>", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThan(Byte value) {
            addCriterion("accountType >", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("accountType >=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThan(Byte value) {
            addCriterion("accountType <", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThanOrEqualTo(Byte value) {
            addCriterion("accountType <=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIn(List<Byte> values) {
            addCriterion("accountType in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotIn(List<Byte> values) {
            addCriterion("accountType not in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeBetween(Byte value1, Byte value2) {
            addCriterion("accountType between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("accountType not between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoIsNull() {
            addCriterion("serviceTypeInfo is null");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoIsNotNull() {
            addCriterion("serviceTypeInfo is not null");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoEqualTo(Byte value) {
            addCriterion("serviceTypeInfo =", value, "servicetypeinfo");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoNotEqualTo(Byte value) {
            addCriterion("serviceTypeInfo <>", value, "servicetypeinfo");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoGreaterThan(Byte value) {
            addCriterion("serviceTypeInfo >", value, "servicetypeinfo");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoGreaterThanOrEqualTo(Byte value) {
            addCriterion("serviceTypeInfo >=", value, "servicetypeinfo");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoLessThan(Byte value) {
            addCriterion("serviceTypeInfo <", value, "servicetypeinfo");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoLessThanOrEqualTo(Byte value) {
            addCriterion("serviceTypeInfo <=", value, "servicetypeinfo");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoIn(List<Byte> values) {
            addCriterion("serviceTypeInfo in", values, "servicetypeinfo");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoNotIn(List<Byte> values) {
            addCriterion("serviceTypeInfo not in", values, "servicetypeinfo");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoBetween(Byte value1, Byte value2) {
            addCriterion("serviceTypeInfo between", value1, value2, "servicetypeinfo");
            return (Criteria) this;
        }

        public Criteria andServicetypeinfoNotBetween(Byte value1, Byte value2) {
            addCriterion("serviceTypeInfo not between", value1, value2, "servicetypeinfo");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoIsNull() {
            addCriterion("verifyTypeInfo is null");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoIsNotNull() {
            addCriterion("verifyTypeInfo is not null");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoEqualTo(Byte value) {
            addCriterion("verifyTypeInfo =", value, "verifytypeinfo");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoNotEqualTo(Byte value) {
            addCriterion("verifyTypeInfo <>", value, "verifytypeinfo");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoGreaterThan(Byte value) {
            addCriterion("verifyTypeInfo >", value, "verifytypeinfo");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoGreaterThanOrEqualTo(Byte value) {
            addCriterion("verifyTypeInfo >=", value, "verifytypeinfo");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoLessThan(Byte value) {
            addCriterion("verifyTypeInfo <", value, "verifytypeinfo");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoLessThanOrEqualTo(Byte value) {
            addCriterion("verifyTypeInfo <=", value, "verifytypeinfo");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoIn(List<Byte> values) {
            addCriterion("verifyTypeInfo in", values, "verifytypeinfo");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoNotIn(List<Byte> values) {
            addCriterion("verifyTypeInfo not in", values, "verifytypeinfo");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoBetween(Byte value1, Byte value2) {
            addCriterion("verifyTypeInfo between", value1, value2, "verifytypeinfo");
            return (Criteria) this;
        }

        public Criteria andVerifytypeinfoNotBetween(Byte value1, Byte value2) {
            addCriterion("verifyTypeInfo not between", value1, value2, "verifytypeinfo");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickName =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickName <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickName like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickName not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickName in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNull() {
            addCriterion("appSecret is null");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNotNull() {
            addCriterion("appSecret is not null");
            return (Criteria) this;
        }

        public Criteria andAppsecretEqualTo(String value) {
            addCriterion("appSecret =", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotEqualTo(String value) {
            addCriterion("appSecret <>", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThan(String value) {
            addCriterion("appSecret >", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThanOrEqualTo(String value) {
            addCriterion("appSecret >=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThan(String value) {
            addCriterion("appSecret <", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThanOrEqualTo(String value) {
            addCriterion("appSecret <=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLike(String value) {
            addCriterion("appSecret like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotLike(String value) {
            addCriterion("appSecret not like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretIn(List<String> values) {
            addCriterion("appSecret in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotIn(List<String> values) {
            addCriterion("appSecret not in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretBetween(String value1, String value2) {
            addCriterion("appSecret between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotBetween(String value1, String value2) {
            addCriterion("appSecret not between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyIsNull() {
            addCriterion("encodingAesKey is null");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyIsNotNull() {
            addCriterion("encodingAesKey is not null");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyEqualTo(String value) {
            addCriterion("encodingAesKey =", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotEqualTo(String value) {
            addCriterion("encodingAesKey <>", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyGreaterThan(String value) {
            addCriterion("encodingAesKey >", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyGreaterThanOrEqualTo(String value) {
            addCriterion("encodingAesKey >=", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyLessThan(String value) {
            addCriterion("encodingAesKey <", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyLessThanOrEqualTo(String value) {
            addCriterion("encodingAesKey <=", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyLike(String value) {
            addCriterion("encodingAesKey like", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotLike(String value) {
            addCriterion("encodingAesKey not like", value, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyIn(List<String> values) {
            addCriterion("encodingAesKey in", values, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotIn(List<String> values) {
            addCriterion("encodingAesKey not in", values, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyBetween(String value1, String value2) {
            addCriterion("encodingAesKey between", value1, value2, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andEncodingaeskeyNotBetween(String value1, String value2) {
            addCriterion("encodingAesKey not between", value1, value2, "encodingaeskey");
            return (Criteria) this;
        }

        public Criteria andMessageurlIsNull() {
            addCriterion("messageUrl is null");
            return (Criteria) this;
        }

        public Criteria andMessageurlIsNotNull() {
            addCriterion("messageUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMessageurlEqualTo(String value) {
            addCriterion("messageUrl =", value, "messageurl");
            return (Criteria) this;
        }

        public Criteria andMessageurlNotEqualTo(String value) {
            addCriterion("messageUrl <>", value, "messageurl");
            return (Criteria) this;
        }

        public Criteria andMessageurlGreaterThan(String value) {
            addCriterion("messageUrl >", value, "messageurl");
            return (Criteria) this;
        }

        public Criteria andMessageurlGreaterThanOrEqualTo(String value) {
            addCriterion("messageUrl >=", value, "messageurl");
            return (Criteria) this;
        }

        public Criteria andMessageurlLessThan(String value) {
            addCriterion("messageUrl <", value, "messageurl");
            return (Criteria) this;
        }

        public Criteria andMessageurlLessThanOrEqualTo(String value) {
            addCriterion("messageUrl <=", value, "messageurl");
            return (Criteria) this;
        }

        public Criteria andMessageurlLike(String value) {
            addCriterion("messageUrl like", value, "messageurl");
            return (Criteria) this;
        }

        public Criteria andMessageurlNotLike(String value) {
            addCriterion("messageUrl not like", value, "messageurl");
            return (Criteria) this;
        }

        public Criteria andMessageurlIn(List<String> values) {
            addCriterion("messageUrl in", values, "messageurl");
            return (Criteria) this;
        }

        public Criteria andMessageurlNotIn(List<String> values) {
            addCriterion("messageUrl not in", values, "messageurl");
            return (Criteria) this;
        }

        public Criteria andMessageurlBetween(String value1, String value2) {
            addCriterion("messageUrl between", value1, value2, "messageurl");
            return (Criteria) this;
        }

        public Criteria andMessageurlNotBetween(String value1, String value2) {
            addCriterion("messageUrl not between", value1, value2, "messageurl");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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