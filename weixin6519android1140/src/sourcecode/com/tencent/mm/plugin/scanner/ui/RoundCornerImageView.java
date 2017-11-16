package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.n;

public class RoundCornerImageView
  extends ImageView
{
  private int oxb;
  private int oxc;
  
  public RoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6085297569792L, 45339);
    this.oxb = 8;
    this.oxc = 8;
    init(paramContext, paramAttributeSet);
    GMTrace.o(6085297569792L, 45339);
  }
  
  public RoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6085163352064L, 45338);
    this.oxb = 8;
    this.oxc = 8;
    init(paramContext, paramAttributeSet);
    GMTrace.o(6085163352064L, 45338);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    GMTrace.i(6085431787520L, 45340);
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.enY);
      this.oxb = paramContext.getDimensionPixelSize(R.n.eoa, this.oxb);
      this.oxc = paramContext.getDimensionPixelSize(R.n.enZ, this.oxc);
      paramContext.recycle();
      GMTrace.o(6085431787520L, 45340);
      return;
    }
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.oxb = ((int)(this.oxb * f));
    this.oxc = ((int)(f * this.oxc));
    GMTrace.o(6085431787520L, 45340);
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(6085566005248L, 45341);
    Object localObject3 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
    Object localObject2 = new Canvas((Bitmap)localObject3);
    Object localObject1 = localObject3;
    if (((Bitmap)localObject3).isRecycled())
    {
      localObject1 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
      localObject2 = new Canvas((Bitmap)localObject1);
    }
    super.draw((Canvas)localObject2);
    localObject3 = new Paint();
    ((Paint)localObject3).setAntiAlias(true);
    ((Paint)localObject3).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    Path localPath = new Path();
    localPath.addRoundRect(new RectF(0.0F, 0.0F, getWidth(), getHeight()), this.oxb, this.oxc, Path.Direction.CW);
    localPath.setFillType(Path.FillType.INVERSE_WINDING);
    ((Canvas)localObject2).drawPath(localPath, (Paint)localObject3);
    localObject2 = new Paint();
    ((Paint)localObject2).setXfermode(null);
    paramCanvas.drawBitmap((Bitmap)localObject1, 0.0F, 0.0F, (Paint)localObject2);
    ((Bitmap)localObject1).recycle();
    GMTrace.o(6085566005248L, 45341);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\RoundCornerImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */