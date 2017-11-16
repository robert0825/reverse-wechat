package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;

public class WalletLqtSaveFetchFinishUI
  extends WalletBaseUI
{
  private Button njB;
  private TextView qVp;
  private WalletTextView qVq;
  private TextView qVr;
  private TextView qVs;
  
  public WalletLqtSaveFetchFinishUI()
  {
    GMTrace.i(18398834589696L, 137082);
    GMTrace.o(18398834589696L, 137082);
  }
  
  protected final int Qf()
  {
    GMTrace.i(18399371460608L, 137086);
    GMTrace.o(18399371460608L, 137086);
    return 1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(18399103025152L, 137084);
    GMTrace.o(18399103025152L, 137084);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18399237242880L, 137085);
    int i = a.g.sPA;
    GMTrace.o(18399237242880L, 137085);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18398968807424L, 137083);
    super.onCreate(paramBundle);
    this.qVp = ((TextView)findViewById(a.f.sHo));
    this.qVq = ((WalletTextView)findViewById(a.f.spR));
    this.njB = ((Button)findViewById(a.f.svO));
    this.qVr = ((TextView)findViewById(a.f.sEA));
    this.qVs = ((TextView)findViewById(a.f.sHY));
    int i = getIntent().getIntExtra("key_mode", 1);
    double d = getIntent().getDoubleExtra("key_amount", 0.0D);
    paramBundle = getIntent().getStringExtra("profile_date_wording");
    String str = getIntent().getStringExtra("profile_upgrade_wording");
    if (i == 1)
    {
      this.qVp.setText(getString(a.i.tcK));
      sq(getString(a.i.tcK));
    }
    for (;;)
    {
      this.qVq.setText(e.r(d));
      this.njB.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18401250508800L, 137100);
          WalletLqtSaveFetchFinishUI.this.finish();
          GMTrace.o(18401250508800L, 137100);
        }
      });
      if (!bg.nm(paramBundle))
      {
        this.qVr.setText(paramBundle);
        this.qVr.setVisibility(0);
      }
      if (!bg.nm(str))
      {
        this.qVs.setText(h.f(this, str, (int)this.qVs.getTextSize()));
        this.qVs.setClickable(true);
        this.qVs.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
        this.qVs.setVisibility(0);
      }
      GMTrace.o(18398968807424L, 137083);
      return;
      if (i == 2)
      {
        this.qVp.setText(getString(a.i.tcB));
        sq(getString(a.i.tcB));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\ui\lqt\WalletLqtSaveFetchFinishUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */