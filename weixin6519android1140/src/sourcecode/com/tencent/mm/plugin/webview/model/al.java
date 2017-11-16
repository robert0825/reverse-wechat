package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class al
  extends com.tencent.mm.plugin.ad.a
{
  public static String rFx;
  
  static
  {
    GMTrace.i(19478750429184L, 145128);
    rFx = "";
    GMTrace.o(19478750429184L, 145128);
  }
  
  public al()
  {
    GMTrace.i(19478347776000L, 145125);
    GMTrace.o(19478347776000L, 145125);
  }
  
  public final int getType()
  {
    GMTrace.i(19478481993728L, 145126);
    GMTrace.o(19478481993728L, 145126);
    return 2;
  }
  
  public final void k(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(19478616211456L, 145127);
    final String str1 = com.tencent.mm.plugin.base.model.c.tv(s.i(paramIntent, "id"));
    final String str2 = com.tencent.mm.plugin.base.model.c.tv(s.i(paramIntent, "ext_info"));
    Object localObject1 = s.i(paramIntent, "token");
    if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)) || (TextUtils.isEmpty((CharSequence)localObject1)))
    {
      w.e("MicroMsg.WebViewShortcutEntry", "jump to webview  failed, username or appId or token is null or nil.");
      GMTrace.o(19478616211456L, 145127);
      return;
    }
    Object localObject2 = new StringBuilder();
    at.AR();
    if (!((String)localObject1).equals(com.tencent.mm.plugin.base.model.d.bu(str2, com.tencent.mm.y.c.ww())))
    {
      localObject2 = ab.getContext().getSharedPreferences("app_brand_global_sp", 0);
      if (localObject2 == null)
      {
        w.w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, sp is null.");
        GMTrace.o(19478616211456L, 145127);
        return;
      }
      localObject3 = ((SharedPreferences)localObject2).getStringSet("uin_set", new HashSet());
      if ((localObject3 == null) || (((Set)localObject3).isEmpty()))
      {
        w.w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, uin set is null or nil.");
        GMTrace.o(19478616211456L, 145127);
        return;
      }
      localObject2 = new HashSet();
      localObject3 = ((Set)localObject3).iterator();
      while (((Iterator)localObject3).hasNext()) {
        ((Set)localObject2).add(com.tencent.mm.plugin.base.model.c.bu(str2, (String)((Iterator)localObject3).next()));
      }
      if (!((Set)localObject2).contains(localObject1))
      {
        w.e("MicroMsg.WebViewShortcutEntry", "jump to webview failed, illegal token(%s).", new Object[] { localObject1 });
        Toast.makeText(paramContext, paramContext.getString(R.l.elD), 1).show();
        GMTrace.o(19478616211456L, 145127);
        return;
      }
    }
    paramIntent.putExtra("type", 0);
    paramIntent.putExtra("id", "");
    localObject2 = "https://game.weixin.qq.com/cgi-bin/h5/static/gameloading/index.html?wegame_ssid=25&appid=" + str2;
    localObject1 = localObject2;
    if (!bg.nm(rFx)) {
      localObject1 = (String)localObject2 + "&" + rFx;
    }
    localObject2 = new Intent();
    ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
    ((Intent)localObject2).putExtra("from_shortcut", true);
    ((Intent)localObject2).putExtra("game_hv_menu_appid", str2);
    ((Intent)localObject2).addFlags(67108864);
    ((Intent)localObject2).addFlags(268435456);
    com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.game.H5GameWebViewUI", (Intent)localObject2);
    com.tencent.mm.af.x.FQ().ip(str1);
    localObject1 = s.i(paramIntent, "digest");
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      w.i("MicroMsg.WebViewShortcutEntry", "digest is null");
      GMTrace.o(19478616211456L, 145127);
      return;
    }
    at.AR();
    localObject2 = com.tencent.mm.y.c.yK().TE(str1);
    if ((localObject2 == null) || (bg.nm(((com.tencent.mm.storage.x)localObject2).vj())))
    {
      w.i("MicroMsg.WebViewShortcutEntry", "no need update, displayName is null");
      GMTrace.o(19478616211456L, 145127);
      return;
    }
    localObject2 = ((com.tencent.mm.storage.x)localObject2).vj();
    Object localObject3 = n.Di().ig(str1);
    if ((localObject3 == null) || (bg.nm(((h)localObject3).Dp())))
    {
      w.i("MicroMsg.WebViewShortcutEntry", "no need update, imgFlag is null");
      GMTrace.o(19478616211456L, 145127);
      return;
    }
    if (((String)localObject1).equals(g.n(((String)localObject2 + ((h)localObject3).Dp()).getBytes())))
    {
      w.i("MicroMsg.WebViewShortcutEntry", "no need update, digest is same");
      GMTrace.o(19478616211456L, 145127);
      return;
    }
    localObject1 = b.a(str1, false, -1);
    if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled()))
    {
      w.i("MicroMsg.WebViewShortcutEntry", "icon is not downloaded, next time update");
      GMTrace.o(19478616211456L, 145127);
      return;
    }
    w.i("MicroMsg.WebViewShortcutEntry", "update shortcut, displayName = %s", new Object[] { localObject2 });
    com.tencent.mm.plugin.base.model.d.c(paramContext, str1, str2, com.tencent.mm.plugin.base.model.c.tv(s.i(paramIntent, "ext_info_1")));
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19478213558272L, 145124);
        com.tencent.mm.plugin.base.model.d.a(ab.getContext(), str1, str2, null);
        GMTrace.o(19478213558272L, 145124);
      }
    }, 1000L);
    GMTrace.o(19478616211456L, 145127);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */