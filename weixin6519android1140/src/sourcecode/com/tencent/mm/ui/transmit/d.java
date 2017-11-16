package com.tencent.mm.ui.transmit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.ao.k;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.contact.v;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.List;

public final class d
  implements com.tencent.mm.plugin.messenger.a.c
{
  public d()
  {
    GMTrace.i(3046473990144L, 22698);
    GMTrace.o(3046473990144L, 22698);
  }
  
  public final void A(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(3046608207872L, 22699);
    if ((paramString1 == null) || (paramString2 == null))
    {
      w.w("MicroMsg.SendMsgMgr", "send msg args error, toUser[%s] content[%s]", new Object[] { paramString1, paramString2 });
      GMTrace.o(3046608207872L, 22699);
      return;
    }
    paramString1 = new com.tencent.mm.modelmulti.j(paramString1, paramString2, paramInt);
    at.wS().a(paramString1, 0);
    GMTrace.o(3046608207872L, 22699);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    GMTrace.i(3047010861056L, 22702);
    if ((paramString1 == null) || (paramString2 == null))
    {
      w.w("MicroMsg.SendMsgMgr", "sendImg: args error, toUser[%s], fileName[%s]", new Object[] { paramString1, paramString2 });
      GMTrace.o(3047010861056L, 22702);
      return;
    }
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      w.w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
      Toast.makeText(paramContext, R.l.dJr, 1).show();
      GMTrace.o(3047010861056L, 22702);
      return;
    }
    paramContext = new k(4, q.zE(), paramString1, paramString2, paramInt, null, 0, paramString3, paramString4, true, R.g.aVk);
    at.wS().a(paramContext, 0);
    bq.BG().c(bq.gpc, null);
    GMTrace.o(3047010861056L, 22702);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, bhr parambhr, boolean paramBoolean1, boolean paramBoolean2, String paramString4)
  {
    GMTrace.i(3046876643328L, 22701);
    if (paramContext == null)
    {
      w.w("MicroMsg.SendMsgMgr", "send vedio context is null");
      GMTrace.o(3046876643328L, 22701);
      return;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      w.w("MicroMsg.SendMsgMgr", "send vedio args error, toUser[%s] fileName[%s]", new Object[] { paramString1, paramString2 });
      GMTrace.o(3046876643328L, 22701);
      return;
    }
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      w.w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
      Toast.makeText(paramContext, R.l.dJr, 1).show();
      GMTrace.o(3046876643328L, 22701);
      return;
    }
    final MsgRetransmitUI.a locala = new MsgRetransmitUI.a();
    paramContext.getResources().getString(R.l.cUG);
    r localr = h.a(paramContext, paramContext.getResources().getString(R.l.cUt), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(3015201259520L, 22465);
        locala.xll = true;
        GMTrace.o(3015201259520L, 22465);
      }
    });
    locala.context = paramContext;
    locala.euR = paramString2;
    locala.xlm = paramString3;
    locala.hul = localr;
    locala.userName = paramString1;
    locala.eTv = paramString4;
    locala.xlp = false;
    if (62 == paramInt1) {
      locala.haG = 11;
    }
    if (paramInt1 > 0) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      locala.xkL = paramInt1;
      locala.hcv = paramInt2;
      locala.xln = false;
      locala.xlq = parambhr;
      locala.execute(new Object[0]);
      GMTrace.o(3046876643328L, 22701);
      return;
    }
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    GMTrace.i(3046742425600L, 22700);
    a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, null, false, false, paramString4);
    GMTrace.o(3046742425600L, 22700);
  }
  
  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2, String paramString3)
  {
    GMTrace.i(3047145078784L, 22703);
    if (paramString1 == null)
    {
      w.w("MicroMsg.SendMsgMgr", "sendAppMsg: args error, toUser is null");
      GMTrace.o(3047145078784L, 22703);
      return;
    }
    w.v("MicroMsg.SendMsgMgr", "for track bug sendAppMsg %s", new Object[] { paramString2 });
    f.a locala = f.a.eS(bg.Sx(paramString2));
    if (locala == null)
    {
      w.w("MicroMsg.SendMsgMgr", "send: parse app msg content return null");
      GMTrace.o(3047145078784L, 22703);
      return;
    }
    Object localObject = new b();
    w.i("MicroMsg.SendMsgMgr", "content.attachid %s", new Object[] { locala.eAE });
    paramString2 = (String)localObject;
    if (!bg.nm(locala.eAE))
    {
      long l = bg.getLong(locala.eAE, -1L);
      if (l == -1L) {
        break label421;
      }
      an.afP().b(l, (com.tencent.mm.sdk.e.c)localObject);
      paramString2 = (String)localObject;
      if (((b)localObject).vmr != l)
      {
        localObject = an.afP().Op(locala.eAE);
        if (localObject != null)
        {
          paramString2 = (String)localObject;
          if (((b)localObject).field_mediaSvrId.equals(locala.eAE)) {}
        }
        else
        {
          paramString2 = null;
        }
        if (paramString2 != null) {
          break label381;
        }
        w.i("MicroMsg.SendMsgMgr", "appAttachInfo1  %s", new Object[] { locala.eAE });
      }
    }
    for (;;)
    {
      String str = "";
      localObject = str;
      if (paramString2 != null)
      {
        localObject = str;
        if (paramString2.field_fileFullPath != null)
        {
          localObject = str;
          if (!paramString2.field_fileFullPath.equals(""))
          {
            at.AR();
            localObject = l.ad(com.tencent.mm.y.c.zg(), locala.title, locala.giw);
            com.tencent.mm.sdk.platformtools.j.r(paramString2.field_fileFullPath, (String)localObject, false);
            w.i("MicroMsg.SendMsgMgr", "copy from src %s to dest %s size: %s", new Object[] { paramString2.field_fileFullPath, localObject, Integer.valueOf(e.aY(paramString2.field_fileFullPath)) });
          }
        }
      }
      paramString2 = f.a.a(locala);
      paramString2.giy = 3;
      l.a(paramString2, locala.appId, locala.appName, paramString1, (String)localObject, paramArrayOfByte, paramString3);
      GMTrace.o(3047145078784L, 22703);
      return;
      label381:
      w.i("MicroMsg.SendMsgMgr", "appAttachInfo2  %s : %s : %s", new Object[] { locala.eAE, Long.valueOf(paramString2.vmr), paramString2.field_fileFullPath });
      continue;
      label421:
      localObject = an.afP().Op(locala.eAE);
      if (localObject != null)
      {
        paramString2 = (String)localObject;
        if (((b)localObject).field_mediaSvrId.equals(locala.eAE)) {}
      }
      else
      {
        paramString2 = null;
      }
      if (paramString2 == null) {
        w.i("MicroMsg.SendMsgMgr", "appAttachInfo3  %s", new Object[] { locala.eAE });
      } else {
        w.i("MicroMsg.SendMsgMgr", "appAttachInfo4  %s : %s : %s", new Object[] { locala.eAE, Long.valueOf(paramString2.vmr), paramString2.field_fileFullPath });
      }
    }
  }
  
  public final void cR(String paramString1, String paramString2)
  {
    GMTrace.i(3047413514240L, 22705);
    paramString2 = bg.g(bg.aq(paramString2, "").split(","));
    if (!TextUtils.isEmpty(paramString1))
    {
      paramString2 = paramString2.iterator();
      while (paramString2.hasNext())
      {
        String str = (String)paramString2.next();
        ol localol = new ol();
        localol.eTx.eTy = str;
        localol.eTx.content = paramString1;
        localol.eTx.type = s.go(str);
        localol.eTx.flags = 0;
        a.vgX.m(localol);
      }
    }
    GMTrace.o(3047413514240L, 22705);
  }
  
  public final void l(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(3047279296512L, 22704);
    if (paramBoolean)
    {
      paramString1 = new com.tencent.mm.modelmulti.j(bg.aq(paramString2, ""), v.WB(paramString1), 42);
      at.wS().a(paramString1, 0);
      GMTrace.o(3047279296512L, 22704);
      return;
    }
    paramString2 = bg.g(bg.aq(paramString2, "").split(","));
    paramString1 = v.WB(paramString1);
    int i = 0;
    while (i < paramString2.size())
    {
      com.tencent.mm.modelmulti.j localj = new com.tencent.mm.modelmulti.j((String)paramString2.get(i), paramString1, 42);
      at.wS().a(localj, 0);
      i += 1;
    }
    GMTrace.o(3047279296512L, 22704);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\transmit\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */