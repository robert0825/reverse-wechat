package com.tencent.mm.ad;

import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.c;
import com.tencent.mm.network.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class o
  implements c
{
  private final d guH;
  
  public o(d paramd)
  {
    GMTrace.i(13425799331840L, 100030);
    this.guH = paramd;
    GMTrace.o(13425799331840L, 100030);
  }
  
  private String getUsername()
  {
    GMTrace.i(13426336202752L, 100034);
    try
    {
      String str = this.guH.getUsername();
      GMTrace.o(13426336202752L, 100034);
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(localRemoteException) });
      GMTrace.o(13426336202752L, 100034);
    }
    return null;
  }
  
  public final int A(byte[] paramArrayOfByte)
  {
    GMTrace.i(13427946815488L, 100046);
    try
    {
      int i = this.guH.A(paramArrayOfByte);
      GMTrace.o(13427946815488L, 100046);
      return i;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("MicroMsg.RAccInfo", "AccInfoCacheInWorker parseBuf exception:%s", new Object[] { bg.f(paramArrayOfByte) });
      GMTrace.o(13427946815488L, 100046);
    }
    return -6;
  }
  
  public final byte[] DT()
  {
    GMTrace.i(13425933549568L, 100031);
    try
    {
      byte[] arrayOfByte = this.guH.DT();
      GMTrace.o(13425933549568L, 100031);
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(localRemoteException) });
      GMTrace.o(13425933549568L, 100031);
    }
    return null;
  }
  
  public final boolean DU()
  {
    GMTrace.i(13426470420480L, 100035);
    try
    {
      boolean bool = this.guH.DU();
      GMTrace.o(13426470420480L, 100035);
      return bool;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13426470420480L, 100035);
    }
    return false;
  }
  
  public final byte[] DV()
  {
    GMTrace.i(13427409944576L, 100042);
    try
    {
      byte[] arrayOfByte = this.guH.DV();
      GMTrace.o(13427409944576L, 100042);
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(localRemoteException) });
      GMTrace.o(13427409944576L, 100042);
    }
    return null;
  }
  
  public final boolean DW()
  {
    GMTrace.i(13427678380032L, 100044);
    try
    {
      boolean bool = this.guH.DW();
      GMTrace.o(13427678380032L, 100044);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(localRemoteException) });
      GMTrace.o(13427678380032L, 100044);
    }
    return true;
  }
  
  public final byte[] DX()
  {
    GMTrace.i(13427812597760L, 100045);
    try
    {
      byte[] arrayOfByte = this.guH.DX();
      GMTrace.o(13427812597760L, 100045);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RAccInfo", "AccInfoCacheInWorker getCacheBuffer exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13427812597760L, 100045);
    }
    return null;
  }
  
  public final void bl(boolean paramBoolean)
  {
    GMTrace.i(13427544162304L, 100043);
    try
    {
      this.guH.bl(paramBoolean);
      GMTrace.o(13427544162304L, 100043);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(localRemoteException) });
      GMTrace.o(13427544162304L, 100043);
    }
  }
  
  public final void dp(int paramInt)
  {
    GMTrace.i(13428081033216L, 100047);
    try
    {
      this.guH.dp(paramInt);
      GMTrace.o(13428081033216L, 100047);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(localException) });
      GMTrace.o(13428081033216L, 100047);
    }
  }
  
  public final void g(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(13427141509120L, 100040);
    try
    {
      this.guH.g(paramString, paramArrayOfByte);
      GMTrace.o(13427141509120L, 100040);
      return;
    }
    catch (RemoteException paramString)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(13427141509120L, 100040);
    }
  }
  
  public final void i(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(13426738855936L, 100037);
    try
    {
      this.guH.i(paramArrayOfByte, paramInt);
      GMTrace.o(13426738855936L, 100037);
      return;
    }
    catch (RemoteException paramArrayOfByte)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(paramArrayOfByte) });
      GMTrace.o(13426738855936L, 100037);
    }
  }
  
  public final byte[] ii(String paramString)
  {
    GMTrace.i(13427275726848L, 100041);
    try
    {
      paramString = this.guH.ii(paramString);
      GMTrace.o(13427275726848L, 100041);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(13427275726848L, 100041);
    }
    return null;
  }
  
  public final void reset()
  {
    GMTrace.i(13426873073664L, 100038);
    try
    {
      this.guH.reset();
      GMTrace.o(13426873073664L, 100038);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(localRemoteException) });
      GMTrace.o(13426873073664L, 100038);
    }
  }
  
  public final void setUsername(String paramString)
  {
    GMTrace.i(13426604638208L, 100036);
    try
    {
      this.guH.setUsername(paramString);
      GMTrace.o(13426604638208L, 100036);
      return;
    }
    catch (RemoteException paramString)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(paramString) });
      GMTrace.o(13426604638208L, 100036);
    }
  }
  
  public final String toString()
  {
    GMTrace.i(13427007291392L, 100039);
    String str = "RAccInfo:\n" + "|-uin     =" + ww() + "\n";
    str = str + "|-user    =" + getUsername() + "\n";
    str = str + "|-session =" + wR() + "\n";
    str = str + "|-ecdhkey =" + bg.bp(DV()) + "\n";
    str = str + "`-cookie  =" + bg.bp(DT());
    GMTrace.o(13427007291392L, 100039);
    return str;
  }
  
  public final byte[] wR()
  {
    GMTrace.i(13426067767296L, 100032);
    try
    {
      byte[] arrayOfByte = this.guH.wR();
      GMTrace.o(13426067767296L, 100032);
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(localRemoteException) });
      GMTrace.o(13426067767296L, 100032);
    }
    return null;
  }
  
  public final int ww()
  {
    GMTrace.i(13426201985024L, 100033);
    try
    {
      int i = this.guH.ww();
      GMTrace.o(13426201985024L, 100033);
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      w.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bg.f(localRemoteException) });
      GMTrace.o(13426201985024L, 100033);
    }
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ad\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */