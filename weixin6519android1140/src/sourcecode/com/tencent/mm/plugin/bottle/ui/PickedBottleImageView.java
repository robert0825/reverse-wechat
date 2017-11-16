package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.af.m;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public class PickedBottleImageView
  extends ImageView
{
  float density;
  private ae handler;
  String iconUrl;
  private int joR;
  String jpc;
  Bitmap jrB;
  private Paint jrC;
  private Rect jrD;
  private RectF jrE;
  private View jrF;
  private Runnable jrG;
  String jrh;
  
  public PickedBottleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7622224773120L, 56790);
    this.jrC = new Paint();
    this.jrD = new Rect();
    this.jrE = new RectF();
    this.handler = new ae();
    this.jrG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7601823678464L, 56638);
        FrameLayout localFrameLayout = (FrameLayout)PickedBottleImageView.this.getParent();
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)PickedBottleImageView.a(PickedBottleImageView.this).getLayoutParams();
        if (localFrameLayout != null) {
          localMarginLayoutParams.setMargins(localFrameLayout.getWidth() / 2, localFrameLayout.getHeight() * 530 / 800, localMarginLayoutParams.rightMargin, localMarginLayoutParams.bottomMargin);
        }
        PickedBottleImageView.a(PickedBottleImageView.this).setLayoutParams(localMarginLayoutParams);
        PickedBottleImageView.a(PickedBottleImageView.this).setVisibility(0);
        PickedBottleImageView.this.clearAnimation();
        GMTrace.o(7601823678464L, 56638);
      }
    };
    GMTrace.o(7622224773120L, 56790);
  }
  
  public PickedBottleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7622090555392L, 56789);
    this.jrC = new Paint();
    this.jrD = new Rect();
    this.jrE = new RectF();
    this.handler = new ae();
    this.jrG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7601823678464L, 56638);
        FrameLayout localFrameLayout = (FrameLayout)PickedBottleImageView.this.getParent();
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)PickedBottleImageView.a(PickedBottleImageView.this).getLayoutParams();
        if (localFrameLayout != null) {
          localMarginLayoutParams.setMargins(localFrameLayout.getWidth() / 2, localFrameLayout.getHeight() * 530 / 800, localMarginLayoutParams.rightMargin, localMarginLayoutParams.bottomMargin);
        }
        PickedBottleImageView.a(PickedBottleImageView.this).setLayoutParams(localMarginLayoutParams);
        PickedBottleImageView.a(PickedBottleImageView.this).setVisibility(0);
        PickedBottleImageView.this.clearAnimation();
        GMTrace.o(7601823678464L, 56638);
      }
    };
    GMTrace.o(7622090555392L, 56789);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(7622761644032L, 56794);
    if ((19990 == this.joR) && (this.jrB != null) && (!this.jrB.isRecycled())) {
      paramCanvas.drawBitmap(this.jrB, this.jrD, this.jrE, this.jrC);
    }
    super.onDraw(paramCanvas);
    GMTrace.o(7622761644032L, 56794);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(7622493208576L, 56792);
    if (paramInt == 8) {
      super.clearAnimation();
    }
    if ((paramInt == 8) && (this.jrF != null))
    {
      this.handler.removeCallbacks(this.jrG);
      this.jrF.setVisibility(paramInt);
    }
    super.setVisibility(paramInt);
    GMTrace.o(7622493208576L, 56792);
  }
  
  public final void show(int paramInt)
  {
    GMTrace.i(7622358990848L, 56791);
    this.joR = paramInt;
    if (paramInt == 1)
    {
      setImageResource(R.g.aUw);
      setContentDescription(getContext().getString(R.l.dbl));
      this.jrB = null;
    }
    for (;;)
    {
      FrameLayout localFrameLayout = (FrameLayout)getParent();
      if (this.jrF == null) {
        this.jrF = ((View)getParent()).findViewById(R.h.bhW);
      }
      this.jrF.setVisibility(8);
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)getLayoutParams();
      localMarginLayoutParams.setMargins(localMarginLayoutParams.leftMargin, localMarginLayoutParams.topMargin, localMarginLayoutParams.rightMargin, localFrameLayout.getHeight() * 270 / 800);
      setLayoutParams(localMarginLayoutParams);
      startAnimation(AnimationUtils.loadAnimation(getContext(), R.a.aLl));
      this.handler.postDelayed(this.jrG, 3000L);
      setVisibility(0);
      GMTrace.o(7622358990848L, 56791);
      return;
      if (paramInt == 3)
      {
        setImageResource(R.g.aUx);
        setContentDescription(getContext().getString(R.l.dbl));
        this.jrB = null;
      }
      else if (paramInt == 19990)
      {
        setImageResource(R.g.aUi);
        this.jrB = m.d(this.jpc, this.iconUrl, R.g.aYx);
        setContentDescription(getContext().getString(R.l.dbl));
        this.jrC.setAntiAlias(true);
        update();
      }
      else
      {
        setImageResource(R.g.aUv);
        this.jrB = null;
        setContentDescription(getContext().getString(R.l.dbm));
      }
    }
  }
  
  final void update()
  {
    boolean bool = true;
    GMTrace.i(7622627426304L, 56793);
    if ((this.jrB == null) || (this.jrB.isRecycled())) {
      this.jrB = BitmapFactory.decodeResource(getResources(), R.g.aUD);
    }
    Object localObject1 = this.jrB;
    Object localObject2 = new Matrix();
    ((Matrix)localObject2).setRotate(-60.0F, ((Bitmap)localObject1).getWidth() / 2.0F, ((Bitmap)localObject1).getHeight() / 2.0F);
    Bitmap localBitmap = Bitmap.createBitmap(((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localCanvas.drawBitmap((Bitmap)localObject1, (Matrix)localObject2, localPaint);
    localObject2 = new StringBuilder("resultBmp is null: ");
    if (localBitmap == null) {}
    for (;;)
    {
      w.d("MicroMsg.PickedBottleImageView", bool + "  degree:-60.0");
      if (localObject1 != localBitmap) {
        ((Bitmap)localObject1).recycle();
      }
      this.jrB = localBitmap;
      localObject1 = this.jrD;
      this.jrD.top = 0;
      ((Rect)localObject1).left = 0;
      this.jrD.right = this.jrB.getWidth();
      this.jrD.bottom = this.jrB.getHeight();
      this.jrE.left = (40.0F * this.density);
      this.jrE.top = (30.0F * this.density);
      this.jrE.right = (72.0F * this.density);
      this.jrE.bottom = (62.0F * this.density);
      GMTrace.o(7622627426304L, 56793);
      return;
      bool = false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\ui\PickedBottleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */