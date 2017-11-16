package com.tencent.mm.d;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bg.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.view.b.a.b;
import java.util.Stack;

public final class c
  extends b<com.tencent.mm.cache.a>
{
  public Rect eqa;
  private RectF evA;
  private RectF evB;
  public final Rect evC;
  public com.tencent.mm.t.a evD;
  public boolean evE;
  public boolean evF;
  public com.tencent.mm.b.a evG;
  boolean evH;
  boolean evI;
  boolean evJ;
  boolean evK;
  boolean evL;
  public boolean evM;
  boolean evN;
  float evO;
  float evP;
  float evQ;
  float evR;
  float evS;
  float evT;
  public ValueAnimator evU;
  public Rect evV;
  public int evW;
  public boolean evX;
  private int evu;
  private int evv;
  private int evw;
  public Matrix evx;
  private RectF evy;
  private RectF evz;
  
  public c()
  {
    GMTrace.i(19656454701056L, 146452);
    this.evu = ((int)ab.getResources().getDimension(a.c.tkG));
    this.evv = ((int)ab.getResources().getDimension(a.c.tkT));
    this.evw = ((int)ab.getResources().getDimension(a.c.tkL));
    this.evx = new Matrix();
    this.evC = new Rect();
    this.evE = false;
    this.evF = false;
    this.evH = false;
    this.evI = false;
    this.evJ = false;
    this.evK = false;
    this.evL = false;
    this.evM = true;
    this.evN = false;
    this.evV = new Rect();
    this.evW = 0;
    this.evX = false;
    GMTrace.o(19656454701056L, 146452);
  }
  
  private boolean qb()
  {
    GMTrace.i(19657662660608L, 146461);
    if ((this.evK) || (this.evI) || (this.evJ) || (this.evL))
    {
      GMTrace.o(19657662660608L, 146461);
      return true;
    }
    GMTrace.o(19657662660608L, 146461);
    return false;
  }
  
  public final void a(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(19658065313792L, 146464);
    if (this.evU != null) {
      this.evU.cancel();
    }
    PropertyValuesHolder localPropertyValuesHolder2 = PropertyValuesHolder.ofInt("alpha", new int[] { 0, 255 });
    PropertyValuesHolder localPropertyValuesHolder1;
    if (paramBoolean1) {
      localPropertyValuesHolder1 = PropertyValuesHolder.ofInt("bg_alpha", new int[] { 282, 255 });
    }
    for (;;)
    {
      this.evU = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { localPropertyValuesHolder2, localPropertyValuesHolder1 });
      this.evU.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
      {
        public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
        {
          GMTrace.i(19659541708800L, 146475);
          int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue("bg_alpha")).intValue();
          int j = ((Integer)paramAnonymousValueAnimator.getAnimatedValue("alpha")).intValue();
          paramAnonymousValueAnimator = c.this.evD;
          com.tencent.mm.t.a.eQ(j);
          paramAnonymousValueAnimator = c.this.evD;
          com.tencent.mm.t.a.eR(i);
          c.this.pZ();
          GMTrace.o(19659541708800L, 146475);
        }
      });
      this.evU.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(19670144909312L, 146554);
          c.this.evE = false;
          paramAnonymousAnimator.removeAllListeners();
          GMTrace.o(19670144909312L, 146554);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(19670010691584L, 146553);
          c.this.evE = true;
          GMTrace.o(19670010691584L, 146553);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(19670279127040L, 146555);
          GMTrace.o(19670279127040L, 146555);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(19669876473856L, 146552);
          c.this.evM = true;
          c.this.evE = true;
          GMTrace.o(19669876473856L, 146552);
        }
      });
      this.evU.setStartDelay(paramLong);
      this.evU.setDuration(300L);
      this.evU.start();
      GMTrace.o(19658065313792L, 146464);
      return;
      if (paramBoolean2) {
        localPropertyValuesHolder1 = PropertyValuesHolder.ofInt("bg_alpha", new int[] { 255, 255 });
      } else {
        localPropertyValuesHolder1 = PropertyValuesHolder.ofInt("bg_alpha", new int[] { 0, 255 });
      }
    }
  }
  
  public final void a(com.tencent.mm.bl.b paramb, Matrix paramMatrix, Rect paramRect)
  {
    GMTrace.i(19656723136512L, 146454);
    super.a(paramb, paramMatrix, paramRect);
    this.eqa = new Rect();
    this.evz = new RectF();
    this.evy = new RectF();
    this.evA = new RectF();
    this.evB = new RectF();
    this.evD = new com.tencent.mm.t.a(this.eqa);
    this.evG = new com.tencent.mm.b.a(this);
    GMTrace.o(19656723136512L, 146454);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(19657394225152L, 146459);
    if (!this.evF) {
      paramCanvas.setMatrix(null);
    }
    com.tencent.mm.t.a locala;
    boolean bool1;
    boolean bool2;
    for (;;)
    {
      locala = this.evD;
      bool1 = this.evM;
      bool2 = this.evE;
      if (locala.eqa != null) {
        break;
      }
      w.e("MicroMsg.CropItem", "[draw] mBoxRect is null!");
      GMTrace.o(19657394225152L, 146459);
      return;
      paramCanvas.setMatrix(this.evx);
    }
    if (bool1)
    {
      paramCanvas.save();
      paramCanvas.clipRect(locala.eqa, Region.Op.DIFFERENCE);
      paramCanvas.drawPaint(com.tencent.mm.t.a.fWk);
      paramCanvas.restore();
    }
    if (bool2)
    {
      if (!com.tencent.mm.t.a.fV.equals(locala.eqa))
      {
        com.tencent.mm.t.a.fWh.reset();
        com.tencent.mm.t.a.fWh.moveTo(locala.eqa.left, locala.eqa.top);
        com.tencent.mm.t.a.fWh.lineTo(locala.eqa.right, locala.eqa.top);
        com.tencent.mm.t.a.fWh.lineTo(locala.eqa.right, locala.eqa.bottom);
        com.tencent.mm.t.a.fWh.lineTo(locala.eqa.left, locala.eqa.bottom);
        com.tencent.mm.t.a.fWh.close();
        com.tencent.mm.t.a.fWg.reset();
        int i = 1;
        while (i < 3)
        {
          com.tencent.mm.t.a.fWg.moveTo(locala.eqa.left + locala.eqa.width() / 3 * i, locala.eqa.top);
          com.tencent.mm.t.a.fWg.lineTo(locala.eqa.left + locala.eqa.width() / 3 * i, locala.eqa.bottom);
          com.tencent.mm.t.a.fWg.moveTo(locala.eqa.left, locala.eqa.top + locala.eqa.height() / 3 * i);
          com.tencent.mm.t.a.fWg.lineTo(locala.eqa.right, locala.eqa.top + locala.eqa.height() / 3 * i);
          i += 1;
        }
      }
      paramCanvas.drawRect(locala.eqa.left, locala.eqa.top, locala.eqa.right, locala.eqa.bottom, com.tencent.mm.t.a.fWj);
      paramCanvas.drawPath(com.tencent.mm.t.a.fWg, com.tencent.mm.t.a.fWl);
      paramCanvas.drawPath(com.tencent.mm.t.a.fWh, com.tencent.mm.t.a.fWi);
      float f1 = locala.eqa.left;
      float f2 = com.tencent.mm.t.a.fWe;
      float f3 = locala.eqa.top;
      float f4 = com.tencent.mm.t.a.fWe / 2.0F;
      float f5 = locala.eqa.left;
      paramCanvas.drawLine(f1 - f2, f3 - f4, com.tencent.mm.t.a.fWf + f5, locala.eqa.top - com.tencent.mm.t.a.fWe / 2.0F, com.tencent.mm.t.a.fWm);
      f1 = locala.eqa.right;
      f2 = com.tencent.mm.t.a.fWf;
      f3 = com.tencent.mm.t.a.fWe / 2.0F;
      f4 = locala.eqa.top;
      f5 = com.tencent.mm.t.a.fWe / 2.0F;
      float f6 = locala.eqa.right;
      paramCanvas.drawLine(f3 + (f1 - f2), f4 - f5, com.tencent.mm.t.a.fWe + f6, locala.eqa.top - com.tencent.mm.t.a.fWe / 2.0F, com.tencent.mm.t.a.fWm);
      f1 = locala.eqa.left;
      f2 = com.tencent.mm.t.a.fWe / 2.0F;
      f3 = locala.eqa.top;
      f4 = com.tencent.mm.t.a.fWe / 2.0F;
      f5 = locala.eqa.left;
      f6 = com.tencent.mm.t.a.fWe / 2.0F;
      float f7 = locala.eqa.top;
      paramCanvas.drawLine(f1 - f2, f3 - f4, f5 - f6, com.tencent.mm.t.a.fWf + f7, com.tencent.mm.t.a.fWm);
      f1 = locala.eqa.left;
      f2 = com.tencent.mm.t.a.fWe / 2.0F;
      f3 = locala.eqa.bottom;
      f4 = com.tencent.mm.t.a.fWf;
      f5 = com.tencent.mm.t.a.fWe / 2.0F;
      f6 = locala.eqa.left;
      f7 = com.tencent.mm.t.a.fWe / 2.0F;
      float f8 = locala.eqa.bottom;
      paramCanvas.drawLine(f1 - f2, f5 + (f3 - f4), f6 - f7, com.tencent.mm.t.a.fWe / 2.0F + f8, com.tencent.mm.t.a.fWm);
      f1 = locala.eqa.right;
      f2 = com.tencent.mm.t.a.fWe / 2.0F;
      f3 = locala.eqa.top;
      f4 = locala.eqa.right;
      f5 = com.tencent.mm.t.a.fWe / 2.0F;
      f6 = locala.eqa.top;
      paramCanvas.drawLine(f2 + f1, f3, f5 + f4, com.tencent.mm.t.a.fWf + f6, com.tencent.mm.t.a.fWm);
      f1 = locala.eqa.right;
      f2 = com.tencent.mm.t.a.fWe / 2.0F;
      f3 = locala.eqa.bottom;
      f4 = com.tencent.mm.t.a.fWf;
      f5 = com.tencent.mm.t.a.fWe / 2.0F;
      f6 = locala.eqa.right;
      f7 = com.tencent.mm.t.a.fWe / 2.0F;
      f8 = locala.eqa.bottom;
      paramCanvas.drawLine(f2 + f1, f5 + (f3 - f4), f7 + f6, com.tencent.mm.t.a.fWe / 2.0F + f8, com.tencent.mm.t.a.fWm);
      f1 = locala.eqa.left;
      f2 = com.tencent.mm.t.a.fWe;
      f3 = locala.eqa.bottom;
      f4 = com.tencent.mm.t.a.fWe / 2.0F;
      f5 = locala.eqa.left;
      f6 = com.tencent.mm.t.a.fWf;
      f7 = locala.eqa.bottom;
      paramCanvas.drawLine(f1 - f2, f4 + f3, f6 + f5, com.tencent.mm.t.a.fWe / 2.0F + f7, com.tencent.mm.t.a.fWm);
      f1 = locala.eqa.right;
      f2 = com.tencent.mm.t.a.fWf;
      f3 = locala.eqa.bottom;
      f4 = com.tencent.mm.t.a.fWe / 2.0F;
      f5 = locala.eqa.right;
      f6 = com.tencent.mm.t.a.fWe;
      f7 = locala.eqa.bottom;
      paramCanvas.drawLine(f1 - f2, f4 + f3, f6 + f5, com.tencent.mm.t.a.fWe / 2.0F + f7, com.tencent.mm.t.a.fWm);
      if (!com.tencent.mm.t.a.fV.equals(locala.eqa)) {
        com.tencent.mm.t.a.fV.set(locala.eqa);
      }
    }
    GMTrace.o(19657394225152L, 146459);
  }
  
  public final a pN()
  {
    GMTrace.i(19656588918784L, 146453);
    a locala = a.evf;
    GMTrace.o(19656588918784L, 146453);
    return locala;
  }
  
  public final void pO()
  {
    GMTrace.i(19657260007424L, 146458);
    GMTrace.o(19657260007424L, 146458);
  }
  
  public final void pQ()
  {
    GMTrace.i(19656857354240L, 146455);
    super.pQ();
    if (this.evC.isEmpty()) {
      this.evC.set(this.evu, this.evu * 2, pX().width() - this.evu, pX().height() - this.evv - this.evw - this.evu * 2);
    }
    w.i("MicroMsg.CropArtist", "[onAlive] CROP_MAX_RECT:%s", new Object[] { this.evC });
    com.tencent.mm.t.a locala = ((com.tencent.mm.cache.a)pP()).rU();
    if ((locala != null) && (!locala.fWo.isEmpty()))
    {
      this.evi.bNL().cky().m(locala.fWo);
      float f = a(locala.mMatrix);
      w.i("MicroMsg.CropArtist", "[onAlive] rotation:%s", new Object[] { Float.valueOf(f) });
      pY().postRotate(-f, locala.fWo.centerX(), locala.fWo.centerY());
    }
    GMTrace.o(19656857354240L, 146455);
  }
  
  public final void pR()
  {
    GMTrace.i(19656991571968L, 146456);
    super.pR();
    this.evi.bNL().ckA().setVisibility(8);
    this.evV.setEmpty();
    com.tencent.mm.t.a locala;
    if (((com.tencent.mm.cache.a)pP()).aJ(true) <= 0)
    {
      locala = new com.tencent.mm.t.a();
      locala.mMatrix.set(pY());
      ((com.tencent.mm.cache.a)pP()).a(locala);
      qd();
      this.evi.bNL().cky().xAv = this.eqa;
      this.evi.bNL().cky().a(new a.b()
      {
        public final void onStart()
        {
          GMTrace.i(19655649394688L, 146446);
          c.this.evE = false;
          c.this.evM = false;
          GMTrace.o(19655649394688L, 146446);
        }
        
        public final void qf()
        {
          GMTrace.i(19655515176960L, 146445);
          if (((com.tencent.mm.cache.a)c.this.pP()).fMk.isIdentity())
          {
            localObject = (com.tencent.mm.cache.a)c.this.pP();
            Matrix localMatrix = c.this.pY();
            ((com.tencent.mm.cache.a)localObject).fMk.set(localMatrix);
          }
          Object localObject = new Rect();
          if (c.this.evi.bNP() == null) {
            ((Rect)localObject).set(0, 0, c.this.evi.bNL().cky().xAv.width(), c.this.evi.bNL().cky().xAv.height());
          }
          for (;;)
          {
            c.this.evi.bNL().cky().m((Rect)localObject);
            c.this.a(200L, true, false);
            c.this.qa();
            GMTrace.o(19655515176960L, 146445);
            return;
            ((Rect)localObject).set(0, 0, c.this.evi.bNP().getWidth(), c.this.evi.bNP().getHeight());
          }
        }
      }, 0.0F, false);
    }
    for (;;)
    {
      av(true);
      GMTrace.o(19656991571968L, 146456);
      return;
      locala = ((com.tencent.mm.cache.a)pP()).rU();
      if (locala == null)
      {
        w.e("MicroMsg.CropArtist", "item is null!!!");
        GMTrace.o(19656991571968L, 146456);
        return;
      }
      this.eqa.set(locala.eqa);
      this.evi.bNL().cky().xAv = locala.eqa;
      try
      {
        ((com.tencent.mm.cache.a)pP()).a((com.tencent.mm.t.a)locala.clone());
        this.evi.bNL().cky().a(new a.b()
        {
          public final void onStart()
          {
            GMTrace.i(19661420756992L, 146489);
            c.this.evE = false;
            c.this.evM = false;
            com.tencent.mm.t.a locala = c.this.evD;
            com.tencent.mm.t.a.eR(282);
            GMTrace.o(19661420756992L, 146489);
          }
          
          public final void qf()
          {
            GMTrace.i(19661286539264L, 146488);
            c.this.evM = true;
            c.this.evi.bNL().cky().m(new Rect(0, 0, c.this.evi.bNP().getWidth(), c.this.evi.bNP().getHeight()));
            c.this.a(200L, true, false);
            GMTrace.o(19661286539264L, 146488);
          }
        }, 0.0F, false);
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.CropArtist", localCloneNotSupportedException, "", new Object[0]);
        }
      }
    }
  }
  
  public final boolean pT()
  {
    GMTrace.i(19657125789696L, 146457);
    if (!((com.tencent.mm.cache.a)pP()).fMk.equals(pY()))
    {
      GMTrace.o(19657125789696L, 146457);
      return true;
    }
    GMTrace.o(19657125789696L, 146457);
    return false;
  }
  
  public final boolean q(MotionEvent paramMotionEvent)
  {
    GMTrace.i(19657528442880L, 146460);
    if (!pV())
    {
      GMTrace.o(19657528442880L, 146460);
      return false;
    }
    Object localObject = this.evi.bNL().cky().ckP();
    this.evQ = (((RectF)localObject).top - (((RectF)localObject).bottom - this.eqa.bottom));
    this.evR = (((RectF)localObject).bottom + (this.eqa.top - ((RectF)localObject).top));
    this.evS = (((RectF)localObject).left - (((RectF)localObject).right - this.eqa.right));
    this.evT = (((RectF)localObject).right + (this.eqa.left - ((RectF)localObject).left));
    if (this.evT > this.evC.right) {
      this.evT = this.evC.right;
    }
    if (this.evS < this.evu) {
      this.evS = this.evu;
    }
    if (this.evR > this.evC.bottom) {
      this.evR = this.evC.bottom;
    }
    if (this.evQ < this.evu) {
      this.evQ = this.evu;
    }
    switch (paramMotionEvent.getActionMasked())
    {
    case 3: 
    case 4: 
    default: 
    case 5: 
    case 0: 
      do
      {
        for (;;)
        {
          boolean bool = this.evH;
          GMTrace.o(19657528442880L, 146460);
          return bool;
          this.evK = false;
          this.evI = false;
          this.evJ = false;
          this.evL = false;
          this.evH = false;
        }
        this.evN = false;
        if (this.evG != null) {
          this.evG.cancel();
        }
        if (this.evz.contains(paramMotionEvent.getX(), paramMotionEvent.getY())) {
          this.evK = true;
        }
        if (this.evy.contains(paramMotionEvent.getX(), paramMotionEvent.getY())) {
          this.evJ = true;
        }
        if (this.evA.contains(paramMotionEvent.getX(), paramMotionEvent.getY())) {
          this.evI = true;
        }
        if (this.evB.contains(paramMotionEvent.getX(), paramMotionEvent.getY())) {
          this.evL = true;
        }
        this.evM = false;
      } while (!qb());
      if ((this.evK) && (this.evI))
      {
        this.evK = true;
        this.evI = true;
        this.evJ = false;
        this.evL = false;
      }
      for (;;)
      {
        this.evO = paramMotionEvent.getX();
        this.evP = paramMotionEvent.getY();
        break;
        if ((this.evK) && (this.evL))
        {
          this.evK = true;
          this.evI = false;
          this.evJ = false;
          this.evL = true;
        }
        else if ((this.evJ) && (this.evL))
        {
          this.evK = false;
          this.evI = false;
          this.evJ = true;
          this.evL = true;
        }
        else if ((this.evJ) && (this.evL))
        {
          this.evK = false;
          this.evI = false;
          this.evJ = true;
          this.evL = true;
        }
      }
    case 2: 
      this.evN = true;
      if ((paramMotionEvent.getPointerCount() == 1) && (qb()))
      {
        if ((this.evL) && (this.eqa.right >= this.eqa.left))
        {
          if (this.eqa.right <= this.evC.right)
          {
            if (paramMotionEvent.getX() - this.evO <= this.evC.right - this.eqa.right) {
              break label1902;
            }
            this.eqa.right = this.evC.right;
          }
          label721:
          if (this.eqa.right < this.eqa.left + this.evu * 2) {
            this.eqa.right = (this.eqa.left + this.evu * 2);
          }
          if (this.eqa.right > this.evC.right) {
            this.eqa.right = this.evC.right;
          }
          if (((int)((RectF)localObject).right <= (int)this.evT) && ((int)((RectF)localObject).right <= this.eqa.right))
          {
            if (paramMotionEvent.getX() - this.evO <= this.evT - ((RectF)localObject).right) {
              break label1933;
            }
            pY().postTranslate(this.evT - ((RectF)localObject).right, 0.0F);
          }
          label869:
          if ((this.eqa.width() > ((RectF)localObject).width()) && (this.eqa.right < this.evC.right))
          {
            f1 = this.eqa.width() / ((RectF)localObject).width();
            pY().postScale(f1, f1, this.eqa.left, this.eqa.centerY());
          }
        }
        if ((this.evI) && (this.eqa.right >= this.eqa.left))
        {
          if (this.eqa.left >= this.evC.left)
          {
            if (this.evO - paramMotionEvent.getX() <= this.eqa.left - this.evC.left) {
              break label1954;
            }
            this.eqa.left = this.evC.left;
          }
          label1028:
          if (this.eqa.left > this.eqa.right - this.evu * 2) {
            this.eqa.left = (this.eqa.right - this.evu * 2);
          }
          if (this.eqa.left < this.evC.left) {
            this.eqa.left = this.evC.left;
          }
          if (((int)((RectF)localObject).left >= (int)this.evS) && ((int)((RectF)localObject).left >= this.eqa.left))
          {
            if (this.evO - paramMotionEvent.getX() <= ((RectF)localObject).left - this.evS) {
              break label1985;
            }
            pY().postTranslate(this.evS - ((RectF)localObject).left, 0.0F);
          }
          label1176:
          if ((this.eqa.width() > ((RectF)localObject).width()) && (this.eqa.left > this.evC.left))
          {
            f1 = this.eqa.width() / ((RectF)localObject).width();
            pY().postScale(f1, f1, this.eqa.right, this.eqa.centerY());
          }
        }
        if ((this.evJ) && (this.eqa.bottom >= this.eqa.top))
        {
          if (this.eqa.top >= this.evC.top)
          {
            if (this.evP - paramMotionEvent.getY() <= this.eqa.top - this.evC.top) {
              break label2006;
            }
            this.eqa.top = this.evC.top;
          }
          label1335:
          if (this.eqa.top > this.eqa.bottom - this.evu * 2) {
            this.eqa.top = (this.eqa.bottom - this.evu * 2);
          }
          if (this.eqa.top < this.evC.top) {
            this.eqa.top = this.evC.top;
          }
          if (((int)((RectF)localObject).top >= (int)this.evQ) && ((int)((RectF)localObject).top >= this.eqa.top))
          {
            if (this.evP - paramMotionEvent.getY() <= ((RectF)localObject).top - this.evQ) {
              break label2037;
            }
            pY().postTranslate(0.0F, this.evQ - ((RectF)localObject).top);
          }
          label1483:
          if ((this.eqa.height() > ((RectF)localObject).height()) && (this.eqa.top > this.evC.top))
          {
            f1 = this.eqa.height() / ((RectF)localObject).height();
            pY().postScale(f1, f1, this.eqa.centerX(), this.eqa.bottom);
          }
        }
        if ((this.evK) && (this.eqa.bottom >= this.eqa.top))
        {
          if (this.eqa.bottom <= this.evC.bottom)
          {
            if (paramMotionEvent.getY() - this.evP <= this.evC.bottom - this.eqa.bottom) {
              break label2058;
            }
            this.eqa.bottom = this.evC.bottom;
          }
          label1642:
          if (this.eqa.bottom < this.eqa.top + this.evu * 2) {
            this.eqa.bottom = (this.eqa.top + this.evu * 2);
          }
          if (this.eqa.bottom > this.evC.bottom) {
            this.eqa.bottom = this.evC.bottom;
          }
          if (((int)((RectF)localObject).bottom <= (int)this.evR) && ((int)((RectF)localObject).bottom <= this.eqa.bottom))
          {
            if (paramMotionEvent.getY() - this.evP <= this.evR - ((RectF)localObject).bottom) {
              break label2089;
            }
            pY().postTranslate(0.0F, this.evR - ((RectF)localObject).bottom);
          }
          label1790:
          if ((this.eqa.height() > ((RectF)localObject).height()) && (this.eqa.bottom < this.evC.bottom))
          {
            f1 = this.eqa.height() / ((RectF)localObject).height();
            pY().postScale(f1, f1, this.eqa.centerX(), this.eqa.top);
          }
        }
        qc();
        this.evH = true;
        pZ();
        this.evO = paramMotionEvent.getX();
        this.evP = paramMotionEvent.getY();
      }
      for (;;)
      {
        t(paramMotionEvent);
        break;
        label1902:
        Rect localRect = this.eqa;
        localRect.right = ((int)(localRect.right + (paramMotionEvent.getX() - this.evO)));
        break label721;
        label1933:
        pY().postTranslate(paramMotionEvent.getX() - this.evO, 0.0F);
        break label869;
        label1954:
        localRect = this.eqa;
        localRect.left = ((int)(localRect.left - (this.evO - paramMotionEvent.getX())));
        break label1028;
        label1985:
        pY().postTranslate(paramMotionEvent.getX() - this.evO, 0.0F);
        break label1176;
        label2006:
        localRect = this.eqa;
        localRect.top = ((int)(localRect.top - (this.evP - paramMotionEvent.getY())));
        break label1335;
        label2037:
        pY().postTranslate(0.0F, paramMotionEvent.getY() - this.evP);
        break label1483;
        label2058:
        localRect = this.eqa;
        localRect.bottom = ((int)(localRect.bottom + (paramMotionEvent.getY() - this.evP)));
        break label1642;
        label2089:
        pY().postTranslate(0.0F, paramMotionEvent.getY() - this.evP);
        break label1790;
        this.evH = false;
      }
    }
    float f1 = 1.0F * this.evC.width() / this.eqa.width();
    float f2 = 1.0F * this.evC.height() / this.eqa.height();
    if (f1 < f2)
    {
      label2164:
      f2 = this.evC.centerX();
      float f3 = this.evC.centerY();
      float f4 = this.eqa.centerX();
      float f5 = this.eqa.centerY();
      if (this.evN)
      {
        this.evG.eqd = 1000L;
        paramMotionEvent = this.evG;
        localObject = this.eqa;
        paramMotionEvent.epW = (f2 - f4);
        paramMotionEvent.epX = (f3 - f5);
        paramMotionEvent.eqa = ((Rect)localObject);
        paramMotionEvent.eqb.set(paramMotionEvent.eqa);
        paramMotionEvent.epV = f1;
        this.evG.play();
      }
      if (!qb()) {
        break label2321;
      }
    }
    label2321:
    for (this.evH = true;; this.evH = false)
    {
      this.evK = false;
      this.evI = false;
      this.evJ = false;
      this.evL = false;
      qa();
      break;
      f1 = f2;
      break label2164;
    }
  }
  
  public final void qc()
  {
    GMTrace.i(19657796878336L, 146462);
    this.evz.set(this.eqa.left - this.evu, this.eqa.bottom - this.evu, this.eqa.right + this.evu, this.eqa.bottom + this.evu);
    this.evy.set(this.eqa.left - this.evu, this.eqa.top - this.evu, this.eqa.right + this.evu, this.eqa.top + this.evu);
    this.evA.set(this.eqa.left - this.evu, this.eqa.top - this.evu, this.eqa.left + this.evu, this.eqa.bottom + this.evu);
    this.evB.set(this.eqa.right - this.evu, this.eqa.top - this.evu, this.eqa.right + this.evu, this.eqa.bottom + this.evu);
    GMTrace.o(19657796878336L, 146462);
  }
  
  public final void qd()
  {
    GMTrace.i(19657931096064L, 146463);
    float f1 = this.evi.bNP().getWidth() * 1.0F / this.evi.bNP().getHeight();
    int i;
    if (f1 < this.evC.width() * 1.0F / this.evC.height())
    {
      float f2 = this.evC.height();
      i = (int)((this.evC.width() - f1 * f2) / 2.0F);
      this.eqa.set(this.evC.left + i, this.evC.top, this.evC.right - i, this.evC.bottom);
    }
    for (;;)
    {
      qc();
      GMTrace.o(19657931096064L, 146463);
      return;
      f1 = this.evC.width() / f1;
      i = (int)((this.evC.height() - f1) / 2.0F);
      this.eqa.set(this.evC.left, this.evC.top + i, this.evC.right, this.evC.bottom - i);
    }
  }
  
  public final void qe()
  {
    GMTrace.i(19658199531520L, 146465);
    this.evi.bNL().cky().xAv = this.evi.bNL().cky().xAw;
    final Object localObject1 = new RectF(this.eqa);
    Object localObject2 = new Matrix();
    pY().invert((Matrix)localObject2);
    ((Matrix)localObject2).mapRect((RectF)localObject1);
    localObject2 = new Rect();
    ((RectF)localObject1).round((Rect)localObject2);
    this.evi.bNL().cky().m((Rect)localObject2);
    localObject1 = new com.tencent.mm.t.a();
    ((com.tencent.mm.t.a)localObject1).eqa = new Rect(this.eqa);
    ((com.tencent.mm.t.a)localObject1).fWo.set((Rect)localObject2);
    this.evi.bNL().cky().a(new a.b()
    {
      public final void onStart()
      {
        GMTrace.i(19661018103808L, 146486);
        GMTrace.o(19661018103808L, 146486);
      }
      
      public final void qf()
      {
        GMTrace.i(19660883886080L, 146485);
        Object localObject = localObject1;
        Matrix localMatrix = c.this.pY();
        ((com.tencent.mm.t.a)localObject).mMatrix.set(localMatrix);
        localObject = (com.tencent.mm.cache.a)c.this.pP();
        if (((com.tencent.mm.cache.a)localObject).fMi != null) {
          ((com.tencent.mm.cache.a)localObject).fMi.clear();
        }
        ((com.tencent.mm.cache.a)c.this.pP()).a(localObject1);
        GMTrace.o(19660883886080L, 146485);
      }
    }, 0.0F, true);
    this.evi.bNL().ckA().setVisibility(0);
    GMTrace.o(19658199531520L, 146465);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */