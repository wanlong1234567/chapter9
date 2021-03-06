package com.jd.service;

import com.jd.domain.LearnResouce;

import java.util.List;
import java.util.Map;

/**
 * @author wanlong
 * @since 2018/1/4
 */

public interface LearnService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String[] ids);
    LearnResouce queryLearnResouceById(Long learnResouce);
    List<LearnResouce> queryLearnResouceList(Map<String, Object> params);
}
