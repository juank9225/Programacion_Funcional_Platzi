package com.platzi.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CliArgumentsUtils {

    static void showHelp(CliArguments cliArguments){
        Consumer<CliArguments> consumerHelper = cliArguments1 -> {
          if (cliArguments1.isHelp()){
              System.out.println("Manual Solicitado");
          }
        };

        consumerHelper.accept(cliArguments);
    }

    static CliArguments generateCLI(){
        Supplier<CliArguments> generator = () -> new CliArguments();
        return generator.get();
    }
}
