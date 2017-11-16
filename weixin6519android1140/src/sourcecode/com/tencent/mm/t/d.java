package com.tencent.mm.t;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bg.a.d;
import com.tencent.mm.by.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class d
  implements Cloneable
{
  private static int fWH;
  private static Paint fWJ;
  private LinkedList<b> ewA;
  public int ewB;
  private Bitmap fWI;
  private float fy;
  private Path mf;
  
  static
  {
    GMTrace.i(19625047752704L, 146218);
    fWH = a.aC(12.0F);
    Paint localPaint = new Paint();
    fWJ = localPaint;
    localPaint.setAntiAlias(true);
    fWJ.setStyle(Paint.Style.STROKE);
    fWJ.setColor(-16776961);
    fWJ.setStrokeCap(Paint.Cap.ROUND);
    GMTrace.o(19625047752704L, 146218);
  }
  
  public d(int paramInt, Path paramPath, float paramFloat, Bitmap paramBitmap)
  {
    GMTrace.i(19624510881792L, 146214);
    this.ewB = paramInt;
    this.fWI = paramBitmap;
    this.mf = paramPath;
    this.fy = paramFloat;
    fWJ.setStrokeWidth(a.aC(34.0F) * paramFloat);
    GMTrace.o(19624510881792L, 146214);
  }
  
  public d(int paramInt, a<LinkedList> parama, float paramFloat)
  {
    GMTrace.i(19624645099520L, 146215);
    this.ewB = paramInt;
    this.ewA = parama;
    this.fy = paramFloat;
    fWJ.setStrokeWidth(a.aC(34.0F) * paramFloat);
    GMTrace.o(19624645099520L, 146215);
  }
  
  public static void clear()
  {
    GMTrace.i(19624913534976L, 146217);
    GMTrace.o(19624913534976L, 146217);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    float f1 = 0.0F;
    GMTrace.i(19624779317248L, 146216);
    Object localObject1;
    if (this.ewB == a.fWK)
    {
      localObject1 = this.fWI;
      if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
      {
        paramCanvas.saveLayer(0.0F, 0.0F, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight(), null, 31);
        paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        paramCanvas.drawPath(this.mf, fWJ);
        fWJ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paramCanvas.drawBitmap((Bitmap)localObject1, 0.0F, 0.0F, fWJ);
        fWJ.setXfermode(null);
        paramCanvas.restore();
      }
      GMTrace.o(19624779317248L, 146216);
      return;
    }
    float f2;
    int j;
    float f5;
    Object localObject2;
    if (this.ewB == a.fWL)
    {
      if (this.ewA.size() <= 0)
      {
        GMTrace.o(19624779317248L, 146216);
        return;
      }
      localObject1 = (b)this.ewA.getLast();
      f2 = ((b)localObject1).fWN;
      int i = ((b)localObject1).color;
      j = (int)(Math.random() * 100.0D);
      f5 = fWH * f2;
      localObject2 = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
      BitmapFactory.decodeResource(ab.getContext().getResources(), a.d.tla, (BitmapFactory.Options)localObject2);
      ((BitmapFactory.Options)localObject2).inSampleSize = a.a((BitmapFactory.Options)localObject2, Math.round(((BitmapFactory.Options)localObject2).outWidth * f2 * 0.7F), Math.round(f2 * ((BitmapFactory.Options)localObject2).outHeight * 0.7F));
      ((BitmapFactory.Options)localObject2).inJustDecodeBounds = false;
      localObject2 = BitmapFactory.decodeResource(ab.getContext().getResources(), a.d.tla, (BitmapFactory.Options)localObject2);
      fWJ.setStyle(Paint.Style.FILL);
      fWJ.setColorFilter(new LightingColorFilter(i, 1));
      if (localObject2 == null) {
        break label481;
      }
      f2 = ((b)localObject1).centerX - 1.0F * ((Bitmap)localObject2).getWidth() / 2.0F;
      f1 = ((b)localObject1).centerY - 1.0F * ((Bitmap)localObject2).getHeight() / 2.0F;
    }
    for (;;)
    {
      float f4;
      float f3;
      if ((j > 0) && (j <= 20))
      {
        f4 = f2 + f5;
        f3 = f1 + f5;
      }
      for (;;)
      {
        paramCanvas.save();
        paramCanvas.rotate(-((b)localObject1).rotation, ((b)localObject1).centerX, ((b)localObject1).centerY);
        if (localObject2 != null) {
          paramCanvas.drawBitmap((Bitmap)localObject2, f4, f3, fWJ);
        }
        paramCanvas.restore();
        fWJ.setStyle(Paint.Style.STROKE);
        fWJ.setColorFilter(null);
        GMTrace.o(19624779317248L, 146216);
        return;
        f3 = f1;
        f4 = f2;
        if (80 < j)
        {
          f4 = f2 - f5;
          f3 = f1 - f5;
        }
      }
      label481:
      f2 = 0.0F;
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(19626255712256L, 146227);
      fWK = 1;
      fWL = 2;
      fWM = new int[] { fWK, fWL };
      GMTrace.o(19626255712256L, 146227);
    }
  }
  
  public static final class b
  {
    public float centerX;
    public float centerY;
    public int color;
    public float fWN;
    public float rotation;
    
    public b(float paramFloat1, int paramInt, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      GMTrace.i(19622229180416L, 146197);
      this.fWN = 0.0F;
      this.rotation = 0.0F;
      this.color = 0;
      this.fWN = paramFloat1;
      this.color = paramInt;
      this.rotation = paramFloat2;
      this.centerX = paramFloat3;
      this.centerY = paramFloat4;
      GMTrace.o(19622229180416L, 146197);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\t\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */