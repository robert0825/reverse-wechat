package com.tencent.mm.booter.cache;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.gmtrace.GMTrace;

public class CacheService
  extends Service
{
  public CacheService()
  {
    GMTrace.i(534186557440L, 3980);
    GMTrace.o(534186557440L, 3980);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(534589210624L, 3983);
    paramIntent = a.fKh;
    GMTrace.o(534589210624L, 3983);
    return paramIntent;
  }
  
  public void onCreate()
  {
    GMTrace.i(534320775168L, 3981);
    super.onCreate();
    a.prepare();
    GMTrace.o(534320775168L, 3981);
  }
  
  public void onDestroy()
  {
    GMTrace.i(534454992896L, 3982);
    super.onDestroy();
    a.destroy();
    GMTrace.o(534454992896L, 3982);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\cache\CacheService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */