package com.stackleader;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.*;
import javax.inject.Inject;
import java.sql.SQLException;
import java.util.logging.Logger;

@Startup
@Stateless
public class EJBScheduler {

    @Inject
    PrepDao prepDao;

    @Resource
    private TimerService timerService;

    private static final Logger LOGGER = Logger.getLogger(EJBScheduler.class.toString());

    @PostConstruct
    public void initialize() {
        //FIXME: change back to 5 minutes (200000)
        timerService.createTimer(0, 4000, "Every 5 minutes timer with no delay");
    }

    @Timeout
    public void EJBTimeout(Timer timer) throws SQLException {
        LOGGER.info("************** Result Set Count = " + prepDao.getPrepData().size());
    }

    @PreDestroy
    public void stop() {
        System.out.println("EJB Timer: Stop timers.");
        for (Timer timer : timerService.getTimers()) {
            System.out.println("Stopping timer: " + timer.getInfo());
            timer.cancel();
        }
    }
}
