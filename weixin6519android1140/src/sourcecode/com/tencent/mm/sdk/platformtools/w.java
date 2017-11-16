package com.tencent.mm.sdk.platformtools;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.tencent.gmtrace.GMTrace;

public final class w
{
  public static int level;
  private static final String qNQ;
  private static a vhW;
  private static a vhX;
  
  static
  {
    GMTrace.i(13998640594944L, 104298);
    level = 6;
    Object localObject = new a()
    {
      private Handler handler;
      
      public final void appenderClose()
      {
        GMTrace.i(14003203997696L, 104332);
        GMTrace.o(14003203997696L, 104332);
      }
      
      public final void appenderFlush(boolean paramAnonymousBoolean)
      {
        GMTrace.i(14003338215424L, 104333);
        GMTrace.o(14003338215424L, 104333);
      }
      
      public final int getLogLevel()
      {
        GMTrace.i(14003069779968L, 104331);
        int i = w.level;
        GMTrace.o(14003069779968L, 104331);
        return i;
      }
      
      public final void logD(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        GMTrace.i(14002532909056L, 104327);
        paramAnonymousInt1 = w.level;
        GMTrace.o(14002532909056L, 104327);
      }
      
      public final void logE(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        GMTrace.i(14002801344512L, 104329);
        paramAnonymousInt1 = w.level;
        GMTrace.o(14002801344512L, 104329);
      }
      
      public final void logF(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        GMTrace.i(14002935562240L, 104330);
        if (w.level > 5)
        {
          GMTrace.o(14002935562240L, 104330);
          return;
        }
        GMTrace.o(14002935562240L, 104330);
      }
      
      public final void logI(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        GMTrace.i(14002398691328L, 104326);
        paramAnonymousInt1 = w.level;
        GMTrace.o(14002398691328L, 104326);
      }
      
      public final void logV(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        GMTrace.i(14002264473600L, 104325);
        paramAnonymousInt1 = w.level;
        GMTrace.o(14002264473600L, 104325);
      }
      
      public final void logW(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, long paramAnonymousLong1, long paramAnonymousLong2, String paramAnonymousString4)
      {
        GMTrace.i(14002667126784L, 104328);
        paramAnonymousInt1 = w.level;
        GMTrace.o(14002667126784L, 104328);
      }
    };
    vhW = (a)localObject;
    vhX = (a)localObject;
    localObject = new StringBuilder();
    try
    {
      ((StringBuilder)localObject).append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
      ((StringBuilder)localObject).append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
      ((StringBuilder)localObject).append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
      ((StringBuilder)localObject).append("] BOARD:[" + Build.BOARD);
      ((StringBuilder)localObject).append("] DEVICE:[" + Build.DEVICE);
      ((StringBuilder)localObject).append("] DISPLAY:[" + Build.DISPLAY);
      ((StringBuilder)localObject).append("] FINGERPRINT:[" + Build.FINGERPRINT);
      ((StringBuilder)localObject).append("] HOST:[" + Build.HOST);
      ((StringBuilder)localObject).append("] MANUFACTURER:[" + Build.MANUFACTURER);
      ((StringBuilder)localObject).append("] MODEL:[" + Build.MODEL);
      ((StringBuilder)localObject).append("] PRODUCT:[" + Build.PRODUCT);
      ((StringBuilder)localObject).append("] TAGS:[" + Build.TAGS);
      ((StringBuilder)localObject).append("] TYPE:[" + Build.TYPE);
      ((StringBuilder)localObject).append("] USER:[" + Build.USER + "]");
      qNQ = ((StringBuilder)localObject).toString();
      GMTrace.o(13998640594944L, 104298);
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        printErrStackTrace("MicroMsg.SDK.Log", localThrowable, "", new Object[0]);
      }
    }
  }
  
  public static void Al(int paramInt)
  {
    GMTrace.i(13996224675840L, 104280);
    level = paramInt;
    GMTrace.o(13996224675840L, 104280);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(13995419369472L, 104274);
    vhX = parama;
    GMTrace.o(13995419369472L, 104274);
  }
  
  public static void appenderClose()
  {
    GMTrace.i(13995687804928L, 104276);
    if (vhX != null) {
      vhX.appenderClose();
    }
    GMTrace.o(13995687804928L, 104276);
  }
  
  public static a bPL()
  {
    GMTrace.i(13995553587200L, 104275);
    a locala = vhX;
    GMTrace.o(13995553587200L, 104275);
    return locala;
  }
  
  public static void bPM()
  {
    GMTrace.i(13995822022656L, 104277);
    if (vhX != null) {
      vhX.appenderFlush(false);
    }
    GMTrace.o(13995822022656L, 104277);
  }
  
  public static void bPN()
  {
    GMTrace.i(13995956240384L, 104278);
    if (vhX != null) {
      vhX.appenderFlush(true);
    }
    GMTrace.o(13995956240384L, 104278);
  }
  
  public static String bPO()
  {
    GMTrace.i(13998372159488L, 104296);
    String str = qNQ;
    GMTrace.o(13998372159488L, 104296);
    return str;
  }
  
  public static void d(String paramString1, String paramString2)
  {
    GMTrace.i(13996895764480L, 104285);
    d(paramString1, paramString2, null);
    GMTrace.o(13996895764480L, 104285);
  }
  
  public static void d(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(13997701070848L, 104291);
    if ((vhX != null) && (vhX.getLogLevel() <= 1)) {
      if (paramVarArgs != null) {
        break label83;
      }
    }
    for (;;)
    {
      paramVarArgs = paramString2;
      if (paramString2 == null) {
        paramVarArgs = "";
      }
      vhX.logD(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramVarArgs);
      GMTrace.o(13997701070848L, 104291);
      return;
      label83:
      paramString2 = String.format(paramString2, paramVarArgs);
    }
  }
  
  public static void e(String paramString1, String paramString2)
  {
    GMTrace.i(13996493111296L, 104282);
    e(paramString1, paramString2, null);
    GMTrace.o(13996493111296L, 104282);
  }
  
  public static void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(13997298417664L, 104288);
    if ((vhX != null) && (vhX.getLogLevel() <= 4)) {
      if (paramVarArgs != null) {
        break label83;
      }
    }
    for (;;)
    {
      paramVarArgs = paramString2;
      if (paramString2 == null) {
        paramVarArgs = "";
      }
      vhX.logE(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramVarArgs);
      GMTrace.o(13997298417664L, 104288);
      return;
      label83:
      paramString2 = String.format(paramString2, paramVarArgs);
    }
  }
  
  public static void f(String paramString1, String paramString2)
  {
    GMTrace.i(13996358893568L, 104281);
    f(paramString1, paramString2, null);
    GMTrace.o(13996358893568L, 104281);
  }
  
  public static void f(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(13997164199936L, 104287);
    if ((vhX != null) && (vhX.getLogLevel() <= 5)) {
      if (paramVarArgs != null) {
        break label74;
      }
    }
    for (;;)
    {
      vhX.logF(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramString2);
      GMTrace.o(13997164199936L, 104287);
      return;
      label74:
      paramString2 = String.format(paramString2, paramVarArgs);
    }
  }
  
  public static int getLogLevel()
  {
    GMTrace.i(13996090458112L, 104279);
    if (vhX != null)
    {
      int i = vhX.getLogLevel();
      GMTrace.o(13996090458112L, 104279);
      return i;
    }
    GMTrace.o(13996090458112L, 104279);
    return 6;
  }
  
  public static void i(String paramString1, String paramString2)
  {
    GMTrace.i(13996761546752L, 104284);
    i(paramString1, paramString2, null);
    GMTrace.o(13996761546752L, 104284);
  }
  
  public static void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(13997566853120L, 104290);
    if ((vhX != null) && (vhX.getLogLevel() <= 2)) {
      if (paramVarArgs != null) {
        break label85;
      }
    }
    for (;;)
    {
      paramVarArgs = paramString2;
      if (paramString2 == null) {
        paramVarArgs = "";
      }
      vhX.logI(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramVarArgs);
      GMTrace.o(13997566853120L, 104290);
      return;
      label85:
      paramString2 = String.format(paramString2, paramVarArgs);
    }
  }
  
  public static void j(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(13997969506304L, 104293);
    if ((vhX != null) && (vhX.getLogLevel() <= 1))
    {
      paramVarArgs = String.format(paramString2, paramVarArgs);
      paramString2 = paramVarArgs;
      if (paramVarArgs == null) {
        paramString2 = "";
      }
      paramString2 = paramString2 + "  " + new ah();
      vhX.logI(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramString2);
    }
    GMTrace.o(13997969506304L, 104293);
  }
  
  public static void k(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(13998103724032L, 104294);
    if ((vhX != null) && (vhX.getLogLevel() <= 2))
    {
      paramVarArgs = String.format(paramString2, paramVarArgs);
      paramString2 = paramVarArgs;
      if (paramVarArgs == null) {
        paramString2 = "";
      }
      paramString2 = paramString2 + "  " + new ah();
      vhX.logI(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramString2);
    }
    GMTrace.o(13998103724032L, 104294);
  }
  
  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(13998237941760L, 104295);
    if ((vhX != null) && (vhX.getLogLevel() <= 4)) {
      if (paramVarArgs != null) {
        break label113;
      }
    }
    for (;;)
    {
      paramVarArgs = paramString2;
      if (paramString2 == null) {
        paramVarArgs = "";
      }
      paramThrowable = paramVarArgs + "  " + Log.getStackTraceString(paramThrowable);
      vhX.logE(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramThrowable);
      GMTrace.o(13998237941760L, 104295);
      return;
      label113:
      paramString2 = String.format(paramString2, paramVarArgs);
    }
  }
  
  public static void v(String paramString1, String paramString2)
  {
    GMTrace.i(13997029982208L, 104286);
    v(paramString1, paramString2, null);
    GMTrace.o(13997029982208L, 104286);
  }
  
  public static void v(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(13997835288576L, 104292);
    if ((vhX != null) && (vhX.getLogLevel() <= 0)) {
      if (paramVarArgs != null) {
        break label84;
      }
    }
    for (;;)
    {
      paramVarArgs = paramString2;
      if (paramString2 == null) {
        paramVarArgs = "";
      }
      vhX.logV(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramVarArgs);
      GMTrace.o(13997835288576L, 104292);
      return;
      label84:
      paramString2 = String.format(paramString2, paramVarArgs);
    }
  }
  
  public static void w(String paramString1, String paramString2)
  {
    GMTrace.i(13996627329024L, 104283);
    w(paramString1, paramString2, null);
    GMTrace.o(13996627329024L, 104283);
  }
  
  public static void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(13997432635392L, 104289);
    if ((vhX != null) && (vhX.getLogLevel() <= 3)) {
      if (paramVarArgs != null) {
        break label85;
      }
    }
    for (;;)
    {
      paramVarArgs = paramString2;
      if (paramString2 == null) {
        paramVarArgs = "";
      }
      vhX.logW(paramString1, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), paramVarArgs);
      GMTrace.o(13997432635392L, 104289);
      return;
      label85:
      paramString2 = String.format(paramString2, paramVarArgs);
    }
  }
  
  public static abstract interface a
  {
    public abstract void appenderClose();
    
    public abstract void appenderFlush(boolean paramBoolean);
    
    public abstract int getLogLevel();
    
    public abstract void logD(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);
    
    public abstract void logE(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);
    
    public abstract void logF(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);
    
    public abstract void logI(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);
    
    public abstract void logV(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);
    
    public abstract void logW(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */