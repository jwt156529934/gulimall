package com.jwt.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jwt.common.utils.PageUtils;
import com.jwt.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-08 09:59:40
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

