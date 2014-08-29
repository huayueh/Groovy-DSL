import groovy.lang.GroovyShell;
import groovy.lang.Script;
import order.Strategy;

import java.io.File;
import java.io.IOException;

/**
 * User: Harvey
 * Date: 2014/8/22
 * Time: 下午 03:46
 */
public class Main {
    public static void main(String arg[]) throws IOException {
        ShellConfig config = new ShellConfig();
        GroovyShell shell = new GroovyShell(config.getBinding(), config.getConfiguration());
        Script script = shell.parse(new File("E:/workspace/Groovy-DSL/src/SampleStrategy.ea"));

        Strategy strategy = (Strategy) script;
        strategy.init();
        strategy.tick();
        strategy.end();
    }
}
