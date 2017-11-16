package com.tencent.mm.plugin.report.service;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.mars.smc.SmcLogic.BaseInfo;
import com.tencent.mars.smc.SmcLogic.ICallBack;
import com.tencent.mars.smc.SmcProtoBufUtil;
import com.tencent.mm.ad.n;
import com.tencent.mm.c.f;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.a.a.k;
import com.tencent.mm.protocal.c.aif;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class h
  implements SmcLogic.ICallBack
{
  public static IKVReportNotify orx;
  
  static
  {
    GMTrace.i(13114414202880L, 97710);
    orx = null;
    GMTrace.o(13114414202880L, 97710);
  }
  
  public h()
  {
    GMTrace.i(13113340461056L, 97702);
    GMTrace.o(13113340461056L, 97702);
  }
  
  public static void FJ(String paramString)
  {
    GMTrace.i(13114279985152L, 97709);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.SmcCallBack", "msg content is null");
      GMTrace.o(13114279985152L, 97709);
      return;
    }
    w.i("MicroMsg.SmcCallBack", "receive msg: " + paramString);
    Map localMap = f.q(paramString, "sysmsg");
    if ((localMap == null) || (localMap.size() == 0))
    {
      w.e("MicroMsg.SmcCallBack", "plugin msg parse fail:" + paramString);
      GMTrace.o(13114279985152L, 97709);
      return;
    }
    String str = (String)localMap.get(".sysmsg.$type");
    if ((bg.nm(str)) || (!str.equalsIgnoreCase("getkvidkeystg")))
    {
      w.e("MicroMsg.SmcCallBack", "plugin msg parse fail:" + paramString);
      GMTrace.o(13114279985152L, 97709);
      return;
    }
    long l1 = bg.getLong((String)localMap.get(".sysmsg.getkvidkeystg.generalversion"), -1L);
    long l2 = bg.getLong((String)localMap.get(".sysmsg.getkvidkeystg.specialversion"), -1L);
    long l3 = bg.getLong((String)localMap.get(".sysmsg.getkvidkeystg.whiteorblackuinversion"), -1L);
    long l4 = bg.getLong((String)localMap.get(".sysmsg.getkvidkeystg.timeinterval"), -1L);
    long l5 = bg.getLong((String)localMap.get(".sysmsg.getkvidkeystg.kvgeneralversion"), -1L);
    long l6 = bg.getLong((String)localMap.get(".sysmsg.getkvidkeystg.kvspecialversion"), -1L);
    long l7 = bg.getLong((String)localMap.get(".sysmsg.getkvidkeystg.kvwhiteorblackuinversion"), -1L);
    if ((l1 == -1L) || (l2 == -1L) || (l3 == -1L) || (l4 == -1L) || (-1L == l5) || (-1L == l6) || (-1L == l7))
    {
      w.e("MicroMsg.SmcCallBack", "plugin msg parse fail:" + paramString);
      GMTrace.o(13114279985152L, 97709);
      return;
    }
    w.i("MicroMsg.SmcCallBack", "plugin msg version:" + l1 + ", " + l2 + ", " + l3);
    SmcLogic.OnPluginMsg(l5, l6, l7, l1, l2, l4);
    GMTrace.o(13114279985152L, 97709);
  }
  
  public final boolean OnSelfMonitorOpLogReady(byte[] paramArrayOfByte)
  {
    GMTrace.i(13113743114240L, 97705);
    com.tencent.mm.kernel.h.xw();
    if (!a.wK())
    {
      w.e("MicroMsg.SmcCallBack", "onReportKVDaSelfMonitorOpLogReady account not ready");
      GMTrace.o(13113743114240L, 97705);
      return false;
    }
    try
    {
      k localk = new k();
      localk.aD(paramArrayOfByte);
      paramArrayOfByte = SmcProtoBufUtil.toMMSelfMonitor(localk);
      if (paramArrayOfByte.uxB <= 0)
      {
        w.e("KVReportJni", "error selfmonitor count");
        GMTrace.o(13113743114240L, 97705);
        return true;
      }
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new e.a(202, paramArrayOfByte));
      GMTrace.o(13113743114240L, 97705);
      return true;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("KVReportJni", paramArrayOfByte.getMessage());
      GMTrace.o(13113743114240L, 97705);
    }
    return false;
  }
  
  public final String getKVCommPath()
  {
    GMTrace.i(13114145767424L, 97708);
    String str = AppLogic.getAppFilePath() + "/kvcomm/";
    GMTrace.o(13114145767424L, 97708);
    return str;
  }
  
  public final SmcLogic.BaseInfo getKVCommReqBaseInfo()
  {
    GMTrace.i(13114011549696L, 97707);
    SmcLogic.BaseInfo localBaseInfo = new SmcLogic.BaseInfo();
    localBaseInfo.deviceModel = (Build.MODEL + Build.CPU_ABI);
    localBaseInfo.deviceBrand = Build.BRAND;
    localBaseInfo.osName = ("android-" + Build.MANUFACTURER);
    localBaseInfo.osVersion = Build.VERSION.SDK_INT;
    localBaseInfo.languageVer = v.bPK();
    GMTrace.o(13114011549696L, 97707);
    return localBaseInfo;
  }
  
  public final int getSingleReportBufSizeB()
  {
    GMTrace.i(13113877331968L, 97706);
    GMTrace.o(13113877331968L, 97706);
    return 20480;
  }
  
  public final void onReportDataReady(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    GMTrace.i(13113474678784L, 97703);
    try
    {
      if ((orx != null) && (paramArrayOfByte2 != null) && (paramArrayOfByte2.length > 0)) {
        orx.onReportKVDataReady(paramArrayOfByte1, paramArrayOfByte2, paramInt);
      }
      GMTrace.o(13113474678784L, 97703);
      return;
    }
    catch (Exception paramArrayOfByte1)
    {
      w.e("KVReportJni", paramArrayOfByte1.getMessage());
      GMTrace.o(13113474678784L, 97703);
    }
  }
  
  public final boolean onRequestGetStrategy(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(13113608896512L, 97704);
    try
    {
      try
      {
        if (com.tencent.mm.plugin.report.b.h.isRunning())
        {
          w.i("KVReportJni", "already running");
          GMTrace.o(13113608896512L, 97704);
          return false;
        }
        paramArrayOfByte = new com.tencent.mm.plugin.report.b.h();
        com.tencent.mm.kernel.h.xx().fYr.a(paramArrayOfByte, 0);
        GMTrace.o(13113608896512L, 97704);
        return true;
      }
      finally {}
      return false;
    }
    catch (Exception paramArrayOfByte)
    {
      w.e("KVReportJni", "onRequestGetStrategy error: " + paramArrayOfByte.getMessage());
      GMTrace.o(13113608896512L, 97704);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\service\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */