package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.magicbox.IPxxLogic.ICallBack;
import com.tencent.mars.mm.MMLogic;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class p
  implements IPxxLogic.ICallBack
{
  private static long hgp;
  private static int hgq;
  private final String TAG;
  
  static
  {
    GMTrace.i(13704972206080L, 102110);
    hgp = 0L;
    hgq = 0;
    GMTrace.o(13704972206080L, 102110);
  }
  
  public p()
  {
    GMTrace.i(13703764246528L, 102101);
    this.TAG = "IPxxCallback";
    GMTrace.o(13703764246528L, 102101);
  }
  
  private static void hu(int paramInt)
  {
    GMTrace.i(13704837988352L, 102109);
    try
    {
      t localt = aa.OY();
      g localg = localt.hgD;
      if (localg != null) {
        try
        {
          localt.hgD.cY(paramInt);
          GMTrace.o(13704837988352L, 102109);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          w.e("MicroMsg.AutoAuth", "exception:%s", new Object[] { bg.f(localRemoteException) });
        }
      }
      GMTrace.o(13704837988352L, 102109);
      return;
    }
    catch (Exception localException)
    {
      w.e("IPxxCallback", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13704837988352L, 102109);
    }
  }
  
  public final String getCrashFilePath(int paramInt)
  {
    GMTrace.i(13704166899712L, 102104);
    Object localObject = new Date(System.currentTimeMillis() - paramInt * 86400000L);
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd");
    localObject = com.tencent.mm.compatible.util.e.ghA + "crash_" + localSimpleDateFormat.format((Date)localObject) + ".txt";
    if (com.tencent.mm.a.e.aZ((String)localObject))
    {
      GMTrace.o(13704166899712L, 102104);
      return (String)localObject;
    }
    GMTrace.o(13704166899712L, 102104);
    return null;
  }
  
  public final String getUplodLogExtrasInfo()
  {
    GMTrace.i(13703898464256L, 102102);
    try
    {
      Object localObject = new StringBuffer();
      ((StringBuffer)localObject).append("Device:").append(d.tJw).append(" ").append(d.tJx).append("\n");
      localObject = ((StringBuffer)localObject).toString();
      GMTrace.o(13703898464256L, 102102);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      GMTrace.o(13703898464256L, 102102);
    }
    return null;
  }
  
  public final void recoverLinkAddrs()
  {
    GMTrace.i(13704301117440L, 102105);
    MMLogic.recoverLinkAddrs();
    GMTrace.o(13704301117440L, 102105);
  }
  
  public final void setNewDnsDebugHostInfo(String paramString, int paramInt)
  {
    GMTrace.i(13704032681984L, 102103);
    MMLogic.setNewDnsDebugHost(paramString, String.valueOf(paramInt));
    GMTrace.o(13704032681984L, 102103);
  }
  
  public final void uploadLogFail()
  {
    GMTrace.i(13704569552896L, 102107);
    hgq = 0;
    hu(-1);
    GMTrace.o(13704569552896L, 102107);
  }
  
  public final void uploadLogResponse(long paramLong1, long paramLong2)
  {
    GMTrace.i(13704435335168L, 102106);
    w.i("IPxxCallback", "ipxx progress totalSize:%d uploadSize:%d lastPercent:%d ", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(hgq) });
    long l = bg.Pu();
    if (l - 1L < hgp)
    {
      GMTrace.o(13704435335168L, 102106);
      return;
    }
    hgp = l;
    int j = 0;
    int i = j;
    if (paramLong2 >= 0L)
    {
      i = j;
      if (paramLong1 > 0L)
      {
        i = j;
        if (paramLong2 < paramLong1) {
          i = (int)(100L * paramLong2 / paramLong1);
        }
      }
    }
    j = i;
    if (i > 100) {
      j = 100;
    }
    i = j;
    if (hgq > j) {
      i = hgq;
    }
    hgq = i;
    hu(i);
    GMTrace.o(13704435335168L, 102106);
  }
  
  public final void uploadLogSuccess()
  {
    GMTrace.i(13704703770624L, 102108);
    hgq = 0;
    hu(100);
    GMTrace.o(13704703770624L, 102108);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */