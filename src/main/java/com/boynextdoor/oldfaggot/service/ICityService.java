package com.boynextdoor.oldfaggot.service;

import com.boynextdoor.oldfaggot.entity.Cities;
import java.util.List;

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
}
