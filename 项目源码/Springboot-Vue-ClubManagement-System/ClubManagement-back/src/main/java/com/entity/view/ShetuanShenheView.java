package com.entity.view;

import com.entity.ShetuanShenheEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 社团审核
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shetuan_shenhe")
public class ShetuanShenheView extends ShetuanShenheEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核状态的值
		*/
		private String shetuanShenheYesnoValue;



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

		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 学生手机号
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public ShetuanShenheView() {

	}

	public ShetuanShenheView(ShetuanShenheEntity shetuanShenheEntity) {
		try {
			BeanUtils.copyProperties(this, shetuanShenheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核状态的值
			*/
			public String getShetuanShenheYesnoValue() {
				return shetuanShenheYesnoValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setShetuanShenheYesnoValue(String shetuanShenheYesnoValue) {
				this.shetuanShenheYesnoValue = shetuanShenheYesnoValue;
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










				//级联表的get和set yonghu
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
