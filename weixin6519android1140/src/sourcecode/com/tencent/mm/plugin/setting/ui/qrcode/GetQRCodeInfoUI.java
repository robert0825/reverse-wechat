package com.tencent.mm.plugin.setting.ui.qrcode;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.setting.a;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;

public class GetQRCodeInfoUI
  extends MMBaseActivity
  implements com.tencent.mm.ad.e
{
  private ProgressDialog htG;
  private ab oGn;
  
  public GetQRCodeInfoUI()
  {
    GMTrace.i(4725537767424L, 35208);
    this.htG = null;
    GMTrace.o(4725537767424L, 35208);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4726074638336L, 35212);
    w.i("MicroMsg.GetQRCodeInfoUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 == 4) && (paramInt2 == 63532))
    {
      com.tencent.mm.ui.base.h.a(this, R.l.dOU, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4728087904256L, 35227);
          GetQRCodeInfoUI.this.finish();
          GMTrace.o(4728087904256L, 35227);
        }
      });
      GMTrace.o(4726074638336L, 35212);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dxd, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), getString(R.l.cUG), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4731846000640L, 35255);
          GetQRCodeInfoUI.this.finish();
          GMTrace.o(4731846000640L, 35255);
        }
      });
      GMTrace.o(4726074638336L, 35212);
      return;
    }
    paramString = ((ab)paramk).LK();
    paramk = com.tencent.mm.platformtools.n.a(paramString.ufy);
    com.tencent.mm.ac.n.Dh().f(paramk, com.tencent.mm.platformtools.n.a(paramString.tQa));
    Intent localIntent = new Intent();
    ((i)com.tencent.mm.kernel.h.h(i.class)).a(localIntent, paramString, 30);
    if (bg.nl(paramk).length() > 0)
    {
      if ((paramString.uAv & 0x8) > 0) {
        g.ork.A(10298, paramk + ",30");
      }
      com.tencent.mm.bj.d.b(this, "profile", ".ui.ContactInfoUI", 1);
    }
    GMTrace.o(4726074638336L, 35212);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4726208856064L, 35213);
    a.hnH.s(new Intent(), this);
    finish();
    GMTrace.o(4726208856064L, 35213);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4725671985152L, 35209);
    super.onCreate(paramBundle);
    setContentView(R.i.empty);
    Object localObject = getIntent().getData();
    if (localObject == null)
    {
      finish();
      GMTrace.o(4725671985152L, 35209);
      return;
    }
    paramBundle = bg.nl(((Uri)localObject).getHost());
    localObject = bg.nl(((Uri)localObject).getScheme());
    if ((("http".equals(localObject)) && ("weixin.qq.com".equals(paramBundle))) || (("weixin".equals(localObject)) && ("qr".equals(paramBundle))))
    {
      at.wS().a(new bf(new bf.a()
      {
        public final void a(com.tencent.mm.network.e paramAnonymouse)
        {
          GMTrace.i(4731174912000L, 35250);
          if (paramAnonymouse == null)
          {
            GetQRCodeInfoUI.this.finish();
            GMTrace.o(4731174912000L, 35250);
            return;
          }
          if ((at.AU()) && (!at.wF()))
          {
            GetQRCodeInfoUI.a(GetQRCodeInfoUI.this, GetQRCodeInfoUI.this.getIntent().getDataString());
            GMTrace.o(4731174912000L, 35250);
            return;
          }
          a.hnH.s(new Intent(), GetQRCodeInfoUI.this);
          GetQRCodeInfoUI.this.finish();
          GMTrace.o(4731174912000L, 35250);
        }
      }), 0);
      GMTrace.o(4725671985152L, 35209);
      return;
    }
    finish();
    GMTrace.o(4725671985152L, 35209);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4725940420608L, 35211);
    super.onDestroy();
    if (this.oGn != null) {
      at.wS().c(this.oGn);
    }
    at.wS().b(106, this);
    GMTrace.o(4725940420608L, 35211);
  }
  
  public void onResume()
  {
    GMTrace.i(4725806202880L, 35210);
    super.onResume();
    getString(R.l.cUG);
    this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.cRh), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(4730906476544L, 35248);
        GetQRCodeInfoUI.this.finish();
        GMTrace.o(4730906476544L, 35248);
      }
    });
    GMTrace.o(4725806202880L, 35210);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\qrcode\GetQRCodeInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */