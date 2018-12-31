package com.boynextdoor.oldfaggot.controller;

import com.alibaba.fastjson.JSONObject;
import com.boynextdoor.oldfaggot.entity.BasicReturn;
import com.boynextdoor.oldfaggot.entity.Cities;
import com.boynextdoor.oldfaggot.entity.params.StatisticParam;
import com.boynextdoor.oldfaggot.service.ICityService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: wangc
 * @Date: 2018/12/22 19:30
 * @Description:
 */
@Controller
@RequestMapping("/test7")
public class TestController7 {

	@Autowired
	private ICityService cityService;

	@RequestMapping("/getCities")
	@ResponseBody
	public BasicReturn getCities() {
		BasicReturn basicReturn = new BasicReturn();
		List<Cities> allCities = cityService.findAllCities();
		basicReturn.setBasicData(allCities);
		return basicReturn;
	}

	@RequestMapping("/citiesInStatistics")
	@ResponseBody
	public BasicReturn getCitiesInStatistics(@RequestBody String param) {
		BasicReturn basicReturn = new BasicReturn();
		StatisticParam statisticParam = JSONObject.parseObject(param, StatisticParam.class);
		List<Map<String, Object>> mapList = cityService.CitiesInStatistics(statisticParam);
		basicReturn.setBasicData(mapList);
		return basicReturn;
	}
}
