package com.tencent.mm.sdk.e;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface h
{
  String bRl();
  
  int bRm() default 0;
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\e\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */