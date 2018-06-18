package com.github.hoodcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*스프링 부트의 애플리케이션 클래스라는 것을 나타냄*/
@SpringBootApplication
public class MyBootAppApplication {

    public static void main(String[] args) {
        /* SpringApplication은 스프링 부트 애플리케이션의 기본 기능을 탑재하고 있는 클래스 */
        /* run() 메소드는 애플리케이션을 실행하기 위핸 메소드 */
        /*
         * run() 메소드에 인자로 @SpringBootApplication이 붙은 클래스가 들어오면 
         * 스프링 부트는 기본 설정 그대로 사용해서 애플리케이션을 실행한다.
         * 본격적으로 스프링부트를 사용하면 다양한 설정 정보를 가진 클래스를 
         * 정의해서 인수로 지정을 할 수 있다.
         */
        SpringApplication.run(MyBootAppApplication.class, args);
    }
}
