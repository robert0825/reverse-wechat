package com.tencent.mm.plugin.product.ui;

import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.product.a.a;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.plugin.product.b.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import java.util.List;

public class MallProductReceiptUI
  extends MallBaseUI
{
  private c nJB;
  private d nJR;
  private AutoCompleteTextView nJS;
  private h nJT;
  
  public MallProductReceiptUI()
  {
    GMTrace.i(6034965921792L, 44964);
    this.nJR = null;
    this.nJS = null;
    this.nJT = null;
    GMTrace.o(6034965921792L, 44964);
  }
  
  public final void MP()
  {
    GMTrace.i(6035368574976L, 44967);
    oM(a.i.sVO);
    a(0, getString(a.i.cTh), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        int i = 0;
        GMTrace.i(6014296391680L, 44810);
        paramAnonymousMenuItem = MallProductReceiptUI.a(MallProductReceiptUI.this).getText().toString();
        if (!bg.nm(paramAnonymousMenuItem))
        {
          c localc = MallProductReceiptUI.b(MallProductReceiptUI.this);
          localc.nHJ = new axt();
          axt localaxt = localc.nHJ;
          if (bg.nm(paramAnonymousMenuItem))
          {
            localaxt.uMp = i;
            localc.nHJ.lQf = paramAnonymousMenuItem;
            MallProductReceiptUI.this.finish();
          }
        }
        for (;;)
        {
          GMTrace.o(6014296391680L, 44810);
          return true;
          i = 1;
          break;
          u.makeText(MallProductReceiptUI.this, a.i.sVN, 0).show();
        }
      }
    });
    this.nJS = ((AutoCompleteTextView)findViewById(a.f.sBD));
    axt localaxt = this.nJB.aXe();
    if ((localaxt != null) && (!bg.nm(localaxt.lQf))) {
      this.nJS.setText(localaxt.lQf);
    }
    this.nJS.setSelection(this.nJS.getText().length());
    this.nJT = new h(this);
    this.nJS.setAdapter(this.nJT);
    this.nJS.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6003022102528L, 44726);
        paramAnonymousAdapterView = MallProductReceiptUI.c(MallProductReceiptUI.this);
        if ((paramAnonymousAdapterView.nHU != null) && (paramAnonymousInt < paramAnonymousAdapterView.nHU.size())) {}
        for (paramAnonymousAdapterView = (String)paramAnonymousAdapterView.nHU.get(paramAnonymousInt);; paramAnonymousAdapterView = null)
        {
          w.d("MicroMsg.MallProductReceiptUI", "onItemClick receipt = " + paramAnonymousAdapterView);
          if (!bg.nm(paramAnonymousAdapterView)) {
            MallProductReceiptUI.a(MallProductReceiptUI.this).setText(paramAnonymousAdapterView);
          }
          GMTrace.o(6003022102528L, 44726);
          return;
        }
      }
    });
    View.inflate(this.vKB.vKW, a.g.sNV, null).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6034831704064L, 44963);
        paramAnonymousView = MallProductReceiptUI.c(MallProductReceiptUI.this);
        paramAnonymousView.nHU.clear();
        paramAnonymousView.aXr();
        MallProductReceiptUI.d(MallProductReceiptUI.this).notifyDataSetChanged();
        GMTrace.o(6034831704064L, 44963);
      }
    });
    GMTrace.o(6035368574976L, 44967);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6035100139520L, 44965);
    int i = a.g.sNX;
    GMTrace.o(6035100139520L, 44965);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6035234357248L, 44966);
    super.onCreate(paramBundle);
    this.nJR = a.aWW().aWY();
    a.aWW();
    this.nJB = a.aWX();
    MP();
    GMTrace.o(6035234357248L, 44966);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\MallProductReceiptUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */