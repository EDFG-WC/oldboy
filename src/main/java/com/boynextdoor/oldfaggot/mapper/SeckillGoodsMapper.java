package com.boynextdoor.oldfaggot.mapper;

import com.boynextdoor.oldfaggot.entity.SeckillGoods;
import com.boynextdoor.oldfaggot.entity.SeckillGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeckillGoodsMapper {

	int countByExample(SeckillGoodsExample example);

	int deleteByExample(SeckillGoodsExample example);

	int deleteByPrimaryKey(Long id);

	int insert(SeckillGoods record);

	int insertSelective(SeckillGoods record);

	List<SeckillGoods> selectByExample(SeckillGoodsExample example);

	SeckillGoods selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") SeckillGoods record,
			@Param("example") SeckillGoodsExample example);

	int updateByExample(@Param("record") SeckillGoods record,
			@Param("example") SeckillGoodsExample example);

	int updateByPrimaryKeySelective(SeckillGoods record);

	int updateByPrimaryKey(SeckillGoods record);
}