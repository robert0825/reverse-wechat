package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.l;

public class CircularImageView
  extends ImageView
{
  private static final String TAG;
  private Paint jrC;
  private boolean mbA;
  private int nfi;
  private boolean pKR;
  private boolean pKS;
  private int pKT;
  private int pKU;
  private boolean pKV;
  private float pKW;
  private float pKX;
  private float pKY;
  private BitmapShader pKZ;
  private Bitmap pLa;
  private Paint pLb;
  private Paint pLc;
  private ColorFilter pLd;
  private int shadowColor;
  
  static
  {
    GMTrace.i(8217480396800L, 61225);
    TAG = CircularImageView.class.getSimpleName();
    GMTrace.o(8217480396800L, 61225);
  }
  
  public CircularImageView(Context paramContext)
  {
    this(paramContext, null, i.l.plt);
    GMTrace.i(8215735566336L, 61212);
    GMTrace.o(8215735566336L, 61212);
  }
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i.l.plt);
    GMTrace.i(8215869784064L, 61213);
    GMTrace.o(8215869784064L, 61213);
  }
  
  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8216004001792L, 61214);
    this.jrC = new Paint();
    this.jrC.setAntiAlias(true);
    this.pLb = new Paint();
    this.pLb.setAntiAlias(true);
    this.pLb.setStyle(Paint.Style.STROKE);
    this.pLc = new Paint();
    this.pLc.setAntiAlias(true);
    if (Build.VERSION.SDK_INT >= 11) {
      setLayerType(1, null);
    }
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, i.l.plr, paramInt, 0);
    this.pKR = paramAttributeSet.getBoolean(i.l.plu, false);
    this.pKS = paramAttributeSet.getBoolean(i.l.plx, false);
    this.pKV = paramAttributeSet.getBoolean(i.l.plB, false);
    if (this.pKR)
    {
      paramInt = (int)(paramContext.getResources().getDisplayMetrics().density * 2.0F + 0.5F);
      paramInt = paramAttributeSet.getDimensionPixelOffset(i.l.plw, paramInt);
      this.nfi = paramInt;
      if (this.pLb != null) {
        this.pLb.setStrokeWidth(paramInt);
      }
      requestLayout();
      invalidate();
      paramInt = paramAttributeSet.getColor(i.l.plv, -1);
      if (this.pLb != null) {
        this.pLb.setColor(paramInt);
      }
      invalidate();
    }
    if (this.pKS)
    {
      paramInt = (int)(paramContext.getResources().getDisplayMetrics().density * 2.0F + 0.5F);
      this.pLd = new PorterDuffColorFilter(paramAttributeSet.getColor(i.l.ply, 0), PorterDuff.Mode.SRC_ATOP);
      invalidate();
      this.pKU = paramAttributeSet.getDimensionPixelOffset(i.l.plA, paramInt);
      requestLayout();
      invalidate();
      paramInt = paramAttributeSet.getColor(i.l.plz, -16776961);
      if (this.pLc != null) {
        this.pLc.setColor(paramInt);
      }
      invalidate();
    }
    if (this.pKV)
    {
      this.pKW = paramAttributeSet.getFloat(i.l.plF, 4.0F);
      this.pKX = paramAttributeSet.getFloat(i.l.plD, 0.0F);
      this.pKY = paramAttributeSet.getFloat(i.l.plE, 2.0F);
      this.shadowColor = paramAttributeSet.getColor(i.l.plC, -16777216);
      this.pKV = true;
      if (this.pKV) {
        f = this.pKW;
      }
      this.pLb.setShadowLayer(f, this.pKX, this.pKY, this.shadowColor);
      this.pLc.setShadowLayer(f, this.pKX, this.pKY, this.shadowColor);
    }
    paramAttributeSet.recycle();
    GMTrace.o(8216004001792L, 61214);
  }
  
  private void blt()
  {
    GMTrace.i(8217211961344L, 61223);
    if (this.pLa == null)
    {
      GMTrace.o(8217211961344L, 61223);
      return;
    }
    this.pKZ = new BitmapShader(this.pLa, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    if ((this.pKT != this.pLa.getWidth()) || (this.pKT != this.pLa.getHeight()))
    {
      Matrix localMatrix = new Matrix();
      float f = this.pKT / this.pLa.getWidth();
      localMatrix.setScale(f, f);
      this.pKZ.setLocalMatrix(localMatrix);
    }
    GMTrace.o(8217211961344L, 61223);
  }
  
  private static Bitmap r(Drawable paramDrawable)
  {
    GMTrace.i(8217077743616L, 61222);
    if (paramDrawable == null)
    {
      GMTrace.o(8217077743616L, 61222);
      return null;
    }
    if ((paramDrawable instanceof BitmapDrawable))
    {
      paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
      GMTrace.o(8217077743616L, 61222);
      return paramDrawable;
    }
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if ((i <= 0) || (j <= 0))
    {
      GMTrace.o(8217077743616L, 61222);
      return null;
    }
    try
    {
      Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
      paramDrawable.draw(localCanvas);
      GMTrace.o(8217077743616L, 61222);
      return localBitmap;
    }
    catch (OutOfMemoryError paramDrawable)
    {
      GMTrace.o(8217077743616L, 61222);
    }
    return null;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(8216272437248L, 61216);
    boolean bool;
    if (!isClickable())
    {
      this.mbA = false;
      bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(8216272437248L, 61216);
      return bool;
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      invalidate();
      bool = super.dispatchTouchEvent(paramMotionEvent);
      GMTrace.o(8216272437248L, 61216);
      return bool;
      this.mbA = true;
      continue;
      this.mbA = false;
    }
  }
  
  public boolean isSelected()
  {
    GMTrace.i(8217346179072L, 61224);
    boolean bool = this.mbA;
    GMTrace.o(8217346179072L, 61224);
    return bool;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    int j = 0;
    GMTrace.i(8216138219520L, 61215);
    if (this.pLa == null)
    {
      GMTrace.o(8216138219520L, 61215);
      return;
    }
    if ((this.pLa.getHeight() == 0) || (this.pLa.getWidth() == 0))
    {
      GMTrace.o(8216138219520L, 61215);
      return;
    }
    int k = this.pKT;
    int i;
    if (getWidth() < getHeight())
    {
      i = getWidth();
      this.pKT = i;
      if (k != this.pKT) {
        blt();
      }
      this.jrC.setShader(this.pKZ);
      i = this.pKT / 2;
      if ((!this.pKS) || (!this.mbA)) {
        break label236;
      }
      j = this.pKU;
      i = (this.pKT - j * 2) / 2;
      this.jrC.setColorFilter(this.pLd);
      paramCanvas.drawCircle(i + j, i + j, (this.pKT - j * 2) / 2 + j - 4.0F, this.pLc);
    }
    for (;;)
    {
      paramCanvas.drawCircle(i + j, i + j, (this.pKT - j * 2) / 2, this.jrC);
      GMTrace.o(8216138219520L, 61215);
      return;
      i = getHeight();
      break;
      label236:
      if (this.pKR)
      {
        j = this.nfi;
        i = (this.pKT - j * 2) / 2;
        this.jrC.setColorFilter(null);
        paramCanvas.drawArc(new RectF(j / 2 + 0, j / 2 + 0, this.pKT - j / 2, this.pKT - j / 2), 360.0F, 360.0F, false, this.pLb);
      }
      else
      {
        this.jrC.setColorFilter(null);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8216943525888L, 61221);
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (i == 1073741824)
    {
      i = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if (i != 1073741824) {
        break label76;
      }
    }
    for (;;)
    {
      setMeasuredDimension(paramInt1, paramInt2 + 2);
      GMTrace.o(8216943525888L, 61221);
      return;
      if (i == Integer.MIN_VALUE) {
        break;
      }
      paramInt1 = this.pKT;
      break;
      label76:
      if (i != Integer.MIN_VALUE) {
        paramInt2 = this.pKT;
      }
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(8216809308160L, 61220);
    super.setImageBitmap(paramBitmap);
    this.pLa = paramBitmap;
    if (this.pKT > 0) {
      blt();
    }
    GMTrace.o(8216809308160L, 61220);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    GMTrace.i(8216675090432L, 61219);
    super.setImageDrawable(paramDrawable);
    this.pLa = r(getDrawable());
    if (this.pKT > 0) {
      blt();
    }
    GMTrace.o(8216675090432L, 61219);
  }
  
  public void setImageResource(int paramInt)
  {
    GMTrace.i(8216540872704L, 61218);
    super.setImageResource(paramInt);
    this.pLa = r(getDrawable());
    if (this.pKT > 0) {
      blt();
    }
    GMTrace.o(8216540872704L, 61218);
  }
  
  public void setImageURI(Uri paramUri)
  {
    GMTrace.i(8216406654976L, 61217);
    super.setImageURI(paramUri);
    this.pLa = r(getDrawable());
    if (this.pKT > 0) {
      blt();
    }
    GMTrace.o(8216406654976L, 61217);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\widget\CircularImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */