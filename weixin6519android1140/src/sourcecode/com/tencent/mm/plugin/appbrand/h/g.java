package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;

public final class g
{
  public volatile boolean aDI;
  String hXm;
  int ita;
  Map<String, String> ite;
  ArrayList<String> itf;
  int itg;
  HttpURLConnection iti;
  String itj;
  String ito;
  Map<String, String> itp;
  f.a itq;
  String mMimeType;
  String mName;
  String mUrl;
  private long startTime;
  
  g(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, f.a parama)
  {
    GMTrace.i(10676214956032L, 79544);
    this.aDI = false;
    this.itg = 15;
    this.iti = null;
    this.ito = paramString1;
    this.mUrl = paramString2;
    this.itq = parama;
    this.mName = paramString3;
    this.ita = paramInt;
    this.mMimeType = paramString4;
    this.startTime = System.currentTimeMillis();
    GMTrace.o(10676214956032L, 79544);
  }
  
  public final int YQ()
  {
    GMTrace.i(18360045666304L, 136793);
    int i = (int)(System.currentTimeMillis() - this.startTime);
    GMTrace.o(18360045666304L, 136793);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\h\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */