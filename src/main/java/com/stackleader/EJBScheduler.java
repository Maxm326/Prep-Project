package com.stackleader;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.sql.SQLException;
import java.util.logging.Logger;

@Startup
@Singleton
public class EJBScheduler {

    private static final Logger LOGGER = Logger.getLogger(EJBScheduler.class.toString());

    @Inject
    PrepDao prepDao;

    @Resource
    TimerService timerService;

    @PostConstruct
    public void intialize() {
        //FIXME: change back to 5 minutes (200000)
        timerService.createTimer(0, 4000 ,"Every 5 minutes timer with no delay");
    }

    @Timeout
    public void EJBTimeout(Timer timer) throws SQLException {
        LOGGER.info("************** Result Set Count = " + prepDao.getPrepData().size());
    }
}
