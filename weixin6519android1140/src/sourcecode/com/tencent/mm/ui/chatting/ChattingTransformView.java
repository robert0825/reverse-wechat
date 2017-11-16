package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.w;

public class ChattingTransformView
  extends LinearLayout
{
  private ImageView rZW;
  private a wBA;
  private boolean wBB;
  private TextView wBz;
  
  public ChattingTransformView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(14467060465664L, 107788);
    this.wBA = null;
    this.wBB = false;
    init();
    GMTrace.o(14467060465664L, 107788);
  }
  
  public ChattingTransformView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet);
    GMTrace.i(14467194683392L, 107789);
    init();
    GMTrace.o(14467194683392L, 107789);
  }
  
  private void init()
  {
    GMTrace.i(14467328901120L, 107790);
    int i = (int)TypedValue.applyDimension(1, 3.0F, getResources().getDisplayMetrics());
    this.rZW = new ImageView(getContext());
    Object localObject = new LinearLayout.LayoutParams(-2, -2);
    ((LinearLayout.LayoutParams)localObject).gravity = 16;
    ((LinearLayout.LayoutParams)localObject).setMargins(i, i, 0, i);
    this.rZW.setLayoutParams((ViewGroup.LayoutParams)localObject);
    addView(this.rZW);
    this.wBz = new TextView(getContext());
    localObject = new LinearLayout.LayoutParams(-2, -2);
    ((LinearLayout.LayoutParams)localObject).setMargins(i, i, i, i);
    ((LinearLayout.LayoutParams)localObject).gravity = 16;
    this.wBz.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.wBz.setTextSize(1, 11.0F);
    this.wBz.setTextColor(-1);
    addView(this.wBz);
    setBackgroundResource(R.g.aVr);
    localObject = a.wBD;
    if (this.wBB)
    {
      super.setVisibility(8);
      GMTrace.o(14467328901120L, 107790);
      return;
    }
    if (this.wBA != localObject)
    {
      w.d("MicroMsg.ChattingTransformView", "from status %s to status %s", new Object[] { this.wBA, localObject });
      this.wBA = ((a)localObject);
      switch (1.wBC[localObject.ordinal()])
      {
      }
    }
    for (;;)
    {
      invalidate();
      GMTrace.o(14467328901120L, 107790);
      return;
      super.setVisibility(8);
      continue;
      super.setVisibility(0);
      this.rZW.setImageResource(R.k.cPk);
      this.wBz.setText(R.l.dhz);
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(14468939513856L, 107802);
      wBD = new a("NoTranslate", 0);
      wBE = new a("Translating", 1);
      wBF = new a("Translated", 2);
      wBG = new a[] { wBD, wBE, wBF };
      GMTrace.o(14468939513856L, 107802);
    }
    
    private a()
    {
      GMTrace.i(14468805296128L, 107801);
      GMTrace.o(14468805296128L, 107801);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\chatting\ChattingTransformView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */