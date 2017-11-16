package com.tencent.mm.compatible.util;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.a;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.av.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class e
  extends a
{
  public static final String fRW;
  public static String fRX;
  public static String fRY;
  public static String fRZ;
  public static String fSa;
  public static String fSb;
  public static String fSc;
  public static String fSd;
  public static String fSe;
  public static String fSf;
  public static String fSg;
  public static String fSh;
  public static String fSi;
  public static String fSj;
  public static String fSk;
  public static String fSl;
  public static String fSm;
  public static String fSn;
  
  static
  {
    GMTrace.i(13789126721536L, 102737);
    fRW = h.getExternalStorageDirectory().getParent();
    fRX = ghz + "Download/";
    fSa = ghz + "vusericon/";
    fSb = ghz + "Game/";
    fSc = ghz + "CDNTemp/";
    fSd = ghz + "Download/VoiceRemind";
    fSe = ghz + "watchdog/";
    fSf = ghz + "xlog";
    fSg = ghz + "avatar/";
    fSh = ghz + "exdevice/";
    fSi = ghz + "newyear/";
    fSj = ghz + "expose/";
    fSk = ghz + "f2flucky/";
    fSl = ghz + "WebviewCache/";
    fSm = ghz + "pattern_recognition/";
    fSn = ghz + "sniffer/";
    GMTrace.o(13789126721536L, 102737);
  }
  
  public static void dQ(String paramString)
  {
    GMTrace.i(13788992503808L, 102736);
    w.i("MicroMsg.CConstants", "initSdCardPath start SDCARD_ROOT: " + ghx);
    if (bg.nm(paramString))
    {
      paramString = av.bQz();
      int j = paramString.size();
      int i = 0;
      while (i < j)
      {
        w.i("MicroMsg.CConstants", "initSdCardPath start list i = " + i + " StatMountParse: " + paramString.get(i));
        i += 1;
      }
      if (j > 1) {
        Collections.sort(paramString, new Comparator() {});
      }
      if ((j > 0) && (paramString.get(0) != null) && (!bg.nm(((av.a)paramString.get(0)).vkG)))
      {
        ghx = ((av.a)paramString.get(0)).vkG;
        i = 0;
        while (i < j)
        {
          w.i("MicroMsg.CConstants", "initSdCardPath end list i = " + i + " StatMountParse: " + paramString.get(i));
          i += 1;
        }
      }
    }
    else
    {
      ghx = paramString;
    }
    ghz = ghx + ghy;
    fRX = ghz + "Download/";
    fSa = ghz + "vusericon/";
    fSb = ghz + "Game/";
    fSc = ghz + "CDNTemp/";
    fSe = ghz + "watchdog/";
    fSf = ghz + "xlog";
    ghA = ghz + "crash/";
    fSg = ghz + "avatar/";
    fRY = ghz + "Cache/";
    String str = ghz + "WeChat/";
    paramString = ghz + "WeiXin/";
    if (!com.tencent.mm.a.e.aZ(str)) {
      if (!com.tencent.mm.a.e.aZ(paramString)) {}
    }
    for (;;)
    {
      fRZ = paramString;
      w.i("MicroMsg.CConstants", "initSdCardPath end SDCARD_ROOT: " + ghx);
      GMTrace.o(13788992503808L, 102736);
      return;
      if (!v.bPK().equals("zh_CN")) {
        paramString = str;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\util\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */