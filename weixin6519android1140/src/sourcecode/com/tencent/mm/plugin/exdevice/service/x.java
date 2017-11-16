package com.tencent.mm.plugin.exdevice.service;

import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class x
  implements m
{
  private h kDl;
  
  public x(h paramh)
  {
    GMTrace.i(11131213053952L, 82934);
    this.kDl = paramh;
    GMTrace.o(11131213053952L, 82934);
  }
  
  public final long a(p paramp)
  {
    GMTrace.i(11132018360320L, 82940);
    try
    {
      long l = this.kDl.a(paramp);
      GMTrace.o(11132018360320L, 82940);
      return l;
    }
    catch (RemoteException paramp)
    {
      w.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "startTask failed!!! %s", new Object[] { paramp.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramp, "", new Object[0]);
      GMTrace.o(11132018360320L, 82940);
    }
    return -1L;
  }
  
  public final boolean a(long paramLong, int paramInt, k paramk)
  {
    GMTrace.i(11131749924864L, 82938);
    u.aus().bK(paramLong);
    try
    {
      boolean bool = this.kDl.a(paramLong, paramInt, paramk);
      GMTrace.o(11131749924864L, 82938);
      return bool;
    }
    catch (RemoteException paramk)
    {
      w.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "startChannel failed!!! %s", new Object[] { paramk.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramk, "", new Object[0]);
      GMTrace.o(11131749924864L, 82938);
    }
    return false;
  }
  
  public final boolean a(long paramLong, k paramk)
  {
    GMTrace.i(11133092102144L, 82948);
    try
    {
      boolean bool = this.kDl.b(paramLong, 0, paramk);
      GMTrace.o(11133092102144L, 82948);
      return bool;
    }
    catch (RemoteException paramk)
    {
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramk, "", new Object[0]);
      GMTrace.o(11133092102144L, 82948);
    }
    return false;
  }
  
  public final boolean a(i parami)
  {
    GMTrace.i(11132152578048L, 82941);
    try
    {
      boolean bool = this.kDl.a(parami);
      GMTrace.o(11132152578048L, 82941);
      return bool;
    }
    catch (RemoteException parami)
    {
      w.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "registOnDeviceRequest failed!!! %s", new Object[] { parami.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", parami, "", new Object[0]);
      GMTrace.o(11132152578048L, 82941);
    }
    return false;
  }
  
  public final boolean a(j paramj)
  {
    GMTrace.i(11132823666688L, 82946);
    try
    {
      boolean bool = this.kDl.d(0, paramj);
      GMTrace.o(11132823666688L, 82946);
      return bool;
    }
    catch (RemoteException paramj)
    {
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
      GMTrace.o(11132823666688L, 82946);
    }
    return false;
  }
  
  public final boolean a(s params)
  {
    GMTrace.i(11133360537600L, 82950);
    try
    {
      boolean bool = this.kDl.a(params);
      GMTrace.o(11133360537600L, 82950);
      return bool;
    }
    catch (RemoteException params)
    {
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", params, "", new Object[0]);
      GMTrace.o(11133360537600L, 82950);
    }
    return false;
  }
  
  public final boolean a(String paramString, boolean paramBoolean, q paramq)
  {
    GMTrace.i(11132421013504L, 82943);
    w.i("MicroMsg.exdevice.RDeviceTaskDispatcher", "ranging, uuid = %s, op = %s", new Object[] { paramString, String.valueOf(paramBoolean) });
    try
    {
      paramBoolean = this.kDl.a(paramString, paramBoolean, paramq);
      GMTrace.o(11132421013504L, 82943);
      return paramBoolean;
    }
    catch (RemoteException paramString)
    {
      w.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "mDispatcher.ranging failed!!!(%s)", new Object[] { paramString.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramString, "", new Object[0]);
      GMTrace.o(11132421013504L, 82943);
    }
    return false;
  }
  
  public final long[] aug()
  {
    GMTrace.i(11131615707136L, 82937);
    try
    {
      long[] arrayOfLong = this.kDl.aug();
      GMTrace.o(11131615707136L, 82937);
      return arrayOfLong;
    }
    catch (RemoteException localRemoteException)
    {
      w.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "getDeviceList failed!!! %s", new Object[] { localRemoteException.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", localRemoteException, "", new Object[0]);
      GMTrace.o(11131615707136L, 82937);
    }
    return null;
  }
  
  public final boolean b(int paramInt, j paramj)
  {
    GMTrace.i(11131347271680L, 82935);
    try
    {
      boolean bool = this.kDl.b(paramInt, paramj);
      GMTrace.o(11131347271680L, 82935);
      return bool;
    }
    catch (RemoteException paramj)
    {
      w.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "scan failed!!! %s", new Object[] { paramj.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
      GMTrace.o(11131347271680L, 82935);
    }
    return false;
  }
  
  public final boolean b(long paramLong, byte[] paramArrayOfByte, t paramt)
  {
    GMTrace.i(11133494755328L, 82951);
    try
    {
      boolean bool = this.kDl.b(paramLong, paramArrayOfByte, paramt);
      GMTrace.o(11133494755328L, 82951);
      return bool;
    }
    catch (RemoteException paramArrayOfByte)
    {
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(11133494755328L, 82951);
    }
    return false;
  }
  
  public final boolean b(j paramj)
  {
    GMTrace.i(11132957884416L, 82947);
    try
    {
      boolean bool = this.kDl.e(0, paramj);
      GMTrace.o(11132957884416L, 82947);
      return bool;
    }
    catch (RemoteException paramj)
    {
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
      GMTrace.o(11132957884416L, 82947);
    }
    return false;
  }
  
  public final boolean b(n paramn)
  {
    GMTrace.i(11132555231232L, 82944);
    try
    {
      this.kDl.a(paramn);
      GMTrace.o(11132555231232L, 82944);
      return true;
    }
    catch (RemoteException paramn)
    {
      w.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "mDispatcher.registExDeviceInvokerHandler failed!!, %s", new Object[] { paramn.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramn, "", new Object[0]);
      GMTrace.o(11132555231232L, 82944);
    }
    return false;
  }
  
  public final boolean bN(long paramLong)
  {
    GMTrace.i(11131884142592L, 82939);
    u.aus().bK(paramLong);
    try
    {
      boolean bool = this.kDl.bN(paramLong);
      GMTrace.o(11131884142592L, 82939);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      w.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "stopChannel failed!!! %s", new Object[] { localRemoteException.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", localRemoteException, "", new Object[0]);
      GMTrace.o(11131884142592L, 82939);
    }
    return false;
  }
  
  public final boolean bQ(long paramLong)
  {
    GMTrace.i(11133226319872L, 82949);
    try
    {
      boolean bool = this.kDl.bQ(paramLong);
      GMTrace.o(11133226319872L, 82949);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", localRemoteException, "", new Object[0]);
      GMTrace.o(11133226319872L, 82949);
    }
    return false;
  }
  
  public final boolean c(int paramInt, j paramj)
  {
    GMTrace.i(11131481489408L, 82936);
    try
    {
      boolean bool = this.kDl.c(paramInt, paramj);
      GMTrace.o(11131481489408L, 82936);
      return bool;
    }
    catch (RemoteException paramj)
    {
      w.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "stopScan failed!!! %s", new Object[] { paramj.getMessage() });
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
      GMTrace.o(11131481489408L, 82936);
    }
    return false;
  }
  
  public final void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte)
  {
    GMTrace.i(11132286795776L, 82942);
    w.i("MicroMsg.exdevice.RDeviceTaskDispatcher", "------setChannelSessionKey------ deviceId = %d", new Object[] { Long.valueOf(paramLong) });
    try
    {
      this.kDl.setChannelSessionKey(paramLong, paramArrayOfByte);
      GMTrace.o(11132286795776L, 82942);
      return;
    }
    catch (RemoteException paramArrayOfByte)
    {
      w.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(11132286795776L, 82942);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */