package com.tencent.mm.plugin.wallet.bind.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wxpay.a.b;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.List;

public class WalletBankcardDetailUI
  extends WalletBaseUI
{
  public Bankcard qUE;
  protected TextView qWu;
  private TextView qWv;
  private View qWw;
  protected LinearLayout qWx;
  protected LinearLayout qWy;
  protected LinearLayout qWz;
  
  public WalletBankcardDetailUI()
  {
    GMTrace.i(7693225951232L, 57319);
    GMTrace.o(7693225951232L, 57319);
  }
  
  private void iJ(boolean paramBoolean)
  {
    GMTrace.i(7694299693056L, 57327);
    if ((!q.zR()) && (!paramBoolean) && (!((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).bAr()))
    {
      e.EQ(0);
      com.tencent.mm.ui.base.h.a(this, a.i.sZR, -1, a.i.sZQ, a.i.sZS, true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7692823298048L, 57316);
          ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).h(WalletBankcardDetailUI.this, 1);
          e.EQ(1);
          GMTrace.o(7692823298048L, 57316);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(7677925130240L, 57205);
          WalletBankcardDetailUI.b(WalletBankcardDetailUI.this);
          e.EQ(2);
          GMTrace.o(7677925130240L, 57205);
        }
      });
      GMTrace.o(7694299693056L, 57327);
      return;
    }
    this.ui.putBoolean("offline_pay", false);
    com.tencent.mm.wallet_core.a.i(this, this.ui);
    GMTrace.o(7694299693056L, 57327);
  }
  
  protected final void MP()
  {
    GMTrace.i(7693897039872L, 57324);
    this.qUE = ((Bankcard)this.ui.getParcelable("key_bankcard"));
    if (this.qUE == null)
    {
      GMTrace.o(7693897039872L, 57324);
      return;
    }
    this.qWx = ((LinearLayout)findViewById(a.f.sIu));
    this.qWy = ((LinearLayout)findViewById(a.f.sIB));
    this.qWz = ((LinearLayout)findViewById(a.f.sIz));
    this.qWv = ((TextView)findViewById(a.f.sIx));
    this.qWw = findViewById(a.f.sIG);
    this.qWw.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7681683226624L, 57233);
        e.m(WalletBankcardDetailUI.this, WalletBankcardDetailUI.this.qUE.field_repay_url, false);
        GMTrace.o(7681683226624L, 57233);
      }
    });
    if (1 == this.qUE.field_bankcardState)
    {
      bwT();
      GMTrace.o(7693897039872L, 57324);
      return;
    }
    String str;
    if (this.qUE.byg())
    {
      iI(true);
      this.qWu = ((TextView)findViewById(a.f.sIt));
      com.tencent.mm.plugin.wallet.a.p.bxd();
      com.tencent.mm.plugin.wallet.a.p.bxe();
      str = this.qUE.field_bindSerial;
      this.qWu.setVisibility(8);
    }
    for (;;)
    {
      a(0, a.e.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7678462001152L, 57209);
          com.tencent.mm.plugin.wallet.a.p.bxd();
          paramAnonymousMenuItem = com.tencent.mm.plugin.wallet.a.p.bxe().bzc();
          if ((paramAnonymousMenuItem != null) && (paramAnonymousMenuItem.size() > 1))
          {
            com.tencent.mm.plugin.wallet.a.p.bxd();
            com.tencent.mm.plugin.wallet.a.p.bxe();
            paramAnonymousMenuItem = WalletBankcardDetailUI.this.qUE.field_bindSerial;
          }
          paramAnonymousMenuItem = new ArrayList();
          com.tencent.mm.ui.base.h.a(WalletBankcardDetailUI.this, null, (String[])paramAnonymousMenuItem.toArray(new String[paramAnonymousMenuItem.size()]), WalletBankcardDetailUI.this.getString(a.i.tce), false, new h.c()
          {
            public final void hQ(int paramAnonymous2Int)
            {
              GMTrace.i(7692554862592L, 57314);
              switch (paramAnonymous2Int)
              {
              }
              for (;;)
              {
                GMTrace.o(7692554862592L, 57314);
                return;
                WalletBankcardDetailUI.a(WalletBankcardDetailUI.this);
              }
            }
          });
          GMTrace.o(7678462001152L, 57209);
          return true;
        }
      });
      GMTrace.o(7693897039872L, 57324);
      return;
      iI(false);
      this.qWu = ((TextView)findViewById(a.f.sIy));
      com.tencent.mm.plugin.wallet.a.p.bxd();
      com.tencent.mm.plugin.wallet.a.p.bxe();
      str = this.qUE.field_bindSerial;
      this.qWu.setVisibility(8);
    }
  }
  
  public final void bwT()
  {
    GMTrace.i(7694165475328L, 57326);
    this.qWx.setVisibility(0);
    this.qWy.setVisibility(8);
    ((TextView)findViewById(a.f.sIv)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7682220097536L, 57237);
        WalletBankcardDetailUI.this.showDialog(0);
        GMTrace.o(7682220097536L, 57237);
      }
    });
    ((TextView)findViewById(a.f.sII)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7691481120768L, 57306);
        com.tencent.mm.wallet_core.a.i(WalletBankcardDetailUI.this, WalletBankcardDetailUI.this.ui);
        GMTrace.o(7691481120768L, 57306);
      }
    });
    GMTrace.o(7694165475328L, 57326);
  }
  
  public final boolean d(final int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7694568128512L, 57329);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof com.tencent.mm.plugin.wallet.bind.a.b)) {
        if (this.qWu != null) {
          this.qWu.setVisibility(0);
        }
      }
    }
    while (!(paramk instanceof com.tencent.mm.plugin.wallet.bind.a.a)) {
      for (;;)
      {
        GMTrace.o(7694568128512L, 57329);
        return false;
        if ((paramk instanceof com.tencent.mm.plugin.wallet.bind.a.a))
        {
          paramString = (com.tencent.mm.plugin.wallet.bind.a.a)paramk;
          w.e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo succ and level = " + paramString.qVW);
          switch (paramString.qVW)
          {
          default: 
            iJ(false);
            break;
          case 2: 
          case 3: 
            paramInt1 = paramString.qVW;
            com.tencent.mm.ui.base.h.a(this, paramString.qVX, null, false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(7678193565696L, 57207);
                if (paramInt1 == 2) {
                  WalletBankcardDetailUI.b(WalletBankcardDetailUI.this);
                }
                paramAnonymousDialogInterface.dismiss();
                GMTrace.o(7678193565696L, 57207);
              }
            });
          }
        }
      }
    }
    w.e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo error");
    iJ(false);
    GMTrace.o(7694568128512L, 57329);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7693360168960L, 57320);
    int i = a.g.sOS;
    GMTrace.o(7693360168960L, 57320);
    return i;
  }
  
  public final void iI(boolean paramBoolean)
  {
    GMTrace.i(7694031257600L, 57325);
    if (paramBoolean)
    {
      this.qWx.setVisibility(8);
      this.qWy.setVisibility(0);
      ((TextView)findViewById(a.f.sIs)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7681951662080L, 57235);
          WalletBankcardDetailUI.this.showDialog(0);
          GMTrace.o(7681951662080L, 57235);
        }
      });
      TextView localTextView1 = (TextView)findViewById(a.f.sIE);
      TextView localTextView2 = (TextView)findViewById(a.f.sIF);
      TextView localTextView3 = (TextView)findViewById(a.f.sIC);
      TextView localTextView4 = (TextView)findViewById(a.f.sID);
      localTextView1.setText(e.d(this.qUE.field_onceQuotaKind, null));
      localTextView2.setText(e.d(this.qUE.field_onceQuotaVirtual, null));
      localTextView3.setText(e.d(this.qUE.field_dayQuotaKind, null));
      localTextView4.setText(e.d(this.qUE.field_dayQuotaVirtual, null));
      if (!bg.nm(this.qUE.field_repay_url))
      {
        this.qWv.setVisibility(0);
        this.qWw.setVisibility(0);
      }
      GMTrace.o(7694031257600L, 57325);
      return;
    }
    this.qWx.setVisibility(8);
    this.qWy.setVisibility(8);
    this.qWz.setVisibility(0);
    GMTrace.o(7694031257600L, 57325);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7693494386688L, 57321);
    super.onCreate(paramBundle);
    hN(621);
    oM(a.i.sZP);
    MP();
    GMTrace.o(7693494386688L, 57321);
  }
  
  @Deprecated
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(7694433910784L, 57328);
    Dialog localDialog = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(a.i.sZN), getResources().getStringArray(a.b.slP), "", new h.c()
    {
      public final void hQ(int paramAnonymousInt)
      {
        GMTrace.i(7685843976192L, 57264);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(7685843976192L, 57264);
          return;
          Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + WalletBankcardDetailUI.this.getString(a.i.sZM)));
          localIntent.addFlags(268435456);
          WalletBankcardDetailUI.this.startActivity(localIntent);
        }
      }
    });
    GMTrace.o(7694433910784L, 57328);
    return localDialog;
  }
  
  public void onDestroy()
  {
    GMTrace.i(7693762822144L, 57323);
    hO(621);
    super.onDestroy();
    GMTrace.o(7693762822144L, 57323);
  }
  
  public void onResume()
  {
    GMTrace.i(7693628604416L, 57322);
    super.onResume();
    GMTrace.o(7693628604416L, 57322);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\bind\ui\WalletBankcardDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */