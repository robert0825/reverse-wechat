package com.tencent.mm.plugin.sport.b;

import android.content.Context;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.plugin.sport.c.e;
import com.tencent.mm.plugin.sport.c.g;
import com.tencent.mm.plugin.sport.c.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class c
  implements b
{
  public c()
  {
    GMTrace.i(16726884352000L, 124625);
    GMTrace.o(16726884352000L, 124625);
  }
  
  public final void I(int paramInt, long paramLong)
  {
    GMTrace.i(16727555440640L, 124630);
    com.tencent.mm.plugin.sport.c.h.L(paramInt, paramLong);
    GMTrace.o(16727555440640L, 124630);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    GMTrace.i(16727152787456L, 124627);
    paramString1 = new e(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, 1);
    com.tencent.mm.kernel.h.wS().a(paramString1, 0);
    GMTrace.o(16727152787456L, 124627);
  }
  
  public final void bqQ()
  {
    GMTrace.i(16727018569728L, 124626);
    com.tencent.mm.plugin.sport.c.a locala = ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getDeviceStepManager();
    w.i("MicroMsg.Sport.DeviceStepManager", "uploadDeviceStep");
    locala.bqW();
    locala.ee(locala.bqV());
    GMTrace.o(16727018569728L, 124626);
  }
  
  public final boolean bqR()
  {
    GMTrace.i(16727421222912L, 124629);
    boolean bool = k.bqR();
    GMTrace.o(16727421222912L, 124629);
    return bool;
  }
  
  public final void bqS()
  {
    GMTrace.i(16727689658368L, 124631);
    com.tencent.mm.plugin.sport.a.a locala;
    if (ab.bPY())
    {
      ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getSportFileStorage().reset();
      locala = ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getDeviceStepManager().qqx;
      if (locala == null) {}
    }
    try
    {
      locala.clearConfig();
      new File(a.qqr).delete();
      GMTrace.o(16727689658368L, 124631);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public final boolean dh(Context paramContext)
  {
    GMTrace.i(16727287005184L, 124628);
    boolean bool = k.dh(paramContext);
    GMTrace.o(16727287005184L, 124628);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */