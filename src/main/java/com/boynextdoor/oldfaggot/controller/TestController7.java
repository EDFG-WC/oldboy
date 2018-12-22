package com.boynextdoor.oldfaggot.controller;

import com.boynextdoor.oldfaggot.entity.BasicReturn;
import com.boynextdoor.oldfaggot.entity.Cities;
import com.boynextdoor.oldfaggot.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangc
 * @Date: 2018/12/22 19:30
 * @Description:
 */
@RestController
@RequestMapping("/test7")
public class TestController7 {

	@Autowired
	private ICityService cityService;

	@RequestMapping("/getCities")
	public BasicReturn getCities() {
		BasicReturn basicReturn = new BasicReturn();
		List<Cities> allCities = cityService.findAllCities();
		basicReturn.setBasicData(allCities);
		return basicReturn;
	}
}
