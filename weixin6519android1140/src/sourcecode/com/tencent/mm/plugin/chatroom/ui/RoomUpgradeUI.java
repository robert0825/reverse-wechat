package com.tencent.mm.plugin.chatroom.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class RoomUpgradeUI
  extends MMActivity
  implements e
{
  private String chatroomName;
  private ProgressDialog htG;
  private com.tencent.mm.storage.q jNF;
  private int jNc;
  private int jNd;
  private View jPV;
  private ImageView jPW;
  private TextView jPX;
  private TextView jPY;
  private TextView jPZ;
  private TextView jQd;
  private View jQe;
  private TextView jQf;
  private com.tencent.mm.plugin.chatroom.d.h jQg;
  private String jQh;
  private boolean jQi;
  private boolean jQj;
  private int status;
  
  public RoomUpgradeUI()
  {
    GMTrace.i(9093787942912L, 67754);
    this.htG = null;
    GMTrace.o(9093787942912L, 67754);
  }
  
  private void PY()
  {
    boolean bool = true;
    GMTrace.i(9094324813824L, 67758);
    this.chatroomName = getIntent().getStringExtra("room_name");
    w.i("MicroMsg.RoomUpgradeProductsUI", "the roomName is %s", new Object[] { this.chatroomName });
    at.wS().a(519, this);
    at.AR();
    this.jNF = c.yT().gC(this.chatroomName);
    if (this.jNF == null)
    {
      finish();
      GMTrace.o(9094324813824L, 67758);
      return;
    }
    this.jQi = com.tencent.mm.y.q.zE().equals(this.jNF.field_roomowner);
    if (!v.bPH()) {}
    for (;;)
    {
      this.jQj = bool;
      GMTrace.o(9094324813824L, 67758);
      return;
      bool = false;
    }
  }
  
  private void anK()
  {
    GMTrace.i(9094190596096L, 67757);
    Intent localIntent = new Intent(this, RoomAlphaProcessUI.class);
    localIntent.addFlags(67108864);
    localIntent.addFlags(65536);
    localIntent.putExtra("RoomInfo_Id", this.chatroomName);
    startActivity(localIntent);
    GMTrace.o(9094190596096L, 67757);
  }
  
  private void anL()
  {
    GMTrace.i(9094995902464L, 67763);
    final String str = this.jNF.field_roomowner;
    at.AR();
    x localx = c.yK().TE(str);
    if ((localx != null) && ((int)localx.fTq <= 0)) {
      ak.a.gmX.a(str, this.chatroomName, new ak.b.a()
      {
        public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
        {
          GMTrace.i(9087613927424L, 67708);
          if (paramAnonymousBoolean) {
            RoomUpgradeUI.g(RoomUpgradeUI.this).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(9111907336192L, 67889);
                RoomUpgradeUI.b(RoomUpgradeUI.this, RoomUpgradeUI.4.this.jQb);
                GMTrace.o(9111907336192L, 67889);
              }
            });
          }
          GMTrace.o(9087613927424L, 67708);
        }
      });
    }
    for (;;)
    {
      int i = this.jNF.bSs();
      this.jPY.setVisibility(0);
      if (i > 40) {
        break;
      }
      this.jPY.setText(getString(R.l.dUa, new Object[] { getString(R.l.dTU) }));
      GMTrace.o(9094995902464L, 67763);
      return;
      uS(str);
    }
    this.jPY.setText(getString(R.l.dUa, new Object[] { getString(R.l.dTT) }));
    GMTrace.o(9094995902464L, 67763);
  }
  
  private void uS(String paramString)
  {
    Object localObject2 = null;
    GMTrace.i(9095130120192L, 67764);
    at.AR();
    x localx = c.yK().TE(paramString);
    if ((localx != null) && ((int)localx.fTq > 0)) {}
    for (Object localObject1 = localx.field_conRemark;; localObject1 = null)
    {
      if (bg.nm((String)localObject1)) {
        if (this.jNF == null) {
          localObject1 = localObject2;
        }
      }
      for (;;)
      {
        localObject2 = localObject1;
        if (bg.nm((String)localObject1))
        {
          localObject2 = localObject1;
          if (localx != null)
          {
            localObject2 = localObject1;
            if ((int)localx.fTq > 0) {
              localObject2 = localx.vj();
            }
          }
        }
        localObject1 = localObject2;
        if (bg.nm((String)localObject2)) {
          localObject1 = paramString;
        }
        a.b.a(this.jPW, paramString);
        this.jPX.setVisibility(0);
        this.jPX.setText(com.tencent.mm.pluginsdk.ui.d.h.c(this, (CharSequence)localObject1, (int)this.jPX.getTextSize()));
        GMTrace.o(9095130120192L, 67764);
        return;
        localObject1 = this.jNF.fs(paramString);
      }
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(9094459031552L, 67759);
    oM(R.l.dTS);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9153380614144L, 68198);
        RoomUpgradeUI.this.finish();
        GMTrace.o(9153380614144L, 68198);
        return true;
      }
    });
    this.jPV = findViewById(R.h.cjv);
    this.jQe = findViewById(R.h.cjx);
    this.jPW = ((ImageView)findViewById(R.h.cju));
    this.jPX = ((TextView)findViewById(R.h.cjw));
    this.jPY = ((TextView)findViewById(R.h.cjs));
    this.jPZ = ((TextView)findViewById(R.h.cjt));
    this.jQf = ((TextView)findViewById(R.h.cjr));
    this.jQf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9097411821568L, 67781);
        switch (RoomUpgradeUI.a(RoomUpgradeUI.this))
        {
        }
        for (;;)
        {
          GMTrace.o(9097411821568L, 67781);
          return;
          if (RoomUpgradeUI.b(RoomUpgradeUI.this))
          {
            a.a(RoomUpgradeUI.this, RoomUpgradeUI.c(RoomUpgradeUI.this), true);
            GMTrace.o(9097411821568L, 67781);
            return;
          }
          RoomUpgradeUI.a(RoomUpgradeUI.this, true);
          GMTrace.o(9097411821568L, 67781);
          return;
          if (RoomUpgradeUI.b(RoomUpgradeUI.this))
          {
            RoomUpgradeUI.d(RoomUpgradeUI.this);
            GMTrace.o(9097411821568L, 67781);
            return;
          }
          RoomUpgradeUI.a(RoomUpgradeUI.this, false);
        }
      }
    });
    this.jQd = ((TextView)findViewById(R.h.bGl));
    this.jQd.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9156870275072L, 68224);
        if (RoomUpgradeUI.e(RoomUpgradeUI.this).getVisibility() == 0)
        {
          paramAnonymousView = new Intent();
          RoomUpgradeUI.a(RoomUpgradeUI.this, RoomUpgradeUI.this.getString(R.l.deR, new Object[] { v.bPK() }));
          paramAnonymousView.putExtra("rawUrl", RoomUpgradeUI.f(RoomUpgradeUI.this));
          paramAnonymousView.putExtra("geta8key_username", com.tencent.mm.y.q.zE());
          paramAnonymousView.putExtra("showShare", false);
          d.b(RoomUpgradeUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymousView, 500);
        }
        GMTrace.o(9156870275072L, 68224);
      }
    });
    if (this.jQi)
    {
      this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.bKJ), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(9086405967872L, 67699);
          if (RoomUpgradeUI.h(RoomUpgradeUI.this) != null)
          {
            at.wS().c(RoomUpgradeUI.h(RoomUpgradeUI.this));
            RoomUpgradeUI.i(RoomUpgradeUI.this);
          }
          RoomUpgradeUI.this.finish();
          GMTrace.o(9086405967872L, 67699);
        }
      });
      this.jQg = new com.tencent.mm.plugin.chatroom.d.h(this.chatroomName);
      at.wS().a(this.jQg, 0);
    }
    for (;;)
    {
      if (this.jQj) {
        this.jQd.setVisibility(8);
      }
      GMTrace.o(9094459031552L, 67759);
      return;
      anL();
      if (!this.jQj) {
        this.jQd.setVisibility(0);
      }
      this.jQd.setText(R.l.dTV);
      this.jQf.setVisibility(8);
      this.jPZ.setVisibility(8);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9095532773376L, 67767);
    w.d("MicroMsg.RoomUpgradeProductsUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.htG != null) {
      this.htG.dismiss();
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dTX), getString(R.l.cUG), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9114725908480L, 67910);
          RoomUpgradeUI.this.finish();
          GMTrace.o(9114725908480L, 67910);
        }
      });
      GMTrace.o(9095532773376L, 67767);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramk.getType() == 519))
    {
      paramString = (com.tencent.mm.plugin.chatroom.d.h)paramk;
      this.status = paramString.status;
      this.jNc = paramString.jNc;
      this.jNd = paramString.jNd;
      anL();
      this.jPZ.setVisibility(0);
      this.jQf.setText(getString(R.l.dTR));
      if (this.jNd <= 0) {
        break label294;
      }
      this.jPZ.setText(getString(R.l.dTY, new Object[] { Integer.valueOf(this.jNd) }));
      if (!this.jQj) {
        this.jQd.setVisibility(0);
      }
      switch (this.status)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(9095532773376L, 67767);
      return;
      label294:
      this.jPZ.setText(getString(R.l.dTZ));
      break;
      this.jQf.setVisibility(0);
      this.jQd.setText(R.l.dTW);
      GMTrace.o(9095532773376L, 67767);
      return;
      this.jQf.setVisibility(0);
      this.jQf.setEnabled(false);
      this.jQd.setText(R.l.dTW);
      GMTrace.o(9095532773376L, 67767);
      return;
      this.jQf.setVisibility(8);
      this.jQd.setText(R.l.dTV);
      this.jQf.setEnabled(false);
    }
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(9095264337920L, 67765);
    int i = R.i.crO;
    GMTrace.o(9095264337920L, 67765);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9095398555648L, 67766);
    w.d("MicroMsg.RoomUpgradeProductsUI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    switch (paramInt1)
    {
    default: 
      w.e("MicroMsg.RoomUpgradeProductsUI", "onActivityResult unknow request");
      GMTrace.o(9095398555648L, 67766);
      return;
    }
    finish();
    GMTrace.o(9095398555648L, 67766);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9093922160640L, 67755);
    super.onCreate(paramBundle);
    PY();
    MP();
    GMTrace.o(9093922160640L, 67755);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9094861684736L, 67762);
    at.wS().c(this.jQg);
    at.wS().b(519, this);
    if (this.htG != null) {
      this.htG.dismiss();
    }
    super.onDestroy();
    GMTrace.o(9094861684736L, 67762);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(9094056378368L, 67756);
    boolean bool;
    if (paramIntent.hasExtra("upgrade_success"))
    {
      bool = paramIntent.getBooleanExtra("upgrade_success", false);
      if (!bool) {
        break label195;
      }
      PY();
      int i = paramIntent.getIntExtra("left_quota", 0);
      anL();
      this.jQf.setVisibility(8);
      this.jNd = i;
      if (this.jNd <= 0) {
        break label178;
      }
      this.jPZ.setText(getString(R.l.dTY, new Object[] { Integer.valueOf(this.jNd) }));
    }
    for (;;)
    {
      if (!this.jQj) {
        this.jQd.setVisibility(0);
      }
      this.jQd.setText(R.l.dTV);
      GMTrace.o(9094056378368L, 67756);
      return;
      if ((paramIntent.hasExtra("wizard_activity_result_code")) && (paramIntent.getIntExtra("wizard_activity_result_code", -1) == -1)) {
        anK();
      }
      if (paramIntent.hasExtra("announce_ok")) {
        anK();
      }
      bool = false;
      break;
      label178:
      this.jPZ.setText(getString(R.l.dTZ));
    }
    label195:
    GMTrace.o(9094056378368L, 67756);
  }
  
  public void onPause()
  {
    GMTrace.i(9094727467008L, 67761);
    super.onPause();
    GMTrace.o(9094727467008L, 67761);
  }
  
  public void onResume()
  {
    GMTrace.i(9094593249280L, 67760);
    super.onResume();
    GMTrace.o(9094593249280L, 67760);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\RoomUpgradeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */