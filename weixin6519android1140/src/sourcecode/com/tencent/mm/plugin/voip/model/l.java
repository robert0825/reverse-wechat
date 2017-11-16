package com.tencent.mm.plugin.voip.model;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bk.d.a;
import com.tencent.mm.g.a.si;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.voip.ui.InviteRemindDialog;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class l
{
  private static boolean qIc;
  private static DialogInterface.OnClickListener qId;
  
  static
  {
    GMTrace.i(5287373176832L, 39394);
    qIc = false;
    qId = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5315022028800L, 39600);
        l.buH();
        GMTrace.o(5315022028800L, 39600);
      }
    };
    GMTrace.o(5287373176832L, 39394);
  }
  
  public static long a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3)
  {
    GMTrace.i(5285762564096L, 39382);
    long l = a(paramString1, paramString2, paramInt1, paramInt2, paramString3, false);
    GMTrace.o(5285762564096L, 39382);
    return l;
  }
  
  public static long a(String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(5285896781824L, 39383);
    au localau = new au();
    localau.E(bc.gR(paramString1));
    localau.dC(paramInt1);
    localau.setType(50);
    localau.db(paramString1);
    localau.dh(paramString3);
    localau.setContent(paramString2);
    localau.dB(paramInt2);
    if (paramBoolean) {
      localau.dM(localau.fwu | 0x8);
    }
    at.AR();
    long l = com.tencent.mm.y.c.yM().P(localau);
    if (l < 0L) {
      w.e("MicroMsg.VoipPluginManager", "inset voip  failed!");
    }
    w.d("MicroMsg.VoipPluginManager", "inset voip  msgId " + l);
    GMTrace.o(5285896781824L, 39383);
    return l;
  }
  
  public static void aA(Context paramContext, String paramString)
  {
    GMTrace.i(5286970523648L, 39391);
    qIc = false;
    try
    {
      at.AR();
      au localau = com.tencent.mm.y.c.yM().Cb(paramString);
      if (localau != null)
      {
        long l = localau.field_createTime;
        qIc = com.tencent.mm.plugin.voip.b.d.bvJ();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.VoipPluginManager", localException, "", new Object[0]);
      }
    }
    aB(paramContext, paramString);
    GMTrace.o(5286970523648L, 39391);
  }
  
  private static void aB(Context paramContext, final String paramString)
  {
    GMTrace.i(5287104741376L, 39392);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.VoipPluginManager", "talker is null");
      GMTrace.o(5287104741376L, 39392);
      return;
    }
    int i = at.wS().DN();
    w.d("MicroMsg.VoipPluginManager", "startVoipVideoCall getNowStatus " + i);
    if ((i != 4) && (i != 6))
    {
      com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().qIe.qDX.qFr.mjF), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(4), Integer.valueOf(0) });
      h.a(paramContext, R.l.eiM, R.l.eiQ, qId);
      GMTrace.o(5287104741376L, 39392);
      return;
    }
    if (!qIc)
    {
      Object localObject3;
      d.a locala;
      try
      {
        at.AR();
        Object localObject1 = d.a.Qa((String)com.tencent.mm.y.c.xh().get(77829, null));
        if (localObject1 != null) {
          if ((localObject1 != null) && (((Map)localObject1).size() > 0))
          {
            if (((Map)localObject1).containsKey(paramString))
            {
              localObject3 = (d.a)((Map)localObject1).get(paramString);
              ((d.a)localObject3).hitCount += 1;
              ((Map)localObject1).put(paramString, localObject3);
            }
          }
          else
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(77829, d.a.ag((Map)localObject1));
            localObject1 = ((Map)localObject1).entrySet().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (Map.Entry)((Iterator)localObject1).next();
              locala = (d.a)((Map.Entry)localObject3).getValue();
              w.d("MicroMsg.VoipPluginManager", "val1 " + locala.hitCount + " " + locala.gPZ + "name " + (String)((Map.Entry)localObject3).getKey());
            }
            InviteRemindDialog.j(paramContext, paramString, 1);
          }
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.VoipPluginManager", localException, "", new Object[0]);
      }
      for (;;)
      {
        buH();
        GMTrace.o(5287104741376L, 39392);
        return;
        localObject3 = new d.a();
        ((d.a)localObject3).hitCount += 1;
        localException.put(paramString, localObject3);
        break;
        Object localObject2 = new HashMap();
        localObject3 = new d.a();
        ((d.a)localObject3).hitCount += 1;
        ((Map)localObject2).put(paramString, localObject3);
        at.AR();
        com.tencent.mm.y.c.xh().set(77829, d.a.ag((Map)localObject2));
        localObject2 = ((Map)localObject2).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          locala = (d.a)((Map.Entry)localObject3).getValue();
          w.d("MicroMsg.VoipPluginManager", "val2 " + locala.hitCount + " " + locala.gPZ + "  name " + (String)((Map.Entry)localObject3).getKey());
        }
      }
    }
    if (!am.isWap(paramContext))
    {
      if ((am.isWifi(paramContext)) || (buG()))
      {
        d.btG().aC(paramContext, paramString);
        GMTrace.o(5287104741376L, 39392);
        return;
      }
      h.a(paramContext, R.l.eiP, R.l.eiQ, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5299855425536L, 39487);
          l.buF();
          d.btG().aC(this.val$context, paramString);
          GMTrace.o(5299855425536L, 39487);
        }
      }, qId);
      GMTrace.o(5287104741376L, 39392);
      return;
    }
    h.a(paramContext, R.l.ejc, 0, R.l.ejd, R.l.cSk, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5300392296448L, 39491);
        l.dj(this.val$context);
        GMTrace.o(5300392296448L, 39491);
      }
    }, qId);
    GMTrace.o(5287104741376L, 39392);
  }
  
  public static void ay(Context paramContext, final String paramString)
  {
    GMTrace.i(5286299435008L, 39386);
    paramContext.getResources().getString(R.l.ehq);
    qIc = false;
    try
    {
      at.AR();
      au localau = com.tencent.mm.y.c.yM().Cb(paramString);
      if (localau != null)
      {
        long l = localau.field_createTime;
        qIc = com.tencent.mm.plugin.voip.b.d.bvJ();
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.VoipPluginManager", localException1, "", new Object[0]);
      }
      int i = at.wS().DN();
      w.d("MicroMsg.VoipPluginManager", "startVoipVideoCall getNowStatus " + i);
      if ((i == 4) || (i == 6)) {
        break label235;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(11518, true, true, new Object[] { Integer.valueOf(d.btG().qIe.qDX.qFr.mjF), Long.valueOf(d.btG().buL()), Long.valueOf(d.btG().buM()), Integer.valueOf(4), Integer.valueOf(0) });
      h.a(paramContext, R.l.eiM, R.l.eiQ, qId);
      GMTrace.o(5286299435008L, 39386);
      return;
      if (qIc) {
        break label696;
      }
      Object localObject3;
      d.a locala;
      try
      {
        at.AR();
        Object localObject1 = d.a.Qa((String)com.tencent.mm.y.c.xh().get(77829, null));
        if (localObject1 != null) {
          if ((localObject1 != null) && (((Map)localObject1).size() > 0))
          {
            if (((Map)localObject1).containsKey(paramString))
            {
              localObject3 = (d.a)((Map)localObject1).get(paramString);
              ((d.a)localObject3).hitCount += 1;
              ((Map)localObject1).put(paramString, localObject3);
            }
          }
          else
          {
            at.AR();
            com.tencent.mm.y.c.xh().set(77829, d.a.ag((Map)localObject1));
            localObject1 = ((Map)localObject1).entrySet().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = (Map.Entry)((Iterator)localObject1).next();
              locala = (d.a)((Map.Entry)localObject3).getValue();
              w.d("MicroMsg.VoipPluginManager", "val1 " + locala.hitCount + " " + locala.gPZ + "name " + (String)((Map.Entry)localObject3).getKey());
            }
            InviteRemindDialog.j(paramContext, paramString, 0);
          }
        }
      }
      catch (Exception localException2)
      {
        w.printErrStackTrace("MicroMsg.VoipPluginManager", localException2, "", new Object[0]);
      }
      for (;;)
      {
        buH();
        GMTrace.o(5286299435008L, 39386);
        return;
        localObject3 = new d.a();
        ((d.a)localObject3).hitCount += 1;
        localException2.put(paramString, localObject3);
        break;
        Object localObject2 = new HashMap();
        localObject3 = new d.a();
        ((d.a)localObject3).hitCount += 1;
        ((Map)localObject2).put(paramString, localObject3);
        at.AR();
        com.tencent.mm.y.c.xh().set(77829, d.a.ag((Map)localObject2));
        localObject2 = ((Map)localObject2).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject2).next();
          locala = (d.a)((Map.Entry)localObject3).getValue();
          w.d("MicroMsg.VoipPluginManager", "val2 " + locala.hitCount + " " + locala.gPZ + "  name " + (String)((Map.Entry)localObject3).getKey());
        }
      }
      if (am.isWap(paramContext)) {
        break label767;
      }
      if ((!am.isWifi(paramContext)) && (!buG())) {
        break label734;
      }
      d.btG().aD(paramContext, paramString);
      GMTrace.o(5286299435008L, 39386);
      return;
      h.a(paramContext, R.l.eiP, R.l.eiQ, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5300929167360L, 39495);
          l.buF();
          d.btG().aD(this.val$context, paramString);
          GMTrace.o(5300929167360L, 39495);
        }
      }, qId);
      GMTrace.o(5286299435008L, 39386);
      return;
      h.a(paramContext, R.l.ejc, 0, R.l.ejd, R.l.cSk, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5277709500416L, 39322);
          l.dj(this.val$context);
          l.buH();
          GMTrace.o(5277709500416L, 39322);
        }
      }, qId);
      GMTrace.o(5286299435008L, 39386);
    }
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.VoipPluginManager", "talker is null");
      GMTrace.o(5286299435008L, 39386);
      return;
    }
    label235:
    label696:
    label734:
    label767:
    return;
  }
  
  public static void az(Context paramContext, String paramString)
  {
    GMTrace.i(5286836305920L, 39390);
    com.tencent.mm.k.g.uu();
    if (com.tencent.mm.k.c.ue() == 2) {}
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.bj.d.bNA();
      if (i == 0) {
        w.i("MicroMsg.VoipPluginManager", "showDouble %b, isLiteVersion: %b", new Object[] { Boolean.valueOf(false), Boolean.valueOf(false) });
      }
      qIc = false;
      try
      {
        at.AR();
        au localau = com.tencent.mm.y.c.yM().Cb(paramString);
        if (localau != null)
        {
          long l = localau.field_createTime;
          qIc = com.tencent.mm.plugin.voip.b.d.bvJ();
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.VoipPluginManager", localException, "", new Object[0]);
        }
      }
      aB(paramContext, paramString);
      GMTrace.o(5286836305920L, 39390);
      return;
    }
  }
  
  public static void buF()
  {
    GMTrace.i(5286030999552L, 39384);
    at.AR();
    com.tencent.mm.y.c.xh().set(20480, Long.valueOf(System.currentTimeMillis()));
    GMTrace.o(5286030999552L, 39384);
  }
  
  public static boolean buG()
  {
    GMTrace.i(5286165217280L, 39385);
    try
    {
      long l1 = System.currentTimeMillis();
      at.AR();
      long l2 = ((Long)com.tencent.mm.y.c.xh().get(20480, Integer.valueOf(-1))).longValue();
      if (l2 < 0L)
      {
        GMTrace.o(5286165217280L, 39385);
        return false;
      }
      l1 -= l2;
      w.d("MicroMsg.VoipPluginManager", "diff is" + l1);
      if (l1 < 21600000L)
      {
        GMTrace.o(5286165217280L, 39385);
        return true;
      }
    }
    catch (Exception localException)
    {
      GMTrace.o(5286165217280L, 39385);
    }
    return false;
  }
  
  public static void buH()
  {
    GMTrace.i(5286433652736L, 39387);
    si localsi = new si();
    localsi.eXf.eHJ = 8;
    a.vgX.m(localsi);
    GMTrace.o(5286433652736L, 39387);
  }
  
  public static void dj(Context paramContext)
  {
    GMTrace.i(5286567870464L, 39388);
    try
    {
      Intent localIntent = new Intent("/");
      localIntent.setComponent(new ComponentName("com.android.settings", "com.android.settings.ApnSettings"));
      localIntent.setAction("android.intent.action.VIEW");
      paramContext.startActivity(localIntent);
      GMTrace.o(5286567870464L, 39388);
      return;
    }
    catch (Exception localException)
    {
      searchIntentByClass(paramContext, "ApnSettings");
      GMTrace.o(5286567870464L, 39388);
    }
  }
  
  private static Intent searchIntentByClass(Context paramContext, String paramString)
  {
    GMTrace.i(5286702088192L, 39389);
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      List localList = localPackageManager.getInstalledPackages(0);
      if ((localList != null) && (localList.size() > 0))
      {
        w.e("MicroMsg.VoipPluginManager", "package  size" + localList.size());
        int i = 0;
        for (;;)
        {
          int j = localList.size();
          if (i >= j) {
            break;
          }
          try
          {
            w.e("MicroMsg.VoipPluginManager", "package " + ((PackageInfo)localList.get(i)).packageName);
            Object localObject1 = new Intent();
            ((Intent)localObject1).setPackage(((PackageInfo)localList.get(i)).packageName);
            Object localObject2 = localPackageManager.queryIntentActivities((Intent)localObject1, 0);
            if (localObject2 != null) {
              j = ((List)localObject2).size();
            }
            for (;;)
            {
              if (j > 0) {
                try
                {
                  w.e("MicroMsg.VoipPluginManager", "activityName count " + j);
                  int k = 0;
                  for (;;)
                  {
                    if (k >= j) {
                      break label323;
                    }
                    localObject1 = ((ResolveInfo)((List)localObject2).get(k)).activityInfo;
                    if (((ActivityInfo)localObject1).name.contains(paramString))
                    {
                      localObject2 = new Intent("/");
                      ((Intent)localObject2).setComponent(new ComponentName(((ActivityInfo)localObject1).packageName, ((ActivityInfo)localObject1).name));
                      ((Intent)localObject2).setAction("android.intent.action.VIEW");
                      paramContext.startActivity((Intent)localObject2);
                      GMTrace.o(5286702088192L, 39389);
                      return (Intent)localObject2;
                      j = 0;
                      break;
                    }
                    k += 1;
                  }
                  i += 1;
                }
                catch (Exception localException1)
                {
                  w.printErrStackTrace("MicroMsg.VoipPluginManager", localException1, "", new Object[0]);
                }
              }
            }
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              label323:
              w.printErrStackTrace("MicroMsg.VoipPluginManager", localException2, "", new Object[0]);
            }
          }
        }
      }
      return null;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.VoipPluginManager", paramContext, "", new Object[0]);
      GMTrace.o(5286702088192L, 39389);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */