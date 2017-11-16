package com.tencent.mm.plugin.walletlock.gesture.a;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.asc;
import com.tencent.mm.protocal.c.asd;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.io.IOException;

public final class d
{
  private static long rxf;
  
  static
  {
    GMTrace.i(20244194131968L, 150831);
    rxf = -1L;
    GMTrace.o(20244194131968L, 150831);
  }
  
  public static void a(asc paramasc)
  {
    GMTrace.i(20243388825600L, 150825);
    t localt = h.xy().xh();
    if (localt != null) {
      try
      {
        localt.set(339989, Base64.encodeToString(paramasc.toByteArray(), 2));
        localt.kL(true);
        w.v("MicroMsg.GestureGuardInfoManager", "alvinluo savePatternBuffer isUserSetGesturePwd: %b", new Object[] { Boolean.valueOf(e.bAG()) });
        GMTrace.o(20243388825600L, 150825);
        return;
      }
      catch (IOException paramasc)
      {
        w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", paramasc, "", new Object[0]);
      }
    }
    GMTrace.o(20243388825600L, 150825);
  }
  
  public static void a(asd paramasd)
  {
    GMTrace.i(20243657261056L, 150827);
    if (paramasd != null) {
      w.i("MicroMsg.GestureGuardInfoManager", "alvinluo saveSyncedPatternInfo version: %d, status: %d", new Object[] { Integer.valueOf(paramasd.uId), Integer.valueOf(paramasd.uIf) });
    }
    t localt = h.xy().xh();
    if (localt != null) {
      try
      {
        localt.set(339990, Base64.encodeToString(paramasd.toByteArray(), 2));
        localt.kL(true);
        GMTrace.o(20243657261056L, 150827);
        return;
      }
      catch (IOException paramasd)
      {
        w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", paramasd, "", new Object[0]);
      }
    }
    GMTrace.o(20243657261056L, 150827);
  }
  
  public static g bAI()
  {
    GMTrace.i(20242046648320L, 150815);
    Object localObject = h.xy().xh();
    if (localObject == null)
    {
      localObject = new g();
      GMTrace.o(20242046648320L, 150815);
      return (g)localObject;
    }
    localObject = ((t)localObject).get(339969, null);
    if (localObject == null)
    {
      localObject = new g();
      GMTrace.o(20242046648320L, 150815);
      return (g)localObject;
    }
    localObject = new g().aP(e.KQ((String)localObject));
    GMTrace.o(20242046648320L, 150815);
    return (g)localObject;
  }
  
  public static void bAJ()
  {
    GMTrace.i(20242315083776L, 150817);
    t localt = h.xy().xh();
    if (localt != null)
    {
      localt.set(339969, null);
      localt.kL(true);
    }
    GMTrace.o(20242315083776L, 150817);
  }
  
  public static g bAK()
  {
    GMTrace.i(20242851954688L, 150821);
    Object localObject = h.xy().xh();
    if (localObject == null)
    {
      localObject = new g();
      GMTrace.o(20242851954688L, 150821);
      return (g)localObject;
    }
    localObject = ((t)localObject).get(339971, null);
    if (localObject == null)
    {
      localObject = new g();
      GMTrace.o(20242851954688L, 150821);
      return (g)localObject;
    }
    localObject = new g().aP(e.KQ((String)localObject));
    GMTrace.o(20242851954688L, 150821);
    return (g)localObject;
  }
  
  public static void bAL()
  {
    GMTrace.i(20243120390144L, 150823);
    t localt = h.xy().xh();
    if (localt != null)
    {
      localt.set(339971, null);
      localt.kL(true);
    }
    GMTrace.o(20243120390144L, 150823);
  }
  
  public static asc bAM()
  {
    GMTrace.i(20243254607872L, 150824);
    Object localObject = h.xy().xh();
    if (localObject == null)
    {
      GMTrace.o(20243254607872L, 150824);
      return null;
    }
    localObject = (String)((t)localObject).get(339989, null);
    if (bg.nm((String)localObject))
    {
      GMTrace.o(20243254607872L, 150824);
      return null;
    }
    try
    {
      localObject = Base64.decode((String)localObject, 2);
      localObject = (asc)new asc().aD((byte[])localObject);
      GMTrace.o(20243254607872L, 150824);
      return (asc)localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIllegalArgumentException, "", new Object[0]);
      GMTrace.o(20243254607872L, 150824);
      return null;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIOException, "", new Object[0]);
      GMTrace.o(20243254607872L, 150824);
    }
    return null;
  }
  
  public static asd bAN()
  {
    GMTrace.i(20243523043328L, 150826);
    Object localObject = h.xy().xh();
    if (localObject == null)
    {
      w.e("MicroMsg.GestureGuardInfoManager", "alvinluo configstg is null");
      GMTrace.o(20243523043328L, 150826);
      return null;
    }
    localObject = (String)((t)localObject).get(339990, null);
    if (bg.nm((String)localObject))
    {
      GMTrace.o(20243523043328L, 150826);
      return null;
    }
    try
    {
      localObject = Base64.decode((String)localObject, 2);
      localObject = (asd)new asd().aD((byte[])localObject);
      GMTrace.o(20243523043328L, 150826);
      return (asd)localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIllegalArgumentException, "", new Object[0]);
      GMTrace.o(20243523043328L, 150826);
      return null;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIOException, "", new Object[0]);
      GMTrace.o(20243523043328L, 150826);
    }
    return null;
  }
  
  public static int bAO()
  {
    GMTrace.i(20243791478784L, 150828);
    Object localObject = h.xy().xh();
    if (localObject == null)
    {
      GMTrace.o(20243791478784L, 150828);
      return -1;
    }
    localObject = ((t)localObject).get(339972, null);
    if (localObject == null)
    {
      GMTrace.o(20243791478784L, 150828);
      return -1;
    }
    int i = ((Integer)localObject).intValue();
    GMTrace.o(20243791478784L, 150828);
    return i;
  }
  
  public static void bAP()
  {
    GMTrace.i(20244059914240L, 150830);
    t localt = h.xy().xh();
    if (localt != null)
    {
      localt.set(339972, null);
      localt.kL(true);
    }
    GMTrace.o(20244059914240L, 150830);
  }
  
  public static void bAx()
  {
    GMTrace.i(20242717736960L, 150820);
    rxf = -1L;
    GMTrace.o(20242717736960L, 150820);
  }
  
  public static long bAy()
  {
    GMTrace.i(20242449301504L, 150818);
    long l = rxf;
    GMTrace.o(20242449301504L, 150818);
    return l;
  }
  
  public static void ej(long paramLong)
  {
    GMTrace.i(20242583519232L, 150819);
    rxf = paramLong;
    GMTrace.o(20242583519232L, 150819);
  }
  
  public static void x(long paramLong1, long paramLong2)
  {
    GMTrace.i(20242180866048L, 150816);
    t localt = h.xy().xh();
    if (localt != null)
    {
      g localg = new g();
      localg.rxG = paramLong1;
      localg.rxH = paramLong2;
      localt.set(339969, e.aO(localg.toByteArray()));
      localt.kL(true);
    }
    GMTrace.o(20242180866048L, 150816);
  }
  
  public static void xe(int paramInt)
  {
    GMTrace.i(20243925696512L, 150829);
    t localt = h.xy().xh();
    if (localt != null)
    {
      localt.set(339972, Integer.valueOf(paramInt));
      localt.kL(true);
    }
    GMTrace.o(20243925696512L, 150829);
  }
  
  public static void y(long paramLong1, long paramLong2)
  {
    GMTrace.i(20242986172416L, 150822);
    t localt = h.xy().xh();
    if (localt != null)
    {
      g localg = new g();
      localg.rxG = paramLong1;
      localg.rxH = paramLong2;
      localt.set(339971, e.aO(localg.toByteArray()));
      localt.kL(true);
    }
    GMTrace.o(20242986172416L, 150822);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\gesture\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */