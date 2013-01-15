package by.minsler.main;

import by.minsler.aspect.TaskService;
import by.minsler.bean.Person;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: minsler
 * Date: 1/3/13
 * Time: 8:08 PM
 */
public class Main {

    public static Logger logger = Logger.getLogger(Main.class);


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Person person = context.getBean("minsler", Person.class);
        System.out.println(person.printSimpleAddress());
        System.out.println(person);
//
//        NullBean nb = context.getBean("nb", NullBean.class);
//        ConstructorBean cb = context.getBean("cb", ConstructorBean.class);
//        System.out.println("null bean: " + nb + "\n");
//        System.out.println("constructor bean: " + cb + "\n");
//
//        System.out.println("before:\n\tperson.name: " + person.getName() +
//                "\n\tconstructor bean name: " + cb.getName());
//
//        person.setName("updatedName");
//
//        System.out.println("after:\n\tperson.name: " + person.getName() +
//                "\n\tconstructor bean name: " + cb.getName());
//
//        System.out.println();
//
//        ExpressionBean operator = context.getBean("operatorBean", ExpressionBean.class);
//        System.out.println(operator);

        TaskService ts = context.getBean("taskService", TaskService.class);
        ts.performJob();
        ts.performJobAround();
        ts.performJob("super puper", "1");
        try {
            ts.performJobException();
        } catch (Exception e) {
            logger.error(e);
        }

        context.close();
    }
}
