package com.boynextdoor.oldfaggot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Auther: wangc
 * @Date: 2018/10/24 21:23
 * @Description: 一开始是打算弄一个yml文件来读取的, 但好像失败了
 */
@Component
@PropertySource("classpath:bean.properties")
@ConfigurationProperties(prefix = "bean")
public class TestEntity {

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
