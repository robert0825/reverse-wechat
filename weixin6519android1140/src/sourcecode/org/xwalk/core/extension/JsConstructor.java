package org.xwalk.core.extension;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface JsConstructor
{
  boolean isEntryPoint() default false;
  
  Class<?> mainClass();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\org\xwalk\core\extension\JsConstructor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */