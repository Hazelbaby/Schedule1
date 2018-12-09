package com.schedule1.demo.service;

import com.schedule1.demo.exception.NoDayException;
import com.schedule1.demo.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public class ScheduleServiceImpl implements IScheduleService {

    @Autowired
    public WorkRepository workRepository;

    @Override
    public String getWorkByDayOfWeek(String dayOfWeek){

        if (StringUtils.isEmpty(dayOfWeek)){
            throw new NoDayException("dayOfWeek is null");}
            return workRepository.findWorksByDayOfWeek(dayOfWeek);
    }
}
