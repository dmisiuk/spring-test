package by.minsler.aspect;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * User: minsler
 * Date: 1/15/13
 * Time: 8:11 PM
 */
@Service("taskService")
public class TaskService {

    private static Logger logger = Logger.getLogger(TaskService.class);

    public void performJob() {
        logger.info("perform job");
    }

    public void performJob(String name, String title) {
        logger.info("perform job. Name - " + name + title);
    }


    public void performJobException() throws Exception {
        logger.info("throw exception in job");
        throw new Exception();
    }

    public String performJobAround() {
        logger.info("perform around");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            return "False";
//        }
        return "SUCCESS";
    }
}
