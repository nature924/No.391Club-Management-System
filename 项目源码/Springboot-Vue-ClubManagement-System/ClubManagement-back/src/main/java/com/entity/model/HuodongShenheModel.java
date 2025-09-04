package com.entity.model;

import com.entity.HuodongShenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 活动审核
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuodongShenheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 活动
     */
    private Integer huodongId;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 审核状态
     */
    private Integer huodongShenheYesnoTypes;


    /**
     * 审核意见
     */
    private String huodongText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：活动
	 */
    public Integer getHuodongId() {
        return huodongId;
    }


    /**
	 * 设置：活动
	 */
    public void setHuodongId(Integer huodongId) {
        this.huodongId = huodongId;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getHuodongShenheYesnoTypes() {
        return huodongShenheYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setHuodongShenheYesnoTypes(Integer huodongShenheYesnoTypes) {
        this.huodongShenheYesnoTypes = huodongShenheYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getHuodongText() {
        return huodongText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setHuodongText(String huodongText) {
        this.huodongText = huodongText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
