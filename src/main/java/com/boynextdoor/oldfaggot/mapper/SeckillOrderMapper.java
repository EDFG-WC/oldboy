package com.boynextdoor.oldfaggot.mapper;

import com.boynextdoor.oldfaggot.entity.SeckillOrder;
import com.boynextdoor.oldfaggot.entity.SeckillOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeckillOrderMapper {
    int countByExample(SeckillOrderExample example);

    int deleteByExample(SeckillOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SeckillOrder record);

    int insertSelective(SeckillOrder record);

    List<SeckillOrder> selectByExample(SeckillOrderExample example);

    SeckillOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SeckillOrder record, @Param("example") SeckillOrderExample example);

    int updateByExample(@Param("record") SeckillOrder record, @Param("example") SeckillOrderExample example);

    int updateByPrimaryKeySelective(SeckillOrder record);

    int updateByPrimaryKey(SeckillOrder record);
}