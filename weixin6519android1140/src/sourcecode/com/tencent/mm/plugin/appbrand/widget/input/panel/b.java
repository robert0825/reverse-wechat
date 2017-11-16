package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.e;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
  extends a
{
  private static final int iPq;
  private static final int iPr;
  
  static
  {
    GMTrace.i(19875900686336L, 148087);
    iPq = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 48);
    iPr = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 43);
    GMTrace.o(19875900686336L, 148087);
  }
  
  public b()
  {
    GMTrace.i(19874826944512L, 148079);
    GMTrace.o(19874826944512L, 148079);
  }
  
  public final int adu()
  {
    GMTrace.i(19875095379968L, 148081);
    int i = this.iPo.adm().ado();
    GMTrace.o(19875095379968L, 148081);
    return i;
  }
  
  public final int adv()
  {
    GMTrace.i(19875229597696L, 148082);
    int i = adw();
    int j = getRowCount();
    GMTrace.o(19875229597696L, 148082);
    return i * j;
  }
  
  public final int adw()
  {
    GMTrace.i(19875498033152L, 148084);
    if (this.iPo.iPF)
    {
      GMTrace.o(19875498033152L, 148084);
      return 7;
    }
    c localc = this.iPo;
    if (localc.iPK <= 1) {
      localc.iPK = c.aaW()[0];
    }
    int i = localc.iPK / iPr;
    GMTrace.o(19875498033152L, 148084);
    return i;
  }
  
  public final int adx()
  {
    GMTrace.i(19875632250880L, 148085);
    int i = (this.iPo.iPJ - iPq * getRowCount()) / (getRowCount() + 1);
    GMTrace.o(19875632250880L, 148085);
    return i;
  }
  
  public final int getPageCount()
  {
    GMTrace.i(19875363815424L, 148083);
    if (adv() <= 0)
    {
      GMTrace.o(19875363815424L, 148083);
      return 0;
    }
    int i = adu();
    int j = adv();
    i = (int)Math.ceil(i / j);
    GMTrace.o(19875363815424L, 148083);
    return i;
  }
  
  public final int getRowCount()
  {
    int i = 3;
    GMTrace.i(19875766468608L, 148086);
    int j = this.iPo.iPJ / iPq;
    if (j > 3) {}
    while (i <= 0)
    {
      GMTrace.o(19875766468608L, 148086);
      return 1;
      i = j;
    }
    GMTrace.o(19875766468608L, 148086);
    return i;
  }
  
  public final View kk(int paramInt)
  {
    GMTrace.i(19874961162240L, 148080);
    Object localObject1 = this.iPn;
    Object localObject2 = this.iPo;
    d locald = new d();
    locald.mIndex = paramInt;
    locald.iPL = this;
    locald.mContext = ((Context)localObject1);
    locald.iPo = ((c)localObject2);
    if ((locald.mContext == null) || (locald.iPL == null))
    {
      GMTrace.o(19874961162240L, 148080);
      return null;
    }
    localObject1 = View.inflate(locald.mContext, o.g.hDu, null);
    if ((localObject1 instanceof AppBrandSmileyGrid))
    {
      ((AppBrandSmileyGrid)localObject1).iPo = locald.iPo;
      localObject2 = (AppBrandSmileyGrid)localObject1;
      paramInt = locald.mIndex;
      int i = locald.iPL.adu();
      int j = locald.iPL.adv();
      int k = locald.iPL.adw();
      int m = locald.iPL.getRowCount();
      int n = locald.iPL.adx();
      ((AppBrandSmileyGrid)localObject2).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      ((AppBrandSmileyGrid)localObject2).setBackgroundResource(0);
      ((AppBrandSmileyGrid)localObject2).setStretchMode(2);
      ((AppBrandSmileyGrid)localObject2).setOnItemClickListener(((AppBrandSmileyGrid)localObject2).WC);
      ((AppBrandSmileyGrid)localObject2).iPw = paramInt;
      ((AppBrandSmileyGrid)localObject2).iPt = i;
      ((AppBrandSmileyGrid)localObject2).iPu = j;
      ((AppBrandSmileyGrid)localObject2).iPx = n;
      ((AppBrandSmileyGrid)localObject2).iPy = k;
      ((AppBrandSmileyGrid)localObject2).iPz = m;
      ((AppBrandSmileyGrid)localObject2).setNumColumns(k);
      i = ((AppBrandSmileyGrid)localObject2).iPx;
      j = com.tencent.mm.br.a.fromDPToPix(((AppBrandSmileyGrid)localObject2).getContext(), 6);
      k = com.tencent.mm.br.a.fromDPToPix(((AppBrandSmileyGrid)localObject2).getContext(), 6);
      paramInt = i;
      if (i == 0) {
        paramInt = com.tencent.mm.br.a.fromDPToPix(((AppBrandSmileyGrid)localObject2).getContext(), 6);
      }
      ((AppBrandSmileyGrid)localObject2).setPadding(j, paramInt, k, 0);
      ((AppBrandSmileyGrid)localObject2).iPs = new AppBrandSmileyGrid.a((AppBrandSmileyGrid)localObject2, (byte)0);
      ((AppBrandSmileyGrid)localObject2).setAdapter(((AppBrandSmileyGrid)localObject2).iPs);
      ((AppBrandSmileyGrid)localObject2).iPs.notifyDataSetChanged();
    }
    GMTrace.o(19874961162240L, 148080);
    return (View)localObject1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\panel\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */