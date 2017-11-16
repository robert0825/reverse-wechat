package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.af.f;
import com.tencent.mm.g.a.md;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelmulti.b.a;
import com.tencent.mm.modelmulti.q;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.a;
import com.tencent.mm.y.l;
import com.tencent.mm.y.s;

public final class b
{
  public static void a(Context paramContext, boolean paramBoolean, String paramString)
  {
    GMTrace.i(20329153953792L, 151464);
    if (!paramBoolean)
    {
      paramContext = LauncherUI.bXe();
      if (paramContext != null) {
        paramContext.a(paramString, null, true);
      }
      GMTrace.o(20329153953792L, 151464);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("Chat_User", paramString);
    localIntent.putExtra("chat_from_scene", 4);
    com.tencent.mm.bj.d.a(paramContext, ".ui.chatting.En_5b8fbb1e", localIntent);
    GMTrace.o(20329153953792L, 151464);
  }
  
  public static void a(final String paramString, final Context paramContext, final ae paramae, final Runnable paramRunnable, final boolean paramBoolean1, final boolean paramBoolean2)
  {
    GMTrace.i(20329019736064L, 151463);
    final PBool localPBool = new PBool();
    final Object localObject;
    if (s.eb(paramString))
    {
      paramae = null;
      at.AR();
      localObject = com.tencent.mm.y.c.yM().BZ(paramString);
      at.AR();
      com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.d(paramString, ((ce)localObject).field_msgSvrId));
      localPBool.value = false;
      paramContext.getString(R.l.cUG);
      localObject = h.a(paramContext, paramContext.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(14480079585280L, 107885);
          this.wWd.value = true;
          GMTrace.o(14480079585280L, 107885);
        }
      });
      if (!localPBool.value) {
        paramae = com.tencent.mm.pluginsdk.wallet.e.PT(paramString);
      }
      if (!t.nm(paramae))
      {
        ((ProgressDialog)localObject).dismiss();
        h.a(paramContext, false, paramContext.getString(R.l.ejs, new Object[] { paramae }), null, paramContext.getString(R.l.dBn), paramContext.getString(R.l.dmv), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19153943527424L, 142708);
            this.wWd.value = true;
            b.a(paramContext, paramBoolean2, paramString);
            if (paramBoolean1) {
              g.ork.i(14553, new Object[] { Integer.valueOf(1), Integer.valueOf(4), paramString });
            }
            GMTrace.o(19153943527424L, 142708);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19159043801088L, 142746);
            this.jOb.show();
            localPBool.value = false;
            b.a(paramString, localPBool, this.jOb);
            if (paramBoolean1) {
              g.ork.i(14553, new Object[] { Integer.valueOf(1), Integer.valueOf(3), paramString });
            }
            if (paramRunnable != null) {
              paramRunnable.run();
            }
            GMTrace.o(19159043801088L, 142746);
          }
        }, -1, R.e.aMJ);
      }
    }
    while (s.fK(paramString))
    {
      w.i("MicroMsg.ConvDelLogic", "del all qmessage");
      bc.Bi();
      at.AR();
      com.tencent.mm.y.c.yP().Ch("@qqim");
      GMTrace.o(20329019736064L, 151463);
      return;
      ((ProgressDialog)localObject).dismiss();
      h.a(paramContext, paramContext.getString(R.l.dwG), "", paramContext.getString(R.l.cSt), paramContext.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20388478189568L, 151906);
          b.a(this.fTa, localPBool, localObject);
          if (paramRunnable != null) {
            paramRunnable.run();
          }
          GMTrace.o(20388478189568L, 151906);
        }
      }, null, R.e.aMJ);
      continue;
      if (s.fT(paramString))
      {
        at.AR();
        com.tencent.mm.y.c.yP().Ch(paramString);
        paramContext = new md();
        paramContext.eQW.opType = 4;
        paramContext.eQW.eRb = 20;
        com.tencent.mm.sdk.b.a.vgX.m(paramContext);
      }
      else if (s.fJ(paramString))
      {
        at.AR();
        com.tencent.mm.y.c.yP().Ch(paramString);
      }
      else if (s.fM(paramString))
      {
        at.AR();
        com.tencent.mm.y.c.yP().TN(paramString);
      }
      else if (f.dL(paramString))
      {
        localPBool.value = false;
        paramContext.getString(R.l.cUG);
        paramae = h.a(paramContext, paramContext.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(20392773156864L, 151938);
            this.wWd.value = true;
            GMTrace.o(20392773156864L, 151938);
          }
        });
        paramae.dismiss();
        h.a(paramContext, paramContext.getString(R.l.dwE), "", paramContext.getString(R.l.cSt), paramContext.getString(R.l.cSk), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(20388209754112L, 151904);
            bc.a(this.fTa, new bc.a()
            {
              public final void Bk()
              {
                GMTrace.i(20392638939136L, 151937);
                com.tencent.mm.af.a.e.w(b.11.this.vHp, false);
                if (b.11.this.jOb != null) {
                  b.11.this.jOb.dismiss();
                }
                GMTrace.o(20392638939136L, 151937);
              }
              
              public final boolean Bl()
              {
                GMTrace.i(20392504721408L, 151936);
                if ((b.11.this.wWd.value) || (b.11.this.jOb == null) || (!b.11.this.jOb.isShowing()))
                {
                  GMTrace.o(20392504721408L, 151936);
                  return true;
                }
                GMTrace.o(20392504721408L, 151936);
                return false;
              }
            });
            GMTrace.o(20388209754112L, 151904);
          }
        }, null, R.e.aMJ);
      }
      else
      {
        at.AR();
        localObject = com.tencent.mm.y.c.yM().BZ(paramString);
        at.AR();
        com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.d(paramString, ((ce)localObject).field_msgSvrId));
        localPBool.value = false;
        paramContext.getString(R.l.cUG);
        final r localr = h.a(paramContext, paramContext.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(20392236285952L, 151934);
            this.wWd.value = true;
            GMTrace.o(20392236285952L, 151934);
          }
        });
        localObject = null;
        if (!localPBool.value) {
          localObject = com.tencent.mm.pluginsdk.wallet.e.PT(paramString);
        }
        if (!t.nm((String)localObject))
        {
          localr.dismiss();
          h.a(paramContext, false, paramContext.getString(R.l.ejs, new Object[] { localObject }), null, paramContext.getString(R.l.dBn), paramContext.getString(R.l.dmv), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(19155419922432L, 142719);
              this.wWd.value = true;
              b.a(paramContext, paramBoolean2, paramString);
              if (paramBoolean1) {
                g.ork.i(14553, new Object[] { Integer.valueOf(0), Integer.valueOf(4), paramString });
              }
              GMTrace.o(19155419922432L, 142719);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(20389417713664L, 151913);
              this.wWe.show();
              localPBool.value = false;
              b.a(paramString, paramae, localPBool, this.wWe);
              if (paramRunnable != null) {
                paramRunnable.run();
              }
              if (paramBoolean1) {
                g.ork.i(14553, new Object[] { Integer.valueOf(0), Integer.valueOf(3), paramString });
              }
              GMTrace.o(20389417713664L, 151913);
            }
          }, -1, R.e.aMJ);
        }
        else
        {
          localr.dismiss();
          if (s.gc(paramString)) {}
          for (int i = R.l.dwF;; i = R.l.dwE)
          {
            h.a(paramContext, paramContext.getString(i), "", paramContext.getString(R.l.cSt), paramContext.getString(R.l.cSk), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(20393041592320L, 151940);
                b.a(paramString, paramae, localPBool, localr);
                if (paramRunnable != null) {
                  paramRunnable.run();
                }
                GMTrace.o(20393041592320L, 151940);
              }
            }, null, R.e.aMJ);
            break;
          }
        }
      }
    }
    if (s.fI(paramString))
    {
      w.i("MicroMsg.ConvDelLogic", "del all tmessage");
      bc.Bj();
      at.AR();
      com.tencent.mm.y.c.yP().Ch("@t.qq.com");
    }
    GMTrace.o(20329019736064L, 151463);
  }
  
  public static void a(final String paramString, PBool paramPBool, final ProgressDialog paramProgressDialog)
  {
    GMTrace.i(19159446454272L, 142749);
    if (l.eZ(paramString)) {
      q.JG().a(new b.a(paramString, 0, 0, 0, 0));
    }
    bc.a(paramString, new bc.a()
    {
      public final void Bk()
      {
        GMTrace.i(19150319648768L, 142681);
        at.AR();
        com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE(paramString);
        localx.uH();
        if (com.tencent.mm.l.a.eE(localx.field_type)) {
          s.o(localx.field_username, false);
        }
        for (;;)
        {
          at.AR();
          com.tencent.mm.y.c.yP().TN(paramString);
          if (paramProgressDialog != null) {
            paramProgressDialog.dismiss();
          }
          GMTrace.o(19150319648768L, 142681);
          return;
          at.AR();
          com.tencent.mm.y.c.yK().a(paramString, localx);
        }
      }
      
      public final boolean Bl()
      {
        GMTrace.i(19150185431040L, 142680);
        if ((this.wWd.value) || (paramProgressDialog == null) || (!paramProgressDialog.isShowing()))
        {
          GMTrace.o(19150185431040L, 142680);
          return true;
        }
        GMTrace.o(19150185431040L, 142680);
        return false;
      }
    });
    GMTrace.o(19159446454272L, 142749);
  }
  
  public static void a(String paramString, ae paramae, PBool paramPBool, final ProgressDialog paramProgressDialog)
  {
    GMTrace.i(19159312236544L, 142748);
    bc.a(paramString, new bc.a()
    {
      public final void Bk()
      {
        GMTrace.i(20389149278208L, 151911);
        if (paramProgressDialog != null) {
          paramProgressDialog.dismiss();
        }
        GMTrace.o(20389149278208L, 151911);
      }
      
      public final boolean Bl()
      {
        GMTrace.i(20389015060480L, 151910);
        if ((this.wWd.value) || (paramProgressDialog == null) || (!paramProgressDialog.isShowing()))
        {
          GMTrace.o(20389015060480L, 151910);
          return true;
        }
        GMTrace.o(20389015060480L, 151910);
        return false;
      }
    });
    at.AR();
    paramPBool = com.tencent.mm.y.c.yK().TE(paramString);
    paramPBool.uH();
    paramPBool.uI();
    if ((paramPBool.bSA()) && (f.iL(paramString))) {
      g.ork.i(13773, new Object[] { Integer.valueOf(0), Integer.valueOf(paramae.field_unReadCount), Integer.valueOf(1), paramae.field_username });
    }
    paramae = new aos();
    w.i("MicroMsg.ConvDelLogic", "oplog modContact user:%s remark:%s type:%d ", new Object[] { paramPBool.field_username, paramPBool.field_conRemark, Integer.valueOf(paramPBool.field_type) });
    paramae.ufy = new azq().Rq(t.nl(paramPBool.field_username));
    paramae.uxT = new azq().Rq(t.nl(paramPBool.field_nickname));
    paramae.ufo = new azq().Rq(t.nl(paramPBool.qR()));
    paramae.ufp = new azq().Rq(t.nl(paramPBool.qS()));
    paramae.gCx = paramPBool.fja;
    paramae.ueF = 561023;
    paramae.ueG = paramPBool.field_type;
    paramae.uDR = new azq().Rq(t.nl(paramPBool.field_conRemark));
    paramae.uDS = new azq().Rq(t.nl(paramPBool.field_conRemarkPYShort));
    paramae.uDT = new azq().Rq(t.nl(paramPBool.field_conRemarkPYFull));
    paramae.ueL = paramPBool.fjf;
    paramae.uEo = new azq().Rq(t.nl(paramPBool.field_domainList));
    paramae.ueP = paramPBool.fji;
    paramae.gCB = paramPBool.fjj;
    paramae.gCA = t.nl(paramPBool.signature);
    paramae.gCz = t.nl(paramPBool.getCityCode());
    paramae.gCy = t.nl(paramPBool.bSD());
    paramae.uAx = t.nl(paramPBool.fjo);
    paramae.uAz = paramPBool.field_weiboFlag;
    paramae.uEk = 0;
    paramae.tQa = new azp();
    paramae.gCG = t.nl(paramPBool.getCountryCode());
    at.AR();
    com.tencent.mm.y.c.yJ().b(new e.a(2, paramae));
    at.AR();
    com.tencent.mm.y.c.yK().a(paramString, paramPBool);
    at.AR();
    paramae = com.tencent.mm.y.c.yP().TO(paramString);
    at.AR();
    com.tencent.mm.y.c.yP().TN(paramString);
    if ((paramae != null) && ((paramae.eH(4194304)) || ((paramPBool.bSA()) && (!com.tencent.mm.l.a.eE(paramPBool.field_type)) && (paramae.field_conversationTime < com.tencent.mm.af.x.FS()))))
    {
      paramString = new i(paramString);
      at.wS().a(paramString, 0);
    }
    GMTrace.o(19159312236544L, 142748);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */