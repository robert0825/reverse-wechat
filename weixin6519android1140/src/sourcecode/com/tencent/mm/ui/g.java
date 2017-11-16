package com.tencent.mm.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.af.c;
import com.tencent.mm.af.d;
import com.tencent.mm.af.x;
import com.tencent.mm.bv.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.u;

public final class g
{
  static int W(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(2086951452672L, 15549);
    d locald = x.FG().iC(paramString);
    if (locald.EG()) {
      paramString = locald.EN();
    }
    paramString = x.FN().iq(paramString);
    int i;
    int j;
    label59:
    long l1;
    if (paramString != null)
    {
      i = paramString.field_qyUin;
      if (paramString == null) {
        break label211;
      }
      j = paramString.field_userUin;
      if (paramString == null) {
        break label217;
      }
      l1 = paramString.field_wwCorpId;
      label69:
      if (paramString == null) {
        break label223;
      }
    }
    label211:
    label217:
    label223:
    for (long l2 = paramString.field_wwUserVid;; l2 = 0L)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(13656, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(l1), Long.valueOf(l2) });
      w.d("MicroMsg.EnterpriseHelper", "enterprise wework action report: %s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(l1), Long.valueOf(l2) });
      GMTrace.o(2086951452672L, 15549);
      return paramInt2;
      i = 0;
      break;
      j = 0;
      break label59;
      l1 = 0L;
      break label69;
    }
  }
  
  public static int be(Context paramContext, String paramString)
  {
    GMTrace.i(2086414581760L, 15545);
    if (bg.nm(paramString))
    {
      GMTrace.o(2086414581760L, 15545);
      return 0;
    }
    paramString = x.FN().iq(paramString);
    int i;
    if ((paramString != null) && ((paramString.field_userFlag & 0x2) != 0)) {
      i = 1;
    }
    while (i != 0) {
      if ((paramString.field_wwExposeTimes < paramString.field_wwMaxExposeTimes) || (p.n(paramContext, "com.tencent.wework")))
      {
        GMTrace.o(2086414581760L, 15545);
        return 2;
        i = 0;
      }
      else
      {
        GMTrace.o(2086414581760L, 15545);
        return 1;
      }
    }
    GMTrace.o(2086414581760L, 15545);
    return 0;
  }
  
  public static void bf(Context paramContext, String paramString)
  {
    GMTrace.i(2086548799488L, 15546);
    if (bg.nm(paramString))
    {
      GMTrace.o(2086548799488L, 15546);
      return;
    }
    if (!p.n(paramContext, "com.tencent.wework")) {
      x.FN().it(paramString);
    }
    GMTrace.o(2086548799488L, 15546);
  }
  
  public static void cQ(String paramString, int paramInt)
  {
    GMTrace.i(2087085670400L, 15550);
    if (paramInt <= 0)
    {
      GMTrace.o(2087085670400L, 15550);
      return;
    }
    paramString = x.FN().iq(paramString);
    int i;
    if (paramString != null)
    {
      i = paramString.field_qyUin;
      if (paramString == null) {
        break label130;
      }
    }
    label130:
    for (int j = paramString.field_userUin;; j = 0)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(13703, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt) });
      w.d("MicroMsg.EnterpriseHelper", "enterprise click report: %s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt) });
      GMTrace.o(2087085670400L, 15550);
      return;
      i = 0;
      break;
    }
  }
  
  public static void l(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(2086683017216L, 15547);
    if (p.n(paramContext, "com.tencent.wework"))
    {
      W(paramString, 4, paramInt);
      GMTrace.o(2086683017216L, 15547);
      return;
    }
    W(paramString, 5, paramInt);
    GMTrace.o(2086683017216L, 15547);
  }
  
  public static void m(Context paramContext, final String paramString, final int paramInt)
  {
    GMTrace.i(2086817234944L, 15548);
    W(paramString, 1, paramInt);
    if (p.n(paramContext, "com.tencent.wework"))
    {
      W(paramString, 2, paramInt);
      paramString = p.getPackageInfo(paramContext, "com.tencent.wework");
      Intent localIntent;
      if ((!bg.nm(paramString.versionName)) && (paramString.versionName.compareTo("1.3.3") >= 0))
      {
        localIntent = new Intent();
        localIntent.setAction("android.intent.action.VIEW");
        if ((paramInt == 2) || (paramInt == 4) || (paramInt == 6))
        {
          paramString = "wxwork://createconversation";
          localIntent.setData(Uri.parse(paramString));
        }
      }
      for (paramString = localIntent;; paramString = paramContext.getPackageManager().getLaunchIntentForPackage("com.tencent.wework"))
      {
        a.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17920079953920L, 133515);
            com.tencent.mm.pluginsdk.model.app.g.a(this.val$context, paramString, this.val$context.getString(R.l.dqm));
            GMTrace.o(17920079953920L, 133515);
          }
        });
        GMTrace.o(2086817234944L, 15548);
        return;
        paramString = "wxwork://conversationlist";
        break;
      }
    }
    h.a(paramContext, R.l.dqp, 0, R.l.dqo, R.l.cSk, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(2538594107392L, 18914);
        Context localContext = this.val$context;
        paramAnonymousDialogInterface = paramString;
        g.W(paramAnonymousDialogInterface, 3, paramInt);
        x.FG();
        if (bg.nm(com.tencent.mm.af.e.iG(paramAnonymousDialogInterface))) {}
        for (paramAnonymousDialogInterface = "off";; paramAnonymousDialogInterface = "on")
        {
          paramAnonymousDialogInterface = String.format("https://work.weixin.qq.com/wework_admin/commdownload?from=conv%s", new Object[] { paramAnonymousDialogInterface });
          Object localObject = f.apJ().vw(paramAnonymousDialogInterface);
          if ((localObject != null) && (((FileDownloadTaskInfo)localObject).status == 3) && (com.tencent.mm.a.e.aZ(((FileDownloadTaskInfo)localObject).path))) {
            com.tencent.mm.loader.stub.b.deleteFile(((FileDownloadTaskInfo)localObject).path);
          }
          u.makeText(localContext, localContext.getString(R.l.dqq), 2000).show();
          localObject = new g.a();
          ((g.a)localObject).vy(paramAnonymousDialogInterface);
          ((g.a)localObject).vA(localContext.getString(R.l.dqm));
          ((g.a)localObject).mt(1);
          ((g.a)localObject).dJ(true);
          f.apJ().a(((g.a)localObject).kfx);
          GMTrace.o(2538594107392L, 18914);
          return;
        }
      }
    }, null);
    GMTrace.o(2086817234944L, 15548);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */