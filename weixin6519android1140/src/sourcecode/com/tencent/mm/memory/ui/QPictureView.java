package com.tencent.mm.memory.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.a.a;
import com.tencent.mm.memory.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.QImageView;

public class QPictureView
  extends QImageView
{
  private boolean DEBUG;
  private i gii;
  private boolean gij;
  private Runnable gik;
  
  public QPictureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1281913520128L, 9551);
    this.DEBUG = false;
    this.gii = null;
    this.gij = false;
    this.gik = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1283658350592L, 9564);
        QPictureView.a(QPictureView.this);
        GMTrace.o(1283658350592L, 9564);
      }
    };
    GMTrace.o(1281913520128L, 9551);
  }
  
  public QPictureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1282047737856L, 9552);
    this.DEBUG = false;
    this.gii = null;
    this.gij = false;
    this.gik = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1283658350592L, 9564);
        QPictureView.a(QPictureView.this);
        GMTrace.o(1283658350592L, 9564);
      }
    };
    GMTrace.o(1282047737856L, 9552);
  }
  
  private static void aA(Object paramObject)
  {
    GMTrace.i(1282450391040L, 9555);
    if ((paramObject != null) && ((paramObject instanceof i))) {
      ((i)paramObject).ym();
    }
    GMTrace.o(1282450391040L, 9555);
  }
  
  private static String az(Object paramObject)
  {
    GMTrace.i(1282181955584L, 9553);
    if (paramObject == null)
    {
      GMTrace.o(1282181955584L, 9553);
      return "NULL";
    }
    if ((paramObject instanceof a))
    {
      paramObject = paramObject + " hashcode " + paramObject.hashCode() + " " + ((a)paramObject).yu() + " " + ((a)paramObject).yu().hashCode();
      GMTrace.o(1282181955584L, 9553);
      return (String)paramObject;
    }
    paramObject = String.valueOf(paramObject);
    GMTrace.o(1282181955584L, 9553);
    return (String)paramObject;
  }
  
  private void onDetach()
  {
    GMTrace.i(1282718826496L, 9557);
    if (this.DEBUG) {
      w.i("MicroMsg.QPictureView", "onDetach " + hashCode() + " " + bg.bQW().toString());
    }
    if (!this.gij)
    {
      GMTrace.o(1282718826496L, 9557);
      return;
    }
    this.gij = false;
    removeCallbacks(this.gik);
    postDelayed(this.gik, 500L);
    GMTrace.o(1282718826496L, 9557);
  }
  
  private void yv()
  {
    GMTrace.i(1282584608768L, 9556);
    if (this.DEBUG) {
      w.i("MicroMsg.QPictureView", "onAttach" + hashCode() + " " + bg.bQW().toString());
    }
    removeCallbacks(this.gik);
    if (this.gij)
    {
      GMTrace.o(1282584608768L, 9556);
      return;
    }
    this.gij = true;
    GMTrace.o(1282584608768L, 9556);
  }
  
  public void onAttachedToWindow()
  {
    GMTrace.i(1282853044224L, 9558);
    super.onAttachedToWindow();
    yv();
    GMTrace.o(1282853044224L, 9558);
  }
  
  public void onDetachedFromWindow()
  {
    GMTrace.i(1282987261952L, 9559);
    super.onDetachedFromWindow();
    onDetach();
    GMTrace.o(1282987261952L, 9559);
  }
  
  public void onFinishTemporaryDetach()
  {
    GMTrace.i(1283255697408L, 9561);
    super.onFinishTemporaryDetach();
    yv();
    GMTrace.o(1283255697408L, 9561);
  }
  
  public void onStartTemporaryDetach()
  {
    GMTrace.i(1283121479680L, 9560);
    super.onStartTemporaryDetach();
    onDetach();
    GMTrace.o(1283121479680L, 9560);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    GMTrace.i(1282316173312L, 9554);
    removeCallbacks(this.gik);
    if ((paramDrawable == null) || (paramDrawable.equals(this.gii)))
    {
      GMTrace.o(1282316173312L, 9554);
      return;
    }
    if (this.DEBUG) {
      w.i("MicroMsg.QPictureView", "setImageDrawable " + hashCode() + " old: " + az(this.gii) + " new:" + az(paramDrawable) + " " + bg.bQW().toString());
    }
    aA(this.gii);
    if ((paramDrawable instanceof i)) {}
    for (this.gii = ((i)paramDrawable);; this.gii = null)
    {
      if ((paramDrawable != null) && ((paramDrawable instanceof i))) {
        ((i)paramDrawable).yl();
      }
      super.setImageDrawable(paramDrawable);
      GMTrace.o(1282316173312L, 9554);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\memory\ui\QPictureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */