package com.tencent.mm.memory;

import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class n
  implements i
{
  private static ConcurrentHashMap<Bitmap, Integer> ghV;
  private boolean DEBUG;
  public Bitmap bitmap;
  private ae ghS;
  private boolean ghT;
  private AtomicInteger ghU;
  private boolean ghW;
  private Runnable ghX;
  private int ghY;
  private int ghZ;
  
  static
  {
    GMTrace.i(1294127333376L, 9642);
    ghV = new ConcurrentHashMap();
    GMTrace.o(1294127333376L, 9642);
  }
  
  private n(Bitmap paramBitmap)
  {
    GMTrace.i(1292248285184L, 9628);
    this.bitmap = null;
    this.DEBUG = false;
    this.ghS = new ae(Looper.getMainLooper());
    this.ghT = false;
    this.ghU = new AtomicInteger();
    this.ghW = true;
    this.ghX = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1280168689664L, 9538);
        n.this.ys();
        GMTrace.o(1280168689664L, 9538);
      }
    };
    this.ghY = 0;
    this.ghZ = 0;
    this.bitmap = paramBitmap;
    this.ghU.set(1);
    if (this.DEBUG) {
      w.i("MicroMsg.ReleasableBitmap", "bitmap " + paramBitmap + " " + this.bitmap.hashCode() + " mm: " + hashCode() + " this: " + this + " " + bg.bQW().toString());
    }
    this.ghT = false;
    getAllocationByteCount();
    GMTrace.o(1292248285184L, 9628);
  }
  
  public static n i(Bitmap paramBitmap)
  {
    GMTrace.i(1292382502912L, 9629);
    if (paramBitmap == null)
    {
      GMTrace.o(1292382502912L, 9629);
      return null;
    }
    paramBitmap = new n(paramBitmap);
    GMTrace.o(1292382502912L, 9629);
    return paramBitmap;
  }
  
  protected final void finalize()
  {
    GMTrace.i(1293724680192L, 9639);
    if (this.DEBUG) {
      w.i("MicroMsg.ReleasableBitmap", "bitmap finalize " + toString());
    }
    GMTrace.o(1293724680192L, 9639);
  }
  
  public final int getAllocationByteCount()
  {
    GMTrace.i(1293456244736L, 9637);
    if (d.eu(19))
    {
      if ((this.bitmap == null) || (this.bitmap.isRecycled()))
      {
        w.i("MicroMsg.ReleasableBitmap", "getByteCount recycle " + this.ghY + " " + toString());
        i = this.ghY;
        GMTrace.o(1293456244736L, 9637);
        return i;
      }
      this.ghY = this.bitmap.getByteCount();
      i = this.ghY;
      GMTrace.o(1293456244736L, 9637);
      return i;
    }
    if ((this.bitmap == null) || (this.bitmap.isRecycled()))
    {
      w.i("MicroMsg.ReleasableBitmap", "getAllocationByteCount recycle " + this.ghZ + " " + toString());
      i = this.ghZ;
      GMTrace.o(1293456244736L, 9637);
      return i;
    }
    this.ghZ = this.bitmap.getAllocationByteCount();
    int i = this.ghZ;
    GMTrace.o(1293456244736L, 9637);
    return i;
  }
  
  public final boolean isRecycled()
  {
    GMTrace.i(1293053591552L, 9634);
    if ((this.ghT) || (this.bitmap == null) || (this.bitmap.isRecycled()))
    {
      GMTrace.o(1293053591552L, 9634);
      return true;
    }
    GMTrace.o(1293053591552L, 9634);
    return false;
  }
  
  public final String toString()
  {
    GMTrace.i(1293590462464L, 9638);
    if (this.DEBUG)
    {
      String str2 = super.toString() + " code: " + hashCode() + " attachCount: " + this.ghU;
      str1 = str2;
      if (this.bitmap != null) {
        str1 = str2 + this.bitmap;
      }
      GMTrace.o(1293590462464L, 9638);
      return str1;
    }
    String str1 = super.toString();
    GMTrace.o(1293590462464L, 9638);
    return str1;
  }
  
  public final void yl()
  {
    GMTrace.i(1292650938368L, 9631);
    this.ghU.incrementAndGet();
    if (this.DEBUG) {
      w.i("MicroMsg.ReleasableBitmap", "addLiveReference, attachCount:" + this.ghU + " bitmap:" + this.bitmap + " " + this + " " + bg.bQW().toString());
    }
    GMTrace.o(1292650938368L, 9631);
  }
  
  public final void ym()
  {
    GMTrace.i(1292785156096L, 9632);
    if (this.DEBUG) {
      w.i("MicroMsg.ReleasableBitmap", "removeLiveReference, attachCount:" + this.ghU + " bitmap:" + this.bitmap + " " + this + " " + bg.bQW().toString());
    }
    if (this.ghU.get() > 0)
    {
      this.ghU.decrementAndGet();
      if (this.ghU.get() < 0)
      {
        GMTrace.o(1292785156096L, 9632);
        return;
      }
      this.ghS.removeCallbacks(this.ghX);
      this.ghS.postDelayed(this.ghX, 500L);
    }
    GMTrace.o(1292785156096L, 9632);
  }
  
  public final Bitmap yp()
  {
    GMTrace.i(1292516720640L, 9630);
    this.ghW = false;
    Bitmap localBitmap = this.bitmap;
    GMTrace.o(1292516720640L, 9630);
    return localBitmap;
  }
  
  public final Bitmap yq()
  {
    GMTrace.i(1292919373824L, 9633);
    if (this.DEBUG) {
      w.i("MicroMsg.ReleasableBitmap", "getBitmapReadOnly " + toString() + " " + bg.bQW().toString());
    }
    Bitmap localBitmap = this.bitmap;
    GMTrace.o(1292919373824L, 9633);
    return localBitmap;
  }
  
  public final boolean yr()
  {
    GMTrace.i(1293187809280L, 9635);
    this.ghU.decrementAndGet();
    if (this.DEBUG) {
      w.i("MicroMsg.ReleasableBitmap", "recycle~:" + this.ghT + " isMutable:" + this.ghW + " bitmap:" + this.bitmap + " " + hashCode() + " attachCount: " + this.ghU + bg.bQW().toString());
    }
    ys();
    GMTrace.o(1293187809280L, 9635);
    return true;
  }
  
  public final boolean ys()
  {
    GMTrace.i(1293322027008L, 9636);
    if (this.DEBUG) {
      w.i("MicroMsg.ReleasableBitmap", "recycleImpl~:" + this.ghT + " isMutable:" + this.ghW + " bitmap:" + this.bitmap + " " + hashCode() + " attachCount: " + this.ghU + bg.bQW().toString());
    }
    if ((this.ghT) || (this.ghU.get() > 0))
    {
      GMTrace.o(1293322027008L, 9636);
      return false;
    }
    this.ghT = true;
    if (this.DEBUG) {
      ghV.remove(this.bitmap);
    }
    if (this.ghW) {
      l.yn().h(this.bitmap);
    }
    GMTrace.o(1293322027008L, 9636);
    return true;
  }
  
  public final String yt()
  {
    GMTrace.i(1293858897920L, 9640);
    String str = this + " " + this.bitmap;
    GMTrace.o(1293858897920L, 9640);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\memory\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */