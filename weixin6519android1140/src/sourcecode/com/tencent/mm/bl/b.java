package com.tencent.mm.bl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Editable;
import android.view.MotionEvent;
import com.tencent.mm.api.e;
import com.tencent.mm.api.i;
import com.tencent.mm.api.j;
import com.tencent.mm.api.l;
import com.tencent.mm.api.m.a;

public abstract interface b
{
  public abstract boolean E(MotionEvent paramMotionEvent);
  
  public abstract com.tencent.mm.cache.d a(com.tencent.mm.d.a parama);
  
  public abstract void a(Editable paramEditable, int paramInt);
  
  public abstract void a(e parame);
  
  public abstract void a(j paramj, boolean paramBoolean);
  
  public abstract void a(m.a parama);
  
  public abstract void a(com.tencent.mm.view.a parama);
  
  public abstract void am(boolean paramBoolean);
  
  public abstract <T extends com.tencent.mm.d.b> T b(com.tencent.mm.api.d paramd);
  
  public abstract com.tencent.mm.api.d[] bNI();
  
  public abstract l bNJ();
  
  public abstract void bNK();
  
  public abstract com.tencent.mm.view.a bNL();
  
  public abstract m.a bNM();
  
  public abstract <T extends com.tencent.mm.d.b> T bNN();
  
  public abstract float bNO();
  
  public abstract Bitmap bNP();
  
  public abstract boolean bNQ();
  
  public abstract void c(i parami);
  
  public abstract Context getContext();
  
  public abstract void onAttachedToWindow();
  
  public abstract void onDestroy();
  
  public abstract void onDraw(Canvas paramCanvas);
  
  public abstract void onFinish();
  
  public abstract boolean os();
  
  public abstract void ow();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\bl\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */