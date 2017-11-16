package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.f;

public final class d
  extends FrameLayout
  implements i<int[]>
{
  private boolean Tf;
  private boolean Tg;
  private final Drawable iRE;
  public LinearLayout iRF;
  private g iRG;
  public final YANumberPicker.a iRH;
  
  @android.support.a.a
  public d(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17650973409280L, 131510);
    this.iRH = new YANumberPicker.a()
    {
      public final void a(YANumberPicker paramAnonymousYANumberPicker, int paramAnonymousInt)
      {
        GMTrace.i(17649094361088L, 131496);
        if (d.a(d.this) != null)
        {
          int i = ((Integer)paramAnonymousYANumberPicker.getTag(o.f.hBd)).intValue();
          paramAnonymousYANumberPicker = d.a(d.this);
          if (paramAnonymousYANumberPicker.iRU != null) {
            paramAnonymousYANumberPicker.iRU.aO(new int[] { i, paramAnonymousInt });
          }
        }
        GMTrace.o(17649094361088L, 131496);
      }
    };
    this.iRE = paramContext.getResources().getDrawable(o.e.hAs);
    this.iRF = new LinearLayout(paramContext);
    this.iRF.setPadding(com.tencent.mm.br.a.fromDPToPix(paramContext, 2), 0, com.tencent.mm.br.a.fromDPToPix(paramContext, 2), 0);
    this.iRF.setOrientation(0);
    addView(this.iRF, new FrameLayout.LayoutParams(-1, -1, 17));
    this.iRF.setDividerDrawable(this.iRE);
    this.iRF.setShowDividers(2);
    GMTrace.o(17650973409280L, 131510);
  }
  
  public final void S(boolean paramBoolean)
  {
    GMTrace.i(17286438060032L, 128794);
    if (this.Tg != paramBoolean)
    {
      this.Tg = paramBoolean;
      if (paramBoolean)
      {
        long l = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0));
        GMTrace.o(17286438060032L, 128794);
        return;
      }
      if (this.Tf) {
        requestLayout();
      }
    }
    GMTrace.o(17286438060032L, 128794);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(17651241844736L, 131512);
    this.iRG = paramg;
    GMTrace.o(17651241844736L, 131512);
  }
  
  public final void adH()
  {
    GMTrace.i(17651376062464L, 131513);
    int j = adK();
    int i = 0;
    while (i < j)
    {
      f localf = km(i);
      if (localf != null) {
        localf.adU();
      }
      i += 1;
    }
    GMTrace.o(17651376062464L, 131513);
  }
  
  public final void adI()
  {
    GMTrace.i(17651644497920L, 131515);
    this.iRG = null;
    GMTrace.o(17651644497920L, 131515);
  }
  
  public final int adK()
  {
    GMTrace.i(17287109148672L, 128799);
    if (this.iRF == null)
    {
      GMTrace.o(17287109148672L, 128799);
      return 0;
    }
    int i = this.iRF.getChildCount();
    GMTrace.o(17287109148672L, 128799);
    return i;
  }
  
  public final void b(g paramg)
  {
    GMTrace.i(17651510280192L, 131514);
    this.iRG = paramg;
    GMTrace.o(17651510280192L, 131514);
  }
  
  public final View getView()
  {
    GMTrace.i(17287377584128L, 128801);
    GMTrace.o(17287377584128L, 128801);
    return this;
  }
  
  public final f km(int paramInt)
  {
    GMTrace.i(17651107627008L, 131511);
    if (paramInt < 0)
    {
      GMTrace.o(17651107627008L, 131511);
      return null;
    }
    if (this.iRF == null)
    {
      GMTrace.o(17651107627008L, 131511);
      return null;
    }
    f localf = (f)this.iRF.getChildAt(paramInt);
    GMTrace.o(17651107627008L, 131511);
    return localf;
  }
  
  public final void kn(int paramInt)
  {
    GMTrace.i(17287243366400L, 128800);
    if (paramInt <= 0)
    {
      GMTrace.o(17287243366400L, 128800);
      return;
    }
    int i = adK() - 1;
    while (paramInt > 0)
    {
      this.iRF.removeViewAt(i);
      i -= 1;
      paramInt -= 1;
    }
    GMTrace.o(17287243366400L, 128800);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17286706495488L, 128796);
    if (this.Tg)
    {
      GMTrace.o(17286706495488L, 128796);
      return false;
    }
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    GMTrace.o(17286706495488L, 128796);
    return bool;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17286840713216L, 128797);
    if (this.Tg)
    {
      GMTrace.o(17286840713216L, 128797);
      return false;
    }
    boolean bool = super.onTouchEvent(paramMotionEvent);
    GMTrace.o(17286840713216L, 128797);
    return bool;
  }
  
  public final void requestLayout()
  {
    GMTrace.i(17286572277760L, 128795);
    if (this.Tg)
    {
      this.Tf = true;
      GMTrace.o(17286572277760L, 128795);
      return;
    }
    super.requestLayout();
    GMTrace.o(17286572277760L, 128795);
  }
  
  public static final class a
  {
    public final String[] iRJ;
    public final int iRK;
    
    public a(String[] paramArrayOfString, int paramInt)
    {
      GMTrace.i(17285364318208L, 128786);
      this.iRJ = paramArrayOfString;
      this.iRK = Math.max(0, Math.min(paramInt, paramArrayOfString.length - 1));
      GMTrace.o(17285364318208L, 128786);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\picker\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */