package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongShenheEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 活动审核 服务类
 */
public interface HuodongShenheService extends IService<HuodongShenheEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}