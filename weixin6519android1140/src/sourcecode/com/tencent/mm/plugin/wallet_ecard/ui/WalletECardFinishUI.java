package com.tencent.mm.plugin.wallet_ecard.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.a.lb;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.b;

@com.tencent.mm.ui.base.a(19)
public class WalletECardFinishUI
  extends WalletECardBaseUI
{
  private Button okK;
  
  public WalletECardFinishUI()
  {
    GMTrace.i(19585453522944L, 145923);
    GMTrace.o(19585453522944L, 145923);
  }
  
  protected final void MP()
  {
    GMTrace.i(19585721958400L, 145925);
    this.okK = ((Button)findViewById(a.f.svN));
    this.okK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19581829644288L, 145896);
        w.i("MicroMsg.WalletECardFinishUI", "click finish");
        paramAnonymousView = new lb();
        com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousView);
        paramAnonymousView = WalletECardFinishUI.this.cmp();
        if (paramAnonymousView != null)
        {
          Bundle localBundle = new Bundle();
          paramAnonymousView.b(WalletECardFinishUI.this.vKB.vKW, localBundle);
          GMTrace.o(19581829644288L, 145896);
          return;
        }
        w.w("MicroMsg.WalletECardFinishUI", "process is null");
        WalletECardFinishUI.this.finish();
        GMTrace.o(19581829644288L, 145896);
      }
    });
    GMTrace.o(19585721958400L, 145925);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(19585856176128L, 145926);
    GMTrace.o(19585856176128L, 145926);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19585990393856L, 145927);
    int i = a.g.sMp;
    GMTrace.o(19585990393856L, 145927);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19585587740672L, 145924);
    super.onCreate(paramBundle);
    oM(a.i.sTk);
    le(false);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(19581561208832L, 145894);
        w.i("MicroMsg.WalletECardFinishUI", "press back btn");
        WalletECardFinishUI.a(WalletECardFinishUI.this).performClick();
        GMTrace.o(19581561208832L, 145894);
        return false;
      }
    });
    ld(false);
    MP();
    GMTrace.o(19585587740672L, 145924);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet_ecard\ui\WalletECardFinishUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */