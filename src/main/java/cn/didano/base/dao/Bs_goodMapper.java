package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Bs_good;
import cn.didano.base.model.Bs_goodExample;

public interface Bs_goodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_good
     *
     * @mbg.generated
     */
    long countByExample(Bs_goodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_good
     *
     * @mbg.generated
     */
    int deleteByExample(Bs_goodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_good
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_good
     *
     * @mbg.generated
     */
    int insert(Bs_good record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_good
     *
     * @mbg.generated
     */
    int insertSelective(Bs_good record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_good
     *
     * @mbg.generated
     */
    List<Bs_good> selectByExample(Bs_goodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_good
     *
     * @mbg.generated
     */
    Bs_good selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_good
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Bs_good record, @Param("example") Bs_goodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_good
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Bs_good record, @Param("example") Bs_goodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_good
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Bs_good record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_good
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Bs_good record);
}