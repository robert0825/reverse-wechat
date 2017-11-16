package com.tencent.mm.view.footer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.l;
import com.tencent.mm.bg.a.b;
import com.tencent.mm.bg.a.c;
import com.tencent.mm.bg.a.d;
import com.tencent.mm.bg.a.e;
import com.tencent.mm.bg.a.g;

public abstract class a
  extends View
{
  public static final int[] xBe;
  public com.tencent.mm.bl.b evi;
  private Paint fWp;
  protected int iJv;
  final float xAP;
  private Bitmap xAQ;
  private Bitmap xAR;
  private Bitmap xAS;
  private Bitmap xAT;
  private Bitmap xAU;
  private Bitmap xAV;
  protected Bitmap xAW;
  protected Bitmap xAX;
  protected int xAY;
  private Rect[] xAZ;
  private Rect[] xBa;
  protected Rect xBb;
  protected boolean xBc;
  protected Paint xBd;
  protected int xBf;
  protected int xBg;
  private boolean xBh;
  protected Paint xzu;
  
  static
  {
    GMTrace.i(19632563945472L, 146274);
    xBe = new int[] { -1, -16777216, -707825, 47944, -16535286, -15172610, -7054596, -449092 };
    GMTrace.o(19632563945472L, 146274);
  }
  
  public a(Context paramContext, com.tencent.mm.bl.b paramb)
  {
    super(paramContext);
    GMTrace.i(19629476937728L, 146251);
    this.xAP = getResources().getDimension(a.c.tkQ);
    this.iJv = -1;
    this.xAY = -1;
    this.xBf = -1;
    this.xBg = -1;
    this.xBh = true;
    setId(a.e.tlh);
    this.evi = paramb;
    ckU();
    GMTrace.o(19629476937728L, 146251);
  }
  
  private Bitmap b(com.tencent.mm.api.d paramd, boolean paramBoolean)
  {
    GMTrace.i(19630550679552L, 146259);
    Bitmap localBitmap1 = null;
    switch (3.tJj[paramd.ordinal()])
    {
    }
    for (;;)
    {
      Bitmap localBitmap2 = localBitmap1;
      if (localBitmap1 == null) {
        localBitmap2 = a(paramd, paramBoolean);
      }
      GMTrace.o(19630550679552L, 146259);
      return localBitmap2;
      if (paramBoolean)
      {
        localBitmap1 = this.xAT;
      }
      else
      {
        localBitmap1 = this.xAS;
        continue;
        if (paramBoolean)
        {
          localBitmap1 = this.xAV;
        }
        else
        {
          localBitmap1 = this.xAU;
          continue;
          if (paramBoolean) {
            localBitmap1 = this.xAR;
          } else {
            localBitmap1 = this.xAQ;
          }
        }
      }
    }
  }
  
  private boolean ckV()
  {
    GMTrace.i(19630416461824L, 146258);
    if (ckZ() > 0)
    {
      GMTrace.o(19630416461824L, 146258);
      return true;
    }
    GMTrace.o(19630416461824L, 146258);
    return false;
  }
  
  private int ckW()
  {
    GMTrace.i(19630684897280L, 146260);
    int i = this.evi.bNI().length;
    GMTrace.o(19630684897280L, 146260);
    return i;
  }
  
  private float ckX()
  {
    GMTrace.i(19630819115008L, 146261);
    Bitmap localBitmap = b(com.tencent.mm.api.d.eqy, false);
    if (localBitmap == null)
    {
      GMTrace.o(19630819115008L, 146261);
      return 0.0F;
    }
    float f = localBitmap.getWidth();
    GMTrace.o(19630819115008L, 146261);
    return f;
  }
  
  private float ckY()
  {
    GMTrace.i(19631087550464L, 146263);
    float f = (getMeasuredWidth() - ckW() * ckX() - (int)(2.0F * this.xAP)) / (ckW() - 1);
    GMTrace.o(19631087550464L, 146263);
    return f;
  }
  
  private void clb()
  {
    GMTrace.i(19631624421376L, 146267);
    if (this.xBa == null) {
      this.xBa = new Rect[xBe.length];
    }
    if (this.xBb == null) {
      this.xBb = new Rect();
    }
    float f1 = getResources().getDimension(a.c.tkM);
    float f2 = (getMeasuredWidth() - (int)(2.0F * this.xAP) - this.xAW.getWidth() - 2.0F * f1 * xBe.length) / xBe.length;
    int k = (int)(2.0F * f1);
    int j = (int)((int)(2.0F * this.xAP) / 2 + f1 + 5.0F);
    int m = (int)((ckZ() - 2.0F * f1) / 2.0F + f1);
    int i = 0;
    while (i < xBe.length)
    {
      this.xBa[i] = new Rect(j - k, m - k, j + k, m + k);
      j = (int)(j + (2.0F * f1 + f2));
      i += 1;
    }
    i = getMeasuredWidth() - (int)(2.0F * this.xAP) / 2 - this.xAW.getWidth() / 2;
    this.xBb.set(i - this.xAW.getWidth(), 0, i + this.xAW.getWidth(), ckZ());
    GMTrace.o(19631624421376L, 146267);
  }
  
  public static int getColor(int paramInt)
  {
    GMTrace.i(19630953332736L, 146262);
    if ((paramInt >= 0) && (paramInt < xBe.length))
    {
      paramInt = xBe[paramInt];
      GMTrace.o(19630953332736L, 146262);
      return paramInt;
    }
    GMTrace.o(19630953332736L, 146262);
    return -65536;
  }
  
  protected final com.tencent.mm.api.d EF(int paramInt)
  {
    GMTrace.i(19631355985920L, 146265);
    if ((paramInt >= 0) && (paramInt < ckW()))
    {
      locald = this.evi.bNI()[paramInt];
      GMTrace.o(19631355985920L, 146265);
      return locald;
    }
    com.tencent.mm.api.d locald = com.tencent.mm.api.d.eqx;
    GMTrace.o(19631355985920L, 146265);
    return locald;
  }
  
  protected boolean EG(int paramInt)
  {
    boolean bool2 = false;
    GMTrace.i(19632161292288L, 146271);
    com.tencent.mm.api.d locald = EF(paramInt);
    boolean bool1 = bool2;
    switch (3.tJj[locald.ordinal()])
    {
    }
    for (bool1 = bool2;; bool1 = true)
    {
      GMTrace.o(19632161292288L, 146271);
      return bool1;
    }
  }
  
  protected abstract Bitmap a(com.tencent.mm.api.d paramd, boolean paramBoolean);
  
  public final void c(com.tencent.mm.api.d paramd)
  {
    GMTrace.i(19632429727744L, 146273);
    int i = 0;
    if (i < ckW()) {
      if (this.evi.bNI()[i] == paramd) {
        label33:
        if (!EG(i)) {
          break label80;
        }
      }
    }
    label80:
    for (this.iJv = i;; this.iJv = -1)
    {
      this.xAY = i;
      requestLayout();
      invalidate();
      GMTrace.o(19632429727744L, 146273);
      return;
      i += 1;
      break;
      i = -1;
      break label33;
    }
  }
  
  protected void ckU()
  {
    GMTrace.i(19630013808640L, 146255);
    this.xzu = new Paint(1);
    this.xzu.setColor(-16711936);
    this.xBd = new Paint(1);
    this.xBd.setColor(getResources().getColor(a.b.tkD));
    this.xBd.setStrokeWidth(0.6F);
    this.fWp = new Paint(1);
    this.fWp.setStyle(Paint.Style.FILL);
    this.fWp.setStrokeCap(Paint.Cap.ROUND);
    this.xAX = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlG));
    this.xAW = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlF));
    this.xAQ = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlw));
    this.xAR = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlv));
    this.xAS = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlE));
    this.xAT = com.tencent.mm.sdk.platformtools.d.t(getResources().getDrawable(a.g.tlD));
    this.xAU = BitmapFactory.decodeResource(getResources(), a.d.tkZ);
    this.xAV = BitmapFactory.decodeResource(getResources(), a.d.tkY);
    GMTrace.o(19630013808640L, 146255);
  }
  
  protected int ckZ()
  {
    GMTrace.i(19631221768192L, 146264);
    if (EF(this.iJv) == com.tencent.mm.api.d.eqy)
    {
      int i = (int)getResources().getDimension(a.c.tkS);
      GMTrace.o(19631221768192L, 146264);
      return i;
    }
    GMTrace.o(19631221768192L, 146264);
    return 0;
  }
  
  protected void cla()
  {
    GMTrace.i(19631490203648L, 146266);
    if (this.xAZ == null) {
      this.xAZ = new Rect[ckW()];
    }
    int j = (int)(this.xAP + ckX() / 2.0F);
    int k = (int)ckX();
    int i = 0;
    while (i < ckW())
    {
      this.xAZ[i] = new Rect(j - k, ckZ(), j + k, ckZ() + getMeasuredHeight());
      j = (int)(j + (ckY() + ckX()));
      i += 1;
    }
    if (EF(this.iJv) == com.tencent.mm.api.d.eqy) {
      clb();
    }
    GMTrace.o(19631490203648L, 146266);
  }
  
  public final com.tencent.mm.api.d clc()
  {
    GMTrace.i(19632295510016L, 146272);
    com.tencent.mm.api.d locald = EF(this.xAY);
    GMTrace.o(19632295510016L, 146272);
    return locald;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    GMTrace.i(19629745373184L, 146253);
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    case 2: 
    default: 
      GMTrace.o(19629745373184L, 146253);
      return true;
      if (ckV())
      {
        if ((this.xBb == null) || (!this.xBb.contains(j, k))) {
          break label146;
        }
        this.xBc = true;
        postInvalidate();
      }
    case 0: 
      for (;;)
      {
        label71:
        i += 1;
        if (i >= ckW()) {
          break;
        }
        if (!this.xAZ[i].contains(j, k)) {
          break label71;
        }
        this.xBf = i;
        postInvalidate();
        break;
        label146:
        eN(j, k);
      }
    }
    i = 0;
    label158:
    if (i < ckW())
    {
      if ((!this.xAZ[i].contains(j, k)) || (this.xBf != i)) {
        break label362;
      }
      if (EG(i))
      {
        if (this.xBf != this.iJv) {
          this.iJv = this.xBf;
        }
      }
      else
      {
        label216:
        if (!EG(i)) {
          break label340;
        }
        this.xAY = this.iJv;
        this.evi.bNJ().a(EF(this.iJv));
      }
    }
    else
    {
      label254:
      if (ckV())
      {
        if ((this.xBb == null) || (!this.xBb.contains(j, k)) || (!this.xBc)) {
          break label369;
        }
        this.evi.bNJ().a(EF(this.iJv), -1);
      }
    }
    for (;;)
    {
      this.xBc = false;
      this.xBf = -1;
      requestLayout();
      postInvalidate();
      break;
      this.iJv = -1;
      break label216;
      label340:
      this.evi.bNJ().a(EF(i));
      break label254;
      label362:
      i += 1;
      break label158;
      label369:
      eO(j, k);
    }
  }
  
  protected void eN(int paramInt1, int paramInt2)
  {
    GMTrace.i(19630148026368L, 146256);
    switch (3.tJj[EF(this.iJv).ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(19630148026368L, 146256);
      return;
      int i = 0;
      while (i < this.xBa.length)
      {
        if (this.xBa[i].contains(paramInt1, paramInt2))
        {
          this.xBg = i;
          this.xBh = false;
          GMTrace.o(19630148026368L, 146256);
          return;
        }
        i += 1;
      }
    }
  }
  
  protected void eO(int paramInt1, int paramInt2)
  {
    GMTrace.i(19630282244096L, 146257);
    switch (3.tJj[EF(this.iJv).ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(19630282244096L, 146257);
      return;
      int i = 0;
      while ((this.xBa != null) && (i < this.xBa.length))
      {
        if ((this.xBa[i].contains(paramInt1, paramInt2)) && (i == this.xBg))
        {
          this.evi.bNJ().a(com.tencent.mm.api.d.eqy, i);
          GMTrace.o(19630282244096L, 146257);
          return;
        }
        i += 1;
      }
    }
  }
  
  protected void j(Canvas paramCanvas)
  {
    GMTrace.i(19631758639104L, 146268);
    if (ckV())
    {
      paramCanvas.drawLine(0.0F, ckZ(), getMeasuredWidth(), ckZ(), this.xBd);
      k(paramCanvas);
    }
    float f1 = this.xAP;
    float f2 = (getMeasuredHeight() - ckZ() - ckX()) / 2.0F;
    float f3 = ckZ();
    int i = 0;
    if (i < ckW())
    {
      Object localObject = this.evi.bNI()[i];
      if ((this.xBf == i) || (i == this.iJv)) {}
      for (boolean bool = true;; bool = false)
      {
        localObject = b((com.tencent.mm.api.d)localObject, bool);
        if (localObject != null) {
          paramCanvas.drawBitmap((Bitmap)localObject, f1, f2 + f3, null);
        }
        f1 += ckY() + ckX();
        i += 1;
        break;
      }
    }
    GMTrace.o(19631758639104L, 146268);
  }
  
  protected void k(Canvas paramCanvas)
  {
    GMTrace.i(19631892856832L, 146269);
    Paint localPaint;
    if (EF(this.iJv) == com.tencent.mm.api.d.eqy)
    {
      float f4 = getResources().getDimension(a.c.tkM);
      float f5 = (getMeasuredWidth() - (int)(this.xAP * 2.0F) - this.xAW.getWidth() - 2.0F * f4 * xBe.length) / xBe.length;
      float f1 = (int)(this.xAP * 2.0F) / 2;
      float f2 = com.tencent.mm.by.a.aC(1.5F);
      float f6 = (ckZ() - f4 * 2.0F) / 2.0F + f4;
      f2 = f1 + f4 + f2;
      int i = 0;
      if (i < xBe.length)
      {
        float f3 = 0.0F;
        if (this.xBg == i)
        {
          f1 = com.tencent.mm.by.a.aC(2.0F);
          this.xBh = false;
        }
        for (;;)
        {
          this.fWp.setColor(-1);
          paramCanvas.drawCircle(f2, f6, com.tencent.mm.by.a.aC(1.5F) + f4 + f1, this.fWp);
          this.fWp.setColor(xBe[i]);
          paramCanvas.drawCircle(f2, f6, f1 + f4, this.fWp);
          f2 += 2.0F * f4 + f5;
          i += 1;
          break;
          f1 = f3;
          if (this.xBh)
          {
            f1 = f3;
            if (i == 2) {
              f1 = com.tencent.mm.by.a.aC(2.0F);
            }
          }
        }
      }
      localPaint = new Paint();
      if (!pT()) {
        break label359;
      }
      localPaint.setAlpha(255);
      if ((!this.xBc) || (!pT())) {
        break label370;
      }
    }
    label359:
    label370:
    for (Bitmap localBitmap = this.xAX;; localBitmap = this.xAW)
    {
      paramCanvas.drawBitmap(localBitmap, getMeasuredWidth() - (int)(this.xAP * 2.0F) / 2 - this.xAW.getWidth(), (ckZ() - this.xAW.getHeight()) / 2, localPaint);
      GMTrace.o(19631892856832L, 146269);
      return;
      localPaint.setAlpha(160);
      break;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(19629611155456L, 146252);
    super.onDraw(paramCanvas);
    paramCanvas.drawColor(0);
    j(paramCanvas);
    GMTrace.o(19629611155456L, 146252);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(19629879590912L, 146254);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = getPaddingLeft();
    int k = getPaddingRight();
    paramInt2 = (int)getResources().getDimension(a.c.tkT);
    paramInt1 = paramInt2;
    if (ckV()) {
      paramInt1 = paramInt2 + ckZ();
    }
    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i - j - k, 1073741824), paramInt1);
    cla();
    GMTrace.o(19629879590912L, 146254);
  }
  
  protected final boolean pT()
  {
    GMTrace.i(19632027074560L, 146270);
    com.tencent.mm.d.b localb = this.evi.b(clc());
    if (localb == null)
    {
      GMTrace.o(19632027074560L, 146270);
      return false;
    }
    boolean bool = localb.pT();
    GMTrace.o(19632027074560L, 146270);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\view\footer\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */