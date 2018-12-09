package com.schedule1.demo.repository;


import java.util.Calendar;
import java.util.Date;

public class WorkRepository {

    public String findWorksByDayOfWeek(String dayOfWeek){

        String DailyWork="工作";
        switch (dayOfWeek){
            case "Monday":
                DailyWork="支付开会";
                break;
            case "Tuesday":
                DailyWork="网关开发";
                break;
            case "Wednesday":
                DailyWork="交易开发";
                break;
            case "Thursday":
                DailyWork="支付前置开发";
                break;
            case "Friday":
                DailyWork="支付引擎开发";
                break;
            case "Saturday":
                DailyWork="加班联调";
                break;
            case "Sunday":
                DailyWork="加班测试";
                break;
        }
        return DailyWork;
    }

    public String getdayOfWeek(Date startDate){
        String[] weekDays={"Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Saturday"};
        Calendar cal=Calendar.getInstance();
        cal.setTime(startDate);
        int x=cal.get(Calendar.DAY_OF_WEEK)-1;
        if (x<0){x=0;}
        return weekDays[x];
    }
}
