package com.jwt.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jwt.common.utils.PageUtils;
import com.jwt.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

