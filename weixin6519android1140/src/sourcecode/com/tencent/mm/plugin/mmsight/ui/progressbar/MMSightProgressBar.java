package com.tencent.mm.plugin.mmsight.ui.progressbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader.TileMode;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MMSightProgressBar
  extends View
{
  public static final int kKH;
  public static final int njI;
  private static final int[] njJ;
  private int centerX;
  private int centerY;
  private ae handler;
  private boolean isStart;
  private Paint jrC;
  private List<a> njK;
  private int njL;
  private b njM;
  private boolean njN;
  private a njO;
  
  static
  {
    GMTrace.i(7404389400576L, 55167);
    kKH = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 3);
    njI = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 5);
    njJ = new int[] { -1, -1, Color.parseColor("#F5B3B2"), Color.parseColor("#EB6866"), Color.parseColor("#E64340") };
    GMTrace.o(7404389400576L, 55167);
  }
  
  public MMSightProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7402644570112L, 55154);
    this.njK = new ArrayList(5);
    this.njL = 0;
    this.centerX = 0;
    this.centerY = 0;
    this.handler = null;
    this.isStart = false;
    this.njN = false;
    init();
    GMTrace.o(7402644570112L, 55154);
  }
  
  public MMSightProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7402778787840L, 55155);
    this.njK = new ArrayList(5);
    this.njL = 0;
    this.centerX = 0;
    this.centerY = 0;
    this.handler = null;
    this.isStart = false;
    this.njN = false;
    init();
    GMTrace.o(7402778787840L, 55155);
  }
  
  private void init()
  {
    GMTrace.i(7402913005568L, 55156);
    this.jrC = new Paint();
    this.jrC.setColor(-65536);
    this.jrC.setAntiAlias(true);
    this.handler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7401705046016L, 55147);
        if ((paramAnonymousMessage.what == 233) && (MMSightProgressBar.a(MMSightProgressBar.this)) && (MMSightProgressBar.b(MMSightProgressBar.this).size() > 0) && (MMSightProgressBar.b(MMSightProgressBar.this).size() < 5))
        {
          paramAnonymousMessage = (a)MMSightProgressBar.b(MMSightProgressBar.this).get(MMSightProgressBar.b(MMSightProgressBar.this).size() - 1);
          int i = MMSightProgressBar.azp()[MMSightProgressBar.b(MMSightProgressBar.this).size()];
          a locala = new a(MMSightProgressBar.b(MMSightProgressBar.this).size(), MMSightProgressBar.c(MMSightProgressBar.this), MMSightProgressBar.d(MMSightProgressBar.this), i);
          MMSightProgressBar.a(MMSightProgressBar.this, new b(paramAnonymousMessage, locala, new b.a()
          {
            public final void a(a paramAnonymous2a)
            {
              GMTrace.i(7402376134656L, 55152);
              MMSightProgressBar.b(MMSightProgressBar.this).add(paramAnonymous2a);
              MMSightProgressBar.a(MMSightProgressBar.this, null);
              if (MMSightProgressBar.b(MMSightProgressBar.this).size() >= 5)
              {
                Log.i("MicroMsg.MMSightProgressBar", "progress finish!");
                if (MMSightProgressBar.e(MMSightProgressBar.this) != null) {
                  MMSightProgressBar.e(MMSightProgressBar.this);
                }
              }
              for (;;)
              {
                MMSightProgressBar.this.invalidate();
                GMTrace.o(7402376134656L, 55152);
                return;
                if (MMSightProgressBar.a(MMSightProgressBar.this)) {
                  MMSightProgressBar.f(MMSightProgressBar.this).sendEmptyMessage(233);
                }
              }
            }
            
            public final void aQJ()
            {
              GMTrace.i(7402510352384L, 55153);
              MMSightProgressBar.this.invalidate();
              GMTrace.o(7402510352384L, 55153);
            }
          }));
          paramAnonymousMessage = MMSightProgressBar.g(MMSightProgressBar.this);
          paramAnonymousMessage.iKQ = ValueAnimator.ofFloat(new float[] { 0.0F, 100.0F });
          paramAnonymousMessage.iKQ.addUpdateListener(new b.1(paramAnonymousMessage));
          paramAnonymousMessage.iKQ.addListener(new b.2(paramAnonymousMessage));
          paramAnonymousMessage.iKQ.setInterpolator(new AccelerateDecelerateInterpolator());
          paramAnonymousMessage.iKQ.setDuration(2000L);
          paramAnonymousMessage.iKQ.start();
        }
        GMTrace.o(7401705046016L, 55147);
      }
    };
    Log.i("MicroMsg.MMSightProgressBar", "init, pointRadius: %s, pointDistance: %s", new Object[] { Integer.valueOf(kKH), Integer.valueOf(njI) });
    GMTrace.o(7402913005568L, 55156);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(7403047223296L, 55157);
    super.onDraw(paramCanvas);
    int j;
    int k;
    Object localObject1;
    if ((this.isStart) && ((this.centerX <= 0) || (this.centerY <= 0)))
    {
      i = getLeft();
      j = getRight();
      k = getTop();
      int m = getBottom();
      this.centerX = ((j - i) / 2);
      this.centerY = ((m - k) / 2);
      Log.i("MicroMsg.MMSightProgressBar", "left: %s, right: %s, top: %s, bottom: %s, centerX: %s, centerY: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(this.centerX), Integer.valueOf(this.centerY) });
      Log.i("MicroMsg.MMSightProgressBar", "add init point");
      localObject1 = new a(0, this.centerX, this.centerY, -1);
      this.njK.add(localObject1);
    }
    int i = paramCanvas.save();
    this.njL = this.njK.size();
    float f1;
    float f3;
    if (this.njL % 2 == 0)
    {
      f1 = -(njI / 2.0F + (this.njL / 2 - 1) * njI + this.njL / 2 * kKH);
      f2 = f1;
      if (this.njM != null)
      {
        f2 = f1;
        if (this.njM.njY)
        {
          j = this.njL + 1;
          if (j % 2 != 0) {
            break label1189;
          }
          f2 = njI / 2.0F;
          f3 = (j / 2 - 1) * njI;
        }
      }
    }
    for (float f2 = -(j / 2 * kKH + (f2 + f3));; f2 = -(j / 2 * kKH + (f2 + f3)))
    {
      Log.d("MicroMsg.MMSightProgressBar", "add translateX for splitting, dstTranslateX: %s, progress: %s", new Object[] { Float.valueOf(f2), Float.valueOf(this.njM.njV) });
      f3 = this.njM.njV / 100.0F;
      f2 = f1 - (Math.abs(f2) - Math.abs(f1)) * f3;
      Log.d("MicroMsg.MMSightProgressBar", "draw, translateX: %s, currentPointCount: %s", new Object[] { Float.valueOf(f2), Integer.valueOf(this.njL) });
      paramCanvas.translate(f2, 0.0F);
      Object localObject2;
      Object localObject3;
      if ((this.njM != null) && (this.njM.njY))
      {
        localObject2 = this.njM;
        localObject1 = this.jrC;
        f1 = (njI + kKH * 2) * (((b)localObject2).njV / 100.0F);
        w.d("MicroMsg.MMSightProgressPointSplitter", "drawForSplitProgress, progress: %s, rightPointXOffset: %s", new Object[] { Float.valueOf(((b)localObject2).njV), Float.valueOf(f1) });
        if (((b)localObject2).nkg > ((b)localObject2).nki)
        {
          f2 = ((b)localObject2).njW.njR - kKH;
          f3 = ((b)localObject2).njW.njS - kKH;
          ((Paint)localObject1).setColor(((b)localObject2).njX.color);
          ((b)localObject2).nkk.reset();
          ((b)localObject2).nkk.moveTo(((b)localObject2).nka.x + f2, ((b)localObject2).nka.y + f3);
          ((b)localObject2).nkk.quadTo(((b)localObject2).nkb.x + f2, ((b)localObject2).nkb.y + f3, ((b)localObject2).nkc.x + f2, ((b)localObject2).nkc.y + f3);
          ((b)localObject2).nkk.lineTo(((b)localObject2).nkf.x + f2, ((b)localObject2).nkf.y + f3);
          ((b)localObject2).nkk.quadTo(((b)localObject2).nke.x + f2, ((b)localObject2).nke.y + f3, ((b)localObject2).nkd.x + f2, f3 + ((b)localObject2).nkd.y);
          if (((b)localObject2).njX.color != ((b)localObject2).njW.color)
          {
            f3 = ((b)localObject2).nka.x;
            float f4 = ((b)localObject2).njW.njS;
            float f5 = kKH;
            float f6 = ((b)localObject2).nkc.x;
            float f7 = ((b)localObject2).njW.njS;
            float f8 = kKH;
            j = ((b)localObject2).njW.color;
            k = ((b)localObject2).njX.color;
            localObject3 = Shader.TileMode.REPEAT;
            ((Paint)localObject1).setShader(new LinearGradient(f3 + f2, f4 - f5, f2 + f6, f7 - f8, new int[] { j, k }, null, (Shader.TileMode)localObject3));
          }
          paramCanvas.drawPath(((b)localObject2).nkk, (Paint)localObject1);
          ((Paint)localObject1).setShader(null);
        }
        localObject2 = ((b)localObject2).njX;
        ((Paint)localObject1).setColor(((a)localObject2).color);
        ((a)localObject2).njS = ((a)localObject2).njU;
        ((a)localObject2).njR = (((a)localObject2).njT + (((a)localObject2).index - 1) * (njI + kKH * 2) + f1);
        Log.d("MicroMsg.MMSightProgressPoint", "drawWithOffset, index: %s, offset: %s, pointX: %s", new Object[] { Integer.valueOf(((a)localObject2).index), Float.valueOf(f1), Float.valueOf(((a)localObject2).njR) });
        paramCanvas.drawCircle(((a)localObject2).njR, ((a)localObject2).njS, kKH, (Paint)localObject1);
        ((Paint)localObject1).setShader(null);
      }
      localObject1 = this.njK.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (a)((Iterator)localObject1).next();
        localObject3 = this.jrC;
        ((Paint)localObject3).setColor(((a)localObject2).color);
        ((a)localObject2).njR = (((a)localObject2).njT + ((a)localObject2).index * (njI + kKH * 2));
        ((a)localObject2).njS = ((a)localObject2).njU;
        Log.d("MicroMsg.MMSightProgressPoint", "draw, index: %s, pointX: %s", new Object[] { Integer.valueOf(((a)localObject2).index), Float.valueOf(((a)localObject2).njR) });
        paramCanvas.drawCircle(((a)localObject2).njR, ((a)localObject2).njS, kKH, (Paint)localObject3);
        ((Paint)localObject3).setShader(null);
      }
      f1 = -(kKH / 2.0F + this.njL / 2 * njI + this.njL / 2 * kKH);
      break;
      label1189:
      f2 = kKH / 2.0F;
      f3 = j / 2 * njI;
    }
    paramCanvas.restoreToCount(i);
    if ((this.isStart) && (!this.njN) && (this.njK.size() > 0))
    {
      Log.i("MicroMsg.MMSightProgressBar", "start handler loop");
      this.njN = true;
      this.handler.sendEmptyMessage(233);
    }
    GMTrace.o(7403047223296L, 55157);
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\progressbar\MMSightProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */