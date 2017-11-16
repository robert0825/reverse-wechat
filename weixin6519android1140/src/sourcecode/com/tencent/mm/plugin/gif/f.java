package com.tencent.mm.plugin.gif;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.m.a.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends a
{
  private ae krX;
  private float mDensity;
  private int mHeight;
  private boolean mIsRunning;
  private final Paint mPaint;
  private int mWidth;
  private final Runnable mfF;
  private final Runnable mfG;
  private final Runnable mfJ;
  private volatile long mfU;
  private int[] mfV;
  private Bitmap mfW;
  private boolean mfX;
  private boolean mfj;
  private int[] mfm;
  private float mfn;
  private float mfo;
  private boolean mfp;
  private int mfr;
  private int mfs;
  private long mft;
  private long mfu;
  private long mfv;
  private long mfw;
  private long mfx;
  private long mfy;
  private final Rect to;
  
  public f(String paramString)
  {
    this(e.c(paramString, 0, e.aY(paramString)));
    GMTrace.i(20136954167296L, 150032);
    GMTrace.o(20136954167296L, 150032);
  }
  
  public f(byte[] paramArrayOfByte)
  {
    GMTrace.i(20137088385024L, 150033);
    this.mIsRunning = false;
    this.mfj = false;
    this.mfm = new int[4];
    this.mfV = new int[4];
    this.mfn = 1.0F;
    this.mfo = 1.0F;
    this.to = new Rect();
    this.mPaint = new Paint(6);
    this.mfr = 0;
    this.mfs = -1;
    this.mft = 0L;
    this.mfu = 0L;
    this.mfv = 0L;
    this.mfw = 0L;
    this.mfy = 0L;
    this.mfX = false;
    this.krX = new ae();
    this.mfF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20144873013248L, 150091);
        if ((!f.a(f.this)) && ((f.this.isRunning()) || (f.b(f.this) == 0)) && (SystemClock.uptimeMillis() >= f.c(f.this)))
        {
          f.a(f.this, System.currentTimeMillis());
          f.this.invalidateSelf();
        }
        GMTrace.o(20144873013248L, 150091);
      }
    };
    this.mfG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20145409884160L, 150095);
        f.a(f.this, f.d(f.this), f.e(f.this));
        GMTrace.o(20145409884160L, 150095);
      }
    };
    this.mfJ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20145141448704L, 150093);
        if (f.f(f.this))
        {
          w.d("MicroMsg.GIF.MMWXGFDrawable", "Cpan Render Task is Running.");
          GMTrace.o(20145141448704L, 150093);
          return;
        }
        if (f.a(f.this))
        {
          w.i("MicroMsg.GIF.MMWXGFDrawable", "Cpan This WXGF had been recycle.");
          GMTrace.o(20145141448704L, 150093);
          return;
        }
        if ((f.g(f.this) == null) || (f.g(f.this).isRecycled()))
        {
          w.i("MicroMsg.GIF.MMWXGFDrawable", "Cpan This WXGF is null or had been recycle.");
          GMTrace.o(20145141448704L, 150093);
          return;
        }
        if (f.h(f.this) == 0L)
        {
          w.i("MicroMsg.GIF.MMWXGFDrawable", "Cpan This WXGF JNIHandle is null.");
          g.ork.a(401L, 18L, 1L, false);
          GMTrace.o(20145141448704L, 150093);
          return;
        }
        f.a(f.this, true);
        long l = System.currentTimeMillis();
        int i = MMWXGFJNI.nativeDecodeBufferFrame(f.h(f.this), null, 0, f.g(f.this), f.i(f.this));
        if (i == 64632)
        {
          w.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed. func is null.");
          g.ork.a(401L, 8L, 1L, false);
          GMTrace.o(20145141448704L, 150093);
          return;
        }
        if (i == 64627)
        {
          w.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed. frame is null.");
          g.ork.a(401L, 11L, 1L, false);
        }
        while (i != -1)
        {
          f.a(f.this, f.b(f.this) + 1);
          if ((f.b(f.this) < f.j(f.this) - 1) && (i != 1)) {
            break;
          }
          f.a(f.this, -1);
          i = MMWXGFJNI.nativeRewindBuffer(f.h(f.this));
          if (i == 0) {
            break;
          }
          if (i == 64631) {
            g.ork.a(711L, 9L, 1L, false);
          }
          w.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan Rewind buffer failed.");
          GMTrace.o(20145141448704L, 150093);
          return;
        }
        w.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed.");
        GMTrace.o(20145141448704L, 150093);
        return;
        f.b(f.this, System.currentTimeMillis() - l);
        if (f.k(f.this) != 0L)
        {
          f.c(f.this, f.k(f.this) - f.l(f.this) - f.m(f.this));
          if (f.e(f.this) < 0L)
          {
            w.d("MicroMsg.GIF.MMWXGFDrawable", "Render time:%d InvalidateUseTime:%d NextRealInvalidateTime:%d mNextFrameDuration:%d mCurrentFrameIndex:%d", new Object[] { Long.valueOf(f.l(f.this)), Long.valueOf(f.m(f.this)), Long.valueOf(f.e(f.this)), Long.valueOf(f.k(f.this)), Integer.valueOf(f.b(f.this)) });
            if (f.e(f.this) < -100L)
            {
              g.ork.a(401L, 16L, 1L, false);
              g.ork.a(401L, 17L, Math.abs(f.e(f.this)), false);
            }
          }
        }
        f localf = f.this;
        Runnable localRunnable = f.d(f.this);
        if (f.e(f.this) > 0L)
        {
          l = f.e(f.this);
          f.a(localf, localRunnable, l);
          if (f.i(f.this)[0] <= 0) {
            break label662;
          }
        }
        label662:
        for (i = f.i(f.this)[0];; i = 100)
        {
          f.d(f.this, i);
          f.a(f.this, false);
          GMTrace.o(20145141448704L, 150093);
          return;
          l = 0L;
          break;
        }
      }
    };
    if (paramArrayOfByte == null) {
      throw new NullPointerException("bytes is null.");
    }
    this.mfU = MMWXGFJNI.nativeInitWxAMDecoder();
    if ((this.mfU == 0L) || (this.mfU == -901L))
    {
      w.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan init wxam decoder failed. mWXGFJNIHandle:%d", new Object[] { Long.valueOf(this.mfU) });
      if (this.mfU == -901L) {
        g.ork.a(711L, 5L, 1L, false);
      }
      g.ork.a(711L, 4L, 1L, false);
      throw new MMGIFException(201);
    }
    int i = MMWXGFJNI.nativeDecodeBufferHeader(this.mfU, paramArrayOfByte, paramArrayOfByte.length);
    if (i != 0)
    {
      w.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF decode buffer header failed. result:%d", new Object[] { Integer.valueOf(i) });
      if (i == 64632) {
        g.ork.a(711L, 8L, 1L, false);
      }
      for (;;)
      {
        throw new MMGIFException(i);
        g.ork.a(711L, 3L, 1L, false);
      }
    }
    i = MMWXGFJNI.nativeGetOption(this.mfU, paramArrayOfByte, paramArrayOfByte.length, this.mfm);
    if (i != 0)
    {
      w.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF get option failed. result:%d", new Object[] { Integer.valueOf(i) });
      if (i == 64633) {
        g.ork.a(711L, 7L, 1L, false);
      }
      for (;;)
      {
        throw new MMGIFException(i);
        g.ork.a(711L, 3L, 1L, false);
      }
    }
    this.mfr = this.mfm[0];
    this.mWidth = this.mfm[1];
    this.mHeight = this.mfm[2];
    if ((this.mWidth == 0) || (this.mHeight == 0))
    {
      i = com.tencent.mm.br.a.V(ab.getContext(), a.c.kbm);
      this.mHeight = i;
      this.mWidth = i;
    }
    this.mfW = Bitmap.createBitmap(this.mWidth, this.mHeight, Bitmap.Config.ARGB_8888);
    GMTrace.o(20137088385024L, 150033);
  }
  
  private float aHe()
  {
    GMTrace.i(20137222602752L, 150034);
    if (this.mDensity == 0.0F)
    {
      this.mDensity = (com.tencent.mm.br.a.getDensity(ab.getContext()) / 2.0F);
      if (this.mDensity >= 1.0F) {
        break label60;
      }
      this.mDensity = 1.0F;
    }
    for (;;)
    {
      float f = this.mDensity;
      GMTrace.o(20137222602752L, 150034);
      return f;
      label60:
      if (this.mDensity > 2.0F) {
        this.mDensity = 2.0F;
      }
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(20137759473664L, 150038);
    if (this.mfp)
    {
      this.to.set(getBounds());
      this.mfn = (this.to.width() / this.mWidth);
      this.mfo = (this.to.height() / this.mHeight);
      this.mfp = false;
    }
    if (this.mPaint.getShader() == null)
    {
      if (this.mfw == 0L) {
        this.mfw = System.currentTimeMillis();
      }
      paramCanvas.scale(this.mfn, this.mfo);
      if ((this.mfW != null) && (!this.mfW.isRecycled()) && (!this.mfj)) {
        paramCanvas.drawBitmap(this.mfW, 0.0F, 0.0F, null);
      }
      for (;;)
      {
        this.mfx = (System.currentTimeMillis() - this.mfw);
        com.tencent.mm.am.a.c(this.mfJ, 0L);
        GMTrace.o(20137759473664L, 150038);
        return;
        w.e("MicroMsg.GIF.MMWXGFDrawable", "Cpan draw bitmap failed. Bitmap buffer is null or recycle");
      }
    }
    paramCanvas.drawRect(this.to, this.mPaint);
    GMTrace.o(20137759473664L, 150038);
  }
  
  protected final void finalize()
  {
    GMTrace.i(20138698997760L, 150045);
    try
    {
      recycle();
      GMTrace.o(20138698997760L, 150045);
      return;
    }
    catch (Throwable localThrowable)
    {
      w.printErrStackTrace("MicroMsg.GIF.MMWXGFDrawable", localThrowable, "", new Object[0]);
      super.finalize();
      GMTrace.o(20138698997760L, 150045);
    }
  }
  
  public final int getIntrinsicHeight()
  {
    GMTrace.i(20137491038208L, 150036);
    int i = (int)(this.mHeight * aHe());
    GMTrace.o(20137491038208L, 150036);
    return i;
  }
  
  public final int getIntrinsicWidth()
  {
    GMTrace.i(20137356820480L, 150035);
    int i = (int)(this.mWidth * aHe());
    GMTrace.o(20137356820480L, 150035);
    return i;
  }
  
  public final int getOpacity()
  {
    GMTrace.i(20138162126848L, 150041);
    GMTrace.o(20138162126848L, 150041);
    return -2;
  }
  
  public final boolean isRunning()
  {
    GMTrace.i(20138564780032L, 150044);
    boolean bool = this.mIsRunning;
    GMTrace.o(20138564780032L, 150044);
    return bool;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    GMTrace.i(20137625255936L, 150037);
    super.onBoundsChange(paramRect);
    this.mfp = true;
    GMTrace.o(20137625255936L, 150037);
  }
  
  public final void recycle()
  {
    try
    {
      GMTrace.i(20138967433216L, 150047);
      w.v("MicroMsg.GIF.MMWXGFDrawable", "Cpan recycle decode handle:%d", new Object[] { Long.valueOf(this.mfU) });
      this.mfj = true;
      this.mIsRunning = false;
      long l = this.mfU;
      this.mfU = 0L;
      this.krX.removeCallbacks(this.mfF);
      int i = MMWXGFJNI.nativeUninit(l);
      if (i == 64630) {
        g.ork.a(401L, 10L, 1L, false);
      }
      w.d("MicroMsg.GIF.MMWXGFDrawable", "nativeUninit result:%d mWXGFJNIHandle:%s mIsRender:%b", new Object[] { Integer.valueOf(i), Long.valueOf(l), Boolean.valueOf(this.mfX) });
      if ((l != 0L) && (i == 0) && (this.mfW != null)) {
        this.mfW.isRecycled();
      }
      this.mfW = null;
      GMTrace.o(20138967433216L, 150047);
      return;
    }
    finally {}
  }
  
  public final void reset()
  {
    GMTrace.i(20138833215488L, 150046);
    this.mIsRunning = true;
    GMTrace.o(20138833215488L, 150046);
  }
  
  public final void setAlpha(int paramInt)
  {
    GMTrace.i(20137893691392L, 150039);
    this.mPaint.setAlpha(paramInt);
    GMTrace.o(20137893691392L, 150039);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(20138027909120L, 150040);
    this.mPaint.setColorFilter(paramColorFilter);
    GMTrace.o(20138027909120L, 150040);
  }
  
  public final void start()
  {
    GMTrace.i(20138296344576L, 150042);
    this.mIsRunning = true;
    com.tencent.mm.am.a.c(this.mfG, 0L);
    GMTrace.o(20138296344576L, 150042);
  }
  
  public final void stop()
  {
    GMTrace.i(20138430562304L, 150043);
    this.mIsRunning = false;
    GMTrace.o(20138430562304L, 150043);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\gif\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */