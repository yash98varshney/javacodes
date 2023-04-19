package OOD.Command_practice;

import java.util.HashMap;
import java.util.Map;

public class CommandInvoker {
    private static final Map<String, Icommand> commandMap = new HashMap<>();


    // Register the command into the HashMap

    public void register(String commandName, Icommand command){

        commandMap.put(commandName,command);

    }


    // Get the registered Command

    private Icommand get(String commandName){

        return commandMap.get(commandName);

    }


    // Execute the registered Command

    public void executeCommand(String commandName) throws Exception {

        Icommand command = get(commandName);

        if(command == null){

            // Handle Exception

            throw new Exception();

        }

        command.execute();

    }
}
