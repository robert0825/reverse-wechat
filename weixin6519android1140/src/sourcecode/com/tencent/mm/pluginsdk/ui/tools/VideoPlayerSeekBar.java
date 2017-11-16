package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
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
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.w;

public class VideoPlayerSeekBar
  extends AdVideoPlayerLoadingBar
  implements g
{
  public boolean eIC;
  private int rCS;
  private int rCT;
  private int rCU;
  private PInt tHh;
  
  public VideoPlayerSeekBar(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1079647404032L, 8044);
    this.tHh = new PInt();
    this.eIC = false;
    this.rCS = -1;
    this.rCT = -1;
    this.rCU = -1;
    GMTrace.o(1079647404032L, 8044);
  }
  
  public VideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1079781621760L, 8045);
    this.tHh = new PInt();
    this.eIC = false;
    this.rCS = -1;
    this.rCT = -1;
    this.rCU = -1;
    GMTrace.o(1079781621760L, 8045);
  }
  
  public VideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1079915839488L, 8046);
    this.tHh = new PInt();
    this.eIC = false;
    this.rCS = -1;
    this.rCT = -1;
    this.rCU = -1;
    GMTrace.o(1079915839488L, 8046);
  }
  
  private int bNo()
  {
    GMTrace.i(1080318492672L, 8049);
    if (this.rCT == -1) {
      this.rCT = this.oST.getPaddingLeft();
    }
    int i = this.rCT;
    GMTrace.o(1080318492672L, 8049);
    return i;
  }
  
  private int bNp()
  {
    GMTrace.i(1080452710400L, 8050);
    if (this.rCU == -1) {
      this.rCU = this.oST.getPaddingRight();
    }
    int i = this.rCU;
    GMTrace.o(1080452710400L, 8050);
    return i;
  }
  
  protected final int bgI()
  {
    GMTrace.i(1080184274944L, 8048);
    if (this.rCS == -1) {
      this.rCS = this.oST.getWidth();
    }
    int i = this.rCS;
    GMTrace.o(1080184274944L, 8048);
    return i;
  }
  
  public final void bgJ()
  {
    GMTrace.i(1080989581312L, 8054);
    if (this.oSX == 0)
    {
      GMTrace.o(1080989581312L, 8054);
      return;
    }
    if (this.jaO)
    {
      GMTrace.o(1080989581312L, 8054);
      return;
    }
    if (this.oST == null)
    {
      GMTrace.o(1080989581312L, 8054);
      return;
    }
    if (bgG() == 0)
    {
      GMTrace.o(1080989581312L, 8054);
      return;
    }
    this.oSV.setText(iL(this.jP / 60) + ":" + iL(this.jP % 60));
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.oST.getLayoutParams();
    int j = bgG();
    int i = this.jP;
    if (i <= 0)
    {
      this.oSS.getLayoutParams();
      i = 0;
    }
    for (;;)
    {
      localLayoutParams.leftMargin = i;
      this.oST.setLayoutParams(localLayoutParams);
      localLayoutParams = (FrameLayout.LayoutParams)this.oSR.getLayoutParams();
      double d = this.jP * 1.0D / this.oSX;
      localLayoutParams.width = ((int)(j * d));
      this.oSR.setLayoutParams(localLayoutParams);
      requestLayout();
      GMTrace.o(1080989581312L, 8054);
      return;
      if (i >= this.oSX) {
        i = j - (bgI() - bNo() - bNp()) / 2;
      } else {
        i = (int)(i * 1.0D / this.oSX * j);
      }
    }
  }
  
  public void cp(boolean paramBoolean)
  {
    GMTrace.i(1081258016768L, 8056);
    this.eIC = paramBoolean;
    super.cp(paramBoolean);
    GMTrace.o(1081258016768L, 8056);
  }
  
  public final void f(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(1081123799040L, 8055);
    if (this.oSU != null) {
      this.oSU.setOnClickListener(paramOnClickListener);
    }
    GMTrace.o(1081123799040L, 8055);
  }
  
  public int getLayoutId()
  {
    GMTrace.i(15305652830208L, 114036);
    int i = a.b.cku;
    GMTrace.o(15305652830208L, 114036);
    return i;
  }
  
  public void init()
  {
    GMTrace.i(1080050057216L, 8047);
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
        GMTrace.i(1104209248256L, 8227);
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          w.i("MicroMsg.VideoPlayerSeekBar", "ontouch down");
          VideoPlayerSeekBar.a(VideoPlayerSeekBar.this);
          VideoPlayerSeekBar.a(VideoPlayerSeekBar.this, paramAnonymousMotionEvent.getX());
          if (VideoPlayerSeekBar.b(VideoPlayerSeekBar.this) != null) {
            VideoPlayerSeekBar.c(VideoPlayerSeekBar.this).Xw();
          }
        }
        for (;;)
        {
          GMTrace.o(1104209248256L, 8227);
          return true;
          int i;
          if (paramAnonymousMotionEvent.getAction() == 2)
          {
            float f = paramAnonymousMotionEvent.getX();
            paramAnonymousView = (FrameLayout.LayoutParams)VideoPlayerSeekBar.d(VideoPlayerSeekBar.this).getLayoutParams();
            paramAnonymousMotionEvent = VideoPlayerSeekBar.this;
            i = paramAnonymousView.leftMargin;
            i = VideoPlayerSeekBar.a(paramAnonymousMotionEvent, (int)(f - VideoPlayerSeekBar.e(VideoPlayerSeekBar.this)) + i, VideoPlayerSeekBar.f(VideoPlayerSeekBar.this));
            paramAnonymousView.leftMargin = i;
            VideoPlayerSeekBar.g(VideoPlayerSeekBar.this).setLayoutParams(paramAnonymousView);
            int j = VideoPlayerSeekBar.f(VideoPlayerSeekBar.this).value;
            if (VideoPlayerSeekBar.h(VideoPlayerSeekBar.this) > 0)
            {
              paramAnonymousView = (FrameLayout.LayoutParams)VideoPlayerSeekBar.i(VideoPlayerSeekBar.this).getLayoutParams();
              paramAnonymousView.width = i;
              VideoPlayerSeekBar.j(VideoPlayerSeekBar.this).setLayoutParams(paramAnonymousView);
            }
            VideoPlayerSeekBar.k(VideoPlayerSeekBar.this).setText(VideoPlayerSeekBar.iL(j / 60) + ":" + VideoPlayerSeekBar.iL(j % 60));
            VideoPlayerSeekBar.l(VideoPlayerSeekBar.this);
          }
          else
          {
            i = VideoPlayerSeekBar.m(VideoPlayerSeekBar.this);
            if (VideoPlayerSeekBar.n(VideoPlayerSeekBar.this)) {
              i = VideoPlayerSeekBar.a(VideoPlayerSeekBar.this, VideoPlayerSeekBar.f(VideoPlayerSeekBar.this).value);
            }
            if (VideoPlayerSeekBar.o(VideoPlayerSeekBar.this) != null)
            {
              w.i("MicroMsg.VideoPlayerSeekBar", "current time : " + i);
              VideoPlayerSeekBar.p(VideoPlayerSeekBar.this).iM(i);
            }
            VideoPlayerSeekBar.q(VideoPlayerSeekBar.this);
          }
        }
      }
    });
    GMTrace.o(1080050057216L, 8047);
  }
  
  public final void jo(boolean paramBoolean)
  {
    GMTrace.i(16402614321152L, 122209);
    cp(paramBoolean);
    GMTrace.o(16402614321152L, 122209);
  }
  
  public final void seek(int paramInt)
  {
    GMTrace.i(1080721145856L, 8052);
    w.d("MicroMsg.VideoPlayerSeekBar", "seek position : " + paramInt);
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
    GMTrace.o(1080721145856L, 8052);
  }
  
  public final void tY(int paramInt)
  {
    GMTrace.i(1080855363584L, 8053);
    this.oSX = paramInt;
    this.jP = 0;
    this.oSW.setText(iL(this.oSX / 60) + ":" + iL(this.oSX % 60));
    bgJ();
    GMTrace.o(1080855363584L, 8053);
  }
  
  public final void uM(int paramInt)
  {
    GMTrace.i(16402480103424L, 122208);
    seek(paramInt);
    GMTrace.o(16402480103424L, 122208);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\VideoPlayerSeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */