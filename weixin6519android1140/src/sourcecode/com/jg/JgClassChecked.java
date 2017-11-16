package com.jg;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface JgClassChecked
{
  int author();
  
  String fComment();
  
  String lastDate();
  
  int level() default 1;
  
  int reviewer();
  
  EType[] vComment();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\jg\JgClassChecked.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */