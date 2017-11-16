package com.tencent.mm.view.footer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.l;
import com.tencent.mm.bg.a.c;
import com.tencent.mm.bg.a.d;
import com.tencent.mm.bg.a.g;
import com.tencent.mm.bg.a.h;

public final class b
  extends a
{
  private boolean xBA;
  private boolean xBB;
  private boolean xBC;
  private boolean xBD;
  private int xBE;
  private Bitmap xBj;
  private Bitmap xBk;
  private Bitmap xBl;
  private Bitmap xBm;
  private Bitmap xBn;
  private Bitmap xBo;
  private Bitmap xBp;
  private Bitmap xBq;
  private Bitmap xBr;
  private Bitmap xBs;
  private Bitmap xBt;
  private Bitmap xBu;
  private Bitmap xBv;
  private Bitmap xBw;
  private Rect[] xBx;
  private Rect[] xBy;
  private boolean xBz;
  private Paint xfo;
  
  public b(Context paramContext, com.tencent.mm.bl.b paramb)
  {
    super(paramContext, paramb);
    GMTrace.i(19635248300032L, 146294);
    this.xBD = true;
    this.xBE = -1;
    GMTrace.o(19635248300032L, 146294);
  }
  
  protected final boolean EG(int paramInt)
  {
    boolean bool1 = true;
    GMTrace.i(19636053606400L, 146300);
    boolean bool2 = super.EG(paramInt);
    switch (1.tJj[EF(paramInt).ordinal()])
    {
    default: 
      bool1 = bool2;
    }
    GMTrace.o(19636053606400L, 146300);
    return bool1;
  }
  
  protected final Bitmap a(com.tencent.mm.api.d paramd, boolean paramBoolean)
  {
    GMTrace.i(19635785170944L, 146298);
    Bitmap localBitmap = null;
    if (paramd == com.tencent.mm.api.d.eqC) {
      if (paramBoolean) {
        localBitmap = this.xBm;
      }
    }
    for (;;)
    {
      GMTrace.o(19635785170944L, 146298);
      return localBitmap;
      localBitmap = this.xBl;
      continue;
      if (paramd == com.tencent.mm.api.d.eqB) {
        if (paramBoolean) {
          localBitmap = this.xBj;
        } else {
          localBitmap = this.xBk;
        }
      }
    }
  }
  
  protected final void ckU()
  {
    GMTrace.i(19635382517760L, 146295);
    super.ckU();
    this.xfo = new Paint(1);
    this.xfo.setTextSize(getResources().getDimension(a.c.tkK));
    this.xBn = BitmapFactory.decodeResource(getResources(), a.d.tlc);
    this.xBo = BitmapFactory.decodeResource(getResources(), a.d.tlb);
    this.xBp = BitmapFactory.decodeResource(getResources(), a.d.tle);
    this.xBq = BitmapFactory.decodeResource(getResources(), a.d.tld);
    this.xBk = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tly));
    this.xBj = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlx));
    this.xBl = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tls));
    this.xBm = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlr));
    this.xBr = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlz));
    this.xBs = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlA));
    this.xBu = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlC));
    this.xBt = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlB));
    this.xBv = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlq));
    this.xBw = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlp));
    GMTrace.o(19635382517760L, 146295);
  }
  
  protected final int ckZ()
  {
    GMTrace.i(19635919388672L, 146299);
    int i = super.ckZ();
    if (i == 0)
    {
      if (clc() == com.tencent.mm.api.d.eqB)
      {
        i = (int)getResources().getDimension(a.c.tkS);
        GMTrace.o(19635919388672L, 146299);
        return i;
      }
      if (clc() == com.tencent.mm.api.d.eqC)
      {
        i = (int)(getResources().getDimension(a.c.tkT) + getResources().getDimension(a.c.tkL));
        GMTrace.o(19635919388672L, 146299);
        return i;
      }
    }
    GMTrace.o(19635919388672L, 146299);
    return i;
  }
  
  protected final void cla()
  {
    GMTrace.i(19636456259584L, 146303);
    super.cla();
    float f1;
    int k;
    int i;
    int j;
    float f2;
    if (clc() == com.tencent.mm.api.d.eqB)
    {
      if (this.xBx == null) {
        this.xBx = new Rect[2];
      }
      if (this.xBb == null) {
        this.xBb = new Rect();
      }
      f1 = (getMeasuredWidth() - (int)(2.0F * this.xAP) - this.xAW.getWidth() - this.xBq.getWidth() - this.xBn.getWidth()) / 3.0F;
      k = (int)(this.xBp.getWidth() / 2 + f1);
      i = (ckZ() - this.xBp.getWidth()) / 2 + this.xBp.getWidth() / 2;
      j = this.xBp.getWidth() * 2;
      this.xBx[0] = new Rect(k - j, i - j, k + j, i + j);
      f2 = k;
      k = (int)(f1 + this.xBp.getWidth() + f2);
      this.xBx[1] = new Rect(k - j, i - j, k + j, i + j);
      i = getMeasuredWidth() - (int)(2.0F * this.xAP) / 2 - this.xAW.getWidth() / 2;
      this.xBb.set(i - this.xAW.getWidth(), 0, i + this.xAW.getWidth(), ckZ());
      GMTrace.o(19636456259584L, 146303);
      return;
    }
    if (clc() == com.tencent.mm.api.d.eqC)
    {
      if (this.xBy == null) {
        this.xBy = new Rect[4];
      }
      i = (int)getResources().getDimension(a.c.tkL);
      f1 = i / 2 - this.xBs.getHeight() / 2;
      f2 = getResources().getDimension(a.c.tkT) / 2.0F;
      float f3 = this.xBw.getHeight() / 2;
      float f4 = i;
      float f5 = 1.0F * (int)(2.0F * this.xAP) / 2.0F;
      j = (int)(f1 + this.xBw.getHeight() / 2);
      k = (int)(f5 + this.xBw.getHeight() / 2);
      i = this.xBw.getHeight();
      this.xBy[0] = new Rect(k - i, j - i, k + i, j + i);
      j = (int)(f4 + (f2 - f3) + this.xBw.getHeight() / 2);
      this.xBy[1] = new Rect(k - i, j - i, k + i, j + i);
      k = getMeasuredWidth() - (int)(2.0F * this.xAP) / 2 - this.xBw.getHeight() / 2;
      this.xBy[2] = new Rect(k - i, j - i, k + i, j + i);
      k = getMeasuredWidth() / 2;
      this.xBy[3] = new Rect(k - i, j - i, k + i, j + i);
    }
    GMTrace.o(19636456259584L, 146303);
  }
  
  protected final void eN(int paramInt1, int paramInt2)
  {
    int j = 0;
    int i = 0;
    GMTrace.i(19636187824128L, 146301);
    super.eN(paramInt1, paramInt2);
    switch (1.tJj[EF(this.iJv).ordinal()])
    {
    }
    do
    {
      GMTrace.o(19636187824128L, 146301);
      return;
      do
      {
        i += 1;
        if (i >= this.xBx.length) {
          break;
        }
      } while (!this.xBx[i].contains(paramInt1, paramInt2));
      this.xBE = i;
      GMTrace.o(19636187824128L, 146301);
      return;
      GMTrace.o(19636187824128L, 146301);
      return;
      do
      {
        j += 1;
        if (j >= this.xBy.length) {
          break;
        }
      } while (!this.xBy[j].contains(paramInt1, paramInt2));
      if (j == 0)
      {
        this.xBA = true;
        GMTrace.o(19636187824128L, 146301);
        return;
      }
      if (j == 1)
      {
        this.xBz = true;
        GMTrace.o(19636187824128L, 146301);
        return;
      }
      if (j == 2)
      {
        this.xBB = true;
        GMTrace.o(19636187824128L, 146301);
        return;
      }
    } while (j != 3);
    this.xBC = true;
    GMTrace.o(19636187824128L, 146301);
  }
  
  protected final void eO(int paramInt1, int paramInt2)
  {
    int i = 0;
    GMTrace.i(19636322041856L, 146302);
    super.eO(paramInt1, paramInt2);
    switch (1.tJj[EF(this.iJv).ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(19636322041856L, 146302);
      return;
      do
      {
        i += 1;
        if ((this.xBx == null) || (i >= this.xBx.length)) {
          break;
        }
      } while ((!this.xBx[i].contains(paramInt1, paramInt2)) || (i != this.xBE));
      this.evi.bNJ().a(com.tencent.mm.api.d.eqB, i);
      this.xAY = this.iJv;
      GMTrace.o(19636322041856L, 146302);
      return;
      GMTrace.o(19636322041856L, 146302);
      return;
      i = 0;
      while ((this.xBy != null) && (i < this.xBy.length))
      {
        if (this.xBy[i].contains(paramInt1, paramInt2))
        {
          if (((i == 0) && (this.xBA)) || ((i == 1) && (this.xBz)) || ((i == 2) && (this.xBB)) || ((i == 3) && (this.xBC)))
          {
            this.evi.bNJ().a(com.tencent.mm.api.d.eqC, i);
            this.xAY = this.iJv;
          }
          this.xBA = false;
          this.xBz = false;
          this.xBB = false;
          this.xBC = false;
          GMTrace.o(19636322041856L, 146302);
          return;
        }
        i += 1;
      }
    }
  }
  
  protected final void j(Canvas paramCanvas)
  {
    GMTrace.i(19635650953216L, 146297);
    if (clc() != com.tencent.mm.api.d.eqC)
    {
      super.j(paramCanvas);
      GMTrace.o(19635650953216L, 146297);
      return;
    }
    k(paramCanvas);
    GMTrace.o(19635650953216L, 146297);
  }
  
  protected final void k(Canvas paramCanvas)
  {
    GMTrace.i(19636590477312L, 146304);
    super.k(paramCanvas);
    float f1;
    float f2;
    if (clc() == com.tencent.mm.api.d.eqB)
    {
      Paint localPaint = new Paint();
      if (pT())
      {
        localPaint.setAlpha(255);
        if ((!this.xBc) || (!pT())) {
          break label252;
        }
      }
      label252:
      for (Bitmap localBitmap = this.xAX;; localBitmap = this.xAW)
      {
        paramCanvas.drawBitmap(localBitmap, getMeasuredWidth() - (int)(this.xAP * 2.0F) / 2 - this.xAW.getWidth(), (ckZ() - this.xAW.getHeight()) / 2, localPaint);
        f1 = (getMeasuredWidth() - (int)(this.xAP * 2.0F) - this.xAW.getWidth() - this.xBq.getWidth() - this.xBn.getWidth()) / 3.0F;
        f2 = 1.0F * (ckZ() - this.xBq.getHeight()) / 2.0F;
        if (this.xBD)
        {
          this.xBE = 0;
          this.xBD = false;
        }
        if (this.xBE != 0) {
          break label261;
        }
        paramCanvas.drawBitmap(this.xBo, f1, f2, null);
        paramCanvas.drawBitmap(this.xBp, f1 + f1 + this.xBq.getWidth(), f2, null);
        GMTrace.o(19636590477312L, 146304);
        return;
        localPaint.setAlpha(160);
        break;
      }
      label261:
      if (this.xBE == 1)
      {
        paramCanvas.drawBitmap(this.xBn, f1, f2, null);
        paramCanvas.drawBitmap(this.xBq, f1 + f1 + this.xBq.getWidth(), f2, null);
        GMTrace.o(19636590477312L, 146304);
        return;
      }
      paramCanvas.drawBitmap(this.xBn, f1, f2, null);
      paramCanvas.drawBitmap(this.xBp, f1 + f1 + this.xBq.getWidth(), f2, null);
      GMTrace.o(19636590477312L, 146304);
      return;
    }
    if (clc() == com.tencent.mm.api.d.eqC)
    {
      int i = (int)getResources().getDimension(a.c.tkL);
      paramCanvas.drawLine(0.0F, i, getMeasuredWidth(), i, this.xBd);
      f1 = getResources().getDimension(a.c.tkT) / 2.0F - this.xBw.getHeight() / 2 + i;
      f2 = 1.0F * (int)(this.xAP * 2.0F) / 2.0F;
      float f3 = i / 2 - this.xBs.getHeight() / 2;
      if (this.xBA)
      {
        paramCanvas.drawBitmap(this.xBs, f2, f3, null);
        if (!this.xBB) {
          break label663;
        }
        paramCanvas.drawBitmap(this.xBu, getMeasuredWidth() - f2 - this.xBw.getWidth(), f1, null);
        label508:
        if (!this.xBz) {
          break label692;
        }
        paramCanvas.drawBitmap(this.xBv, f2, f1, null);
      }
      for (;;)
      {
        f1 = getResources().getDimension(a.c.tkK) * 2.0F;
        f2 = getResources().getDimension(a.c.tkK);
        f3 = getResources().getDimension(a.c.tkT) / 2.0F;
        f2 = (f2 - 8.0F) / 2.0F + f3 + i;
        f3 = getMeasuredWidth() / 2;
        if (!this.xBC) {
          break label706;
        }
        this.xfo.setColor(-1);
        this.xfo.setAlpha(160);
        paramCanvas.drawText(getResources().getString(a.h.tlH), f3 - f1 / 2.0F, f2, this.xfo);
        GMTrace.o(19636590477312L, 146304);
        return;
        paramCanvas.drawBitmap(this.xBr, f2, f3, null);
        break;
        label663:
        paramCanvas.drawBitmap(this.xBt, getMeasuredWidth() - f2 - this.xBw.getWidth(), f1, null);
        break label508;
        label692:
        paramCanvas.drawBitmap(this.xBw, f2, f1, null);
      }
      label706:
      if (pT())
      {
        this.xfo.setColor(-1);
        this.xfo.setAlpha(255);
        paramCanvas.drawText(getResources().getString(a.h.tlH), f3 - f1 / 2.0F, f2, this.xfo);
        GMTrace.o(19636590477312L, 146304);
        return;
      }
      this.xfo.setColor(-1);
      this.xfo.setAlpha(100);
      paramCanvas.drawText(getResources().getString(a.h.tlH), f3 - f1 / 2.0F, f2, this.xfo);
    }
    GMTrace.o(19636590477312L, 146304);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(19635516735488L, 146296);
    if (clc() != com.tencent.mm.api.d.eqC)
    {
      super.onMeasure(paramInt1, paramInt2);
      GMTrace.o(19635516735488L, 146296);
      return;
    }
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = getPaddingLeft();
    int i = getPaddingRight();
    int j = View.MeasureSpec.makeMeasureSpec(ckZ(), 1073741824);
    setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(paramInt1 - paramInt2 - i, 1073741824), j);
    cla();
    GMTrace.o(19635516735488L, 146296);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\view\footer\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */