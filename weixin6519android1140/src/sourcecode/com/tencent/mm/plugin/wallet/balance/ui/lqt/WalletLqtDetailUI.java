package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.plugin.wallet.balance.a.a.h.a;
import com.tencent.mm.plugin.wallet.balance.a.a.h.b;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.aog;
import com.tencent.mm.protocal.c.avz;
import com.tencent.mm.protocal.c.ni;
import com.tencent.mm.protocal.c.qa;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;
import java.util.Iterator;
import java.util.LinkedList;

public class WalletLqtDetailUI
  extends WalletLqtBasePresenterUI
{
  private ae handler;
  private Dialog hqr;
  private com.tencent.mm.plugin.wallet.balance.a.a.g qUO;
  private com.tencent.mm.plugin.wallet.balance.a.a.h qUP;
  private avz qUQ;
  private ViewGroup qUR;
  private TextView qUS;
  private WalletTextView qUT;
  private TextView qUU;
  private TextView qUV;
  private TextView qUW;
  private WalletTextView qUX;
  private Button qUY;
  private Button qUZ;
  private LinearLayout qVa;
  private TextView qVb;
  private View qVc;
  private TextView qVd;
  private View qVe;
  private View qVf;
  private CdnImageView qVg;
  private TextView qVh;
  private TextView qVi;
  private boolean qVj;
  
  public WalletLqtDetailUI()
  {
    GMTrace.i(18406753435648L, 137141);
    this.qUO = ((com.tencent.mm.plugin.wallet.balance.a.a.g)p(com.tencent.mm.plugin.wallet.balance.a.a.g.class));
    this.qUP = ((com.tencent.mm.plugin.wallet.balance.a.a.h)m(com.tencent.mm.plugin.wallet.balance.a.a.h.class));
    this.qVj = true;
    this.handler = new ae(Looper.getMainLooper());
    GMTrace.o(18406753435648L, 137141);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18407156088832L, 137144);
    int i = a.g.sPz;
    GMTrace.o(18407156088832L, 137144);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(18407290306560L, 137145);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 123) && (paramInt2 == -1))
    {
      this.qVj = false;
      paramIntent = paramIntent.getStringExtra("lqt_enc_pwd");
      if (this.hqr != null) {
        break label114;
      }
      this.hqr = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
    }
    for (;;)
    {
      h.a locala = this.qUP.qTs;
      com.tencent.mm.vending.g.g.bY(paramIntent).a(locala).d(new com.tencent.mm.vending.c.a() {}).a(new d.a()
      {
        public final void aH(Object paramAnonymousObject)
        {
          GMTrace.i(18404874387456L, 137127);
          if (WalletLqtDetailUI.a(WalletLqtDetailUI.this) != null) {
            WalletLqtDetailUI.a(WalletLqtDetailUI.this).dismiss();
          }
          w.i("MicroMsg.WalletLqtDetailUI", "close account failed: %s", new Object[] { paramAnonymousObject });
          if (paramAnonymousObject != null) {
            if (!(paramAnonymousObject instanceof String)) {
              break label80;
            }
          }
          label80:
          for (paramAnonymousObject = paramAnonymousObject.toString();; paramAnonymousObject = WalletLqtDetailUI.this.getString(a.i.tcE))
          {
            Toast.makeText(WalletLqtDetailUI.this, (CharSequence)paramAnonymousObject, 1).show();
            GMTrace.o(18404874387456L, 137127);
            return;
          }
        }
      });
      GMTrace.o(18407290306560L, 137145);
      return;
      label114:
      this.hqr.show();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18406887653376L, 137142);
    super.onCreate(paramBundle);
    if (cN().cO() != null) {
      cN().cO().setBackgroundDrawable(getResources().getDrawable(a.c.smT));
    }
    if (com.tencent.mm.compatible.util.d.et(21)) {
      getWindow().setStatusBarColor(getResources().getColor(a.c.smT));
    }
    sq(getString(a.i.tcM));
    this.qUR = ((ViewGroup)findViewById(a.f.suE));
    this.qUS = ((TextView)findViewById(a.f.sxo));
    this.qUT = ((WalletTextView)findViewById(a.f.swX));
    this.qUU = ((TextView)findViewById(a.f.swY));
    this.qUV = ((TextView)findViewById(a.f.swZ));
    this.qUW = ((TextView)findViewById(a.f.sxh));
    this.qUX = ((WalletTextView)findViewById(a.f.sxi));
    this.qUY = ((Button)findViewById(a.f.sxl));
    this.qUZ = ((Button)findViewById(a.f.sxg));
    this.qVa = ((LinearLayout)findViewById(a.f.sxd));
    this.qVb = ((TextView)findViewById(a.f.sxf));
    this.qVc = findViewById(a.f.sxa);
    this.qVd = ((TextView)findViewById(a.f.sxb));
    this.qVf = findViewById(a.f.sxn);
    this.qVg = ((CdnImageView)findViewById(a.f.sHC));
    this.qVh = ((TextView)findViewById(a.f.sHD));
    this.qVi = ((TextView)findViewById(a.f.sHB));
    this.qVe = findViewById(a.f.sxm);
    this.qVb.setVisibility(4);
    GMTrace.o(18406887653376L, 137142);
  }
  
  public void onDestroy()
  {
    GMTrace.i(18407424524288L, 137146);
    super.onDestroy();
    this.qUO = null;
    this.qUP = null;
    GMTrace.o(18407424524288L, 137146);
  }
  
  public void onResume()
  {
    GMTrace.i(18407021871104L, 137143);
    super.onResume();
    if (this.qVj)
    {
      this.qUR.setVisibility(8);
      this.hqr = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
      h.b localb = this.qUP.qTr;
      com.tencent.mm.vending.g.g.ckp().a(localb).d(new com.tencent.mm.vending.c.a() {}).a(new d.a()
      {
        public final void aH(Object paramAnonymousObject)
        {
          GMTrace.i(18413330104320L, 137190);
          if (WalletLqtDetailUI.a(WalletLqtDetailUI.this) != null) {
            WalletLqtDetailUI.a(WalletLqtDetailUI.this).dismiss();
          }
          w.i("MicroMsg.WalletLqtDetailUI", "fetch detail failed: %s", new Object[] { paramAnonymousObject });
          if (paramAnonymousObject != null) {
            if (!(paramAnonymousObject instanceof String)) {
              break label80;
            }
          }
          label80:
          for (paramAnonymousObject = paramAnonymousObject.toString();; paramAnonymousObject = WalletLqtDetailUI.this.getString(a.i.tcE))
          {
            Toast.makeText(WalletLqtDetailUI.this, (CharSequence)paramAnonymousObject, 1).show();
            GMTrace.o(18413330104320L, 137190);
            return;
          }
        }
      });
    }
    this.qVj = true;
    GMTrace.o(18407021871104L, 137143);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\balance\ui\lqt\WalletLqtDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */