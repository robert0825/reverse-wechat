package com.tencent.mm.plugin.gallery.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.gallery.model.a;
import com.tencent.mm.plugin.gallery.model.b.b;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class h
  extends Drawable
  implements b.b
{
  private static final Paint gid;
  private static Rect rect;
  protected int eGK;
  protected ImageView kve;
  protected String lAW;
  protected long lAX;
  protected boolean lFq;
  public a lFr;
  long lFs;
  boolean lFt;
  private Rect lFu;
  private Runnable lFv;
  private Bitmap mBitmap;
  protected String mFilePath;
  private int mWidth;
  
  static
  {
    GMTrace.i(11939740647424L, 88958);
    gid = new Paint();
    rect = null;
    gid.setAntiAlias(true);
    gid.setFilterBitmap(true);
    GMTrace.o(11939740647424L, 88958);
  }
  
  private h(ImageView paramImageView)
  {
    GMTrace.i(11937727381504L, 88943);
    this.eGK = 0;
    this.mFilePath = "";
    this.lAW = "";
    this.lFq = false;
    this.lAX = 0L;
    this.lFt = false;
    this.lFu = new Rect();
    this.lFv = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11927392616448L, 88866);
        w.v("MicroMsg.ThumbDrawable", "invalidateSelf");
        h localh = h.this;
        a locala = c.aCK();
        String str1 = h.this.mFilePath;
        String str2 = h.this.lAW;
        long l = h.this.lAX;
        h.a(localh, locala.zc(str1));
        if ((h.this.lFr != null) && (h.a(h.this) != null) && (!h.a(h.this).isRecycled())) {
          h.this.lFr.aDu();
        }
        h.this.lFs = SystemClock.uptimeMillis();
        h.this.invalidateSelf();
        GMTrace.o(11927392616448L, 88866);
      }
    };
    this.kve = paramImageView;
    this.mFilePath = "";
    GMTrace.o(11937727381504L, 88943);
  }
  
  public static void a(ImageView paramImageView, int paramInt, String paramString1, String paramString2, long paramLong)
  {
    GMTrace.i(11938801123328L, 88951);
    a(paramImageView, paramInt, paramString1, paramString2, paramLong, -1, null);
    GMTrace.o(11938801123328L, 88951);
  }
  
  public static void a(ImageView paramImageView, int paramInt1, String paramString1, String paramString2, long paramLong, int paramInt2, a parama)
  {
    GMTrace.i(11938935341056L, 88952);
    Object localObject = paramImageView.getDrawable();
    if ((localObject != null) && ((localObject instanceof h)))
    {
      localObject = (h)localObject;
      if (paramInt2 > 0) {
        ((h)localObject).mWidth = paramInt2;
      }
      ((h)localObject).lFr = parama;
      if (!bg.nm(paramString1)) {
        break label106;
      }
    }
    label106:
    for (parama = paramString2;; parama = paramString1)
    {
      if (!bg.nm(parama)) {
        break label112;
      }
      w.e("MicroMsg.ThumbDrawable", "filepath is null or nil");
      paramImageView.setImageDrawable((Drawable)localObject);
      GMTrace.o(11938935341056L, 88952);
      return;
      localObject = new h(paramImageView);
      break;
    }
    label112:
    label125:
    boolean bool1;
    if (!bg.nm(paramString1))
    {
      ((h)localObject).lFq = true;
      c.aCK().a((b.b)localObject);
      if ((((h)localObject).mFilePath.equals(parama)) && (((h)localObject).mBitmap != null) && (!((h)localObject).mBitmap.isRecycled())) {
        break label394;
      }
      ((h)localObject).mFilePath = parama;
      ((h)localObject).lAW = paramString2;
      ((h)localObject).lAX = paramLong;
      ((h)localObject).eGK = paramInt1;
      ((h)localObject).mBitmap = c.aCK().zc(((h)localObject).mFilePath);
      if (((h)localObject).mBitmap != null) {
        break label373;
      }
      bool1 = true;
      label218:
      if (((h)localObject).mBitmap == null) {
        break label379;
      }
      bool2 = ((h)localObject).mBitmap.isRecycled();
      label236:
      w.d("MicroMsg.ThumbDrawable", "setMediaFeature ok filePath:[%s] mBitmap:[%s], mBitmap.isRecycled():[%s]", new Object[] { parama, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((((h)localObject).mBitmap != null) && (!((h)localObject).mBitmap.isRecycled())) {
        break label385;
      }
      ((h)localObject).lFt = true;
      ((h)localObject).lFs = 0L;
      ((h)localObject).mBitmap = c.aCK().b(parama, paramInt1, paramString2, paramLong);
    }
    for (;;)
    {
      if ((((h)localObject).lFr != null) && (((h)localObject).mBitmap != null) && (!((h)localObject).mBitmap.isRecycled())) {
        ((h)localObject).lFr.aDu();
      }
      ((h)localObject).kve.invalidate();
      break;
      ((h)localObject).lFq = false;
      break label125;
      label373:
      bool1 = false;
      break label218;
      label379:
      bool2 = false;
      break label236;
      label385:
      ((h)localObject).lFt = false;
    }
    label394:
    if (((h)localObject).mBitmap == null)
    {
      bool1 = true;
      label405:
      if (((h)localObject).mBitmap == null) {
        break label464;
      }
    }
    label464:
    for (boolean bool2 = ((h)localObject).mBitmap.isRecycled();; bool2 = false)
    {
      w.d("MicroMsg.ThumbDrawable", "setMediaFeature fuck filePath:[%s] mBitmap:[%s], mBitmap.isRecycled():[%s]", new Object[] { parama, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      break;
      bool1 = false;
      break label405;
    }
  }
  
  private boolean c(Canvas paramCanvas, int paramInt)
  {
    GMTrace.i(11938532687872L, 88949);
    if ((this.mBitmap == null) || (this.mBitmap.isRecycled()))
    {
      w.d("MicroMsg.ThumbDrawable", "[duanyi test] get bitmap is null: " + this.mFilePath);
      if ((this.mBitmap != null) && (this.mBitmap.isRecycled()))
      {
        this.lFt = true;
        this.lFs = 0L;
        this.mBitmap = c.aCK().b(this.mFilePath, this.eGK, this.lAW, this.lAX);
        if ((this.lFr != null) && (this.mBitmap != null) && (!this.mBitmap.isRecycled())) {
          this.lFr.aDu();
        }
      }
      GMTrace.o(11938532687872L, 88949);
      return false;
    }
    w.d("MicroMsg.ThumbDrawable", "[duanyi test] get bitmap ok:" + this.mFilePath);
    Bitmap localBitmap = this.mBitmap;
    Rect localRect = this.lFu;
    int i;
    if (localBitmap.getWidth() > localBitmap.getHeight())
    {
      localRect.top = 0;
      localRect.bottom = localBitmap.getHeight();
      localRect.left = (localBitmap.getWidth() - localBitmap.getHeight() >> 1);
      i = localRect.left;
      localRect.right = (localBitmap.getHeight() + i);
    }
    for (;;)
    {
      gid.setAlpha(paramInt);
      paramCanvas.drawBitmap(this.mBitmap, this.lFu, getBounds(), gid);
      w.v("MicroMsg.ThumbDrawable", "Bounts:%s", new Object[] { getBounds().toString() });
      GMTrace.o(11938532687872L, 88949);
      return true;
      localRect.left = 0;
      localRect.right = localBitmap.getWidth();
      localRect.top = (localBitmap.getHeight() - localBitmap.getWidth() >> 1);
      i = localRect.top;
      localRect.bottom = (localBitmap.getWidth() + i);
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    GMTrace.i(11938398470144L, 88948);
    float f = (float)(SystemClock.uptimeMillis() - this.lFs) / 200.0F;
    if (this.lFs == 0L)
    {
      w.d("MicroMsg.ThumbDrawable", "[duanyi test]: draw:[%s] startTimeMillis is 0", new Object[] { this.mFilePath });
      f = 0.0F;
    }
    w.d("MicroMsg.ThumbDrawable", "[duanyi test]: hash:[%s] draw:[%s] animating:[%s] normalized:[%s] alpha[%s]", new Object[] { Integer.valueOf(hashCode()), this.mFilePath, Boolean.valueOf(this.lFt), Float.valueOf(f), Integer.valueOf((int)(255.0F * f)) });
    if (!this.lFt)
    {
      c(paramCanvas, 255);
      setAlpha(255);
      GMTrace.o(11938398470144L, 88948);
      return;
    }
    if (f >= 1.0F)
    {
      this.lFt = false;
      c(paramCanvas, 255);
      GMTrace.o(11938398470144L, 88948);
      return;
    }
    if (c(paramCanvas, (int)(f * 255.0F))) {
      invalidateSelf();
    }
    GMTrace.o(11938398470144L, 88948);
  }
  
  public final int getIntrinsicHeight()
  {
    GMTrace.i(11937995816960L, 88945);
    GMTrace.o(11937995816960L, 88945);
    return 400;
  }
  
  public final int getIntrinsicWidth()
  {
    GMTrace.i(11937861599232L, 88944);
    GMTrace.o(11937861599232L, 88944);
    return 400;
  }
  
  public final int getOpacity()
  {
    GMTrace.i(11939337994240L, 88955);
    GMTrace.o(11939337994240L, 88955);
    return 0;
  }
  
  public final void setAlpha(int paramInt)
  {
    GMTrace.i(11939069558784L, 88953);
    GMTrace.o(11939069558784L, 88953);
  }
  
  public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(11938130034688L, 88946);
    w.v("MicroMsg.ThumbDrawable", "setBountsLTRB:%d %d - %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(11938130034688L, 88946);
  }
  
  public final void setBounds(Rect paramRect)
  {
    GMTrace.i(11938264252416L, 88947);
    w.v("MicroMsg.ThumbDrawable", "setBountsRECT:%s", new Object[] { paramRect.toString() });
    super.setBounds(paramRect);
    GMTrace.o(11938264252416L, 88947);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(11939203776512L, 88954);
    GMTrace.o(11939203776512L, 88954);
  }
  
  public final void zd(String paramString)
  {
    GMTrace.i(11938666905600L, 88950);
    if (bg.nm(paramString))
    {
      w.d("MicroMsg.ThumbDrawable", "filepath is null or nill");
      GMTrace.o(11938666905600L, 88950);
      return;
    }
    if (!this.mFilePath.equals(paramString))
    {
      w.d("MicroMsg.ThumbDrawable", "not current filepath:[%s]", new Object[] { paramString });
      GMTrace.o(11938666905600L, 88950);
      return;
    }
    w.d("MicroMsg.ThumbDrawable", "notify thumb get " + paramString);
    this.kve.post(this.lFv);
    GMTrace.o(11938666905600L, 88950);
  }
  
  public static abstract interface a
  {
    public abstract void aDu();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */