package com.entity.vo;

import com.entity.ShetuanShenheEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 社团审核
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shetuan_shenhe")
public class ShetuanShenheVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 社团
     */

    @TableField(value = "shetuan_id")
    private Integer shetuanId;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 审核状态
     */

    @TableField(value = "shetuan_shenhe_yesno_types")
    private Integer shetuanShenheYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "shetuan_text")
    private String shetuanText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：社团
	 */
    public Integer getShetuanId() {
        return shetuanId;
    }


    /**
	 * 获取：社团
	 */

    public void setShetuanId(Integer shetuanId) {
        this.shetuanId = shetuanId;
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
    public Integer getShetuanShenheYesnoTypes() {
        return shetuanShenheYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setShetuanShenheYesnoTypes(Integer shetuanShenheYesnoTypes) {
        this.shetuanShenheYesnoTypes = shetuanShenheYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getShetuanText() {
        return shetuanText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setShetuanText(String shetuanText) {
        this.shetuanText = shetuanText;
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

}
