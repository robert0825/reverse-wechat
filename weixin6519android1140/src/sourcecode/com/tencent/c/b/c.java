package com.tencent.c.b;

import android.content.Context;
import android.os.Build;
import com.tencent.c.f.d;
import com.tencent.c.f.d.a;
import com.tencent.c.f.i;
import com.tencent.c.f.l;

public final class c
{
  private Context mContext;
  private String mVersionName = null;
  private int xQg = -1;
  private com.tencent.c.c.a.c xQi = null;
  
  public c(Context paramContext)
  {
    this.mContext = paramContext;
    paramContext = i.bx(paramContext, paramContext.getPackageName());
    this.mVersionName = paramContext.versionName;
    this.xQg = paramContext.versionCode;
  }
  
  private static String XP(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private com.tencent.c.c.a.c a(com.tencent.c.e.a.b.a parama)
  {
    if (this.xQi == null)
    {
      this.xQi = new com.tencent.c.c.a.c();
      this.xQi.xQt = 82;
      this.xQi.xQy = this.xQg;
      this.xQi.xQq = parama.ePH;
      this.xQi.xQp = parama.xQp;
    }
    try
    {
      String[] arrayOfString = this.mVersionName.trim().split("[\\.]");
      if ((arrayOfString == null) || (arrayOfString.length < 3)) {
        break label322;
      }
      k = Integer.parseInt(arrayOfString[0]);
      j = Integer.parseInt(arrayOfString[1]);
      i = Integer.parseInt(arrayOfString[2]);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        continue;
        int i = 0;
        int j = 0;
        int k = 0;
      }
    }
    this.xQi.xQu = new com.tencent.c.c.a.b();
    this.xQi.xQu.xQm = k;
    this.xQi.xQu.xQn = j;
    this.xQi.xQu.xQo = i;
    this.xQi.xQv = 0;
    this.xQi.xQx = d.cmR();
    this.xQi.imei = XP(parama.imei);
    this.xQi.imsi = XP(parama.imsi);
    this.xQi.xQr = XP(Build.MODEL);
    this.xQi.pCr = XP(d.fZ(this.mContext));
    this.xQi.xQE = XP(d.mV(true));
    this.xQi.xQF = XP(d.mV(false));
    this.xQi.xQw = 0;
    this.xQi.xQs = getNetworkType();
    this.xQi.guid = XP(d.gb(this.mContext));
    return this.xQi;
  }
  
  private int getNetworkType()
  {
    try
    {
      int i = d.ga(this.mContext);
      int j = d.a.xSS;
      if (i == j) {
        return 2;
      }
      return 1;
    }
    catch (Throwable localThrowable) {}
    return 2;
  }
  
  public final byte[] c(String paramString1, String paramString2, com.tencent.c.e.a.b.a parama)
  {
    try
    {
      l locall = new l();
      locall.cnK();
      locall.XZ(paramString1);
      locall.Ya(paramString2);
      locall.XY("UTF-8");
      locall.put("userInfo", a(parama));
      locall.put("req", parama);
      paramString1 = com.tencent.c.f.b.l(locall.oO());
      if (paramString1 == null) {
        throw new RuntimeException("compress data fail");
      }
      paramString1 = com.tencent.c.f.c.j(paramString1, com.tencent.c.f.c.cnH());
      return paramString1;
    }
    catch (Exception paramString1) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */