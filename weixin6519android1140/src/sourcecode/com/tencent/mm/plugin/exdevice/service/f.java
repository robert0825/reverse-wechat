package com.tencent.mm.plugin.exdevice.service;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class f
{
  public HashMap<Long, a> kDb;
  
  public f()
  {
    GMTrace.i(11145977004032L, 83044);
    this.kDb = new HashMap();
    GMTrace.o(11145977004032L, 83044);
  }
  
  private void bM(long paramLong)
  {
    GMTrace.i(11147050745856L, 83052);
    b localb = ad.atR().wS(String.valueOf(paramLong));
    if (localb == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceInfoManager", "get harddevice info from db failed : %d", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(11147050745856L, 83052);
      return;
    }
    a locala = new a();
    locala.kDc = paramLong;
    locala.kDe = localb.field_authBuf;
    locala.aGR = localb.field_sessionKey;
    locala.kDd = localb.field_sessionBuf;
    locala.eEs = localb.field_brandName;
    locala.mURL = localb.field_url;
    locala.eFl = 0;
    locala.kDf = false;
    this.kDb.put(Long.valueOf(paramLong), locala);
    w.i("MicroMsg.exdevice.ExdeviceInfoManager", "not contains the device info, device id = %d, load from db", new Object[] { Long.valueOf(paramLong) });
    GMTrace.o(11147050745856L, 83052);
  }
  
  public final void a(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(11147319181312L, 83054);
    if ((paramLong < 0L) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      boolean bool;
      if (paramArrayOfByte == null)
      {
        bool = true;
        if (paramArrayOfByte != null) {
          break label86;
        }
      }
      label86:
      for (paramInt = -1;; paramInt = paramArrayOfByte.length)
      {
        w.e("MicroMsg.exdevice.ExdeviceInfoManager", "device id low than 0 or authbuf is null, deviceid = %d, buffer == null : %b, buffer length = %d", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(bool), Integer.valueOf(paramInt) });
        GMTrace.o(11147319181312L, 83054);
        return;
        bool = false;
        break;
      }
    }
    a locala2 = (a)this.kDb.get(Long.valueOf(paramLong));
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new a();
      locala1.kDc = paramLong;
    }
    switch (paramInt)
    {
    default: 
      w.e("MicroMsg.exdevice.ExdeviceInfoManager", "unkown buffer type : %d", new Object[] { Integer.valueOf(paramInt) });
    }
    for (;;)
    {
      this.kDb.put(Long.valueOf(paramLong), locala1);
      GMTrace.o(11147319181312L, 83054);
      return;
      locala1.kDe = paramArrayOfByte;
      continue;
      locala1.aGR = paramArrayOfByte;
      continue;
      locala1.kDd = paramArrayOfByte;
    }
  }
  
  public final boolean bF(long paramLong)
  {
    GMTrace.i(11146111221760L, 83045);
    if (bG(paramLong) == 2)
    {
      GMTrace.o(11146111221760L, 83045);
      return true;
    }
    GMTrace.o(11146111221760L, 83045);
    return false;
  }
  
  public final int bG(long paramLong)
  {
    GMTrace.i(11146245439488L, 83046);
    if (this.kDb.containsKey(Long.valueOf(paramLong)))
    {
      int i = ((a)this.kDb.get(Long.valueOf(paramLong))).eFl;
      GMTrace.o(11146245439488L, 83046);
      return i;
    }
    GMTrace.o(11146245439488L, 83046);
    return 0;
  }
  
  public final a bH(long paramLong)
  {
    GMTrace.i(11146379657216L, 83047);
    if (!this.kDb.containsKey(Long.valueOf(paramLong))) {
      bM(paramLong);
    }
    a locala = (a)this.kDb.get(Long.valueOf(paramLong));
    GMTrace.o(11146379657216L, 83047);
    return locala;
  }
  
  public final a bI(long paramLong)
  {
    GMTrace.i(11146513874944L, 83048);
    if (this.kDb.containsKey(Long.valueOf(paramLong)))
    {
      locala = (a)this.kDb.get(Long.valueOf(paramLong));
      GMTrace.o(11146513874944L, 83048);
      return locala;
    }
    a locala = new a();
    locala.kDc = paramLong;
    locala.kDe = null;
    locala.aGR = null;
    locala.kDd = null;
    locala.eEs = null;
    locala.mURL = null;
    locala.eFl = 0;
    locala.kDf = false;
    locala.jlY = 0L;
    this.kDb.put(Long.valueOf(paramLong), locala);
    GMTrace.o(11146513874944L, 83048);
    return locala;
  }
  
  public final boolean bJ(long paramLong)
  {
    GMTrace.i(11146648092672L, 83049);
    w.i("MicroMsg.exdevice.ExdeviceInfoManager", "setDeviceAuthFlag, device id = %d", new Object[] { Long.valueOf(paramLong) });
    a locala = bH(paramLong);
    if (locala == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
      GMTrace.o(11146648092672L, 83049);
      return false;
    }
    locala.kDf = true;
    GMTrace.o(11146648092672L, 83049);
    return true;
  }
  
  public final boolean bK(long paramLong)
  {
    GMTrace.i(11146782310400L, 83050);
    w.i("MicroMsg.exdevice.ExdeviceInfoManager", "delDeviceAuthFlag, device id = %d", new Object[] { Long.valueOf(paramLong) });
    a locala = bH(paramLong);
    if (locala == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
      GMTrace.o(11146782310400L, 83050);
      return false;
    }
    locala.kDf = false;
    GMTrace.o(11146782310400L, 83050);
    return true;
  }
  
  public final boolean bL(long paramLong)
  {
    GMTrace.i(11146916528128L, 83051);
    w.i("MicroMsg.exdevice.ExdeviceInfoManager", "isDeviceAuthed, device id = %d", new Object[] { Long.valueOf(paramLong) });
    a locala = bH(paramLong);
    if (locala == null)
    {
      w.e("MicroMsg.exdevice.ExdeviceInfoManager", "getExDeviceInfo failed!!!");
      GMTrace.o(11146916528128L, 83051);
      return false;
    }
    boolean bool = locala.kDf;
    GMTrace.o(11146916528128L, 83051);
    return bool;
  }
  
  public final byte[] l(long paramLong, int paramInt)
  {
    GMTrace.i(11147184963584L, 83053);
    if (paramLong < 0L)
    {
      w.e("MicroMsg.exdevice.ExdeviceInfoManager", "device is lower than 0");
      GMTrace.o(11147184963584L, 83053);
      return null;
    }
    a locala = (a)this.kDb.get(Long.valueOf(paramLong));
    Object localObject = locala;
    if (locala == null)
    {
      bM(paramLong);
      localObject = (a)this.kDb.get(Long.valueOf(paramLong));
    }
    if (localObject == null)
    {
      GMTrace.o(11147184963584L, 83053);
      return null;
    }
    switch (paramInt)
    {
    default: 
      localObject = null;
    }
    for (;;)
    {
      GMTrace.o(11147184963584L, 83053);
      return (byte[])localObject;
      localObject = ((a)localObject).kDe;
      continue;
      localObject = ((a)localObject).aGR;
      continue;
      localObject = ((a)localObject).kDd;
    }
  }
  
  public static final class a
  {
    public byte[] aGR;
    public String eEs;
    public int eFl;
    public long jlY;
    public long kDc;
    public byte[] kDd;
    public byte[] kDe;
    public boolean kDf;
    public String mURL;
    
    public a()
    {
      GMTrace.i(11158056599552L, 83134);
      GMTrace.o(11158056599552L, 83134);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */