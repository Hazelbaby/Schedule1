package com.schedule1.demo.controllor;

import com.schedule1.demo.exception.NoBusinessException;
import com.schedule1.demo.exception.NoDayException;
import com.schedule1.demo.service.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;

public class ScheduleController {
    @Autowired
    public IScheduleService scheduleService;


    public ResponseEntity getWorks(@RequestParam("dayOfWeek")String dayOfWeek){
        if (StringUtils.isEmpty(dayOfWeek)){
            throw new NoDayException("dayOfWeek is null!");
        }
        String work=scheduleService.getWorkByDayOfWeek(dayOfWeek);
        if (null==work){
            throw new NoBusinessException("No Work!!!");
        }
        return ResponseEntity.ok(work);
    }
}
