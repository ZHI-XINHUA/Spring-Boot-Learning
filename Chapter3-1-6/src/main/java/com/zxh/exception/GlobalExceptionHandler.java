package com.zxh.exception;


import com.zxh.dto.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhixinhua on 18/2/25.
 * 自定义的异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    /**
     * 应用到所有@RequestMapping注解,跳转试图的方法，在其抛出Exception异常时执行
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value=Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request,Exception e) throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception",e);
        mv.addObject("url",request.getRequestURI());
        mv.setViewName("error");
        return mv;
    }

    /**
     * 应用到所有@RequestMapping注解,返回json的方法，在其抛出MyException异常时执行
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest request,MyException e) throws Exception{
        ErrorInfo<String> errorInfo = new ErrorInfo<String>();
        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setMessage(e.getMessage());
        errorInfo.setUrl(request.getRequestURI());
        errorInfo.setData("发生错误");
        return errorInfo;
    }

}
