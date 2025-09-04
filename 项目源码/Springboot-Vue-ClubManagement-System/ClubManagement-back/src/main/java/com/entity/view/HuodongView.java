package com.entity.view;

import com.entity.HuodongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huodong")
public class HuodongView extends HuodongEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 活动类型的值
		*/
		private String huodongValue;



		//级联表 shetuan
			/**
			* 社团编号
			*/
			private String shetuanUuidUnmber;
			/**
			* 社团名称
			*/
			private String shetuanName;
			/**
			* 社团类型
			*/
			private Integer shetuanTypes;
				/**
				* 社团类型的值
				*/
				private String shetuanValue;
			/**
			* 社团封面
			*/
			private String shetuanPhoto;
			/**
			* 社团信息 的 发布人
			*/
			private Integer shetuanTuanzhangId;
			/**
			* 社团地点
			*/
			private String shetuanAddress;
			/**
			* 社团详情
			*/
			private String shetuanContent;

	public HuodongView() {

	}

	public HuodongView(HuodongEntity huodongEntity) {
		try {
			BeanUtils.copyProperties(this, huodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 活动类型的值
			*/
			public String getHuodongValue() {
				return huodongValue;
			}
			/**
			* 设置： 活动类型的值
			*/
			public void setHuodongValue(String huodongValue) {
				this.huodongValue = huodongValue;
			}












				//级联表的get和set shetuan
					/**
					* 获取： 社团编号
					*/
					public String getShetuanUuidUnmber() {
						return shetuanUuidUnmber;
					}
					/**
					* 设置： 社团编号
					*/
					public void setShetuanUuidUnmber(String shetuanUuidUnmber) {
						this.shetuanUuidUnmber = shetuanUuidUnmber;
					}
					/**
					* 获取： 社团名称
					*/
					public String getShetuanName() {
						return shetuanName;
					}
					/**
					* 设置： 社团名称
					*/
					public void setShetuanName(String shetuanName) {
						this.shetuanName = shetuanName;
					}
					/**
					* 获取： 社团类型
					*/
					public Integer getShetuanTypes() {
						return shetuanTypes;
					}
					/**
					* 设置： 社团类型
					*/
					public void setShetuanTypes(Integer shetuanTypes) {
						this.shetuanTypes = shetuanTypes;
					}


						/**
						* 获取： 社团类型的值
						*/
						public String getShetuanValue() {
							return shetuanValue;
						}
						/**
						* 设置： 社团类型的值
						*/
						public void setShetuanValue(String shetuanValue) {
							this.shetuanValue = shetuanValue;
						}
					/**
					* 获取： 社团封面
					*/
					public String getShetuanPhoto() {
						return shetuanPhoto;
					}
					/**
					* 设置： 社团封面
					*/
					public void setShetuanPhoto(String shetuanPhoto) {
						this.shetuanPhoto = shetuanPhoto;
					}
					/**
					* 获取：社团信息 的 发布人
					*/
					public Integer getShetuanTuanzhangId() {
						return shetuanTuanzhangId;
					}
					/**
					* 设置：社团信息 的 发布人
					*/
					public void setShetuanTuanzhangId(Integer shetuanTuanzhangId) {
						this.shetuanTuanzhangId = shetuanTuanzhangId;
					}

					/**
					* 获取： 社团地点
					*/
					public String getShetuanAddress() {
						return shetuanAddress;
					}
					/**
					* 设置： 社团地点
					*/
					public void setShetuanAddress(String shetuanAddress) {
						this.shetuanAddress = shetuanAddress;
					}
					/**
					* 获取： 社团详情
					*/
					public String getShetuanContent() {
						return shetuanContent;
					}
					/**
					* 设置： 社团详情
					*/
					public void setShetuanContent(String shetuanContent) {
						this.shetuanContent = shetuanContent;
					}








}
