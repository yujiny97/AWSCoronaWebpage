package com.awsteam.app.service;

import java.util.Date;
import java.util.List;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awsteam.app.dao.AccuDAO;
import com.awsteam.app.dto.AccuDTO;

@Service
@MapperScan(basePackages="com.awsteam.app.dao")
public class CoronaServiceImpl implements CoronaService{
	@Autowired
	private AccuDAO Accudao;
	@Override
	public AccuDTO getDaily(long date) throws Exception {
		// TODO Auto-generated method stub
		return Accudao.selectAccu(Long.toString(date));
	}
	//일주일 전부터 일주일 후까지 데이터 가져오기
	@Override
	public List<AccuDTO> getWeekly(long date) throws Exception {
		// TODO Auto-generated method stub
		return Accudao.selectWeek(Long.toString(date));
	}

}
