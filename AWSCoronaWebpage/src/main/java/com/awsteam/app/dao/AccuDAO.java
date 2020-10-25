package com.awsteam.app.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.awsteam.app.dto.AccuDTO;

@Mapper
public interface AccuDAO {
	AccuDTO selectAccu(long date) throws Exception;//가장 마지막
	List<AccuDTO> selectWeek(long nw,long bf) throws Exception;
}
