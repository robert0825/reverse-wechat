package com.tencent.mm.plugin.webview.fts.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.plugin.z.a.a;
import com.tencent.mm.plugin.z.a.b;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.sdk.platformtools.w;

public class FtsVideoPlayerSeekBar
  extends AdVideoPlayerLoadingBar
  implements g
{
  protected boolean eIC;
  private float jry;
  private int rCS;
  private int rCT;
  private int rCU;
  
  public FtsVideoPlayerSeekBar(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(20460150456320L, 152440);
    this.eIC = false;
    this.rCS = -1;
    this.rCT = -1;
    this.rCU = -1;
    GMTrace.o(20460150456320L, 152440);
  }
  
  public FtsVideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20460284674048L, 152441);
    this.eIC = false;
    this.rCS = -1;
    this.rCT = -1;
    this.rCU = -1;
    GMTrace.o(20460284674048L, 152441);
  }
  
  public FtsVideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(20460418891776L, 152442);
    this.eIC = false;
    this.rCS = -1;
    this.rCT = -1;
    this.rCU = -1;
    GMTrace.o(20460418891776L, 152442);
  }
  
  private void xq(int paramInt)
  {
    GMTrace.i(20461492633600L, 152450);
    int i;
    FrameLayout.LayoutParams localLayoutParams;
    if (paramInt > this.oSS.getWidth())
    {
      i = this.oSS.getWidth();
      localLayoutParams = (FrameLayout.LayoutParams)this.oST.getLayoutParams();
      if (i <= this.oSS.getWidth()) {
        break label149;
      }
    }
    label149:
    for (paramInt = this.oSS.getWidth();; paramInt = i)
    {
      localLayoutParams.leftMargin = (((FrameLayout.LayoutParams)this.oSS.getLayoutParams()).leftMargin + paramInt - (bgI() >>> 1));
      this.oST.setLayoutParams(localLayoutParams);
      localLayoutParams = (FrameLayout.LayoutParams)this.oSR.getLayoutParams();
      localLayoutParams.width = i;
      this.oSR.setLayoutParams(localLayoutParams);
      this.oST.requestLayout();
      this.oSR.requestLayout();
      GMTrace.o(20461492633600L, 152450);
      return;
      i = paramInt;
      if (paramInt >= 0) {
        break;
      }
      i = 0;
      break;
    }
  }
  
  protected final int bgG()
  {
    GMTrace.i(20460821544960L, 152445);
    int i = this.oSS.getWidth();
    GMTrace.o(20460821544960L, 152445);
    return i;
  }
  
  protected int bgI()
  {
    GMTrace.i(20460687327232L, 152444);
    if (this.rCS == -1) {
      this.rCS = this.oST.getWidth();
    }
    int i = this.rCS;
    GMTrace.o(20460687327232L, 152444);
    return i;
  }
  
  public final void bgJ()
  {
    GMTrace.i(20461358415872L, 152449);
    if (this.oSX == 0)
    {
      GMTrace.o(20461358415872L, 152449);
      return;
    }
    if (this.jaO)
    {
      GMTrace.o(20461358415872L, 152449);
      return;
    }
    if (this.oST == null)
    {
      GMTrace.o(20461358415872L, 152449);
      return;
    }
    if (this.oSS.getWidth() == 0)
    {
      GMTrace.o(20461358415872L, 152449);
      return;
    }
    if (this.jP == this.oSX) {
      w.i("MicroMsg.FtsVideoPlayerSeekBar", "test");
    }
    this.oSV.setText(iL(this.jP / 60) + ":" + iL(this.jP % 60));
    int i = this.jP;
    if (i <= 0) {
      i = 0;
    }
    for (;;)
    {
      xq(i);
      GMTrace.o(20461358415872L, 152449);
      return;
      if (i >= this.oSX) {
        i = this.oSS.getWidth();
      } else {
        i = (int)(i * 1.0D / this.oSX * this.oSS.getWidth());
      }
    }
  }
  
  public void cp(boolean paramBoolean)
  {
    GMTrace.i(20461761069056L, 152452);
    this.eIC = paramBoolean;
    super.cp(paramBoolean);
    GMTrace.o(20461761069056L, 152452);
  }
  
  protected int getLayoutId()
  {
    GMTrace.i(20460955762688L, 152446);
    int i = a.b.cku;
    GMTrace.o(20460955762688L, 152446);
    return i;
  }
  
  protected void init()
  {
    GMTrace.i(20460553109504L, 152443);
    this.hqF = View.inflate(getContext(), getLayoutId(), this);
    this.oSR = ((ImageView)this.hqF.findViewById(a.a.nHs));
    this.oSS = ((ImageView)this.hqF.findViewById(a.a.nHr));
    this.oST = ((ImageView)this.hqF.findViewById(a.a.nHt));
    this.oSU = ((ImageView)this.hqF.findViewById(a.a.bTl));
    this.oSV = ((TextView)this.hqF.findViewById(a.a.nHp));
    this.oSW = ((TextView)this.hqF.findViewById(a.a.nHq));
    this.oST.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(20479075155968L, 152581);
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          w.i("MicroMsg.FtsVideoPlayerSeekBar", "ontouch down");
          FtsVideoPlayerSeekBar.a(FtsVideoPlayerSeekBar.this);
          FtsVideoPlayerSeekBar.a(FtsVideoPlayerSeekBar.this, paramAnonymousMotionEvent.getX());
          FtsVideoPlayerSeekBar.b(FtsVideoPlayerSeekBar.this, ((FrameLayout.LayoutParams)FtsVideoPlayerSeekBar.b(FtsVideoPlayerSeekBar.this).getLayoutParams()).leftMargin);
          if (FtsVideoPlayerSeekBar.c(FtsVideoPlayerSeekBar.this) != null) {
            FtsVideoPlayerSeekBar.d(FtsVideoPlayerSeekBar.this).Xw();
          }
        }
        for (;;)
        {
          GMTrace.o(20479075155968L, 152581);
          return true;
          int i;
          if (paramAnonymousMotionEvent.getAction() == 2)
          {
            float f1 = paramAnonymousMotionEvent.getX();
            w.i("MicroMsg.FtsVideoPlayerSeekBar", "move dis %f ", new Object[] { Float.valueOf(f1 - FtsVideoPlayerSeekBar.e(FtsVideoPlayerSeekBar.this)) });
            float f2 = FtsVideoPlayerSeekBar.f(FtsVideoPlayerSeekBar.this);
            i = (int)(f1 - FtsVideoPlayerSeekBar.e(FtsVideoPlayerSeekBar.this) + f2);
            FtsVideoPlayerSeekBar.a(FtsVideoPlayerSeekBar.this, i);
            i = FtsVideoPlayerSeekBar.g(FtsVideoPlayerSeekBar.this);
            FtsVideoPlayerSeekBar.h(FtsVideoPlayerSeekBar.this).setText(FtsVideoPlayerSeekBar.iL(i / 60) + ":" + FtsVideoPlayerSeekBar.iL(i % 60));
            FtsVideoPlayerSeekBar.i(FtsVideoPlayerSeekBar.this);
          }
          else
          {
            w.i("MicroMsg.FtsVideoPlayerSeekBar", "ontouch up");
            i = FtsVideoPlayerSeekBar.k(FtsVideoPlayerSeekBar.this);
            if (FtsVideoPlayerSeekBar.l(FtsVideoPlayerSeekBar.this)) {
              i = FtsVideoPlayerSeekBar.b(FtsVideoPlayerSeekBar.this, FtsVideoPlayerSeekBar.g(FtsVideoPlayerSeekBar.this));
            }
            if (FtsVideoPlayerSeekBar.m(FtsVideoPlayerSeekBar.this) != null)
            {
              w.i("MicroMsg.FtsVideoPlayerSeekBar", "current time : " + i);
              FtsVideoPlayerSeekBar.n(FtsVideoPlayerSeekBar.this).iM(i);
            }
            FtsVideoPlayerSeekBar.o(FtsVideoPlayerSeekBar.this);
          }
        }
      }
    });
    this.oST.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
    {
      public final void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
      {
        GMTrace.i(20454781747200L, 152400);
        if (paramAnonymousInt3 - paramAnonymousInt1 != paramAnonymousInt7 - paramAnonymousInt5) {
          FtsVideoPlayerSeekBar.this.bgJ();
        }
        GMTrace.o(20454781747200L, 152400);
      }
    });
    this.oSS.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
    {
      public final void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
      {
        GMTrace.i(20475182841856L, 152552);
        if (paramAnonymousInt3 - paramAnonymousInt1 != paramAnonymousInt7 - paramAnonymousInt5) {
          FtsVideoPlayerSeekBar.this.bgJ();
        }
        GMTrace.o(20475182841856L, 152552);
      }
    });
    GMTrace.o(20460553109504L, 152443);
  }
  
  public final void jo(boolean paramBoolean)
  {
    GMTrace.i(20462029504512L, 152454);
    cp(paramBoolean);
    GMTrace.o(20462029504512L, 152454);
  }
  
  public final void seek(int paramInt)
  {
    GMTrace.i(20461089980416L, 152447);
    w.d("MicroMsg.FtsVideoPlayerSeekBar", "seek position : " + paramInt);
    int i = paramInt;
    if (paramInt < 0) {
      i = 0;
    }
    paramInt = i;
    if (i >= this.oSX) {
      paramInt = this.oSX;
    }
    if (this.jP != paramInt)
    {
      this.jP = paramInt;
      bgJ();
    }
    GMTrace.o(20461089980416L, 152447);
  }
  
  public final void tY(int paramInt)
  {
    GMTrace.i(20461224198144L, 152448);
    this.oSX = paramInt;
    this.jP = 0;
    this.oSW.setText(iL(this.oSX / 60) + ":" + iL(this.oSX % 60));
    bgJ();
    GMTrace.o(20461224198144L, 152448);
  }
  
  public void uM(int paramInt)
  {
    GMTrace.i(20461895286784L, 152453);
    seek(paramInt);
    GMTrace.o(20461895286784L, 152453);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\ui\FtsVideoPlayerSeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */