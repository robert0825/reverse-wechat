package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.hl;
import com.tencent.mm.g.a.hl.b;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.g.a.hm.a;
import com.tencent.mm.modelfriend.t;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.friend.FindMContactAddUI;
import com.tencent.mm.y.at;
import java.util.List;

public final class g
  implements e, MobileVerifyUI.b
{
  private String jQv;
  private MobileVerifyUI vWn;
  private String vWr;
  private int vWs;
  
  public g()
  {
    GMTrace.i(2607179366400L, 19425);
    this.jQv = null;
    this.vWr = "";
    this.vWs = 2;
    GMTrace.o(2607179366400L, 19425);
  }
  
  public final boolean Bw(int paramInt)
  {
    GMTrace.i(2607716237312L, 19429);
    switch (3.vWq[(paramInt - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(2607716237312L, 19429);
      return false;
      final Object localObject1 = new hl();
      ((hl)localObject1).eKJ.context = this.vWn;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = ((hl)localObject1).eKK.eKL;
      Object localObject2 = new hm();
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      localObject2 = ((hm)localObject2).eKM.eKN;
      at.wS().a(132, this);
      localObject1 = new t(this.vWn.eMW, 2, this.vWn.vVi.getText().toString().trim(), "", (String)localObject1, (String)localObject2);
      at.wS().a((k)localObject1, 0);
      localObject2 = this.vWn;
      MobileVerifyUI localMobileVerifyUI = this.vWn;
      this.vWn.getString(R.l.cUG);
      ((MobileVerifyUI)localObject2).htG = h.a(localMobileVerifyUI, this.vWn.getString(R.l.cZU), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2614695559168L, 19481);
          at.wS().c(localObject1);
          at.wS().b(132, g.this);
          GMTrace.o(2614695559168L, 19481);
        }
      });
      continue;
      at.wS().a(132, this);
      localObject1 = new t(this.vWn.eMW, 1, "", 0, "");
      at.wS().a((k)localObject1, 0);
      continue;
      localObject1 = new hl();
      ((hl)localObject1).eKJ.context = this.vWn;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = ((hl)localObject1).eKK.eKL;
      localObject2 = new hm();
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      localObject2 = ((hm)localObject2).eKM.eKN;
      at.wS().a(132, this);
      localObject1 = new t(this.vWn.eMW, 2, this.vWn.vVi.getText().toString().trim(), "", (String)localObject1, (String)localObject2);
      at.wS().a((k)localObject1, 0);
      localObject2 = this.vWn;
      localMobileVerifyUI = this.vWn;
      this.vWn.getString(R.l.cUG);
      ((MobileVerifyUI)localObject2).htG = h.a(localMobileVerifyUI, this.vWn.getString(R.l.cZU), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2602615963648L, 19391);
          at.wS().c(localObject1);
          at.wS().b(132, g.this);
          GMTrace.o(2602615963648L, 19391);
        }
      });
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 0;
    GMTrace.i(2607850455040L, 19430);
    w.i("MicroMsg.MobileVerifyQQRegLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.vWn.htG != null)
    {
      this.vWn.htG.dismiss();
      this.vWn.htG = null;
    }
    if (paramk.getType() == 132)
    {
      at.wS().b(132, this);
      if ((((t)paramk).CD() == 2) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        at.unhold();
        paramInt1 = i;
        if (com.tencent.mm.pluginsdk.a.dE(this.vWn).size() != 0) {
          paramInt1 = 1;
        }
        if ((this.vWr != null) && (this.vWr.contains("1")) && (paramInt1 != 0))
        {
          com.tencent.mm.plugin.c.b.nz("R300_300_QQ");
          paramString = new Intent(this.vWn, FindMContactAddUI.class);
          paramString.addFlags(67108864);
          paramString.putExtra("regsetinfo_ticket", this.jQv);
          paramString.putExtra("regsetinfo_NextStep", this.vWr);
          paramString.putExtra("regsetinfo_NextStyle", this.vWs);
          paramString.putExtra("login_type", 1);
          paramk = com.tencent.mm.plugin.c.a.hnH.ao(this.vWn);
          paramk.addFlags(67108864);
          MMWizardActivity.b(this.vWn, paramString, paramk);
          this.vWn.finish();
          GMTrace.o(2607850455040L, 19430);
          return;
        }
        paramString = com.tencent.mm.plugin.c.a.hnH.ao(this.vWn);
        paramString.addFlags(67108864);
        this.vWn.startActivity(paramString);
        this.vWn.vWO = 4;
        this.vWn.finish();
        GMTrace.o(2607850455040L, 19430);
        return;
      }
      GMTrace.o(2607850455040L, 19430);
      return;
    }
    if (this.vWn.q(paramInt1, paramInt2, paramString))
    {
      GMTrace.o(2607850455040L, 19430);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      Toast.makeText(this.vWn, this.vWn.getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
    GMTrace.o(2607850455040L, 19430);
  }
  
  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    GMTrace.i(2607313584128L, 19426);
    this.vWn = paramMobileVerifyUI;
    this.jQv = paramMobileVerifyUI.getIntent().getStringExtra("regsetinfo_ticket");
    this.vWr = paramMobileVerifyUI.getIntent().getStringExtra("regsetinfo_NextStep");
    this.vWs = paramMobileVerifyUI.getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    GMTrace.o(2607313584128L, 19426);
  }
  
  public final void start()
  {
    GMTrace.i(2607447801856L, 19427);
    GMTrace.o(2607447801856L, 19427);
  }
  
  public final void stop()
  {
    GMTrace.i(2607582019584L, 19428);
    GMTrace.o(2607582019584L, 19428);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\mobile\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */