package com.simon.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author simon
 * @date 2020/11/17 22:50
 */
public class WebSiteFactory {

    private final Map<String, WebSite> factory = new HashMap<>();

    public WebSite getWebSiteCategory(String type) {
        if (!factory.containsKey(type)) {
            factory.put(type, new ConcreteWebSite(type));
        }
        return factory.get(type);
    }

    public int getWebCount() {
        return factory.size();
    }
}
