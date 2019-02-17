package com.kodilla.hibernate.manytomany.facade;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FinderFacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FinderFacadeWatcher.class);

    @Before("execution(public * com.kodilla.hibernate.manytomany.facade.FinderFacade.findCompanies(..))")
    public void logEvent(){
        LOGGER.info("Event  occurred");
    }

}
