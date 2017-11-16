package com.tencent.mm.plugin.gif;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.m.a.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.io.InputStream;

public final class c
  extends a
{
  private ae krX;
  private float mDensity;
  boolean mIsRunning;
  private final Paint mPaint;
  private boolean mfA;
  int mfB;
  private int mfC;
  h mfD;
  private final Runnable mfE;
  final Runnable mfF;
  private final Runnable mfG;
  private final Runnable mfH;
  private final Runnable mfI;
  private final Runnable mfJ;
  boolean mfj;
  private volatile long mfk;
  private AssetFileDescriptor mfl;
  private final int[] mfm;
  private float mfn;
  private float mfo;
  private boolean mfp;
  private int[] mfq;
  private int mfr;
  private int mfs;
  private long mft;
  private long mfu;
  private long mfv;
  private long mfw;
  private long mfx;
  private long mfy;
  private int mfz;
  private final Rect to;
  
  private c(AssetFileDescriptor paramAssetFileDescriptor)
  {
    GMTrace.i(12884365017088L, 95996);
    this.mIsRunning = true;
    this.mfj = false;
    this.mfl = null;
    this.mfm = new int[6];
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
    this.mfA = false;
    this.mfB = 0;
    this.mfC = 0;
    this.krX = new ae();
    this.mfE = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883828146176L, 95992);
        GMTrace.o(12883828146176L, 95992);
      }
    };
    this.mfF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12890002161664L, 96038);
        if (((c.this.isRunning()) || (c.b(c.this) == 0)) && (SystemClock.uptimeMillis() >= c.c(c.this)))
        {
          c.a(c.this, System.currentTimeMillis());
          c.this.invalidateSelf();
          if (c.a(c.this) != null) {
            c.a(c.this).invalidate();
          }
        }
        GMTrace.o(12890002161664L, 96038);
      }
    };
    this.mfG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12893491822592L, 96064);
        MMGIFJNI.restoreRemainder(c.d(c.this));
        c.a(c.this, c.e(c.this), c.f(c.this));
        GMTrace.o(12893491822592L, 96064);
      }
    };
    this.mfH = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883559710720L, 95990);
        MMGIFJNI.reset(c.d(c.this));
        GMTrace.o(12883559710720L, 95990);
      }
    };
    this.mfI = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883022839808L, 95986);
        MMGIFJNI.saveRemainder(c.d(c.this));
        GMTrace.o(12883022839808L, 95986);
      }
    };
    this.mfJ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12899397402624L, 96108);
        if (c.g(c.this))
        {
          w.i("MicroMsg.GIF.MMGIFDrawable", "This gif had been recycle.");
          GMTrace.o(12899397402624L, 96108);
          return;
        }
        long l = System.currentTimeMillis();
        if (c.b(c.this) + 1 > c.h(c.this) - 1) {
          c.a(c.this, -1);
        }
        c.a(c.this, c.b(c.this) + 1);
        if (MMGIFJNI.drawFramePixels(c.d(c.this), c.i(c.this), c.j(c.this))) {
          c.k(c.this);
        }
        c.b(c.this, System.currentTimeMillis() - l);
        if (c.l(c.this) != 0L)
        {
          c.c(c.this, c.l(c.this) - c.m(c.this) - c.n(c.this));
          if (c.f(c.this) < 0L)
          {
            w.d("MicroMsg.GIF.MMGIFDrawable", "Render time:%d InvalidateUseTime:%d NextRealInvalidateTime:%d mNextFrameDuration:%d mCurrentFrameIndex:%d", new Object[] { Long.valueOf(c.m(c.this)), Long.valueOf(c.n(c.this)), Long.valueOf(c.f(c.this)), Long.valueOf(c.l(c.this)), Integer.valueOf(c.j(c.this)[5]) });
            g.ork.a(401L, 0L, 1L, false);
            g.ork.a(401L, 1L, Math.abs(c.f(c.this)), false);
          }
        }
        c localc = c.this;
        Runnable localRunnable = c.e(c.this);
        if (c.f(c.this) > 0L) {}
        for (l = c.f(c.this);; l = 0L)
        {
          c.a(localc, localRunnable, l);
          if (c.j(c.this)[2] != 1) {
            break;
          }
          c.d(c.this, 5000L);
          GMTrace.o(12899397402624L, 96108);
          return;
        }
        c.d(c.this, c.j(c.this)[4]);
        GMTrace.o(12899397402624L, 96108);
      }
    };
    if (paramAssetFileDescriptor == null) {
      throw new NullPointerException("assert file Descriptor is null.");
    }
    this.mfl = paramAssetFileDescriptor;
    this.mfk = MMGIFJNI.openByFileDescroptor(this.mfl.getFileDescriptor(), paramAssetFileDescriptor.getStartOffset(), this.mfm);
    init();
    GMTrace.o(12884365017088L, 95996);
  }
  
  public c(Resources paramResources, int paramInt)
  {
    this(paramResources.openRawResourceFd(paramInt));
    GMTrace.i(12884096581632L, 95994);
    GMTrace.o(12884096581632L, 95994);
  }
  
  public c(InputStream paramInputStream)
  {
    GMTrace.i(12884499234816L, 95997);
    this.mIsRunning = true;
    this.mfj = false;
    this.mfl = null;
    this.mfm = new int[6];
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
    this.mfA = false;
    this.mfB = 0;
    this.mfC = 0;
    this.krX = new ae();
    this.mfE = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883828146176L, 95992);
        GMTrace.o(12883828146176L, 95992);
      }
    };
    this.mfF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12890002161664L, 96038);
        if (((c.this.isRunning()) || (c.b(c.this) == 0)) && (SystemClock.uptimeMillis() >= c.c(c.this)))
        {
          c.a(c.this, System.currentTimeMillis());
          c.this.invalidateSelf();
          if (c.a(c.this) != null) {
            c.a(c.this).invalidate();
          }
        }
        GMTrace.o(12890002161664L, 96038);
      }
    };
    this.mfG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12893491822592L, 96064);
        MMGIFJNI.restoreRemainder(c.d(c.this));
        c.a(c.this, c.e(c.this), c.f(c.this));
        GMTrace.o(12893491822592L, 96064);
      }
    };
    this.mfH = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883559710720L, 95990);
        MMGIFJNI.reset(c.d(c.this));
        GMTrace.o(12883559710720L, 95990);
      }
    };
    this.mfI = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883022839808L, 95986);
        MMGIFJNI.saveRemainder(c.d(c.this));
        GMTrace.o(12883022839808L, 95986);
      }
    };
    this.mfJ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12899397402624L, 96108);
        if (c.g(c.this))
        {
          w.i("MicroMsg.GIF.MMGIFDrawable", "This gif had been recycle.");
          GMTrace.o(12899397402624L, 96108);
          return;
        }
        long l = System.currentTimeMillis();
        if (c.b(c.this) + 1 > c.h(c.this) - 1) {
          c.a(c.this, -1);
        }
        c.a(c.this, c.b(c.this) + 1);
        if (MMGIFJNI.drawFramePixels(c.d(c.this), c.i(c.this), c.j(c.this))) {
          c.k(c.this);
        }
        c.b(c.this, System.currentTimeMillis() - l);
        if (c.l(c.this) != 0L)
        {
          c.c(c.this, c.l(c.this) - c.m(c.this) - c.n(c.this));
          if (c.f(c.this) < 0L)
          {
            w.d("MicroMsg.GIF.MMGIFDrawable", "Render time:%d InvalidateUseTime:%d NextRealInvalidateTime:%d mNextFrameDuration:%d mCurrentFrameIndex:%d", new Object[] { Long.valueOf(c.m(c.this)), Long.valueOf(c.n(c.this)), Long.valueOf(c.f(c.this)), Long.valueOf(c.l(c.this)), Integer.valueOf(c.j(c.this)[5]) });
            g.ork.a(401L, 0L, 1L, false);
            g.ork.a(401L, 1L, Math.abs(c.f(c.this)), false);
          }
        }
        c localc = c.this;
        Runnable localRunnable = c.e(c.this);
        if (c.f(c.this) > 0L) {}
        for (l = c.f(c.this);; l = 0L)
        {
          c.a(localc, localRunnable, l);
          if (c.j(c.this)[2] != 1) {
            break;
          }
          c.d(c.this, 5000L);
          GMTrace.o(12899397402624L, 96108);
          return;
        }
        c.d(c.this, c.j(c.this)[4]);
        GMTrace.o(12899397402624L, 96108);
      }
    };
    if (paramInputStream == null) {
      throw new NullPointerException("input stream is null.");
    }
    this.mfk = MMGIFJNI.openByInputStrem(paramInputStream, this.mfm);
    init();
    GMTrace.o(12884499234816L, 95997);
  }
  
  public c(String paramString)
  {
    GMTrace.i(12884230799360L, 95995);
    this.mIsRunning = true;
    this.mfj = false;
    this.mfl = null;
    this.mfm = new int[6];
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
    this.mfA = false;
    this.mfB = 0;
    this.mfC = 0;
    this.krX = new ae();
    this.mfE = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883828146176L, 95992);
        GMTrace.o(12883828146176L, 95992);
      }
    };
    this.mfF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12890002161664L, 96038);
        if (((c.this.isRunning()) || (c.b(c.this) == 0)) && (SystemClock.uptimeMillis() >= c.c(c.this)))
        {
          c.a(c.this, System.currentTimeMillis());
          c.this.invalidateSelf();
          if (c.a(c.this) != null) {
            c.a(c.this).invalidate();
          }
        }
        GMTrace.o(12890002161664L, 96038);
      }
    };
    this.mfG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12893491822592L, 96064);
        MMGIFJNI.restoreRemainder(c.d(c.this));
        c.a(c.this, c.e(c.this), c.f(c.this));
        GMTrace.o(12893491822592L, 96064);
      }
    };
    this.mfH = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883559710720L, 95990);
        MMGIFJNI.reset(c.d(c.this));
        GMTrace.o(12883559710720L, 95990);
      }
    };
    this.mfI = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883022839808L, 95986);
        MMGIFJNI.saveRemainder(c.d(c.this));
        GMTrace.o(12883022839808L, 95986);
      }
    };
    this.mfJ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12899397402624L, 96108);
        if (c.g(c.this))
        {
          w.i("MicroMsg.GIF.MMGIFDrawable", "This gif had been recycle.");
          GMTrace.o(12899397402624L, 96108);
          return;
        }
        long l = System.currentTimeMillis();
        if (c.b(c.this) + 1 > c.h(c.this) - 1) {
          c.a(c.this, -1);
        }
        c.a(c.this, c.b(c.this) + 1);
        if (MMGIFJNI.drawFramePixels(c.d(c.this), c.i(c.this), c.j(c.this))) {
          c.k(c.this);
        }
        c.b(c.this, System.currentTimeMillis() - l);
        if (c.l(c.this) != 0L)
        {
          c.c(c.this, c.l(c.this) - c.m(c.this) - c.n(c.this));
          if (c.f(c.this) < 0L)
          {
            w.d("MicroMsg.GIF.MMGIFDrawable", "Render time:%d InvalidateUseTime:%d NextRealInvalidateTime:%d mNextFrameDuration:%d mCurrentFrameIndex:%d", new Object[] { Long.valueOf(c.m(c.this)), Long.valueOf(c.n(c.this)), Long.valueOf(c.f(c.this)), Long.valueOf(c.l(c.this)), Integer.valueOf(c.j(c.this)[5]) });
            g.ork.a(401L, 0L, 1L, false);
            g.ork.a(401L, 1L, Math.abs(c.f(c.this)), false);
          }
        }
        c localc = c.this;
        Runnable localRunnable = c.e(c.this);
        if (c.f(c.this) > 0L) {}
        for (l = c.f(c.this);; l = 0L)
        {
          c.a(localc, localRunnable, l);
          if (c.j(c.this)[2] != 1) {
            break;
          }
          c.d(c.this, 5000L);
          GMTrace.o(12899397402624L, 96108);
          return;
        }
        c.d(c.this, c.j(c.this)[4]);
        GMTrace.o(12899397402624L, 96108);
      }
    };
    if (TextUtils.isEmpty(paramString)) {
      throw new NullPointerException("file path is null.");
    }
    this.mfk = MMGIFJNI.openByFilePath(paramString, this.mfm);
    init();
    GMTrace.o(12884230799360L, 95995);
  }
  
  public c(byte[] paramArrayOfByte)
  {
    GMTrace.i(12884633452544L, 95998);
    this.mIsRunning = true;
    this.mfj = false;
    this.mfl = null;
    this.mfm = new int[6];
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
    this.mfA = false;
    this.mfB = 0;
    this.mfC = 0;
    this.krX = new ae();
    this.mfE = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883828146176L, 95992);
        GMTrace.o(12883828146176L, 95992);
      }
    };
    this.mfF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12890002161664L, 96038);
        if (((c.this.isRunning()) || (c.b(c.this) == 0)) && (SystemClock.uptimeMillis() >= c.c(c.this)))
        {
          c.a(c.this, System.currentTimeMillis());
          c.this.invalidateSelf();
          if (c.a(c.this) != null) {
            c.a(c.this).invalidate();
          }
        }
        GMTrace.o(12890002161664L, 96038);
      }
    };
    this.mfG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12893491822592L, 96064);
        MMGIFJNI.restoreRemainder(c.d(c.this));
        c.a(c.this, c.e(c.this), c.f(c.this));
        GMTrace.o(12893491822592L, 96064);
      }
    };
    this.mfH = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883559710720L, 95990);
        MMGIFJNI.reset(c.d(c.this));
        GMTrace.o(12883559710720L, 95990);
      }
    };
    this.mfI = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883022839808L, 95986);
        MMGIFJNI.saveRemainder(c.d(c.this));
        GMTrace.o(12883022839808L, 95986);
      }
    };
    this.mfJ = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12899397402624L, 96108);
        if (c.g(c.this))
        {
          w.i("MicroMsg.GIF.MMGIFDrawable", "This gif had been recycle.");
          GMTrace.o(12899397402624L, 96108);
          return;
        }
        long l = System.currentTimeMillis();
        if (c.b(c.this) + 1 > c.h(c.this) - 1) {
          c.a(c.this, -1);
        }
        c.a(c.this, c.b(c.this) + 1);
        if (MMGIFJNI.drawFramePixels(c.d(c.this), c.i(c.this), c.j(c.this))) {
          c.k(c.this);
        }
        c.b(c.this, System.currentTimeMillis() - l);
        if (c.l(c.this) != 0L)
        {
          c.c(c.this, c.l(c.this) - c.m(c.this) - c.n(c.this));
          if (c.f(c.this) < 0L)
          {
            w.d("MicroMsg.GIF.MMGIFDrawable", "Render time:%d InvalidateUseTime:%d NextRealInvalidateTime:%d mNextFrameDuration:%d mCurrentFrameIndex:%d", new Object[] { Long.valueOf(c.m(c.this)), Long.valueOf(c.n(c.this)), Long.valueOf(c.f(c.this)), Long.valueOf(c.l(c.this)), Integer.valueOf(c.j(c.this)[5]) });
            g.ork.a(401L, 0L, 1L, false);
            g.ork.a(401L, 1L, Math.abs(c.f(c.this)), false);
          }
        }
        c localc = c.this;
        Runnable localRunnable = c.e(c.this);
        if (c.f(c.this) > 0L) {}
        for (l = c.f(c.this);; l = 0L)
        {
          c.a(localc, localRunnable, l);
          if (c.j(c.this)[2] != 1) {
            break;
          }
          c.d(c.this, 5000L);
          GMTrace.o(12899397402624L, 96108);
          return;
        }
        c.d(c.this, c.j(c.this)[4]);
        GMTrace.o(12899397402624L, 96108);
      }
    };
    if (paramArrayOfByte == null) {
      throw new NullPointerException("bytes is null.");
    }
    this.mfk = MMGIFJNI.openByByteArray(paramArrayOfByte, this.mfm);
    init();
    GMTrace.o(12884633452544L, 95998);
  }
  
  private float aHe()
  {
    GMTrace.i(12884901888000L, 96000);
    if (this.mDensity == 0.0F)
    {
      this.mDensity = (com.tencent.mm.br.a.getDensity(ab.getContext()) / 2.0F);
      if (this.mDensity >= 1.0F) {
        break label58;
      }
      this.mDensity = 1.0F;
    }
    for (;;)
    {
      float f = this.mDensity;
      GMTrace.o(12884901888000L, 96000);
      return f;
      label58:
      if (this.mDensity > 2.0F) {
        this.mDensity = 2.0F;
      }
    }
  }
  
  private void init()
  {
    GMTrace.i(12884767670272L, 95999);
    w.i("MicroMsg.GIF.MMGIFDrawable", "gif info pointer:%d", new Object[] { Long.valueOf(this.mfk) });
    this.mfr = this.mfm[2];
    this.mfz = com.tencent.mm.br.a.V(ab.getContext(), a.c.kbm);
    if ((this.mfm[0] > 1024) || (this.mfm[1] > 1024))
    {
      w.w("MicroMsg.GIF.MMGIFDrawable", "emoji width or height over size. Width:%d Height:%d", new Object[] { Integer.valueOf(this.mfm[0]), Integer.valueOf(this.mfm[1]) });
      this.mfq = new int[this.mfz * this.mfz];
      this.mfA = true;
      g.ork.a(401L, 2L, 1L, false);
      GMTrace.o(12884767670272L, 95999);
      return;
    }
    this.mfq = new int[this.mfm[0] * this.mfm[1]];
    GMTrace.o(12884767670272L, 95999);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(12885438758912L, 96004);
    if (this.mfp)
    {
      this.to.set(getBounds());
      this.mfn = (this.to.width() / this.mfm[0]);
      this.mfo = (this.to.height() / this.mfm[1]);
      this.mfp = false;
    }
    if (this.mPaint.getShader() == null)
    {
      if (this.mfw == 0L) {
        this.mfw = System.currentTimeMillis();
      }
      paramCanvas.scale(this.mfn, this.mfo);
      int[] arrayOfInt = this.mfq;
      if (arrayOfInt != null) {
        if (arrayOfInt.length == this.mfm[0] * this.mfm[1]) {
          paramCanvas.drawBitmap(arrayOfInt, 0, this.mfm[0], 0.0F, 0.0F, this.mfm[0], this.mfm[1], true, this.mPaint);
        }
      }
      for (;;)
      {
        this.mfx = (System.currentTimeMillis() - this.mfw);
        if ((this.mfA) || (this.mfm[2] <= 0)) {
          break label345;
        }
        if (this.mfm[4] < 0) {
          w.i("MicroMsg.GIF.MMGIFDrawable", "current index error. start first frame");
        }
        if ((this.mfB == 0) || (this.mfC <= this.mfB - 1)) {
          break;
        }
        f(this.mfE, 0L);
        GMTrace.o(12885438758912L, 96004);
        return;
        paramCanvas.drawRGB(230, 230, 230);
        w.w("MicroMsg.GIF.MMGIFDrawable", "colors is not equal width*height. length:%d width:%d height:%d", new Object[] { Integer.valueOf(arrayOfInt.length), Integer.valueOf(this.mfm[0]), Integer.valueOf(this.mfm[1]) });
        continue;
        w.e("MicroMsg.GIF.MMGIFDrawable", "colors is null.");
      }
      com.tencent.mm.am.a.c(this.mfJ, 0L);
      GMTrace.o(12885438758912L, 96004);
      return;
      label345:
      w.e("MicroMsg.GIF.MMGIFDrawable", "framecount:%d errorcode:%d no post and oversize:%b", new Object[] { Integer.valueOf(this.mfm[2]), Integer.valueOf(this.mfm[4]), Boolean.valueOf(this.mfA) });
      GMTrace.o(12885438758912L, 96004);
      return;
    }
    w.i("MicroMsg.GIF.MMGIFDrawable", "colors drawRect ");
    paramCanvas.drawRect(this.to, this.mPaint);
    GMTrace.o(12885438758912L, 96004);
  }
  
  final void f(Runnable paramRunnable, long paramLong)
  {
    GMTrace.i(12883962363904L, 95993);
    this.mfy = (SystemClock.uptimeMillis() + paramLong);
    if (this.krX != null) {
      this.krX.postAtTime(paramRunnable, this.mfy);
    }
    GMTrace.o(12883962363904L, 95993);
  }
  
  protected final void finalize()
  {
    GMTrace.i(12886512500736L, 96012);
    try
    {
      recycle();
      GMTrace.o(12886512500736L, 96012);
      return;
    }
    catch (Throwable localThrowable)
    {
      super.finalize();
      GMTrace.o(12886512500736L, 96012);
    }
  }
  
  public final int getIntrinsicHeight()
  {
    GMTrace.i(12885170323456L, 96002);
    int i = (int)(this.mfm[1] * aHe());
    GMTrace.o(12885170323456L, 96002);
    return i;
  }
  
  public final int getIntrinsicWidth()
  {
    GMTrace.i(12885036105728L, 96001);
    int i = (int)(this.mfm[0] * aHe());
    GMTrace.o(12885036105728L, 96001);
    return i;
  }
  
  public final int getOpacity()
  {
    GMTrace.i(12885572976640L, 96005);
    GMTrace.o(12885572976640L, 96005);
    return -2;
  }
  
  public final boolean isRunning()
  {
    GMTrace.i(12885975629824L, 96008);
    boolean bool = this.mIsRunning;
    GMTrace.o(12885975629824L, 96008);
    return bool;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    GMTrace.i(12885304541184L, 96003);
    super.onBoundsChange(paramRect);
    this.mfp = true;
    GMTrace.o(12885304541184L, 96003);
  }
  
  public final void recycle()
  {
    GMTrace.i(12886378283008L, 96011);
    w.d("MicroMsg.GIF.MMGIFDrawable", "recycle");
    this.mfj = true;
    this.mIsRunning = false;
    long l = this.mfk;
    this.mfk = 0L;
    MMGIFJNI.recycle(l);
    this.mfq = null;
    if (this.mfl != null) {
      try
      {
        this.mfl.close();
        GMTrace.o(12886378283008L, 96011);
        return;
      }
      catch (Exception localException) {}
    }
    GMTrace.o(12886378283008L, 96011);
  }
  
  public final void reset()
  {
    GMTrace.i(20136148860928L, 150026);
    this.mfj = false;
    this.mIsRunning = true;
    com.tencent.mm.am.a.c(this.mfH, 300L);
    GMTrace.o(20136148860928L, 150026);
  }
  
  public final void setAlpha(int paramInt)
  {
    GMTrace.i(12885707194368L, 96006);
    this.mPaint.setAlpha(paramInt);
    GMTrace.o(12885707194368L, 96006);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(12885841412096L, 96007);
    this.mPaint.setColorFilter(paramColorFilter);
    GMTrace.o(12885841412096L, 96007);
  }
  
  public final void start()
  {
    GMTrace.i(12886109847552L, 96009);
    this.mIsRunning = true;
    com.tencent.mm.am.a.c(this.mfG, 0L);
    GMTrace.o(12886109847552L, 96009);
  }
  
  public final void stop()
  {
    GMTrace.i(12886244065280L, 96010);
    w.d("MicroMsg.GIF.MMGIFDrawable", "stop");
    this.mIsRunning = false;
    com.tencent.mm.am.a.c(this.mfI, 300L);
    GMTrace.o(12886244065280L, 96010);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\gif\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */