package com.dao;

import com.entity.ShetuanShenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanShenheView;

/**
 * 社团审核 Dao 接口
 *
 * @author 
 */
public interface ShetuanShenheDao extends BaseMapper<ShetuanShenheEntity> {

   List<ShetuanShenheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
