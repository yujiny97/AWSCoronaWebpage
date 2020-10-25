package com.awsteam.app.service;

import java.util.List;

import com.awsteam.app.dto.AccuDTO;

public interface CoronaService {
	public AccuDTO getDaily(long date) throws Exception;
	public List<AccuDTO> getWeekly(long date) throws Exception;
}
