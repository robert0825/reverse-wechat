package com.tencent.mm.plugin.sns.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.kernel.h;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.b.b;
import com.tencent.mm.network.u;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.pluginsdk.model.k;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class b
  extends k<String, Integer, Integer>
{
  private static HashSet<String> pxp;
  private long dnsCostTime;
  protected anu eUs;
  private int hgk;
  private String host;
  protected a pwV;
  protected n pwW;
  protected a pwX;
  private String pwY;
  private String pwZ;
  private String pxa;
  private int pxb;
  protected int pxc;
  private long pxd;
  protected long pxe;
  protected long pxf;
  protected long pxg;
  protected String pxh;
  protected PString pxi;
  protected int pxj;
  protected long pxk;
  protected long pxl;
  protected long pxm;
  private int pxn;
  protected int pxo;
  private Map<String, List<String>> pxq;
  int pxr;
  private int retCode;
  
  static
  {
    GMTrace.i(8065277493248L, 60091);
    pxp = new HashSet();
    GMTrace.o(8065277493248L, 60091);
  }
  
  public b(a parama, a parama1)
  {
    GMTrace.i(8062995791872L, 60074);
    this.pwW = null;
    this.pwX = null;
    this.eUs = null;
    this.pwY = "";
    this.pwZ = "";
    this.pxa = "";
    this.pxb = 0;
    this.pxc = 0;
    this.pxd = -1L;
    this.dnsCostTime = -1L;
    this.hgk = -1;
    this.pxe = -1L;
    this.pxf = -1L;
    this.pxg = -1L;
    this.pxh = "";
    this.pxi = new PString();
    this.retCode = -1;
    this.pxn = 0;
    this.host = "";
    this.pxo = 0;
    this.pxr = 0;
    this.pwV = parama;
    this.pwX = parama1;
    if (parama1 == null)
    {
      GMTrace.o(8062995791872L, 60074);
      return;
    }
    this.eUs = parama1.psm;
    pxp.add(parama1.psl);
    parama1.init();
    GMTrace.o(8062995791872L, 60074);
  }
  
  private static void H(Map<String, List<String>> paramMap)
  {
    GMTrace.i(8064337969152L, 60084);
    if (paramMap == null)
    {
      GMTrace.o(8064337969152L, 60084);
      return;
    }
    StringBuffer localStringBuffer;
    for (;;)
    {
      try
      {
        localStringBuffer = new StringBuffer();
        Iterator localIterator = paramMap.keySet().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        Object localObject1 = (String)localIterator.next();
        Object localObject2 = (List)paramMap.get(localObject1);
        if (localObject2 != null)
        {
          localStringBuffer.append((String)localObject1 + ":");
          localObject1 = ((List)localObject2).iterator();
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            localStringBuffer.append((String)localObject2 + "|");
          }
          else
          {
            localStringBuffer.append(";");
          }
        }
      }
      catch (Exception paramMap)
      {
        GMTrace.o(8064337969152L, 60084);
        return;
      }
    }
    w.i("MicroMsg.SnsCdnDownloadBase", "header respone %s", new Object[] { localStringBuffer.toString() });
    GMTrace.o(8064337969152L, 60084);
  }
  
  public static boolean HT(String paramString)
  {
    GMTrace.i(8062861574144L, 60073);
    if (pxp.contains(i.as(1, paramString)))
    {
      GMTrace.o(8062861574144L, 60073);
      return true;
    }
    if (pxp.contains(i.as(5, paramString)))
    {
      GMTrace.o(8062861574144L, 60073);
      return true;
    }
    GMTrace.o(8062861574144L, 60073);
    return false;
  }
  
  private static long HV(String paramString)
  {
    GMTrace.i(8064606404608L, 60086);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(8064606404608L, 60086);
      return 0L;
    }
    try
    {
      paramString = paramString.split("\\.");
      long l1 = bg.getLong(paramString[0], 0L);
      long l2 = bg.getLong(paramString[1], 0L);
      long l3 = bg.getLong(paramString[2], 0L);
      long l4 = bg.getLong(paramString[3], 0L);
      GMTrace.o(8064606404608L, 60086);
      return l4 + (16777216L * l1 + 65536L * l2 + 256L * l3);
    }
    catch (Exception paramString)
    {
      GMTrace.o(8064606404608L, 60086);
    }
    return 0L;
  }
  
  private u a(b.b paramb, String paramString)
  {
    GMTrace.i(17153294073856L, 127802);
    try
    {
      this.pxa = paramb.ip;
      this.hgk = paramb.hgk;
      this.pxe = bg.Pv();
      paramb = com.tencent.mm.network.b.a(this.pwX.url, paramb);
      paramb.setRequestMethod("GET");
      paramb.setRequestProperty("referer", paramString);
      if (bg.getInt(com.tencent.mm.k.g.ut().getValue("SnsDownloadHttpKeep"), 0) > 0)
      {
        w.i("MicroMsg.SnsCdnDownloadBase", "header Connection close ");
        paramb.setRequestProperty("Connection", "close");
      }
      paramb.setConnectTimeout(25000);
      paramb.setReadTimeout(25000);
      paramb = b(paramb);
      this.pxq = paramb.getHeaderFields();
      paramString = (List)this.pxq.get("X-ClientIp");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.pwZ = ((String)paramString.get(0));
      }
      paramString = (List)this.pxq.get("X-ServerIp");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.pwY = ((String)paramString.get(0));
      }
      paramString = (List)this.pxq.get("X-ErrNo");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.pxb = bg.Sy((String)paramString.get(0));
      }
      paramString = (List)this.pxq.get("X-RtFlag");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.pxc = bg.Sy((String)paramString.get(0));
      }
      for (;;)
      {
        try
        {
          this.retCode = paramb.getResponseCode();
          this.host = paramb.url.getHost();
          if ((this.retCode == 200) || (this.retCode == 206)) {
            break;
          }
          H(paramb.getHeaderFields());
          if (this.pwX.pwS)
          {
            if ((this.retCode >= 400) && (this.retCode < 500))
            {
              com.tencent.mm.plugin.report.service.g.ork.a(22L, 78L, 1L, true);
              if (this.pwX.pwR) {
                com.tencent.mm.plugin.report.service.g.ork.a(150L, 14L, 1L, true);
              }
              w.e("MicroMsg.SnsCdnDownloadBase", "GprsSetting.checkHttpConnection failed! mediaId : " + this.pwX.mediaId + " " + this.pwX.url + " " + this.retCode);
              hD(false);
              GMTrace.o(17153294073856L, 127802);
              return null;
            }
            if ((this.retCode < 500) || (this.retCode >= 600)) {
              continue;
            }
            com.tencent.mm.plugin.report.service.g.ork.a(22L, 79L, 1L, true);
            continue;
          }
        }
        catch (SocketTimeoutException paramb)
        {
          this.retCode = 1;
          hD(false);
          paramb = paramb.getMessage();
          if (!this.pwX.pwS) {
            break label826;
          }
          com.tencent.mm.plugin.report.service.g.ork.a(22L, 77L, 1L, true);
          if (this.pwX.pwR) {
            com.tencent.mm.plugin.report.service.g.ork.a(150L, 14L, 1L, true);
          }
          w.e("MicroMsg.SnsCdnDownloadBase", "GprsSetting.checkHttpConnection failed! socket timeout mediaId : " + this.pwX.mediaId + " " + this.pwX.url + " msg:" + paramb);
          GMTrace.o(17153294073856L, 127802);
          return null;
          if ((this.retCode >= 400) && (this.retCode < 500))
          {
            com.tencent.mm.plugin.report.service.g.ork.a(22L, 56L, 1L, true);
            continue;
          }
        }
        catch (Exception paramb)
        {
          hD(false);
          paramb = paramb.getMessage();
          if (this.pwX.pwR) {
            com.tencent.mm.plugin.report.service.g.ork.a(150L, 14L, 1L, true);
          }
          w.e("MicroMsg.SnsCdnDownloadBase", "GprsSetting.checkHttpConnection failed! mediaId : " + this.pwX.mediaId + " " + this.pwX.url + " msg:" + paramb);
          GMTrace.o(17153294073856L, 127802);
          return null;
        }
        if ((this.retCode >= 500) && (this.retCode < 600))
        {
          com.tencent.mm.plugin.report.service.g.ork.a(22L, 57L, 1L, true);
          continue;
          label826:
          com.tencent.mm.plugin.report.service.g.ork.a(22L, 55L, 1L, true);
        }
      }
      H(paramb.getHeaderFields());
    }
    catch (Exception paramb)
    {
      w.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", paramb, "connect fail : " + paramb.getMessage(), new Object[0]);
      this.retCode = 2;
      hD(false);
      GMTrace.o(17153294073856L, 127802);
      return null;
    }
    if (!d(paramb))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(22L, 62L, 1L, true);
      w.e("MicroMsg.SnsCdnDownloadBase", "checkHttpConnection failed! nocache mediaId : " + this.pwX.mediaId);
      hD(false);
      GMTrace.o(17153294073856L, 127802);
      return null;
    }
    this.pxe = bg.aH(this.pxe);
    paramString = (List)this.pxq.get("Content-Length");
    if ((paramString != null) && (paramString.size() > 0)) {
      this.pxo = bg.Sy((String)paramString.get(0));
    }
    w.i("MicroMsg.SnsCdnDownloadBase", "ip: url %s client ip %s server ip %s svrlen %d %d", new Object[] { this.pwX.url, this.pwZ, this.pwY, Integer.valueOf(this.pxo), Integer.valueOf(this.pxb) });
    GMTrace.o(17153294073856L, 127802);
    return paramb;
  }
  
  protected static boolean a(int paramInt, long paramLong, PString paramPString)
  {
    GMTrace.i(8063801098240L, 60080);
    long l = System.currentTimeMillis();
    if (l - paramLong < 1000L)
    {
      GMTrace.o(8063801098240L, 60080);
      return false;
    }
    paramPString.value += String.format("ts=%d&size=%d|", new Object[] { Long.valueOf(l / 1000L), Integer.valueOf(paramInt) });
    GMTrace.o(8063801098240L, 60080);
    return true;
  }
  
  private static boolean a(an paraman, String paramString1, long paramLong, String paramString2)
  {
    GMTrace.i(8064069533696L, 60082);
    if (paramString1 == null)
    {
      GMTrace.o(8064069533696L, 60082);
      return false;
    }
    try
    {
      paramString1 = new URL(paramString1);
      if (paraman == null)
      {
        GMTrace.o(8064069533696L, 60082);
        return false;
      }
      if (paramString2 == null)
      {
        GMTrace.o(8064069533696L, 60082);
        return false;
      }
      int i = paramString2.indexOf(paramString1.getHost());
      if (i == -1)
      {
        GMTrace.o(8064069533696L, 60082);
        return false;
      }
      i = paraman.time;
      if (i == 0)
      {
        GMTrace.o(8064069533696L, 60082);
        return false;
      }
      long l = bg.aG(paraman.time);
      if (l > paramLong)
      {
        GMTrace.o(8064069533696L, 60082);
        return true;
      }
      GMTrace.o(8064069533696L, 60082);
      return false;
    }
    catch (Exception paraman)
    {
      w.e("MicroMsg.SnsCdnDownloadBase", "error for check dcip %s", new Object[] { paraman.getMessage() });
      GMTrace.o(8064069533696L, 60082);
    }
    return false;
  }
  
  private Integer bjS()
  {
    GMTrace.i(8064203751424L, 60083);
    h.xz();
    if ((!h.xy().isSDCardAvailable()) || (this.pwX == null))
    {
      hD(false);
      GMTrace.o(8064203751424L, 60083);
      return Integer.valueOf(2);
    }
    if (bjP())
    {
      localObject1 = this.pwX.psh + this.pwX.bjO();
      w.i("MicroMsg.SnsCdnDownloadBase", "[tomys] delete img: %s", new Object[] { localObject1 });
      FileOp.deleteFile((String)localObject1);
    }
    long l3 = System.currentTimeMillis();
    this.pxg = System.currentTimeMillis();
    w.d("MicroMsg.SnsCdnDownloadBase", "to downloadBitmap " + this.pwX.mediaId + " " + this.pwX.pwR + " type " + this.pwX.pwT);
    FileOp.la(this.pwX.getPath());
    Object localObject3 = this.pwX.pwU;
    Object localObject1 = "";
    if (localObject3 == null) {
      localObject1 = "";
    }
    for (;;)
    {
      Object localObject2 = localObject1;
      if (!bg.nm((String)localObject1)) {
        localObject2 = "&scene=" + (String)localObject1;
      }
      String str2 = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.tJC), o.getString(com.tencent.mm.plugin.sns.model.ae.biK()), Integer.valueOf(am.getNetTypeForStat(ab.getContext())), Integer.valueOf(am.getStrength(ab.getContext())), localObject2 });
      this.pwX.url = HU(this.pwX.url);
      this.dnsCostTime = bg.Pv();
      label346:
      label361:
      boolean bool;
      if (this.pwX.pwS)
      {
        localObject1 = "SnsSightDomainList";
        if (!this.pwX.pwS) {
          break label969;
        }
        localObject2 = "SnsSightMainStandbyIpSwitchTime";
        localObject1 = com.tencent.mm.k.g.ut().getValue((String)localObject1);
        long l2 = com.tencent.mm.k.g.ut().getInt((String)localObject2, 0);
        w.i("MicroMsg.SnsCdnDownloadBase", "pack.isAlbum %s pack.isthumb %s hostvalue %s dcipTime %s", new Object[] { Boolean.valueOf(this.pwX.pwS), Boolean.valueOf(this.pwX.pwR), localObject1, Long.valueOf(l2) });
        long l1 = l2;
        if (l2 <= 0L) {
          l1 = 259200L;
        }
        bool = a((an)localObject3, this.pwX.url, l1, (String)localObject1);
        localObject2 = new b.b(this.pwX.url, bool);
        this.dnsCostTime = bg.aH(this.dnsCostTime);
      }
      try
      {
        if (bg.nm(((b.b)localObject2).ip)) {}
        for (localObject1 = InetAddress.getByName(((b.b)localObject2).host).getHostAddress();; localObject1 = ((b.b)localObject2).ip)
        {
          w.i("MicroMsg.SnsCdnDownloadBase", "checkAndGetHttpConn[%s] [%s] [id:%s] host ip:%d[%s] [%s] download type[%d] isDcIp[%s] fromScene[%s]", new Object[] { str2, this.pwX.url, this.pwX.mediaId, Integer.valueOf(((b.b)localObject2).hgk), localObject1, this.pwX.url, Integer.valueOf(this.pwX.pwT), Boolean.valueOf(bool), ((an)localObject3).toString() });
          int i = 0;
          this.pxc = 1;
          localObject1 = a((b.b)localObject2, str2);
          i += 1;
          localObject3 = ((b.b)localObject2).ip;
          if (localObject1 == null) {
            break label997;
          }
          bool = true;
          w.i("MicroMsg.SnsCdnDownloadBase", "[sns ip strategy]connect ip:%s, result:%b, canRetry(X-RtFlag):%d, isDC(cold ip):%b, url:%s", new Object[] { localObject3, Boolean.valueOf(bool), Integer.valueOf(this.pxc), Boolean.valueOf(((b.b)localObject2).hgn), ((b.b)localObject2).hgm });
          if ((bjT()) && (localObject1 == null) && (this.pxc == 1) && (((b.b)localObject2).Ox()) && (i < 4)) {
            break label1003;
          }
          i = 2;
          if (localObject1 != null) {
            i = c((u)localObject1);
          }
          w.i("MicroMsg.SnsCdnDownloadBase", "DOWN FIN time:%d down:%d mediaId:%s url[%s], size %d", new Object[] { Long.valueOf(bg.aH(l3)), Long.valueOf(this.pxd), this.pwX.mediaId, this.pwX.url, Integer.valueOf(this.pxr) });
          GMTrace.o(8064203751424L, 60083);
          return Integer.valueOf(i);
          if (((an)localObject3).equals(an.vBa))
          {
            localObject1 = "album_friend";
            break;
          }
          if (((an)localObject3).equals(an.vBb))
          {
            localObject1 = "album_self";
            break;
          }
          if (((an)localObject3).equals(an.vBc))
          {
            localObject1 = "album_stranger";
            break;
          }
          if (((an)localObject3).equals(an.vBd))
          {
            localObject1 = "profile_friend";
            break;
          }
          if (((an)localObject3).equals(an.vBe))
          {
            localObject1 = "profile_stranger";
            break;
          }
          if (((an)localObject3).equals(an.vBf))
          {
            localObject1 = "comment";
            break;
          }
          if (!((an)localObject3).equals(an.vAZ)) {
            break;
          }
          localObject1 = "timeline";
          break;
          localObject1 = "SnsAlbumDomainList";
          break label346;
          label969:
          localObject2 = "SnsAlbumMainStandbyIpSwitchTime";
          break label361;
        }
      }
      catch (Exception localException)
      {
        label997:
        label1003:
        for (;;)
        {
          String str1 = "-";
          continue;
          bool = false;
        }
      }
    }
  }
  
  private int c(u paramu)
  {
    GMTrace.i(17153428291584L, 127803);
    Object localObject3 = null;
    InputStream localInputStream2 = null;
    InputStream localInputStream1 = localInputStream2;
    Object localObject1 = localObject3;
    try
    {
      this.pxm = bg.Pv();
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      localInputStream2 = paramu.getInputStream();
      localInputStream1 = localInputStream2;
      localObject1 = localInputStream2;
      this.pxf = bg.Pv();
      localInputStream1 = localInputStream2;
      localObject1 = localInputStream2;
      boolean bool = a(localInputStream2, this.pxq);
      localInputStream1 = localInputStream2;
      localObject1 = localInputStream2;
      localInputStream2.close();
      localObject3 = null;
      localInputStream2 = null;
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      w.i("MicroMsg.SnsCdnDownloadBase", "reportResult ret : " + bool);
      if (!bool)
      {
        localInputStream1 = localInputStream2;
        localObject1 = localObject3;
        hD(false);
        if (paramu != null) {
          paramu.hhh.disconnect();
        }
        GMTrace.o(17153428291584L, 127803);
        return 2;
      }
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      this.pxf = bg.aH(this.pxf);
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      this.pxd = bg.aH(this.pxg);
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      bool = bjQ();
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      w.i("MicroMsg.SnsCdnDownloadBase", "processData ret : " + bool);
      if (!bool)
      {
        localInputStream1 = localInputStream2;
        localObject1 = localObject3;
        this.retCode = 3;
        localInputStream1 = localInputStream2;
        localObject1 = localObject3;
        hD(false);
        if (paramu != null) {
          paramu.hhh.disconnect();
        }
        GMTrace.o(17153428291584L, 127803);
        return 2;
      }
      if (paramu != null) {
        paramu.hhh.disconnect();
      }
      hD(true);
      if (this.pwX.pwR)
      {
        GMTrace.o(17153428291584L, 127803);
        return 3;
      }
    }
    catch (Exception localException)
    {
      localObject1 = localInputStream1;
      w.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", localException, "snscdndownload fail : " + localException.getMessage(), new Object[0]);
      localObject1 = localInputStream1;
      this.retCode = 4;
      localObject1 = localInputStream1;
      hD(false);
      if (localInputStream1 != null) {}
      try
      {
        localInputStream1.close();
        if (paramu != null) {
          paramu.hhh.disconnect();
        }
        GMTrace.o(17153428291584L, 127803);
        return 2;
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", localIOException1, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localIOException1 != null) {}
      try
      {
        localIOException1.close();
        if (paramu != null) {
          paramu.hhh.disconnect();
        }
        throw ((Throwable)localObject2);
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", localIOException2, "", new Object[0]);
        }
      }
      GMTrace.o(17153428291584L, 127803);
    }
    return 1;
  }
  
  private static boolean d(u paramu)
  {
    GMTrace.i(8064472186880L, 60085);
    try
    {
      paramu = (List)paramu.getHeaderFields().get("cache-control");
      if (paramu != null)
      {
        int i = paramu.size();
        if (i != 0) {}
      }
      else
      {
        GMTrace.o(8064472186880L, 60085);
        return true;
      }
      if (!bg.nm(paramu.toString()))
      {
        bool = paramu.toString().contains("no-cache");
        if (bool) {}
      }
      else
      {
        GMTrace.o(8064472186880L, 60085);
        return true;
      }
      boolean bool = paramu.toString().contains("no-cache");
      if (bool)
      {
        GMTrace.o(8064472186880L, 60085);
        return false;
      }
      GMTrace.o(8064472186880L, 60085);
      return false;
    }
    catch (Exception paramu)
    {
      w.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", paramu, "", new Object[0]);
      GMTrace.o(8064472186880L, 60085);
    }
    return false;
  }
  
  private void hD(boolean paramBoolean)
  {
    GMTrace.i(8064740622336L, 60087);
    label44:
    int j;
    label122:
    int k;
    long l2;
    Object localObject1;
    Object localObject3;
    label188:
    int m;
    if ((this.pwX != null) && (this.pwX.pwS)) {
      if (!paramBoolean)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(22L, 74L, 1L, true);
        com.tencent.mm.plugin.report.service.g.ork.a(22L, 73L, 1L, true);
        if ((this.pwX != null) && (this.pwX.pwR) && (!paramBoolean) && (!i.a(this.pwW))) {
          com.tencent.mm.plugin.report.service.g.ork.a(150L, 66L, 1L, true);
        }
        this.pxn = this.pxr;
        if (!am.isWifi(ab.getContext())) {
          break label837;
        }
        j = 1;
        k = am.getStrength(ab.getContext());
        i = this.hgk;
        l1 = this.dnsCostTime;
        l2 = this.pxe;
        long l3 = this.pxf;
        long l4 = this.pxd;
        localObject1 = this.pwY;
        localObject2 = this.pxa;
        localObject3 = this.pwZ;
        if (this.pwX != null) {
          break label842;
        }
        str = "";
        w.v("MicroMsg.SnsCdnDownloadBase", "report dns:%d wifi:%d signal:%d [%d,%d,%d]%d serverIp:[%s,%s] xclientip:%s url[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), localObject1, localObject2, localObject3, str });
        m = am.getNetType(ab.getContext());
        i = 0;
        if (this.pwX != null)
        {
          if (this.pwX.pwT != 4) {
            break label854;
          }
          i = 1;
        }
        label310:
        w.i("MicroMsg.SnsCdnDownloadBase", "retCode :%d totalSize: %d net: %d downloadType %d xErrorNo %d", new Object[] { Integer.valueOf(this.retCode), Integer.valueOf(this.pxn), Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(this.pxb) });
        localObject1 = com.tencent.mm.plugin.report.service.g.ork;
        if (this.pwX != null) {
          break label859;
        }
        str = "";
        label383:
        l2 = HV(this.pxa);
        if (!paramBoolean) {
          break label871;
        }
      }
    }
    label837:
    label842:
    label854:
    label859:
    label871:
    for (long l1 = this.pxd;; l1 = 0L)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject1).i(10736, new Object[] { str, Long.valueOf(l2), Long.valueOf(l1), "", Integer.valueOf(j), Long.valueOf(this.dnsCostTime), Long.valueOf(this.pxe), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(this.pxf), Long.valueOf(HV(this.pwZ)), Long.valueOf(HV(this.pwY)), Integer.valueOf(this.hgk), Integer.valueOf(k), Integer.valueOf(this.retCode), Integer.valueOf(this.pxn), Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(this.pxb) });
      boolean bool = am.isConnected(ab.getContext());
      w.d("MicroMsg.SnsCdnDownloadBase", "isConntected  " + bool + " urlIp: " + this.pxh);
      if ((!paramBoolean) && (!bg.nm(this.pxh)) && (bool))
      {
        str = this.pxh;
        if ((com.tencent.mm.network.b.hgj != null) && (com.tencent.mm.network.b.hgj.wW() != null)) {
          com.tencent.mm.network.b.hgj.wW().reportFailIp(str);
        }
      }
      w.i("MicroMsg.SnsCdnDownloadBase", "ready to report logbuffer(13346) packageRecordList:%s", new Object[] { this.pxi.value });
      j = bjR();
      localObject1 = "";
      switch (j)
      {
      default: 
        GMTrace.o(8064740622336L, 60087);
        return;
        com.tencent.mm.plugin.report.service.g.ork.a(22L, 75L, this.pxd, true);
        break label44;
        if (!paramBoolean) {
          com.tencent.mm.plugin.report.service.g.ork.a(22L, 52L, 1L, true);
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.ork.a(22L, 51L, 1L, true);
          break;
          com.tencent.mm.plugin.report.service.g.ork.a(22L, 53L, this.pxd, true);
        }
        j = 0;
        break label122;
        str = this.pwX.url;
        break label188;
        i = 0;
        break label310;
        str = this.pwX.url;
        break label383;
      }
    }
    String str = "100105";
    Object localObject2 = com.tencent.mm.y.c.c.Ct().er(str);
    int i = 0;
    if (((com.tencent.mm.storage.c)localObject2).isValid())
    {
      i = bg.getInt((String)((com.tencent.mm.storage.c)localObject2).bSg().get("needUploadData"), 1);
      localObject1 = ((com.tencent.mm.storage.c)localObject2).field_expId;
    }
    if (i != 0)
    {
      localObject2 = new com.tencent.mm.modelsns.d();
      ((com.tencent.mm.modelsns.d)localObject2).q("20ImgSize", this.pxr + ",");
      localObject3 = new StringBuilder();
      if (!am.isWifi(ab.getContext())) {
        break label1698;
      }
    }
    label1698:
    for (i = 1;; i = 0)
    {
      ((com.tencent.mm.modelsns.d)localObject2).q("21NetType", i + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("22DelayTime", this.pxd - this.pxe + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("23RetCode", this.retCode + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("24DnsCostTime", this.dnsCostTime + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("25ConnectCostTime", this.pxe + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("26SendCostTime", ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("27WaitResponseCostTime", this.pxl + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("28ReceiveCostTime", this.pxf + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("29ClientAddrIP", this.pwZ + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("30ServerAddrIP", this.pxa + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("31dnstype", this.hgk + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("32signal", am.getStrength(ab.getContext()) + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("33host", this.host + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("34MediaType", j + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("35X_Errno", this.pxb + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("36MaxPackageSize", this.pxj + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("37MaxPackageTimeStamp", this.pxk + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("38PackageRecordList", this.pxi.value + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("39ExpLayerId", str + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("40ExpId", (String)localObject1 + ",");
      ((com.tencent.mm.modelsns.d)localObject2).q("41FeedId", ",");
      w.i("MicroMsg.SnsCdnDownloadBase", "report logbuffer(13480 TLMediaFielDownloadRecord): " + ((com.tencent.mm.modelsns.d)localObject2).LT());
      com.tencent.mm.plugin.report.service.g.ork.i(13480, new Object[] { localObject2 });
      if (this.retCode != 200) {
        com.tencent.mm.plugin.report.service.g.ork.i(14071, new Object[] { localObject2 });
      }
      GMTrace.o(8064740622336L, 60087);
      return;
      str = "100106";
      break;
      str = "100100";
      break;
    }
  }
  
  public String HU(String paramString)
  {
    GMTrace.i(8063264227328L, 60076);
    GMTrace.o(8063264227328L, 60076);
    return paramString;
  }
  
  public abstract boolean a(InputStream paramInputStream, Map<String, List<String>> paramMap);
  
  public u b(u paramu)
  {
    GMTrace.i(8063398445056L, 60077);
    GMTrace.o(8063398445056L, 60077);
    return paramu;
  }
  
  public final com.tencent.mm.sdk.platformtools.ae biu()
  {
    GMTrace.i(8064874840064L, 60088);
    com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.plugin.sns.model.ae.biO();
    GMTrace.o(8064874840064L, 60088);
    return localae;
  }
  
  public boolean bjP()
  {
    GMTrace.i(8063130009600L, 60075);
    GMTrace.o(8063130009600L, 60075);
    return true;
  }
  
  public abstract boolean bjQ();
  
  protected abstract int bjR();
  
  protected boolean bjT()
  {
    GMTrace.i(17153562509312L, 127804);
    GMTrace.o(17153562509312L, 127804);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, anu paramanu, int paramInt2, boolean paramBoolean, String paramString, int paramInt3);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */