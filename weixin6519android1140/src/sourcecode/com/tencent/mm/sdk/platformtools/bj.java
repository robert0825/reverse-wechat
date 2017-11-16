package com.tencent.mm.sdk.platformtools;

import android.app.Activity;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD})
public @interface bj
{
  Class<? extends Activity>[] cua() default {};
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */