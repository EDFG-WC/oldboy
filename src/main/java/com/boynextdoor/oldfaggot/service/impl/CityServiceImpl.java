package com.boynextdoor.oldfaggot.service.impl;

import com.boynextdoor.oldfaggot.entity.Cities;
import com.boynextdoor.oldfaggot.entity.CitiesExample;
import com.boynextdoor.oldfaggot.entity.CitiesExample.Criteria;
import com.boynextdoor.oldfaggot.entity.params.DataType;
import com.boynextdoor.oldfaggot.entity.params.StatisticParam;
import com.boynextdoor.oldfaggot.mapper.CitiesMapper;
import com.boynextdoor.oldfaggot.service.ICityService;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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

	@Override
	public List<Map<String, Object>> CitiesInStatistics(StatisticParam statisticParam) {
		CitiesExample citiesExample = new CitiesExample();
		Criteria criteria = citiesExample.createCriteria();
		List<Cities> citiesList = citiesMapper.selectByExample(citiesExample);
		DataType dataType = statisticParam.getDataType();

		//long totalCount = citiesList.stream().count();

		switch (dataType) {
			case Array:
				String[] cityIdSplit = statisticParam.getValue().split(",");
				/*long totalCount = 0;
				for (String cityId : cityIdSplit) {
					Predicate<Cities> cityIdFilter = c1 -> (cityId.equals(c1.getCityid()));
					long count = citiesList.stream().filter(cityIdFilter).count();
					totalCount += count;
				}
				System.out.println(totalCount);*/

				//long sum = citiesList.stream().mapToInt(c->(c.getCityid())).sum();

				//citiesList.stream().collect(Collectors.groupingBy())

				/*Long totalCount = Arrays.stream(cityIdSplit)
					.map(cityId -> {
						Predicate<Cities> cityIdFilter = c1 -> (cityId.equals(c1.getCityid()));
						return citiesList.stream().filter(cityIdFilter); }).
						collect(Collectors.counting());
				System.out.println(totalCount);*/

				Map<Object, Long> collect = citiesList.stream().map({cities -> cities.getCityid();cities -> cities.getCityid();}).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				System.out.println(collect);
				break;
			case All:
				break;
			case Range:
				break;
			default:
				break;
		}
		return null;
	}
}
