package com.tencent.mm.compatible.loader;

import android.app.Application;
import android.content.res.Configuration;
import com.tencent.gmtrace.GMTrace;

@Deprecated
public abstract class e
{
  public Application app;
  
  public e()
  {
    GMTrace.i(13791274205184L, 102753);
    GMTrace.o(13791274205184L, 102753);
  }
  
  public abstract void onConfigurationChanged(Configuration paramConfiguration);
  
  public abstract void onCreate();
  
  public void onTerminate()
  {
    GMTrace.i(13791676858368L, 102756);
    GMTrace.o(13791676858368L, 102756);
  }
  
  public void onTrimMemory(int paramInt)
  {
    GMTrace.i(13791811076096L, 102757);
    GMTrace.o(13791811076096L, 102757);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\loader\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */