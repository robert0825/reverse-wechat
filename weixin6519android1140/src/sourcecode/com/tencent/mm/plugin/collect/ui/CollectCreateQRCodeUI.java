package com.tencent.mm.plugin.collect.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.collect.b.l;
import com.tencent.mm.plugin.collect.b.r;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.y.q;

public class CollectCreateQRCodeUI
  extends WalletBaseUI
{
  private String fLH;
  private WalletFormView jZE;
  private TextView jZF;
  
  public CollectCreateQRCodeUI()
  {
    GMTrace.i(5421590904832L, 40394);
    this.fLH = "";
    GMTrace.o(5421590904832L, 40394);
  }
  
  protected final void MP()
  {
    GMTrace.i(5421859340288L, 40396);
    oM(a.i.sSE);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5436354854912L, 40504);
        CollectCreateQRCodeUI.this.setResult(0);
        CollectCreateQRCodeUI.this.finish();
        GMTrace.o(5436354854912L, 40504);
        return true;
      }
    });
    this.jZE = ((WalletFormView)findViewById(a.f.sCz));
    com.tencent.mm.wallet_core.ui.formview.a.e(this.jZE);
    String str = getIntent().getStringExtra("key_currency_unit");
    if (!bg.nm(str)) {
      this.jZE.izE.setText(str);
    }
    for (;;)
    {
      this.jZE.a(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(5411658792960L, 40320);
          if (paramAnonymousEditable.toString().startsWith(".")) {
            paramAnonymousEditable.insert(0, "0");
          }
          String str = paramAnonymousEditable.toString();
          int i = str.indexOf(".");
          int j = str.length();
          if ((i >= 0) && (j - i > 2)) {
            paramAnonymousEditable.delete(i + 3, j);
          }
          GMTrace.o(5411658792960L, 40320);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(5411390357504L, 40318);
          GMTrace.o(5411390357504L, 40318);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(5411524575232L, 40319);
          GMTrace.o(5411524575232L, 40319);
        }
      });
      e(this.jZE, 2, false);
      ((Button)findViewById(a.f.bQR)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5416759066624L, 40358);
          double d = bg.getDouble(CollectCreateQRCodeUI.a(CollectCreateQRCodeUI.this).getText(), 0.0D);
          com.tencent.mm.kernel.h.xz();
          int i = ((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vut, Integer.valueOf(0))).intValue();
          w.i("MicroMsg.CollectCreateQRCodeUI", "wallet region: %s", new Object[] { Integer.valueOf(i) });
          if (!CollectCreateQRCodeUI.a(CollectCreateQRCodeUI.this).QW())
          {
            u.makeText(CollectCreateQRCodeUI.this.vKB.vKW, a.i.sZH, 0).show();
            GMTrace.o(5416759066624L, 40358);
            return;
          }
          if (d < 0.01D)
          {
            u.makeText(CollectCreateQRCodeUI.this.vKB.vKW, a.i.sXj, 0).show();
            GMTrace.o(5416759066624L, 40358);
            return;
          }
          if (i == 8)
          {
            CollectCreateQRCodeUI.this.r(new l(Math.round(d * 100.0D), CollectCreateQRCodeUI.b(CollectCreateQRCodeUI.this), q.zL()));
            GMTrace.o(5416759066624L, 40358);
            return;
          }
          CollectCreateQRCodeUI.this.l(new r(d, "1", CollectCreateQRCodeUI.b(CollectCreateQRCodeUI.this)));
          GMTrace.o(5416759066624L, 40358);
        }
      });
      this.jZF = ((TextView)findViewById(a.f.stH));
      this.jZF.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5419174985728L, 40376);
          CollectCreateQRCodeUI.c(CollectCreateQRCodeUI.this);
          com.tencent.mm.plugin.wallet_core.ui.view.a.a(CollectCreateQRCodeUI.this, CollectCreateQRCodeUI.this.getString(a.i.sSF), CollectCreateQRCodeUI.b(CollectCreateQRCodeUI.this), "", 32, new h.b()new DialogInterface.OnClickListener
          {
            public final boolean v(CharSequence paramAnonymous2CharSequence)
            {
              GMTrace.i(5403068858368L, 40256);
              if (!bg.nm(paramAnonymous2CharSequence.toString()))
              {
                CollectCreateQRCodeUI.a(CollectCreateQRCodeUI.this, paramAnonymous2CharSequence.toString());
                CollectCreateQRCodeUI.d(CollectCreateQRCodeUI.this);
              }
              for (;;)
              {
                GMTrace.o(5403068858368L, 40256);
                return true;
                CollectCreateQRCodeUI.a(CollectCreateQRCodeUI.this, "");
                CollectCreateQRCodeUI.d(CollectCreateQRCodeUI.this);
              }
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(5435683766272L, 40499);
              af.i(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(5429375533056L, 40452);
                  CollectCreateQRCodeUI.this.aLo();
                  GMTrace.o(5429375533056L, 40452);
                }
              }, 500L);
              GMTrace.o(5435683766272L, 40499);
            }
          });
          GMTrace.o(5419174985728L, 40376);
        }
      });
      GMTrace.o(5421859340288L, 40396);
      return;
      this.jZE.izE.setText(com.tencent.mm.wallet_core.c.t.clX());
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(5422127775744L, 40398);
    if ((paramk instanceof r))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (r)paramk;
        paramk = new Intent();
        paramk.putExtra("ftf_pay_url", paramString.jWR);
        paramk.putExtra("ftf_fixed_fee", paramString.jWS);
        paramk.putExtra("ftf_fixed_fee_type", paramString.eCU);
        paramk.putExtra("ftf_fixed_desc", paramString.desc);
        setResult(-1, paramk);
        finish();
        GMTrace.o(5422127775744L, 40398);
        return true;
      }
    }
    else if ((paramk instanceof l))
    {
      paramString = (l)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramString.jWs == 0)
        {
          paramk = new Intent();
          paramk.putExtra("ftf_pay_url", paramString.jWu);
          paramk.putExtra("ftf_fixed_fee", paramString.eYB / 100.0D);
          paramk.putExtra("ftf_fixed_desc", paramString.desc);
          paramk.putExtra("key_currency_unit", paramString.jWD);
          setResult(-1, paramk);
          finish();
          GMTrace.o(5422127775744L, 40398);
          return true;
        }
        if (paramString.jWv == 0)
        {
          com.tencent.mm.ui.base.h.b(this.vKB.vKW, paramString.jWt, paramString.jWw, false);
          GMTrace.o(5422127775744L, 40398);
          return true;
        }
        if (paramString.jWv == 1)
        {
          if ((!bg.nm(paramString.jWx)) && (!bg.nm(paramString.jWy))) {
            com.tencent.mm.ui.base.h.a(this.vKB.vKW, paramString.jWt, paramString.jWw, paramString.jWy, paramString.jWx, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(17413810683904L, 129743);
                if (!bg.nm(paramString.jWz))
                {
                  w.i("MicroMsg.CollectCreateQRCodeUI", "goto h5: %s", new Object[] { paramString.jWz });
                  com.tencent.mm.wallet_core.ui.e.m(CollectCreateQRCodeUI.this.vKB.vKW, paramString.jWz, true);
                }
                GMTrace.o(17413810683904L, 129743);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(17417971433472L, 129774);
                GMTrace.o(17417971433472L, 129774);
              }
            });
          }
          GMTrace.o(5422127775744L, 40398);
          return true;
        }
      }
      else
      {
        w.e("MicroMsg.CollectCreateQRCodeUI", "net error: %s", new Object[] { paramString });
      }
    }
    GMTrace.o(5422127775744L, 40398);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5421993558016L, 40397);
    int i = a.g.sMa;
    GMTrace.o(5421993558016L, 40397);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5421725122560L, 40395);
    super.onCreate(paramBundle);
    hN(1335);
    MP();
    GMTrace.o(5421725122560L, 40395);
  }
  
  public void onDestroy()
  {
    GMTrace.i(17414481772544L, 129748);
    super.onDestroy();
    hO(1335);
    GMTrace.o(17414481772544L, 129748);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\ui\CollectCreateQRCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */