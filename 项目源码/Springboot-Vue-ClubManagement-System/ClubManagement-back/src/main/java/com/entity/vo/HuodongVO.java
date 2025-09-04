package com.entity.vo;

import com.entity.HuodongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 活动信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("huodong")
public class HuodongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 活动编号
     */

    @TableField(value = "huodong_uuid_unmber")
    private String huodongUuidUnmber;


    /**
     * 活动名称
     */

    @TableField(value = "huodong_name")
    private String huodongName;


    /**
     * 活动类型
     */

    @TableField(value = "huodong_types")
    private Integer huodongTypes;


    /**
     * 活动封面
     */

    @TableField(value = "huodong_photo")
    private String huodongPhoto;


    /**
     * 发布社团
     */

    @TableField(value = "shetuan_id")
    private Integer shetuanId;


    /**
     * 活动地点
     */

    @TableField(value = "huodong_address")
    private String huodongAddress;


    /**
     * 活动详情
     */

    @TableField(value = "huodong_content")
    private String huodongContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：活动编号
	 */
    public String getHuodongUuidUnmber() {
        return huodongUuidUnmber;
    }


    /**
	 * 获取：活动编号
	 */

    public void setHuodongUuidUnmber(String huodongUuidUnmber) {
        this.huodongUuidUnmber = huodongUuidUnmber;
    }
    /**
	 * 设置：活动名称
	 */
    public String getHuodongName() {
        return huodongName;
    }


    /**
	 * 获取：活动名称
	 */

    public void setHuodongName(String huodongName) {
        this.huodongName = huodongName;
    }
    /**
	 * 设置：活动类型
	 */
    public Integer getHuodongTypes() {
        return huodongTypes;
    }


    /**
	 * 获取：活动类型
	 */

    public void setHuodongTypes(Integer huodongTypes) {
        this.huodongTypes = huodongTypes;
    }
    /**
	 * 设置：活动封面
	 */
    public String getHuodongPhoto() {
        return huodongPhoto;
    }


    /**
	 * 获取：活动封面
	 */

    public void setHuodongPhoto(String huodongPhoto) {
        this.huodongPhoto = huodongPhoto;
    }
    /**
	 * 设置：发布社团
	 */
    public Integer getShetuanId() {
        return shetuanId;
    }


    /**
	 * 获取：发布社团
	 */

    public void setShetuanId(Integer shetuanId) {
        this.shetuanId = shetuanId;
    }
    /**
	 * 设置：活动地点
	 */
    public String getHuodongAddress() {
        return huodongAddress;
    }


    /**
	 * 获取：活动地点
	 */

    public void setHuodongAddress(String huodongAddress) {
        this.huodongAddress = huodongAddress;
    }
    /**
	 * 设置：活动详情
	 */
    public String getHuodongContent() {
        return huodongContent;
    }


    /**
	 * 获取：活动详情
	 */

    public void setHuodongContent(String huodongContent) {
        this.huodongContent = huodongContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
