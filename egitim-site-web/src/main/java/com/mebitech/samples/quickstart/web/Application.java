package com.mebitech.samples.quickstart.web;

import com.mebitech.robe.web.WebApplication;
import com.mebitech.samples.quickstart.web.cli.InitialCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author MustafaGungor
 * @version 1.0.0
 * @since 24/03/2017.
 */

@ComponentScan({"com.mebitech.samples.quickstart", "com.mebitech.robe"})
@EnableJpaRepositories(basePackages = {"com.mebitech.samples.quickstart.repository", "com.mebitech.robe.security.db.repository"})
@EntityScan(basePackages = {"com.mebitech.samples.quickstart.domain", "com.mebitech.robe.security.db.domain"})
public class Application extends WebApplication {

    @Autowired
    InitialCommand initialCommand;

    public static void main(String[] args) {
        run(Application.class, args);
    }

    @Override
    public void init(ApplicationArguments applicationArguments) {
        initialCommand.run();
    }
}
