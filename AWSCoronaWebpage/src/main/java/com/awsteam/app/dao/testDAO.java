package com.awsteam.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.awsteam.app.dto.testDTO;

@Mapper
public interface testDAO {
	//List<testDTO> selectTest(testDTO param) throws Exception;
	List<testDTO> selectTest() throws Exception;
}
