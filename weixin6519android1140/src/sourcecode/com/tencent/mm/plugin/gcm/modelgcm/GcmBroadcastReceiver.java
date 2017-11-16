package com.tencent.mm.plugin.gcm.modelgcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.kernel.k;
import com.tencent.mm.network.aa;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GcmBroadcastReceiver
  extends BroadcastReceiver
{
  static List<Pair<Long, Long>> meM;
  private static WakerLock wakerlock;
  
  static
  {
    GMTrace.i(8012261490688L, 59696);
    wakerlock = null;
    meM = new LinkedList();
    GMTrace.o(8012261490688L, 59696);
  }
  
  public GcmBroadcastReceiver()
  {
    GMTrace.i(8011858837504L, 59693);
    GMTrace.o(8011858837504L, 59693);
  }
  
  public static void aGU()
  {
    GMTrace.i(8011993055232L, 59694);
    meM.clear();
    GMTrace.o(8011993055232L, 59694);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(8012127272960L, 59695);
    w.i("GcmBroadcastReceiver", "GcmBroadcastReceiver onReceive in.");
    String str1;
    String str2;
    if (paramIntent.getAction().equals("com.google.android.c2dm.intent.REGISTRATION"))
    {
      localObject1 = a.aGV();
      str1 = ((a)localObject1).aGX();
      str2 = paramIntent.getStringExtra("registration_id");
      w.i("GcmBroadcastReceiver", "REGISTRATION intent received:" + paramIntent.toString());
      if ((paramIntent.getStringExtra("error") == null) && (paramIntent.getStringExtra("unregistered") == null) && (str2 != null) && (str1.compareTo(str2) != 0))
      {
        if (aa.OW() != null) {
          break label155;
        }
        w.w("GcmBroadcastReceiver", "gcm reg id recv, but mmpushcore not init, id = " + str2);
      }
      for (;;)
      {
        d.oqe.a(452L, 25L, 1L, false);
        GMTrace.o(8012127272960L, 59695);
        return;
        label155:
        ((a)localObject1).ad(paramContext, str2);
        aa.OW().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8017361764352L, 59734);
            this.meN.aGZ();
            GMTrace.o(8017361764352L, 59734);
          }
        });
      }
    }
    Object localObject1 = a.aGV();
    if ((localObject1 == null) || (bg.nm(((a)localObject1).aGX())))
    {
      boolean bool1;
      boolean bool2;
      if (localObject1 == null)
      {
        bool1 = true;
        if (localObject1 != null) {
          break label307;
        }
        bool2 = false;
        label219:
        w.i("GcmBroadcastReceiver", "Gcm push is not reg to server. reg == null[%b], isRegToSvr[%b]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        g.ork.A(11250, "1,2");
        paramContext = d.oqe;
        if (localObject1 != null) {
          break label317;
        }
      }
      label307:
      label317:
      for (l1 = 26L;; l1 = 27L)
      {
        paramContext.a(452L, l1, 1L, false);
        GMTrace.o(8012127272960L, 59695);
        return;
        bool1 = false;
        break;
        bool2 = ((a)localObject1).aHb();
        break label219;
      }
    }
    Object localObject2;
    String str3;
    String str4;
    int j;
    String str5;
    String str6;
    for (;;)
    {
      try
      {
        if (k.aS(paramContext))
        {
          w.i("GcmBroadcastReceiver", "Logout or exit MM. no need show Notification.");
          g.ork.A(11250, "1,2");
          d.oqe.a(452L, 28L, 1L, false);
          GMTrace.o(8012127272960L, 59695);
          return;
        }
        localObject2 = paramIntent.getExtras();
        com.google.android.gms.gcm.a.E(paramContext);
        str7 = com.google.android.gms.gcm.a.c(paramIntent);
        if (((Bundle)localObject2).isEmpty())
        {
          w.i("GcmBroadcastReceiver", "Intent extras is empty: ");
          g.ork.A(11250, "1,0");
          d.oqe.a(452L, 29L, 1L, false);
          GMTrace.o(8012127272960L, 59695);
          return;
        }
        paramIntent = ((Bundle)localObject2).getString("seq");
        localObject1 = ((Bundle)localObject2).getString("uin");
        str1 = ((Bundle)localObject2).getString("cmd");
        str8 = ((Bundle)localObject2).getString("username");
        l1 = ((Bundle)localObject2).getLong("time");
        str2 = ((Bundle)localObject2).getString("collapse_key");
        str3 = ((Bundle)localObject2).getString("sound");
        str4 = ((Bundle)localObject2).getString("alert");
        j = ((Bundle)localObject2).getInt("msgType");
        str5 = ((Bundle)localObject2).getString("badge");
        str6 = ((Bundle)localObject2).getString("from");
        ((Bundle)localObject2).getString("ext");
        if (!"send_error".equals(str7)) {
          continue;
        }
        paramContext = bg.SJ(str8);
        if (str4 != null) {
          continue;
        }
        i = -1;
        w.i("GcmBroadcastReceiver", "Send error:. seq[%s] uin[%s] cmd[%s] username[%s] time[%s] collapse_key[%s] sound[%s] alert len[%s], msgType[%s], badge[%s], from[%s]", new Object[] { paramIntent, localObject1, str1, paramContext, Long.valueOf(l1), str2, str3, Integer.valueOf(i), Integer.valueOf(j), str5, str6 });
        g.ork.A(11250, "1,1");
        d.oqe.a(452L, 30L, 1L, false);
      }
      catch (Exception paramContext)
      {
        String str7;
        String str8;
        paramIntent = paramContext.toString();
        w.e("GcmBroadcastReceiver", "GcmBroadcastReceiver error :" + paramIntent);
        w.printErrStackTrace("GcmBroadcastReceiver", paramContext, "", new Object[0]);
        d.oqe.a(452L, 36L, 1L, false);
        continue;
        if (!"gcm".equals(str7)) {
          continue;
        }
        d.oqe.a(452L, 32L, 1L, false);
        localObject2 = bg.SJ(str8);
        if (str4 != null) {
          break label1117;
        }
      }
      w.i("GcmBroadcastReceiver", "GcmBroadcastReceiver onReceive out.");
      GMTrace.o(8012127272960L, 59695);
      return;
      i = str4.length();
      continue;
      if (!"deleted_messages".equals(str7)) {
        continue;
      }
      w.i("GcmBroadcastReceiver", "Deleted messages on server.");
      g.ork.A(11250, "1,1");
      d.oqe.a(452L, 31L, 1L, false);
    }
    int i = -1;
    label888:
    w.i("GcmBroadcastReceiver", "Received gcm msg. seq[%s] uin[%s] cmd[%s] username[%s] time[%s] collapse_key[%s] sound[%s] alert len[%s], msgType[%s], badge[%s], from[%s]", new Object[] { paramIntent, localObject1, str1, localObject2, Long.valueOf(l1), str2, str3, Integer.valueOf(i), Integer.valueOf(j), str5, str6 });
    label979:
    long l2;
    label989:
    long l3;
    if (bg.nm((String)localObject1))
    {
      l1 = 0L;
      if (!bg.nm(paramIntent)) {
        break label1137;
      }
      l2 = 0L;
      if (!bg.nm(str1)) {
        break label1147;
      }
      l3 = 0L;
      label1000:
      i = com.tencent.mm.kernel.a.wM();
      if ((l1 != 0L) && (Integer.toHexString(i).equals(Long.toHexString(l1)))) {
        break label1158;
      }
      w.e("GcmBroadcastReceiver", "Logined user changed. no need show Notification.uin:" + l1 + ", oldUin:" + i);
      g.ork.A(11250, "1,3");
      paramContext = d.oqe;
      if (l1 != 0L) {
        break label1388;
      }
    }
    label1117:
    label1137:
    label1147:
    label1158:
    label1388:
    for (long l1 = 33L;; l1 = 34L)
    {
      paramContext.a(452L, l1, 1L, false);
      GMTrace.o(8012127272960L, 59695);
      return;
      i = str4.length();
      break label888;
      l1 = bg.getLong((String)localObject1, 0L);
      break label979;
      l2 = bg.getLong(paramIntent, 0L);
      break label989;
      l3 = bg.getLong(str1, 0L);
      break label1000;
      paramIntent = meM.iterator();
      do
      {
        if (!paramIntent.hasNext()) {
          break;
        }
        localObject1 = (Pair)paramIntent.next();
      } while ((((Long)((Pair)localObject1).first).longValue() != l3) || (((Long)((Pair)localObject1).second).longValue() != l2));
      for (i = 1;; i = 0)
      {
        if (i != 0)
        {
          w.w("GcmBroadcastReceiver", "already has this seq:" + l2);
          d.oqe.a(452L, 35L, 1L, false);
          GMTrace.o(8012127272960L, 59695);
          return;
        }
        meM.add(Pair.create(Long.valueOf(l3), Long.valueOf(l2)));
        if (meM.size() > 60) {
          meM.remove(0);
        }
        if (wakerlock == null)
        {
          wakerlock = new WakerLock(paramContext);
          w.i("GcmBroadcastReceiver", "start new wakerlock");
        }
        wakerlock.lock(200L, "GcmBroadcastReceiver.onReceive");
        paramContext = new gi();
        paramContext.eJt.type = 13;
        com.tencent.mm.sdk.b.a.vgX.m(paramContext);
        break;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gcm\modelgcm\GcmBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */