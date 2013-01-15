package by.minsler.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * User: minsler
 * Date: 1/15/13
 * Time: 8:11 PM
 */
@Component
public class Work {

    private static Logger logger = Logger.getLogger(Work.class);

    public void beforeWork() {
        logger.info("before work");
    }

    public void afterWork() {
        logger.info("after work");
    }

    public void afterWorkProblems() {
        logger.info("after exception work");
    }

    public void aroundWork(ProceedingJoinPoint joinPoint) {
        try {
            logger.info("Start");
            logger.info("Begin Time  - " + System.currentTimeMillis());
            String result = (String) joinPoint.proceed();
            logger.info("End time  - " + System.currentTimeMillis());
            logger.info("Status - " + result);
        } catch (Throwable e) {
            logger.error(e);
        }
    }

    public void interceptWorkNameTitle(String name, String title) {
        logger.info("intercept with  Name - " + name);
    }
}
