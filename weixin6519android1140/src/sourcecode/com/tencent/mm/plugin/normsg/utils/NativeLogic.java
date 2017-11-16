package com.tencent.mm.plugin.normsg.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Set;
import java.util.TreeSet;

public final class NativeLogic
{
  static
  {
    GMTrace.i(17526553575424L, 130583);
    k.b("wechatnormsg", NativeLogic.class.getClassLoader());
    GMTrace.o(17526553575424L, 130583);
  }
  
  public NativeLogic()
  {
    GMTrace.i(17524674527232L, 130569);
    GMTrace.o(17524674527232L, 130569);
  }
  
  public static String DZ(String paramString)
  {
    GMTrace.i(18977178779648L, 141391);
    long l = System.nanoTime();
    paramString = checkSoftType6(paramString);
    l = (System.nanoTime() - l) / 1000L;
    w.i("MicroMsg.NativeLogic", "call checkSoftType6, duration: %d us", new Object[] { Long.valueOf(l) });
    d.oqe.c(415, 19, 20, (int)l, false);
    GMTrace.o(18977178779648L, 141391);
    return paramString;
  }
  
  public static void a(Context paramContext, Set<String> paramSet, boolean paramBoolean)
  {
    GMTrace.i(18977044561920L, 141390);
    long l = System.nanoTime();
    checkSoftType4(paramContext, paramSet, paramBoolean);
    l = (System.nanoTime() - l) / 1000L;
    w.i("MicroMsg.NativeLogic", "call checkSoftType4, duration: %d us", new Object[] { Long.valueOf(l) });
    d.oqe.c(415, 13, 14, (int)l, false);
    GMTrace.o(18977044561920L, 141390);
  }
  
  public static boolean a(Object paramObject, Class paramClass)
  {
    GMTrace.i(17814450601984L, 132728);
    boolean bool = secretMsgCheck(paramObject, paramClass);
    GMTrace.o(17814450601984L, 132728);
    return bool;
  }
  
  public static boolean aUp()
  {
    GMTrace.i(17524808744960L, 130570);
    long l = System.nanoTime();
    boolean bool = checkMsgLevel();
    l = (System.nanoTime() - l) / 1000L;
    w.i("MicroMsg.NativeLogic", "call checkMsgLevel, duration: %d us", new Object[] { Long.valueOf(l) });
    d.oqe.c(415, 1, 2, (int)l, false);
    GMTrace.o(17524808744960L, 130570);
    return bool;
  }
  
  public static long aUr()
  {
    GMTrace.i(17525479833600L, 130575);
    long l2 = System.nanoTime();
    long l1 = checkSoftType5();
    l2 = (System.nanoTime() - l2) / 1000L;
    w.i("MicroMsg.NativeLogic", "call checkSoftType5, duration: %d us", new Object[] { Long.valueOf(l2) });
    d.oqe.c(415, 16, 17, (int)l2, false);
    GMTrace.o(17525479833600L, 130575);
    return l1;
  }
  
  public static boolean aUs()
  {
    GMTrace.i(18977312997376L, 141392);
    long l = System.nanoTime();
    boolean bool = checkSoftType7();
    l = (System.nanoTime() - l) / 1000L;
    w.i("MicroMsg.NativeLogic", "call checkSoftType7, duration: %d us", new Object[] { Long.valueOf(l) });
    d.oqe.c(415, 22, 23, (int)l, false);
    GMTrace.o(18977312997376L, 141392);
    return bool;
  }
  
  public static byte[] bA(String paramString, int paramInt)
  {
    GMTrace.i(17524942962688L, 130571);
    long l = System.nanoTime();
    paramString = checkSoftType(paramString, paramInt);
    l = (System.nanoTime() - l) / 1000L;
    w.i("MicroMsg.NativeLogic", "call checkSoftType, duration: %d us", new Object[] { Long.valueOf(l) });
    d.oqe.c(415, 4, 5, (int)l, false);
    GMTrace.o(17524942962688L, 130571);
    return paramString;
  }
  
  public static boolean bh(Object paramObject)
  {
    GMTrace.i(20149704851456L, 150127);
    long l = System.nanoTime();
    boolean bool = checkSoftType8(paramObject);
    l = (System.nanoTime() - l) / 1000L;
    w.i("MicroMsg.NativeLogic", "call checkSoftType8, duration: %d us", new Object[] { Long.valueOf(l) });
    d.oqe.c(415, 25, 26, (int)l, false);
    GMTrace.o(20149704851456L, 150127);
    return bool;
  }
  
  public static byte[] cW(Context paramContext)
  {
    GMTrace.i(17525211398144L, 130573);
    long l = System.nanoTime();
    paramContext = checkSoftType3(paramContext);
    l = (System.nanoTime() - l) / 1000L;
    w.i("MicroMsg.NativeLogic", "call checkSoftType3, duration: %d us", new Object[] { Long.valueOf(l) });
    d.oqe.c(415, 10, 11, (int)l, false);
    GMTrace.o(17525211398144L, 130573);
    return paramContext;
  }
  
  public static native boolean checkMsgLevel();
  
  public static native byte[] checkSoftType(String paramString, int paramInt);
  
  public static native byte[] checkSoftType2(Context paramContext, String paramString, int paramInt);
  
  public static native byte[] checkSoftType3(Context paramContext);
  
  public static native void checkSoftType4(Context paramContext, Set<String> paramSet, boolean paramBoolean);
  
  public static native long checkSoftType5();
  
  public static native String checkSoftType6(String paramString);
  
  public static native boolean checkSoftType7();
  
  private static native boolean checkSoftType8(Object paramObject);
  
  public static byte[] h(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(17525077180416L, 130572);
    long l = System.nanoTime();
    paramContext = checkSoftType2(paramContext, paramString, paramInt);
    l = (System.nanoTime() - l) / 1000L;
    w.i("MicroMsg.NativeLogic", "call checkSoftType2, duration: %d us", new Object[] { Long.valueOf(l) });
    d.oqe.c(415, 7, 8, (int)l, false);
    GMTrace.o(17525077180416L, 130572);
    return paramContext;
  }
  
  private static native boolean secretMsgCheck(Object paramObject, Class paramClass);
  
  private static native int setLog(int paramInt);
  
  public static enum a
    implements com.tencent.mm.plugin.normsg.a.a
  {
    static
    {
      GMTrace.i(17528432623616L, 130597);
      nxN = new a("INSTANCE");
      nxO = new a[] { nxN };
      GMTrace.o(17528432623616L, 130597);
    }
    
    private a()
    {
      GMTrace.i(17527493099520L, 130590);
      GMTrace.o(17527493099520L, 130590);
    }
    
    public final void rS(int paramInt)
    {
      GMTrace.i(17527627317248L, 130591);
      int i = 0;
      while (i < paramInt)
      {
        NativeLogic.checkMsgLevel();
        i += 1;
      }
      GMTrace.o(17527627317248L, 130591);
    }
    
    public final void rT(int paramInt)
    {
      GMTrace.i(17527761534976L, 130592);
      String str = ab.getContext().getApplicationInfo().sourceDir;
      h.xw();
      int j = com.tencent.mm.kernel.a.ww();
      int i = 0;
      while (i < paramInt)
      {
        NativeLogic.checkSoftType(str, j);
        i += 1;
      }
      GMTrace.o(17527761534976L, 130592);
    }
    
    public final void rU(int paramInt)
    {
      GMTrace.i(17527895752704L, 130593);
      Context localContext = ab.getContext();
      String str = localContext.getApplicationInfo().sourceDir;
      h.xw();
      int j = com.tencent.mm.kernel.a.ww();
      int i = 0;
      while (i < paramInt)
      {
        NativeLogic.checkSoftType2(localContext, str, j);
        i += 1;
      }
      GMTrace.o(17527895752704L, 130593);
    }
    
    public final void rV(int paramInt)
    {
      GMTrace.i(17528029970432L, 130594);
      Context localContext = ab.getContext();
      int i = 0;
      while (i < paramInt)
      {
        NativeLogic.checkSoftType3(localContext);
        i += 1;
      }
      GMTrace.o(17528029970432L, 130594);
    }
    
    public final void rW(int paramInt)
    {
      int j = 0;
      GMTrace.i(17528164188160L, 130595);
      Context localContext = ab.getContext();
      TreeSet localTreeSet = new TreeSet();
      int i = 0;
      while (i < paramInt)
      {
        localTreeSet.clear();
        NativeLogic.checkSoftType4(localContext, localTreeSet, false);
        i += 1;
      }
      Toast.makeText(localContext, localTreeSet.toString(), 1).show();
      i = j;
      while (i < paramInt)
      {
        localTreeSet.clear();
        NativeLogic.checkSoftType4(localContext, localTreeSet, true);
        i += 1;
      }
      Toast.makeText(localContext, localTreeSet.toString(), 1).show();
      GMTrace.o(17528164188160L, 130595);
    }
    
    public final void rX(int paramInt)
    {
      GMTrace.i(17528298405888L, 130596);
      Context localContext = ab.getContext();
      int i = 0;
      while (i < paramInt)
      {
        Toast.makeText(localContext, String.valueOf(NativeLogic.checkSoftType5()), 1).show();
        i += 1;
      }
      GMTrace.o(17528298405888L, 130596);
    }
    
    public final void rY(int paramInt)
    {
      GMTrace.i(18977715650560L, 141395);
      Context localContext = ab.getContext();
      int i = 0;
      while (i < paramInt)
      {
        Toast.makeText(localContext, String.valueOf(NativeLogic.checkSoftType6(",")), 1).show();
        i += 1;
      }
      GMTrace.o(18977715650560L, 141395);
    }
    
    public final void rZ(int paramInt)
    {
      GMTrace.i(18977849868288L, 141396);
      Context localContext = ab.getContext();
      int i = 0;
      while (i < paramInt)
      {
        Toast.makeText(localContext, String.valueOf(NativeLogic.checkSoftType7()), 1).show();
        i += 1;
      }
      GMTrace.o(18977849868288L, 141396);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\normsg\utils\NativeLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */