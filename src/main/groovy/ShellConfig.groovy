import order.Direction
import order.Order
import org.codehaus.groovy.control.CompilerConfiguration
import org.codehaus.groovy.control.customizers.ImportCustomizer
import org.codehaus.groovy.control.customizers.SecureASTCustomizer

/**
 * User: Harvey
 * Date: 2014/8/22
 * Time: 下午 03:02
 */
class ShellConfig {
    Binding binding;
    CompilerConfiguration configuration;

    ShellConfig(){
        def SecureASTCustomizer secure = new SecureASTCustomizer()
        secure.with {
            closuresAllowed = true
            methodDefinitionAllowed = true

            importsWhitelist = []
            staticImportsWhitelist = []
            staticStarImportsWhitelist = ['java.lang.Math','order.Direction']
        }


        def imports = new ImportCustomizer()
        imports.addStaticStar(Direction.name)

        configuration = new CompilerConfiguration()
        configuration.addCompilationCustomizers(imports, secure)
        configuration.scriptBaseClass = 'order.Strategy'

        def order = new Order()
        binding = new Binding([
                order : order,
                *    : Direction.values().collectEntries {
                    [(it.name()): it]
                },
//                entry : order.&entry,
//                at : order.&at
        ])
    }
}
