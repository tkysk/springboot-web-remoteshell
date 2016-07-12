package commands

import org.crsh.cli.Command
import org.crsh.cli.Usage
import org.crsh.command.InvocationContext

/**
 * Created by saeki on 2016/07/12.
 */

class hello {
    @Usage("say hello")
    @Command
    def main(InvocationContext context){
        return "Hello"
    }
}
