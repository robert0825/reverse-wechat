package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class ChattingTranslateView
  extends LinearLayout
{
  private String eUL;
  private ImageView rZW;
  private boolean wBB;
  private boolean wBH;
  private a wBI;
  private TextView wBz;
  
  public ChattingTranslateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2497657700352L, 18609);
    this.wBH = false;
    this.wBI = null;
    this.wBB = false;
    init();
    GMTrace.o(2497657700352L, 18609);
  }
  
  public ChattingTranslateView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet);
    GMTrace.i(2497791918080L, 18610);
    init();
    GMTrace.o(2497791918080L, 18610);
  }
  
  private void a(a parama)
  {
    GMTrace.i(2498597224448L, 18616);
    if (this.wBB)
    {
      super.setVisibility(8);
      GMTrace.o(2498597224448L, 18616);
      return;
    }
    if ((this.wBI == parama) && (!this.wBH))
    {
      GMTrace.o(2498597224448L, 18616);
      return;
    }
    this.wBH = false;
    w.d("MicroMsg.ChattingTranslateView", "from status %s to status %s", new Object[] { this.wBI, parama });
    this.wBI = parama;
    switch (1.wBJ[parama.ordinal()])
    {
    }
    for (;;)
    {
      invalidate();
      GMTrace.o(2498597224448L, 18616);
      return;
      super.setVisibility(8);
      continue;
      super.setVisibility(0);
      this.rZW.setImageResource(R.k.cPk);
      this.wBz.setText(R.l.dhC);
      continue;
      super.setVisibility(0);
      this.rZW.setImageResource(R.k.cPj);
      if (bg.nm(this.eUL)) {
        this.wBz.setText(R.l.dhB);
      } else {
        this.wBz.setText(this.eUL);
      }
    }
  }
  
  private void init()
  {
    GMTrace.i(2498060353536L, 18612);
    int i = (int)TypedValue.applyDimension(1, 3.0F, getResources().getDisplayMetrics());
    this.rZW = new ImageView(getContext());
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams.gravity = 16;
    localLayoutParams.setMargins(i, i, 0, i);
    this.rZW.setLayoutParams(localLayoutParams);
    addView(this.rZW);
    this.wBz = new TextView(getContext());
    localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams.setMargins(i, i, i, i);
    localLayoutParams.gravity = 16;
    this.wBz.setLayoutParams(localLayoutParams);
    this.wBz.setTextSize(1, 11.0F);
    this.wBz.setTextColor(-1);
    addView(this.wBz);
    setBackgroundResource(R.g.aVr);
    a(a.wBK);
    GMTrace.o(2498060353536L, 18612);
  }
  
  public final void Wf(String paramString)
  {
    GMTrace.i(2498463006720L, 18615);
    if (!bg.nl(this.eUL).equals(bg.nl(paramString))) {
      this.wBH = true;
    }
    this.eUL = paramString;
    a(a.wBM);
    GMTrace.o(2498463006720L, 18615);
  }
  
  public final void ccR()
  {
    GMTrace.i(2498194571264L, 18613);
    a(a.wBK);
    GMTrace.o(2498194571264L, 18613);
  }
  
  public final void ccS()
  {
    GMTrace.i(2498328788992L, 18614);
    a(a.wBL);
    GMTrace.o(2498328788992L, 18614);
  }
  
  public final void ma(boolean paramBoolean)
  {
    GMTrace.i(2497926135808L, 18611);
    this.wBB = paramBoolean;
    if (paramBoolean) {
      super.setVisibility(8);
    }
    GMTrace.o(2497926135808L, 18611);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(2141578067968L, 15956);
      wBK = new a("NoTranslate", 0);
      wBL = new a("Translating", 1);
      wBM = new a("Translated", 2);
      wBN = new a[] { wBK, wBL, wBM };
      GMTrace.o(2141578067968L, 15956);
    }
    
    private a()
    {
      GMTrace.i(2141443850240L, 15955);
      GMTrace.o(2141443850240L, 15955);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ChattingTranslateView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */