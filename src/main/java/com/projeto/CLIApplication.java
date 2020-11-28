package com.projeto;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@QuarkusMain
public class CLIApplication implements QuarkusApplication {

    private static Logger log = LoggerFactory.getLogger(CLIApplication.class);

    @Override
    public int run(String... args) throws Exception {

        if (args.length > 0) {
            log.info("START APP. Nº Args: {}. Args: {}", args.length, String.join(";", args));
        } else {
            log.info("START APP. Nenhum argumento.");
        }

        return 0; // Sucesso exit com codigo 0
    }

}
