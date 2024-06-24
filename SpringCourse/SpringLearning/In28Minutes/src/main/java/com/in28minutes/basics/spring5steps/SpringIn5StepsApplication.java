package com.in28minutes.basics.spring5steps;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIn5StepsApplication {

    // What are the beans?
    // What are the dependencies of a bean?
    // Where to search for beans? => No need

    public static void main(String[] args) {

        // BinarySearchImpl binarySearch =
        // new BinarySearchImpl(new QuickSortAlgorithm());
        // Application Context
        ApplicationContext applicationContext =

                AnnotationConfigApplicationContext.(SpringIn5StepsApplication.class);

        BinarySearchImpl binarySearch =
                applicationContext.getBean(BinarySearchImpl.class);

        BinarySearchImpl binarySearch1 =
                applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch);
        System.out.println(binarySearch1);

        int result =
                binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
        System.out.println(result);
    }
}