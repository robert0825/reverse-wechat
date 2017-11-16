package com.tencent.mapsdk.rastercore.d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.rastercore.a.a.a;
import com.tencent.mapsdk.rastercore.d.a;
import com.tencent.tencentmap.mapsdk.map.g.f;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public final class b
  extends View
{
  private e a;
  private c b;
  private boolean c = false;
  private volatile boolean d = false;
  private List<Runnable> e = new Vector();
  private com.tencent.mapsdk.rastercore.b.a f;
  private com.tencent.mapsdk.rastercore.b.c g = null;
  private PointF h = null;
  private g.f i;
  private final Handler j = new Handler()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default: 
      case 11: 
        do
        {
          return;
          paramAnonymousMessage = b.a(b.this).iterator();
          while (paramAnonymousMessage.hasNext()) {
            ((Runnable)paramAnonymousMessage.next()).run();
          }
          b.a(b.this).clear();
        } while (b.b(b.this) == null);
        b.b(b.this).Ue();
        return;
      }
      b.c(b.this).o();
    }
  };
  private com.tencent.mapsdk.rastercore.a.c k;
  private com.tencent.mapsdk.rastercore.a.b l;
  
  public b(e parame)
  {
    super(e.a());
    this.a = parame;
    this.b = parame.b();
    this.f = new com.tencent.mapsdk.rastercore.b.a(10.0D);
    if ((parame.f().a() >= 3) && (parame.f().b() > 1.0F)) {
      this.f.a(1.3D);
    }
    this.g = d.a.a(new LatLng(39.91669D, 116.39716D));
    this.h = new PointF(getWidth() / 2, getHeight() / 2);
    com.tencent.mapsdk.rastercore.f.a.a(this, 2);
  }
  
  private com.tencent.mapsdk.rastercore.b.c a(int paramInt1, int paramInt2)
  {
    return new com.tencent.mapsdk.rastercore.b.c(this.g.b() + paramInt1 * this.f.d(), this.g.a() - paramInt2 * this.f.d());
  }
  
  private void a(com.tencent.mapsdk.rastercore.b.a parama, PointF paramPointF)
  {
    double d1 = getWidth() / 2.0D;
    double d2 = getHeight() / 2.0D;
    double d3 = this.g.b();
    double d4 = paramPointF.x;
    double d5 = this.f.d();
    double d6 = paramPointF.x;
    double d7 = parama.d();
    double d8 = this.g.a();
    double d9 = paramPointF.y;
    double d10 = this.f.d();
    double d11 = paramPointF.y;
    double d12 = parama.d();
    this.g.b(d3 + ((d4 - d1) * d5 + (d1 - d6) * d7));
    this.g.a(d8 - ((d9 - d2) * d10 + (d2 - d11) * d12));
    this.h.x = ((int)d1);
    this.h.y = ((int)d2);
    this.f.b(parama.c());
    this.b.a(this.g);
    this.a.a(false, false);
  }
  
  private void b(double paramDouble, PointF paramPointF, boolean paramBoolean, long paramLong, com.tencent.tencentmap.mapsdk.map.c paramc)
  {
    a(paramDouble, paramPointF, paramBoolean, paramLong, a.a.c, paramc);
  }
  
  private PointF e()
  {
    return new PointF(getWidth() / 2, getHeight() / 2);
  }
  
  public final PointF a()
  {
    return this.h;
  }
  
  public final void a(double paramDouble, PointF paramPointF)
  {
    double d1 = this.f.b();
    a(this.b.a(new com.tencent.mapsdk.rastercore.b.a(this.f.a(), d1 * paramDouble)), paramPointF);
  }
  
  public final void a(double paramDouble, PointF paramPointF, boolean paramBoolean, long paramLong, a.a parama, com.tencent.tencentmap.mapsdk.map.c paramc)
  {
    if (paramBoolean)
    {
      if (this.k != null) {
        this.k.b();
      }
      this.k = new com.tencent.mapsdk.rastercore.a.c(this.a, paramDouble, paramPointF, paramLong, paramc);
      this.k.a(parama);
      this.k.a();
    }
    do
    {
      return;
      a(this.b.a(new com.tencent.mapsdk.rastercore.b.a(paramDouble)), paramPointF);
    } while (paramc == null);
    paramc.onFinish();
  }
  
  public final void a(double paramDouble, PointF paramPointF, boolean paramBoolean, long paramLong, com.tencent.tencentmap.mapsdk.map.c paramc)
  {
    b(paramDouble, paramPointF, false, 0L, null);
  }
  
  public final void a(double paramDouble, PointF paramPointF, boolean paramBoolean, com.tencent.tencentmap.mapsdk.map.c paramc)
  {
    b(this.f.c() + paramDouble, paramPointF, paramBoolean, 500L, paramc);
  }
  
  public final void a(double paramDouble, boolean paramBoolean, com.tencent.tencentmap.mapsdk.map.c paramc)
  {
    b(this.f.c() + paramDouble, e(), paramBoolean, 500L, paramc);
  }
  
  public final void a(int paramInt1, int paramInt2, long paramLong, com.tencent.tencentmap.mapsdk.map.c paramc)
  {
    a(a(paramInt1, paramInt2), paramLong, paramc);
  }
  
  public final void a(PointF paramPointF, boolean paramBoolean, com.tencent.tencentmap.mapsdk.map.c paramc)
  {
    b(1.0D + this.f.c(), paramPointF, true, 500L, null);
  }
  
  public final void a(com.tencent.mapsdk.rastercore.b.c paramc)
  {
    this.g = paramc;
    this.b.a(this.g);
    this.a.a(false, false);
  }
  
  public final void a(com.tencent.mapsdk.rastercore.b.c paramc, long paramLong, com.tencent.tencentmap.mapsdk.map.c paramc1)
  {
    if (this.l != null) {
      this.l.b();
    }
    this.l = new com.tencent.mapsdk.rastercore.a.b(this.a, paramc, paramLong, paramc1);
    this.l.a();
  }
  
  public final void a(final com.tencent.mapsdk.rastercore.c.a parama)
  {
    if ((!this.d) && (parama.a()))
    {
      this.e.add(new Runnable()
      {
        public final void run()
        {
          parama.a(b.c(b.this));
        }
      });
      return;
    }
    parama.a(this.a);
  }
  
  public final void a(g.f paramf)
  {
    this.i = paramf;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.c = true;
  }
  
  public final void a(boolean paramBoolean, com.tencent.tencentmap.mapsdk.map.c paramc)
  {
    b(1.0D + this.f.c(), e(), paramBoolean, 500L, paramc);
  }
  
  public final com.tencent.mapsdk.rastercore.b.c b()
  {
    return this.g;
  }
  
  public final void b(double paramDouble, boolean paramBoolean, com.tencent.tencentmap.mapsdk.map.c paramc)
  {
    b(paramDouble, e(), paramBoolean, 500L, paramc);
  }
  
  public final void b(com.tencent.mapsdk.rastercore.b.c paramc)
  {
    a(paramc);
  }
  
  public final void b(boolean paramBoolean, com.tencent.tencentmap.mapsdk.map.c paramc)
  {
    b(this.f.c() - 1.0D, e(), paramBoolean, 500L, paramc);
  }
  
  public final double c()
  {
    return this.f.c();
  }
  
  public final void clearAnimation()
  {
    super.clearAnimation();
    if (this.l != null) {
      this.l.b();
    }
    if (this.k != null) {
      this.k.b();
    }
  }
  
  public final com.tencent.mapsdk.rastercore.b.a d()
  {
    return this.f;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (!this.d)
    {
      this.j.sendEmptyMessage(11);
      this.d = true;
    }
    boolean bool = this.a.g().a(paramCanvas);
    this.a.e().a(paramCanvas);
    if (!e.q())
    {
      Paint localPaint = new Paint();
      localPaint.setColor(-65536);
      localPaint.setTextSize(50.0F);
      Rect localRect = new Rect();
      int m = getWidth();
      int n = getHeight();
      localPaint.getTextBounds("鉴权失败，请到腾讯", 0, "鉴权失败，请到腾讯".length(), localRect);
      paramCanvas.drawText("鉴权失败，请到腾讯", m / 2 - localRect.width() / 2, n / 2 - localRect.height(), localPaint);
      localPaint.getTextBounds("地图官网申请密钥", 0, "地图官网申请密钥".length(), localRect);
      paramCanvas.drawText("地图官网申请密钥", m / 2 - localRect.width() / 2, n / 2 + 2, localPaint);
    }
    this.a.b(bool);
    if ((this.c) && (bool))
    {
      this.c = false;
      this.j.sendEmptyMessage(16);
    }
  }
  
  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.b.g() != 0.0D) && (this.b.h() != 0.0D))
    {
      this.b.b(this.b.g(), this.b.h());
      this.b.a(0);
      this.b.b(0);
    }
    this.h = new PointF(getWidth() / 2, getHeight() / 2);
    paramInt1 = com.tencent.mapsdk.rastercore.b.a.a;
    paramInt2 = Math.max(getWidth(), getHeight());
    while (256.0D * Math.pow(2.0D, paramInt1) < paramInt2) {
      paramInt1 += 1;
    }
    com.tencent.mapsdk.rastercore.b.a.a = paramInt1;
    if (this.b.j().a() < com.tencent.mapsdk.rastercore.b.a.a) {
      this.b.d(com.tencent.mapsdk.rastercore.b.a.a);
    }
    this.a.a(false, false);
  }
  
  public final void scrollBy(int paramInt1, int paramInt2)
  {
    a(a(paramInt1, paramInt2));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */