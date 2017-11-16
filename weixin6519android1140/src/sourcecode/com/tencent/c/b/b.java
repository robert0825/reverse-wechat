package com.tencent.c.b;

import android.content.Context;
import android.os.Build;
import com.tencent.c.f.d;
import com.tencent.c.f.d.a;
import com.tencent.c.f.l;

public final class b
{
  private String mChannelId = null;
  private Context mContext = null;
  private String mVersionName = null;
  private int xQf = -1;
  private int xQg = -1;
  private String xQh = null;
  private com.tencent.c.c.a.c xQi = null;
  private com.tencent.c.c.a.a xQj = null;
  
  public b(Context paramContext)
  {
    this.mContext = paramContext;
    paramContext = com.tencent.c.f.a.bw(paramContext, paramContext.getPackageName());
    this.mVersionName = paramContext.versionName;
    this.xQg = paramContext.versionCode;
    this.xQf = 82;
    this.mChannelId = "105901";
    this.xQh = "7AD75E27CD5842F6";
  }
  
  private static String XP(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private com.tencent.c.c.a.c cnr()
  {
    int m = 2;
    if (this.xQi == null)
    {
      this.xQi = new com.tencent.c.c.a.c();
      this.xQi.xQt = this.xQf;
      this.xQi.xQy = this.xQg;
      this.xQi.xQq = this.mChannelId;
      this.xQi.xQp = this.xQh;
    }
    try
    {
      localObject = this.mVersionName.trim().split("[\\.]");
      if ((localObject == null) || (localObject.length < 3)) {
        break label331;
      }
      k = Integer.parseInt(localObject[0]);
      j = Integer.parseInt(localObject[1]);
      i = Integer.parseInt(localObject[2]);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject;
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
    this.xQi.imei = XP(d.fX(this.mContext));
    this.xQi.imsi = XP(d.fY(this.mContext));
    this.xQi.xQr = XP(Build.MODEL);
    this.xQi.pCr = XP(d.fZ(this.mContext));
    this.xQi.xQE = XP(d.mV(true));
    this.xQi.xQF = XP(d.mV(false));
    this.xQi.guid = null;
    this.xQi.xQw = 0;
    localObject = this.xQi;
    if (d.ga(this.mContext) == d.a.xSS) {}
    for (i = m;; i = 1)
    {
      ((com.tencent.c.c.a.c)localObject).xQs = i;
      return this.xQi;
    }
  }
  
  public final byte[] a(com.tencent.c.c.b.a parama)
  {
    try
    {
      l locall = new l();
      locall.cnK();
      locall.XZ("viruscheck");
      locall.Ya("RiskCheck");
      locall.XY("UTF-8");
      if (this.xQj == null)
      {
        this.xQj = new com.tencent.c.c.a.a();
        this.xQj.xQk = 2;
        this.xQj.xQl = 201;
      }
      locall.put("phonetype", this.xQj);
      locall.put("userinfo", cnr());
      locall.put("req", parama);
      parama = com.tencent.c.f.b.l(locall.oO());
      if (parama == null) {
        throw new RuntimeException("compress data fail");
      }
      parama = com.tencent.c.f.c.j(parama, com.tencent.c.f.c.cnH());
      return parama;
    }
    catch (Exception parama) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */