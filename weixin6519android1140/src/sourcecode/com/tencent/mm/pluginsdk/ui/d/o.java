package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.u;
import java.io.File;

public final class o
{
  public static void d(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(1204335673344L, 8973);
    if (paramBundle != null) {}
    for (int i = paramBundle.getInt("fromScene");; i = 0)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11621, new Object[] { Integer.valueOf(i), Integer.valueOf(0) });
      paramBundle = com.tencent.mm.plugin.downloader.model.f.apJ().vw("http://dianhua.qq.com/cgi-bin/cloudgrptemplate?t=dianhuaben_download&channel=100008");
      if ((paramBundle == null) || (paramBundle.status != 3)) {
        break;
      }
      w.i("MicroMsg.WxPhoneBookHelper", "weixin phonebook already download successfully, install directly");
      if (com.tencent.mm.a.e.aZ(paramBundle.path)) {
        q.e(paramContext, Uri.fromFile(new File(paramBundle.path)));
      }
      GMTrace.o(1204335673344L, 8973);
      return;
    }
    u.makeText(paramContext, paramContext.getString(R.l.dgO), 2000).show();
    paramBundle = new g.a();
    paramBundle.vy("http://dianhua.qq.com/cgi-bin/cloudgrptemplate?t=dianhuaben_download&channel=100008");
    paramBundle.vA(paramContext.getString(R.l.dgU));
    paramBundle.mt(1);
    paramBundle.dJ(true);
    com.tencent.mm.plugin.downloader.model.f.apJ().a(paramBundle.kfx);
    GMTrace.o(1204335673344L, 8973);
  }
  
  public static boolean pw()
  {
    boolean bool3 = true;
    GMTrace.i(1204201455616L, 8972);
    if (!h.xw().wL())
    {
      w.e("MicroMsg.WxPhoneBookHelper", "needDisplayWxPBMenuItem, account not ready");
      GMTrace.o(1204201455616L, 8972);
      return false;
    }
    boolean bool4;
    boolean bool1;
    label97:
    boolean bool2;
    if ((!bg.Jw()) && (com.tencent.mm.sdk.platformtools.f.eqV != 1) && (bg.getInt(com.tencent.mm.k.g.ut().getValue("ShowWeixinPBIntro"), 0) == 0) && (!p.n(ab.getContext(), "com.tencent.pb")))
    {
      i = 1;
      if (i != 0) {
        break label196;
      }
      bool4 = bg.Jw();
      if (com.tencent.mm.sdk.platformtools.f.eqV == 1) {
        break label181;
      }
      bool1 = true;
      if (bg.getInt(com.tencent.mm.k.g.ut().getValue("ShowWeixinPBIntro"), 0) != 0) {
        break label186;
      }
      bool2 = true;
      label114:
      if (p.n(ab.getContext(), "com.tencent.pb")) {
        break label191;
      }
    }
    for (;;)
    {
      w.d("MicroMsg.WxPhoneBookHelper", "%b, %b, %b, %b", new Object[] { Boolean.valueOf(bool4), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      GMTrace.o(1204201455616L, 8972);
      return false;
      i = 0;
      break;
      label181:
      bool1 = false;
      break label97;
      label186:
      bool2 = false;
      break label114;
      label191:
      bool3 = false;
    }
    label196:
    int i = bg.a((Integer)h.xy().xh().get(w.a.vqK, null), 3);
    w.v("MicroMsg.WxPhoneBookHelper", "needDisplayWxPBMenuItem, counter = %d", new Object[] { Integer.valueOf(i) });
    if (i <= 0)
    {
      GMTrace.o(1204201455616L, 8972);
      return false;
    }
    h.xy().xh().set(352257, Integer.valueOf(i - 1));
    GMTrace.o(1204201455616L, 8972);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */