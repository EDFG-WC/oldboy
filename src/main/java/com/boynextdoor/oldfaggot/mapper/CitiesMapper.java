package com.boynextdoor.oldfaggot.mapper;

import com.boynextdoor.oldfaggot.entity.Cities;
import com.boynextdoor.oldfaggot.entity.CitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CitiesMapper {

	int countByExample(CitiesExample example);

	int deleteByExample(CitiesExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Cities record);

	int insertSelective(Cities record);

	List<Cities> selectByExample(CitiesExample example);

	Cities selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Cities record,
			@Param("example") CitiesExample example);

	int updateByExample(@Param("record") Cities record, @Param("example") CitiesExample example);

	int updateByPrimaryKeySelective(Cities record);

	int updateByPrimaryKey(Cities record);
}