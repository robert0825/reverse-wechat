package com.tencent.mm.d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.cache.g;
import com.tencent.mm.cache.g.1;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.t.d;
import com.tencent.mm.t.d.a;
import com.tencent.mm.t.d.b;
import java.util.HashMap;
import java.util.LinkedList;

public final class f
  extends b<g>
{
  private float XR;
  private float XS;
  private boolean evN;
  private float evO;
  private float evP;
  private LinkedList<d.b> ewA;
  public int ewB;
  private boolean ewl;
  private Bitmap ewz;
  private Path mf;
  
  public f()
  {
    GMTrace.i(19658333749248L, 146466);
    this.ewl = true;
    this.evN = false;
    this.mf = new Path();
    this.ewA = new LinkedList();
    this.ewB = d.a.fWK;
    GMTrace.o(19658333749248L, 146466);
  }
  
  public final void au(boolean paramBoolean)
  {
    GMTrace.i(19659139055616L, 146472);
    super.au(paramBoolean);
    g localg = (g)pP();
    Bitmap localBitmap = pU().copy(Bitmap.Config.ARGB_8888, true);
    String str1 = a.evd.toString();
    str1 = com.tencent.mm.compatible.util.e.fRY + String.format("%s%d.%s", new Object[] { "wx_photo_edit_", Long.valueOf(System.currentTimeMillis()), str1 });
    w.i("MicroMsg.MosaicCache", "[saveCacheToLocal] path:%s size:%s", new Object[] { str1, Integer.valueOf(localg.aJ(true)) });
    String str2 = (String)localg.fMq.get(localg.aJ(true));
    if (!bg.nm(str2))
    {
      FileOp.deleteFile(str2);
      localg.fMq.remove(localg.aJ(true));
    }
    localg.fMq.put(localg.aJ(true), str1);
    localg.fMr.put(str1, localBitmap);
    com.tencent.mm.sdk.f.e.bRp();
    com.tencent.mm.sdk.f.e.a(new g.1(localg, localBitmap, str1), "[saveCacheToLocal] mosaic path:" + str1);
    GMTrace.o(19659139055616L, 146472);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19658736402432L, 146469);
    super.onDestroy();
    if ((this.ewz != null) && (!this.ewz.isRecycled())) {
      this.ewz.recycle();
    }
    GMTrace.o(19658736402432L, 146469);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(19658870620160L, 146470);
    paramCanvas.save();
    paramCanvas.clipRect(this.evk);
    if (this.ewB == d.a.fWK)
    {
      b(paramCanvas);
      new d(this.ewB, this.mf, 1.0F / getScale(), this.ewz).draw(paramCanvas);
    }
    for (;;)
    {
      paramCanvas.restore();
      GMTrace.o(19658870620160L, 146470);
      return;
      if (this.ewB == d.a.fWL)
      {
        new d(this.ewB, new LinkedList(this.ewA), 1.0F / getScale()).draw(new Canvas(pU()));
        b(paramCanvas);
      }
    }
  }
  
  public final a pN()
  {
    GMTrace.i(19658467966976L, 146467);
    a locala = a.evd;
    GMTrace.o(19658467966976L, 146467);
    return locala;
  }
  
  public final void pO()
  {
    GMTrace.i(19659273273344L, 146473);
    if ((pU() != null) && (!pU().isRecycled())) {
      pU().recycle();
    }
    d(((g)pP()).rZ());
    GMTrace.o(19659273273344L, 146473);
  }
  
  public final void pQ()
  {
    GMTrace.i(19658602184704L, 146468);
    super.pQ();
    d(((g)pP()).rZ());
    Bitmap localBitmap2 = this.evi.bNP();
    if (localBitmap2 == null)
    {
      w.e("MicroMsg.MosaicArtist", "[generateMosaicImage] bitmap is null");
      localBitmap1 = null;
      this.ewz = localBitmap1;
      GMTrace.o(19658602184704L, 146468);
      return;
    }
    int n = localBitmap2.getWidth();
    int i1 = localBitmap2.getHeight();
    int i3 = com.tencent.mm.by.a.aC(18.0F);
    Bitmap localBitmap1 = Bitmap.createBitmap(n, i1, Bitmap.Config.RGB_565);
    Canvas localCanvas = new Canvas(localBitmap1);
    int i4 = (int)Math.ceil(n / i3);
    int i5 = (int)Math.ceil(i1 / i3);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    int i = 0;
    label161:
    int j;
    label169:
    int i6;
    int i7;
    int k;
    if (i < i4)
    {
      j = 0;
      if (j < i5)
      {
        i6 = i3 * i;
        i7 = i3 * j;
        k = i6 + i3;
        if (k <= n) {
          break label284;
        }
        k = n;
      }
    }
    label284:
    for (;;)
    {
      int i2 = i7 + i3;
      int m = i2;
      if (i2 > i1) {
        m = i1;
      }
      i2 = localBitmap2.getPixel(i6, i7);
      Rect localRect = new Rect(i6, i7, k, m);
      localPaint.setColor(i2);
      localCanvas.drawRect(localRect, localPaint);
      j += 1;
      break label169;
      i += 1;
      break label161;
      break;
    }
  }
  
  public final boolean q(MotionEvent paramMotionEvent)
  {
    int j = 0;
    GMTrace.i(19659004837888L, 146471);
    if (!pV())
    {
      GMTrace.o(19659004837888L, 146471);
      return false;
    }
    Object localObject = k(paramMotionEvent.getX(), paramMotionEvent.getY());
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      boolean bool = this.ewl;
      GMTrace.o(19659004837888L, 146471);
      return bool;
      float f1;
      if (this.evk.contains((int)localObject[0], (int)localObject[1]))
      {
        f1 = localObject[0];
        this.evO = f1;
        this.XR = f1;
        f1 = localObject[1];
        this.evP = f1;
        this.XS = f1;
      }
      for (this.ewl = true;; this.ewl = false)
      {
        this.evN = false;
        break;
      }
      if ((this.ewl) && (this.evN))
      {
        if (this.ewB != d.a.fWK) {
          break label285;
        }
        ((g)pP()).a(new d(this.ewB, new Path(this.mf), 1.0F / getScale(), this.ewz));
        au(false);
      }
      for (;;)
      {
        qa();
        this.ewA.clear();
        this.mf.reset();
        this.evN = false;
        this.ewl = false;
        break;
        label285:
        if (this.ewB == d.a.fWL)
        {
          ((g)pP()).a(new d(this.ewB, new LinkedList(this.ewA), 1.0F / getScale()));
          au(false);
        }
      }
      if ((this.ewl) && (this.evN))
      {
        this.evO = this.XR;
        this.evP = this.XS;
        this.XR = localObject[0];
        this.XS = localObject[1];
        if (this.ewB == d.a.fWK) {
          this.mf.quadTo(this.evO, this.evP, (this.XR + this.evO) / 2.0F, (this.XS + this.evP) / 2.0F);
        }
        while (this.ewB != d.a.fWL)
        {
          pZ();
          break;
        }
        double d = Math.toDegrees(Math.atan((this.XR - this.evO) / (this.XS - this.evP)));
        label494:
        float f2;
        float f3;
        float f4;
        if (getRotation() == 180.0F)
        {
          i = 180;
          f1 = (float)(i + d);
          paramMotionEvent = this.ewA;
          f2 = 1.0F / getScale();
          f3 = this.XR;
          f4 = this.XS;
          localObject = this.evi.bNP();
          if ((localObject != null) && (f3 < ((Bitmap)localObject).getWidth()) && (f4 < ((Bitmap)localObject).getHeight()) && (f3 > 0.0F) && (f4 > 0.0F)) {
            break label653;
          }
          w.w("MicroMsg.MosaicArtist", "[getPosColor] X:%s,Y:%s", new Object[] { Float.valueOf(f3), Float.valueOf(f4) });
        }
        label653:
        for (int i = j;; i = ((Bitmap)localObject).getPixel((int)f3, (int)f4))
        {
          paramMotionEvent.add(new d.b(f2, i, f1 % 360.0F, this.XR, this.XS));
          break;
          i = 0;
          break label494;
        }
      }
      if ((this.ewl) && (!this.evN))
      {
        if (this.ewB == d.a.fWK) {
          this.mf.moveTo(localObject[0], localObject[1]);
        }
        this.evN = true;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */