package com.boynextdoor.oldfaggot.mapper;

import com.boynextdoor.oldfaggot.entity.Item;
import com.boynextdoor.oldfaggot.entity.ItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemMapper {

	int countByExample(ItemExample example);

	int deleteByExample(ItemExample example);

	int deleteByPrimaryKey(Long id);

	int insert(Item record);

	int insertSelective(Item record);

	List<Item> selectByExample(ItemExample example);

	Item selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") Item record,
			@Param("example") ItemExample example);

	int updateByExample(@Param("record") Item record, @Param("example") ItemExample example);

	int updateByPrimaryKeySelective(Item record);

	int updateByPrimaryKey(Item record);
}