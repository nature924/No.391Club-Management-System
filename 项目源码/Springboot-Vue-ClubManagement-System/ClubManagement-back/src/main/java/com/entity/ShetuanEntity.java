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
 * 社团信息
 *
 * @author 
 * @email
 */
@TableName("shetuan")
public class ShetuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShetuanEntity() {

	}

	public ShetuanEntity(T t) {
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
        return "Shetuan{" +
            "id=" + id +
            ", shetuanUuidUnmber=" + shetuanUuidUnmber +
            ", shetuanName=" + shetuanName +
            ", shetuanTypes=" + shetuanTypes +
            ", shetuanPhoto=" + shetuanPhoto +
            ", tuanzhangId=" + tuanzhangId +
            ", shetuanAddress=" + shetuanAddress +
            ", shetuanContent=" + shetuanContent +
            ", createTime=" + createTime +
        "}";
    }
}
