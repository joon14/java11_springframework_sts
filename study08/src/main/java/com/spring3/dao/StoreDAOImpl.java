package com.spring3.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring3.dto.Store;

@Repository
public class StoreDAOImpl implements StoreDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Store> getStoreList() {
		return sqlSession.selectList("store.getStoreList");
	}

	@Override
	public Store getStore(int storeNum) {
		return sqlSession.selectOne("store.getStore", storeNum);
	}

	@Override
	public void insStore(Store store) {
		sqlSession.insert("store.insStore", store);		
	}

	@Override
	public void upStore(Store store) {
		sqlSession.update("store.upStore", store);	
	}

	@Override
	public void delStore(Store store) {
		sqlSession.delete("store.delStore", store);	
	}

	@Override
	public int maxNum() {
		return sqlSession.selectOne("store.maxNum");
	}
	
}
