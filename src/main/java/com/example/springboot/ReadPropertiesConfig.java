package com.example.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("itss-spring")
@org.springframework.context.annotation.Configuration
public class ReadPropertiesConfig {
    private boolean enabled;
    private String name;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
