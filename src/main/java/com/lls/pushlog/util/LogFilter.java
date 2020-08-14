package com.lls.pushlog.util;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;
import com.lls.pushlog.entity.LoggerMessage;
import com.lls.pushlog.entity.LoggerQueue;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.Date;

/**
 * @Description TODO
 * @author: leijun
 * @date: LogFilter
 */
@Service
public class LogFilter extends Filter<ILoggingEvent> {
    //获取logback的日志，塞入日志队列中
    @Override
    public FilterReply decide(ILoggingEvent event) {
        String exception = "";
        IThrowableProxy iThrowableProxy1 = event.getThrowableProxy();
        //System.out.println("iThrowableProxy1===="+iThrowableProxy1);
        if(iThrowableProxy1!=null){
            exception = "<span class='excehtext'>"+iThrowableProxy1.getClassName()+" "+iThrowableProxy1.getMessage()+"</span></br>";
            for(int i=0; i<iThrowableProxy1.getStackTraceElementProxyArray().length;i++){
                exception += "<span class='excetext'>"+iThrowableProxy1.getStackTraceElementProxyArray()[i].toString()+"</span></br>";
            }
        }
        LoggerMessage loggerMessage = new LoggerMessage(
                event.getMessage()
                , DateFormat.getDateTimeInstance().format(new Date(event.getTimeStamp())),
                event.getThreadName(),
                event.getLoggerName(),
                event.getLevel().levelStr,
                exception,
                ""
        );
        //System.out.println("获取到的输出的内容:"+loggerMessage);
        LoggerQueue.getInstance().push(loggerMessage);
        return FilterReply.ACCEPT;
    }
}
