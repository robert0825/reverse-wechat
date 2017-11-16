package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.g;
import java.util.Timer;
import java.util.TimerTask;

public class CropImageView
  extends ImageView
{
  int eLJ;
  private float jqu;
  Bitmap lEg;
  private float lUn;
  float lYe;
  float lYf;
  private Timer lmz;
  private long mBs;
  private View.OnTouchListener nft;
  private boolean qaZ;
  boolean wgT;
  Drawable wgU;
  private ae xgA;
  a xgB;
  boolean xgC;
  boolean xgf;
  private boolean xgg;
  private float xgh;
  private float xgi;
  private PointF xgj;
  boolean xgk;
  private boolean xgl;
  private boolean xgm;
  private boolean xgn;
  private boolean xgo;
  private boolean xgp;
  private boolean xgq;
  private boolean xgr;
  private float xgs;
  private float xgt;
  private float xgu;
  private c xgv;
  private boolean xgw;
  private Timer xgx;
  private ae xgy;
  private b xgz;
  
  public CropImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2052457496576L, 15292);
    this.xgf = true;
    this.xgg = false;
    this.xgj = new PointF();
    this.lYe = 0.0F;
    this.lYf = 0.0F;
    this.xgk = false;
    this.xgl = false;
    this.xgm = false;
    this.xgn = false;
    this.xgo = false;
    this.xgp = false;
    this.xgq = false;
    this.xgr = false;
    this.xgs = 1.0F;
    this.xgt = 0.0F;
    this.xgu = 0.0F;
    this.lmz = new Timer(true);
    this.xgv = null;
    this.xgw = false;
    this.qaZ = false;
    this.xgy = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(1919179292672L, 14299);
        w.d("MicroMsg.CropImageView", "on handler");
        if (paramAnonymousMessage.what == 4659) {
          CropImageView.this.cig();
        }
        do
        {
          for (;;)
          {
            super.handleMessage(paramAnonymousMessage);
            GMTrace.o(1919179292672L, 14299);
            return;
            if (paramAnonymousMessage.what == 4658)
            {
              CropImageView.this.cih();
            }
            else
            {
              if (paramAnonymousMessage.what != 4660) {
                break;
              }
              if ((CropImageView.a(CropImageView.this) != null) && (CropImageView.b(CropImageView.this) != null))
              {
                CropImageView.b(CropImageView.this).cancel();
                CropImageView.c(CropImageView.this);
              }
            }
          }
        } while (paramAnonymousMessage.what != 4661);
        MotionEvent localMotionEvent = (MotionEvent)paramAnonymousMessage.obj;
        CropImageView.a(CropImageView.this, System.currentTimeMillis());
        CropImageView.a(CropImageView.this, false);
        if ((localMotionEvent.getRawX() - CropImageView.d(CropImageView.this) > 10.0F) || (localMotionEvent.getRawY() - CropImageView.e(CropImageView.this) > 10.0F) || (localMotionEvent.getRawX() - CropImageView.d(CropImageView.this) < -10.0F) || (localMotionEvent.getRawY() - CropImageView.e(CropImageView.this) < -10.0F)) {}
        for (int i = 0;; i = 1)
        {
          if (i != 0)
          {
            long l = System.currentTimeMillis();
            if ((CropImageView.f(CropImageView.this) != 0L) && (l - CropImageView.f(CropImageView.this) < 300L) && (l - CropImageView.f(CropImageView.this) >= 0L) && (CropImageView.g(CropImageView.this) != null)) {
              CropImageView.g(CropImageView.this).cie();
            }
            CropImageView.a(CropImageView.this, 0L);
          }
          g.a(CropImageView.h(CropImageView.this), CropImageView.i(CropImageView.this));
          break;
        }
      }
    };
    this.xgz = null;
    this.xgA = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(1944680660992L, 14489);
        if (paramAnonymousMessage.what == 4653) {
          if ((CropImageView.a(CropImageView.this) != null) && (CropImageView.m(CropImageView.this) != null))
          {
            CropImageView.m(CropImageView.this).cancel();
            CropImageView.n(CropImageView.this);
          }
        }
        for (;;)
        {
          super.handleMessage(paramAnonymousMessage);
          GMTrace.o(1944680660992L, 14489);
          return;
          CropImageView.o(CropImageView.this);
        }
      }
    };
    this.eLJ = 0;
    this.xgC = true;
    this.nft = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, final MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(2016218710016L, 15022);
        if (!CropImageView.u(CropImageView.this))
        {
          GMTrace.o(2016218710016L, 15022);
          return false;
        }
        if (CropImageView.i(CropImageView.this) == null)
        {
          GMTrace.o(2016218710016L, 15022);
          return false;
        }
        int i = paramAnonymousMotionEvent.getAction() & 0xFF;
        w.d("MicroMsg.CropImageView", "on touch : event type=" + i + ", isDownOnImg=" + CropImageView.v(CropImageView.this));
        if ((!CropImageView.v(CropImageView.this)) && (i != 0))
        {
          GMTrace.o(2016218710016L, 15022);
          return false;
        }
        switch (i)
        {
        }
        for (;;)
        {
          GMTrace.o(2016218710016L, 15022);
          return false;
          w.d("MicroMsg.CropImageView", "action_mult_down");
          CropImageView.b(CropImageView.this, true);
          CropImageView.this.lYe = g.G(paramAnonymousMotionEvent);
          if (CropImageView.this.lYe > 5.0F)
          {
            CropImageView.this.xgk = true;
            g.a(CropImageView.h(CropImageView.this), paramAnonymousMotionEvent);
            GMTrace.o(2016218710016L, 15022);
            return true;
            w.d("MicroMsg.CropImageView", "action_mult_up");
            CropImageView.this.xgk = false;
            CropImageView.b(CropImageView.this, true);
            GMTrace.o(2016218710016L, 15022);
            return true;
            w.d("MicroMsg.CropImageView", "action_down");
            CropImageView.a(CropImageView.this, paramAnonymousMotionEvent.getRawX());
            CropImageView.b(CropImageView.this, paramAnonymousMotionEvent.getRawY());
            w.d("MicroMsg.CropImageView", "lastX=" + CropImageView.w(CropImageView.this) + ",lastY=" + CropImageView.x(CropImageView.this));
            CropImageView.c(CropImageView.this, CropImageView.w(CropImageView.this));
            CropImageView.d(CropImageView.this, CropImageView.x(CropImageView.this));
            paramAnonymousView = CropImageView.this.getImageMatrix();
            paramAnonymousMotionEvent = new RectF();
            paramAnonymousMotionEvent.set(0.0F, 0.0F, CropImageView.i(CropImageView.this).getWidth(), CropImageView.i(CropImageView.this).getHeight());
            paramAnonymousView.mapRect(paramAnonymousMotionEvent);
            CropImageView.a(CropImageView.this, paramAnonymousMotionEvent.contains(CropImageView.w(CropImageView.this), CropImageView.x(CropImageView.this)));
            CropImageView.a(CropImageView.this, System.currentTimeMillis());
            continue;
            w.d("MicroMsg.CropImageView", "action_move");
            float f1;
            if (CropImageView.this.xgk)
            {
              w.d("MicroMsg.CropImageView", "is valid mult down");
              CropImageView.this.lYf = g.G(paramAnonymousMotionEvent);
              f1 = CropImageView.this.lYf - CropImageView.this.lYe;
              if ((CropImageView.this.lYf > 5.0F) && (Math.abs(f1) > 5.0F))
              {
                g.a(CropImageView.h(CropImageView.this), paramAnonymousMotionEvent);
                w.d("MicroMsg.CropImageView", "mX=" + CropImageView.h(CropImageView.this).x + ",mY=" + CropImageView.h(CropImageView.this).y);
                if (f1 <= 0.0F) {
                  break label759;
                }
                w.d("MicroMsg.CropImageView", "zoom in");
                CropImageView.this.cig();
              }
            }
            for (;;)
            {
              CropImageView.this.lYe = CropImageView.this.lYf;
              if (!CropImageView.y(CropImageView.this))
              {
                f1 = paramAnonymousMotionEvent.getRawX() - CropImageView.w(CropImageView.this);
                float f2 = paramAnonymousMotionEvent.getRawY() - CropImageView.x(CropImageView.this);
                if ((Math.abs(f1) > 5.0F) || (Math.abs(f2) > 5.0F)) {
                  CropImageView.this.getImageMatrix().postTranslate(f1, f2);
                }
                CropImageView.this.invalidate();
              }
              CropImageView.b(CropImageView.this, false);
              CropImageView.a(CropImageView.this, paramAnonymousMotionEvent.getRawX());
              CropImageView.b(CropImageView.this, paramAnonymousMotionEvent.getRawY());
              break;
              label759:
              w.d("MicroMsg.CropImageView", "zoom out");
              CropImageView.this.cih();
            }
            w.d("MicroMsg.CropImageView", "action_up");
            if (CropImageView.z(CropImageView.this))
            {
              CropImageView.c(CropImageView.this, false);
              if (CropImageView.A(CropImageView.this))
              {
                CropImageView.d(CropImageView.this, false);
                CropImageView.this.cih();
                CropImageView.this.cih();
                CropImageView.this.cih();
                CropImageView.this.cih();
                CropImageView.this.cih();
              }
              else
              {
                CropImageView.d(CropImageView.this, true);
                CropImageView.this.cig();
                CropImageView.this.cig();
                CropImageView.this.cig();
                CropImageView.this.cig();
                CropImageView.this.cig();
              }
            }
            else
            {
              CropImageView.c(CropImageView.this, true);
              CropImageView.a(CropImageView.this, new Timer());
              paramAnonymousView = new TimerTask()
              {
                public final void run()
                {
                  GMTrace.i(2061718519808L, 15361);
                  if (CropImageView.z(CropImageView.this))
                  {
                    Message localMessage = new Message();
                    localMessage.what = 4661;
                    localMessage.obj = paramAnonymousMotionEvent;
                    CropImageView.l(CropImageView.this).sendMessage(localMessage);
                    CropImageView.c(CropImageView.this, false);
                  }
                  GMTrace.o(2061718519808L, 15361);
                }
              };
              CropImageView.B(CropImageView.this).schedule(paramAnonymousView, 200L);
            }
          }
        }
      }
    };
    this.wgT = false;
    cif();
    GMTrace.o(2052457496576L, 15292);
  }
  
  public final void cif()
  {
    GMTrace.i(2052725932032L, 15294);
    setOnTouchListener(this.nft);
    GMTrace.o(2052725932032L, 15294);
  }
  
  public final void cig()
  {
    GMTrace.i(2052860149760L, 15295);
    this.xgs *= 1.0666F;
    if (1.0F <= this.xgs) {
      this.xgn = false;
    }
    if (1.6F < this.xgs) {}
    for (this.xgm = true; (this.xgf) && (4.0F < this.xgs); this.xgm = false)
    {
      this.xgs = 4.0F;
      GMTrace.o(2052860149760L, 15295);
      return;
    }
    float[] arrayOfFloat1 = new float[2];
    float[] arrayOfFloat2 = new float[2];
    float f = this.xgj.x;
    arrayOfFloat2[0] = f;
    arrayOfFloat1[0] = f;
    f = this.xgj.y;
    arrayOfFloat2[1] = f;
    arrayOfFloat1[1] = f;
    getImageMatrix().mapPoints(arrayOfFloat1);
    getImageMatrix().postScale(1.0666F, 1.0666F);
    getImageMatrix().mapPoints(arrayOfFloat2);
    getImageMatrix().postTranslate((arrayOfFloat1[0] - arrayOfFloat2[0]) / 2.0F, (arrayOfFloat1[1] - arrayOfFloat2[1]) / 2.0F);
    setImageBitmap(this.lEg);
    invalidate();
    GMTrace.o(2052860149760L, 15295);
  }
  
  public final void cih()
  {
    GMTrace.i(2052994367488L, 15296);
    this.xgs *= 0.9375F;
    if (1.6F > this.xgs) {
      this.xgm = false;
    }
    if (1.0F > this.xgs) {}
    for (this.xgn = true; 0.4F > this.xgs; this.xgn = false)
    {
      this.xgs = 0.4F;
      GMTrace.o(2052994367488L, 15296);
      return;
    }
    float[] arrayOfFloat1 = new float[2];
    float[] arrayOfFloat2 = new float[2];
    float f = this.xgj.x;
    arrayOfFloat2[0] = f;
    arrayOfFloat1[0] = f;
    f = this.xgj.y;
    arrayOfFloat2[1] = f;
    arrayOfFloat1[1] = f;
    getImageMatrix().mapPoints(arrayOfFloat1);
    getImageMatrix().postScale(0.9375F, 0.9375F);
    getImageMatrix().mapPoints(arrayOfFloat2);
    getImageMatrix().postTranslate((arrayOfFloat1[0] - arrayOfFloat2[0]) / 2.0F, (arrayOfFloat1[1] - arrayOfFloat2[1]) / 2.0F);
    setImageBitmap(this.lEg);
    invalidate();
    GMTrace.o(2052994367488L, 15296);
  }
  
  public final int cii()
  {
    GMTrace.i(2053128585216L, 15297);
    if ((this.wgT) && (this.wgU != null))
    {
      i = this.wgU.getIntrinsicWidth();
      GMTrace.o(2053128585216L, 15297);
      return i;
    }
    int i = getWidth();
    GMTrace.o(2053128585216L, 15297);
    return i;
  }
  
  public final int cij()
  {
    GMTrace.i(2053262802944L, 15298);
    if ((this.wgT) && (this.wgU != null))
    {
      i = this.wgU.getIntrinsicHeight();
      GMTrace.o(2053262802944L, 15298);
      return i;
    }
    int i = getHeight();
    GMTrace.o(2053262802944L, 15298);
    return i;
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(2052591714304L, 15293);
    this.wgT = false;
    this.lEg = paramBitmap;
    g.a(this.xgj, paramBitmap);
    super.setImageBitmap(paramBitmap);
    GMTrace.o(2052591714304L, 15293);
  }
  
  public static abstract interface a
  {
    public abstract void cie();
  }
  
  private final class b
    extends TimerTask
  {
    public final void run()
    {
      GMTrace.i(1942801612800L, 14475);
      Message localMessage = new Message();
      if ((CropImageView.p(this.xgD)) || (CropImageView.q(this.xgD)) || (CropImageView.r(this.xgD)) || (CropImageView.s(this.xgD))) {}
      for (localMessage.what = 4654;; localMessage.what = 4653)
      {
        CropImageView.t(this.xgD).sendMessage(localMessage);
        GMTrace.o(1942801612800L, 14475);
        return;
      }
    }
  }
  
  private final class c
    extends TimerTask
  {
    public final void run()
    {
      GMTrace.i(2048967835648L, 15266);
      w.d("MicroMsg.CropImageView", "in timer task run");
      Message localMessage = new Message();
      if (CropImageView.j(this.xgD)) {
        localMessage.what = 4659;
      }
      for (;;)
      {
        CropImageView.l(this.xgD).sendMessage(localMessage);
        GMTrace.o(2048967835648L, 15266);
        return;
        if (CropImageView.k(this.xgD)) {
          localMessage.what = 4658;
        } else {
          localMessage.what = 4660;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\CropImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */