package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;

public final class d
{
  String hXm;
  int ita;
  byte[] itb;
  String itc;
  c.a itd;
  Map<String, String> ite;
  ArrayList<String> itf;
  int itg;
  String ith;
  HttpURLConnection iti;
  String itj;
  String mUrl;
  private long startTime;
  
  public d(String paramString1, byte[] paramArrayOfByte, int paramInt, c.a parama, String paramString2)
  {
    GMTrace.i(10680375705600L, 79575);
    this.itg = 15;
    this.mUrl = paramString1;
    this.itb = paramArrayOfByte;
    this.itd = parama;
    this.ita = paramInt;
    this.itc = paramString2;
    this.startTime = System.currentTimeMillis();
    GMTrace.o(10680375705600L, 79575);
  }
  
  public final int YQ()
  {
    GMTrace.i(18360716754944L, 136798);
    int i = (int)(System.currentTimeMillis() - this.startTime);
    GMTrace.o(18360716754944L, 136798);
    return i;
  }
  
  public final long getDataSize()
  {
    GMTrace.i(18360850972672L, 136799);
    if (this.itb != null)
    {
      long l = this.itb.length;
      GMTrace.o(18360850972672L, 136799);
      return l;
    }
    GMTrace.o(18360850972672L, 136799);
    return 0L;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */