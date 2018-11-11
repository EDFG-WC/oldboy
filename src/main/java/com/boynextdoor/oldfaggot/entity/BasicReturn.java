package com.boynextdoor.oldfaggot.entity;

/**
 * @Auther: wangc
 * @Date: 2018/11/10 10:56
 * @Description: 回传json对象
 */
public class BasicReturn {

    private String errorMSG = "0";

    private Object basicData;

    public BasicReturn() {
        super();
    }

    public BasicReturn(String errorMSG, Object basicData) {
        super();
        this.errorMSG = errorMSG;
        this.basicData = basicData;
    }

    public String getErrorMSG() {
        return errorMSG;
    }

    public void setErrorMSG(String errorMSG) {
        this.errorMSG = errorMSG;
    }

    public Object getBasicData() {
        return basicData;
    }

    public void setBasicData(Object basicData) {
        this.basicData = basicData;
    }

    @Override
    public String toString() {
        return "BasicReturn{" +
            "errorMSG='" + errorMSG + '\'' +
            ", basicData=" + basicData +
            '}';
    }
}
