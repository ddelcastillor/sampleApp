package com.autentia.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SampleMapper {

    String getMessageByNodo(@Param("nodo") String nodo);

}
