package order;

import groovy.lang.Script;

/**
 * User: Harvey
 * Date: 2014/8/22
 * Time: 下午 05:28
 */
public abstract class Strategy extends Script{
    public abstract void init();
    public abstract void tick();
    public abstract void end();
}
