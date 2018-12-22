package com.boynextdoor.oldfaggot.service.impl;

import com.boynextdoor.oldfaggot.entity.Cities;
import com.boynextdoor.oldfaggot.entity.CitiesExample;
import com.boynextdoor.oldfaggot.entity.CitiesExample.Criteria;
import com.boynextdoor.oldfaggot.mapper.CitiesMapper;
import com.boynextdoor.oldfaggot.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: wangc
 * @Date: 2018/12/22 19:43
 * @Description:
 */
@Service
@Transactional
public class CityServiceImpl implements ICityService {

	@Autowired
	private CitiesMapper citiesMapper;

	@Override
	public List<Cities> findAllCities() {
		CitiesExample citiesExample = new CitiesExample();
		Criteria criteria = citiesExample.createCriteria();
		List<Cities> citiesList = citiesMapper.selectByExample(citiesExample);
		return citiesList;
	}
}
