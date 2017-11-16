package com.tencent.mm.plugin.sport.c;

import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sport.PluginSport;
import com.tencent.mm.sdk.platformtools.ab;

public final class h
{
  public static long J(int paramInt, long paramLong)
  {
    GMTrace.i(16730910883840L, 124655);
    if (ab.bPY())
    {
      paramLong = ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getSportFileStorage().getLong(paramInt, paramLong);
      GMTrace.o(16730910883840L, 124655);
      return paramLong;
    }
    paramLong = new g(com.tencent.mm.plugin.sport.b.a.qqs).getLong(paramInt, paramLong);
    GMTrace.o(16730910883840L, 124655);
    return paramLong;
  }
  
  public static void K(int paramInt, long paramLong)
  {
    GMTrace.i(16731045101568L, 124656);
    if (ab.bPY())
    {
      ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getSportFileStorage().setLong(paramInt, paramLong);
      GMTrace.o(16731045101568L, 124656);
      return;
    }
    throw new RuntimeException(String.format("not support set value in %s process", new Object[] { ab.vM() }));
  }
  
  public static void L(int paramInt, long paramLong)
  {
    GMTrace.i(16731313537024L, 124658);
    if (ab.bQb())
    {
      ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getSportFileStorage().setLong(paramInt, paramLong);
      GMTrace.o(16731313537024L, 124658);
      return;
    }
    if (ab.bPY())
    {
      com.tencent.mm.plugin.sport.a.a locala = ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getDeviceStepManager().qqx;
      if (locala != null) {
        try
        {
          locala.H(paramInt, paramLong);
          GMTrace.o(16731313537024L, 124658);
          return;
        }
        catch (RemoteException localRemoteException) {}
      }
    }
    GMTrace.o(16731313537024L, 124658);
  }
  
  public static g brc()
  {
    GMTrace.i(16730776666112L, 124654);
    g localg;
    if (ab.bPY())
    {
      localg = new g(com.tencent.mm.plugin.sport.b.a.qqs);
      GMTrace.o(16730776666112L, 124654);
      return localg;
    }
    if (ab.bQb())
    {
      localg = new g(com.tencent.mm.plugin.sport.b.a.qqr);
      GMTrace.o(16730776666112L, 124654);
      return localg;
    }
    GMTrace.o(16730776666112L, 124654);
    return null;
  }
  
  public static long vO(int paramInt)
  {
    GMTrace.i(16731179319296L, 124657);
    if (ab.bQb())
    {
      l = ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getSportFileStorage().getLong(paramInt, 0L);
      GMTrace.o(16731179319296L, 124657);
      return l;
    }
    if (ab.bPY())
    {
      com.tencent.mm.plugin.sport.a.a locala = ((PluginSport)com.tencent.mm.kernel.h.j(PluginSport.class)).getDeviceStepManager().qqx;
      if (locala != null) {
        try
        {
          l = locala.getLong(paramInt, 0L);
          GMTrace.o(16731179319296L, 124657);
          return l;
        }
        catch (RemoteException localRemoteException) {}
      }
    }
    long l = new g(com.tencent.mm.plugin.sport.b.a.qqr).getLong(paramInt, 0L);
    GMTrace.o(16731179319296L, 124657);
    return l;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sport\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */