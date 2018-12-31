package com.boynextdoor.oldfaggot.service;

import com.boynextdoor.oldfaggot.entity.Cities;
import com.boynextdoor.oldfaggot.entity.params.StatisticParam;
import java.util.List;
import java.util.Map;

/**
 * @Auther: wangc
 * @Date: 2018/12/22 19:40
 * @Description:
 */
public interface ICityService {
	/**
	 * @Description: 查询城市列表
	 * @param:
	 * @return: List<Cities>
	 * @auther: wangc
	 * @date: 2018/12/22 19:41
	 */
	public List<Cities> findAllCities();

	/**
	 * @Description: TODO 用lambda表达式来进行优化过滤结果
	 * @param:
	 * @return:
	 * @auther: wangc
	 * @date: 2018/12/22 20:56
	 */
	public List<Map<String, Object>> CitiesInStatistics(StatisticParam statisticParam);
}
