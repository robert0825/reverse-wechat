package com.tencent.mm.xlog.app;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.comm.PlatformComm;
import com.tencent.mars.xlog.LogLogic;
import com.tencent.mars.xlog.Xlog;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.sdk.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public class XLogSetup
{
  public static Boolean appendIsSync;
  public static String cachePath;
  public static boolean hasInit;
  public static Boolean isLogcatOpen;
  public static String logPath;
  public static String nameprefix;
  private static boolean setup;
  public static Integer toolsLevel;
  public static Xlog xlog;
  
  static
  {
    GMTrace.i(13734634323968L, 102331);
    setup = false;
    xlog = new Xlog();
    hasInit = false;
    GMTrace.o(13734634323968L, 102331);
  }
  
  public XLogSetup()
  {
    GMTrace.i(13734231670784L, 102328);
    GMTrace.o(13734231670784L, 102328);
  }
  
  public static void keep_setupXLog(boolean paramBoolean, String paramString1, String paramString2, Integer paramInteger, Boolean paramBoolean1, Boolean paramBoolean2, String paramString3)
  {
    GMTrace.i(13734500106240L, 102330);
    if (!hasInit)
    {
      PlatformComm.init(ab.getContext(), new ae(Looper.getMainLooper()));
      hasInit = true;
    }
    cachePath = paramString1;
    logPath = paramString2;
    toolsLevel = paramInteger;
    appendIsSync = paramBoolean1;
    isLogcatOpen = paramBoolean2;
    nameprefix = paramString3;
    if (!paramBoolean)
    {
      GMTrace.o(13734500106240L, 102330);
      return;
    }
    if (setup)
    {
      GMTrace.o(13734500106240L, 102330);
      return;
    }
    setup = true;
    k.b(a.vgN, XLogSetup.class.getClassLoader());
    w.a(xlog);
    appendIsSync.booleanValue();
    Xlog.setConsoleLogOpen(isLogcatOpen.booleanValue());
    if (toolsLevel == null)
    {
      Xlog.AppenderOpen(2, 0, cachePath, logPath, nameprefix);
      LogLogic.initIPxxLogInfo();
      GMTrace.o(13734500106240L, 102330);
      return;
    }
    Xlog.AppenderOpen(toolsLevel.intValue(), 1, cachePath, logPath, nameprefix);
    GMTrace.o(13734500106240L, 102330);
  }
  
  public static void realSetupXlog()
  {
    GMTrace.i(13734365888512L, 102329);
    keep_setupXLog(true, cachePath, logPath, toolsLevel, appendIsSync, isLogcatOpen, nameprefix);
    GMTrace.o(13734365888512L, 102329);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\xlog\app\XLogSetup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */