package com.tencent.mm.platformtools;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.modelsimple.u.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.BioHelperUI;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public final class m
{
  public static void a(final Activity paramActivity, final Runnable paramRunnable, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(454729662464L, 3388);
    if ((com.tencent.mm.modelfriend.m.Ho() != m.a.gDm) && (com.tencent.mm.modelfriend.m.Ho() != m.a.gDn)) {
      w.e("MicroMsg.PostLoginUtil", "not successfully binded, skip addrbook confirm");
    }
    for (;;)
    {
      if (paramRunnable != null) {
        paramRunnable.run();
      }
      GMTrace.o(454729662464L, 3388);
      return;
      at.AR();
      if (bg.b((Boolean)c.xh().get(12322, null)))
      {
        w.d("MicroMsg.PostLoginUtil", "addrbook upload confirmed");
      }
      else
      {
        if (!paramBoolean)
        {
          at.AR();
          if (bg.b((Boolean)c.xh().get(12323, null)))
          {
            w.d("MicroMsg.PostLoginUtil", "addrbook upload login confirmed showed");
            continue;
          }
        }
        at.AR();
        c.xh().set(12322, Boolean.valueOf(false));
        String str = bg.nl(bg.eE(paramActivity));
        if (str.length() <= 0) {
          break;
        }
        at.AR();
        if (!str.equals(c.xh().get(6, null))) {
          break;
        }
        at.AR();
        c.xh().set(12322, Boolean.valueOf(true));
        w.i("MicroMsg.PostLoginUtil", "same none-nil phone number, leave it");
      }
    }
    h.a(paramActivity, R.l.cZb, R.l.cUG, R.l.cUW, R.l.cTJ, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(468419870720L, 3490);
        w.i("MicroMsg.PostLoginUtil", "[cpan] kv report logid:%d scene:%d", new Object[] { Integer.valueOf(11438), Integer.valueOf(this.gSL) });
        com.tencent.mm.plugin.report.service.g.ork.i(11438, new Object[] { Integer.valueOf(this.gSL) });
        at.AR();
        c.xh().set(12322, Boolean.valueOf(true));
        m.h(true, false);
        com.tencent.mm.modelfriend.a.GO();
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        paramActivity.getSharedPreferences(ab.bPU(), 0).edit().putBoolean("login_upload_contacts_already_displayed", true).commit();
        GMTrace.o(468419870720L, 3490);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(470298918912L, 3504);
        at.AR();
        c.xh().set(12322, Boolean.valueOf(false));
        m.h(false, false);
        if (this.hjq != null) {
          this.hjq.run();
        }
        paramActivity.getSharedPreferences(ab.bPU(), 0).edit().putBoolean("login_upload_contacts_already_displayed", true).commit();
        GMTrace.o(470298918912L, 3504);
      }
    });
    at.AR();
    c.xh().set(12323, Boolean.valueOf(true));
    GMTrace.o(454729662464L, 3388);
  }
  
  public static void a(Context paramContext, u.a parama, int paramInt)
  {
    GMTrace.i(455400751104L, 3393);
    Intent localIntent = new Intent(paramContext, BioHelperUI.class);
    localIntent.putExtra("k_type", parama.type);
    localIntent.putExtra("KVoiceHelpCode", paramInt);
    localIntent.putExtra("Kvertify_key", parama.eEU);
    localIntent.putExtra("KVoiceHelpUrl", parama.gUJ);
    localIntent.putExtra("KVoiceHelpWording", parama.eLQ);
    localIntent.putExtra("Kusername", parama.username);
    if (parama.gUK != null) {
      localIntent.getExtras().putAll(parama.gUK);
    }
    paramContext.startActivity(localIntent);
    GMTrace.o(455400751104L, 3393);
  }
  
  public static void b(Context paramContext, final String paramString, final int paramInt)
  {
    GMTrace.i(19250714509312L, 143429);
    paramString = com.tencent.mm.h.a.dH(paramString);
    if (paramString != null)
    {
      if (paramString.showType == 8)
      {
        c(paramContext, paramString.url, paramInt);
        GMTrace.o(19250714509312L, 143429);
        return;
      }
      String str1 = paramContext.getString(R.l.cTM);
      String str2 = paramContext.getString(R.l.cSk);
      DialogInterface.OnClickListener local5 = new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(474325450752L, 3534);
          m.c(this.val$context, paramString.url, paramInt);
          GMTrace.o(474325450752L, 3534);
        }
      };
      if ((paramString.showType == 1) || (paramString.showType == 4))
      {
        if (bg.nm(paramString.url))
        {
          h.b(paramContext, paramString.desc, paramString.eBt, true);
          GMTrace.o(19250714509312L, 143429);
          return;
        }
        h.a(paramContext, paramString.desc, paramString.eBt, str1, str2, local5, null);
      }
      GMTrace.o(19250714509312L, 143429);
      return;
    }
    GMTrace.o(19250714509312L, 143429);
  }
  
  public static void bw(final Context paramContext)
  {
    GMTrace.i(455132315648L, 3391);
    String str1 = paramContext.getString(R.l.cRF);
    String str2 = paramContext.getString(R.l.cRE);
    h.a(paramContext, str1, "", paramContext.getString(R.l.diu), paramContext.getString(R.l.dis), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(465735516160L, 3470);
        paramAnonymousDialogInterface = new Intent();
        paramAnonymousDialogInterface.putExtra("rawUrl", this.hjr);
        paramAnonymousDialogInterface.putExtra("showShare", false);
        paramAnonymousDialogInterface.putExtra("show_bottom", false);
        paramAnonymousDialogInterface.putExtra("needRedirect", false);
        paramAnonymousDialogInterface.putExtra("neverGetA8Key", true);
        paramAnonymousDialogInterface.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
        paramAnonymousDialogInterface.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
        com.tencent.mm.plugin.c.a.hnH.j(paramAnonymousDialogInterface, paramContext);
        GMTrace.o(465735516160L, 3470);
      }
    }, null);
    GMTrace.o(455132315648L, 3391);
  }
  
  public static void c(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(19250848727040L, 143430);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("needRedirect", false);
    localIntent.putExtra("neverGetA8Key", true);
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
    if (paramInt > 0)
    {
      com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent, paramInt);
      GMTrace.o(19250848727040L, 143430);
      return;
    }
    com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(19250848727040L, 143430);
  }
  
  public static void h(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(454863880192L, 3389);
    int i = q.zI();
    if (paramBoolean1)
    {
      i &= 0xFFFDFFFF;
      w.d("MicroMsg.PostLoginUtil", "Reg By mobile update = " + i);
      at.AR();
      c.xh().set(7, Integer.valueOf(i));
      if (paramBoolean1) {
        break label120;
      }
    }
    label120:
    for (i = 1;; i = 2)
    {
      at.AR();
      c.yJ().b(new com.tencent.mm.av.g(17, i));
      if (paramBoolean2) {
        com.tencent.mm.plugin.c.a.hnI.pr();
      }
      GMTrace.o(454863880192L, 3389);
      return;
      i |= 0x20000;
      break;
    }
  }
  
  public static void j(final Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(455266533376L, 3392);
    paramString1 = com.tencent.mm.h.a.dH(paramString1);
    if (paramString1 != null) {
      paramString1.a(paramContext, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(466138169344L, 3473);
          paramAnonymousDialogInterface = new Intent();
          paramAnonymousDialogInterface.putExtra("rawUrl", this.hjr);
          paramAnonymousDialogInterface.putExtra("showShare", false);
          paramAnonymousDialogInterface.putExtra("show_bottom", false);
          paramAnonymousDialogInterface.putExtra("needRedirect", false);
          paramAnonymousDialogInterface.putExtra("neverGetA8Key", true);
          paramAnonymousDialogInterface.putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
          paramAnonymousDialogInterface.putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
          com.tencent.mm.plugin.c.a.hnH.j(paramAnonymousDialogInterface, paramContext);
          GMTrace.o(466138169344L, 3473);
        }
      }, null);
    }
    GMTrace.o(455266533376L, 3392);
  }
  
  public static void nh(String paramString)
  {
    GMTrace.i(454998097920L, 3390);
    as.gnb.M("login_user_name", paramString);
    GMTrace.o(454998097920L, 3390);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */