package com.tencent.mm.plugin.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends a
{
  private ae krX;
  public int kuY;
  private Context mContext;
  private Bitmap mCurrentBitmap;
  private int mHeight;
  public boolean mIsPlaying;
  private final Paint mPaint;
  private Resources mResources;
  private int mWidth;
  private final Runnable mfE;
  private final Runnable mfF;
  private volatile boolean mfL;
  private int mfM;
  private int mfN;
  private int[] mfO;
  private boolean mfP;
  private String mfQ;
  public int mfR;
  private h mfS;
  private float mfn;
  private float mfo;
  private boolean mfp;
  private long mfy;
  private final Rect to;
  
  public d(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, int paramInt, int[] paramArrayOfInt, String paramString)
  {
    GMTrace.i(12890807468032L, 96044);
    this.mfL = false;
    this.kuY = 0;
    this.mCurrentBitmap = null;
    this.mfP = false;
    this.mIsPlaying = true;
    this.mfR = 0;
    this.mfn = 1.0F;
    this.mfo = 1.0F;
    this.to = new Rect();
    this.mPaint = new Paint(6);
    this.krX = new ae(Looper.getMainLooper());
    this.mfy = 0L;
    this.mfF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12883291275264L, 95988);
        if (SystemClock.uptimeMillis() >= d.a(d.this)) {
          d.this.invalidateSelf();
        }
        GMTrace.o(12883291275264L, 95988);
      }
    };
    this.mfE = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12889733726208L, 96036);
        GMTrace.o(12889733726208L, 96036);
      }
    };
    this.mContext = paramContext;
    this.mResources = this.mContext.getResources();
    this.mfP = false;
    this.mIsPlaying = paramBoolean2;
    this.mfQ = paramString;
    this.mfN = paramInt;
    this.mfO = paramArrayOfInt;
    if (!paramBoolean2)
    {
      this.mCurrentBitmap = oY(Aa(paramString));
      this.mWidth = this.mCurrentBitmap.getWidth();
      this.mHeight = this.mCurrentBitmap.getHeight();
      if (this.mfO.length != 3) {
        break label250;
      }
    }
    label250:
    for (this.mfM = 300;; this.mfM = 100)
    {
      this.mfR = 0;
      GMTrace.o(12890807468032L, 96044);
      return;
      this.mCurrentBitmap = oY(this.mfO[0]);
      break;
    }
  }
  
  private int Aa(String paramString)
  {
    GMTrace.i(12892552298496L, 96057);
    paramString = paramString.split("\\.")[0];
    int i = this.mResources.getIdentifier(paramString, "drawable", this.mContext.getPackageName());
    GMTrace.o(12892552298496L, 96057);
    return i;
  }
  
  private void f(Runnable paramRunnable, long paramLong)
  {
    GMTrace.i(12891075903488L, 96046);
    this.mfy = (SystemClock.uptimeMillis() + paramLong);
    if (this.krX != null) {
      this.krX.postDelayed(paramRunnable, paramLong);
    }
    GMTrace.o(12891075903488L, 96046);
  }
  
  private Bitmap oY(int paramInt)
  {
    GMTrace.i(12892418080768L, 96056);
    Bitmap localBitmap = BitmapFactory.decodeResource(this.mResources, paramInt);
    GMTrace.o(12892418080768L, 96056);
    return localBitmap;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(12890941685760L, 96045);
    if (this.mfp)
    {
      this.to.set(getBounds());
      this.mfn = (this.to.width() / this.mWidth);
      this.mfo = (this.to.height() / this.mHeight);
      this.mfp = false;
    }
    if (this.mPaint.getShader() == null)
    {
      paramCanvas.scale(this.mfn, this.mfo);
      if (this.mfP)
      {
        this.mCurrentBitmap = oY(this.mfN);
        if ((this.mCurrentBitmap != null) && (!this.mCurrentBitmap.isRecycled()))
        {
          paramCanvas.drawBitmap(this.mCurrentBitmap, 0.0F, 0.0F, this.mPaint);
          GMTrace.o(12890941685760L, 96045);
        }
      }
      else if (!this.mIsPlaying)
      {
        this.mCurrentBitmap = oY(Aa(this.mfQ));
        if ((this.mCurrentBitmap != null) && (!this.mCurrentBitmap.isRecycled()))
        {
          paramCanvas.drawBitmap(this.mCurrentBitmap, 0.0F, 0.0F, this.mPaint);
          GMTrace.o(12890941685760L, 96045);
        }
      }
      else
      {
        w.i("MicroMsg.GIF.MMGIFGameDrawable", "mCurrentIndex:%d mNextInvaliteTime:%d mLoop:%d", new Object[] { Integer.valueOf(this.kuY), Integer.valueOf(this.mfM), Integer.valueOf(this.mfR) });
        this.mCurrentBitmap = oY(this.mfO[this.kuY]);
        if ((this.mCurrentBitmap != null) && (!this.mCurrentBitmap.isRecycled())) {
          paramCanvas.drawBitmap(this.mCurrentBitmap, 0.0F, 0.0F, this.mPaint);
        }
        this.kuY += 1;
        if (this.mfR < 3)
        {
          if (this.kuY >= this.mfO.length)
          {
            this.kuY = 0;
            this.mfR += 1;
          }
          f(this.mfF, this.mfM);
          GMTrace.o(12890941685760L, 96045);
          return;
        }
        this.mIsPlaying = false;
        f(this.mfF, this.mfM);
        f(this.mfE, 0L);
        GMTrace.o(12890941685760L, 96045);
      }
    }
    else
    {
      w.i("MicroMsg.GIF.MMGIFGameDrawable", "shader is not null.");
      paramCanvas.drawRect(this.to, this.mPaint);
    }
    GMTrace.o(12890941685760L, 96045);
  }
  
  protected final void finalize()
  {
    GMTrace.i(12892686516224L, 96058);
    this.mfS = null;
    super.finalize();
    GMTrace.o(12892686516224L, 96058);
  }
  
  public final int getIntrinsicHeight()
  {
    GMTrace.i(12891210121216L, 96047);
    int i = this.mHeight;
    GMTrace.o(12891210121216L, 96047);
    return i;
  }
  
  public final int getIntrinsicWidth()
  {
    GMTrace.i(12891344338944L, 96048);
    int i = this.mWidth;
    GMTrace.o(12891344338944L, 96048);
    return i;
  }
  
  public final int getOpacity()
  {
    GMTrace.i(12891746992128L, 96051);
    GMTrace.o(12891746992128L, 96051);
    return -2;
  }
  
  public final boolean isRunning()
  {
    GMTrace.i(12892283863040L, 96055);
    boolean bool = this.mfL;
    GMTrace.o(12892283863040L, 96055);
    return bool;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    GMTrace.i(12891881209856L, 96052);
    super.onBoundsChange(paramRect);
    this.mfp = true;
    GMTrace.o(12891881209856L, 96052);
  }
  
  public final void recycle()
  {
    GMTrace.i(20134001377280L, 150010);
    GMTrace.o(20134001377280L, 150010);
  }
  
  public final void reset()
  {
    GMTrace.i(20134135595008L, 150011);
    GMTrace.o(20134135595008L, 150011);
  }
  
  public final void setAlpha(int paramInt)
  {
    GMTrace.i(12891478556672L, 96049);
    this.mPaint.setAlpha(paramInt);
    GMTrace.o(12891478556672L, 96049);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(12891612774400L, 96050);
    this.mPaint.setColorFilter(paramColorFilter);
    GMTrace.o(12891612774400L, 96050);
  }
  
  public final void start()
  {
    GMTrace.i(12892015427584L, 96053);
    this.mfL = true;
    this.krX.post(this.mfF);
    GMTrace.o(12892015427584L, 96053);
  }
  
  public final void stop()
  {
    GMTrace.i(12892149645312L, 96054);
    this.mfL = false;
    GMTrace.o(12892149645312L, 96054);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\gif\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */