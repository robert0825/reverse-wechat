package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.n;

public class CircleImageView
  extends ImageView
{
  private static final Bitmap.Config ghN;
  private static final ImageView.ScaleType meq;
  private int hc;
  private ColorFilter ly;
  private Bitmap mBitmap;
  private boolean meA;
  private final RectF mer;
  private final RectF mes;
  private final Paint met;
  private final Paint meu;
  private int mev;
  private float mew;
  private float mex;
  private boolean mey;
  private boolean mez;
  private BitmapShader tm;
  private final Matrix tn;
  private int ts;
  private int tt;
  
  static
  {
    GMTrace.i(12582240911360L, 93745);
    meq = ImageView.ScaleType.CENTER_CROP;
    ghN = Bitmap.Config.ARGB_8888;
    GMTrace.o(12582240911360L, 93745);
  }
  
  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(12580361863168L, 93731);
    GMTrace.o(12580361863168L, 93731);
  }
  
  public CircleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12580496080896L, 93732);
    this.mer = new RectF();
    this.mes = new RectF();
    this.tn = new Matrix();
    this.met = new Paint();
    this.meu = new Paint();
    this.mev = -16777216;
    this.hc = 0;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.emJ, paramInt, 0);
    this.hc = paramContext.getDimensionPixelSize(R.n.emM, 0);
    this.mev = paramContext.getColor(R.n.emK, -16777216);
    this.meA = paramContext.getBoolean(R.n.emL, false);
    paramContext.recycle();
    super.setScaleType(meq);
    this.mey = true;
    if (this.mez)
    {
      setup();
      this.mez = false;
    }
    GMTrace.o(12580496080896L, 93732);
  }
  
  private static Bitmap p(Drawable paramDrawable)
  {
    GMTrace.i(12581972475904L, 93743);
    if (paramDrawable == null)
    {
      GMTrace.o(12581972475904L, 93743);
      return null;
    }
    if ((paramDrawable instanceof BitmapDrawable))
    {
      paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
      GMTrace.o(12581972475904L, 93743);
      return paramDrawable;
    }
    try
    {
      if ((paramDrawable instanceof ColorDrawable)) {}
      for (Bitmap localBitmap = Bitmap.createBitmap(2, 2, ghN);; localBitmap = Bitmap.createBitmap(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight(), ghN))
      {
        Canvas localCanvas = new Canvas(localBitmap);
        paramDrawable.setBounds(0, 0, localCanvas.getWidth(), localCanvas.getHeight());
        paramDrawable.draw(localCanvas);
        GMTrace.o(12581972475904L, 93743);
        return localBitmap;
      }
      return null;
    }
    catch (OutOfMemoryError paramDrawable)
    {
      GMTrace.o(12581972475904L, 93743);
    }
  }
  
  private void setup()
  {
    float f2 = 0.0F;
    GMTrace.i(12582106693632L, 93744);
    if (!this.mey)
    {
      this.mez = true;
      GMTrace.o(12582106693632L, 93744);
      return;
    }
    if (this.mBitmap == null)
    {
      GMTrace.o(12582106693632L, 93744);
      return;
    }
    this.tm = new BitmapShader(this.mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    this.met.setAntiAlias(true);
    this.met.setShader(this.tm);
    this.meu.setStyle(Paint.Style.STROKE);
    this.meu.setAntiAlias(true);
    this.meu.setColor(this.mev);
    this.meu.setStrokeWidth(this.hc);
    this.tt = this.mBitmap.getHeight();
    this.ts = this.mBitmap.getWidth();
    this.mes.set(0.0F, 0.0F, getWidth(), getHeight());
    this.mex = Math.min((this.mes.height() - this.hc) / 2.0F, (this.mes.width() - this.hc) / 2.0F);
    this.mer.set(this.mes);
    if (!this.meA) {
      this.mer.inset(this.hc, this.hc);
    }
    this.mew = Math.min(this.mer.height() / 2.0F, this.mer.width() / 2.0F);
    this.tn.set(null);
    float f1;
    float f3;
    if (this.ts * this.mer.height() > this.mer.width() * this.tt)
    {
      f1 = this.mer.height() / this.tt;
      f3 = (this.mer.width() - this.ts * f1) * 0.5F;
    }
    for (;;)
    {
      this.tn.setScale(f1, f1);
      this.tn.postTranslate((int)(f3 + 0.5F) + this.mer.left, (int)(f2 + 0.5F) + this.mer.top);
      this.tm.setLocalMatrix(this.tn);
      invalidate();
      GMTrace.o(12582106693632L, 93744);
      return;
      f1 = this.mer.width() / this.ts;
      f2 = this.mer.height();
      float f4 = this.tt;
      f3 = 0.0F;
      f2 = (f2 - f4 * f1) * 0.5F;
    }
  }
  
  public ImageView.ScaleType getScaleType()
  {
    GMTrace.i(12580630298624L, 93733);
    ImageView.ScaleType localScaleType = meq;
    GMTrace.o(12580630298624L, 93733);
    return localScaleType;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(12581032951808L, 93736);
    if (getDrawable() == null)
    {
      GMTrace.o(12581032951808L, 93736);
      return;
    }
    paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.mew, this.met);
    if (this.hc != 0) {
      paramCanvas.drawCircle(getWidth() / 2, getHeight() / 2, this.mex, this.meu);
    }
    GMTrace.o(12581032951808L, 93736);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(12581167169536L, 93737);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    setup();
    GMTrace.o(12581167169536L, 93737);
  }
  
  public void setAdjustViewBounds(boolean paramBoolean)
  {
    GMTrace.i(12580898734080L, 93735);
    if (paramBoolean) {
      throw new IllegalArgumentException("adjustViewBounds not supported.");
    }
    GMTrace.o(12580898734080L, 93735);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    GMTrace.i(12581838258176L, 93742);
    if (paramColorFilter == this.ly)
    {
      GMTrace.o(12581838258176L, 93742);
      return;
    }
    this.ly = paramColorFilter;
    this.met.setColorFilter(this.ly);
    invalidate();
    GMTrace.o(12581838258176L, 93742);
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    GMTrace.i(12581301387264L, 93738);
    super.setImageBitmap(paramBitmap);
    this.mBitmap = paramBitmap;
    setup();
    GMTrace.o(12581301387264L, 93738);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    GMTrace.i(12581435604992L, 93739);
    super.setImageDrawable(paramDrawable);
    this.mBitmap = p(paramDrawable);
    setup();
    GMTrace.o(12581435604992L, 93739);
  }
  
  public void setImageResource(int paramInt)
  {
    GMTrace.i(12581569822720L, 93740);
    super.setImageResource(paramInt);
    this.mBitmap = p(getDrawable());
    setup();
    GMTrace.o(12581569822720L, 93740);
  }
  
  public void setImageURI(Uri paramUri)
  {
    GMTrace.i(12581704040448L, 93741);
    super.setImageURI(paramUri);
    this.mBitmap = p(getDrawable());
    setup();
    GMTrace.o(12581704040448L, 93741);
  }
  
  public void setScaleType(ImageView.ScaleType paramScaleType)
  {
    GMTrace.i(12580764516352L, 93734);
    if (paramScaleType != meq) {
      throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[] { paramScaleType }));
    }
    GMTrace.o(12580764516352L, 93734);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\widget\CircleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */