package com.tencent.mm.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.cache.d;
import com.tencent.mm.sdk.platformtools.w;

public abstract class b<T extends d>
{
  public static final b evo;
  public com.tencent.mm.bl.b evi;
  private Matrix evj;
  Rect evk;
  private boolean evl;
  public boolean evm;
  private Bitmap evn;
  private Canvas evp;
  public Runnable evq;
  PointF evr;
  private PointF evs;
  private Context mContext;
  float[] values;
  
  static
  {
    GMTrace.i(19666252595200L, 146525);
    evo = new b()
    {
      public final void onDraw(Canvas paramAnonymousCanvas)
      {
        GMTrace.i(19666789466112L, 146529);
        GMTrace.o(19666789466112L, 146529);
      }
      
      public final a pN()
      {
        GMTrace.i(19666521030656L, 146527);
        a locala = a.evb;
        GMTrace.o(19666521030656L, 146527);
        return locala;
      }
      
      public final void pO()
      {
        GMTrace.i(19666655248384L, 146528);
        GMTrace.o(19666655248384L, 146528);
      }
    };
    GMTrace.o(19666252595200L, 146525);
  }
  
  public b()
  {
    GMTrace.i(19661554974720L, 146490);
    this.evp = new Canvas();
    this.evr = new PointF();
    this.evs = new PointF();
    this.values = new float[9];
    GMTrace.o(19661554974720L, 146490);
  }
  
  private float a(Matrix paramMatrix, int paramInt)
  {
    GMTrace.i(19665313071104L, 146518);
    paramMatrix.getValues(this.values);
    float f = this.values[paramInt];
    GMTrace.o(19665313071104L, 146518);
    return f;
  }
  
  protected static int r(MotionEvent paramMotionEvent)
  {
    GMTrace.i(19665715724288L, 146521);
    if (paramMotionEvent.getPointerCount() > 1)
    {
      int i = (int)(paramMotionEvent.getX(0) - paramMotionEvent.getX(1));
      int j = (int)(paramMotionEvent.getY(0) - paramMotionEvent.getY(1));
      i = (int)Math.sqrt(j * j + i * i);
      GMTrace.o(19665715724288L, 146521);
      return i;
    }
    GMTrace.o(19665715724288L, 146521);
    return 0;
  }
  
  protected static int[] s(MotionEvent paramMotionEvent)
  {
    GMTrace.i(19665849942016L, 146522);
    int[] arrayOfInt = new int[2];
    if (paramMotionEvent.getPointerCount() > 1)
    {
      arrayOfInt[0] = ((int)(paramMotionEvent.getX(0) - paramMotionEvent.getX(1)));
      arrayOfInt[1] = ((int)(paramMotionEvent.getY(0) - paramMotionEvent.getY(1)));
      GMTrace.o(19665849942016L, 146522);
      return arrayOfInt;
    }
    GMTrace.o(19665849942016L, 146522);
    return arrayOfInt;
  }
  
  public final float a(Matrix paramMatrix)
  {
    GMTrace.i(19665178853376L, 146517);
    float f = (float)Math.round(Math.atan2(a(paramMatrix, 1), a(paramMatrix, 0)) * 57.29577951308232D);
    GMTrace.o(19665178853376L, 146517);
    return f;
  }
  
  public void a(com.tencent.mm.bl.b paramb, Matrix paramMatrix, Rect paramRect)
  {
    GMTrace.i(19662360281088L, 146496);
    w.i("MicroMsg." + pN(), "[onCreate]");
    this.evm = true;
    this.mContext = paramb.getContext();
    this.evi = paramb;
    this.evj = paramMatrix;
    this.evk = paramRect;
    GMTrace.o(19662360281088L, 146496);
  }
  
  public void au(boolean paramBoolean)
  {
    GMTrace.i(19663299805184L, 146503);
    this.evp.setBitmap(pU());
    pP().a(this.evp, paramBoolean);
    GMTrace.o(19663299805184L, 146503);
  }
  
  public final void av(boolean paramBoolean)
  {
    GMTrace.i(19663702458368L, 146506);
    this.evi.bNL().cky().xAB = paramBoolean;
    GMTrace.o(19663702458368L, 146506);
  }
  
  public final void b(Canvas paramCanvas)
  {
    GMTrace.i(19662091845632L, 146494);
    if ((this.evn != null) && (!this.evn.isRecycled())) {
      paramCanvas.drawBitmap(this.evn, 0.0F, 0.0F, null);
    }
    GMTrace.o(19662091845632L, 146494);
  }
  
  protected final void d(Bitmap paramBitmap)
  {
    GMTrace.i(19663568240640L, 146505);
    if ((pU() != null) && (!pU().isRecycled())) {
      pU().recycle();
    }
    this.evn = paramBitmap;
    GMTrace.o(19663568240640L, 146505);
  }
  
  public final float getRotation()
  {
    GMTrace.i(19665044635648L, 146516);
    float f = (float)Math.round(Math.atan2(a(this.evj, 1), a(this.evj, 0)) * 57.29577951308232D);
    GMTrace.o(19665044635648L, 146516);
    return f;
  }
  
  public final float getScale()
  {
    GMTrace.i(19664910417920L, 146515);
    float f1 = a(this.evj, 3);
    float f2 = a(this.evj, 0);
    f1 = (float)Math.sqrt(f1 * f1 + f2 * f2);
    GMTrace.o(19664910417920L, 146515);
    return f1;
  }
  
  public final boolean isAlive()
  {
    GMTrace.i(19663836676096L, 146507);
    if ((this.evm) && (this.evl))
    {
      GMTrace.o(19663836676096L, 146507);
      return true;
    }
    GMTrace.o(19663836676096L, 146507);
    return false;
  }
  
  protected final float[] k(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(19665447288832L, 146519);
    Matrix localMatrix = new Matrix(this.evj);
    this.evj.invert(localMatrix);
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    localMatrix.mapPoints(arrayOfFloat);
    GMTrace.o(19665447288832L, 146519);
    return arrayOfFloat;
  }
  
  protected final float[] l(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(19665581506560L, 146520);
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    this.evj.mapPoints(arrayOfFloat);
    GMTrace.o(19665581506560L, 146520);
    return arrayOfFloat;
  }
  
  public void onDestroy()
  {
    GMTrace.i(19662897152000L, 146500);
    this.evm = false;
    this.evl = false;
    w.i("MicroMsg." + pN(), "[onDestroy]");
    pS();
    GMTrace.o(19662897152000L, 146500);
  }
  
  public abstract void onDraw(Canvas paramCanvas);
  
  public final void onFinish()
  {
    GMTrace.i(19662762934272L, 146499);
    w.i("MicroMsg.", "[onFinish] type:%s", new Object[] { pN() });
    this.evl = false;
    this.evm = false;
    d locald = pP();
    if (locald != null) {
      locald.aI(true);
    }
    for (;;)
    {
      pS();
      GMTrace.o(19662762934272L, 146499);
      return;
      w.e("MicroMsg.", "[onFinish] type:%s cache is null", new Object[] { pN() });
    }
  }
  
  public abstract a pN();
  
  public abstract void pO();
  
  public final T pP()
  {
    GMTrace.i(19662226063360L, 146495);
    d locald = this.evi.a(pN());
    GMTrace.o(19662226063360L, 146495);
    return locald;
  }
  
  public void pQ()
  {
    GMTrace.i(19662494498816L, 146497);
    w.i("MicroMsg." + pN(), "[onAlive] isAlive:%s", new Object[] { Boolean.valueOf(this.evl) });
    if (this.evl)
    {
      GMTrace.o(19662494498816L, 146497);
      return;
    }
    this.evl = true;
    d locald = pP();
    if (locald != null)
    {
      locald.rS();
      locald.aI(false);
    }
    for (;;)
    {
      this.evn = pU();
      GMTrace.o(19662494498816L, 146497);
      return;
      w.e("MicroMsg.", "[onAlive] type:%s cache is null", new Object[] { pN() });
    }
  }
  
  public void pR()
  {
    GMTrace.i(19662628716544L, 146498);
    w.i("MicroMsg." + pN(), "[onSelected] ");
    GMTrace.o(19662628716544L, 146498);
  }
  
  public final void pS()
  {
    GMTrace.i(19663031369728L, 146501);
    if ((this.evn != null) && (!this.evn.isRecycled())) {
      this.evn.recycle();
    }
    GMTrace.o(19663031369728L, 146501);
  }
  
  public boolean pT()
  {
    GMTrace.i(19663165587456L, 146502);
    if (pP().aJ(true) > 0)
    {
      GMTrace.o(19663165587456L, 146502);
      return true;
    }
    GMTrace.o(19663165587456L, 146502);
    return false;
  }
  
  protected final Bitmap pU()
  {
    GMTrace.i(19663434022912L, 146504);
    Object localObject;
    int i;
    if ((this.evn == null) || (this.evn.isRecycled()))
    {
      localObject = this.evi.bNL().cky().ckN();
      if ((!((Rect)localObject).isEmpty()) && (this.evi.bNL().cky().ckM())) {
        break label133;
      }
      i = this.evi.bNL().cky().xAv.width();
    }
    for (int j = this.evi.bNL().cky().xAv.height();; j = ((Rect)localObject).height())
    {
      this.evn = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_4444);
      localObject = this.evn;
      GMTrace.o(19663434022912L, 146504);
      return (Bitmap)localObject;
      label133:
      i = ((Rect)localObject).width();
    }
  }
  
  protected final boolean pV()
  {
    GMTrace.i(19663970893824L, 146508);
    if (this.evi.bNN().pN() == pN())
    {
      GMTrace.o(19663970893824L, 146508);
      return true;
    }
    GMTrace.o(19663970893824L, 146508);
    return false;
  }
  
  public final void pW()
  {
    GMTrace.i(19664105111552L, 146509);
    if (pP().pop() != null) {
      pP().pW();
    }
    this.evi.bNL().removeCallbacks(this.evq);
    com.tencent.mm.view.a locala = this.evi.bNL();
    Runnable local2 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19655917830144L, 146448);
        b.this.pO();
        b.this.pZ();
        b.this.evq = null;
        GMTrace.o(19655917830144L, 146448);
      }
    };
    this.evq = local2;
    locala.postDelayed(local2, 66L);
    GMTrace.o(19664105111552L, 146509);
  }
  
  protected final Rect pX()
  {
    GMTrace.i(19664373547008L, 146511);
    Rect localRect = this.evi.bNL().cky().xAv;
    GMTrace.o(19664373547008L, 146511);
    return localRect;
  }
  
  public final Matrix pY()
  {
    GMTrace.i(19664507764736L, 146512);
    Matrix localMatrix = this.evi.bNL().cky().pY();
    GMTrace.o(19664507764736L, 146512);
    return localMatrix;
  }
  
  public final void pZ()
  {
    GMTrace.i(19664641982464L, 146513);
    this.evi.bNL().cky().postInvalidate();
    GMTrace.o(19664641982464L, 146513);
  }
  
  public boolean q(MotionEvent paramMotionEvent)
  {
    GMTrace.i(19664239329280L, 146510);
    if (u(paramMotionEvent)) {
      t(paramMotionEvent);
    }
    GMTrace.o(19664239329280L, 146510);
    return false;
  }
  
  public final void qa()
  {
    GMTrace.i(19664776200192L, 146514);
    this.evi.bNL().ckx().postInvalidate();
    GMTrace.o(19664776200192L, 146514);
  }
  
  protected final void t(MotionEvent paramMotionEvent)
  {
    GMTrace.i(19665984159744L, 146523);
    this.evr.x = paramMotionEvent.getX(0);
    this.evr.y = paramMotionEvent.getY(0);
    if (paramMotionEvent.getPointerCount() > 1)
    {
      this.evs.x = paramMotionEvent.getX(1);
      this.evs.y = paramMotionEvent.getY(1);
    }
    GMTrace.o(19665984159744L, 146523);
  }
  
  protected final boolean u(MotionEvent paramMotionEvent)
  {
    GMTrace.i(19666118377472L, 146524);
    if (paramMotionEvent.getPointerCount() > 1)
    {
      if ((Math.abs(this.evr.x - paramMotionEvent.getX(0)) > 6.0F) || (Math.abs(this.evr.y - paramMotionEvent.getY(0)) > 6.0F) || (Math.abs(this.evs.x - paramMotionEvent.getX(1)) > 6.0F) || (Math.abs(this.evs.y - paramMotionEvent.getY(1)) > 6.0F))
      {
        GMTrace.o(19666118377472L, 146524);
        return true;
      }
      GMTrace.o(19666118377472L, 146524);
      return false;
    }
    if (paramMotionEvent.getPointerCount() == 1)
    {
      if ((Math.abs(this.evr.x - paramMotionEvent.getX(0)) > 6.0F) || (Math.abs(this.evr.y - paramMotionEvent.getY(0)) > 6.0F))
      {
        GMTrace.o(19666118377472L, 146524);
        return true;
      }
      GMTrace.o(19666118377472L, 146524);
      return false;
    }
    GMTrace.o(19666118377472L, 146524);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */