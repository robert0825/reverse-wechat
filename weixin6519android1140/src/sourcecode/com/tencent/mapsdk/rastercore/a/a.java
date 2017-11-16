package com.tencent.mapsdk.rastercore.a;

import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.tencent.mapsdk.rastercore.d.b;
import com.tencent.mapsdk.rastercore.d.e;
import com.tencent.mapsdk.rastercore.d.f;
import com.tencent.tencentmap.mapsdk.map.c;

public abstract class a
{
  protected e a;
  protected b b;
  protected c c;
  private a d = a.c;
  public Handler e = new Handler();
  public Scroller f;
  private long g;
  public float h = 0.0F;
  public boolean i = false;
  public double j = 0.0D;
  public Runnable k = new Runnable()
  {
    public final void run()
    {
      if (a.this.f.computeScrollOffset())
      {
        float f1 = a.this.f.getCurrX() * 1.0F / 10000.0F;
        float f2 = f1 - a.this.h;
        a.this.j += f2;
        if (a.this.j < 1.0D) {
          a.this.a(f2);
        }
        a.this.h = f1;
        if (a.this.i) {
          a.this.e.postDelayed(a.this.k, 5L);
        }
        a.this.a.h().a(false);
        return;
      }
      a.this.d();
      if (a.this.c != null) {
        a.this.c.onFinish();
      }
      a.this.i = false;
      a.this.a.h().a(true);
    }
  };
  
  public a(e parame, long paramLong, c paramc)
  {
    this.a = parame;
    this.b = parame.c();
    this.g = paramLong;
    this.c = paramc;
  }
  
  public final void a()
  {
    switch (2.a[this.d.ordinal()])
    {
    default: 
      this.f = new Scroller(e.a());
    }
    for (;;)
    {
      c();
      this.i = true;
      this.f.startScroll(0, 0, 10000, 0, (int)this.g);
      this.e.postDelayed(this.k, 5L);
      this.a.a(false, false);
      return;
      this.f = new Scroller(e.a(), new AccelerateInterpolator());
      continue;
      this.f = new Scroller(e.a(), new DecelerateInterpolator());
      continue;
      this.f = new Scroller(e.a(), new AccelerateDecelerateInterpolator());
    }
  }
  
  protected abstract void a(float paramFloat);
  
  public final void a(a parama)
  {
    this.d = parama;
  }
  
  public final void b()
  {
    if (this.i)
    {
      this.i = false;
      if (this.c != null) {
        this.c.onCancel();
      }
      this.a.h().a(true);
    }
  }
  
  protected abstract void c();
  
  protected abstract void d();
  
  public static enum a
  {
    private a() {}
    
    public static a[] a()
    {
      return (a[])d.clone();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */