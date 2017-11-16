package com.tencent.mm.ui.chatting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.or;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.pluginsdk.model.app.x;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.j;
import com.tencent.mm.protocal.c.amu;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.t.a;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedList;

public final class o
  implements View.OnClickListener, e, t
{
  public En_5b8fbb1e.a euA;
  public ProgressDialog htG;
  
  public o(En_5b8fbb1e.a parama)
  {
    GMTrace.i(2304518389760L, 17170);
    this.euA = parama;
    GMTrace.o(2304518389760L, 17170);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2304921042944L, 17173);
    if ((this.htG != null) && (this.htG.isShowing()))
    {
      this.htG.dismiss();
      this.htG = null;
    }
    at.wS().b(1030, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      h.bm(this.euA.bWQ(), this.euA.getString(R.l.dAC));
      GMTrace.o(2304921042944L, 17173);
      return;
    }
    Toast.makeText(this.euA.bWQ(), this.euA.getString(R.l.ees, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(2304921042944L, 17173);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.pluginsdk.model.app.w paramw)
  {
    GMTrace.i(2304786825216L, 17172);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppSpamClickListener", "appsettings errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((this.htG != null) && (this.htG.isShowing()))
    {
      this.htG.dismiss();
      this.htG = null;
    }
    an.aGk().b(2, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      h.bm(this.euA.bWQ(), this.euA.getString(R.l.dAC));
      GMTrace.o(2304786825216L, 17172);
      return;
    }
    if (t.a.a(this.euA.bWQ(), paramInt1, paramInt2, paramString, 4))
    {
      GMTrace.o(2304786825216L, 17172);
      return;
    }
    Toast.makeText(this.euA.bWQ(), this.euA.getString(R.l.dAb, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(2304786825216L, 17172);
  }
  
  public final void g(final k paramk)
  {
    GMTrace.i(16016738353152L, 119334);
    at.wS().a(paramk, 0);
    FragmentActivity localFragmentActivity = this.euA.bWQ();
    this.euA.getString(R.l.cUG);
    this.htG = h.a(localFragmentActivity, this.euA.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2370419294208L, 17661);
        at.wS().c(paramk);
        an.aGk().b(2, o.this);
        GMTrace.o(2370419294208L, 17661);
      }
    });
    GMTrace.o(16016738353152L, 119334);
  }
  
  public final void onClick(final View paramView)
  {
    boolean bool = true;
    final int i = 0;
    GMTrace.i(2304652607488L, 17171);
    if (paramView.getTag() == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppSpamClickListener", "onClick tag is null");
      GMTrace.o(2304652607488L, 17171);
      return;
    }
    final Object localObject1;
    if ((paramView.getTag() instanceof dr))
    {
      localObject1 = (dr)paramView.getTag();
      if (localObject1 == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppSpamClickListener", "ItemDataTag is null");
        GMTrace.o(2304652607488L, 17171);
        return;
      }
      paramView = ((dr)localObject1).eRj.appId;
      if (bg.nm(paramView)) {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppSpamClickListener", "appId is null or nil");
      }
      while (i == 0)
      {
        GMTrace.o(2304652607488L, 17171);
        return;
        if (g.aP(paramView, false) == null) {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppSpamClickListener", "get null appinfo : appid = " + paramView);
        } else {
          i = 1;
        }
      }
      an.aGk().a(2, this);
      if (this.euA.wvi)
      {
        i = 2;
        paramView = this.euA.cci();
        if (!s.eb(paramView)) {
          break label505;
        }
        paramView = bc.gP(((dr)localObject1).eRz.field_content);
      }
    }
    label505:
    for (;;)
    {
      localObject1 = ((dr)localObject1).eRj;
      h.a(this.euA.bWQ(), this.euA.getString(R.l.cTw), this.euA.getString(R.l.cTx), this.euA.getString(R.l.cQb), this.euA.getString(R.l.dQB), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2110707990528L, 15726);
          paramAnonymousDialogInterface = new x(2, new aj(localObject1.appId, 0, "1"));
          o.this.g(paramAnonymousDialogInterface);
          paramAnonymousDialogInterface = p.a.tma;
          if (paramAnonymousDialogInterface != null)
          {
            o.this.euA.bWQ();
            paramAnonymousDialogInterface.a(paramView, localObject1.appId, localObject1.type, i, localObject1.mediaTagName, 1);
          }
          GMTrace.o(2110707990528L, 15726);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2196473118720L, 16365);
          paramAnonymousDialogInterface = new x(2, new aj(localObject1.appId, 0, "0"));
          o.this.g(paramAnonymousDialogInterface);
          paramAnonymousDialogInterface = p.a.tma;
          if (paramAnonymousDialogInterface != null)
          {
            o.this.euA.bWQ();
            paramAnonymousDialogInterface.a(paramView, localObject1.appId, localObject1.type, i, localObject1.mediaTagName, 2);
          }
          GMTrace.o(2196473118720L, 16365);
        }
      });
      GMTrace.o(2304652607488L, 17171);
      return;
      i = 1;
      break;
      if ((paramView.getTag() instanceof ej))
      {
        final Object localObject2 = (ej)paramView.getTag();
        if (localObject2 == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppSpamClickListener", "TemplateItemDataTag is null");
          GMTrace.o(2304652607488L, 17171);
          return;
        }
        if ((localObject2 == null) || (bg.nm(((ej)localObject2).gjw)) || (((ej)localObject2).eRz == null))
        {
          if (localObject2 == null) {}
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppSpamClickListener", "wrong args, tag is null ? ", new Object[] { Boolean.valueOf(bool) });
            GMTrace.o(2304652607488L, 17171);
            return;
            bool = false;
          }
        }
        paramView = this.euA.bWQ().getString(R.l.eeq);
        localObject1 = this.euA.bWQ().getString(R.l.eer);
        String str = this.euA.bWQ().getString(R.l.cSk);
        FragmentActivity localFragmentActivity = this.euA.bWQ();
        localObject2 = new h.c()
        {
          public final void hQ(int paramAnonymousInt)
          {
            GMTrace.i(2214055641088L, 16496);
            switch (paramAnonymousInt)
            {
            }
            for (;;)
            {
              GMTrace.o(2214055641088L, 16496);
              return;
              Intent localIntent = new Intent();
              try
              {
                localIntent.putExtra("rawUrl", String.format("https://mp.weixin.qq.com/mp/readtemplate?t=wxm-appmsg-inform&bizusername=%s&tid=%s&mid=%s&mtime=%s&scene=%s#wechat_redirect", new Object[] { URLEncoder.encode(localObject2.rAP, "UTF-8"), URLEncoder.encode(localObject2.gjw, "UTF-8"), Long.valueOf(localObject2.eRz.field_msgSvrId), Integer.valueOf((int)(localObject2.eRz.field_createTime / 1000L)), Integer.valueOf(42) }));
                localIntent.putExtra("show_bottom", false);
                localIntent.putExtra("showShare", false);
                com.tencent.mm.bj.d.b(o.this.euA.bWQ(), "webview", ".ui.tools.WebViewUI", localIntent);
                GMTrace.o(2214055641088L, 16496);
                return;
              }
              catch (UnsupportedEncodingException localUnsupportedEncodingException)
              {
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppSpamClickListener", "exception in expore, %s", new Object[] { localUnsupportedEncodingException.getMessage() });
                GMTrace.o(2214055641088L, 16496);
                return;
              }
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppSpamClickListener", "hakon refulse, fromUserName = %s, templateId = %s", new Object[] { localObject2.rAP, localObject2.gjw });
              at.wS().a(1030, o.this);
              Object localObject2 = new amu();
              ((amu)localObject2).tPM = 1;
              ((amu)localObject2).uBH = localObject2.gjw;
              ((amu)localObject2).eBt = "";
              Object localObject1 = new LinkedList();
              ((LinkedList)localObject1).add(localObject2);
              localObject2 = new or();
              ((or)localObject2).eTF.eRY = localObject2.rAP;
              ((or)localObject2).eTF.eTG = ((LinkedList)localObject1);
              if (a.vgX.m((b)localObject2))
              {
                localObject1 = o.this;
                localObject2 = o.this.euA.bWQ();
                o.this.euA.getString(R.l.cUG);
                ((o)localObject1).htG = h.a((Context)localObject2, o.this.euA.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
                {
                  public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                  {
                    GMTrace.i(2496315523072L, 18599);
                    at.wS().b(1030, o.this);
                    GMTrace.o(2496315523072L, 18599);
                  }
                });
              }
            }
          }
        };
        h.a(localFragmentActivity, null, new String[] { paramView, localObject1, str }, null, true, (h.c)localObject2);
      }
      GMTrace.o(2304652607488L, 17171);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */