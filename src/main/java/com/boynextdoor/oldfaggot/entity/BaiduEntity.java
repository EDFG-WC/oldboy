package com.boynextdoor.oldfaggot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: wangc
 * @Date: 2018/10/24 22:00
 * @Description: 这种拿配置文件的类 切记不能写构造方法
 */
@Component
@ConfigurationProperties(prefix = "bastard")
public class BaiduEntity {

  private String name;

  private String url;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
