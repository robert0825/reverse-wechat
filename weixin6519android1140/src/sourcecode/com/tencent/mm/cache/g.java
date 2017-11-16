package com.tencent.mm.cache;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.t.d.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public final class g
  implements d<com.tencent.mm.t.d>
{
  private Stack<com.tencent.mm.t.d> fMi;
  private Stack<com.tencent.mm.t.d> fMj;
  public int fMl;
  public SparseArray<String> fMq;
  public HashMap<String, Bitmap> fMr;
  
  public g()
  {
    GMTrace.i(19613102374912L, 146129);
    GMTrace.o(19613102374912L, 146129);
  }
  
  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
    GMTrace.i(19613773463552L, 146134);
    if (!paramBoolean) {
      if ((this.fMi == null) || (this.fMi.size() <= 0)) {
        break label68;
      }
    }
    label68:
    for (com.tencent.mm.t.d locald = (com.tencent.mm.t.d)this.fMi.peek();; locald = null)
    {
      if ((locald != null) && (locald.ewB == d.a.fWK)) {
        locald.draw(paramCanvas);
      }
      GMTrace.o(19613773463552L, 146134);
      return;
    }
  }
  
  public final void a(com.tencent.mm.t.d paramd)
  {
    GMTrace.i(19614176116736L, 146137);
    if (this.fMi != null) {
      this.fMi.push(paramd);
    }
    GMTrace.o(19614176116736L, 146137);
  }
  
  public final void aI(boolean paramBoolean)
  {
    GMTrace.i(19613505028096L, 146132);
    w.i("MicroMsg.MosaicCache", "[onSave] size:%s", new Object[] { Integer.valueOf(this.fMi.size()) });
    if (this.fMj != null) {
      this.fMj.clear();
    }
    this.fMj = ((Stack)this.fMi.clone());
    if (paramBoolean) {
      this.fMi.clear();
    }
    GMTrace.o(19613505028096L, 146132);
  }
  
  public final int aJ(boolean paramBoolean)
  {
    GMTrace.i(19614310334464L, 146138);
    int i;
    if (paramBoolean)
    {
      if (this.fMi != null)
      {
        i = this.fMi.size();
        GMTrace.o(19614310334464L, 146138);
        return i;
      }
      GMTrace.o(19614310334464L, 146138);
      return 0;
    }
    if (this.fMj != null)
    {
      i = this.fMj.size();
      GMTrace.o(19614310334464L, 146138);
      return i;
    }
    GMTrace.o(19614310334464L, 146138);
    return 0;
  }
  
  public final void c(Canvas paramCanvas)
  {
    GMTrace.i(19613907681280L, 146135);
    Bitmap localBitmap = rZ();
    if ((localBitmap != null) && (!localBitmap.isRecycled())) {
      paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, null);
    }
    GMTrace.o(19613907681280L, 146135);
  }
  
  public final void onCreate()
  {
    GMTrace.i(19613236592640L, 146130);
    w.i("MicroMsg.MosaicCache", "[onCreate]");
    this.fMi = new Stack();
    this.fMq = new SparseArray();
    this.fMr = new HashMap();
    GMTrace.o(19613236592640L, 146130);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19613370810368L, 146131);
    if (this.fMi != null)
    {
      localIterator = this.fMi.iterator();
      while (localIterator.hasNext())
      {
        localIterator.next();
        com.tencent.mm.t.d.clear();
      }
      this.fMi.clear();
    }
    if (this.fMj != null)
    {
      localIterator = this.fMj.iterator();
      while (localIterator.hasNext())
      {
        localIterator.next();
        com.tencent.mm.t.d.clear();
      }
      this.fMj.clear();
    }
    this.fMq.clear();
    Iterator localIterator = this.fMr.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Bitmap localBitmap = (Bitmap)((Map.Entry)localIterator.next()).getValue();
      if ((localBitmap != null) && (!localBitmap.isRecycled())) {
        localBitmap.recycle();
      }
    }
    this.fMr.clear();
    GMTrace.o(19613370810368L, 146131);
  }
  
  public final void pW()
  {
    GMTrace.i(19614444552192L, 146139);
    this.fMl += 1;
    GMTrace.o(19614444552192L, 146139);
  }
  
  public final void rS()
  {
    GMTrace.i(19613639245824L, 146133);
    w.i("MicroMsg.MosaicCache", "[onRestore] size:%s", new Object[] { Integer.valueOf(this.fMi.size()) });
    this.fMi.clear();
    if (this.fMj != null)
    {
      w.i("MicroMsg.MosaicCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.fMj.size()) });
      this.fMi.addAll(this.fMj);
    }
    GMTrace.o(19613639245824L, 146133);
  }
  
  public final Bitmap rZ()
  {
    GMTrace.i(19614041899008L, 146136);
    String str = (String)this.fMq.get(aJ(true));
    if (bg.nm(str))
    {
      w.w("MicroMsg.MosaicCache", "[getCacheFromLocal] path is null");
      GMTrace.o(19614041899008L, 146136);
      return null;
    }
    w.i("MicroMsg.MosaicCache", "[getCacheFromLocal] path:%s size:%s", new Object[] { str, Integer.valueOf(aJ(true)) });
    if (this.fMr.containsKey(str)) {}
    for (Bitmap localBitmap1 = (Bitmap)this.fMr.get(str);; localBitmap1 = null)
    {
      Bitmap localBitmap2;
      if (localBitmap1 != null)
      {
        localBitmap2 = localBitmap1;
        if (!localBitmap1.isRecycled()) {}
      }
      else
      {
        w.i("MicroMsg.MosaicCache", "");
        localBitmap2 = com.tencent.mm.sdk.platformtools.d.RD(str);
        w.i("MicroMsg.MosaicCache", "[getCacheFromLocal] get from local!");
      }
      if (localBitmap2 == null)
      {
        w.e("MicroMsg.MosaicCache", "[getCacheFromLocal] null == bitmap path:%s", new Object[] { str });
        GMTrace.o(19614041899008L, 146136);
        return null;
      }
      localBitmap1 = localBitmap2.copy(Bitmap.Config.ARGB_8888, true);
      localBitmap2.recycle();
      GMTrace.o(19614041899008L, 146136);
      return localBitmap1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\cache\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */