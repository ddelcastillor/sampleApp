package com.autentia.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.autentia.demo.mapper.SampleMapper;

@Repository
public class SampleRepository {

    @Autowired
    private SampleMapper sampleMapper;

    public SampleRepository(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
    }

    public String getMessageByNodo(String nodo) {
        return sampleMapper.getMessageByNodo(nodo);
    }
}
