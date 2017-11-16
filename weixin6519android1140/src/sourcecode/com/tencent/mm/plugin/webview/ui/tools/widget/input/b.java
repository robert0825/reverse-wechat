package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.bt.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  extends a
{
  private static final int iPq;
  private static final int iPr;
  
  static
  {
    GMTrace.i(12076642729984L, 89978);
    iPq = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 48);
    iPr = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 43);
    GMTrace.o(12076642729984L, 89978);
  }
  
  public b()
  {
    GMTrace.i(12075568988160L, 89970);
    GMTrace.o(12075568988160L, 89970);
  }
  
  public final int adu()
  {
    GMTrace.i(12075837423616L, 89972);
    int i = e.bRA().ado();
    GMTrace.o(12075837423616L, 89972);
    return i;
  }
  
  public final int adv()
  {
    GMTrace.i(12075971641344L, 89973);
    int i = adw();
    int j = getRowCount();
    GMTrace.o(12075971641344L, 89973);
    return i * j;
  }
  
  public final int adw()
  {
    GMTrace.i(12076240076800L, 89975);
    if (this.rWp.iPF)
    {
      GMTrace.o(12076240076800L, 89975);
      return 7;
    }
    c localc = this.rWp;
    if (localc.iPK <= 1)
    {
      Display localDisplay = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
      localc.iPK = new int[] { localDisplay.getWidth(), localDisplay.getHeight() }[0];
    }
    int i = localc.iPK / iPr;
    GMTrace.o(12076240076800L, 89975);
    return i;
  }
  
  public final int adx()
  {
    GMTrace.i(12076374294528L, 89976);
    int i = (this.rWp.iPJ - iPq * getRowCount()) / (getRowCount() + 1);
    GMTrace.o(12076374294528L, 89976);
    return i;
  }
  
  public final int getPageCount()
  {
    GMTrace.i(12076105859072L, 89974);
    if (adv() <= 0)
    {
      GMTrace.o(12076105859072L, 89974);
      return 0;
    }
    int i = e.bRA().ado();
    int j = adv();
    i = (int)Math.ceil(i / j);
    GMTrace.o(12076105859072L, 89974);
    return i;
  }
  
  public final int getRowCount()
  {
    int i = 3;
    GMTrace.i(12076508512256L, 89977);
    int j = this.rWp.iPJ / iPq;
    if (j > 3) {}
    while (i <= 0)
    {
      GMTrace.o(12076508512256L, 89977);
      return 1;
      i = j;
    }
    GMTrace.o(12076508512256L, 89977);
    return i;
  }
  
  public final View kk(int paramInt)
  {
    GMTrace.i(12075703205888L, 89971);
    Object localObject1 = this.iPn;
    Object localObject2 = this.rWp;
    d locald = new d();
    locald.mIndex = paramInt;
    locald.rWx = this;
    locald.mContext = ((Context)localObject1);
    locald.rWp = ((c)localObject2);
    if ((locald.mContext == null) || (locald.rWx == null))
    {
      GMTrace.o(12075703205888L, 89971);
      return null;
    }
    localObject1 = View.inflate(locald.mContext, R.i.cHZ, null);
    if ((localObject1 instanceof WebViewSmileyGrid))
    {
      ((WebViewSmileyGrid)localObject1).rWp = locald.rWp;
      localObject2 = (WebViewSmileyGrid)localObject1;
      paramInt = locald.mIndex;
      int i = locald.rWx.adu();
      int j = locald.rWx.adv();
      int k = locald.rWx.adw();
      int m = locald.rWx.getRowCount();
      int n = locald.rWx.adx();
      ((WebViewSmileyGrid)localObject2).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      ((WebViewSmileyGrid)localObject2).setBackgroundResource(0);
      ((WebViewSmileyGrid)localObject2).setStretchMode(2);
      ((WebViewSmileyGrid)localObject2).setOnItemClickListener(((WebViewSmileyGrid)localObject2).WC);
      ((WebViewSmileyGrid)localObject2).iPw = paramInt;
      ((WebViewSmileyGrid)localObject2).iPt = i;
      ((WebViewSmileyGrid)localObject2).iPu = j;
      ((WebViewSmileyGrid)localObject2).iPx = n;
      ((WebViewSmileyGrid)localObject2).iPy = k;
      ((WebViewSmileyGrid)localObject2).iPz = m;
      ((WebViewSmileyGrid)localObject2).setNumColumns(k);
      i = ((WebViewSmileyGrid)localObject2).iPx;
      j = com.tencent.mm.br.a.fromDPToPix(((WebViewSmileyGrid)localObject2).getContext(), 6);
      k = com.tencent.mm.br.a.fromDPToPix(((WebViewSmileyGrid)localObject2).getContext(), 6);
      paramInt = i;
      if (i == 0) {
        paramInt = com.tencent.mm.br.a.fromDPToPix(((WebViewSmileyGrid)localObject2).getContext(), 6);
      }
      ((WebViewSmileyGrid)localObject2).setPadding(j, paramInt, k, 0);
      ((WebViewSmileyGrid)localObject2).rWq = new WebViewSmileyGrid.a((WebViewSmileyGrid)localObject2, (byte)0);
      ((WebViewSmileyGrid)localObject2).setAdapter(((WebViewSmileyGrid)localObject2).rWq);
      ((WebViewSmileyGrid)localObject2).rWq.notifyDataSetChanged();
    }
    GMTrace.o(12075703205888L, 89971);
    return (View)localObject1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\widget\input\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */