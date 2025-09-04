package com.entity.model;

import com.entity.HuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 活动信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuodongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 活动编号
     */
    private String huodongUuidUnmber;


    /**
     * 活动名称
     */
    private String huodongName;


    /**
     * 活动类型
     */
    private Integer huodongTypes;


    /**
     * 活动封面
     */
    private String huodongPhoto;


    /**
     * 发布社团
     */
    private Integer shetuanId;


    /**
     * 活动地点
     */
    private String huodongAddress;


    /**
     * 活动详情
     */
    private String huodongContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：活动编号
	 */
    public String getHuodongUuidUnmber() {
        return huodongUuidUnmber;
    }


    /**
	 * 设置：活动编号
	 */
    public void setHuodongUuidUnmber(String huodongUuidUnmber) {
        this.huodongUuidUnmber = huodongUuidUnmber;
    }
    /**
	 * 获取：活动名称
	 */
    public String getHuodongName() {
        return huodongName;
    }


    /**
	 * 设置：活动名称
	 */
    public void setHuodongName(String huodongName) {
        this.huodongName = huodongName;
    }
    /**
	 * 获取：活动类型
	 */
    public Integer getHuodongTypes() {
        return huodongTypes;
    }


    /**
	 * 设置：活动类型
	 */
    public void setHuodongTypes(Integer huodongTypes) {
        this.huodongTypes = huodongTypes;
    }
    /**
	 * 获取：活动封面
	 */
    public String getHuodongPhoto() {
        return huodongPhoto;
    }


    /**
	 * 设置：活动封面
	 */
    public void setHuodongPhoto(String huodongPhoto) {
        this.huodongPhoto = huodongPhoto;
    }
    /**
	 * 获取：发布社团
	 */
    public Integer getShetuanId() {
        return shetuanId;
    }


    /**
	 * 设置：发布社团
	 */
    public void setShetuanId(Integer shetuanId) {
        this.shetuanId = shetuanId;
    }
    /**
	 * 获取：活动地点
	 */
    public String getHuodongAddress() {
        return huodongAddress;
    }


    /**
	 * 设置：活动地点
	 */
    public void setHuodongAddress(String huodongAddress) {
        this.huodongAddress = huodongAddress;
    }
    /**
	 * 获取：活动详情
	 */
    public String getHuodongContent() {
        return huodongContent;
    }


    /**
	 * 设置：活动详情
	 */
    public void setHuodongContent(String huodongContent) {
        this.huodongContent = huodongContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
