package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.br.a;

public class AnimImageView
  extends TextView
{
  private boolean aDI;
  private Context context;
  private AlphaAnimation oiv;
  private AnimationDrawable oiw;
  private int type;
  public boolean vYP;
  private AnimationDrawable vYQ;
  
  public AnimImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3289810731008L, 24511);
    this.aDI = false;
    this.vYP = false;
    this.type = 1;
    this.context = paramContext;
    bbc();
    GMTrace.o(3289810731008L, 24511);
  }
  
  public AnimImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3289944948736L, 24512);
    this.aDI = false;
    this.vYP = false;
    this.type = 1;
    this.context = paramContext;
    bbc();
    GMTrace.o(3289944948736L, 24512);
  }
  
  private void bbc()
  {
    GMTrace.i(3290079166464L, 24513);
    this.oiv = new AlphaAnimation(0.1F, 1.0F);
    this.oiv.setDuration(1000L);
    this.oiv.setRepeatCount(-1);
    this.oiv.setRepeatMode(2);
    this.oiw = new AnimationDrawable();
    Drawable localDrawable = getResources().getDrawable(R.k.cLg);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oiw.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.cLh);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oiw.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.cLi);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oiw.addFrame(localDrawable, 300);
    this.oiw.setOneShot(false);
    this.oiw.setVisible(true, true);
    this.vYQ = new AnimationDrawable();
    localDrawable = getResources().getDrawable(R.k.cLq);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.vYQ.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.cLr);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.vYQ.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.cLs);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.vYQ.addFrame(localDrawable, 300);
    this.vYQ.setOneShot(false);
    this.vYQ.setVisible(true, true);
    GMTrace.o(3290079166464L, 24513);
  }
  
  public final void bZq()
  {
    GMTrace.i(3289542295552L, 24509);
    switch (this.type)
    {
    default: 
      GMTrace.o(3289542295552L, 24509);
      return;
    case 2: 
      if (this.vYP) {
        setBackgroundResource(R.e.aMZ);
      }
    case 1: 
      while (!this.aDI)
      {
        this.aDI = true;
        if (!this.vYP) {
          break label128;
        }
        setCompoundDrawablesWithIntrinsicBounds(this.oiw, null, null, null);
        this.oiw.stop();
        this.oiw.start();
        GMTrace.o(3289542295552L, 24509);
        return;
        setBackgroundResource(R.e.aNa);
      }
      label128:
      setCompoundDrawablesWithIntrinsicBounds(null, null, this.vYQ, null);
      this.vYQ.stop();
      this.vYQ.start();
      GMTrace.o(3289542295552L, 24509);
      return;
    }
    if (this.vYP) {
      setBackgroundDrawable(a.b(this.context, R.g.aVu));
    }
    for (;;)
    {
      setAnimation(this.oiv);
      this.oiv.startNow();
      break;
      setBackgroundDrawable(a.b(this.context, R.g.aVK));
    }
  }
  
  public final void bbd()
  {
    GMTrace.i(3289676513280L, 24510);
    if ((this.oiv != null) && (this.oiv.isInitialized())) {
      setAnimation(null);
    }
    if ((this.type == 1) || (this.type == 2))
    {
      this.aDI = false;
      setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
      this.oiw.stop();
      this.vYQ.stop();
    }
    GMTrace.o(3289676513280L, 24510);
  }
  
  public int getBaseline()
  {
    GMTrace.i(3290481819648L, 24516);
    try
    {
      int i = super.getBaseline();
      GMTrace.o(3290481819648L, 24516);
      return i;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(3290481819648L, 24516);
    }
    return -1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(3290347601920L, 24515);
    try
    {
      super.onDraw(paramCanvas);
      GMTrace.o(3290347601920L, 24515);
      return;
    }
    catch (Throwable paramCanvas)
    {
      GMTrace.o(3290347601920L, 24515);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3290213384192L, 24514);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      GMTrace.o(3290213384192L, 24514);
      return;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(3290213384192L, 24514);
    }
  }
  
  public boolean onPreDraw()
  {
    GMTrace.i(3290616037376L, 24517);
    try
    {
      boolean bool = super.onPreDraw();
      GMTrace.o(3290616037376L, 24517);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      GMTrace.o(3290616037376L, 24517);
    }
    return true;
  }
  
  public final void setType(int paramInt)
  {
    GMTrace.i(14474710876160L, 107845);
    this.type = paramInt;
    if (this.vYP)
    {
      if (paramInt == 2)
      {
        setBackgroundResource(R.e.aMZ);
        GMTrace.o(14474710876160L, 107845);
        return;
      }
      setBackgroundDrawable(a.b(this.context, R.g.aVu));
      GMTrace.o(14474710876160L, 107845);
      return;
    }
    if (paramInt == 2)
    {
      setBackgroundResource(R.e.aNa);
      GMTrace.o(14474710876160L, 107845);
      return;
    }
    setBackgroundDrawable(a.b(this.context, R.g.aVK));
    GMTrace.o(14474710876160L, 107845);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\AnimImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */