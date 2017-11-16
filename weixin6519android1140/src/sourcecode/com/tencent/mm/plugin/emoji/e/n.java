package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.e;
import com.tencent.mm.plugin.gif.MMWXGFJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class n
{
  private static boolean kjU;
  private static boolean kjV;
  private static boolean kjW;
  private static boolean kjX;
  
  static
  {
    GMTrace.i(19272189345792L, 143589);
    kjU = false;
    kjV = false;
    kjW = false;
    kjX = false;
    GMTrace.o(19272189345792L, 143589);
  }
  
  public static boolean aqQ()
  {
    GMTrace.i(11543395696640L, 86005);
    if ((com.tencent.mm.k.g.ut().getInt("EmotionRewardOption", 0) & 0x1) == 1)
    {
      GMTrace.o(11543395696640L, 86005);
      return false;
    }
    GMTrace.o(11543395696640L, 86005);
    return true;
  }
  
  public static boolean aqR()
  {
    GMTrace.i(19271249821696L, 143582);
    if ((com.tencent.mm.k.g.ut().getInt("EmotionRewardOption", 0) & 0x2) == 2)
    {
      GMTrace.o(19271249821696L, 143582);
      return false;
    }
    GMTrace.o(19271249821696L, 143582);
    return true;
  }
  
  public static boolean aqS()
  {
    GMTrace.i(19271384039424L, 143583);
    if ((com.tencent.mm.k.g.ut().getInt("EmotionRewardOption", 0) & 0x4) == 4)
    {
      GMTrace.o(19271384039424L, 143583);
      return true;
    }
    GMTrace.o(19271384039424L, 143583);
    return false;
  }
  
  public static int aqT()
  {
    GMTrace.i(11543529914368L, 86006);
    int i = bg.getInt(com.tencent.mm.k.g.ut().getValue("CustomEmojiMaxSize"), 150);
    GMTrace.o(11543529914368L, 86006);
    return i;
  }
  
  public static String aqU()
  {
    GMTrace.i(19271518257152L, 143584);
    String str = com.tencent.mm.k.g.ut().getValue("C2CEmojiNotAutoDownloadTimeRange");
    GMTrace.o(19271518257152L, 143584);
    return str;
  }
  
  public static String aqV()
  {
    GMTrace.i(11543664132096L, 86007);
    String str = com.tencent.mm.k.g.ut().getValue("EmotionPanelConfigName");
    GMTrace.o(11543664132096L, 86007);
    return str;
  }
  
  public static boolean aqW()
  {
    GMTrace.i(19271652474880L, 143585);
    com.tencent.mm.storage.c localc;
    if (!kjU)
    {
      localc = com.tencent.mm.y.c.c.Ct().er("100296");
      if (!localc.isValid()) {
        break label298;
      }
    }
    label298:
    for (int i = bg.getInt((String)localc.bSg().get("EnableEmoticonExternUrl"), 0);; i = 0)
    {
      int j = com.tencent.mm.k.g.ut().getInt("EnableEmoticonExternUrl", 0);
      int k = MMWXGFJNI.getErrorCode();
      if (((j & 0x1) == 1) || ((i & 0x1) == 1)) {
        if ((!aqY()) && (!aqZ()))
        {
          kjW = true;
          if (k < 0)
          {
            kjW = false;
            switch (k)
            {
            }
          }
        }
      }
      for (;;)
      {
        kjU = true;
        w.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDownload:%b", new Object[] { Boolean.valueOf(kjW) });
        boolean bool = kjW;
        GMTrace.o(19271652474880L, 143585);
        return bool;
        kjW = false;
        break;
        kjW = false;
        break;
        com.tencent.mm.plugin.report.service.g.ork.a(711L, 5L, 1L, false);
        continue;
        com.tencent.mm.plugin.report.service.g.ork.a(711L, 6L, 1L, false);
        continue;
        com.tencent.mm.plugin.report.service.g.ork.a(711L, 7L, 1L, false);
        continue;
        com.tencent.mm.plugin.report.service.g.ork.a(711L, 8L, 1L, false);
        continue;
        com.tencent.mm.plugin.report.service.g.ork.a(711L, 9L, 1L, false);
        continue;
        com.tencent.mm.plugin.report.service.g.ork.a(711L, 10L, 1L, false);
      }
    }
  }
  
  public static boolean aqX()
  {
    GMTrace.i(19271786692608L, 143586);
    int k;
    if (!kjV)
    {
      int i = 0;
      com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100296");
      if (localc.isValid()) {
        i = bg.getInt((String)localc.bSg().get("EnableEmoticonExternUrl"), 0);
      }
      int j = com.tencent.mm.k.g.ut().getInt("EnableEmoticonExternUrl", 0);
      k = MMWXGFJNI.getErrorCode();
      if (((j & 0x2) != 2) && ((i & 0x2) != 2)) {
        break label168;
      }
      if ((aqY()) || (aqZ())) {
        break label156;
      }
      kjX = true;
      com.tencent.mm.plugin.report.service.g.ork.a(711L, 1L, 1L, false);
    }
    for (;;)
    {
      if (k < 0) {
        kjX = false;
      }
      kjV = true;
      w.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDecode:%b", new Object[] { Boolean.valueOf(kjX) });
      boolean bool = kjX;
      GMTrace.o(19271786692608L, 143586);
      return bool;
      label156:
      com.tencent.mm.plugin.report.service.g.ork.a(711L, 0L, 1L, false);
      label168:
      kjX = false;
    }
  }
  
  private static boolean aqY()
  {
    boolean bool = true;
    GMTrace.i(19271920910336L, 143587);
    PackageManager localPackageManager = ab.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
      GMTrace.o(19271920910336L, 143587);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        bool = false;
      }
    }
  }
  
  private static boolean aqZ()
  {
    boolean bool = true;
    GMTrace.i(19272055128064L, 143588);
    PackageManager localPackageManager = ab.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app", 1);
      GMTrace.o(19272055128064L, 143588);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        bool = false;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */