package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.text.Editable;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Filter;
import android.widget.Filter.FilterListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.input.y;
import com.tencent.mm.plugin.appbrand.widget.input.y.a;
import com.tencent.mm.plugin.appbrand.widget.input.y.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.widget.i;

public final class b
{
  public final y iOD;
  public final e iOE;
  private final Filter.FilterListener iOF;
  public final c iOG;
  final a iOH;
  int iOI;
  public a iOJ;
  private int iOK;
  private int iOL;
  
  public b(y paramy)
  {
    GMTrace.i(18266093256704L, 136093);
    this.iOI = f.iPf;
    this.iOD = paramy;
    this.iOE = new e(paramy.getContext());
    this.iOG = new c(paramy, this.iOE);
    this.iOD.a(new y.a()
    {
      public final void adj()
      {
        GMTrace.i(18256966451200L, 136025);
        b.this.adq();
        GMTrace.o(18256966451200L, 136025);
      }
    });
    this.iOD.a(new y.b()
    {
      public final void acO()
      {
        GMTrace.i(18261664071680L, 136060);
        b.this.adq();
        GMTrace.o(18261664071680L, 136060);
      }
    });
    this.iOD.a(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(18268643393536L, 136112);
        if (paramAnonymousBoolean)
        {
          b.this.adr();
          GMTrace.o(18268643393536L, 136112);
          return;
        }
        paramAnonymousView = b.this;
        if (paramAnonymousView.iOE.hwd.isShowing())
        {
          g localg = (g)paramAnonymousView.iOE.iOX.getAdapter();
          paramAnonymousView.iOE.dismiss();
          localg.adp();
        }
        GMTrace.o(18268643393536L, 136112);
      }
    });
    this.iOD.addTextChangedListener(new i()
    {
      private boolean iON;
      
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(18262335160320L, 136065);
        if ((this.iON) && (!b.this.iOE.hwd.isShowing()))
        {
          GMTrace.o(18262335160320L, 136065);
          return;
        }
        if (!b.this.iOE.hwd.isShowing()) {
          b.this.adr();
        }
        b.this.u(paramAnonymousEditable);
        GMTrace.o(18262335160320L, 136065);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(18262200942592L, 136064);
        this.iON = b.this.iOE.hwd.isShowing();
        GMTrace.o(18262200942592L, 136064);
      }
    });
    this.iOF = new Filter.FilterListener()
    {
      public final void onFilterComplete(int paramAnonymousInt)
      {
        GMTrace.i(18265959038976L, 136092);
        if (paramAnonymousInt <= 0)
        {
          b.this.iOE.dismiss();
          GMTrace.o(18265959038976L, 136092);
          return;
        }
        if (b.this.iOE.hwd.isShowing()) {
          b.this.iOE.show();
        }
        GMTrace.o(18265959038976L, 136092);
      }
    };
    this.iOH = new a()
    {
      public final void a(String paramAnonymousString, h.a paramAnonymousa)
      {
        GMTrace.i(18267972304896L, 136107);
        if (paramAnonymousa == h.a.iPi) {
          b.this.u(b.this.iOD.getText());
        }
        super.a(paramAnonymousString, paramAnonymousa);
        GMTrace.o(18267972304896L, 136107);
      }
    };
    GMTrace.o(18266093256704L, 136093);
  }
  
  public final void adq()
  {
    GMTrace.i(18266361692160L, 136095);
    switch (7.iOO[(this.iOI - 1)])
    {
    }
    for (;;)
    {
      if (this.iOK != 0)
      {
        this.iOE.RO = this.iOK;
        this.iOE.OW -= this.iOK;
      }
      if (this.iOL != 0) {
        this.iOE.OW -= this.iOL;
      }
      GMTrace.o(18266361692160L, 136095);
      return;
      this.iOE.OW = com.tencent.mm.plugin.appbrand.ui.g.aaW()[0];
      continue;
      this.iOE.OW = this.iOD.getView().getMeasuredWidth();
    }
  }
  
  final void adr()
  {
    GMTrace.i(18266630127616L, 136097);
    if (this.iOJ == null)
    {
      GMTrace.o(18266630127616L, 136097);
      return;
    }
    Object localObject = this.iOD.getText();
    if (!bg.L((CharSequence)localObject)) {
      u((CharSequence)localObject);
    }
    this.iOE.RX = this.iOD.getView();
    this.iOE.show();
    ((g)this.iOE.iOX.getAdapter()).a(this);
    c localc = this.iOG;
    localc.kj(2);
    localc.iOS = Integer.MIN_VALUE;
    if (!bg.L((CharSequence)localObject)) {
      localc.iOT = true;
    }
    localObject = localc.iOE.iOX;
    if (localObject != null) {
      ((ListView)localObject).getAdapter().registerDataSetObserver(new c.2(localc));
    }
    GMTrace.o(18266630127616L, 136097);
  }
  
  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    GMTrace.i(18266495909888L, 136096);
    this.iOE.hwd.setOnDismissListener(paramOnDismissListener);
    GMTrace.o(18266495909888L, 136096);
  }
  
  public final void u(CharSequence paramCharSequence)
  {
    GMTrace.i(18266227474432L, 136094);
    if (this.iOJ == null)
    {
      GMTrace.o(18266227474432L, 136094);
      return;
    }
    this.iOJ.getFilter().filter(paramCharSequence, this.iOF);
    GMTrace.o(18266227474432L, 136094);
  }
  
  private static class a
    implements h
  {
    public h iOP;
    
    public a()
    {
      GMTrace.i(18256563798016L, 136022);
      GMTrace.o(18256563798016L, 136022);
    }
    
    public void a(String paramString, h.a parama)
    {
      GMTrace.i(18256698015744L, 136023);
      if (this.iOP != null) {
        this.iOP.a(paramString, parama);
      }
      GMTrace.o(18256698015744L, 136023);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\autofill\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */