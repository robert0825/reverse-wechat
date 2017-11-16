package com.tencent.mm.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.iv;
import com.tencent.mm.g.a.x;
import com.tencent.mm.g.a.z;
import com.tencent.mm.k.e;
import com.tencent.mm.pluginsdk.i.p;
import com.tencent.mm.pluginsdk.p.s;
import com.tencent.mm.pluginsdk.p.u;
import com.tencent.mm.pluginsdk.p.x;
import com.tencent.mm.pluginsdk.ui.k;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Map;

public final class t
{
  static ProgressDialog htG;
  private static boolean vMe;
  static SecurityImage vMf;
  
  static
  {
    GMTrace.i(2873198903296L, 21407);
    vMe = false;
    vMf = null;
    htG = null;
    GMTrace.o(2873198903296L, 21407);
  }
  
  public static boolean W(Activity paramActivity)
  {
    int j = 1;
    GMTrace.i(2872662032384L, 21403);
    if (bg.Sy(com.tencent.mm.k.g.ut().getValue("SilentDownloadApkAtWiFi")) != 0)
    {
      GMTrace.o(2872662032384L, 21403);
      return false;
    }
    at.AR();
    int i;
    if ((((Integer)c.xh().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
    {
      i = 1;
      if ((!am.isWifi(paramActivity)) || (i == 0)) {
        break label127;
      }
      i = j;
      label79:
      if ((f.eqX & 0x1) == 0) {
        break label132;
      }
      w.d("MicroMsg.MMErrorProcessor", "channel pack, not silence download.");
      i = 0;
    }
    for (;;)
    {
      if ((i == 0) || (!p.bJQ())) {
        break label142;
      }
      boolean bool = X(paramActivity);
      GMTrace.o(2872662032384L, 21403);
      return bool;
      i = 0;
      break;
      label127:
      i = 0;
      break label79;
      label132:
      w.d("MicroMsg.MMErrorProcessor", "not channel pack.");
    }
    label142:
    GMTrace.o(2872662032384L, 21403);
    return false;
  }
  
  private static boolean X(Activity paramActivity)
  {
    GMTrace.i(2873064685568L, 21406);
    com.tencent.mm.pluginsdk.model.app.a locala = com.tencent.mm.pluginsdk.model.app.a.bJo();
    if (locala != null)
    {
      locala.bJr();
      w.i("MicroMsg.MMErrorProcessor", "alpha download in silence.");
      GMTrace.o(2873064685568L, 21406);
      return true;
    }
    if (p.x.bIV() != null)
    {
      p.x.bIV().db(paramActivity).update(2);
      GMTrace.o(2873064685568L, 21406);
      return true;
    }
    GMTrace.o(2873064685568L, 21406);
    return false;
  }
  
  public static i a(final Activity paramActivity, String paramString1, String paramString2, final Intent paramIntent)
  {
    GMTrace.i(2872527814656L, 21402);
    iv localiv = new iv();
    localiv.eMv.status = 0;
    localiv.eMv.eMw = 1;
    com.tencent.mm.sdk.b.a.vgX.m(localiv);
    paramActivity = h.a(paramActivity, paramString1, paramActivity.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(2899908231168L, 21606);
        com.tencent.mm.plugin.report.service.g.ork.a(322L, 23L, 1L, true);
        com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4023), String.format("%b|%s", new Object[] { Boolean.valueOf(bg.nm(this.val$url)), this.val$url }) });
        at.hold();
        if (bg.nm(this.val$url))
        {
          paramActivity.startActivity(paramIntent);
          b.B(paramActivity, paramIntent);
        }
        for (;;)
        {
          com.tencent.mm.modelsimple.d.bl(paramActivity);
          GMTrace.o(2899908231168L, 21606);
          return;
          paramAnonymousDialogInterface = new Intent();
          paramAnonymousDialogInterface.putExtra("rawUrl", this.val$url);
          paramAnonymousDialogInterface.putExtra("showShare", false);
          paramAnonymousDialogInterface.putExtra("show_bottom", false);
          paramAnonymousDialogInterface.putExtra("needRedirect", false);
          paramAnonymousDialogInterface.putExtra("neverGetA8Key", true);
          paramAnonymousDialogInterface.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
          paramAnonymousDialogInterface.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
          com.tencent.mm.bj.d.b(paramActivity, "webview", ".ui.tools.WebViewUI", paramAnonymousDialogInterface);
        }
      }
    }, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2897492312064L, 21588);
        com.tencent.mm.plugin.report.service.g.ork.a(322L, 24L, 1L, true);
        com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(4024), String.format("%b|%s", new Object[] { Boolean.valueOf(bg.nm(this.val$url)), this.val$url }) });
        paramActivity.startActivity(paramIntent);
        b.B(paramActivity, paramIntent);
        com.tencent.mm.modelsimple.d.bl(paramActivity);
        GMTrace.o(2897492312064L, 21588);
      }
    });
    GMTrace.o(2872527814656L, 21402);
    return paramActivity;
  }
  
  public static boolean a(final Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent, final String paramString)
  {
    GMTrace.i(2872393596928L, 21401);
    if (paramInt1 != 4)
    {
      GMTrace.o(2872393596928L, 21401);
      return false;
    }
    w.d("MicroMsg.MMErrorProcessor", "errType = " + paramInt1 + " errCode = " + paramInt2);
    switch (paramInt2)
    {
    }
    for (;;)
    {
      GMTrace.o(2872393596928L, 21401);
      return false;
      w.e("MicroMsg.MMErrorProcessor", "account expired=" + paramInt2);
      h.a(paramActivity, R.l.dHZ, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1882537852928L, 14026);
          if (this.vMg != null)
          {
            paramActivity.finish();
            paramActivity.startActivity(this.vMg);
            b.B(paramActivity, this.vMg);
            com.tencent.mm.modelsimple.d.bl(paramActivity);
          }
          GMTrace.o(1882537852928L, 14026);
        }
      });
      GMTrace.o(2872393596928L, 21401);
      return true;
      String str = at.wy();
      w.e("MicroMsg.MMErrorProcessor", "account expired=" + paramInt2 + " lastKickReason=" + str);
      paramString = new x();
      com.tencent.mm.sdk.b.a.vgX.m(paramString);
      paramString = new iv();
      paramString.eMv.status = 0;
      paramString.eMv.eMw = 1;
      com.tencent.mm.sdk.b.a.vgX.m(paramString);
      if (vMe)
      {
        if (bg.nm(str)) {}
        for (paramActivity = "";; paramActivity = str)
        {
          w.i("MicroMsg.MMErrorProcessor", "already show kickout dialog before, ignore. lastKickReason[%s]", new Object[] { paramActivity });
          GMTrace.o(2872393596928L, 21401);
          return true;
        }
      }
      if (!bg.nm(str))
      {
        paramString = com.tencent.mm.h.a.dH(str);
        if (paramString != null)
        {
          w.i("MicroMsg.MMErrorProcessor", "account expired br showType[%d]", new Object[] { Integer.valueOf(paramString.showType) });
          if (((paramString.showType == 3) || (paramString.showType == 4)) && (paramString.a(paramActivity, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(1704162492416L, 12697);
              if (this.vMg != null)
              {
                if (!(paramActivity instanceof LauncherUI)) {
                  paramActivity.finish();
                }
                at.hold();
                if (bg.nm(paramString.url)) {
                  break label212;
                }
                paramAnonymousDialogInterface = new Intent();
                StringBuilder localStringBuilder = new StringBuilder(paramString.url);
                localStringBuilder.append("&wechat_real_lang=" + v.bPK());
                paramAnonymousDialogInterface.putExtra("rawUrl", localStringBuilder.toString());
                paramAnonymousDialogInterface.putExtra("showShare", false);
                paramAnonymousDialogInterface.putExtra("show_bottom", false);
                paramAnonymousDialogInterface.putExtra("needRedirect", false);
                paramAnonymousDialogInterface.putExtra("neverGetA8Key", true);
                paramAnonymousDialogInterface.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
                paramAnonymousDialogInterface.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
                com.tencent.mm.bj.d.b(paramActivity, "webview", ".ui.tools.WebViewUI", paramAnonymousDialogInterface);
              }
              for (;;)
              {
                com.tencent.mm.modelsimple.d.bl(paramActivity);
                paramAnonymousDialogInterface = new z();
                paramAnonymousDialogInterface.eAW.eAX = true;
                com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousDialogInterface);
                GMTrace.o(1704162492416L, 12697);
                return;
                label212:
                paramActivity.startActivity(this.vMg);
                b.B(paramActivity, this.vMg);
              }
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(3089289445376L, 23017);
              if (this.vMg != null)
              {
                if (!(paramActivity instanceof LauncherUI)) {
                  paramActivity.finish();
                }
                paramActivity.startActivity(this.vMg);
                b.B(paramActivity, this.vMg);
                com.tencent.mm.modelsimple.d.bl(paramActivity);
              }
              GMTrace.o(3089289445376L, 23017);
            }
          })))
          {
            vMe = true;
            w.i("MicroMsg.MMErrorProcessor", "show kickout dialog by new logic.");
            GMTrace.o(2872393596928L, 21401);
            return true;
          }
        }
      }
      paramString = str;
      Map localMap;
      if (!bg.nm(str))
      {
        paramString = str;
        if (str.startsWith("<"))
        {
          localMap = bh.q(str, "e");
          paramString = str;
          if (localMap != null)
          {
            paramString = str;
            if (!bg.nm((String)localMap.get(".e.Content")))
            {
              paramString = (String)localMap.get(".e.Content");
              w.i("MicroMsg.MMErrorProcessor", "account expired summerauthkick errmsg=" + paramString + " |v=" + localMap);
            }
          }
        }
      }
      w.i("MicroMsg.MMErrorProcessor", "account expired lastKickReason[%s]", new Object[] { paramString });
      str = paramString;
      if (bg.nm(paramString)) {
        str = com.tencent.mm.br.a.X(paramActivity, R.l.dHY);
      }
      h.a(paramActivity, str, paramActivity.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnCancelListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2533762269184L, 18878);
          if (this.vMg != null)
          {
            if (!(paramActivity instanceof LauncherUI)) {
              paramActivity.finish();
            }
            at.hold();
            paramActivity.startActivity(this.vMg);
            b.B(paramActivity, this.vMg);
            com.tencent.mm.modelsimple.d.bl(paramActivity);
            paramAnonymousDialogInterface = new z();
            paramAnonymousDialogInterface.eAW.eAX = true;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousDialogInterface);
          }
          GMTrace.o(2533762269184L, 18878);
        }
      }, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2786225815552L, 20759);
          if (this.vMg != null)
          {
            if (!(paramActivity instanceof LauncherUI)) {
              paramActivity.finish();
            }
            paramActivity.startActivity(this.vMg);
            b.B(paramActivity, this.vMg);
            com.tencent.mm.modelsimple.d.bl(paramActivity);
          }
          GMTrace.o(2786225815552L, 20759);
        }
      });
      vMe = true;
      w.i("MicroMsg.MMErrorProcessor", "show kickout dialog by old logic.");
      GMTrace.o(2872393596928L, 21401);
      return true;
      w.e("MicroMsg.MMErrorProcessor", "account expired=" + paramInt2);
      h.a(paramActivity, R.l.cRF, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(3466843914240L, 25830);
          if (this.vMg != null)
          {
            paramActivity.finish();
            paramActivity.startActivity(this.vMg);
            b.B(paramActivity, this.vMg);
            com.tencent.mm.modelsimple.d.bl(paramActivity);
          }
          GMTrace.o(3466843914240L, 25830);
        }
      });
      GMTrace.o(2872393596928L, 21401);
      return true;
      w.e("MicroMsg.MMErrorProcessor", "accout errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt2), paramString });
      if ((!bg.nm(paramString)) && (paramString.startsWith("autoauth_errmsg_"))) {
        str = paramString.substring(16);
      }
      do
      {
        paramString = str;
        if (!bg.nm(str))
        {
          paramString = str;
          if (str.startsWith("<"))
          {
            localMap = bh.q(str, "e");
            paramString = str;
            if (localMap != null)
            {
              paramString = str;
              if (!bg.nm((String)localMap.get(".e.Content"))) {
                paramString = (String)localMap.get(".e.Content");
              }
            }
          }
        }
        str = paramString;
        if (bg.nm(paramString)) {
          str = com.tencent.mm.sdk.platformtools.ab.getContext().getString(R.l.dHZ);
        }
        h.a(paramActivity, str, com.tencent.mm.sdk.platformtools.ab.getContext().getString(R.l.cUG), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(3056808755200L, 22775);
            if (this.vMg != null)
            {
              paramActivity.finish();
              paramActivity.startActivity(this.vMg);
              b.B(paramActivity, this.vMg);
              com.tencent.mm.modelsimple.d.bl(paramActivity);
            }
            GMTrace.o(3056808755200L, 22775);
          }
        });
        GMTrace.o(2872393596928L, 21401);
        return true;
        str = paramString;
      } while (paramInt2 != -104);
      w.i("MicroMsg.MMErrorProcessor", "MM_ERR_LOGIC but not autoauth showMsg[%s] break", new Object[] { paramString });
    }
  }
  
  public static boolean c(final Activity paramActivity, int paramInt1, int paramInt2)
  {
    GMTrace.i(2872930467840L, 21405);
    w.w("MicroMsg.MMErrorProcessor", "updateRequired [%d,%d] current version:%d  channel:%d updateMode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(com.tencent.mm.protocal.d.tJC), Integer.valueOf(f.eqV), Integer.valueOf(f.eqX) });
    if (paramInt1 != 4)
    {
      GMTrace.o(2872930467840L, 21405);
      return false;
    }
    switch (paramInt2)
    {
    default: 
      GMTrace.o(2872930467840L, 21405);
      return false;
    case -16: 
      if (p.x.bIV() != null)
      {
        paramActivity = p.x.bIV().b(paramActivity, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(1701746573312L, 12679);
            com.tencent.mm.plugin.report.service.g.ork.a(405L, 37L, 1L, true);
            this.hjp.finish();
            MMAppMgr.a(this.hjp, true);
            GMTrace.o(1701746573312L, 12679);
          }
        });
        com.tencent.mm.plugin.report.service.g.ork.a(405L, 36L, 1L, true);
        paramActivity.update(1);
        GMTrace.o(2872930467840L, 21405);
        return true;
      }
      GMTrace.o(2872930467840L, 21405);
      return false;
    }
    long l = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences("system_config_prefs", 0).getLong("recomended_update_ignore", -1L);
    w.i("MicroMsg.MMErrorProcessor", "updateRequired last:%d  now:%d", new Object[] { Long.valueOf(l), Long.valueOf(bg.aG(l)) });
    if ((l != -1L) && (bg.aG(l) < 86400L))
    {
      GMTrace.o(2872930467840L, 21405);
      return true;
    }
    if ((f.eqX & 0x2) != 0)
    {
      w.d("MicroMsg.MMErrorProcessor", "channel pack, not silence download.");
      GMTrace.o(2872930467840L, 21405);
      return true;
    }
    w.d("MicroMsg.MMErrorProcessor", "not channel pack.");
    String str = com.tencent.mm.k.g.ut().getValue("SilentDownloadApkAtWiFi");
    at.AR();
    if ((((Integer)c.xh().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
    {
      paramInt1 = 1;
      if ((paramInt1 == 0) || ((!bg.nm(str)) && (bg.Sy(str) != 0))) {
        break label476;
      }
      bool = true;
      label355:
      if ((f.eqX & 0x1) == 0) {
        break label482;
      }
      w.d("MicroMsg.MMErrorProcessor", "channel pack, not silence download.");
      bool = false;
    }
    for (;;)
    {
      if (bg.Sy(str) != 0) {
        w.d("MicroMsg.MMErrorProcessor", "dynaCfg close silence wifi download.");
      }
      w.d("MicroMsg.MMErrorProcessor", "summerupdate updateRequired silenceDownload[%b]", new Object[] { Boolean.valueOf(bool) });
      if (bool) {
        break label503;
      }
      if (p.x.bIV() == null) {
        break label492;
      }
      paramActivity = p.x.bIV().b(paramActivity, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(3149955858432L, 23469);
          com.tencent.mm.plugin.report.service.g.ork.a(405L, 39L, 1L, true);
          if (this.vMg != null)
          {
            paramActivity.finish();
            paramActivity.startActivity(this.vMg);
            b.B(paramActivity, this.vMg);
          }
          GMTrace.o(3149955858432L, 23469);
        }
      });
      com.tencent.mm.plugin.report.service.g.ork.a(405L, 38L, 1L, true);
      paramActivity.update(2);
      GMTrace.o(2872930467840L, 21405);
      return true;
      paramInt1 = 0;
      break;
      label476:
      bool = false;
      break label355;
      label482:
      w.d("MicroMsg.MMErrorProcessor", "not channel pack.");
    }
    label492:
    GMTrace.o(2872930467840L, 21405);
    return false;
    label503:
    com.tencent.mm.plugin.report.service.g.ork.a(405L, 40L, 1L, true);
    boolean bool = X(paramActivity);
    GMTrace.o(2872930467840L, 21405);
    return bool;
  }
  
  public static boolean fa(final Context paramContext)
  {
    GMTrace.i(2872796250112L, 21404);
    final String str = p.bJN();
    int i = p.bJO();
    w.i("MicroMsg.MMErrorProcessor", "installRequired %s, updateType: %d", new Object[] { str, Integer.valueOf(i) });
    if ((!bg.nm(str)) && (!p.bJP()))
    {
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2832530931712L, 21104);
          if ((this.vMh == 4) && (com.tencent.mm.pluginsdk.model.app.a.bJo() == null))
          {
            w.w("MicroMsg.MMErrorProcessor", "alphaUpdateInfo expired");
            GMTrace.o(2832530931712L, 21104);
            return;
          }
          if ((p.x.bIV() != null) && (p.x.bIV().FM(str) != null)) {
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(1906160173056L, 14202);
                if (p.x.bIV() != null) {
                  p.x.bIV().dc(t.3.this.val$context);
                }
                GMTrace.o(1906160173056L, 14202);
              }
            });
          }
          GMTrace.o(2832530931712L, 21104);
        }
      });
      GMTrace.o(2872796250112L, 21404);
      return true;
    }
    GMTrace.o(2872796250112L, 21404);
    return false;
  }
  
  public static final class a
  {
    public static boolean a(final Context paramContext, int paramInt1, int paramInt2, String paramString, int paramInt3)
    {
      GMTrace.i(2070711107584L, 15428);
      switch (paramInt1)
      {
      }
      label180:
      Object localObject;
      label373:
      do
      {
        do
        {
          GMTrace.o(2070711107584L, 15428);
          return false;
          if (((paramInt3 & 0x2) != 0) && (at.wS().DO()))
          {
            at.wS().getNetworkServerIp();
            new StringBuilder().append(paramInt2);
          }
          for (;;)
          {
            GMTrace.o(2070711107584L, 15428);
            return true;
            if (((paramInt3 & 0x1) == 0) || (!com.tencent.mm.network.ab.bv(paramContext)) || (!k.dU(paramContext)))
            {
              if (((paramInt3 & 0x4) != 0) && (am.isWap(paramContext)))
              {
                if (at.AU()) {
                  break label180;
                }
                paramInt1 = 0;
              }
              for (;;)
              {
                if (paramInt1 != 0) {
                  break label373;
                }
                Toast.makeText(paramContext, paramContext.getString(R.l.dwH, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 1).show();
                break;
                at.AR();
                if (bg.b((Boolean)c.xh().get(61, null)))
                {
                  paramInt1 = 0;
                }
                else if (!ad.RS("show_wap_adviser"))
                {
                  paramInt1 = 0;
                }
                else
                {
                  paramString = View.inflate(paramContext, R.i.cDc, null);
                  ((TextView)paramString.findViewById(R.h.bPY)).setText(R.l.dLr);
                  localObject = (CheckBox)paramString.findViewById(R.h.bPX);
                  ((CheckBox)localObject).setText(paramContext.getString(R.l.dOD));
                  ((CheckBox)localObject).setOnCheckedChangeListener(new MMAppMgr.12());
                  ((CheckBox)localObject).setVisibility(0);
                  localObject = new i.a(paramContext);
                  ((i.a)localObject).BN(R.l.cUG);
                  ((i.a)localObject).dg(paramString);
                  ((i.a)localObject).BQ(R.l.dOF).a(new MMAppMgr.13(paramContext));
                  ((i.a)localObject).lz(false);
                  ((i.a)localObject).BR(R.l.dOE);
                  ((i.a)localObject).a(new MMAppMgr.14());
                  ((i.a)localObject).aax().show();
                  paramInt1 = 1;
                }
              }
            }
          }
          Toast.makeText(paramContext, paramContext.getString(R.l.dwI, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2) }), 1).show();
          GMTrace.o(2070711107584L, 15428);
          return true;
          GMTrace.o(2070711107584L, 15428);
          return true;
          localObject = com.tencent.mm.h.a.dH(paramString);
        } while (localObject == null);
        w.i("MicroMsg.MMErrorProcessor", "summertips errCode[%d], showType[%d], url[%s], desc[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(((com.tencent.mm.h.a)localObject).showType), ((com.tencent.mm.h.a)localObject).url, ((com.tencent.mm.h.a)localObject).desc });
        paramString = null;
        if (!bg.nm(((com.tencent.mm.h.a)localObject).url)) {
          paramString = new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2905008504832L, 21644);
              paramAnonymousDialogInterface = new Intent();
              StringBuilder localStringBuilder = new StringBuilder(this.hjs.url);
              localStringBuilder.append("&wechat_real_lang=" + v.bPK());
              paramAnonymousDialogInterface.putExtra("rawUrl", localStringBuilder.toString());
              paramAnonymousDialogInterface.putExtra("showShare", false);
              paramAnonymousDialogInterface.putExtra("show_bottom", false);
              paramAnonymousDialogInterface.putExtra("needRedirect", false);
              paramAnonymousDialogInterface.putExtra("neverGetA8Key", true);
              paramAnonymousDialogInterface.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
              paramAnonymousDialogInterface.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
              com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramAnonymousDialogInterface);
              GMTrace.o(2905008504832L, 21644);
            }
          };
        }
      } while (!((com.tencent.mm.h.a)localObject).a(paramContext, paramString, null));
      GMTrace.o(2070711107584L, 15428);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */