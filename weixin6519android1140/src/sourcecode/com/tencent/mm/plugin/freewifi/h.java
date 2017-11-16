package com.tencent.mm.plugin.freewifi;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.g.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.protocal.c.ac;
import com.tencent.mm.protocal.c.nt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class h
{
  private b lof;
  private String log;
  
  public h()
  {
    GMTrace.i(7267353100288L, 54146);
    this.lof = j.aBf();
    GMTrace.o(7267353100288L, 54146);
  }
  
  private void aAu()
  {
    try
    {
      GMTrace.i(7267621535744L, 54148);
      try
      {
        String str = this.lof.yF(a.loh.amf);
        if ((!m.yp(str)) && (Integer.valueOf(str).intValue() < Integer.valueOf(a.loh.lon).intValue()))
        {
          nO(Integer.valueOf(a.loi.lon).intValue());
          nP(Integer.valueOf(a.loj.lon).intValue());
          ym(a.lol.lon);
          yl(a.lok.lon);
          yn(a.lom.lon);
          nN(Integer.valueOf(a.loh.lon).intValue());
        }
        GMTrace.o(7267621535744L, 54148);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "updateDiskDbCacheIfLowerThanDefault exception. " + m.e(localException));
          GMTrace.o(7267621535744L, 54148);
        }
      }
      return;
    }
    finally {}
  }
  
  private void nN(int paramInt)
  {
    try
    {
      GMTrace.i(7267889971200L, 54150);
      if (paramInt > Integer.valueOf(a.loh.lon).intValue()) {
        j.aBf().cl(a.loh.amf, String.valueOf(paramInt));
      }
      GMTrace.o(7267889971200L, 54150);
      return;
    }
    finally {}
  }
  
  private static void nO(int paramInt)
  {
    GMTrace.i(7268158406656L, 54152);
    if (paramInt > 0) {
      j.aBf().cl(a.loi.amf, String.valueOf(paramInt));
    }
    GMTrace.o(7268158406656L, 54152);
  }
  
  private void nP(int paramInt)
  {
    GMTrace.i(7268426842112L, 54154);
    if (paramInt > 0) {
      this.lof.cl(a.loj.amf, String.valueOf(paramInt));
    }
    GMTrace.o(7268426842112L, 54154);
  }
  
  private void yl(String paramString)
  {
    GMTrace.i(7268695277568L, 54156);
    if (("0".equals(paramString)) || ("1".equals(paramString))) {
      try
      {
        this.lof.cl(a.lok.amf, paramString);
        GMTrace.o(7268695277568L, 54156);
        return;
      }
      catch (Exception paramString) {}
    }
    GMTrace.o(7268695277568L, 54156);
  }
  
  private void ym(String paramString)
  {
    GMTrace.i(7268963713024L, 54158);
    if (!m.yp(paramString)) {
      try
      {
        Uri.parse(paramString);
        this.lof.cl(a.lol.amf, paramString);
        GMTrace.o(7268963713024L, 54158);
        return;
      }
      catch (Exception paramString) {}
    }
    GMTrace.o(7268963713024L, 54158);
  }
  
  private void yn(String paramString)
  {
    GMTrace.i(7269232148480L, 54160);
    if (!m.yp(paramString)) {
      try
      {
        Uri.parse(paramString);
        this.lof.cl(a.lom.amf, paramString);
        GMTrace.o(7269232148480L, 54160);
        return;
      }
      catch (Exception paramString) {}
    }
    GMTrace.o(7269232148480L, 54160);
  }
  
  public final void a(ac paramac)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(7267487318016L, 54147);
        aAu();
        if ((paramac == null) || (paramac.tNt == null))
        {
          w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config is null.");
          GMTrace.o(7267487318016L, 54147);
          return;
        }
        this.lof.aBF();
        if (paramac.tNt.version == -1)
        {
          this.lof.MH();
          w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "all local config data deleted.");
          this.lof.aBF();
          GMTrace.o(7267487318016L, 54147);
          continue;
        }
        if (paramac.tNt.version <= aAv()) {
          break label390;
        }
      }
      finally {}
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.version is %d, local version is %d.", new Object[] { Integer.valueOf(paramac.tNt.version), Integer.valueOf(aAv()) });
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.version = %d " + paramac.tNt.version);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.httpConnectTimeoutMillis = %d " + paramac.tNt.uew);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.httpReadTimeoutMillis = %d " + paramac.tNt.uex);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.pingUrl = %s " + paramac.tNt.eCD);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.pingEnabled = %s " + paramac.tNt.eCC);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.ThreeTwoBlackUrl = %s " + paramac.tNt.uey);
      nO(paramac.tNt.uew);
      nP(paramac.tNt.uex);
      ym(paramac.tNt.eCD);
      yl(paramac.tNt.eCC);
      yn(paramac.tNt.uey);
      nN(paramac.tNt.version);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "local config data changed.");
      this.lof.aBF();
      label390:
      GMTrace.o(7267487318016L, 54147);
    }
  }
  
  public final String aAA()
  {
    GMTrace.i(7269097930752L, 54159);
    aAu();
    try
    {
      String str1 = this.lof.yF(a.lom.amf);
      if (m.yp(str1))
      {
        str1 = a.lom.lon;
        GMTrace.o(7269097930752L, 54159);
        return str1;
      }
      Uri.parse(str1);
      GMTrace.o(7269097930752L, 54159);
      return str1;
    }
    catch (Exception localException)
    {
      String str2 = a.lom.lon;
      GMTrace.o(7269097930752L, 54159);
      return str2;
    }
  }
  
  public final int aAv()
  {
    for (;;)
    {
      String str;
      try
      {
        GMTrace.i(7267755753472L, 54149);
        aAu();
      }
      finally {}
      try
      {
        str = this.lof.yF(a.loh.amf);
        if (!m.yp(str)) {
          continue;
        }
        i = Integer.valueOf(a.loh.lon).intValue();
        GMTrace.o(7267755753472L, 54149);
      }
      catch (Exception localException)
      {
        i = Integer.valueOf(a.loh.lon).intValue();
        GMTrace.o(7267755753472L, 54149);
        continue;
      }
      return i;
      i = Integer.valueOf(str).intValue();
      GMTrace.o(7267755753472L, 54149);
    }
  }
  
  public final int aAw()
  {
    GMTrace.i(7268024188928L, 54151);
    aAu();
    int i;
    try
    {
      String str = this.lof.yF(a.loi.amf);
      if (m.yp(str))
      {
        i = Integer.valueOf(a.loi.lon).intValue();
        GMTrace.o(7268024188928L, 54151);
        return i;
      }
      i = Integer.valueOf(str).intValue();
      GMTrace.o(7268024188928L, 54151);
      return i;
    }
    catch (Exception localException)
    {
      i = Integer.valueOf(a.loi.lon).intValue();
      GMTrace.o(7268024188928L, 54151);
    }
    return i;
  }
  
  public final int aAx()
  {
    GMTrace.i(7268292624384L, 54153);
    aAu();
    int i;
    try
    {
      String str = this.lof.yF(a.loj.amf);
      if (m.yp(str))
      {
        i = Integer.valueOf(a.loj.lon).intValue();
        GMTrace.o(7268292624384L, 54153);
        return i;
      }
      i = Integer.valueOf(str).intValue();
      GMTrace.o(7268292624384L, 54153);
      return i;
    }
    catch (Exception localException)
    {
      i = Integer.valueOf(a.loj.lon).intValue();
      GMTrace.o(7268292624384L, 54153);
    }
    return i;
  }
  
  public final String aAy()
  {
    GMTrace.i(7268561059840L, 54155);
    aAu();
    try
    {
      if ("0".equals(this.lof.yF(a.lok.amf)))
      {
        GMTrace.o(7268561059840L, 54155);
        return "0";
      }
      GMTrace.o(7268561059840L, 54155);
      return "1";
    }
    catch (Exception localException)
    {
      String str = a.lok.lon;
      GMTrace.o(7268561059840L, 54155);
      return str;
    }
  }
  
  public final String aAz()
  {
    GMTrace.i(7268829495296L, 54157);
    aAu();
    try
    {
      String str1 = this.lof.yF(a.lol.amf);
      if (m.yp(str1))
      {
        str1 = a.lol.lon;
        GMTrace.o(7268829495296L, 54157);
        return str1;
      }
      Uri.parse(str1);
      GMTrace.o(7268829495296L, 54157);
      return str1;
    }
    catch (Exception localException)
    {
      String str2 = a.lol.lon;
      GMTrace.o(7268829495296L, 54157);
      return str2;
    }
  }
  
  public final String getUserAgent()
  {
    GMTrace.i(7269366366208L, 54161);
    if (m.yp(this.log)) {
      this.log = s.aZ(ab.getContext(), null).toLowerCase();
    }
    String str = this.log;
    GMTrace.o(7269366366208L, 54161);
    return str;
  }
  
  static enum a
  {
    String amf;
    String lon;
    
    static
    {
      GMTrace.i(7127364009984L, 53103);
      loh = new a("version", 0, "version", "2");
      loi = new a("httpConnectTimeoutMillis", 1, "httpConnectTimeoutMillis", "5000");
      loj = new a("httpReadTimeoutMillis", 2, "httpReadTimeoutMillis", "5000");
      lok = new a("pingEnabled", 3, "pingEnabled", "1");
      lol = new a("pingUrl", 4, "pingUrl", "http://o2o.gtimg.com/wifi/echo");
      lom = new a("threeTwoBlackUrl", 5, "threeTwoBlackUrl", "http://o2o.gtimg.com/wifi/echo.html");
      loo = new a[] { loh, loi, loj, lok, lol, lom };
      GMTrace.o(7127364009984L, 53103);
    }
    
    private a(String paramString1, String paramString2)
    {
      GMTrace.i(7127229792256L, 53102);
      this.amf = paramString1;
      this.lon = paramString2;
      GMTrace.o(7127229792256L, 53102);
    }
  }
  
  private static final class b
  {
    public static h lop;
    
    static
    {
      GMTrace.i(7146154491904L, 53243);
      lop = new h();
      GMTrace.o(7146154491904L, 53243);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */