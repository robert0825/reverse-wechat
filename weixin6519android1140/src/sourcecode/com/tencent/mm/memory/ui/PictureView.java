package com.tencent.mm.memory.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.a.a;
import com.tencent.mm.memory.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class PictureView
  extends ImageView
{
  private boolean DEBUG;
  private i gii;
  private boolean gij;
  private Runnable gik;
  
  public PictureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1280302907392L, 9539);
    this.DEBUG = false;
    this.gii = null;
    this.gij = false;
    this.gik = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1283926786048L, 9566);
        PictureView.a(PictureView.this);
        GMTrace.o(1283926786048L, 9566);
      }
    };
    GMTrace.o(1280302907392L, 9539);
  }
  
  public PictureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1280437125120L, 9540);
    this.DEBUG = false;
    this.gii = null;
    this.gij = false;
    this.gik = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1283926786048L, 9566);
        PictureView.a(PictureView.this);
        GMTrace.o(1283926786048L, 9566);
      }
    };
    GMTrace.o(1280437125120L, 9540);
  }
  
  private static void aA(Object paramObject)
  {
    GMTrace.i(1280839778304L, 9543);
    if ((paramObject != null) && ((paramObject instanceof i))) {
      ((i)paramObject).ym();
    }
    GMTrace.o(1280839778304L, 9543);
  }
  
  private static String az(Object paramObject)
  {
    GMTrace.i(1280571342848L, 9541);
    if (paramObject == null)
    {
      GMTrace.o(1280571342848L, 9541);
      return "NULL";
    }
    if ((paramObject instanceof a))
    {
      paramObject = paramObject + " hashcode " + paramObject.hashCode() + " " + ((a)paramObject).yu() + " " + ((a)paramObject).yu().hashCode();
      GMTrace.o(1280571342848L, 9541);
      return (String)paramObject;
    }
    paramObject = String.valueOf(paramObject);
    GMTrace.o(1280571342848L, 9541);
    return (String)paramObject;
  }
  
  private void onDetach()
  {
    GMTrace.i(1281108213760L, 9545);
    if (this.DEBUG) {
      w.i("MicroMsg.PictureView", "onDetach " + hashCode() + " " + bg.bQW().toString());
    }
    if (!this.gij)
    {
      GMTrace.o(1281108213760L, 9545);
      return;
    }
    this.gij = false;
    removeCallbacks(this.gik);
    postDelayed(this.gik, 500L);
    GMTrace.o(1281108213760L, 9545);
  }
  
  private void yv()
  {
    GMTrace.i(1280973996032L, 9544);
    removeCallbacks(this.gik);
    if (this.DEBUG) {
      w.i("MicroMsg.PictureView", "onAttach" + hashCode() + " " + bg.bQW().toString());
    }
    if (this.gij)
    {
      GMTrace.o(1280973996032L, 9544);
      return;
    }
    this.gij = true;
    GMTrace.o(1280973996032L, 9544);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(1281242431488L, 9546);
    super.onAttachedToWindow();
    yv();
    GMTrace.o(1281242431488L, 9546);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(1281376649216L, 9547);
    super.onDetachedFromWindow();
    onDetach();
    GMTrace.o(1281376649216L, 9547);
  }
  
  public void onFinishTemporaryDetach()
  {
    GMTrace.i(1281645084672L, 9549);
    super.onFinishTemporaryDetach();
    yv();
    GMTrace.o(1281645084672L, 9549);
  }
  
  public void onStartTemporaryDetach()
  {
    GMTrace.i(1281510866944L, 9548);
    super.onStartTemporaryDetach();
    onDetach();
    GMTrace.o(1281510866944L, 9548);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    GMTrace.i(1280705560576L, 9542);
    removeCallbacks(this.gik);
    if ((paramDrawable == null) || (paramDrawable.equals(this.gii)))
    {
      GMTrace.o(1280705560576L, 9542);
      return;
    }
    if (this.DEBUG) {
      w.i("MicroMsg.PictureView", "setImageDrawable " + hashCode() + " old: " + az(this.gii) + " new:" + az(paramDrawable) + " " + bg.bQW().toString());
    }
    aA(this.gii);
    if ((paramDrawable instanceof i)) {}
    for (this.gii = ((i)paramDrawable);; this.gii = null)
    {
      if ((paramDrawable != null) && ((paramDrawable instanceof i))) {
        ((i)paramDrawable).yl();
      }
      super.setImageDrawable(paramDrawable);
      GMTrace.o(1280705560576L, 9542);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\memory\ui\PictureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */