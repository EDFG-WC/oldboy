package com.boynextdoor.oldfaggot.entity.params;

/**
 * @Auther: wangc
 * @Date: 2018/12/22 20:39
 * @Description:
 */
public class StatisticParam {

	private DataType dataType;
	private String value;

	public StatisticParam(DataType dataType, String value) {
		super();
		this.dataType = dataType;
		this.value = value;
	}

	public StatisticParam() {
		super();
	}

	public DataType getDataType() {
		return dataType;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "StatisticParam{" +
			"dataType=" + dataType +
			", value='" + value + '\'' +
			'}';
	}
}
