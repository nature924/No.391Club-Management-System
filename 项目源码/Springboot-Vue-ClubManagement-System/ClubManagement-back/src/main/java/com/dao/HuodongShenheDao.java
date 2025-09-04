package com.dao;

import com.entity.HuodongShenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongShenheView;

/**
 * 活动审核 Dao 接口
 *
 * @author 
 */
public interface HuodongShenheDao extends BaseMapper<HuodongShenheEntity> {

   List<HuodongShenheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
