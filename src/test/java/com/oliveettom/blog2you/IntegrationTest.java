package com.oliveettom.blog2you;

import com.oliveettom.blog2you.Blog2UApp;
import com.oliveettom.blog2you.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { Blog2UApp.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
