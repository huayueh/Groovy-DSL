package order;

import groovy.lang.Closure;

/**
 * User: Harvey
 * Date: 2014/8/22
 * Time: 下午 06:32
 */
public abstract class Script extends groovy.lang.Script{
    Closure strategy;
    void strategy(groovy.lang.Closure closure) {
        this.strategy = closure;
    }
}
