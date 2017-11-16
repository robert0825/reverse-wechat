package com.tencent.mm.plugin.music.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class h
{
  public static int DN(String paramString)
  {
    GMTrace.i(18372259479552L, 136884);
    if ("audio/3gpp".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 1;
    }
    if ("audio/amr-wb".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 2;
    }
    if (("audio/mpeg".equalsIgnoreCase(paramString)) || ("audio/mp3".equalsIgnoreCase(paramString)))
    {
      GMTrace.o(18372259479552L, 136884);
      return 3;
    }
    if (("audio/mp4a-latm".equalsIgnoreCase(paramString)) || (paramString.startsWith("audio/mp4")))
    {
      GMTrace.o(18372259479552L, 136884);
      return 4;
    }
    if ("audio/qcelp".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 5;
    }
    if ("audio/vorbis".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 6;
    }
    if ("audio/opus".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 7;
    }
    if ("audio/g711-alaw".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 8;
    }
    if ("audio/g711-mlaw".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 9;
    }
    if ("audio/raw".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 10;
    }
    if ("audio/flac".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 11;
    }
    if ("audio/gsm".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 12;
    }
    if ("audio/ac3".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 13;
    }
    if ("audio/eac3".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 14;
    }
    if ("audio/x-ms-wma".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 15;
    }
    if ("audio/x-wav".equalsIgnoreCase(paramString))
    {
      GMTrace.o(18372259479552L, 136884);
      return 16;
    }
    if (("audio/x-ape".equalsIgnoreCase(paramString)) || ("application/x-ape".equalsIgnoreCase(paramString)))
    {
      GMTrace.o(18372259479552L, 136884);
      return 17;
    }
    GMTrace.o(18372259479552L, 136884);
    return 0;
  }
  
  public static int rC(int paramInt)
  {
    GMTrace.i(19531900649472L, 145524);
    w.i("MicroMsg.PlayerErrorHandler", "getErrCodeType, errorCode: %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      GMTrace.o(19531900649472L, 145524);
      return -1;
    case 62: 
    case 66: 
    case 67: 
    case 69: 
    case 70: 
    case 74: 
    case 102: 
    case 702: 
    case 704: 
    case 706: 
    case 707: 
      GMTrace.o(19531900649472L, 145524);
      return 10001;
    case 80: 
      GMTrace.o(19531900649472L, 145524);
      return 10002;
    case 53: 
    case 54: 
      GMTrace.o(19531900649472L, 145524);
      return 10003;
    case 55: 
    case 63: 
    case 64: 
    case 101: 
    case 701: 
    case 703: 
    case 705: 
      GMTrace.o(19531900649472L, 145524);
      return 10004;
    }
    GMTrace.o(19531900649472L, 145524);
    return 10001;
  }
  
  public static String rD(int paramInt)
  {
    GMTrace.i(19532034867200L, 145525);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("errCode:" + paramInt + ", err:");
    switch (paramInt)
    {
    default: 
      ((StringBuilder)localObject).append("unknow exception");
    }
    for (;;)
    {
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(19532034867200L, 145525);
      return (String)localObject;
      ((StringBuilder)localObject).append("file not found");
      continue;
      ((StringBuilder)localObject).append("file can not read");
      continue;
      ((StringBuilder)localObject).append("unknow format");
      continue;
      ((StringBuilder)localObject).append("load or init native decode so fail");
      continue;
      ((StringBuilder)localObject).append("get audio info fail");
      continue;
      ((StringBuilder)localObject).append("invalid audio info");
      continue;
      ((StringBuilder)localObject).append("create AudioTrack fail");
      continue;
      ((StringBuilder)localObject).append("decode audio fail");
      continue;
      ((StringBuilder)localObject).append("so file not found");
      continue;
      ((StringBuilder)localObject).append("create temp file fail");
      continue;
      ((StringBuilder)localObject).append("invalid seek or seek fail");
      continue;
      ((StringBuilder)localObject).append("connect network fail");
      continue;
      ((StringBuilder)localObject).append("recognition audio format error");
      continue;
      ((StringBuilder)localObject).append("write AudioTrack data fail");
      continue;
      ((StringBuilder)localObject).append("error URL format");
      continue;
      ((StringBuilder)localObject).append("error player to prepare");
      continue;
      ((StringBuilder)localObject).append("error player to start");
      continue;
      ((StringBuilder)localObject).append("error player to pause");
      continue;
      ((StringBuilder)localObject).append("error player to stop");
      continue;
      ((StringBuilder)localObject).append("error create player fail, exceed max count audio players");
      continue;
      ((StringBuilder)localObject).append("error, not found audioId");
      continue;
      ((StringBuilder)localObject).append("error, not found param");
      continue;
      ((StringBuilder)localObject).append("error, ready exist audioId");
      continue;
      ((StringBuilder)localObject).append("error, invalid audioID");
      continue;
      ((StringBuilder)localObject).append("error, invalid param");
      continue;
      ((StringBuilder)localObject).append("error, invalid param");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer set source occur error");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer media format error");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer create MediaCode error");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer get audio info error");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer decode error");
      continue;
      ((StringBuilder)localObject).append("error, mmplayer create audio track orror");
    }
  }
  
  public static int rE(int paramInt)
  {
    GMTrace.i(20365526958080L, 151735);
    w.i("MicroMsg.PlayerErrorHandler", "getQQMusicPlayerErrIdKey, errCode:" + paramInt);
    switch (paramInt)
    {
    default: 
      GMTrace.o(20365526958080L, 151735);
      return 30;
    case 53: 
      GMTrace.o(20365526958080L, 151735);
      return 17;
    case 54: 
      GMTrace.o(20365526958080L, 151735);
      return 18;
    case 55: 
      GMTrace.o(20365526958080L, 151735);
      return 19;
    case 62: 
      GMTrace.o(20365526958080L, 151735);
      return 20;
    case 63: 
      GMTrace.o(20365526958080L, 151735);
      return 21;
    case 64: 
      GMTrace.o(20365526958080L, 151735);
      return 22;
    case 66: 
      GMTrace.o(20365526958080L, 151735);
      return 23;
    case 67: 
      GMTrace.o(20365526958080L, 151735);
      return 24;
    case 69: 
      GMTrace.o(20365526958080L, 151735);
      return 25;
    case 70: 
      GMTrace.o(20365526958080L, 151735);
      return 36;
    case 74: 
      GMTrace.o(20365526958080L, 151735);
      return 26;
    case 80: 
      GMTrace.o(20365526958080L, 151735);
      return 27;
    case 101: 
      GMTrace.o(20365526958080L, 151735);
      return 28;
    case 102: 
      GMTrace.o(20365526958080L, 151735);
      return 29;
    case 500: 
      GMTrace.o(20365526958080L, 151735);
      return 31;
    case 501: 
      GMTrace.o(20365526958080L, 151735);
      return 32;
    case 502: 
      GMTrace.o(20365526958080L, 151735);
      return 33;
    case 503: 
      GMTrace.o(20365526958080L, 151735);
      return 34;
    case 504: 
      GMTrace.o(20365526958080L, 151735);
      return 35;
    case 700: 
      GMTrace.o(20365526958080L, 151735);
      return 37;
    }
    GMTrace.o(20365526958080L, 151735);
    return 38;
  }
  
  public static int rF(int paramInt)
  {
    GMTrace.i(20365661175808L, 151736);
    w.i("MicroMsg.PlayerErrorHandler", "getMusicPlayerErrIdKey, errCode:" + paramInt);
    switch (paramInt)
    {
    default: 
      GMTrace.o(20365661175808L, 151736);
      return 189;
    case 700: 
      GMTrace.o(20365661175808L, 151736);
      return 45;
    case 701: 
      GMTrace.o(20365661175808L, 151736);
      return 48;
    case 702: 
      GMTrace.o(20365661175808L, 151736);
      return 39;
    case 703: 
      GMTrace.o(20365661175808L, 151736);
      return 40;
    case 704: 
      GMTrace.o(20365661175808L, 151736);
      return 41;
    case 705: 
      GMTrace.o(20365661175808L, 151736);
      return 42;
    case 706: 
      GMTrace.o(20365661175808L, 151736);
      return 43;
    }
    GMTrace.o(20365661175808L, 151736);
    return 44;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\f\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */