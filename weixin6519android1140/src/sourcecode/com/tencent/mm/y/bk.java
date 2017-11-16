package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.apk;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.t;

public final class bk
{
  public String countryCode;
  public int fja;
  public int fjj;
  public String fjo;
  private String goS;
  private String goT;
  public String goU;
  public String goV;
  public String signature;
  
  public bk()
  {
    GMTrace.i(13291984257024L, 99033);
    this.fjj = 0;
    this.fja = 0;
    this.goS = "";
    this.goT = "";
    this.signature = "";
    this.fjo = "";
    this.countryCode = "";
    this.goV = "";
    this.goU = "";
    GMTrace.o(13291984257024L, 99033);
  }
  
  public static bk BE()
  {
    GMTrace.i(13291581603840L, 99030);
    bk localbk = new bk();
    localbk.fjj = 1;
    localbk.fja = bg.a((Integer)h.xy().xh().get(12290, null), 0);
    localbk.goS = ((String)h.xy().xh().get(12293, null));
    localbk.goT = ((String)h.xy().xh().get(12292, null));
    localbk.signature = ((String)h.xy().xh().get(12291, null));
    localbk.fjo = ((String)h.xy().xh().get(12307, null));
    localbk.countryCode = ((String)h.xy().xh().get(12324, null));
    localbk.goV = ((String)h.xy().xh().get(12325, null));
    localbk.goU = ((String)h.xy().xh().get(12326, null));
    GMTrace.o(13291581603840L, 99030);
    return localbk;
  }
  
  public static bk BF()
  {
    GMTrace.i(13291715821568L, 99031);
    if (bg.a((Integer)h.xy().xh().get(12289, null), 0) == 0)
    {
      GMTrace.o(13291715821568L, 99031);
      return null;
    }
    bk localbk = BE();
    GMTrace.o(13291715821568L, 99031);
    return localbk;
  }
  
  public static apk a(bk parambk)
  {
    GMTrace.i(13291850039296L, 99032);
    h.xy().xh().set(12289, Integer.valueOf(parambk.fjj));
    h.xy().xh().set(12290, Integer.valueOf(parambk.fja));
    if (a.O((String)h.xy().xh().get(12293, null), parambk.getProvince())) {
      h.xy().xh().set(12293, parambk.getProvince());
    }
    if (a.O((String)h.xy().xh().get(12292, null), parambk.getCity())) {
      h.xy().xh().set(12292, parambk.getCity());
    }
    if (a.O((String)h.xy().xh().get(12291, null), parambk.signature)) {
      h.xy().xh().set(12291, parambk.signature);
    }
    if (a.O((String)h.xy().xh().get(12307, null), parambk.fjo)) {
      h.xy().xh().set(12307, parambk.fjo);
    }
    if (a.O((String)h.xy().xh().get(12324, null), parambk.countryCode)) {
      h.xy().xh().set(12324, parambk.countryCode);
    }
    if (a.O((String)h.xy().xh().get(12325, null), parambk.goV)) {
      h.xy().xh().set(12325, parambk.goV);
    }
    if (a.O((String)h.xy().xh().get(12326, null), parambk.goU)) {
      h.xy().xh().set(12326, parambk.goU);
    }
    apk localapk = new apk();
    localapk.uFa = 128;
    localapk.ufy = new azq().Rq("");
    localapk.uxT = new azq().Rq("");
    localapk.tOs = 0;
    localapk.uFb = new azq().Rq("");
    localapk.uFc = new azq().Rq("");
    localapk.jhA = 0;
    byte[] arrayOfByte2 = com.tencent.mm.a.e.c("", 0, -1);
    byte[] arrayOfByte1;
    if (arrayOfByte2 == null)
    {
      arrayOfByte1 = new byte[0];
      localapk.uEY = new b(arrayOfByte1);
      if (arrayOfByte2 != null) {
        break label604;
      }
    }
    label604:
    for (int i = 0;; i = arrayOfByte2.length)
    {
      localapk.uEX = i;
      localapk.gCx = parambk.fja;
      localapk.gCB = parambk.fjj;
      localapk.gCA = bg.nl(parambk.signature);
      localapk.gCz = bg.nl(parambk.goU);
      localapk.gCy = bg.nl(parambk.goV);
      localapk.tOv = 0;
      localapk.uAx = bg.nl(parambk.fjo);
      localapk.uFh = 0;
      localapk.gCC = "";
      localapk.uAz = 0;
      localapk.uAy = "";
      localapk.gCG = bg.nl(parambk.countryCode);
      GMTrace.o(13291850039296L, 99032);
      return localapk;
      arrayOfByte1 = arrayOfByte2;
      break;
    }
  }
  
  public final String getCity()
  {
    GMTrace.i(13292118474752L, 99034);
    if (!bg.nm(this.countryCode))
    {
      if (bg.nm(this.goV)) {
        break label109;
      }
      if (!bg.nm(this.goU)) {
        break label84;
      }
      this.goT = RegionCodeDecoder.bUl().fg(this.countryCode, this.goV);
    }
    while (bg.nm(this.goT))
    {
      str = bg.nl(this.goU);
      GMTrace.o(13292118474752L, 99034);
      return str;
      label84:
      this.goT = RegionCodeDecoder.bUl().aj(this.countryCode, this.goV, this.goU);
      continue;
      label109:
      this.goT = "";
    }
    String str = this.goT;
    GMTrace.o(13292118474752L, 99034);
    return str;
  }
  
  public final String getProvince()
  {
    GMTrace.i(13292252692480L, 99035);
    if (!bg.nm(this.countryCode)) {
      if ((bg.nm(this.goV)) || (bg.nm(this.goU)) || (!RegionCodeDecoder.Uu(this.countryCode))) {
        break label94;
      }
    }
    label94:
    for (this.goS = RegionCodeDecoder.bUl().fg(this.countryCode, this.goV); bg.nm(this.goS); this.goS = RegionCodeDecoder.bUl().Uv(this.countryCode))
    {
      str = bg.nl(this.goV);
      GMTrace.o(13292252692480L, 99035);
      return str;
    }
    String str = this.goS;
    GMTrace.o(13292252692480L, 99035);
    return str;
  }
  
  private static final class a
  {
    public static boolean O(String paramString1, String paramString2)
    {
      GMTrace.i(13286212894720L, 98990);
      if (bg.nm(paramString1))
      {
        GMTrace.o(13286212894720L, 98990);
        return true;
      }
      paramString1 = decode(encode(paramString1));
      if ((bg.nm(paramString1)) || (!paramString1.equals(paramString2)))
      {
        GMTrace.o(13286212894720L, 98990);
        return true;
      }
      GMTrace.o(13286212894720L, 98990);
      return false;
    }
    
    private static String decode(String paramString)
    {
      GMTrace.i(13286481330176L, 98992);
      if ((bg.nm(paramString)) || (paramString.length() % 2 != 0))
      {
        GMTrace.o(13286481330176L, 98992);
        return "";
      }
      String str = "";
      int i = 0;
      try
      {
        while (i < paramString.length())
        {
          str = str + (char)Integer.parseInt(paramString.substring(i, i + 2), 16);
          i += 2;
        }
        GMTrace.o(13286481330176L, 98992);
      }
      catch (Exception paramString)
      {
        GMTrace.o(13286481330176L, 98992);
        return "";
      }
      return str;
    }
    
    private static String encode(String paramString)
    {
      GMTrace.i(13286347112448L, 98991);
      char[] arrayOfChar = paramString.toCharArray();
      try
      {
        int j = arrayOfChar.length;
        paramString = "";
        int i = 0;
        while (i < j)
        {
          int k = arrayOfChar[i];
          paramString = paramString + String.format("%02x", new Object[] { Integer.valueOf(k) });
          i += 1;
        }
        GMTrace.o(13286347112448L, 98991);
      }
      catch (Exception paramString)
      {
        GMTrace.o(13286347112448L, 98991);
        return "";
      }
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */