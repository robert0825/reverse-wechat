package com.tencent.mm.splash;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.app.c;
import java.lang.reflect.Field;
import java.util.ArrayList;

final class h
  extends Instrumentation
{
  public Instrumentation voZ;
  
  public h(Instrumentation paramInstrumentation)
  {
    GMTrace.i(19022007500800L, 141725);
    this.voZ = paramInstrumentation;
    bSd();
    GMTrace.o(19022007500800L, 141725);
  }
  
  private void bSd()
  {
    GMTrace.i(19022275936256L, 141727);
    Field[] arrayOfField = Instrumentation.class.getDeclaredFields();
    int i = 0;
    while (i < arrayOfField.length)
    {
      arrayOfField[i].setAccessible(true);
      Object localObject = arrayOfField[i].get(this.voZ);
      arrayOfField[i].set(this, localObject);
      i += 1;
    }
    GMTrace.o(19022275936256L, 141727);
  }
  
  public final Activity newActivity(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    GMTrace.i(19022141718528L, 141726);
    c.by(paramString);
    if ((e.bRQ()) && (!e.bRX().getCanonicalName().equals(paramString)))
    {
      paramClassLoader = new f();
      e.a("WxSplash.SplashHackInstrumentation", "new splash hack activity. replace activity %s", new Object[] { paramString });
      e.voq.add(paramClassLoader);
      GMTrace.o(19022141718528L, 141726);
      return paramClassLoader;
    }
    paramClassLoader = super.newActivity(paramClassLoader, paramString, paramIntent);
    if (g.bSc())
    {
      e.a("WxSplash.SplashHackInstrumentation", "processing relaunch activity.", new Object[0]);
      paramIntent.putExtra("splash-hack-activity-recreate", true);
    }
    GMTrace.o(19022141718528L, 141726);
    return paramClassLoader;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\splash\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */