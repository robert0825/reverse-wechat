package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.z.a.a;
import com.tencent.mm.plugin.z.a.b;
import com.tencent.mm.plugin.z.a.c;
import com.tencent.mm.sdk.platformtools.w;

public class AdVideoPlayerLoadingBar
  extends RelativeLayout
  implements a
{
  public View hqF;
  public int jP;
  public boolean jaO;
  public b oSQ;
  public ImageView oSR;
  public ImageView oSS;
  public ImageView oST;
  public ImageView oSU;
  public TextView oSV;
  public TextView oSW;
  public int oSX;
  private int oSY;
  private int oSZ;
  public float oTa;
  private int oTb;
  private int oTc;
  private int oTd;
  private int oTe;
  
  public AdVideoPlayerLoadingBar(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(9250554249216L, 68922);
    this.oSQ = null;
    this.hqF = null;
    this.oSS = null;
    this.oST = null;
    this.oSU = null;
    this.oSX = 0;
    this.jP = 0;
    this.oSY = 0;
    this.oSZ = 0;
    this.jaO = false;
    this.oTa = 0.0F;
    this.oTb = -1;
    this.oTc = -1;
    this.oTd = -1;
    this.oTe = -1;
    init();
    GMTrace.o(9250554249216L, 68922);
  }
  
  public AdVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9250688466944L, 68923);
    this.oSQ = null;
    this.hqF = null;
    this.oSS = null;
    this.oST = null;
    this.oSU = null;
    this.oSX = 0;
    this.jP = 0;
    this.oSY = 0;
    this.oSZ = 0;
    this.jaO = false;
    this.oTa = 0.0F;
    this.oTb = -1;
    this.oTc = -1;
    this.oTd = -1;
    this.oTe = -1;
    init();
    GMTrace.o(9250688466944L, 68923);
  }
  
  public AdVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9250822684672L, 68924);
    this.oSQ = null;
    this.hqF = null;
    this.oSS = null;
    this.oST = null;
    this.oSU = null;
    this.oSX = 0;
    this.jP = 0;
    this.oSY = 0;
    this.oSZ = 0;
    this.jaO = false;
    this.oTa = 0.0F;
    this.oTb = -1;
    this.oTc = -1;
    this.oTd = -1;
    this.oTe = -1;
    init();
    GMTrace.o(9250822684672L, 68924);
  }
  
  public static String iL(int paramInt)
  {
    GMTrace.i(9252701732864L, 68938);
    if (paramInt < 10)
    {
      String str = "0" + paramInt;
      GMTrace.o(9252701732864L, 68938);
      return str;
    }
    GMTrace.o(9252701732864L, 68938);
    return String.valueOf(paramInt);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(9251091120128L, 68926);
    this.oSQ = paramb;
    GMTrace.o(9251091120128L, 68926);
  }
  
  protected final int bgD()
  {
    GMTrace.i(9251762208768L, 68931);
    int i = ((FrameLayout.LayoutParams)this.oSS.getLayoutParams()).leftMargin;
    int j = this.oST.getPaddingLeft();
    i = Math.max(0, (int)((((FrameLayout.LayoutParams)this.oST.getLayoutParams()).leftMargin - (i - j) + (bgI() - this.oST.getPaddingLeft() - this.oST.getPaddingRight()) / 2) * 1.0D / bgG() * this.oSX));
    GMTrace.o(9251762208768L, 68931);
    return i;
  }
  
  public final int bgE()
  {
    GMTrace.i(9252030644224L, 68933);
    int i = this.oSX;
    GMTrace.o(9252030644224L, 68933);
    return i;
  }
  
  public final void bgF()
  {
    GMTrace.i(18915035971584L, 140928);
    this.oSW.setText(iL(this.oSX / 60) + ":" + iL(this.oSX % 60));
    bgJ();
    GMTrace.o(18915035971584L, 140928);
  }
  
  public int bgG()
  {
    GMTrace.i(9252299079680L, 68935);
    if (this.oSY <= 0) {
      this.oSY = this.oSS.getWidth();
    }
    int i = this.oSY;
    GMTrace.o(9252299079680L, 68935);
    return i;
  }
  
  public final void bgH()
  {
    GMTrace.i(9252433297408L, 68936);
    this.oSY = 0;
    GMTrace.o(9252433297408L, 68936);
  }
  
  public int bgI()
  {
    GMTrace.i(18915170189312L, 140929);
    if (this.oSZ <= 0) {
      this.oSZ = this.oST.getWidth();
    }
    int i = this.oSZ;
    GMTrace.o(18915170189312L, 140929);
    return i;
  }
  
  public void bgJ()
  {
    GMTrace.i(9252567515136L, 68937);
    if (this.oSX == 0)
    {
      GMTrace.o(9252567515136L, 68937);
      return;
    }
    if (this.jaO)
    {
      GMTrace.o(9252567515136L, 68937);
      return;
    }
    if (this.oST == null)
    {
      GMTrace.o(9252567515136L, 68937);
      return;
    }
    if (bgG() == 0)
    {
      GMTrace.o(9252567515136L, 68937);
      return;
    }
    int i = (bgI() - this.oST.getPaddingLeft() - this.oST.getPaddingRight()) / 2;
    this.oSV.setText(iL(this.jP / 60) + ":" + iL(this.jP % 60));
    int j = ((FrameLayout.LayoutParams)this.oSS.getLayoutParams()).leftMargin;
    int k = this.oST.getPaddingLeft();
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.oST.getLayoutParams();
    localLayoutParams.leftMargin = (j - k + (int)(this.jP * 1.0D / this.oSX * bgG()) - i);
    this.oST.setLayoutParams(localLayoutParams);
    localLayoutParams = (FrameLayout.LayoutParams)this.oSR.getLayoutParams();
    localLayoutParams.width = ((int)(this.jP * 1.0D / this.oSX * bgG()));
    this.oSR.setLayoutParams(localLayoutParams);
    GMTrace.o(9252567515136L, 68937);
  }
  
  public void cp(boolean paramBoolean)
  {
    GMTrace.i(9251627991040L, 68930);
    if (paramBoolean)
    {
      this.oSU.setImageResource(a.c.nHw);
      GMTrace.o(9251627991040L, 68930);
      return;
    }
    this.oSU.setImageResource(a.c.nHx);
    GMTrace.o(9251627991040L, 68930);
  }
  
  public final void d(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(9251493773312L, 68929);
    this.oSU.setOnClickListener(paramOnClickListener);
    GMTrace.o(9251493773312L, 68929);
  }
  
  public int getLayoutId()
  {
    GMTrace.i(9250956902400L, 68925);
    int i = a.b.nHv;
    GMTrace.o(9250956902400L, 68925);
    return i;
  }
  
  public void init()
  {
    GMTrace.i(9251225337856L, 68927);
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
        GMTrace.i(9250151596032L, 68919);
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          w.i("MicroMsg.VideoPlayerLoadingBar", "ontouch down");
          AdVideoPlayerLoadingBar.this.jaO = false;
          AdVideoPlayerLoadingBar.this.oTa = paramAnonymousMotionEvent.getX();
          if (AdVideoPlayerLoadingBar.this.oSQ != null) {
            AdVideoPlayerLoadingBar.this.oSQ.Xw();
          }
        }
        for (;;)
        {
          GMTrace.o(9250151596032L, 68919);
          return true;
          int i;
          if (paramAnonymousMotionEvent.getAction() == 2)
          {
            float f = paramAnonymousMotionEvent.getX();
            paramAnonymousView = (FrameLayout.LayoutParams)AdVideoPlayerLoadingBar.this.oST.getLayoutParams();
            i = paramAnonymousView.leftMargin;
            int j = (int)(f - AdVideoPlayerLoadingBar.this.oTa);
            paramAnonymousView.leftMargin = AdVideoPlayerLoadingBar.a(AdVideoPlayerLoadingBar.this, j + i);
            AdVideoPlayerLoadingBar.this.oST.setLayoutParams(paramAnonymousView);
            i = AdVideoPlayerLoadingBar.this.bgD();
            if (AdVideoPlayerLoadingBar.this.oSX > 0)
            {
              paramAnonymousView = (FrameLayout.LayoutParams)AdVideoPlayerLoadingBar.this.oSR.getLayoutParams();
              paramAnonymousView.width = ((int)(i * 1.0D / AdVideoPlayerLoadingBar.this.oSX * AdVideoPlayerLoadingBar.this.bgG()));
              AdVideoPlayerLoadingBar.this.oSR.setLayoutParams(paramAnonymousView);
            }
            AdVideoPlayerLoadingBar.this.oSV.setText(AdVideoPlayerLoadingBar.iL(i / 60) + ":" + AdVideoPlayerLoadingBar.iL(i % 60));
            AdVideoPlayerLoadingBar.this.jaO = true;
          }
          else if (AdVideoPlayerLoadingBar.this.jaO)
          {
            i = AdVideoPlayerLoadingBar.this.bgD();
            if (AdVideoPlayerLoadingBar.this.oSQ != null)
            {
              w.i("MicroMsg.VideoPlayerLoadingBar", "current time : " + i);
              AdVideoPlayerLoadingBar.this.oSQ.iM(i);
            }
            AdVideoPlayerLoadingBar.this.jaO = false;
          }
        }
      }
    });
    this.oST.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9254043910144L, 68948);
        int i = (AdVideoPlayerLoadingBar.this.bgI() - AdVideoPlayerLoadingBar.this.oST.getPaddingLeft() - AdVideoPlayerLoadingBar.this.oST.getPaddingRight()) / 2;
        int j = ((FrameLayout.LayoutParams)AdVideoPlayerLoadingBar.this.oSS.getLayoutParams()).leftMargin;
        int k = AdVideoPlayerLoadingBar.this.oST.getPaddingLeft();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)AdVideoPlayerLoadingBar.this.oST.getLayoutParams();
        localLayoutParams.leftMargin = (j - k - i);
        AdVideoPlayerLoadingBar.this.oST.setLayoutParams(localLayoutParams);
        GMTrace.o(9254043910144L, 68948);
      }
    });
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.oSR.getLayoutParams();
    localLayoutParams.width = 0;
    this.oSR.setLayoutParams(localLayoutParams);
    GMTrace.o(9251225337856L, 68927);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(9251359555584L, 68928);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.oSY = 0;
    if ((paramInt1 != this.oTb) || (paramInt2 != this.oTc) || (paramInt3 != this.oTd) || (paramInt4 != this.oTe)) {
      bgJ();
    }
    this.oTb = paramInt1;
    this.oTc = paramInt2;
    this.oTd = paramInt3;
    this.oTe = paramInt4;
    GMTrace.o(9251359555584L, 68928);
  }
  
  public void seek(int paramInt)
  {
    GMTrace.i(9251896426496L, 68932);
    this.jP = paramInt;
    bgJ();
    GMTrace.o(9251896426496L, 68932);
  }
  
  public void tY(int paramInt)
  {
    GMTrace.i(9252164861952L, 68934);
    this.oSX = paramInt;
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18914767536128L, 140926);
          AdVideoPlayerLoadingBar.this.bgF();
          GMTrace.o(18914767536128L, 140926);
        }
      });
      GMTrace.o(9252164861952L, 68934);
      return;
    }
    bgF();
    GMTrace.o(9252164861952L, 68934);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\sight\decode\ui\AdVideoPlayerLoadingBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */