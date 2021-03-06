package pri.simon.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.simon.bean.UserTag;
import pri.simon.bean.UserTagExample;

public interface UserTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbg.generated
     */
    long countByExample(UserTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbg.generated
     */
    int deleteByExample(UserTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer userTagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbg.generated
     */
    int insert(UserTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbg.generated
     */
    int insertSelective(UserTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbg.generated
     */
    List<UserTag> selectByExample(UserTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbg.generated
     */
    UserTag selectByPrimaryKey(Integer userTagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserTag record, @Param("example") UserTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserTag record, @Param("example") UserTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserTag record);
}