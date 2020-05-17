package context_benchmark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextStartupBenchmark {


//	public static void main(String[] args) {
//
//	}

    //0.5s
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
        long stop = System.currentTimeMillis();
        System.out.println("beans1 startup time: " + (stop - start));
    }

    //0.8s
//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1000.xml");
//        long stop = System.currentTimeMillis();
//        System.out.println("beans1000 startup time: " + (stop - start));
//    }

    //1.5s
//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans10000.xml");
//        long stop = System.currentTimeMillis();
//        System.out.println("beans10000 startup time: " + (stop - start));
//    }


}
