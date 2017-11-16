package com.tencent.mm.sandbox.updater;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.av.q;
import com.tencent.mm.c.i.a;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.i.p;
import com.tencent.mm.pluginsdk.p.s;
import com.tencent.mm.protocal.c.adf;
import com.tencent.mm.protocal.c.adg;
import com.tencent.mm.protocal.c.aei;
import com.tencent.mm.protocal.c.aps;
import com.tencent.mm.protocal.c.bjf;
import com.tencent.mm.protocal.c.mp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class Updater
  extends LinearLayout
  implements com.tencent.mm.ad.e, p.s
{
  private boolean eCg;
  private int veV;
  private com.tencent.mm.ui.base.r vgb;
  private boolean vgc;
  private boolean vgd;
  private boolean vge;
  private com.tencent.mm.ad.e vgf;
  private com.tencent.mm.ad.e vgg;
  
  private Updater(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(3582539595776L, 26692);
    this.vgb = null;
    this.vgc = false;
    this.vgd = false;
    this.vge = false;
    GMTrace.o(3582539595776L, 26692);
  }
  
  public Updater(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3582673813504L, 26693);
    this.vgb = null;
    this.vgc = false;
    this.vgd = false;
    this.vge = false;
    GMTrace.o(3582673813504L, 26693);
  }
  
  public static void Af(int paramInt)
  {
    GMTrace.i(3584284426240L, 26705);
    if (!at.AU())
    {
      GMTrace.o(3584284426240L, 26705);
      return;
    }
    w.d("MicroMsg.Updater", "reportUpdateStat : opCode = " + paramInt);
    at.AR();
    com.tencent.mm.y.c.yJ().b(new q(paramInt));
    GMTrace.o(3584284426240L, 26705);
  }
  
  public static void a(Intent paramIntent, e parame)
  {
    GMTrace.i(18998116745216L, 141547);
    paramIntent.putExtra("intent_short_ips", bJX());
    paramIntent.putExtra("intent_client_version", com.tencent.mm.protocal.d.tJC);
    paramIntent.putExtra("intent_update_type", 3);
    int i;
    if ((parame.mhF != null) && (!parame.mhF.isEmpty()) && (parame.mhF.containsKey(Integer.valueOf(4))))
    {
      i = 1;
      if (i == 0) {
        break label359;
      }
      localObject1 = parame.mhF;
      if ((localObject1 != null) && (!((HashMap)localObject1).isEmpty())) {
        break label215;
      }
      localObject1 = "";
    }
    label215:
    Object localObject2;
    LinkedList localLinkedList;
    int j;
    label262:
    do
    {
      do
      {
        do
        {
          paramIntent.putExtra("intent_extra_desc", (String)localObject1);
          paramIntent.putExtra("intent_extra_md5", parame.mhJ);
          paramIntent.putExtra("intent_extra_size", parame.fileSize);
          paramIntent.putExtra("intent_extra_download_url", new String[] { parame.mhI });
          paramIntent.putExtra("intent_extra_patchInfo", parame.bOU());
          paramIntent.putExtra("intent_extra_updateMode", com.tencent.mm.sdk.platformtools.f.eqX);
          paramIntent.putExtra("intent_extra_marketUrl", com.tencent.mm.sdk.platformtools.f.vhr);
          paramIntent.putExtra("intent_extra_extinfo", "<extinfo></extinfo>");
          paramIntent.putExtra("intent_extra_tinker_patch", true);
          paramIntent.putExtra("intent_extra_download_mode", 1);
          GMTrace.o(18998116745216L, 141547);
          return;
          i = 0;
          break;
          localObject2 = "";
          localLinkedList = (LinkedList)((HashMap)localObject1).get(Integer.valueOf(4));
          localObject1 = localObject2;
        } while (localLinkedList == null);
        localObject1 = localObject2;
      } while (localLinkedList.isEmpty());
      j = localLinkedList.size();
      i = 0;
      localObject1 = localObject2;
    } while (i >= j);
    Object localObject1 = (aps)localLinkedList.get(i);
    if (((aps)localObject1).lang.equalsIgnoreCase("default")) {}
    for (localObject1 = new String(Base64.decode(((aps)localObject1).content, 0));; localObject1 = localObject2)
    {
      i += 1;
      localObject2 = localObject1;
      break label262;
      if (((aps)localObject1).lang.equalsIgnoreCase(v.bPK()))
      {
        localObject1 = new String(Base64.decode(((aps)localObject1).content, 0));
        break;
        label359:
        localObject1 = "";
        break;
      }
    }
  }
  
  private static String[] bJX()
  {
    int i = 0;
    GMTrace.i(18998250962944L, 141548);
    if ((com.tencent.mm.platformtools.r.hjS != null) && (com.tencent.mm.platformtools.r.hjS.length() > 0))
    {
      localObject = com.tencent.mm.platformtools.r.hjS;
      GMTrace.o(18998250962944L, 141548);
      return new String[] { localObject };
    }
    Object localObject = ab.getContext().getSharedPreferences("system_config_prefs", 0).getString("builtin_short_ips", "");
    if ((localObject != null) && (((String)localObject).length() > 0)) {}
    String[] arrayOfString;
    for (;;)
    {
      localObject = com.tencent.mm.protocal.n.Qe((String)localObject);
      arrayOfString = new String[((List)localObject).size()];
      while (i < ((List)localObject).size())
      {
        arrayOfString[i] = ((com.tencent.mm.protocal.n)((List)localObject).get(i)).mwD;
        i += 1;
      }
      localObject = "0,112.64.200.240,80|0,180.153.82.27,80|0,117.135.130.177,80";
    }
    GMTrace.o(18998250962944L, 141548);
    return arrayOfString;
  }
  
  public static Updater c(Context paramContext, final DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(3583076466688L, 26696);
    if (paramContext == null)
    {
      GMTrace.o(3583076466688L, 26696);
      return null;
    }
    if (((paramContext instanceof Activity)) && ((((Activity)paramContext).isFinishing()) || (((Activity)paramContext).getWindow() == null)))
    {
      w.e("MicroMsg.Updater", "showWithProgress, context isFinishing");
      GMTrace.o(3583076466688L, 26696);
      return null;
    }
    ab.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bg.Pu()).commit();
    at.getNotification().cancel(34);
    w.i("MicroMsg.Updater", "showWithProgress");
    Updater localUpdater = (Updater)View.inflate(paramContext, R.i.cHj, null);
    localUpdater.onStart();
    paramContext = com.tencent.mm.ui.base.r.a(paramContext, paramContext.getString(R.l.efl), true, 0, null);
    paramContext.setCancelable(true);
    paramContext.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(3573949661184L, 26628);
        at.getNotification().cancel(99);
        g.ork.a(405L, 47L, 1L, true);
        Updater.Af(2);
        this.vgh.onStop();
        if ((!Updater.a(this.vgh)) && (paramOnCancelListener != null)) {
          paramOnCancelListener.onCancel(paramAnonymousDialogInterface);
        }
        GMTrace.o(3573949661184L, 26628);
      }
    });
    try
    {
      localUpdater.vgb = paramContext;
      localUpdater.vgb.show();
      localUpdater.eCg = true;
      g.ork.a(405L, 46L, 1L, true);
      GMTrace.o(3583076466688L, 26696);
      return localUpdater;
    }
    catch (Exception paramContext)
    {
      w.e("MicroMsg.Updater", "exception in showWithProgress, ", new Object[] { paramContext.getMessage() });
      w.printErrStackTrace("MicroMsg.Updater", paramContext, "", new Object[0]);
      GMTrace.o(3583076466688L, 26696);
    }
    return null;
  }
  
  private void cancel()
  {
    GMTrace.i(3583747555328L, 26701);
    at.wS().b(11, this);
    GMTrace.o(3583747555328L, 26701);
  }
  
  public static Updater d(Context paramContext, final DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(3583210684416L, 26697);
    ab.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bg.Pu()).commit();
    at.getNotification().cancel(34);
    w.i("MicroMsg.Updater", "show update dialog");
    Updater localUpdater = (Updater)View.inflate(paramContext, R.i.cHj, null);
    localUpdater.onStart();
    paramContext = com.tencent.mm.ui.base.r.a(paramContext, "", true, 0, null);
    paramContext.setCancelable(true);
    paramContext.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(3565628162048L, 26566);
        at.getNotification().cancel(99);
        g.ork.a(405L, 49L, 1L, true);
        Updater.Af(2);
        this.vgh.onStop();
        if ((!Updater.a(this.vgh)) && (paramOnCancelListener != null)) {
          paramOnCancelListener.onCancel(paramAnonymousDialogInterface);
        }
        GMTrace.o(3565628162048L, 26566);
      }
    });
    g.ork.a(405L, 48L, 1L, true);
    localUpdater.vgb = paramContext;
    localUpdater.eCg = false;
    GMTrace.o(3583210684416L, 26697);
    return localUpdater;
  }
  
  public static void d(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(3584150208512L, 26704);
    Intent localIntent = new Intent(ab.getContext(), UpdaterService.class);
    localIntent.putExtra("intent_client_version", com.tencent.mm.protocal.d.tJC);
    localIntent.putExtra("intent_update_type", 4);
    localIntent.putExtra("intent_extra_desc", paramString2);
    localIntent.putExtra("intent_extra_md5", paramString1);
    localIntent.putExtra("intent_extra_size", paramInt);
    localIntent.putExtra("intent_extra_download_url", new String[] { paramString3 });
    localIntent.putExtra("intent_extra_updateMode", com.tencent.mm.sdk.platformtools.f.eqX);
    localIntent.putExtra("intent_extra_marketUrl", com.tencent.mm.sdk.platformtools.f.vhr);
    localIntent.putExtra("intent_extra_run_in_foreground", true);
    localIntent.putExtra("intent_extra_download_mode", 2);
    g.ork.a(405L, 45L, 1L, true);
    ab.getContext().startService(localIntent);
    GMTrace.o(3584150208512L, 26704);
  }
  
  public static void dc(Context paramContext)
  {
    GMTrace.i(3583479119872L, 26699);
    paramContext.startActivity(new Intent(paramContext, AppInstallerUI.class));
    GMTrace.o(3583479119872L, 26699);
  }
  
  public static Updater ej(Context paramContext)
  {
    GMTrace.i(3583344902144L, 26698);
    ab.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bg.Pu()).commit();
    at.getNotification().cancel(34);
    g.ork.a(405L, 50L, 1L, true);
    w.i("MicroMsg.Updater", "updater silence");
    paramContext = new Updater(paramContext);
    paramContext.onStart();
    paramContext.vgd = true;
    GMTrace.o(3583344902144L, 26698);
    return paramContext;
  }
  
  private void onStart()
  {
    GMTrace.i(3582808031232L, 26694);
    at.wS().a(11, this);
    g.ork.a(405L, 42L, 1L, true);
    GMTrace.o(3582808031232L, 26694);
  }
  
  public final void W(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(3584015990784L, 26703);
    w.i("MicroMsg.Updater", "summerupdate begin update routine, type=" + paramInt);
    this.veV = paramInt;
    this.vge = paramBoolean;
    g.ork.a(405L, 44L, 1L, true);
    com.tencent.mm.sandbox.a.a locala = new com.tencent.mm.sandbox.a.a(paramInt);
    at.wS().a(locala, 0);
    GMTrace.o(3584015990784L, 26703);
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(3583613337600L, 26700);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      g.ork.a(405L, 51L, 1L, true);
      w.i("MicroMsg.Updater", "isShow " + this.eCg);
      if ((!this.eCg) && (this.vgb != null)) {
        this.vgb.show();
      }
      this.vgc = true;
      if (this.vgb != null) {
        this.vgb.cancel();
      }
      paramString = (com.tencent.mm.sandbox.a.a)paramk;
      at.wS().a(new com.tencent.mm.y.bf(new bf.a()
      {
        public final void a(final com.tencent.mm.network.e paramAnonymouse)
        {
          GMTrace.i(3565359726592L, 26564);
          if (paramAnonymouse == null)
          {
            g.ork.a(405L, 52L, 1L, true);
            Assert.assertTrue("updater invalid assert", false);
          }
          at.getNotification().cancel(34);
          w.i("MicroMsg.Updater", "go to update");
          if (!com.tencent.mm.compatible.util.h.getExternalStorageState().equals("mounted"))
          {
            w.e("MicroMsg.Updater", "no sdcard.");
            g.ork.a(405L, 53L, 1L, true);
            Updater.b(Updater.this);
          }
          int i = paramString.bOF();
          com.tencent.mm.c.i locali = com.tencent.mm.c.i.bt(paramString.bOH());
          String str = p.dQ(Updater.this.getContext());
          Object localObject = null;
          if (locali != null) {
            localObject = locali.bs(str);
          }
          if (localObject == null) {}
          for (long l = i;; l = ((i.a)localObject).size + i)
          {
            if (!com.tencent.mm.compatible.util.f.L(l))
            {
              w.e("MicroMsg.Updater", "no enough space.");
              g.ork.a(405L, 54L, 1L, true);
              Updater.b(Updater.this);
            }
            if ((com.tencent.mm.sdk.platformtools.f.eqX & 0x1) != 0)
            {
              w.i("MicroMsg.Updater", "channel pack, not silence download.");
              g.ork.a(405L, 55L, 1L, true);
              Updater.b(Updater.this);
            }
            if ((Updater.c(Updater.this) != 2) || (Updater.d(Updater.this))) {
              break;
            }
            localObject = i.bJN();
            if ((com.tencent.mm.sandbox.monitor.c.FM(paramString.bOG()) == null) || (bg.nm((String)localObject)) || (!((String)localObject).equals(paramString.bOG()))) {
              break;
            }
            w.i("MicroMsg.Updater", "we already have this pack %s being to install, just ignore this update request", new Object[] { localObject });
            g.ork.a(405L, 56L, 1L, true);
            GMTrace.o(3565359726592L, 26564);
            return;
          }
          localObject = paramString.bIU();
          if ((localObject != null) && (((aei)localObject).uud != 0) && (!bg.nm(((aei)localObject).uue)))
          {
            paramAnonymouse = ((aei)localObject).uue;
            localObject = new Intent();
            ((Intent)localObject).putExtra("rawUrl", paramAnonymouse);
            ((Intent)localObject).putExtra("showShare", false);
            ((Intent)localObject).putExtra("show_bottom", false);
            com.tencent.mm.bj.d.b(Updater.this.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject);
            i.bOZ();
            g.ork.a(405L, 57L, 1L, true);
            GMTrace.o(3565359726592L, 26564);
            return;
          }
          if (Updater.e(Updater.this))
          {
            w.i("MicroMsg.Updater", "summerupdate gonna start UpdaterService checkcontrol");
            g.ork.a(405L, 58L, 1L, true);
            at.wS().a(725, Updater.a(Updater.this, new com.tencent.mm.ad.e()
            {
              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, k paramAnonymous2k)
              {
                GMTrace.i(3594887626752L, 26784);
                at.wS().b(221, Updater.f(Updater.this));
                Updater.a(Updater.this, null);
                if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
                {
                  paramAnonymous2String = (s)paramAnonymous2k;
                  String str;
                  if (((adf)paramAnonymous2String.gTY.gtC.gtK).jib == 0)
                  {
                    paramAnonymous2String = ((adg)paramAnonymous2String.gTY.gtD.gtK).nIp;
                    if (!bg.nm(paramAnonymous2String))
                    {
                      paramAnonymous2String = bh.q(paramAnonymous2String, "resourcecontrolinfo");
                      if (paramAnonymous2String != null)
                      {
                        paramAnonymous2k = (String)paramAnonymous2String.get(".resourcecontrolinfo.enableupdate");
                        str = (String)paramAnonymous2String.get(".resourcecontrolinfo.expiredtime");
                        w.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate getDisableUpdateTime values[%s]", new Object[] { paramAnonymous2String });
                        if (bg.getInt(paramAnonymous2k, 1) != 0) {}
                      }
                    }
                  }
                  for (long l1 = bg.getLong(str, 0L);; l1 = 0L)
                  {
                    long l2 = System.currentTimeMillis() / 1000L;
                    if (l1 <= l2) {
                      break;
                    }
                    w.i("MicroMsg.Updater", "summerupdate checkcontrol time[%d] > now[%d] control not auto download and ret", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
                    g.ork.a(405L, 0L, 1L, true);
                    GMTrace.o(3594887626752L, 26784);
                    return;
                  }
                }
                w.i("MicroMsg.Updater", "summerupdate gonna start UpdaterService after checkcontrol");
                g.ork.a(405L, 59L, 1L, true);
                paramAnonymous2String = new Intent(Updater.this.getContext(), UpdaterService.class);
                Updater.a(Updater.this, paramAnonymous2String, paramAnonymouse, Updater.3.this.vgj);
                paramAnonymous2String.putExtra("intent_extra_run_in_foreground", true);
                paramAnonymous2String.putExtra("intent_extra_download_mode", 2);
                Updater.this.getContext().startService(paramAnonymous2String);
                GMTrace.o(3594887626752L, 26784);
              }
            }));
            at.wS().a(new s(), 0);
            com.tencent.mm.s.c.vK().k(262145, true);
            com.tencent.mm.pluginsdk.model.app.a.bJp();
            GMTrace.o(3565359726592L, 26564);
            return;
          }
          w.i("MicroMsg.Updater", "gonna start AppUpdaterUI");
          localObject = new Intent(Updater.this.getContext(), AppUpdaterUI.class);
          Updater.a(Updater.this, (Intent)localObject, paramAnonymouse, paramString);
          w.i("MicroMsg.Updater", "current updateType : %s", new Object[] { Integer.valueOf(Updater.c(Updater.this)) });
          if (Updater.c(Updater.this) == 1)
          {
            ((Intent)localObject).putExtra("intent_extra_download_mode", 0);
            g.ork.a(405L, 60L, 1L, true);
          }
          for (;;)
          {
            Updater.this.getContext().startActivity((Intent)localObject);
            break;
            g.ork.a(405L, 61L, 1L, true);
            ((Intent)localObject).putExtra("intent_extra_download_mode", 1);
          }
        }
      }), 0);
      onStop();
      GMTrace.o(3583613337600L, 26700);
      return;
    }
    g.ork.a(405L, 62L, 1L, true);
    if (this.vgb != null)
    {
      paramString = this.vgb;
      if (paramString.iIN != null) {
        paramString.iIN.setVisibility(8);
      }
      paramString = (TextView)this.vgb.findViewById(R.h.bNv);
      if ((paramInt1 != 4) || (paramInt2 != -18)) {
        break label271;
      }
      paramk = new com.tencent.mm.g.a.bf();
      com.tencent.mm.sdk.b.a.vgX.m(paramk);
      paramk = at.wS();
      paramString = new com.tencent.mm.ad.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(18997579874304L, 141543);
          at.wS().b(922, Updater.g(Updater.this));
          Updater.a(Updater.this, null);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousString = ((mp)((b)paramAnonymousk.gud).gtD.gtK).uds;
            if ((paramAnonymousString != null) && (paramAnonymousString.uUt == 3))
            {
              paramAnonymousk = new Intent(Updater.this.getContext(), AppUpdaterUI.class);
              Updater.a(paramAnonymousk, new e(paramAnonymousString));
              Updater.this.getContext().startActivity(paramAnonymousk);
              if (Updater.h(Updater.this) != null) {
                Updater.h(Updater.this).cancel();
              }
              Updater.this.onStop();
              GMTrace.o(18997579874304L, 141543);
              return;
            }
            if (Updater.h(Updater.this).findViewById(R.h.bNu) != null) {
              Updater.h(Updater.this).findViewById(R.h.bNu).setVisibility(8);
            }
            if (paramString != null)
            {
              g.ork.a(405L, 63L, 1L, true);
              paramString.setText(R.l.efq);
            }
            GMTrace.o(18997579874304L, 141543);
            return;
          }
          if (Updater.h(Updater.this).findViewById(R.h.bNu) != null) {
            Updater.h(Updater.this).findViewById(R.h.bNu).setVisibility(8);
          }
          if (paramString != null)
          {
            g.ork.a(405L, 63L, 1L, true);
            paramString.setText(R.l.efq);
          }
          GMTrace.o(18997579874304L, 141543);
        }
      };
      this.vgg = paramString;
      paramk.a(922, paramString);
    }
    for (;;)
    {
      i.bPd();
      cancel();
      GMTrace.o(3583613337600L, 26700);
      return;
      label271:
      if (paramString != null)
      {
        g.ork.a(405L, 64L, 1L, true);
        paramString.setText(R.l.efg);
        com.tencent.mm.pluginsdk.ui.d.h.e(paramString, 1);
      }
    }
  }
  
  public final void onStop()
  {
    GMTrace.i(3582942248960L, 26695);
    g.ork.a(405L, 43L, 1L, true);
    cancel();
    GMTrace.o(3582942248960L, 26695);
  }
  
  public final void update(int paramInt)
  {
    GMTrace.i(3583881773056L, 26702);
    W(paramInt, false);
    GMTrace.o(3583881773056L, 26702);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\updater\Updater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */