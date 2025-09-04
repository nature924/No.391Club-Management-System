package com.entity.view;

import com.entity.HuodongShenheEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动审核
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huodong_shenhe")
public class HuodongShenheView extends HuodongShenheEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核状态的值
		*/
		private String huodongShenheYesnoValue;



		//级联表 huodong
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
				* 活动类型的值
				*/
				private String huodongValue;
			/**
			* 活动封面
			*/
			private String huodongPhoto;
			/**
			* 活动地点
			*/
			private String huodongAddress;
			/**
			* 活动详情
			*/
			private String huodongContent;

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

	public HuodongShenheView() {

	}

	public HuodongShenheView(HuodongShenheEntity huodongShenheEntity) {
		try {
			BeanUtils.copyProperties(this, huodongShenheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核状态的值
			*/
			public String getHuodongShenheYesnoValue() {
				return huodongShenheYesnoValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setHuodongShenheYesnoValue(String huodongShenheYesnoValue) {
				this.huodongShenheYesnoValue = huodongShenheYesnoValue;
			}







				//级联表的get和set huodong
					/**
					* 获取： 活动编号
					*/
					public String getHuodongUuidUnmber() {
						return huodongUuidUnmber;
					}
					/**
					* 设置： 活动编号
					*/
					public void setHuodongUuidUnmber(String huodongUuidUnmber) {
						this.huodongUuidUnmber = huodongUuidUnmber;
					}
					/**
					* 获取： 活动名称
					*/
					public String getHuodongName() {
						return huodongName;
					}
					/**
					* 设置： 活动名称
					*/
					public void setHuodongName(String huodongName) {
						this.huodongName = huodongName;
					}
					/**
					* 获取： 活动类型
					*/
					public Integer getHuodongTypes() {
						return huodongTypes;
					}
					/**
					* 设置： 活动类型
					*/
					public void setHuodongTypes(Integer huodongTypes) {
						this.huodongTypes = huodongTypes;
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
					/**
					* 获取： 活动封面
					*/
					public String getHuodongPhoto() {
						return huodongPhoto;
					}
					/**
					* 设置： 活动封面
					*/
					public void setHuodongPhoto(String huodongPhoto) {
						this.huodongPhoto = huodongPhoto;
					}

					/**
					* 获取： 活动地点
					*/
					public String getHuodongAddress() {
						return huodongAddress;
					}
					/**
					* 设置： 活动地点
					*/
					public void setHuodongAddress(String huodongAddress) {
						this.huodongAddress = huodongAddress;
					}
					/**
					* 获取： 活动详情
					*/
					public String getHuodongContent() {
						return huodongContent;
					}
					/**
					* 设置： 活动详情
					*/
					public void setHuodongContent(String huodongContent) {
						this.huodongContent = huodongContent;
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
