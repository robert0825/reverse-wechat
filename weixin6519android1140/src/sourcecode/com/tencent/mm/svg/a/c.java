package com.tencent.mm.svg.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;

public final class c
  extends b
{
  private a vEH;
  
  public c(Picture paramPicture, int paramInt) {}
  
  public final void draw(Canvas paramCanvas)
  {
    int i = 1;
    int j = 0;
    GMTrace.i(3482413170688L, 25946);
    long l1 = com.tencent.mm.svg.b.b.bVz();
    label268:
    label345:
    label372:
    label446:
    label483:
    label507:
    label509:
    for (;;)
    {
      long l2;
      try
      {
        if (!paramCanvas.isHardwareAccelerated()) {
          break label372;
        }
        if (this.vEH.vEI == null)
        {
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGPictureDrawable", "Must not go here! %s", new Object[] { Integer.valueOf(this.vEz) });
          if (this.vEH.vEJ == null) {
            break label507;
          }
          if (!this.vEH.vEJ.isRecycled()) {
            break label345;
          }
          break label507;
          if (this.kZL == null) {
            this.kZL = a.u(this);
          }
          a.b(this.kZL, this.vEB);
          if (i != 0) {
            break label483;
          }
          if ((!paramCanvas.isHardwareAccelerated()) || (Build.VERSION.SDK_INT >= 16)) {
            break label446;
          }
          com.tencent.mm.svg.b.c.i("MicroMsg.SVGPictureDrawable", "Skip this draw.", new Object[0]);
          this.mDuration = com.tencent.mm.svg.b.b.eU(l1);
          i(paramCanvas);
          GMTrace.o(3482413170688L, 25946);
          return;
        }
        l2 = System.nanoTime();
        if ((this.vEH.vEJ != null) && (!this.vEH.vEJ.isRecycled())) {
          continue;
        }
        if ((getIntrinsicWidth() > 2048) || (getIntrinsicHeight() > 2048))
        {
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGPictureDrawable", "This drawable is too big. %s", new Object[] { Integer.valueOf(this.vEz) });
          continue;
        }
        if (getIntrinsicWidth() <= 0) {
          break label268;
        }
      }
      finally
      {
        this.mDuration = com.tencent.mm.svg.b.b.eU(l1);
        i(paramCanvas);
      }
      if (getIntrinsicHeight() <= 0)
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGPictureDrawable", "width and height must > 0.", new Object[0]);
      }
      else
      {
        Object localObject2 = Bitmap.createBitmap(getIntrinsicWidth(), getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new Canvas((Bitmap)localObject2);
        this.vEH.vEI.draw(localCanvas);
        this.vEH.vEJ = ((Bitmap)localObject2);
        com.tencent.mm.svg.b.b.eU(l2);
        i(localCanvas);
        continue;
        bVs();
        paramCanvas.drawBitmap(this.vEH.vEJ, null, this.to, this.vEB);
        break label509;
        i = j;
        if (this.vEH.vEJ != null)
        {
          i = j;
          if (!this.vEH.vEJ.isRecycled())
          {
            com.tencent.mm.svg.b.c.i("MicroMsg.SVGPictureDrawable", "recycle bitmap:%s", new Object[] { this.vEH.vEJ.toString() });
            this.vEH.vEJ.recycle();
            this.vEH.vEJ = null;
            i = j;
            continue;
            localObject2 = this.vEH.vEI;
            if (localObject2 != null)
            {
              bVs();
              paramCanvas.save();
              paramCanvas.drawPicture((Picture)localObject2, this.to);
              paramCanvas.restore();
            }
            this.mDuration = com.tencent.mm.svg.b.b.eU(l1);
            i(paramCanvas);
            GMTrace.o(3482413170688L, 25946);
            return;
            i = 0;
          }
        }
      }
    }
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    GMTrace.i(3482278952960L, 25945);
    a locala = this.vEH;
    GMTrace.o(3482278952960L, 25945);
    return locala;
  }
  
  public static final class a
    extends Drawable.ConstantState
  {
    protected int qCd;
    protected Picture vEI;
    protected Bitmap vEJ;
    
    public a(Picture paramPicture, int paramInt)
    {
      GMTrace.i(3489392492544L, 25998);
      this.vEI = paramPicture;
      this.qCd = paramInt;
      GMTrace.o(3489392492544L, 25998);
    }
    
    public final int getChangingConfigurations()
    {
      GMTrace.i(3489660928000L, 26000);
      GMTrace.o(3489660928000L, 26000);
      return 0;
    }
    
    public final Drawable newDrawable()
    {
      GMTrace.i(3489526710272L, 25999);
      c localc = new c(this.vEI, this.qCd);
      GMTrace.o(3489526710272L, 25999);
      return localc;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\svg\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */