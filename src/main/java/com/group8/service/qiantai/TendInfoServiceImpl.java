package com.group8.service.qiantai;

import com.group8.dao.qiantai.QtDao;
import com.group8.dao.qiantai.TendInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * className:TendInfoServiceImpl
 * descriptive:
 * author:荣恒
 * createTime:2018/12/14 17:03
 */

@Service
public class TendInfoServiceImpl implements TendInfoService {
    @Autowired
    private TendInfoDao tendInfoDao;

    @Override
    public List<Map> getLoanList(Map tendid) {

        List<Map> loanList = tendInfoDao.getLoanList(tendid);
        //System.out.println("--------------------"+loanList);

        return loanList;
    }

    @Override
    public List<Map> getLoanInfo(Map tendid) {
        return tendInfoDao.getLoanInfo(tendid);
    }

    @Override
    public List<Map> getGaveList(Map map) {

        List<Map> gaveList = tendInfoDao.getGaveList(map);
        return gaveList;
    }

	@Override
	public Integer getGaveCount(Integer tendid) {
		return tendInfoDao.getGaveCount(tendid);
	}

	@Override
	public Integer updateEmail(Map map) {
		return tendInfoDao.updateEmail(map);
	}

}
