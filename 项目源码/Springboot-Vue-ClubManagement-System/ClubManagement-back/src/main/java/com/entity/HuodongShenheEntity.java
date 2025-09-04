package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 活动审核
 *
 * @author 
 * @email
 */
@TableName("huodong_shenhe")
public class HuodongShenheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuodongShenheEntity() {

	}

	public HuodongShenheEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 活动
     */
    @TableField(value = "huodong_id")

    private Integer huodongId;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 审核状态
     */
    @TableField(value = "huodong_shenhe_yesno_types")

    private Integer huodongShenheYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "huodong_text")

    private String huodongText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：活动
	 */
    public Integer getHuodongId() {
        return huodongId;
    }


    /**
	 * 获取：活动
	 */

    public void setHuodongId(Integer huodongId) {
        this.huodongId = huodongId;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getHuodongShenheYesnoTypes() {
        return huodongShenheYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setHuodongShenheYesnoTypes(Integer huodongShenheYesnoTypes) {
        this.huodongShenheYesnoTypes = huodongShenheYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getHuodongText() {
        return huodongText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setHuodongText(String huodongText) {
        this.huodongText = huodongText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "HuodongShenhe{" +
            "id=" + id +
            ", huodongId=" + huodongId +
            ", yonghuId=" + yonghuId +
            ", huodongShenheYesnoTypes=" + huodongShenheYesnoTypes +
            ", huodongText=" + huodongText +
            ", createTime=" + createTime +
        "}";
    }
}
