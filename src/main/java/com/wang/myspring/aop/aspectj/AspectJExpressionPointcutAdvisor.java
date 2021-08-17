package com.wang.myspring.aop.aspectj;

import com.wang.myspring.aop.PointCut;
import com.wang.myspring.aop.PointcutAdvisor;
import org.aopalliance.aop.Advice;

/**
 * @Description: aspectJ表达式的advisor
 * @Author: wht
 * @Date: 2021/08/16/19:58
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    private AspectJExpressionPointcut pointcut;

    private Advice advice;

    private String expression;

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public PointCut getPointcut() {
        if (pointcut == null) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }
}
