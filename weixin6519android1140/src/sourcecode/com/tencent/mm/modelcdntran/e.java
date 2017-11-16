package com.tencent.mm.modelcdntran;

import android.net.wifi.WifiInfo;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.cdn.CdnLogic.CdnInfoParams;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.ix;
import com.tencent.mm.protocal.c.iy;
import com.tencent.mm.protocal.c.xy;
import com.tencent.mm.protocal.c.xz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static long gAe;
  private static Map<String, a> gAf;
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  int scene;
  public long startTime;
  
  static
  {
    GMTrace.i(591229091840L, 4405);
    gAe = 0L;
    gAf = new HashMap();
    GMTrace.o(591229091840L, 4405);
  }
  
  protected e(int paramInt)
  {
    GMTrace.i(590021132288L, 4396);
    this.startTime = 0L;
    this.scene = 0;
    w.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn init Scene:%d  [%s]", new Object[] { Integer.valueOf(paramInt), bg.bQW() });
    b.a locala = new b.a();
    locala.gtF = new xy();
    locala.gtG = new xz();
    locala.uri = "/cgi-bin/micromsg-bin/getcdndns";
    locala.gtE = 379;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    this.scene = paramInt;
    ((xy)this.fUa.gtC.gtK).upq = "";
    GMTrace.o(590021132288L, 4396);
  }
  
  private static String Gg()
  {
    GMTrace.i(590289567744L, 4398);
    if (!am.isConnected(ab.getContext()))
    {
      GMTrace.o(590289567744L, 4398);
      return null;
    }
    if (am.isWifi(ab.getContext()))
    {
      localObject = am.getWifiInfo(ab.getContext());
      if (localObject == null)
      {
        GMTrace.o(590289567744L, 4398);
        return null;
      }
    }
    for (Object localObject = "wifi_" + ((WifiInfo)localObject).getSSID();; localObject = "mobile_" + am.getNetTypeString(ab.getContext()) + "_" + am.getISPCode(ab.getContext()))
    {
      w.d("MicroMsg.NetSceneGetCDNDns", "cdntra getCurCacheFullPath file:%s", new Object[] { localObject });
      if ((localObject != null) && (((String)localObject).length() >= 2)) {
        break;
      }
      GMTrace.o(590289567744L, 4398);
      return null;
    }
    localObject = String.format("%x", new Object[] { Integer.valueOf(((String)localObject).hashCode()) });
    StringBuilder localStringBuilder = new StringBuilder();
    g.Gh();
    localObject = g.Gi() + (String)localObject;
    GMTrace.o(590289567744L, 4398);
    return (String)localObject;
  }
  
  private static CdnLogic.CdnInfoParams a(ix paramix)
  {
    GMTrace.i(15218411307008L, 113386);
    CdnLogic.CdnInfoParams localCdnInfoParams = new CdnLogic.CdnInfoParams();
    localCdnInfoParams.c2CretryIntervalMs = paramix.tYa;
    localCdnInfoParams.c2CrwtimeoutMs = paramix.tYc;
    localCdnInfoParams.c2CshowErrorDelayMs = paramix.tXY;
    localCdnInfoParams.snsretryIntervalMs = paramix.tYb;
    localCdnInfoParams.snsrwtimeoutMs = paramix.tYd;
    localCdnInfoParams.snsshowErrorDelayMs = paramix.tXZ;
    GMTrace.o(15218411307008L, 113386);
    return localCdnInfoParams;
  }
  
  private static void e(byte[] paramArrayOfByte, String paramString)
  {
    GMTrace.i(590423785472L, 4399);
    if (bg.bq(paramArrayOfByte))
    {
      w.w("MicroMsg.NetSceneGetCDNDns", "saveToCache failed infoBuf is null");
      GMTrace.o(590423785472L, 4399);
      return;
    }
    paramString = Gg() + paramString;
    if (bg.nm(paramString))
    {
      GMTrace.o(590423785472L, 4399);
      return;
    }
    try
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte.length + 8);
      localByteBuffer.putLong(bg.Pu());
      localByteBuffer.put(paramArrayOfByte);
      com.tencent.mm.a.e.b(paramString, localByteBuffer.array(), localByteBuffer.array().length);
      GMTrace.o(590423785472L, 4399);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("MicroMsg.NetSceneGetCDNDns", "exception:%s", new Object[] { bg.f(paramArrayOfByte) });
      w.w("MicroMsg.NetSceneGetCDNDns", "saveToCache failed path:%s e:%s", new Object[] { paramString, paramArrayOfByte.getMessage() });
      GMTrace.o(590423785472L, 4399);
    }
  }
  
  private static void f(byte[] paramArrayOfByte, String paramString)
  {
    GMTrace.i(590826438656L, 4402);
    if (bg.bq(paramArrayOfByte))
    {
      w.w("MicroMsg.NetSceneGetCDNDns", "saveToCache failed infoBuf is null");
      GMTrace.o(590826438656L, 4402);
      return;
    }
    paramString = Gg() + paramString;
    if (bg.nm(paramString))
    {
      GMTrace.o(590826438656L, 4402);
      return;
    }
    try
    {
      com.tencent.mm.a.e.b(paramString, paramArrayOfByte, paramArrayOfByte.length);
      GMTrace.o(590826438656L, 4402);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("MicroMsg.NetSceneGetCDNDns", "exception:%s", new Object[] { bg.f(paramArrayOfByte) });
      w.w("MicroMsg.NetSceneGetCDNDns", "saveRuleToCache failed path:%s e:%s", new Object[] { paramString, paramArrayOfByte.getMessage() });
      GMTrace.o(590826438656L, 4402);
    }
  }
  
  private static iy jB(String paramString)
  {
    GMTrace.i(590558003200L, 4400);
    Object localObject = bg.aq(Gg(), "");
    if (bg.nm((String)localObject))
    {
      GMTrace.o(590558003200L, 4400);
      return null;
    }
    a locala = (a)gAf.get(localObject);
    if (locala == null)
    {
      w.e("MicroMsg.NetSceneGetCDNDns", "cdntra getFromCache  lastGetResult is null path:%s", new Object[] { localObject });
      GMTrace.o(590558003200L, 4400);
      return null;
    }
    paramString = (String)localObject + paramString;
    byte[] arrayOfByte = com.tencent.mm.a.e.d(paramString, 0, -1);
    if (bg.bq(arrayOfByte))
    {
      w.e("MicroMsg.NetSceneGetCDNDns", "cdntra getFromCache  read file failed:%s", new Object[] { paramString });
      locala.gAg = false;
      GMTrace.o(590558003200L, 4400);
      return null;
    }
    try
    {
      localObject = ByteBuffer.wrap(arrayOfByte);
      long l1 = ((ByteBuffer)localObject).getLong();
      long l2 = bg.Pu();
      if ((l2 - l1 > 3600L) || (l1 > l2))
      {
        w.w("MicroMsg.NetSceneGetCDNDns", "cdntra getFromCache  file is timeout remove it :%s, time[%d, %d]", new Object[] { paramString, Long.valueOf(l1), Long.valueOf(l2) });
        com.tencent.mm.loader.stub.b.deleteFile(paramString);
        locala.gAg = true;
        localObject = com.tencent.mm.plugin.report.service.g.ork;
        if (l1 > l2) {}
        for (l1 = 2L;; l1 = 3L)
        {
          ((com.tencent.mm.plugin.report.service.g)localObject).a(546L, l1, 1L, true);
          GMTrace.o(590558003200L, 4400);
          return null;
        }
      }
      arrayOfByte = new byte[arrayOfByte.length - 8];
      ((ByteBuffer)localObject).get(arrayOfByte);
      locala.gAg = false;
      localObject = (iy)new iy().aD(arrayOfByte);
      GMTrace.o(590558003200L, 4400);
      return (iy)localObject;
    }
    catch (Exception localException)
    {
      locala.gAg = false;
      w.e("MicroMsg.NetSceneGetCDNDns", "exception:%s", new Object[] { bg.f(localException) });
      w.w("MicroMsg.NetSceneGetCDNDns", "parse from file failed :%s  e:%s", new Object[] { paramString, localException.getMessage() });
      GMTrace.o(590558003200L, 4400);
    }
    return null;
  }
  
  private static byte[] jC(String paramString)
  {
    GMTrace.i(590692220928L, 4401);
    Object localObject = Gg();
    if (bg.nm((String)localObject))
    {
      GMTrace.o(590692220928L, 4401);
      return null;
    }
    paramString = (String)localObject + paramString;
    localObject = com.tencent.mm.a.e.d(paramString, 0, -1);
    if (bg.bq((byte[])localObject))
    {
      w.e("MicroMsg.NetSceneGetCDNDns", "cdntra getRuleFromCache  read file failed:%s", new Object[] { paramString });
      GMTrace.o(590692220928L, 4401);
      return null;
    }
    GMTrace.o(590692220928L, 4401);
    return (byte[])localObject;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(590155350016L, 4397);
    this.fUd = parame1;
    h.xw();
    int i = a.ww();
    if (i == 0)
    {
      w.e("MicroMsg.NetSceneGetCDNDns", "has not set uin.");
      GMTrace.o(590155350016L, 4397);
      return -1;
    }
    if (gAe != i)
    {
      gAe = i;
      gAf.clear();
    }
    long l = bg.Pu();
    Object localObject;
    if (this.scene == 0)
    {
      localObject = bg.aq(Gg(), "");
      parame1 = (a)gAf.get(localObject);
      if (parame1 != null) {
        break label702;
      }
      parame1 = new a();
      gAf.put(localObject, parame1);
    }
    label696:
    label702:
    for (;;)
    {
      iy localiy1 = jB("");
      iy localiy2 = jB("sns");
      iy localiy3 = jB("app");
      iy localiy4 = jB("safec2c");
      byte[] arrayOfByte1 = jC("c2crule");
      byte[] arrayOfByte2 = jC("safec2crule");
      w.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn doScene info[%s], safec2cinfo[%s], path[%s], lastGetResult[%s]", new Object[] { localiy1, localiy4, localObject, parame1 });
      if ((localiy1 != null) && (arrayOfByte1 != null))
      {
        boolean bool = g.Gl().a(localiy1, localiy2, localiy3, arrayOfByte1, arrayOfByte2, localiy4);
        w.i("MicroMsg.NetSceneGetCDNDns", "cdntra getfromcache succ , setCDNDnsInfo :%b ", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          GMTrace.o(590155350016L, 4397);
          return -1;
        }
      }
      if (parame1.gAg)
      {
        parame1.gAh = l;
        parame1.gAi = l;
        parame1.gAj = 0L;
      }
      w.d("MicroMsg.NetSceneGetCDNDns", "cdntra doscene Sec:%d Hour[%d,%d]", new Object[] { Long.valueOf(l - parame1.gAh), Long.valueOf(l - parame1.gAi), Long.valueOf(parame1.gAj) });
      if ((l > parame1.gAh) && (l - parame1.gAh < 10L))
      {
        w.w("MicroMsg.NetSceneGetCDNDns", "Last get dns at %d ago . ignore!, lastGetResult[%s]", new Object[] { Long.valueOf(l - parame1.gAh), parame1 });
        GMTrace.o(590155350016L, 4397);
        return -1;
      }
      if ((l > parame1.gAi) && (l - parame1.gAi < 3600L) && (parame1.gAj >= 90L))
      {
        w.w("MicroMsg.NetSceneGetCDNDns", "in 1 hour , get dns more than 90  (%d). ignore!, lastGetResult[%s]", new Object[] { Long.valueOf(l - parame1.gAi), parame1 });
        GMTrace.o(590155350016L, 4397);
        return -1;
      }
      parame1.gAh = l;
      if ((l < parame1.gAi) || (l - parame1.gAj > 3600L))
      {
        parame1.gAi = l;
        parame1.gAj = 0L;
        this.startTime = l;
        parame1 = com.tencent.mm.plugin.report.service.g.ork;
        if (this.scene != 0) {
          break label696;
        }
      }
      for (l = 0L;; l = 1L)
      {
        parame1.a(546L, l, 1L, true);
        i = a(parame, this.fUa, this);
        GMTrace.o(590155350016L, 4397);
        return i;
        parame1.gAj += 1L;
        break;
        parame1 = gAf.values().iterator();
        if (parame1 == null) {
          break;
        }
        while (parame1.hasNext())
        {
          localObject = (a)parame1.next();
          if (localObject != null)
          {
            ((a)localObject).gAh = l;
            if ((l < ((a)localObject).gAi) || (l - ((a)localObject).gAj > 3600L))
            {
              ((a)localObject).gAi = l;
              ((a)localObject).gAj = 0L;
            }
            else
            {
              ((a)localObject).gAj += 1L;
            }
          }
        }
        break;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(590960656384L, 4403);
    w.d("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3);
    xz localxz = (xz)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramInt2 != 0) || (paramInt3 != 0) || (localxz.uaA == null))
    {
      com.tencent.mm.plugin.report.service.g.ork.i(10769, new Object[] { Integer.valueOf(d.gAd), Integer.valueOf(0), Long.valueOf(this.startTime) });
      if (localxz.uaA == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.w("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd: [%d ,%d]  info is null :%b", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(bool) });
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(590960656384L, 4403);
        return;
      }
    }
    gAf.clear();
    paramArrayOfByte = null;
    paramq = paramArrayOfByte;
    if (localxz.uaD != null)
    {
      paramq = paramArrayOfByte;
      if (localxz.uaD.uNN > 0)
      {
        w.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd cdnrule:%d", new Object[] { Integer.valueOf(localxz.uaD.uNN) });
        paramq = n.a(localxz.uaD);
      }
    }
    byte[] arrayOfByte = null;
    paramArrayOfByte = arrayOfByte;
    if (localxz.uaE != null)
    {
      paramArrayOfByte = arrayOfByte;
      if (localxz.uaE.uNN > 0)
      {
        w.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd safecdnrule:%d", new Object[] { Integer.valueOf(localxz.uaE.uNN) });
        paramArrayOfByte = n.a(localxz.uaE);
      }
    }
    w.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo:%s", new Object[] { localxz.uaF });
    if (localxz.uaF != null) {
      w.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo FakeUin:%d NewAuthKey:%s", new Object[] { Integer.valueOf(localxz.uaF.kAW), localxz.uaF.tYk });
    }
    if (!g.Gl().a(localxz.uaA, localxz.uaB, localxz.uaC, paramq, paramArrayOfByte, localxz.uaF))
    {
      w.e("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd setCDNDnsInfo failed ");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(590960656384L, 4403);
      return;
    }
    w.i("MicroMsg.NetSceneGetCDNDns", "getcdndns defaultcfg %s, disastercfg %s, getcdninterval %d", new Object[] { localxz.uaH, localxz.uaI, Integer.valueOf(localxz.uaG) });
    if ((localxz.uaH != null) && (localxz.uaI != null)) {
      CdnLogic.setCdnInfoParams(a(localxz.uaH), a(localxz.uaI), localxz.uaG);
    }
    try
    {
      arrayOfByte = localxz.uaA.toByteArray();
      e(arrayOfByte, "");
    }
    catch (Exception localException3)
    {
      try
      {
        arrayOfByte = localxz.uaB.toByteArray();
        e(arrayOfByte, "sns");
      }
      catch (Exception localException3)
      {
        try
        {
          arrayOfByte = localxz.uaC.toByteArray();
          e(arrayOfByte, "app");
        }
        catch (Exception localException3)
        {
          try
          {
            for (;;)
            {
              arrayOfByte = localxz.uaF.toByteArray();
              e(arrayOfByte, "safec2c");
              if (paramq != null) {
                f(paramq, "c2crule");
              }
              if (paramArrayOfByte != null) {
                f(paramArrayOfByte, "safec2crule");
              }
              this.fUd.a(paramInt2, paramInt3, paramString, this);
              GMTrace.o(590960656384L, 4403);
              return;
              localException1 = localException1;
              w.w("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd getDnsInfo toByteArray failed: %s", new Object[] { localException1.getMessage() });
              w.e("MicroMsg.NetSceneGetCDNDns", "exception:%s", new Object[] { bg.f(localException1) });
              Object localObject1 = null;
              continue;
              localException2 = localException2;
              w.w("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd getsnsDnsInfo toByteArray failed: %s", new Object[] { localException2.getMessage() });
              w.e("MicroMsg.NetSceneGetCDNDns", "exception:%s", new Object[] { bg.f(localException2) });
              Object localObject2 = null;
            }
            localException3 = localException3;
            w.w("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd getappDnsInfo toByteArray failed: %s", new Object[] { localException3.getMessage() });
            w.e("MicroMsg.NetSceneGetCDNDns", "exception:%s", new Object[] { bg.f(localException3) });
            Object localObject3 = null;
          }
          catch (Exception localException4)
          {
            for (;;)
            {
              w.w("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd getappDnsInfo toByteArray failed: %s", new Object[] { localException4.getMessage() });
              w.e("MicroMsg.NetSceneGetCDNDns", "exception:%s", new Object[] { bg.f(localException4) });
              Object localObject4 = null;
            }
          }
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(591094874112L, 4404);
    GMTrace.o(591094874112L, 4404);
    return 379;
  }
  
  static final class a
  {
    boolean gAg;
    long gAh;
    long gAi;
    long gAj;
    
    a()
    {
      GMTrace.i(581968068608L, 4336);
      this.gAg = false;
      this.gAh = 0L;
      this.gAi = 0L;
      this.gAj = 0L;
      GMTrace.o(581968068608L, 4336);
    }
    
    public final String toString()
    {
      GMTrace.i(582102286336L, 4337);
      String str = String.format("LastGetResult(%x){isTimeOut=%b, lastGetCDNDns_TenSecond=%d, lastTime_Hour=%d, lastCount_Hour=%d}", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.gAg), Long.valueOf(this.gAh), Long.valueOf(this.gAi), Long.valueOf(this.gAj) });
      GMTrace.o(582102286336L, 4337);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcdntran\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */