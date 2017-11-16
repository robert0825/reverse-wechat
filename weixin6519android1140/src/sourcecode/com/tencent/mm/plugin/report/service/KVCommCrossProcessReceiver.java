package com.tencent.mm.plugin.report.service;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.BaseEvent;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.kernel.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;

public class KVCommCrossProcessReceiver
  extends BroadcastReceiver
{
  private static String className;
  private static Object lock;
  private static ae oqJ;
  private static int oqK;
  private static volatile long oqL;
  private static volatile int oqM;
  private static BroadCastData oqN;
  
  static
  {
    GMTrace.i(13117635428352L, 97734);
    HandlerThread localHandlerThread = com.tencent.mm.sdk.f.e.SV("kv_report");
    localHandlerThread.start();
    oqJ = new ae(localHandlerThread.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(14895215017984L, 110978);
        super.handleMessage(paramAnonymousMessage);
        if (paramAnonymousMessage.what == 1) {
          KVCommCrossProcessReceiver.bbV();
        }
        GMTrace.o(14895215017984L, 110978);
      }
    };
    className = "";
    oqK = 10000;
    oqL = 10000L;
    oqM = -1;
    oqN = new BroadCastData();
    lock = new Object();
    GMTrace.o(13117635428352L, 97734);
  }
  
  public KVCommCrossProcessReceiver()
  {
    GMTrace.i(13116024815616L, 97722);
    GMTrace.o(13116024815616L, 97722);
  }
  
  public static void O(ArrayList<IDKey> paramArrayList)
  {
    GMTrace.i(16287858163712L, 121354);
    w.d("MicroMsg.ReportManagerKvCheck", "receive group id size:%d, isImportant:%b", new Object[] { Integer.valueOf(paramArrayList.size()), Boolean.valueOf(false) });
    synchronized (lock)
    {
      BroadCastData localBroadCastData = oqN;
      paramArrayList = new GroupIDKeyDataInfo(paramArrayList, false);
      localBroadCastData.oqC.add(paramArrayList);
      if ((oqL == 0L) || (bbS()))
      {
        bbR();
        GMTrace.o(16287858163712L, 121354);
        return;
      }
    }
    if (oqJ.hasMessages(1))
    {
      GMTrace.o(16287858163712L, 121354);
      return;
    }
    oqJ.sendEmptyMessageDelayed(1, oqL);
    GMTrace.o(16287858163712L, 121354);
  }
  
  public static void a(KVReportDataInfo paramKVReportDataInfo)
  {
    GMTrace.i(13116561686528L, 97726);
    w.d("MicroMsg.ReportManagerKvCheck", "receive kv logid:%d, isImportant: %b,isReportNow: %b", new Object[] { Long.valueOf(paramKVReportDataInfo.oqW), Boolean.valueOf(paramKVReportDataInfo.oqE), Boolean.valueOf(paramKVReportDataInfo.oqX) });
    synchronized (lock)
    {
      oqN.oqA.add(paramKVReportDataInfo);
      if (oqL == 0L)
      {
        bbR();
        GMTrace.o(13116561686528L, 97726);
        return;
      }
    }
    if (oqJ.hasMessages(1))
    {
      GMTrace.o(13116561686528L, 97726);
      return;
    }
    oqJ.sendEmptyMessageDelayed(1, oqL);
    GMTrace.o(13116561686528L, 97726);
  }
  
  public static void a(StIDKeyDataInfo paramStIDKeyDataInfo)
  {
    GMTrace.i(13116695904256L, 97727);
    w.d("MicroMsg.ReportManagerKvCheck", "receive id ID:%d, key:%d,value:%d, isImportant:%b", new Object[] { Long.valueOf(paramStIDKeyDataInfo.ory), Long.valueOf(paramStIDKeyDataInfo.key), Long.valueOf(paramStIDKeyDataInfo.value), Boolean.valueOf(paramStIDKeyDataInfo.oqE) });
    synchronized (lock)
    {
      oqN.oqB.add(paramStIDKeyDataInfo);
      if ((oqL == 0L) || (bbS()))
      {
        bbR();
        GMTrace.o(13116695904256L, 97727);
        return;
      }
    }
    if (oqJ.hasMessages(1))
    {
      GMTrace.o(13116695904256L, 97727);
      return;
    }
    oqJ.sendEmptyMessageDelayed(1, oqL);
    GMTrace.o(13116695904256L, 97727);
  }
  
  public static void bbP()
  {
    GMTrace.i(18782160420864L, 139938);
    if (100L < 0L)
    {
      GMTrace.o(18782160420864L, 139938);
      return;
    }
    oqL = 100L;
    GMTrace.o(18782160420864L, 139938);
  }
  
  public static void bbQ()
  {
    GMTrace.i(18920538898432L, 140969);
    oqM = 1000;
    GMTrace.o(18920538898432L, 140969);
  }
  
  private static void bbR()
  {
    GMTrace.i(16088276402176L, 119867);
    Object localObject5;
    Object localObject6;
    synchronized (lock)
    {
      Object localObject2 = new BroadCastData(oqN);
      localObject5 = oqN;
      ((BroadCastData)localObject5).oqA.clear();
      ((BroadCastData)localObject5).oqB.clear();
      ((BroadCastData)localObject5).oqC.clear();
      localObject6 = ((BroadCastData)localObject2).oqC;
      localObject5 = ((BroadCastData)localObject2).oqB;
      ??? = ((BroadCastData)localObject2).oqA;
      if ((!k.aT(ab.getContext())) && (ab.bQc())) {
        break label240;
      }
      w.i("MicroMsg.ReportManagerKvCheck", "sendKVBroadcast shut_down_weixin, no need to notify worker");
      localObject2 = ((ArrayList)localObject6).iterator();
      if (((Iterator)localObject2).hasNext())
      {
        localObject6 = (GroupIDKeyDataInfo)((Iterator)localObject2).next();
        e.d(((GroupIDKeyDataInfo)localObject6).oqD, ((GroupIDKeyDataInfo)localObject6).oqE);
      }
    }
    Object localObject4 = ((ArrayList)localObject5).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject5 = (StIDKeyDataInfo)((Iterator)localObject4).next();
      e.d((int)((StIDKeyDataInfo)localObject5).ory, (int)((StIDKeyDataInfo)localObject5).key, (int)((StIDKeyDataInfo)localObject5).value, ((StIDKeyDataInfo)localObject5).oqE);
    }
    ??? = ((ArrayList)???).iterator();
    while (((Iterator)???).hasNext())
    {
      localObject4 = (KVReportDataInfo)((Iterator)???).next();
      e.b((int)((KVReportDataInfo)localObject4).oqW, ((KVReportDataInfo)localObject4).value, ((KVReportDataInfo)localObject4).oqX, ((KVReportDataInfo)localObject4).oqE);
    }
    GMTrace.o(16088276402176L, 119867);
    return;
    label240:
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver");
    localIntent.setComponent(new ComponentName(ab.getPackageName(), getClassName()));
    localIntent.putExtra("type", 1);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("BUNDLE_IDKEYGROUP", (Parcelable)localObject4);
    localIntent.putExtra("INTENT_IDKEYGROUP", localBundle);
    w.d("MicroMsg.ReportManagerKvCheck", "try sendBroadcast kvdata lenght: %d, idkey data lenght:%d,group lenght:%d", new Object[] { Integer.valueOf(((ArrayList)???).size()), Integer.valueOf(((ArrayList)localObject5).size()), Integer.valueOf(((ArrayList)localObject6).size()) });
    try
    {
      ab.getContext().sendBroadcast(localIntent);
      GMTrace.o(16088276402176L, 119867);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.ReportManagerKvCheck", localException, "sendBroadcastMessageDirectly", new Object[0]);
      GMTrace.o(16088276402176L, 119867);
    }
  }
  
  private static boolean bbS()
  {
    GMTrace.i(18920673116160L, 140970);
    if (oqM <= 0)
    {
      GMTrace.o(18920673116160L, 140970);
      return false;
    }
    if (oqN == null)
    {
      GMTrace.o(18920673116160L, 140970);
      return false;
    }
    try
    {
      int i = oqN.oqB.size();
      int j = oqN.oqC.size();
      int k = oqN.oqA.size();
      int m = oqM;
      if (i + j + k >= m)
      {
        GMTrace.o(18920673116160L, 140970);
        return true;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ReportManagerKvCheck", "checkExceedCacheItemCountLimit e = %s", new Object[] { localException });
      GMTrace.o(18920673116160L, 140970);
    }
    return false;
  }
  
  public static void bbT()
  {
    GMTrace.i(13116964339712L, 97729);
    if ((k.aT(ab.getContext())) || (!ab.bQc()))
    {
      w.w("MicroMsg.ReportManagerKvCheck", "sendOnCrashOrExceptionBroadCast shut_down_weixin, NO MM Process , return.");
      GMTrace.o(13116964339712L, 97729);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver");
    localIntent.setComponent(new ComponentName(ab.getPackageName(), getClassName()));
    localIntent.putExtra("type", 2);
    ab.getContext().sendBroadcast(localIntent);
    GMTrace.o(13116964339712L, 97729);
  }
  
  public static void bbU()
  {
    GMTrace.i(16287992381440L, 121355);
    if (oqJ == null)
    {
      GMTrace.o(16287992381440L, 121355);
      return;
    }
    oqJ.removeMessages(1);
    oqJ.handleMessage(oqJ.obtainMessage(1));
    GMTrace.o(16287992381440L, 121355);
  }
  
  private static String getClassName()
  {
    GMTrace.i(13116427468800L, 97725);
    if (bg.nm(className)) {
      className = ab.getPackageName() + ".plugin.report.service.KVCommCrossProcessReceiver";
    }
    String str = className;
    GMTrace.o(13116427468800L, 97725);
    return str;
  }
  
  public void onReceive(Context paramContext, final Intent paramIntent)
  {
    GMTrace.i(13116159033344L, 97723);
    if (paramIntent == null)
    {
      w.e("MicroMsg.ReportManagerKvCheck", "onReceive intent == null");
      GMTrace.o(13116159033344L, 97723);
      return;
    }
    oqJ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14894543929344L, 110973);
        w.i("MicroMsg.ReportManagerKvCheck", "summeranrt true report runnable run tid:%d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
        KVCommCrossProcessReceiver.a(KVCommCrossProcessReceiver.this, paramIntent);
        GMTrace.o(14894543929344L, 110973);
      }
    });
    GMTrace.o(13116159033344L, 97723);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\service\KVCommCrossProcessReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */