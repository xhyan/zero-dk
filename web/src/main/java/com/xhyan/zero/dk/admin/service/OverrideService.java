package com.xhyan.zero.dk.admin.service;

import com.alibaba.dubbo.common.URL;
import com.xhyan.zero.dk.admin.model.Provider;

import java.util.List;

/**
 * Created by bieber on 2015/6/3.
 */
public interface OverrideService {

    public List<com.xhyan.zero.dk.admin.model.Override> listByProvider(Provider provider);

    public List<com.xhyan.zero.dk.admin.model.Override> listByServiceKey(String serviceKey);

    public void update(com.xhyan.zero.dk.admin.model.Override override);

    public com.xhyan.zero.dk.admin.model.Override getById(Long id);

    public void delete(com.xhyan.zero.dk.admin.model.Override override);

    public void delete(Long id);

    public void add(com.xhyan.zero.dk.admin.model.Override override);


    public Provider configProvider(Provider provider);

    public URL configProviderURL(Provider provider);
}
