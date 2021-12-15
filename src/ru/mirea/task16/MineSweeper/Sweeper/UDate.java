package ru.mirea.task16.MineSweeper.Sweeper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class UDate
{
    Date date = null;

    private  final  String  TIMEZONE_msc    = "Europe/Moscow";
    private  final  String  DATETIME_format = "yyyy-MM-dd HH:mm:ss.SS";
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public UDate()
    {
        date = new Date();
        TimeZone tm_msk = TimeZone.getTimeZone(TIMEZONE_msc);
        DateFormat df_msk = new SimpleDateFormat(DATETIME_format);
        df_msk.setTimeZone(tm_msk);
        String date_msk = df_msk.format(date);
        System.out.println (date_msk);
    }
}
