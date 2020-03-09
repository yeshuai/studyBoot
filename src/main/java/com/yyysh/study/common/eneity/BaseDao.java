package com.yyysh.study.common.eneity;

import java.util.List;
import java.util.Map;

/**
* 
* @ClassName: BaseDao 
* @Description: 基础Dao(还需在XML文件里，有对应的SQL语句)
* @author Austin YE
* @date 2020年3月3日 下午6:10:59 
* 
* @param <T>
 */
public interface BaseDao<T> {

	int save(T t);
	
	int save(Map<String, Object> map);
	
	int saveBatch(List<T> list);
	
	int update(T t);
	
	int update(Map<String, Object> map);
	
	int delete(Object id);
	
	int delete(Map<String, Object> map);
	
	int deleteBatch(Object[] ids);

	T queryObject(Object id);
	
	List<T> queryList(Map<String, Object> map);

	List<T> queryListByBean(T t);

	List<T> queryList(Object id);

	int queryTotal(Map<String, Object> map);

	int queryTotal();
}
