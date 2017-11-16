package com.tencent.mm.plugin.facedetect.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class k
{
  public static int nr(int paramInt)
  {
    GMTrace.i(14525310959616L, 108222);
    if ((paramInt < 90000) && (paramInt != 0))
    {
      w.i("MicroMsg.FaceJSAPITranslateCenter", "hy: server error. not translate");
      GMTrace.o(14525310959616L, 108222);
      return paramInt;
    }
    if (paramInt > 90099)
    {
      w.i("MicroMsg.FaceJSAPITranslateCenter", "hy: already translated");
      GMTrace.o(14525310959616L, 108222);
      return paramInt;
    }
    switch (paramInt)
    {
    default: 
      GMTrace.o(14525310959616L, 108222);
      return 90199;
    case 0: 
      GMTrace.o(14525310959616L, 108222);
      return 0;
    case 90001: 
      GMTrace.o(14525310959616L, 108222);
      return 90109;
    case 90002: 
    case 90003: 
    case 90004: 
    case 90005: 
    case 90006: 
    case 90024: 
    case 90025: 
      GMTrace.o(14525310959616L, 108222);
      return 90100;
    case 90008: 
    case 90009: 
    case 90010: 
      GMTrace.o(14525310959616L, 108222);
      return 90101;
    case 90011: 
    case 90013: 
      GMTrace.o(14525310959616L, 108222);
      return 90102;
    case 90019: 
    case 90020: 
    case 90021: 
      GMTrace.o(14525310959616L, 108222);
      return 90103;
    case 90015: 
      GMTrace.o(14525310959616L, 108222);
      return 90104;
    case 90022: 
      GMTrace.o(14525310959616L, 108222);
      return 90105;
    case 90016: 
      GMTrace.o(14525310959616L, 108222);
      return 90106;
    case 90017: 
      GMTrace.o(14525310959616L, 108222);
      return 90107;
    }
    GMTrace.o(14525310959616L, 108222);
    return 90108;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */