package com.jkkim.demo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 이 애노테이션을 사용시 성능을 체크해줍니다.
 */
@Documented
@Target(ElementType.METHOD)
public @interface PerfLogging {
}
