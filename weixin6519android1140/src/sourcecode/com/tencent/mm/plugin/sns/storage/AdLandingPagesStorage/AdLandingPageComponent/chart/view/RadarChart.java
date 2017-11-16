package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.Chart;
import java.util.ArrayList;

public class RadarChart
  extends Chart
{
  private Context context;
  public ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a> pFM;
  public c pFN;
  public TextView pFO;
  public RadarGrid pFP;
  private RadarDataLayer[] pFQ;
  private a pFR;
  private boolean pFS;
  private boolean pFT;
  public int pFU;
  public int pFV;
  public int pFW;
  public Spannable[] pFX;
  private float pFY;
  
  public RadarChart(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8211037945856L, 61177);
    this.pFN = new c();
    this.pFS = true;
    this.pFT = true;
    this.pFU = 3;
    this.pFV = 0;
    this.pFW = 4;
    this.pFY = 1.0F;
    this.context = paramContext;
    GMTrace.o(8211037945856L, 61177);
  }
  
  public RadarChart(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8211172163584L, 61178);
    this.pFN = new c();
    this.pFS = true;
    this.pFT = true;
    this.pFU = 3;
    this.pFV = 0;
    this.pFW = 4;
    this.pFY = 1.0F;
    this.context = paramContext;
    GMTrace.o(8211172163584L, 61178);
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a... paramVarArgs)
  {
    int k = 0;
    GMTrace.i(8211306381312L, 61179);
    removeAllViews();
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      if (paramVarArgs[i].size() <= 0) {
        throw new Exception("Not enough elements.");
      }
      i += 1;
    }
    i = 0;
    while (i < paramVarArgs.length)
    {
      j = 0;
      while (j < paramVarArgs.length)
      {
        if (!paramVarArgs[i].a(paramVarArgs[j])) {
          throw new Error("Layer not compatible.");
        }
        j += 1;
      }
      i += 1;
    }
    this.pFX = paramVarArgs[0].bku();
    this.pFV = paramVarArgs[0].size();
    if (this.pFM == null) {
      this.pFM = new ArrayList();
    }
    j = paramVarArgs.length;
    i = 0;
    while (i < j)
    {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a locala = paramVarArgs[i];
      this.pFM.add(locala);
      i += 1;
    }
    this.pFP = new RadarGrid(this.context, this.pFV, this.pFW, this.pFY, this.pFX, this.pFN);
    addView(this.pFP);
    this.pFQ = new RadarDataLayer[this.pFU];
    i = k;
    while ((i < this.pFQ.length) && (this.pFM.size() > i))
    {
      this.pFQ[i] = new RadarDataLayer(this.context, this.pFY, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a)this.pFM.get(i));
      addView(this.pFQ[i]);
      i += 1;
    }
    if (this.pFR == null) {
      this.pFR = new a(this.context, this.pFN);
    }
    addView(this.pFR);
    GMTrace.o(8211306381312L, 61179);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8211440599040L, 61180);
    paramInt2 = getChildCount();
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      getChildAt(paramInt1).layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
      paramInt1 += 1;
    }
    GMTrace.o(8211440599040L, 61180);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\chart\view\RadarChart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */