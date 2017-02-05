package cn.didano.base.model;

import java.math.BigDecimal;
import java.util.Date;

public class Bs_trade {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_trade.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_trade.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_trade.user_type
     *
     * @mbg.generated
     */
    private Byte userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_trade.order_id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_trade.created
     *
     * @mbg.generated
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_trade.channel_type
     *
     * @mbg.generated
     */
    private Byte channelType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_trade.trade_price
     *
     * @mbg.generated
     */
    private BigDecimal tradePrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_trade.fee
     *
     * @mbg.generated
     */
    private BigDecimal fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_trade.des
     *
     * @mbg.generated
     */
    private String des;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_trade.state
     *
     * @mbg.generated
     */
    private Byte state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_trade.updated
     *
     * @mbg.generated
     */
    private Date updated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_trade.id
     *
     * @return the value of bs_trade.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_trade.id
     *
     * @param id the value for bs_trade.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_trade.user_id
     *
     * @return the value of bs_trade.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_trade.user_id
     *
     * @param userId the value for bs_trade.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_trade.user_type
     *
     * @return the value of bs_trade.user_type
     *
     * @mbg.generated
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_trade.user_type
     *
     * @param userType the value for bs_trade.user_type
     *
     * @mbg.generated
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_trade.order_id
     *
     * @return the value of bs_trade.order_id
     *
     * @mbg.generated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_trade.order_id
     *
     * @param orderId the value for bs_trade.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_trade.created
     *
     * @return the value of bs_trade.created
     *
     * @mbg.generated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_trade.created
     *
     * @param created the value for bs_trade.created
     *
     * @mbg.generated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_trade.channel_type
     *
     * @return the value of bs_trade.channel_type
     *
     * @mbg.generated
     */
    public Byte getChannelType() {
        return channelType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_trade.channel_type
     *
     * @param channelType the value for bs_trade.channel_type
     *
     * @mbg.generated
     */
    public void setChannelType(Byte channelType) {
        this.channelType = channelType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_trade.trade_price
     *
     * @return the value of bs_trade.trade_price
     *
     * @mbg.generated
     */
    public BigDecimal getTradePrice() {
        return tradePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_trade.trade_price
     *
     * @param tradePrice the value for bs_trade.trade_price
     *
     * @mbg.generated
     */
    public void setTradePrice(BigDecimal tradePrice) {
        this.tradePrice = tradePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_trade.fee
     *
     * @return the value of bs_trade.fee
     *
     * @mbg.generated
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_trade.fee
     *
     * @param fee the value for bs_trade.fee
     *
     * @mbg.generated
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_trade.des
     *
     * @return the value of bs_trade.des
     *
     * @mbg.generated
     */
    public String getDes() {
        return des;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_trade.des
     *
     * @param des the value for bs_trade.des
     *
     * @mbg.generated
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_trade.state
     *
     * @return the value of bs_trade.state
     *
     * @mbg.generated
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_trade.state
     *
     * @param state the value for bs_trade.state
     *
     * @mbg.generated
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_trade.updated
     *
     * @return the value of bs_trade.updated
     *
     * @mbg.generated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_trade.updated
     *
     * @param updated the value for bs_trade.updated
     *
     * @mbg.generated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}