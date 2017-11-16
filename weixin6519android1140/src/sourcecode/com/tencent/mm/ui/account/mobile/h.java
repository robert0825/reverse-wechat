package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.modelsimple.x;
import com.tencent.mm.plugin.accountsync.a.c;
import com.tencent.mm.plugin.accountsync.a.c.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.RegSetInfoUI;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.ui.bindmobile.FindMContactAlertUI;
import com.tencent.mm.ui.bindmobile.FindMContactIntroUI;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bj;
import java.io.File;
import java.util.Map;

public final class h
  implements com.tencent.mm.ad.e, MobileVerifyUI.b
{
  public String jQv;
  public a vSw;
  public MobileVerifyUI vWn;
  public String vWu;
  private boolean vWv;
  
  public h()
  {
    GMTrace.i(2581543780352L, 19234);
    this.vSw = null;
    this.vWv = true;
    GMTrace.o(2581543780352L, 19234);
  }
  
  public final boolean Bw(int paramInt)
  {
    GMTrace.i(2582080651264L, 19238);
    switch (8.vWq[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(2582080651264L, 19238);
      return false;
      com.tencent.mm.ui.base.h.a(this.vWn, this.vWn.getString(R.l.dIT), "", this.vWn.getString(R.l.dIU), this.vWn.getString(R.l.dIV), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2601676439552L, 19384);
          h.this.vWn.finish();
          c.hJ(c.a.htg);
          if (bj.BC().BD() > 0)
          {
            com.tencent.mm.plugin.c.b.nz(h.this.vWn.osl);
            com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",RE200_300," + at.eK("RE200_300") + ",2");
            GMTrace.o(2601676439552L, 19384);
            return;
          }
          com.tencent.mm.plugin.c.b.nz(h.this.vWn.osl);
          com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + ",R200_300," + at.eK("R200_300") + ",2");
          GMTrace.o(2601676439552L, 19384);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(2601139568640L, 19380);
          GMTrace.o(2601139568640L, 19380);
        }
      });
      GMTrace.o(2582080651264L, 19238);
      return true;
      at.wS().a(145, this);
      final s locals = new s(this.vWn.eMW, 15, this.vWn.vVi.getText().toString().trim(), 0, "");
      locals.jU(this.vWn.vQG);
      at.wS().a(locals, 0);
      MobileVerifyUI localMobileVerifyUI1 = this.vWn;
      MobileVerifyUI localMobileVerifyUI2 = this.vWn;
      this.vWn.getString(R.l.cUG);
      localMobileVerifyUI1.htG = com.tencent.mm.ui.base.h.a(localMobileVerifyUI2, this.vWn.getString(R.l.cZU), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2602884399104L, 19393);
          at.wS().c(locals);
          at.wS().b(145, h.this);
          GMTrace.o(2602884399104L, 19393);
        }
      });
      continue;
      com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",R200_400," + at.eK("R200_400") + ",1");
      if (bj.BC().BD() > 0) {
        com.tencent.mm.plugin.c.b.ny("RE200_250");
      }
      for (;;)
      {
        at.wS().a(145, this);
        locals = new s(this.vWn.eMW, 14, "", 0, "");
        locals.jU(this.vWn.vQG);
        at.wS().a(locals, 0);
        c.hJ(c.a.hth);
        break;
        com.tencent.mm.plugin.c.b.ny("R200_350_auto");
      }
      com.tencent.mm.plugin.c.b.nA(at.wN() + "," + getClass().getName() + ",R200_350_auto," + at.eK("R200_350_auto") + ",1");
      at.wS().a(145, this);
      locals = new s(this.vWn.eMW, 15, this.vWn.vVi.getText().toString().trim(), 0, "");
      locals.jU(this.vWn.vQG);
      at.wS().a(locals, 0);
      localMobileVerifyUI1 = this.vWn;
      localMobileVerifyUI2 = this.vWn;
      this.vWn.getString(R.l.cUG);
      localMobileVerifyUI1.htG = com.tencent.mm.ui.base.h.a(localMobileVerifyUI2, this.vWn.getString(R.l.cZU), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2587315142656L, 19277);
          at.wS().c(locals);
          at.wS().b(145, h.this);
          GMTrace.o(2587315142656L, 19277);
        }
      });
    }
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, final k paramk)
  {
    GMTrace.i(2582214868992L, 19239);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MobileVerifyRegLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.vWn.htG != null)
    {
      this.vWn.htG.dismiss();
      this.vWn.htG = null;
    }
    if (paramk.getType() == 255)
    {
      at.wS().b(255, this);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        this.vWn.lt(this.vWv);
      }
      GMTrace.o(2582214868992L, 19239);
      return;
    }
    final Object localObject1;
    if ((paramk.getType() == 701) && (this.vSw != null))
    {
      at.wS().b(701, this);
      this.vSw.a(this.vWn, paramInt1, paramInt2, paramString, paramk);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if ((paramk instanceof u)) {
          this.vWv = ((u)paramk).LC();
        }
        at.wS().a(255, this);
        paramString = new com.tencent.mm.modelsimple.w(1);
        at.wS().a(paramString, 0);
        paramk = this.vWn;
        localObject1 = this.vWn;
        this.vWn.getString(R.l.cUG);
        paramk.htG = com.tencent.mm.ui.base.h.a((Context)localObject1, this.vWn.getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(2632278081536L, 19612);
            at.wS().c(paramString);
            GMTrace.o(2632278081536L, 19612);
          }
        });
      }
      GMTrace.o(2582214868992L, 19239);
      return;
    }
    int i;
    label734:
    final Object localObject2;
    final String str2;
    Object localObject4;
    final String str1;
    final int j;
    String str3;
    boolean bool2;
    final boolean bool1;
    Object localObject3;
    if (paramk.getType() == 145)
    {
      at.wS().b(145, this);
      i = ((s)paramk).CD();
      if (i != 15)
      {
        GMTrace.o(2582214868992L, 19239);
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (i == 15)
        {
          if (this.vWn.vWL.booleanValue())
          {
            this.vWu = ((s)paramk).Hx();
            at.wS().a(126, this);
            paramString = new x("", this.vWn.llm, this.vWn.aDn, 0, "", this.vWn.eMW, "", "", this.vWu, this.vWn.gUV, "", "", "", true, this.vWn.vWK.booleanValue());
            paramString.lq(this.vWn.vQG);
            at.wS().a(paramString, 0);
            paramk = this.vWn;
            localObject1 = this.vWn;
            this.vWn.getString(R.l.cUG);
            paramk.htG = com.tencent.mm.ui.base.h.a((Context)localObject1, this.vWn.getString(R.l.dRT), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(2579933167616L, 19222);
                at.wS().c(paramString);
                at.wS().b(126, h.this);
                GMTrace.o(2579933167616L, 19222);
              }
            });
            GMTrace.o(2582214868992L, 19239);
            return;
          }
          paramString = new Intent();
          paramString.putExtra("regsetinfo_ticket", ((s)paramk).Hx());
          paramString.putExtra("regsetinfo_user", this.vWn.eMW);
          paramString.putExtra("regsession_id", this.vWn.vQG);
          paramString.putExtra("regsetinfo_ismobile", 1);
          paramString.putExtra("regsetinfo_NextControl", ((s)paramk).HD());
          paramString.setClass(this.vWn, RegSetInfoUI.class);
          this.vWn.startActivity(paramString);
          c.hJ(c.a.hti);
          com.tencent.mm.plugin.c.b.nz("R200_900_phone");
          if (bj.BC().BD() <= 0) {
            break label734;
          }
        }
        for (paramString = "RE200_300";; paramString = "R200_300")
        {
          com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + "," + paramString + "," + at.eK(paramString) + ",2");
          GMTrace.o(2582214868992L, 19239);
          return;
        }
      }
      if (paramInt2 == -35)
      {
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString != null)
        {
          paramString.a(this.vWn, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2599126302720L, 19365);
              at.wS().a(701, h.this);
              h.this.vSw = new a(new a.a()
              {
                public final void b(ProgressDialog paramAnonymous2ProgressDialog)
                {
                  GMTrace.i(2599394738176L, 19367);
                  h.this.vWn.htG = paramAnonymous2ProgressDialog;
                  GMTrace.o(2599394738176L, 19367);
                }
              }, ((s)paramk).getUsername(), ((s)paramk).Hw(), h.this.vWn.eMW);
              h.this.vSw.i(h.this.vWn);
              GMTrace.o(2599126302720L, 19365);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2620735356928L, 19526);
              GMTrace.o(2620735356928L, 19526);
            }
          });
          GMTrace.o(2582214868992L, 19239);
          return;
        }
        com.tencent.mm.ui.base.h.a(this.vWn, this.vWn.getString(R.l.cZa), null, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2620466921472L, 19524);
            at.wS().a(701, h.this);
            h.this.vSw = new a(new a.a()
            {
              public final void b(ProgressDialog paramAnonymous2ProgressDialog)
              {
                GMTrace.i(2612279640064L, 19463);
                h.this.vWn.htG = paramAnonymous2ProgressDialog;
                GMTrace.o(2612279640064L, 19463);
              }
            }, ((s)paramk).getUsername(), ((s)paramk).Hw(), h.this.vWn.eMW);
            h.this.vSw.i(h.this.vWn);
            GMTrace.o(2620466921472L, 19524);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2595502424064L, 19338);
            GMTrace.o(2595502424064L, 19338);
          }
        });
        GMTrace.o(2582214868992L, 19239);
        return;
      }
      if (paramInt2 == 65324)
      {
        paramString = new Intent(this.vWn, MobileLoginOrForceReg.class);
        paramString.putExtra("ticket", ((s)paramk).Hx());
        paramString.putExtra("moble", this.vWn.eMW);
        paramString.putExtra("regsession_id", this.vWn.vQG);
        paramString.putExtra("next_controll", ((s)paramk).HD());
        paramString.putExtra("username", ((s)paramk).getUsername());
        paramString.putExtra("password", ((s)paramk).Hw());
        paramString.putExtra("nickname", ((s)paramk).HK());
        paramString.putExtra("avatar_url", ((s)paramk).HJ());
        if (this.vWn.vWL.booleanValue())
        {
          paramString.putExtra("kintent_nickname", this.vWn.aDn);
          paramString.putExtra("kintent_password", this.vWn.llm);
          paramString.putExtra("kintent_hasavatar", this.vWn.vWK);
        }
        this.vWn.startActivity(paramString);
        com.tencent.mm.plugin.c.b.nz("R200_600");
        if (bj.BC().BD() > 0) {}
        for (paramString = "RE200_300";; paramString = "R200_300")
        {
          com.tencent.mm.plugin.c.b.b(false, at.wN() + "," + getClass().getName() + "," + paramString + "," + at.eK(paramString) + ",2");
          GMTrace.o(2582214868992L, 19239);
          return;
        }
      }
      if (paramInt2 == -51)
      {
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString != null)
        {
          paramString.a(this.vWn, null, null);
          GMTrace.o(2582214868992L, 19239);
          return;
        }
        com.tencent.mm.ui.base.h.h(this.vWn, R.l.cZX, R.l.bhd);
        GMTrace.o(2582214868992L, 19239);
      }
    }
    else if (paramk.getType() == 126)
    {
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        paramString = this.vWn.eMW;
        paramString = this.vWn.vWK;
        localObject1 = this.vWn.llm;
        localObject2 = this.vWn.aDn;
        if (this.vWn.vMf == null)
        {
          this.vWn.vMf = SecurityImage.a.a(this.vWn, R.l.dRU, 0, ((x)paramk).HP(), ((x)paramk).HQ(), "", new DialogInterface.OnClickListener()
          {
            public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(2629325291520L, 19590);
              at.wS().a(126, h.this);
              paramAnonymousDialogInterface = new x("", localObject1, localObject2, 0, "", h.this.vWn.eMW, "", "", h.this.vWu, h.this.vWn.gUV, "", ((x)paramk).HQ(), h.this.vWn.vMf.bZo(), true, paramString.booleanValue());
              paramAnonymousDialogInterface.lq(h.this.vWn.vQG);
              at.wS().a(paramAnonymousDialogInterface, 0);
              MobileVerifyUI localMobileVerifyUI1 = h.this.vWn;
              MobileVerifyUI localMobileVerifyUI2 = h.this.vWn;
              h.this.vWn.getString(R.l.cUG);
              localMobileVerifyUI1.htG = com.tencent.mm.ui.base.h.a(localMobileVerifyUI2, h.this.vWn.getString(R.l.dRT), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
                {
                  GMTrace.i(2613621817344L, 19473);
                  at.wS().c(paramAnonymousDialogInterface);
                  at.wS().b(126, h.this);
                  GMTrace.o(2613621817344L, 19473);
                }
              });
              GMTrace.o(2629325291520L, 19590);
            }
          }, null, new DialogInterface.OnDismissListener()new SecurityImage.b
          {
            public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(2600065826816L, 19372);
              h.this.vWn.vMf = null;
              GMTrace.o(2600065826816L, 19372);
            }
          }, new SecurityImage.b()
          {
            public final void bYp()
            {
              GMTrace.i(2586375618560L, 19270);
              h.this.vWn.aLo();
              at.wS().a(126, h.this);
              x localx = new x("", localObject1, localObject2, 0, "", h.this.vWn.eMW, "", "", h.this.vWu, h.this.vWn.gUV, "", ((x)paramk).HQ(), "", true, paramString.booleanValue());
              localx.lq(h.this.vWn.vQG);
              at.wS().a(localx, 0);
              GMTrace.o(2586375618560L, 19270);
            }
          });
          GMTrace.o(2582214868992L, 19239);
          return;
        }
        this.vWn.vMf.a(0, ((x)paramk).HP(), ((x)paramk).HQ(), "");
        GMTrace.o(2582214868992L, 19239);
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        str2 = this.vWn.eMW;
        localObject4 = this.vWn.vWK;
        localObject1 = this.vWn.llm;
        localObject1 = this.vWn.aDn;
        i = ((x)paramk).HH();
        str1 = ((x)paramk).LE();
        j = ((x)paramk).LF();
        str3 = ((x)paramk).LG();
        localObject1 = null;
        localObject2 = null;
        bool2 = false;
        bool1 = false;
        Map localMap = bh.q(str3, "wording");
        if (localMap == null) {
          break label2398;
        }
        localObject3 = (String)localMap.get(".wording.switch");
        if (!bg.nm((String)localObject3)) {
          break label1923;
        }
        bool1 = true;
        bool2 = bool1;
        if (!bool1) {
          break label2398;
        }
        localObject3 = (String)localMap.get(".wording.title");
        if (!bg.nm((String)localObject3)) {
          localObject1 = localObject3;
        }
        localObject3 = (String)localMap.get(".wording.desc");
        if (bg.nm((String)localObject3)) {
          break label2395;
        }
        localObject2 = localObject3;
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MobileVerifyRegLogic", "hasSetAvatar , %s", new Object[] { localObject4 });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MobileVerifyRegLogic", "styleId , %s", new Object[] { Integer.valueOf(i) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MobileVerifyRegLogic", "nextStep , %s", new Object[] { str1 });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MobileVerifyRegLogic", "nextStyle , %s", new Object[] { Integer.valueOf(j) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MobileVerifyRegLogic", "mShowStyleContactUploadWordings , %s", new Object[] { str3 });
      at.unhold();
      at.bg(true);
      if (((Boolean)localObject4).booleanValue())
      {
        localObject3 = com.tencent.mm.compatible.util.e.fSg + "temp.avatar";
        localObject4 = com.tencent.mm.compatible.util.e.fSg + "temp.avatar.hd";
        new File((String)localObject3).renameTo(new File((String)localObject4));
        com.tencent.mm.loader.stub.b.deleteFile((String)localObject3);
        d.b((String)localObject4, 96, 96, Bitmap.CompressFormat.JPEG, 90, (String)localObject3);
        new o(this.vWn, com.tencent.mm.compatible.util.e.fSg + "temp.avatar").a(new Runnable()new Runnable
        {
          public final void run()
          {
            GMTrace.i(2619661615104L, 19518);
            h.this.jQv = ((x)paramk).LD();
            as.gnb.M("login_user_name", str2);
            com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.compatible.util.e.fSg + "temp.avatar");
            if ((str1 != null) && (str1.contains("0")))
            {
              com.tencent.mm.plugin.c.b.nz("R300_100_phone");
              if (!bool1) {
                localIntent1 = new Intent(h.this.vWn, FindMContactIntroUI.class);
              }
              for (;;)
              {
                localIntent1.addFlags(67108864);
                localIntent1.putExtra("regsetinfo_ticket", h.this.jQv);
                localIntent1.putExtra("regsetinfo_NextStep", str1);
                localIntent1.putExtra("regsetinfo_NextStyle", j);
                Intent localIntent2 = com.tencent.mm.plugin.c.a.hnH.ao(h.this.vWn);
                localIntent2.addFlags(67108864);
                MMWizardActivity.b(h.this.vWn, localIntent1, localIntent2);
                h.this.vWn.finish();
                GMTrace.o(2619661615104L, 19518);
                return;
                localIntent1 = new Intent(h.this.vWn, FindMContactAlertUI.class);
                localIntent1.putExtra("alert_title", localObject1);
                localIntent1.putExtra("alert_message", localObject2);
              }
            }
            Intent localIntent1 = com.tencent.mm.plugin.c.a.hnH.ao(h.this.vWn);
            localIntent1.addFlags(67108864);
            h.this.vWn.startActivity(localIntent1);
            com.tencent.mm.plugin.c.b.nA(at.wN() + "," + h.this.vWn.getClass().getName() + ",R200_900_phone," + at.eK("R200_900_phone") + ",4");
            h.this.vWn.finish();
            GMTrace.o(2619661615104L, 19518);
          }
        }, new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2601944875008L, 19386);
            h.this.jQv = ((x)paramk).LD();
            as.gnb.M("login_user_name", str2);
            if ((str1 != null) && (str1.contains("0")))
            {
              com.tencent.mm.plugin.c.b.nz("R300_100_phone");
              if (!bool1) {
                localIntent1 = new Intent(h.this.vWn, FindMContactIntroUI.class);
              }
              for (;;)
              {
                localIntent1.addFlags(67108864);
                localIntent1.putExtra("regsetinfo_ticket", h.this.jQv);
                localIntent1.putExtra("regsetinfo_NextStep", str1);
                localIntent1.putExtra("regsetinfo_NextStyle", j);
                Intent localIntent2 = com.tencent.mm.plugin.c.a.hnH.ao(h.this.vWn);
                localIntent2.addFlags(67108864);
                MMWizardActivity.b(h.this.vWn, localIntent1, localIntent2);
                h.this.vWn.finish();
                GMTrace.o(2601944875008L, 19386);
                return;
                localIntent1 = new Intent(h.this.vWn, FindMContactAlertUI.class);
                localIntent1.putExtra("alert_title", localObject1);
                localIntent1.putExtra("alert_message", localObject2);
              }
            }
            Intent localIntent1 = com.tencent.mm.plugin.c.a.hnH.ao(h.this.vWn);
            localIntent1.addFlags(67108864);
            h.this.vWn.startActivity(localIntent1);
            com.tencent.mm.plugin.c.b.nA(at.wN() + "," + h.this.vWn.getClass().getName() + ",R200_900_phone," + at.eK("R200_900_phone") + ",4");
            h.this.vWn.finish();
            GMTrace.o(2601944875008L, 19386);
          }
        });
      }
      for (;;)
      {
        localObject1 = com.tencent.mm.h.a.dH(paramString);
        if (localObject1 == null) {
          break label2272;
        }
        ((com.tencent.mm.h.a)localObject1).a(this.vWn, null, null);
        GMTrace.o(2582214868992L, 19239);
        return;
        label1923:
        int k = bg.Sy((String)localObject3);
        if (k == 0)
        {
          bool1 = false;
          break;
        }
        if (k != 1) {
          break;
        }
        bool1 = true;
        break;
        this.jQv = ((x)paramk).LD();
        as.gnb.M("login_user_name", str2);
        if ((str1 != null) && (str1.contains("0")))
        {
          com.tencent.mm.plugin.c.b.nz("R300_100_phone");
          if (!bool1) {}
          for (localObject1 = new Intent(this.vWn, FindMContactIntroUI.class);; localObject1 = localObject3)
          {
            ((Intent)localObject1).addFlags(67108864);
            ((Intent)localObject1).putExtra("regsetinfo_ticket", this.jQv);
            ((Intent)localObject1).putExtra("regsetinfo_NextStep", str1);
            ((Intent)localObject1).putExtra("regsetinfo_NextStyle", j);
            localObject2 = com.tencent.mm.plugin.c.a.hnH.ao(this.vWn);
            ((Intent)localObject2).addFlags(67108864);
            ((Intent)localObject2).putExtra("LauncherUI.enter_from_reg", true);
            MMWizardActivity.b(this.vWn, (Intent)localObject1, (Intent)localObject2);
            this.vWn.finish();
            break;
            localObject3 = new Intent(this.vWn, FindMContactAlertUI.class);
            ((Intent)localObject3).putExtra("alert_title", (String)localObject1);
            ((Intent)localObject3).putExtra("alert_message", (String)localObject2);
          }
        }
        localObject1 = com.tencent.mm.plugin.c.a.hnH.ao(this.vWn);
        ((Intent)localObject1).addFlags(67108864);
        ((Intent)localObject1).putExtra("LauncherUI.enter_from_reg", true);
        this.vWn.startActivity((Intent)localObject1);
        com.tencent.mm.plugin.c.b.nA(at.wN() + "," + this.vWn.getClass().getName() + ",R200_900_phone," + at.eK("R200_900_phone") + ",4");
        this.vWn.finish();
      }
      label2272:
      if (this.vWn.q(paramInt1, paramInt2, paramString))
      {
        GMTrace.o(2582214868992L, 19239);
        return;
      }
      if (paramk.getType() == 701)
      {
        paramString = com.tencent.mm.h.a.dH(paramString);
        if ((paramString != null) && (paramString.a(this.vWn, null, null)))
        {
          GMTrace.o(2582214868992L, 19239);
          return;
        }
      }
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        Toast.makeText(this.vWn, this.vWn.getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
      GMTrace.o(2582214868992L, 19239);
      return;
      label2395:
      continue;
      label2398:
      localObject1 = null;
      bool1 = bool2;
    }
  }
  
  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    GMTrace.i(2581677998080L, 19235);
    this.vWn = paramMobileVerifyUI;
    GMTrace.o(2581677998080L, 19235);
  }
  
  public final void start()
  {
    GMTrace.i(2581812215808L, 19236);
    if (bj.BC().BD() == 0)
    {
      com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",R200_300," + at.eK("R200_300") + ",1");
      com.tencent.mm.plugin.c.b.ny("R200_300");
      GMTrace.o(2581812215808L, 19236);
      return;
    }
    com.tencent.mm.plugin.c.b.b(true, at.wN() + "," + getClass().getName() + ",RE200_300," + at.eK("RE200_300") + ",1");
    com.tencent.mm.plugin.c.b.ny("RE200_300");
    GMTrace.o(2581812215808L, 19236);
  }
  
  public final void stop()
  {
    GMTrace.i(2581946433536L, 19237);
    GMTrace.o(2581946433536L, 19237);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\mobile\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */