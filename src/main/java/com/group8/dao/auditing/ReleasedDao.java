package com.group8.dao.auditing;

import java.util.List;
import java.util.Map;

/**
 * className:ReleasedDao
 * descriptive:已发布
 * author:万中华
 * createTime:2018-12-10 13:38
 */
public interface ReleasedDao {

    /**
     * 已发布贷款列表
     * @return
     */
    List<Map> getListRelease(Map map);
}