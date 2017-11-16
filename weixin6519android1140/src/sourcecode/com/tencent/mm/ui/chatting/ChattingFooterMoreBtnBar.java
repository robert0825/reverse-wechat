package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public class ChattingFooterMoreBtnBar
  extends LinearLayout
{
  private LinearLayout.LayoutParams lYZ;
  private ImageButton lgC;
  private ImageButton wvr;
  private ImageButton wvs;
  private ImageButton wvt;
  private ImageButton wvu;
  
  public ChattingFooterMoreBtnBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2275527360512L, 16954);
    setOrientation(0);
    setGravity(16);
    setBackgroundResource(R.g.aUC);
    this.lYZ = new LinearLayout.LayoutParams(0, getResources().getDimensionPixelSize(R.f.aQM), 1.0F);
    this.lYZ.topMargin = a.fromDPToPix(getContext(), 0);
    this.wvr = new ImageButton(getContext());
    this.wvr.setImageResource(R.g.aVq);
    this.wvr.setScaleType(ImageView.ScaleType.CENTER);
    this.wvr.setBackgroundResource(0);
    this.wvr.setContentDescription(paramContext.getString(R.l.dgB));
    this.wvu = new ImageButton(getContext());
    this.wvu.setImageResource(R.g.aVo);
    this.wvu.setScaleType(ImageView.ScaleType.CENTER);
    this.wvu.setBackgroundResource(0);
    this.wvu.setContentDescription(paramContext.getString(R.l.dgA));
    this.lgC = new ImageButton(getContext());
    this.lgC.setImageResource(R.g.aVm);
    this.lgC.setScaleType(ImageView.ScaleType.CENTER);
    this.lgC.setBackgroundResource(0);
    this.lgC.setContentDescription(paramContext.getString(R.l.dgy));
    this.wvt = new ImageButton(getContext());
    this.wvt.setImageResource(R.g.aVp);
    this.wvt.setScaleType(ImageView.ScaleType.CENTER);
    this.wvt.setBackgroundResource(0);
    this.wvt.setContentDescription(paramContext.getString(R.l.dgx));
    this.wvs = new ImageButton(getContext());
    this.wvs.setImageResource(R.g.aVn);
    this.wvs.setScaleType(ImageView.ScaleType.CENTER);
    this.wvs.setBackgroundResource(0);
    this.wvs.setContentDescription(paramContext.getString(R.l.dgz));
    cco();
    GMTrace.o(2275527360512L, 16954);
  }
  
  public final void CI(int paramInt)
  {
    GMTrace.i(2275795795968L, 16956);
    boolean bool;
    if (paramInt > 0)
    {
      bool = true;
      this.wvr.setClickable(bool);
      this.wvr.setEnabled(bool);
      if (aa.ccb().size() <= 0) {
        break label105;
      }
      this.wvt.setClickable(bool);
      this.wvt.setEnabled(bool);
    }
    for (;;)
    {
      this.lgC.setClickable(bool);
      this.lgC.setEnabled(bool);
      this.wvu.setClickable(bool);
      this.wvu.setEnabled(bool);
      GMTrace.o(2275795795968L, 16956);
      return;
      bool = false;
      break;
      label105:
      this.wvs.setClickable(bool);
      this.wvs.setEnabled(bool);
    }
  }
  
  public final void c(int paramInt, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(2275930013696L, 16957);
    switch (paramInt)
    {
    default: 
      w.w("Ashu.ChattingFooterMoreBtnBar", "set button listener error button index %d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(2275930013696L, 16957);
      return;
    case 2: 
      this.wvt.setOnClickListener(paramOnClickListener);
      GMTrace.o(2275930013696L, 16957);
      return;
    case 3: 
      this.lgC.setOnClickListener(paramOnClickListener);
      GMTrace.o(2275930013696L, 16957);
      return;
    case 1: 
      this.wvs.setOnClickListener(paramOnClickListener);
      GMTrace.o(2275930013696L, 16957);
      return;
    case 0: 
      this.wvr.setOnClickListener(paramOnClickListener);
      GMTrace.o(2275930013696L, 16957);
      return;
    }
    this.wvu.setOnClickListener(paramOnClickListener);
    GMTrace.o(2275930013696L, 16957);
  }
  
  public final void cco()
  {
    GMTrace.i(2275661578240L, 16955);
    removeAllViews();
    addView(this.wvr, this.lYZ);
    addView(this.wvu, this.lYZ);
    addView(this.lgC, this.lYZ);
    if (aa.ccb().size() > 0)
    {
      addView(this.wvt, this.lYZ);
      GMTrace.o(2275661578240L, 16955);
      return;
    }
    addView(this.wvs, this.lYZ);
    GMTrace.o(2275661578240L, 16955);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ChattingFooterMoreBtnBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */