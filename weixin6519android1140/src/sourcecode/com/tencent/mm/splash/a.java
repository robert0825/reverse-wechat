package com.tencent.mm.splash;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.system.OsConstants;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.loader.stub.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private static String voe;
  private static String vof;
  private static File vog;
  public static long voh;
  @SuppressLint({"HandlerLeak"})
  private static Handler voi;
  
  static
  {
    GMTrace.i(19028986822656L, 141777);
    voi = new Handler(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(19029657911296L, 141782);
        paramAnonymousMessage = (a.a)paramAnonymousMessage.obj;
        if (a.bRG()) {
          if (a.eO(a.voh))
          {
            if (!a.eK(e.vos))
            {
              e.bRY().e(675L, 25L, 1L);
              paramAnonymousMessage.bRI();
              GMTrace.o(19029657911296L, 141782);
              return;
            }
            if (!a.eN(e.vos)) {
              e.bRY().e(675L, 18L, 1L);
            }
            e.bRY().e(675L, 17L, 1L);
            paramAnonymousMessage.bRJ();
          }
        }
        for (;;)
        {
          a.voh = 0L;
          GMTrace.o(19029657911296L, 141782);
          return;
          a.b(paramAnonymousMessage);
          GMTrace.o(19029657911296L, 141782);
          return;
          if (!a.bRH())
          {
            e.bRY().e(675L, 15L, 1L);
            paramAnonymousMessage.bRI();
          }
          else if (!a.eK(e.vos))
          {
            e.bRY().e(675L, 26L, 1L);
            e.bRY().e(675L, 15L, 1L);
            paramAnonymousMessage.bRI();
          }
          else
          {
            e.bRY().e(675L, 16L, 1L);
            paramAnonymousMessage.bid();
          }
        }
      }
    };
    GMTrace.o(19028986822656L, 141777);
  }
  
  private static void Td(String paramString)
  {
    try
    {
      GMTrace.i(19027913080832L, 141769);
      String str = bRF();
      File localFile = new File(str);
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      paramString = new File(str + "/" + paramString);
      if (paramString.exists()) {
        paramString.delete();
      }
      paramString.createNewFile();
      vog = paramString;
      GMTrace.o(19027913080832L, 141769);
      return;
    }
    finally {}
  }
  
  public static void a(a parama)
  {
    GMTrace.i(19028315734016L, 141772);
    b(parama);
    GMTrace.o(19028315734016L, 141772);
  }
  
  public static void b(a parama)
  {
    GMTrace.i(19028449951744L, 141773);
    if (voh == 0L) {
      voh = System.currentTimeMillis();
    }
    Message localMessage = Message.obtain();
    localMessage.what = 0;
    localMessage.obj = parama;
    voi.sendMessageDelayed(localMessage, 100L);
    GMTrace.o(19028449951744L, 141773);
  }
  
  public static String bRF()
  {
    GMTrace.i(19027376209920L, 141765);
    if (voe == null) {
      throw new IllegalStateException("data directory should not be null, give one.");
    }
    Object localObject = new File(voe);
    if ((!((File)localObject).exists()) && (!((File)localObject).mkdirs())) {
      e.a("WxSplash.DexOpt", "data directory create failed.", new Object[0]);
    }
    localObject = voe;
    GMTrace.o(19027376209920L, 141765);
    return (String)localObject;
  }
  
  public static boolean bRG()
  {
    GMTrace.i(19028584169472L, 141774);
    if (vog == null) {
      throw new IllegalStateException("tmp file field should not be null");
    }
    boolean bool = vog.exists();
    GMTrace.o(19028584169472L, 141774);
    return bool;
  }
  
  public static boolean bRH()
  {
    GMTrace.i(19028718387200L, 141775);
    String str = bRF();
    boolean bool = new File(str + "/DexOpt_Failed").exists();
    GMTrace.o(19028718387200L, 141775);
    return bool;
  }
  
  public static void e(Application paramApplication)
  {
    GMTrace.i(19027241992192L, 141764);
    voe = new File(paramApplication.getFilesDir(), "dexopt_service").getAbsolutePath();
    GMTrace.o(19027241992192L, 141764);
  }
  
  public static boolean eK(Context paramContext)
  {
    GMTrace.i(19027510427648L, 141766);
    boolean bool = com.tencent.mm.f.a.as(paramContext);
    e.a("WxSplash.DexOpt", "if need dexopt %s", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(19027510427648L, 141766);
    return bool;
  }
  
  public static void eL(Context paramContext)
  {
    GMTrace.i(19027644645376L, 141767);
    if (com.tencent.mm.f.a.mH)
    {
      GMTrace.o(19027644645376L, 141767);
      return;
    }
    e.bRY().e(675L, 22L, 1L);
    try
    {
      bool = com.tencent.mm.f.a.at(paramContext);
      e.a("WxSplash.DexOpt", "install multidex result %s", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        e.a("WxSplash.DexOpt", "install multidex failed, kill self.", new Object[0]);
        e.bRS();
      }
      GMTrace.o(19027644645376L, 141767);
      return;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        e.a(paramContext, "multidex install failed");
        boolean bool = false;
      }
    }
  }
  
  public static void eM(Context paramContext)
  {
    GMTrace.i(19027778863104L, 141768);
    e.a("WxSplash.DexOpt", "start dex opt service", new Object[0]);
    String str = d.r(paramContext, Process.myPid());
    str.replace(':', '_');
    vof = "DexOpt_Request_" + str;
    e.bRY().e(675L, 14L, 1L);
    try
    {
      Td(vof);
      paramContext.startService(new Intent(paramContext, DexOptService.class));
      GMTrace.o(19027778863104L, 141768);
      return;
    }
    catch (Exception localException)
    {
      if (Build.VERSION.SDK_INT > 19) {
        break label203;
      }
    }
    if (localException.getClass().getCanonicalName().equals("libcore.io.ErrnoException")) {}
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = localException.getClass().getField("errno");
        ((Field)localObject).setAccessible(true);
        if (((Integer)((Field)localObject).get(localException)).intValue() == OsConstants.ENOSPC)
        {
          localObject = new File(bRF());
          if (((File)localObject).exists()) {
            break label212;
          }
          i = 1;
          if (i == 0) {
            break label249;
          }
          com.tencent.mm.f.a.ar(paramContext);
        }
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("WxSplash.DexOpt", paramContext, "", new Object[0]);
      }
      for (;;)
      {
        label203:
        throw new RuntimeException(localException);
        label212:
        i = ((File)localObject).listFiles().length;
        e.a("WxSplash.DexOpt", "check dexopt directory size %s.", new Object[] { Integer.valueOf(i) });
        if (i >= 10000) {
          break label287;
        }
        i = 1;
        break;
        label249:
        e.a("WxSplash.DexOpt", "check dexopt directory size not ok, clean it and throw exception.", new Object[0]);
        paramContext = new File(bRF());
        if (paramContext.exists()) {
          b.g(paramContext);
        }
      }
      label287:
      int i = 0;
    }
  }
  
  public static boolean eN(Context paramContext)
  {
    GMTrace.i(19028047298560L, 141770);
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    if (paramContext != null)
    {
      paramContext = paramContext.getRunningServices(Integer.MAX_VALUE);
      if (paramContext == null)
      {
        e.a("WxSplash.DexOpt", "dexopt service may dead, get running services return null.", new Object[0]);
        GMTrace.o(19028047298560L, 141770);
        return false;
      }
      paramContext = paramContext.iterator();
      while (paramContext.hasNext()) {
        if ("com.tencent.mm.splash.DexOptService".equals(((ActivityManager.RunningServiceInfo)paramContext.next()).service.getClassName()))
        {
          GMTrace.o(19028047298560L, 141770);
          return true;
        }
      }
    }
    e.a("WxSplash.DexOpt", "dexopt service may dead", new Object[0]);
    GMTrace.o(19028047298560L, 141770);
    return false;
  }
  
  public static boolean eO(long paramLong)
  {
    GMTrace.i(19028852604928L, 141776);
    if (System.currentTimeMillis() - paramLong > 180000L)
    {
      GMTrace.o(19028852604928L, 141776);
      return true;
    }
    GMTrace.o(19028852604928L, 141776);
    return false;
  }
  
  public static boolean eO(Context paramContext)
  {
    GMTrace.i(19028181516288L, 141771);
    long l1 = 0L;
    long l3 = System.currentTimeMillis();
    e.a("WxSplash.DexOpt", "block checking dex opt result.", new Object[0]);
    while (bRG())
    {
      long l2 = l1 + 1L;
      Thread.sleep(100L);
      l1 = l2;
      if (l2 >= 5L)
      {
        l1 = 0L;
        if (System.currentTimeMillis() - l3 > 180000L)
        {
          e.a("WxSplash.DexOpt", "block checking dex opt timeout.", new Object[0]);
          if (!eK(paramContext))
          {
            e.bRY().e(675L, 25L, 1L);
            e.bRY().e(675L, 15L, 1L);
            GMTrace.o(19028181516288L, 141771);
            return true;
          }
          if (!eN(paramContext)) {
            e.bRY().e(675L, 18L, 1L);
          }
          e.bRY().e(675L, 17L, 1L);
          GMTrace.o(19028181516288L, 141771);
          return false;
        }
      }
    }
    if (!bRH())
    {
      e.bRY().e(675L, 15L, 1L);
      GMTrace.o(19028181516288L, 141771);
      return true;
    }
    if (!eK(paramContext))
    {
      e.bRY().e(675L, 26L, 1L);
      e.bRY().e(675L, 15L, 1L);
      GMTrace.o(19028181516288L, 141771);
      return true;
    }
    e.bRY().e(675L, 16L, 1L);
    GMTrace.o(19028181516288L, 141771);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void bRI();
    
    public abstract void bRJ();
    
    public abstract void bid();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\splash\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */