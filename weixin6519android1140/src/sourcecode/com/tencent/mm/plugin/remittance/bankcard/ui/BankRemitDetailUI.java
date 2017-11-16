package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.remittance.bankcard.a.l;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.awc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.c.g;
import com.tencent.mm.wallet_core.c.g.a;

@a(19)
public class BankRemitDetailUI
  extends BankRemitBaseUI
{
  private int ipN;
  private TextView jXT;
  private TextView mOF;
  private int mState;
  private TextView oeS;
  private TextView okA;
  private TextView okB;
  private TextView okC;
  private TextView okD;
  private TextView okE;
  private TextView okF;
  private TextView okG;
  private TextView okH;
  private View okI;
  private View okJ;
  private Button okK;
  private ViewGroup okL;
  private String okM;
  private ImageView okt;
  private ImageView oku;
  private ImageView okv;
  private TextView okw;
  private TextView okx;
  private TextView oky;
  private TextView okz;
  
  public BankRemitDetailUI()
  {
    GMTrace.i(20932731076608L, 155961);
    GMTrace.o(20932731076608L, 155961);
  }
  
  public final void MP()
  {
    GMTrace.i(20932999512064L, 155963);
    this.okt = ((ImageView)findViewById(a.f.srB));
    this.oku = ((ImageView)findViewById(a.f.srC));
    this.okv = ((ImageView)findViewById(a.f.srD));
    this.okw = ((TextView)findViewById(a.f.srG));
    this.okx = ((TextView)findViewById(a.f.srH));
    this.oky = ((TextView)findViewById(a.f.srI));
    this.okz = ((TextView)findViewById(a.f.sry));
    this.okA = ((TextView)findViewById(a.f.srz));
    this.okB = ((TextView)findViewById(a.f.srA));
    this.okI = findViewById(a.f.srE);
    this.okJ = findViewById(a.f.srF);
    this.okC = ((TextView)findViewById(a.f.srq));
    this.okD = ((TextView)findViewById(a.f.srn));
    this.okE = ((TextView)findViewById(a.f.sru));
    this.okF = ((TextView)findViewById(a.f.srs));
    this.jXT = ((TextView)findViewById(a.f.srl));
    this.mOF = ((TextView)findViewById(a.f.srK));
    this.okG = ((TextView)findViewById(a.f.srh));
    this.okH = ((TextView)findViewById(a.f.srm));
    this.oeS = ((TextView)findViewById(a.f.srw));
    this.okL = ((ViewGroup)findViewById(a.f.srx));
    this.okK = ((Button)findViewById(a.f.sro));
    this.okK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20942931623936L, 156037);
        w.i("MicroMsg.BankRemitDetailUI", "click finish btn");
        BankRemitDetailUI.this.finish();
        GMTrace.o(20942931623936L, 156037);
      }
    });
    GMTrace.o(20932999512064L, 155963);
  }
  
  protected final void aoI()
  {
    GMTrace.i(20933133729792L, 155964);
    cN().cO().setBackgroundDrawable(new ColorDrawable(getResources().getColor(a.c.white)));
    Object localObject = cN().cO().getCustomView();
    if (localObject != null)
    {
      View localView = ((View)localObject).findViewById(a.f.divider);
      if (localView != null) {
        localView.setBackgroundColor(getResources().getColor(a.c.aNX));
      }
      localObject = ((View)localObject).findViewById(16908308);
      if ((localObject != null) && ((localObject instanceof TextView))) {
        ((TextView)localObject).setTextColor(getResources().getColor(a.c.black));
      }
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = getWindow();
      ((Window)localObject).addFlags(Integer.MIN_VALUE);
      ((Window)localObject).setStatusBarColor(getResources().getColor(a.c.white));
    }
    BankRemitBaseUI.H(this);
    this.vKB.hqF.setFitsSystemWindows(true);
    GMTrace.o(20933133729792L, 155964);
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(20933267947520L, 155965);
    if ((paramk instanceof l))
    {
      paramString = (l)paramk;
      paramString.a(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20940515704832L, 156019);
          w.i("MicroMsg.BankRemitDetailUI", "state: %s, amount: %s, fee: %s, account: %s", new Object[] { Integer.valueOf(paramString.ojh.state), Integer.valueOf(paramString.ojh.mFu), Integer.valueOf(paramString.ojh.uLy), paramString.ojh.uLz });
          BankRemitDetailUI.a(BankRemitDetailUI.this, paramString.ojh.state);
          BankRemitDetailUI.a(BankRemitDetailUI.this, paramString.ojh.state, paramString.ojh.uLx);
          BankRemitDetailUI.a(BankRemitDetailUI.this, paramString.ojh);
          BankRemitDetailUI.a(BankRemitDetailUI.this).setVisibility(0);
          GMTrace.o(20940515704832L, 156019);
        }
      }).b(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20922396311552L, 155884);
          w.e("MicroMsg.BankRemitDetailUI", "detail reponse error: %s, %s", new Object[] { Integer.valueOf(paramString.ojh.jWs), paramString.ojh.jWt });
          if (!bg.nm(paramString.ojh.jWt))
          {
            Toast.makeText(BankRemitDetailUI.this, paramString.ojh.jWt, 1).show();
            GMTrace.o(20922396311552L, 155884);
            return;
          }
          Toast.makeText(BankRemitDetailUI.this, a.i.sRJ, 1).show();
          GMTrace.o(20922396311552L, 155884);
        }
      }).c(new g.a()
      {
        public final void i(k paramAnonymousk)
        {
          GMTrace.i(20907766579200L, 155775);
          w.e("MicroMsg.BankRemitDetailUI", "net error: %s", new Object[] { paramAnonymousk });
          Toast.makeText(BankRemitDetailUI.this, a.i.sRJ, 1).show();
          GMTrace.o(20907766579200L, 155775);
        }
      });
    }
    GMTrace.o(20933267947520L, 155965);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20933402165248L, 155966);
    int i = a.g.sLC;
    GMTrace.o(20933402165248L, 155966);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20932865294336L, 155962);
    super.onCreate(paramBundle);
    hN(1579);
    this.okM = getIntent().getStringExtra("key_transfer_bill_id");
    this.ipN = getIntent().getIntExtra("key_enter_scene", 0);
    w.i("MicroMsg.BankRemitDetailUI", "billId: %s, enterScene: %s", new Object[] { this.okM, Integer.valueOf(this.ipN) });
    MP();
    w.i("MicroMsg.BankRemitDetailUI", "do query detail");
    l(new l(this.okM));
    if (this.ipN == 0)
    {
      ld(false);
      le(false);
      oM(a.i.sRP);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(20923738488832L, 155894);
          w.i("MicroMsg.BankRemitDetailUI", "back press");
          BankRemitDetailUI.this.finish();
          GMTrace.o(20923738488832L, 155894);
          return false;
        }
      });
      GMTrace.o(20932865294336L, 155962);
      return;
      ld(true);
      le(true);
      oM(a.i.sRO);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(20933536382976L, 155967);
    super.onDestroy();
    hO(1579);
    GMTrace.o(20933536382976L, 155967);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\ui\BankRemitDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */