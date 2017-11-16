package com.tencent.mm.modelstat;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.a.a.a;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.text.SimpleDateFormat;
import java.util.Date;
import junit.framework.Assert;

public class WatchDogPushReceiver
  extends BroadcastReceiver
{
  private static String className;
  
  static
  {
    GMTrace.i(1392777363456L, 10377);
    className = "";
    GMTrace.o(1392777363456L, 10377);
  }
  
  public WatchDogPushReceiver()
  {
    GMTrace.i(1391837839360L, 10370);
    GMTrace.o(1391837839360L, 10370);
  }
  
  public static void Mv()
  {
    GMTrace.i(1392374710272L, 10374);
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ab.getPackageName(), getClassName()));
    localIntent.putExtra("type", 3);
    ab.getContext().sendBroadcast(localIntent);
    GMTrace.o(1392374710272L, 10374);
  }
  
  public static void Mw()
  {
    GMTrace.i(1392643145728L, 10376);
    if (!b.bPq())
    {
      GMTrace.o(1392643145728L, 10376);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ab.getPackageName(), getClassName()));
    localIntent.putExtra("type", 7);
    ab.getContext().sendBroadcast(localIntent);
    GMTrace.o(1392643145728L, 10376);
  }
  
  public static void a(g paramg)
  {
    GMTrace.i(1392240492544L, 10373);
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ab.getPackageName(), getClassName()));
    localIntent.putExtra("type", 1);
    localIntent.putExtra("rtType", paramg.rtType);
    localIntent.putExtra("beginTime", paramg.beginTime);
    localIntent.putExtra("endTime", paramg.endTime);
    localIntent.putExtra("rtType", paramg.rtType);
    localIntent.putExtra("dataLen", paramg.gYm);
    localIntent.putExtra("isSend", paramg.eYr);
    localIntent.putExtra("cost", paramg.gYo);
    localIntent.putExtra("doSceneCount", paramg.gYn);
    ab.getContext().sendBroadcast(localIntent);
    GMTrace.o(1392240492544L, 10373);
  }
  
  private static String getClassName()
  {
    GMTrace.i(1392106274816L, 10372);
    if (bg.nm(className)) {
      className = ab.getPackageName() + ".modelstat.WatchDogPushReceiver";
    }
    String str = className;
    GMTrace.o(1392106274816L, 10372);
    return str;
  }
  
  public static void hk(int paramInt)
  {
    GMTrace.i(1392508928000L, 10375);
    if (!b.bPq())
    {
      GMTrace.o(1392508928000L, 10375);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ab.getPackageName(), getClassName()));
    localIntent.putExtra("type", 5);
    localIntent.putExtra("jni", paramInt);
    ab.getContext().sendBroadcast(localIntent);
    GMTrace.o(1392508928000L, 10375);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(1391972057088L, 10371);
    if (paramIntent == null)
    {
      w.e("MicroMsg.WatchDogPushReceiver", "onReceive intent == null");
      GMTrace.o(1391972057088L, 10371);
      return;
    }
    int i = paramIntent.getIntExtra("type", 0);
    w.d("MicroMsg.WatchDogPushReceiver", "onReceive type:" + i);
    if (i == 1)
    {
      paramContext = new a.a();
      paramContext.rtType = paramIntent.getIntExtra("rtType", 0);
      paramContext.beginTime = paramIntent.getLongExtra("beginTime", 0L);
      paramContext.endTime = paramIntent.getLongExtra("endTime", 0L);
      boolean bool = paramIntent.getBooleanExtra("isSend", false);
      if (!bool) {
        paramContext.hih = paramIntent.getLongExtra("dataLen", 0L);
      }
      for (;;)
      {
        paramContext.gYo = paramIntent.getLongExtra("cost", 0L);
        paramContext.hii = paramIntent.getLongExtra("doSceneCount", 0L);
        w.d("MicroMsg.WatchDogPushReceiver", "onRecv: rtType:" + paramContext.rtType + " isSend:" + bool + " tx:" + paramContext.hig + " rx:" + paramContext.hih + " begin:" + paramContext.beginTime + " end:" + paramContext.endTime);
        if ((paramContext.hii != 0L) && (paramContext.rtType != 0L) && (paramContext.beginTime != 0L) && (paramContext.endTime != 0L) && (paramContext.endTime - paramContext.beginTime > 0L)) {
          break;
        }
        w.w("MicroMsg.WatchDogPushReceiver", "onRecv: count:" + paramContext.hii + " rtType:" + paramContext.rtType + " begin:" + paramContext.beginTime + " end:" + paramContext.endTime);
        GMTrace.o(1391972057088L, 10371);
        return;
        paramContext.hig = paramIntent.getLongExtra("dataLen", 0L);
      }
      GMTrace.o(1391972057088L, 10371);
      return;
    }
    if ((i != 2) && (i != 3) && (i != 4))
    {
      if ((i == 5) && (b.bPq()))
      {
        if (paramIntent.getIntExtra("jni", 1) == 1)
        {
          Assert.assertTrue("test errlog push " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), false);
          GMTrace.o(1391972057088L, 10371);
          return;
        }
        MMProtocalJni.setClientPackVersion(-1);
        GMTrace.o(1391972057088L, 10371);
        return;
      }
      if (i == 6) {
        w.bPM();
      }
    }
    GMTrace.o(1391972057088L, 10371);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\WatchDogPushReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */