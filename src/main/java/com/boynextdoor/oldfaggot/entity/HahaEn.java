package com.boynextdoor.oldfaggot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Auther: wangc
 * @Date: 2018/10/24 22:00
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:haha.yml")
public class HahaEn {

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
