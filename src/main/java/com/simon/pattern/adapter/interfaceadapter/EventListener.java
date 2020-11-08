package com.simon.pattern.adapter.interfaceadapter;

/**
 * @author simon
 * @date 2020/11/8 17:38
 */
public interface EventListener {

    public void contentStart();

    public void contentRefreshed();

    public void contentClosed();
}
