package com.entity.vo;

import com.entity.ShetuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 社团信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shetuan")
public class ShetuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 社团编号
     */

    @TableField(value = "shetuan_uuid_unmber")
    private String shetuanUuidUnmber;


    /**
     * 社团名称
     */

    @TableField(value = "shetuan_name")
    private String shetuanName;


    /**
     * 社团类型
     */

    @TableField(value = "shetuan_types")
    private Integer shetuanTypes;


    /**
     * 社团封面
     */

    @TableField(value = "shetuan_photo")
    private String shetuanPhoto;


    /**
     * 发布人
     */

    @TableField(value = "tuanzhang_id")
    private Integer tuanzhangId;


    /**
     * 社团地点
     */

    @TableField(value = "shetuan_address")
    private String shetuanAddress;


    /**
     * 社团详情
     */

    @TableField(value = "shetuan_content")
    private String shetuanContent;


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
	 * 设置：社团编号
	 */
    public String getShetuanUuidUnmber() {
        return shetuanUuidUnmber;
    }


    /**
	 * 获取：社团编号
	 */

    public void setShetuanUuidUnmber(String shetuanUuidUnmber) {
        this.shetuanUuidUnmber = shetuanUuidUnmber;
    }
    /**
	 * 设置：社团名称
	 */
    public String getShetuanName() {
        return shetuanName;
    }


    /**
	 * 获取：社团名称
	 */

    public void setShetuanName(String shetuanName) {
        this.shetuanName = shetuanName;
    }
    /**
	 * 设置：社团类型
	 */
    public Integer getShetuanTypes() {
        return shetuanTypes;
    }


    /**
	 * 获取：社团类型
	 */

    public void setShetuanTypes(Integer shetuanTypes) {
        this.shetuanTypes = shetuanTypes;
    }
    /**
	 * 设置：社团封面
	 */
    public String getShetuanPhoto() {
        return shetuanPhoto;
    }


    /**
	 * 获取：社团封面
	 */

    public void setShetuanPhoto(String shetuanPhoto) {
        this.shetuanPhoto = shetuanPhoto;
    }
    /**
	 * 设置：发布人
	 */
    public Integer getTuanzhangId() {
        return tuanzhangId;
    }


    /**
	 * 获取：发布人
	 */

    public void setTuanzhangId(Integer tuanzhangId) {
        this.tuanzhangId = tuanzhangId;
    }
    /**
	 * 设置：社团地点
	 */
    public String getShetuanAddress() {
        return shetuanAddress;
    }


    /**
	 * 获取：社团地点
	 */

    public void setShetuanAddress(String shetuanAddress) {
        this.shetuanAddress = shetuanAddress;
    }
    /**
	 * 设置：社团详情
	 */
    public String getShetuanContent() {
        return shetuanContent;
    }


    /**
	 * 获取：社团详情
	 */

    public void setShetuanContent(String shetuanContent) {
        this.shetuanContent = shetuanContent;
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
