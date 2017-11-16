package com.tencent.mm.plugin.gallery.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.OverScroller;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.g;
import java.lang.ref.WeakReference;

public class MultiGestureImageView
  extends LinearLayout
{
  private int UQ;
  private int UR;
  private int count;
  private float eqf;
  private int jsh;
  private int jsi;
  private float lFA;
  private float lFB;
  private long lFC;
  private boolean lFD;
  private OverScroller lFE;
  private GestureDetector lFF;
  private RectF lFG;
  private a lFH;
  private float lFI;
  private boolean lFJ;
  private boolean lFK;
  private boolean lFL;
  private boolean lFM;
  private j lFN;
  private j lFO;
  private j lFP;
  private d lFQ;
  private b lFR;
  private MultiTouchImageView lFx;
  private long lFy;
  private long lFz;
  
  public MultiGestureImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11969805418496L, 89182);
    this.count = 0;
    this.lFy = 0L;
    this.lFz = 0L;
    this.lFA = 0.0F;
    this.lFB = 0.0F;
    this.lFC = 0L;
    this.lFD = false;
    this.lFG = new RectF();
    this.lFJ = false;
    this.lFK = false;
    this.lFL = false;
    this.lFM = false;
    init(paramContext, paramAttributeSet);
    GMTrace.o(11969805418496L, 89182);
  }
  
  public MultiGestureImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11969939636224L, 89183);
    this.count = 0;
    this.lFy = 0L;
    this.lFz = 0L;
    this.lFA = 0.0F;
    this.lFB = 0.0F;
    this.lFC = 0L;
    this.lFD = false;
    this.lFG = new RectF();
    this.lFJ = false;
    this.lFK = false;
    this.lFL = false;
    this.lFM = false;
    init(paramContext, paramAttributeSet);
    GMTrace.o(11969939636224L, 89183);
  }
  
  private void aDG()
  {
    GMTrace.i(11970610724864L, 89188);
    this.lFN.removeMessages(1);
    GMTrace.o(11970610724864L, 89188);
  }
  
  private void aDH()
  {
    GMTrace.i(11970744942592L, 89189);
    aDG();
    this.lFN.d(1, 15L, 15L);
    GMTrace.o(11970744942592L, 89189);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    GMTrace.i(11970073853952L, 89184);
    this.lFx = new MultiTouchImageView(paramContext, paramAttributeSet);
    this.lFF = new GestureDetector(paramContext, new c((byte)0));
    this.lFE = new OverScroller(paramContext, new DecelerateInterpolator(2.0F));
    paramContext = new LinearLayout.LayoutParams(-1, -1);
    this.lFx.setLayoutParams(paramContext);
    addView(this.lFx);
    this.lFN = new j(new WeakReference(this));
    this.lFO = new j(new WeakReference(this));
    this.lFP = new j(new WeakReference(this));
    GMTrace.o(11970073853952L, 89184);
  }
  
  public void computeScroll()
  {
    int m = 0;
    GMTrace.i(11970476507136L, 89187);
    if (this.lFx == null)
    {
      GMTrace.o(11970476507136L, 89187);
      return;
    }
    float f4;
    float f5;
    int j;
    int k;
    if (this.lFE.computeScrollOffset())
    {
      i = this.lFE.getCurrX() - this.UQ;
      int n = this.lFE.getCurrY() - this.UR;
      this.UQ = this.lFE.getCurrX();
      this.UR = this.lFE.getCurrY();
      float f3 = this.lFx.getScale();
      f4 = this.lFx.imageWidth;
      float f1 = f3 * this.lFx.imageHeight;
      float[] arrayOfFloat = new float[9];
      this.lFx.getImageMatrix().getValues(arrayOfFloat);
      float f2 = arrayOfFloat[2];
      f3 = f4 * f3 + f2;
      f4 = arrayOfFloat[5];
      f5 = f4 + f1;
      j = i;
      if (i < 0)
      {
        j = i;
        if (i < this.lFG.right - Math.round(f3)) {
          j = (int)(this.lFG.right - Math.round(f3));
        }
      }
      i = j;
      if (j > 0)
      {
        i = j;
        if (j > this.lFG.left - Math.round(f2)) {
          i = (int)(this.lFG.left - Math.round(f2));
        }
      }
      k = n;
      if (n < 0)
      {
        k = n;
        if (n < this.lFG.bottom - Math.round(f5)) {
          k = (int)(this.lFG.bottom - Math.round(f5));
        }
      }
      j = k;
      if (k > 0)
      {
        j = k;
        if (k > this.lFG.top - Math.round(f4)) {
          j = (int)(this.lFG.top - Math.round(f4));
        }
      }
      if ((Math.round(f2) < this.lFG.left) && (Math.round(f3) > this.lFG.right)) {
        break label436;
      }
      k = 0;
      if (f1 >= this.jsi) {
        break label484;
      }
    }
    label436:
    label484:
    for (int i = m;; i = j)
    {
      this.lFx.H(k, i);
      postInvalidate();
      GMTrace.o(11970476507136L, 89187);
      return;
      if (Math.round(f4) < this.lFG.top)
      {
        k = i;
        if (Math.round(f5) > this.lFG.bottom) {
          break;
        }
      }
      j = 0;
      k = i;
      break;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(11970208071680L, 89185);
    super.onMeasure(paramInt1, paramInt2);
    this.jsh = View.MeasureSpec.getSize(paramInt1);
    this.jsi = View.MeasureSpec.getSize(paramInt2);
    this.lFG.set(0.0F, 0.0F, this.jsh, this.jsi);
    w.v("MicroMsg.MuitlGestureImageView", "MMGestureGallery width:" + this.jsh + " height:" + this.jsi);
    GMTrace.o(11970208071680L, 89185);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(11970342289408L, 89186);
    this.lFF.onTouchEvent(paramMotionEvent);
    float f1;
    float f2;
    float f3;
    if (paramMotionEvent.getAction() == 0)
    {
      this.lFE.forceFinished(true);
      this.lFP.removeMessages(2);
      this.lFP.d(2, 500L, 0L);
      this.lFx.caG();
      this.count += 1;
      if (this.count == 1)
      {
        this.lFy = System.currentTimeMillis();
        this.lFA = g.i(paramMotionEvent, 0);
        this.lFB = g.j(paramMotionEvent, 0);
      }
    }
    else
    {
      if ((paramMotionEvent.getAction() == 6) || (paramMotionEvent.getAction() == 262))
      {
        this.lFP.removeMessages(2);
        this.eqf = 0.0F;
        this.lFI = this.lFx.getScale();
        this.lFD = true;
        float f4;
        if (this.lFI < this.lFx.oyq)
        {
          f1 = g.i(paramMotionEvent, 0);
          f2 = g.i(paramMotionEvent, 1);
          f3 = g.j(paramMotionEvent, 0);
          f4 = g.j(paramMotionEvent, 1);
          this.lFx.F(f1 - f2 + g.i(paramMotionEvent, 1), f3 - f4 + g.j(paramMotionEvent, 1));
        }
        if (this.lFI > this.lFx.caH())
        {
          f1 = g.i(paramMotionEvent, 0);
          f2 = g.i(paramMotionEvent, 1);
          f3 = g.j(paramMotionEvent, 0);
          f4 = g.j(paramMotionEvent, 1);
          this.lFx.G(f1 - f2 + g.i(paramMotionEvent, 1), f3 - f4 + g.j(paramMotionEvent, 1));
        }
      }
      if (paramMotionEvent.getAction() == 1)
      {
        this.lFP.removeMessages(2);
        if (((!this.lFL) && (!this.lFM)) || ((!this.lFJ) && (!this.lFK))) {
          break label783;
        }
        this.lFH = new f(this.lFx);
        aDH();
        this.lFL = false;
        this.lFM = false;
        this.lFJ = false;
        this.lFK = false;
        label371:
        this.eqf = 0.0F;
        this.lFI = this.lFx.getScale();
        if (this.count == 1)
        {
          this.lFz = System.currentTimeMillis();
          if (this.lFz - this.lFy >= 350L) {
            break label914;
          }
          if ((Math.abs(this.lFA - g.i(paramMotionEvent, 0)) < 10.0F) && (Math.abs(this.lFB - g.j(paramMotionEvent, 0)) < 10.0F))
          {
            j localj = this.lFO;
            localj.lGb = false;
            localj.d(0, 350L, 0L);
          }
        }
      }
      label480:
      if ((paramMotionEvent.getAction() == 5) || (paramMotionEvent.getAction() == 261))
      {
        this.eqf = 0.0F;
        this.lFI = this.lFx.getScale();
        this.lFD = true;
      }
      if (paramMotionEvent.getAction() == 2)
      {
        if (g.H(paramMotionEvent) != 2) {
          break label978;
        }
        this.lFP.removeMessages(2);
        this.lFD = true;
        this.count = 0;
        f1 = g.i(paramMotionEvent, 0) - g.i(paramMotionEvent, 1);
        f2 = g.j(paramMotionEvent, 0) - g.j(paramMotionEvent, 1);
        f3 = (float)Math.sqrt(f1 * f1 + f2 * f2);
        if (this.eqf != 0.0F) {
          break label931;
        }
        this.eqf = f3;
      }
    }
    for (;;)
    {
      GMTrace.o(11970342289408L, 89186);
      return true;
      if (this.count != 2) {
        break;
      }
      this.lFC = System.currentTimeMillis();
      if (this.lFC - this.lFz < 350L)
      {
        if ((Math.abs(this.lFA - g.i(paramMotionEvent, 0)) < 35.0F) && (Math.abs(this.lFB - g.j(paramMotionEvent, 0)) < 35.0F))
        {
          this.count = 0;
          w.d("MicroMsg.MuitlGestureImageView", "double click!");
          if (this.lFx.getScale() <= this.lFx.oyq)
          {
            this.lFx.G(g.i(paramMotionEvent, 0), g.j(paramMotionEvent, 0));
            break;
          }
          this.lFx.F(g.i(paramMotionEvent, 0), g.j(paramMotionEvent, 0));
          this.lFx.caF();
          break;
        }
        this.count = 1;
        break;
      }
      this.count = 1;
      break;
      label783:
      if (this.lFL)
      {
        this.lFL = false;
        this.lFH = new g(this.lFx);
        aDH();
      }
      if (this.lFM)
      {
        this.lFM = false;
        this.lFH = new h(this.lFx);
        aDH();
      }
      if (this.lFJ)
      {
        this.lFJ = false;
        this.lFH = new i(this.lFx);
        aDH();
      }
      if (!this.lFK) {
        break label371;
      }
      this.lFK = false;
      this.lFH = new e(this.lFx);
      aDH();
      break label371;
      label914:
      this.count = 0;
      w.d("MicroMsg.MuitlGestureImageView", "single long click over!");
      break label480;
      label931:
      f3 /= this.eqf;
      if (this.lFD)
      {
        this.lFx.f(f3 * this.lFI, f1 + g.i(paramMotionEvent, 1), f2 + g.j(paramMotionEvent, 1));
        continue;
        label978:
        if ((Math.abs(this.lFA - g.i(paramMotionEvent, 0)) > 10.0F) || (Math.abs(this.lFB - g.j(paramMotionEvent, 0)) > 10.0F))
        {
          this.lFP.removeMessages(2);
          this.count = 0;
          computeScroll();
        }
      }
    }
  }
  
  private abstract class a
  {
    protected boolean eqi;
    
    public a()
    {
      GMTrace.i(11966449975296L, 89157);
      this.eqi = false;
      GMTrace.o(11966449975296L, 89157);
    }
    
    public final boolean aDI()
    {
      GMTrace.i(11966584193024L, 89158);
      boolean bool = this.eqi;
      GMTrace.o(11966584193024L, 89158);
      return bool;
    }
    
    public abstract void play();
  }
  
  public static abstract interface b {}
  
  private final class c
    extends GestureDetector.SimpleOnGestureListener
  {
    private c()
    {
      GMTrace.i(11966852628480L, 89160);
      GMTrace.o(11966852628480L, 89160);
    }
    
    public final boolean onDoubleTap(MotionEvent paramMotionEvent)
    {
      GMTrace.i(11966986846208L, 89161);
      GMTrace.o(11966986846208L, 89161);
      return true;
    }
  }
  
  public static abstract interface d {}
  
  private final class e
    extends MultiGestureImageView.a
  {
    public float[] lFT;
    MultiTouchImageView lFU;
    
    public e(MultiTouchImageView paramMultiTouchImageView)
    {
      super();
      GMTrace.i(11967792152576L, 89167);
      this.lFT = new float[9];
      this.lFU = paramMultiTouchImageView;
      GMTrace.o(11967792152576L, 89167);
    }
    
    public final void play()
    {
      GMTrace.i(11967926370304L, 89168);
      MultiGestureImageView.h(MultiGestureImageView.this).getHandler().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11965778886656L, 89152);
          MultiGestureImageView.e.this.lFU.getImageMatrix().getValues(MultiGestureImageView.e.this.lFT);
          float f1 = MultiGestureImageView.e.this.lFU.getScale();
          float f2 = MultiGestureImageView.e.this.lFU.imageHeight * f1;
          float f3 = MultiGestureImageView.e.this.lFT[5];
          f1 = MultiGestureImageView.i(MultiGestureImageView.this);
          if (f2 < MultiGestureImageView.i(MultiGestureImageView.this)) {
            f1 = MultiGestureImageView.i(MultiGestureImageView.this) / 2.0F + f2 / 2.0F;
          }
          f1 -= f3 + f2;
          if (f1 <= 0.0F) {
            MultiGestureImageView.e.this.eqi = true;
          }
          for (;;)
          {
            MultiGestureImageView.e.this.lFU.H(0.0F, f1);
            GMTrace.o(11965778886656L, 89152);
            return;
            if (Math.abs(f1) <= 5.0F) {
              MultiGestureImageView.e.this.eqi = true;
            } else {
              f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
            }
          }
        }
      });
      GMTrace.o(11967926370304L, 89168);
    }
  }
  
  private final class f
    extends MultiGestureImageView.a
  {
    public float[] lFT;
    MultiTouchImageView lFU;
    
    public f(MultiTouchImageView paramMultiTouchImageView)
    {
      super();
      GMTrace.i(11969536983040L, 89180);
      this.lFT = new float[9];
      this.lFU = paramMultiTouchImageView;
      GMTrace.o(11969536983040L, 89180);
    }
    
    public final void play()
    {
      GMTrace.i(11969671200768L, 89181);
      MultiGestureImageView.h(MultiGestureImageView.this).getHandler().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11968194805760L, 89170);
          MultiGestureImageView.f.this.lFU.getImageMatrix().getValues(MultiGestureImageView.f.this.lFT);
          float f4 = MultiGestureImageView.f.this.lFU.getScale() * MultiGestureImageView.f.this.lFU.imageWidth;
          float f7 = MultiGestureImageView.f.this.lFU.getScale() * MultiGestureImageView.f.this.lFU.imageHeight;
          float f6 = MultiGestureImageView.f.this.lFT[2];
          float f9 = MultiGestureImageView.f.this.lFT[5];
          float f5 = MultiGestureImageView.f.this.lFT[2];
          float f8 = MultiGestureImageView.f.this.lFT[5];
          float f1 = MultiGestureImageView.i(MultiGestureImageView.this);
          float f3 = MultiGestureImageView.g(MultiGestureImageView.this);
          float f2;
          if (f7 < MultiGestureImageView.i(MultiGestureImageView.this))
          {
            f2 = MultiGestureImageView.i(MultiGestureImageView.this) / 2.0F;
            float f11 = f7 / 2.0F;
            f1 = MultiGestureImageView.i(MultiGestureImageView.this) / 2.0F;
            float f10 = f7 / 2.0F;
            f2 -= f11;
            f1 += f10;
          }
          for (;;)
          {
            f2 -= f9;
            f1 -= f8 + f7;
            if (f2 < 0.0F) {
              f1 = f2;
            }
            for (;;)
            {
              if (f4 < MultiGestureImageView.g(MultiGestureImageView.this))
              {
                f3 = MultiGestureImageView.g(MultiGestureImageView.this) / 2.0F;
                f8 = f4 / 2.0F;
                f2 = MultiGestureImageView.g(MultiGestureImageView.this) / 2.0F;
                f7 = f4 / 2.0F;
                f3 -= f8;
                f2 += f7;
              }
              for (;;)
              {
                f3 -= f6;
                f2 -= f5 + f4;
                if (f3 < 0.0F) {
                  f2 = f3;
                }
                for (;;)
                {
                  label320:
                  if ((Math.abs(f2) <= 5.0F) && (Math.abs(f1) <= 5.0F)) {
                    MultiGestureImageView.f.this.eqi = true;
                  }
                  for (;;)
                  {
                    MultiGestureImageView.f.this.lFU.H(f2, f1);
                    GMTrace.o(11968194805760L, 89170);
                    return;
                    if (f1 <= 0.0F) {
                      break label526;
                    }
                    break;
                    if (f2 <= 0.0F) {
                      break label514;
                    }
                    break label320;
                    if (f2 >= 0.0F) {}
                    for (f2 = (float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;; f2 = -(float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F)
                    {
                      if (f1 < 0.0F) {
                        break label484;
                      }
                      f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
                      break;
                    }
                    label484:
                    f1 = -(float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
                  }
                  label514:
                  f2 = 0.0F;
                }
                f2 = f3;
                f3 = 0.0F;
              }
              label526:
              f1 = 0.0F;
            }
            f2 = 0.0F;
          }
        }
      });
      GMTrace.o(11969671200768L, 89181);
    }
  }
  
  private final class g
    extends MultiGestureImageView.a
  {
    public float[] lFT;
    MultiTouchImageView lFU;
    
    public g(MultiTouchImageView paramMultiTouchImageView)
    {
      super();
      GMTrace.i(11966181539840L, 89155);
      this.lFT = new float[9];
      this.lFU = paramMultiTouchImageView;
      GMTrace.o(11966181539840L, 89155);
    }
    
    public final void play()
    {
      GMTrace.i(11966315757568L, 89156);
      MultiGestureImageView.h(MultiGestureImageView.this).getHandler().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11968463241216L, 89172);
          MultiGestureImageView.g.this.lFU.getImageMatrix().getValues(MultiGestureImageView.g.this.lFT);
          float f2 = MultiGestureImageView.g.this.lFT[2];
          float f1 = MultiGestureImageView.g.this.lFU.getScale() * MultiGestureImageView.g.this.lFU.imageWidth;
          if (f1 < MultiGestureImageView.g(MultiGestureImageView.this)) {}
          for (f1 = MultiGestureImageView.g(MultiGestureImageView.this) / 2.0F - f1 / 2.0F;; f1 = 0.0F)
          {
            f1 -= f2;
            if (f1 >= 0.0F) {
              MultiGestureImageView.g.this.eqi = true;
            }
            for (;;)
            {
              MultiGestureImageView.g.this.lFU.H(f1, 0.0F);
              GMTrace.o(11968463241216L, 89172);
              return;
              if (Math.abs(f1) <= 5.0F) {
                MultiGestureImageView.g.this.eqi = true;
              } else {
                f1 = -(float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
              }
            }
          }
        }
      });
      GMTrace.o(11966315757568L, 89156);
    }
  }
  
  private final class h
    extends MultiGestureImageView.a
  {
    public float[] lFT;
    MultiTouchImageView lFU;
    
    public h(MultiTouchImageView paramMultiTouchImageView)
    {
      super();
      GMTrace.i(11968597458944L, 89173);
      this.lFT = new float[9];
      this.lFU = paramMultiTouchImageView;
      GMTrace.o(11968597458944L, 89173);
    }
    
    public final void play()
    {
      GMTrace.i(11968731676672L, 89174);
      MultiGestureImageView.h(MultiGestureImageView.this).getHandler().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11966047322112L, 89154);
          MultiGestureImageView.h.this.lFU.getImageMatrix().getValues(MultiGestureImageView.h.this.lFT);
          float f1 = MultiGestureImageView.h.this.lFU.getScale();
          float f2 = MultiGestureImageView.h.this.lFU.imageWidth * f1;
          float f3 = MultiGestureImageView.h.this.lFT[2];
          f1 = MultiGestureImageView.g(MultiGestureImageView.this);
          if (f2 < MultiGestureImageView.g(MultiGestureImageView.this)) {
            f1 = MultiGestureImageView.g(MultiGestureImageView.this) / 2.0F + f2 / 2.0F;
          }
          f1 -= f3 + f2;
          if (f1 <= 0.0F) {
            MultiGestureImageView.h.this.eqi = true;
          }
          for (;;)
          {
            MultiGestureImageView.h.this.lFU.H(f1, 0.0F);
            GMTrace.o(11966047322112L, 89154);
            return;
            if (Math.abs(f1) <= 5.0F) {
              MultiGestureImageView.h.this.eqi = true;
            } else {
              f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
            }
          }
        }
      });
      GMTrace.o(11968731676672L, 89174);
    }
  }
  
  private final class i
    extends MultiGestureImageView.a
  {
    public float[] lFT;
    MultiTouchImageView lFU;
    
    public i(MultiTouchImageView paramMultiTouchImageView)
    {
      super();
      GMTrace.i(11972087119872L, 89199);
      this.lFT = new float[9];
      this.lFU = paramMultiTouchImageView;
      GMTrace.o(11972087119872L, 89199);
    }
    
    public final void play()
    {
      GMTrace.i(11972221337600L, 89200);
      MultiGestureImageView.h(MultiGestureImageView.this).getHandler().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11967657934848L, 89166);
          MultiGestureImageView.i.this.lFU.getImageMatrix().getValues(MultiGestureImageView.i.this.lFT);
          float f2 = MultiGestureImageView.i.this.lFT[5];
          float f1 = MultiGestureImageView.i.this.lFU.getScale() * MultiGestureImageView.i.this.lFU.imageHeight;
          if (f1 < MultiGestureImageView.i(MultiGestureImageView.this)) {}
          for (f1 = MultiGestureImageView.i(MultiGestureImageView.this) / 2.0F - f1 / 2.0F;; f1 = 0.0F)
          {
            f1 -= f2;
            if (f1 >= 0.0F) {
              MultiGestureImageView.i.this.eqi = true;
            }
            for (;;)
            {
              MultiGestureImageView.i.this.lFU.H(0.0F, f1);
              GMTrace.o(11967657934848L, 89166);
              return;
              if (Math.abs(f1) <= 5.0F) {
                MultiGestureImageView.i.this.eqi = true;
              } else {
                f1 = -(float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
              }
            }
          }
        }
      });
      GMTrace.o(11972221337600L, 89200);
    }
  }
  
  public final class j
    extends ae
  {
    WeakReference<MultiGestureImageView> grA;
    private long lGa;
    boolean lGb;
    
    public j()
    {
      GMTrace.i(11969134329856L, 89177);
      WeakReference localWeakReference;
      this.grA = localWeakReference;
      GMTrace.o(11969134329856L, 89177);
    }
    
    public final void d(int paramInt, long paramLong1, long paramLong2)
    {
      GMTrace.i(11969402765312L, 89179);
      this.lGa = paramLong2;
      sendEmptyMessageDelayed(paramInt, paramLong1);
      GMTrace.o(11969402765312L, 89179);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(11969268547584L, 89178);
      super.handleMessage(paramMessage);
      removeMessages(paramMessage.what);
      if (this.grA != null)
      {
        final MultiGestureImageView localMultiGestureImageView = (MultiGestureImageView)this.grA.get();
        if (localMultiGestureImageView != null)
        {
          if (paramMessage.what == 0)
          {
            if ((MultiGestureImageView.a(localMultiGestureImageView) == 1) || (this.lGb))
            {
              w.d("MicroMsg.MuitlGestureImageView", "single click over!");
              if (MultiGestureImageView.b(localMultiGestureImageView) != null) {
                localMultiGestureImageView.getHandler().post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(11969000112128L, 89176);
                    GMTrace.o(11969000112128L, 89176);
                  }
                });
              }
            }
            MultiGestureImageView.c(MultiGestureImageView.this);
            GMTrace.o(11969268547584L, 89178);
            return;
          }
          if (paramMessage.what == 1)
          {
            if ((MultiGestureImageView.d(MultiGestureImageView.this) != null) && (!MultiGestureImageView.d(MultiGestureImageView.this).aDI()))
            {
              MultiGestureImageView.d(MultiGestureImageView.this).play();
              sendEmptyMessageDelayed(paramMessage.what, this.lGa);
              GMTrace.o(11969268547584L, 89178);
              return;
            }
            MultiGestureImageView.e(localMultiGestureImageView);
            GMTrace.o(11969268547584L, 89178);
            return;
          }
          removeMessages(2);
          if (MultiGestureImageView.f(localMultiGestureImageView) != null) {
            localMultiGestureImageView.getHandler().post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(11967389499392L, 89164);
                GMTrace.o(11967389499392L, 89164);
              }
            });
          }
        }
      }
      GMTrace.o(11969268547584L, 89178);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\view\MultiGestureImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */