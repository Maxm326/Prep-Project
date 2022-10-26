package com.stackleader;

import javax.annotation.Resource;
import javax.ejb.*;
import javax.inject.Inject;
import java.sql.SQLException;
import java.util.logging.Logger;

@Startup
@Singleton
public class EJBScheduler {

    @Inject
    PrepDao prepDao;

    @Resource
    private TimerService timerService;

    private static final Logger LOGGER = Logger.getLogger(EJBScheduler.class.toString());
    @Schedule(hour = "*", minute = "*/5", persistent = false)
    public void EJBTimeout(Timer timer) throws SQLException {
        LOGGER.info("************** Result Set Count = " + prepDao.getPrepData().size());
    }
}
