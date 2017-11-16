package com.tencent.tinker.lib.service;

import android.app.IntentService;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.SystemClock;
import com.tencent.tinker.lib.c.d;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import java.io.File;

public class TinkerPatchService
  extends IntentService
{
  private static int fKY = -1119860829;
  private static com.tencent.tinker.lib.b.a ygm = null;
  private static Class<? extends AbstractResultService> ygn = null;
  
  public TinkerPatchService()
  {
    super(TinkerPatchService.class.getSimpleName());
  }
  
  public static void a(com.tencent.tinker.lib.b.a parama, Class<? extends AbstractResultService> paramClass)
  {
    ygm = parama;
    ygn = paramClass;
    try
    {
      Class.forName(paramClass.getName());
      return;
    }
    catch (ClassNotFoundException parama) {}
  }
  
  public static String aq(Intent paramIntent)
  {
    if (paramIntent == null) {
      throw new TinkerRuntimeException("getPatchPathExtra, but intent is null");
    }
    return ShareIntentUtil.i(paramIntent, "patch_path_extra");
  }
  
  public static void bL(Context paramContext, String paramString)
  {
    try
    {
      Intent localIntent = new Intent(paramContext, TinkerPatchService.class);
      localIntent.putExtra("patch_path_extra", paramString);
      localIntent.putExtra("patch_result_class", ygn.getName());
      paramContext.startService(localIntent);
      return;
    }
    catch (Throwable paramContext)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.TinkerPatchService", "start patch service fail, exception:" + paramContext, new Object[0]);
    }
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    boolean bool1 = false;
    Context localContext = getApplicationContext();
    com.tencent.tinker.lib.d.a locala = com.tencent.tinker.lib.d.a.hQ(localContext);
    locala.ygt.M(paramIntent);
    if (paramIntent == null)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.TinkerPatchService", "TinkerPatchService received a null intent, ignoring.", new Object[0]);
      return;
    }
    String str = aq(paramIntent);
    if (str == null)
    {
      com.tencent.tinker.lib.e.a.e("Tinker.TinkerPatchService", "TinkerPatchService can't get the path extra, ignoring.", new Object[0]);
      return;
    }
    File localFile = new File(str);
    long l = SystemClock.elapsedRealtime();
    Object localObject1 = null;
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerPatchService", "try to increase patch process priority", new Object[0]);
    try
    {
      Object localObject2 = new Notification();
      if (Build.VERSION.SDK_INT < 18) {
        startForeground(fKY, (Notification)localObject2);
      }
      for (;;)
      {
        localObject2 = new a();
        try
        {
          if (ygm != null) {
            break;
          }
          throw new TinkerRuntimeException("upgradePatchProcessor is null.");
        }
        catch (Throwable localThrowable1)
        {
          locala.ygt.a(localFile, localThrowable1);
        }
        l = SystemClock.elapsedRealtime() - l;
        locala.ygt.a(localFile, bool1, l);
        ((a)localObject2).eFN = bool1;
        ((a)localObject2).ygk = str;
        ((a)localObject2).iyA = l;
        ((a)localObject2).xPC = localThrowable1;
        if (paramIntent != null) {
          break label302;
        }
        throw new TinkerRuntimeException("getPatchResultExtra, but intent is null");
        startForeground(fKY, (Notification)localObject2);
        startService(new Intent(this, InnerService.class));
      }
    }
    catch (Throwable localThrowable2)
    {
      for (;;)
      {
        com.tencent.tinker.lib.e.a.i("Tinker.TinkerPatchService", "try to increase patch process priority error:" + localThrowable2, new Object[0]);
        continue;
        boolean bool2 = ygm.a(localContext, str, localThrowable2);
        bool1 = bool2;
      }
      label302:
      AbstractResultService.a(localContext, localThrowable2, ShareIntentUtil.i(paramIntent, "patch_result_class"));
    }
  }
  
  public static class InnerService
    extends Service
  {
    public IBinder onBind(Intent paramIntent)
    {
      return null;
    }
    
    public void onCreate()
    {
      super.onCreate();
      try
      {
        startForeground(TinkerPatchService.aaC(), new Notification());
        stopSelf();
        return;
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerPatchService", "InnerService set service for push exception:%s.", new Object[] { localThrowable });
        }
      }
    }
    
    public void onDestroy()
    {
      stopForeground(true);
      super.onDestroy();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\lib\service\TinkerPatchService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */