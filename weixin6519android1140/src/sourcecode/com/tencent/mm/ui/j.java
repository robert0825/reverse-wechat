package com.tencent.mm.ui;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.ap.b.a;
import com.tencent.mm.bj.d;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.g.a.bc;
import com.tencent.mm.g.a.hw;
import com.tencent.mm.g.a.hw.a;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.bindmobile.BindMContactUI;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public final class j
{
  public int eCq;
  public ProgressDialog htG;
  private View oIl;
  private TextView oIm;
  public EditText oIn;
  public i oIo;
  public boolean oIp;
  MMFragmentActivity vFP;
  public LauncherUI.b vFQ;
  public hw.a vIa;
  public e vIb;
  boolean vIc;
  com.tencent.mm.sdk.b.c vId;
  com.tencent.mm.sdk.b.c<bc> vIe;
  
  public j(MMFragmentActivity paramMMFragmentActivity, LauncherUI.b paramb)
  {
    GMTrace.i(19034355531776L, 141817);
    this.vIa = null;
    this.vIc = false;
    this.vId = new com.tencent.mm.sdk.b.c() {};
    this.eCq = 0;
    this.vIe = new com.tencent.mm.sdk.b.c() {};
    this.vFP = paramMMFragmentActivity;
    this.vFQ = paramb;
    GMTrace.o(19034355531776L, 141817);
  }
  
  public final boolean a(final hw.a parama)
  {
    GMTrace.i(19034489749504L, 141818);
    if ((parama == null) || (parama.eLo == null) || (parama.eLo.tLV == null) || (parama.eLo.tLV.size() == 0))
    {
      GMTrace.o(19034489749504L, 141818);
      return false;
    }
    final int i = parama.eLo.id;
    String str1 = parama.eLo.title;
    String str2 = parama.eLo.eCh;
    int j = parama.type;
    int k = parama.eLo.tLV.size();
    if (j == 0) {
      if (k == 1)
      {
        parama = (com.tencent.mm.protocal.b.a.a)parama.eLo.tLV.get(0);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert id[%d], title[%s], msg[%s], id[%d], action[%d], btnstr[%s], btnurl[%s]", new Object[] { Integer.valueOf(i), str1, str2, Integer.valueOf(parama.id), Integer.valueOf(parama.actionType), parama.tLT, parama.tLU });
        com.tencent.mm.ui.base.h.a(this.vFP, str2, str1, parama.tLT, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19243332534272L, 143374);
            j.this.d(i, parama.actionType, parama.id, parama.tLU);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(19243332534272L, 143374);
          }
        });
      }
    }
    for (;;)
    {
      GMTrace.o(19034489749504L, 141818);
      return true;
      final com.tencent.mm.protocal.b.a.a locala1 = (com.tencent.mm.protocal.b.a.a)parama.eLo.tLV.get(1);
      parama = (com.tencent.mm.protocal.b.a.a)parama.eLo.tLV.get(0);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert title[%s], msg[%s], id1[%d], action1[%d], btnstr1[%s],btnurl1[%s], id2[%d], action2[%d], btnstr2[%s], btnurl2[%s]", new Object[] { str1, str2, Integer.valueOf(locala1.id), Integer.valueOf(locala1.actionType), locala1.tLT, locala1.tLU, Integer.valueOf(parama.id), Integer.valueOf(parama.actionType), parama.tLT, parama.tLU });
      com.tencent.mm.ui.base.h.a(this.vFP, str2, str1, locala1.tLT, parama.tLT, false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19098780041216L, 142297);
          j.this.d(i, locala1.actionType, locala1.id, locala1.tLU);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(19098780041216L, 142297);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19042811248640L, 141880);
          j.this.d(i, parama.actionType, parama.id, parama.tLU);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(19042811248640L, 141880);
        }
      });
      continue;
      if (j == 1)
      {
        locala1 = (com.tencent.mm.protocal.b.a.a)parama.eLo.tLV.get(0);
        com.tencent.mm.protocal.b.a.a locala2 = (com.tencent.mm.protocal.b.a.a)parama.eLo.tLV.get(1);
        com.tencent.mm.ui.base.h.a(this.vFP, str2, str1, locala1.tLT, locala2.tLT, false, parama.eLp, parama.eLq);
      }
    }
  }
  
  public final e bWR()
  {
    GMTrace.i(19034758184960L, 141820);
    if (this.vIb == null) {
      this.vIb = new e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(19162801897472L, 142774);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert onSceneEnd " + paramAnonymousInt1 + " errCode " + paramAnonymousInt2 + " errMsg " + paramAnonymousString + "  " + paramAnonymousk.getType());
          if (j.this.htG != null)
          {
            j.this.htG.dismiss();
            j.this.htG = null;
          }
          if (paramAnonymousk.getType() == 255)
          {
            at.wS().b(255, j.this.vIb);
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              j.this.hg(true);
              GMTrace.o(19162801897472L, 142774);
              return;
            }
            if (t.a.a(j.this.vFP, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString, 4))
            {
              GMTrace.o(19162801897472L, 142774);
              return;
            }
            j.this.hg(false);
            GMTrace.o(19162801897472L, 142774);
            return;
          }
          if (paramAnonymousk.getType() == 384)
          {
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              at.AR();
              com.tencent.mm.y.c.xh().set(77830, ((com.tencent.mm.modelsimple.aj)paramAnonymousk).Hx());
              paramAnonymousString = new Intent();
              paramAnonymousString.putExtra("kintent_hint", j.this.getString(R.l.dZu));
              d.b(j.this.vFP, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", paramAnonymousString);
              GMTrace.o(19162801897472L, 142774);
              return;
            }
            j.this.oIp = true;
            com.tencent.mm.ui.base.h.a(j.this.vFP, R.l.dZH, R.l.cUG, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(19162265026560L, 142770);
                j.this.bWS();
                GMTrace.o(19162265026560L, 142770);
              }
            });
          }
          GMTrace.o(19162801897472L, 142774);
        }
      };
    }
    e locale = this.vIb;
    GMTrace.o(19034758184960L, 141820);
    return locale;
  }
  
  public final void bWS()
  {
    GMTrace.i(19035026620416L, 141822);
    if (this.oIo != null)
    {
      this.oIo.show();
      GMTrace.o(19035026620416L, 141822);
      return;
    }
    if (this.oIl == null)
    {
      this.oIl = View.inflate(this.vFP, R.i.cFS, null);
      this.oIm = ((TextView)this.oIl.findViewById(R.h.ccl));
      this.oIm.setText(getString(R.l.dYY));
      this.oIn = ((EditText)this.oIl.findViewById(R.h.cck));
      this.oIn.setInputType(129);
    }
    this.oIo = com.tencent.mm.ui.base.h.a(this.vFP, null, this.oIl, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(19224139399168L, 143231);
        paramAnonymousDialogInterface = j.this.oIn.getText().toString();
        j.this.oIn.setText("");
        j.this.oIn.clearFocus();
        com.tencent.mm.platformtools.t.a(j.this.vFP, j.this.oIn);
        if ((paramAnonymousDialogInterface == null) || (paramAnonymousDialogInterface.equals("")))
        {
          com.tencent.mm.ui.base.h.a(j.this.vFP, R.l.egb, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(19034221314048L, 141816);
              GMTrace.o(19034221314048L, 141816);
            }
          });
          GMTrace.o(19224139399168L, 143231);
          return;
        }
        j.this.bWR();
        at.wS().a(384, j.this.vIb);
        paramAnonymousDialogInterface = new com.tencent.mm.modelsimple.aj(paramAnonymousDialogInterface, "", "", "");
        at.wS().a(paramAnonymousDialogInterface, 0);
        j localj = j.this;
        MMFragmentActivity localMMFragmentActivity = j.this.vFP;
        j.this.getString(R.l.cUG);
        localj.htG = com.tencent.mm.ui.base.h.a(localMMFragmentActivity, j.this.getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(19148977471488L, 142671);
            at.wS().b(384, j.this.vIb);
            j.this.vIb = null;
            at.wS().c(paramAnonymousDialogInterface);
            GMTrace.o(19148977471488L, 142671);
          }
        });
        GMTrace.o(19224139399168L, 143231);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(19102135484416L, 142322);
        j.this.oIn.setText("");
        j.this.oIo.dismiss();
        GMTrace.o(19102135484416L, 142322);
      }
    });
    GMTrace.o(19035026620416L, 141822);
  }
  
  public final void d(int paramInt1, int paramInt2, int paramInt3, final String paramString)
  {
    GMTrace.i(19034623967232L, 141819);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert jumpByActionType  alertId[%d], actionType[%d], btnId[%d], url[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    g.ork.i(13191, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Boolean.valueOf(false) });
    switch (paramInt2)
    {
    }
    for (;;)
    {
      GMTrace.o(19034623967232L, 141819);
      return;
      GMTrace.o(19034623967232L, 141819);
      return;
      Object localObject = new Intent();
      ((Intent)localObject).putExtra("rawUrl", paramString);
      ((Intent)localObject).putExtra("showShare", false);
      ((Intent)localObject).putExtra("show_bottom", false);
      ((Intent)localObject).putExtra("needRedirect", false);
      ((Intent)localObject).putExtra("neverGetA8Key", true);
      ((Intent)localObject).putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
      ((Intent)localObject).putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
      d.b(this.vFP, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
      GMTrace.o(19034623967232L, 141819);
      return;
      if (this.oIp)
      {
        hg(true);
        GMTrace.o(19034623967232L, 141819);
        return;
      }
      bWR();
      at.wS().a(255, this.vIb);
      paramString = new com.tencent.mm.modelsimple.w(1);
      at.wS().a(paramString, 0);
      localObject = this.vFP;
      getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19243600969728L, 143376);
          at.wS().c(paramString);
          GMTrace.o(19243600969728L, 143376);
        }
      });
      GMTrace.o(19034623967232L, 141819);
      return;
      paramString = new Intent();
      paramString.setClass(this.vFP, BindMContactUI.class);
      paramString.putExtra("is_bind_for_change_mobile", true);
      localObject = ((TelephonyManager)this.vFP.getSystemService("phone")).getSimCountryIso();
      if (!com.tencent.mm.platformtools.t.nm((String)localObject))
      {
        localObject = com.tencent.mm.ap.b.h(this.vFP, (String)localObject, getString(R.l.bsf));
        if (localObject != null)
        {
          paramString.putExtra("country_name", ((b.a)localObject).gLy);
          paramString.putExtra("couttry_code", ((b.a)localObject).gLx);
        }
      }
      MMWizardActivity.A(this.vFP, paramString);
      GMTrace.o(19034623967232L, 141819);
      return;
      paramString = new Intent();
      paramString.putExtra("BaseScanUI_select_scan_mode", 1);
      paramString.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
      paramString.setFlags(65536);
      if ((!com.tencent.mm.p.a.aQ(this.vFP)) && (!com.tencent.mm.p.a.aP(this.vFP))) {
        d.b(this.vFP, "scanner", ".ui.BaseScanUI", paramString);
      }
    }
  }
  
  final String getString(int paramInt)
  {
    GMTrace.i(19149111689216L, 142672);
    String str = this.vFP.getString(paramInt);
    GMTrace.o(19149111689216L, 142672);
    return str;
  }
  
  public final void hg(boolean paramBoolean)
  {
    GMTrace.i(19034892402688L, 141821);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert handlePassword " + paramBoolean);
    if (paramBoolean)
    {
      bWS();
      GMTrace.o(19034892402688L, 141821);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("kintent_hint", getString(R.l.dZu));
    d.b(this.vFP, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", localIntent);
    GMTrace.o(19034892402688L, 141821);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */