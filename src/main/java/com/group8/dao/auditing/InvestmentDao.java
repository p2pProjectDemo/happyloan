package com.group8.dao.auditing;

import java.util.List;
import java.util.Map;

/**
 * className:InvestmentDao
 * discriptoin:
 * author:丁启斌
 * createTime:2018-12-12 16:18
 */
public interface InvestmentDao {

    /**
     * 充值减少余额
     * @param map
     * @return
     */
    Integer remainingSum(Map map);

    /**
     * 投资记录
     * @param map
     * @return
     */
    Integer investmentStorage(Map map);

    /**
     * 查询目前已投的金额
     * @param tendId
     * @return
     */
    List<Map> currentlyVoted(Integer tendId);

    /**
     * 查询本标需要的钱数
     * @param tendId
     * @return
     */
    Integer totalMoney(Integer tendId);

    /**
     * 达到满标更改状态
     * @param tendId
     * @return
     */
    int updateTendStuts(Integer tendId);

    /**
     * 查询已发布表的列表
     * @return
     */
    List<Map> selectTenderingList(Map map);

    /**
     * 查询已发布表的列表数量
     * @return
     */
    Integer selectTenderingListCount(Map map);

    /**
     * 招标完成，更改状态
     * @param tendId
     * @return
     */
    int updateTendStutsToThree(Integer tendId);

    /**
     * 招标完成，给借款人打钱
     * @param map
     * @return
     */
    int beatMoneyToBorrower(Map map);

    /**
     * 流标业务
     * @return
     */
    int failToBeSoldAtAuction(Map map);

    /**
     *计算每个人投标的数目
     * @return
     */
    List<Map> everyOneMoney(Map map);

    /**
     * 流标，更改状态
     * @param tendId
     * @return
     */
    int updateTendStutsToFour(Integer tendId);


}