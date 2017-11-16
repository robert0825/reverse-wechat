package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c.e;
import com.tencent.mm.wallet_core.c.q;
import com.tencent.mm.wallet_core.c.r;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Iterator;
import java.util.Vector;

public class WalletDigitalCertUI
  extends WalletBaseUI
{
  private ImageView iDp;
  private Button jUq;
  private TextView okY;
  private Button raL;
  private LinearLayout raM;
  private TextView raN;
  
  public WalletDigitalCertUI()
  {
    GMTrace.i(7767045701632L, 57869);
    GMTrace.o(7767045701632L, 57869);
  }
  
  private void bxN()
  {
    GMTrace.i(7767448354816L, 57872);
    w.i("MicroMsg.WalletDigitalCertUI", "updateCrtState");
    this.raM.removeAllViews();
    if (r.clT().clU())
    {
      this.raL.setVisibility(8);
      this.jUq.setVisibility(0);
      this.okY.setText(a.i.tdR);
      this.iDp.setImageResource(a.e.spe);
    }
    for (;;)
    {
      localObject = r.clT().xDI;
      if (((Vector)localObject).size() != 0) {
        break;
      }
      this.raM.setVisibility(8);
      this.raN.setVisibility(8);
      GMTrace.o(7767448354816L, 57872);
      return;
      this.raL.setVisibility(0);
      this.jUq.setVisibility(8);
      this.okY.setText(a.i.tdM);
      this.iDp.setImageResource(a.e.spf);
    }
    this.raM.setVisibility(0);
    this.raN.setVisibility(0);
    Object localObject = ((Vector)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      q localq = (q)((Iterator)localObject).next();
      if (localq.xDC <= 0)
      {
        View localView = View.inflate(this, a.g.sPe, null);
        TextView localTextView1 = (TextView)localView.findViewById(a.f.ssV);
        TextView localTextView2 = (TextView)localView.findViewById(a.f.ssS);
        TextView localTextView3 = (TextView)localView.findViewById(a.f.suB);
        localTextView1.setText(localq.xDA);
        localTextView2.setText(localq.xDB);
        localTextView3.setTag(localq);
        localTextView3.setOnClickListener(new com.tencent.mm.wallet_core.ui.d()
        {
          public final void onClick(final View paramAnonymousView)
          {
            GMTrace.i(7759395291136L, 57812);
            if ((paramAnonymousView.getTag() instanceof q))
            {
              paramAnonymousView = (q)paramAnonymousView.getTag();
              com.tencent.mm.ui.base.h.a(WalletDigitalCertUI.this, WalletDigitalCertUI.this.getString(a.i.tdL, new Object[] { paramAnonymousView.xDA }), "", WalletDigitalCertUI.this.getString(a.i.cSt), WalletDigitalCertUI.this.getString(a.i.cSk), true, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(7755502977024L, 57783);
                  w.i("MicroMsg.WalletDigitalCertUI", "del crt %s", new Object[] { paramAnonymousView.uTW });
                  paramAnonymous2DialogInterface = new e(paramAnonymousView.uTW);
                  WalletDigitalCertUI.this.l(paramAnonymous2DialogInterface);
                  GMTrace.o(7755502977024L, 57783);
                }
              }, null);
            }
            GMTrace.o(7759395291136L, 57812);
          }
        });
        this.raM.addView(localView);
      }
    }
    if (this.raM.getChildCount() == 0)
    {
      this.raN.setVisibility(8);
      GMTrace.o(7767448354816L, 57872);
      return;
    }
    this.raN.setVisibility(0);
    GMTrace.o(7767448354816L, 57872);
  }
  
  public final void MP()
  {
    GMTrace.i(7767314137088L, 57871);
    oM(a.i.tdK);
    this.iDp = ((ImageView)findViewById(a.f.ssR));
    this.okY = ((TextView)findViewById(a.f.ssU));
    this.raL = ((Button)findViewById(a.f.swh));
    this.jUq = ((Button)findViewById(a.f.suA));
    this.raM = ((LinearLayout)findViewById(a.f.swj));
    this.raN = ((TextView)findViewById(a.f.swk));
    this.raL.setOnClickListener(new com.tencent.mm.wallet_core.ui.d()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7766374612992L, 57864);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(WalletDigitalCertUI.this, WalletIdCardCheckUI.class);
        WalletDigitalCertUI.this.startActivityForResult(paramAnonymousView, 1);
        GMTrace.o(7766374612992L, 57864);
      }
    });
    this.jUq.setOnClickListener(new com.tencent.mm.wallet_core.ui.d()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7758321549312L, 57804);
        r.clT();
        paramAnonymousView = new e(r.clS());
        WalletDigitalCertUI.this.l(paramAnonymousView);
        g.ork.i(13731, new Object[] { Integer.valueOf(10) });
        GMTrace.o(7758321549312L, 57804);
      }
    });
    a(new s()
    {
      public final void bxw()
      {
        GMTrace.i(7754295017472L, 57774);
        WalletDigitalCertUI.this.finish();
        GMTrace.o(7754295017472L, 57774);
      }
    });
    bxN();
    GMTrace.o(7767314137088L, 57871);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(7767985225728L, 57876);
    if (!(paramk instanceof com.tencent.mm.plugin.wallet.pwd.a.d))
    {
      if (!(paramk instanceof e)) {
        break label67;
      }
      if (paramInt2 != 0) {
        break label77;
      }
      g.ork.i(13731, new Object[] { Integer.valueOf(11) });
      r.clT().Xt(((e)paramk).xDe);
    }
    for (;;)
    {
      bxN();
      label67:
      GMTrace.o(7767985225728L, 57876);
      return false;
      label77:
      g.ork.i(13731, new Object[] { Integer.valueOf(12) });
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7768253661184L, 57878);
    int i = a.g.sPm;
    GMTrace.o(7768253661184L, 57878);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str = null;
    GMTrace.i(7768119443456L, 57877);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    if ((1 == paramInt1) && (paramInt2 == -1))
    {
      bool = ((com.tencent.mm.pluginsdk.k)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.k.class)).azt();
      paramIntent = ab.bPV();
      if (paramIntent == null) {
        break label123;
      }
      str = paramIntent.getString("cpu_id", null);
    }
    label123:
    for (paramIntent = paramIntent.getString("uid", null);; paramIntent = null)
    {
      w.i("MicroMsg.WalletDigitalCertUI", "alvinluo getSecurityInfo isOpenTouchPay: %b", new Object[] { Boolean.valueOf(bool) });
      b(new com.tencent.mm.plugin.wallet.pwd.a.d(bool, str, paramIntent), false);
      GMTrace.o(7768119443456L, 57877);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7767179919360L, 57870);
    super.onCreate(paramBundle);
    hN(1654);
    hN(1568);
    hN(1669);
    MP();
    g.ork.i(13731, new Object[] { Integer.valueOf(1) });
    GMTrace.o(7767179919360L, 57870);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7767851008000L, 57875);
    super.onDestroy();
    hO(1654);
    hO(1568);
    hO(1669);
    GMTrace.o(7767851008000L, 57875);
  }
  
  public void onPause()
  {
    GMTrace.i(7767716790272L, 57874);
    super.onPause();
    GMTrace.o(7767716790272L, 57874);
  }
  
  public void onResume()
  {
    GMTrace.i(7767582572544L, 57873);
    super.onResume();
    GMTrace.o(7767582572544L, 57873);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wallet\pwd\ui\WalletDigitalCertUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */