package com.tencent.mm.d;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.tencent.gmtrace.GMTrace;

public final class d
  extends b
{
  private float XR;
  private float XS;
  private boolean evN;
  private float evO;
  private float evP;
  private float ewk;
  private boolean ewl;
  private Path mf;
  public int rz;
  
  public d()
  {
    GMTrace.i(19670681780224L, 146558);
    this.ewl = true;
    this.evN = false;
    this.rz = com.tencent.mm.view.footer.a.xBe[2];
    this.mf = new Path();
    GMTrace.o(19670681780224L, 146558);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(19671218651136L, 146562);
    paramCanvas.save();
    paramCanvas.clipRect(this.evk);
    b(paramCanvas);
    if (!this.mf.isEmpty()) {
      new com.tencent.mm.t.b(this.mf, this.ewk / this.evi.bNO(), this.rz).draw(paramCanvas);
    }
    paramCanvas.restore();
    GMTrace.o(19671218651136L, 146562);
  }
  
  public final a pN()
  {
    GMTrace.i(19670950215680L, 146560);
    a locala = a.evc;
    GMTrace.o(19670950215680L, 146560);
    return locala;
  }
  
  public final void pO()
  {
    GMTrace.i(19671352868864L, 146563);
    au(true);
    GMTrace.o(19671352868864L, 146563);
  }
  
  public final void pQ()
  {
    GMTrace.i(19670815997952L, 146559);
    super.pQ();
    this.ewk = this.evi.bNO();
    GMTrace.o(19670815997952L, 146559);
  }
  
  public final boolean q(MotionEvent paramMotionEvent)
  {
    GMTrace.i(19671084433408L, 146561);
    if (!pV())
    {
      GMTrace.o(19671084433408L, 146561);
      return false;
    }
    float[] arrayOfFloat = k(paramMotionEvent.getX(), paramMotionEvent.getY());
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      boolean bool = this.ewl;
      GMTrace.o(19671084433408L, 146561);
      return bool;
      if (this.evk.contains((int)arrayOfFloat[0], (int)arrayOfFloat[1]))
      {
        float f = arrayOfFloat[0];
        this.evO = f;
        this.XR = f;
        f = arrayOfFloat[1];
        this.evP = f;
        this.XS = f;
      }
      for (this.ewl = true;; this.ewl = false)
      {
        this.evN = false;
        break;
      }
      if ((this.ewl) && (this.evN))
      {
        pP().add(new com.tencent.mm.t.b(new Path(this.mf), this.ewk / this.evi.bNO(), this.rz));
        au(false);
      }
      qa();
      this.mf.reset();
      this.evN = false;
      this.ewl = false;
      continue;
      if ((this.ewl) && (this.evN))
      {
        this.evO = this.XR;
        this.evP = this.XS;
        this.XR = arrayOfFloat[0];
        this.XS = arrayOfFloat[1];
        this.mf.quadTo(this.evO, this.evP, (this.XR + this.evO) / 2.0F, (this.XS + this.evP) / 2.0F);
        pZ();
      }
      else if ((this.ewl) && (!this.evN))
      {
        this.mf.moveTo(arrayOfFloat[0], arrayOfFloat[1]);
        this.evN = true;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */