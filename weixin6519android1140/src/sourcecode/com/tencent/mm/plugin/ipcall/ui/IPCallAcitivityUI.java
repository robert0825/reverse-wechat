package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;

@com.tencent.mm.ui.base.a(3)
public class IPCallAcitivityUI
  extends MMActivity
{
  private FrameLayout mnJ;
  private TextView mnK;
  private TextView mnL;
  private Button mnM;
  private CdnImageView mnN;
  private boolean mnO;
  private com.tencent.mm.plugin.ipcall.a.g.a mnP;
  
  public IPCallAcitivityUI()
  {
    GMTrace.i(11676808118272L, 86999);
    this.mnO = false;
    GMTrace.o(11676808118272L, 86999);
  }
  
  protected final void MP()
  {
    GMTrace.i(11677479206912L, 87004);
    this.mnJ = ((FrameLayout)findViewById(R.h.bIo));
    this.mnK = ((TextView)findViewById(R.h.bIs));
    this.mnL = ((TextView)findViewById(R.h.bIp));
    this.mnM = ((Button)findViewById(R.h.bIq));
    this.mnN = ((CdnImageView)findViewById(R.h.bIr));
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(w.a.vsz, "");
    if (bg.nm(str))
    {
      w.e("MicroMsg.IPCallAcitivityUI", "xml is empty");
      finish();
    }
    for (;;)
    {
      this.mnJ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11698417172480L, 87160);
          IPCallAcitivityUI.this.finish();
          GMTrace.o(11698417172480L, 87160);
        }
      });
      this.mnM.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11632650485760L, 86670);
          if (IPCallAcitivityUI.a(IPCallAcitivityUI.this).jib == 1)
          {
            w.i("MicroMsg.IPCallAcitivityUI", "click activity, go to IPCallPackageUI");
            paramAnonymousView = new Intent();
            paramAnonymousView.setClass(IPCallAcitivityUI.this.vKB.vKW, IPCallShareCouponUI.class);
            IPCallAcitivityUI.this.startActivity(paramAnonymousView);
            paramAnonymousView = new Intent();
            paramAnonymousView.setClass(IPCallAcitivityUI.this.vKB.vKW, IPCallPackageUI.class);
            IPCallAcitivityUI.this.startActivity(paramAnonymousView);
          }
          IPCallAcitivityUI.b(IPCallAcitivityUI.this);
          IPCallAcitivityUI.this.finish();
          GMTrace.o(11632650485760L, 86670);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11730897862656L, 87402);
          IPCallAcitivityUI.this.finish();
          GMTrace.o(11730897862656L, 87402);
          return true;
        }
      });
      GMTrace.o(11677479206912L, 87004);
      return;
      this.mnP = com.tencent.mm.plugin.ipcall.a.g.a.Ai(str);
      if (this.mnP == null)
      {
        w.e("MicroMsg.IPCallAcitivityUI", "mMsgInfo is null");
        finish();
      }
      else
      {
        this.mnK.setText(this.mnP.eBt);
        this.mnL.setText(this.mnP.lPj);
        this.mnM.setText(this.mnP.mmN);
        this.mnN.setUrl(this.mnP.mmM);
      }
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(11676942336000L, 87000);
    GMTrace.o(11676942336000L, 87000);
    return 1;
  }
  
  public void finish()
  {
    GMTrace.i(11677613424640L, 87005);
    super.finish();
    overridePendingTransition(R.a.aLj, R.a.aLD);
    if (this.mnO)
    {
      com.tencent.mm.plugin.ipcall.a.e.c.pq(1);
      GMTrace.o(11677613424640L, 87005);
      return;
    }
    com.tencent.mm.plugin.ipcall.a.e.c.pq(0);
    GMTrace.o(11677613424640L, 87005);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11677076553728L, 87001);
    int i = R.i.cAm;
    GMTrace.o(11677076553728L, 87001);
    return i;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(11677747642368L, 87006);
    super.onBackPressed();
    GMTrace.o(11677747642368L, 87006);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11677210771456L, 87002);
    super.onCreate(paramBundle);
    getWindow().addFlags(131072);
    getWindow().setFlags(1024, 1024);
    this.vKB.bXF();
    MP();
    GMTrace.o(11677210771456L, 87002);
  }
  
  public void onDestroy()
  {
    GMTrace.i(11677344989184L, 87003);
    super.onDestroy();
    GMTrace.o(11677344989184L, 87003);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallAcitivityUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */