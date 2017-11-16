package com.tencent.mm.ui.chatting.gallery;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager.e;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

final class e
  implements ViewPager.e
{
  private static int mScreenHeight;
  private static int mScreenWidth;
  private static long wLW;
  public ae ghS;
  private ar gxv;
  SparseArray<WeakReference<ImageView>> lDX;
  public HashMap<String, Integer> lDY;
  SparseArray<String> lDZ;
  public SparseArray<Bitmap> lEa;
  protected com.tencent.mm.a.f<String, Bitmap> lEb;
  protected SparseIntArray lEc;
  public boolean lEe;
  private int lEi;
  LinkedList<String> sp;
  public a wLU;
  protected com.tencent.mm.a.f<Integer, Bitmap> wLV;
  public LinkedList<Integer> wLX;
  private int xl;
  
  static
  {
    GMTrace.i(2430683054080L, 18110);
    mScreenWidth = 0;
    mScreenHeight = 0;
    wLW = 0L;
    GMTrace.o(2430683054080L, 18110);
  }
  
  public e(a parama)
  {
    GMTrace.i(2427864481792L, 18089);
    this.gxv = new ar(1, "chatting-image-gallery-lazy-loader");
    this.lDX = new SparseArray();
    this.lDY = new HashMap();
    this.lDZ = new SparseArray();
    this.lEa = new SparseArray();
    this.xl = 0;
    this.lEi = -1;
    this.wLV = new com.tencent.mm.a.f(40, new f.b() {});
    this.lEb = new com.tencent.mm.a.f(5, new f.b() {});
    this.wLX = new LinkedList();
    this.lEc = new SparseIntArray();
    this.sp = new LinkedList();
    this.ghS = new ae();
    this.lEe = false;
    this.wLU = parama;
    GMTrace.o(2427864481792L, 18089);
  }
  
  private void ov(final int paramInt)
  {
    GMTrace.i(2428401352704L, 18093);
    if (this.wLV.ba(Integer.valueOf(paramInt)))
    {
      GMTrace.o(2428401352704L, 18093);
      return;
    }
    at.xB().h(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2446520745984L, 18228);
        if (e.this.wLU == null)
        {
          w.e("MicroMsg.ImageGalleryLazyLoader", "loader is null!");
          GMTrace.o(2446520745984L, 18228);
          return;
        }
        final Bitmap localBitmap = e.this.wLU.Dr(paramInt);
        if (localBitmap == null)
        {
          GMTrace.o(2446520745984L, 18228);
          return;
        }
        e.this.ghS.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2445581221888L, 18221);
            e.this.wLV.put(Integer.valueOf(e.5.this.jN), localBitmap);
            GMTrace.o(2445581221888L, 18221);
          }
        });
        GMTrace.o(2446520745984L, 18228);
      }
    }, 300L);
    GMTrace.o(2428401352704L, 18093);
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(2428267134976L, 18092);
    if (!((d)this.wLU).wKr.wKt.wKK)
    {
      GMTrace.o(2428267134976L, 18092);
      return;
    }
    if (this.lEi == -1)
    {
      int i = 0;
      if (i == 0) {
        ov(paramInt);
      }
      for (;;)
      {
        i += 1;
        break;
        if ((paramInt + i > paramInt + 3) && (paramInt - i < Math.max(paramInt - 3, 0))) {
          break label144;
        }
        if (paramInt + i <= paramInt + 3) {
          ov(paramInt + i);
        }
        if (paramInt - i >= Math.max(paramInt - 3, 0)) {
          ov(paramInt - i);
        }
      }
    }
    if (this.lEi > paramInt) {
      ov(Math.max(paramInt - 3, 0));
    }
    for (;;)
    {
      label144:
      this.lEi = paramInt;
      GMTrace.o(2428267134976L, 18092);
      return;
      if (this.lEi < paramInt) {
        ov(paramInt + 3);
      }
    }
  }
  
  public final void W(int paramInt)
  {
    int j = 0;
    GMTrace.i(2428132917248L, 18091);
    this.xl = paramInt;
    if (aDA())
    {
      int[] arrayOfInt = new int[this.lEa.size()];
      int i = 0;
      for (;;)
      {
        paramInt = j;
        if (i >= arrayOfInt.length) {
          break;
        }
        arrayOfInt[i] = this.lEa.keyAt(i);
        i += 1;
      }
      while (paramInt < arrayOfInt.length)
      {
        i = arrayOfInt[paramInt];
        a(i, (Bitmap)this.lEa.get(i));
        paramInt += 1;
      }
    }
    GMTrace.o(2428132917248L, 18091);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(2429340876800L, 18100);
    GMTrace.o(2429340876800L, 18100);
  }
  
  public final void a(int paramInt, Bitmap paramBitmap)
  {
    GMTrace.i(2428804005888L, 18096);
    if (this.lDX.get(paramInt) == null)
    {
      GMTrace.o(2428804005888L, 18096);
      return;
    }
    ImageView localImageView = (ImageView)((WeakReference)this.lDX.get(paramInt)).get();
    this.lDZ.get(paramInt);
    this.wLU.c(localImageView, paramBitmap);
    ou(paramInt);
    GMTrace.o(2428804005888L, 18096);
  }
  
  public final boolean aDA()
  {
    GMTrace.i(2428535570432L, 18094);
    if (this.xl == 0)
    {
      GMTrace.o(2428535570432L, 18094);
      return true;
    }
    GMTrace.o(2428535570432L, 18094);
    return false;
  }
  
  public final void aDB()
  {
    GMTrace.i(2429206659072L, 18099);
    if (this.lEe)
    {
      GMTrace.o(2429206659072L, 18099);
      return;
    }
    if (this.sp.size() == 0)
    {
      GMTrace.o(2429206659072L, 18099);
      return;
    }
    final Object localObject = (String)this.sp.removeLast();
    if (!this.lDY.containsKey(localObject))
    {
      GMTrace.o(2429206659072L, 18099);
      return;
    }
    this.lEe = true;
    localObject = new ar.a()
    {
      private Bitmap lEg;
      
      public final boolean Dj()
      {
        GMTrace.i(2483564838912L, 18504);
        if ((e.this.wLU == null) || (TextUtils.isEmpty(localObject)))
        {
          GMTrace.o(2483564838912L, 18504);
          return false;
        }
        try
        {
          this.lEg = e.this.wLU.Ws(localObject);
          GMTrace.o(2483564838912L, 18504);
          return true;
        }
        catch (Exception localException)
        {
          w.w("MicroMsg.ImageGalleryLazyLoader", "try to load Bmp fail: %s", new Object[] { localException.getMessage() });
          this.lEg = null;
          GMTrace.o(2483564838912L, 18504);
        }
        return false;
      }
      
      public final boolean Dk()
      {
        GMTrace.i(2483430621184L, 18503);
        e.this.lEe = false;
        if (e.this.lDY.containsKey(localObject))
        {
          i = ((Integer)e.this.lDY.get(localObject)).intValue();
          if (e.this.aDA()) {
            break label154;
          }
          e.this.lEa.put(i, this.lEg);
        }
        Bitmap localBitmap;
        int j;
        for (;;)
        {
          e.this.t(localObject, this.lEg);
          localBitmap = this.lEg;
          if ((localBitmap != null) && (!localBitmap.isRecycled())) {
            break;
          }
          j = 0;
          w.i("MicroMsg.ImageGalleryLazyLoader", "bmp size : %s", new Object[] { Integer.valueOf(j) });
          this.lEg = null;
          e.this.aDB();
          GMTrace.o(2483430621184L, 18503);
          return false;
          label154:
          e.this.a(i, this.lEg);
        }
        if (Build.VERSION.SDK_INT >= 12) {}
        for (int i = localBitmap.getByteCount();; i = localBitmap.getRowBytes() * localBitmap.getHeight())
        {
          j = i;
          if (i >= 0) {
            break;
          }
          throw new IllegalStateException("Negative size: " + localBitmap);
        }
      }
    };
    this.gxv.c((ar.a)localObject);
    GMTrace.o(2429206659072L, 18099);
  }
  
  final void aDz()
  {
    GMTrace.i(2427998699520L, 18090);
    this.wLV.a(new com.tencent.mm.a.f.a() {});
    this.lEb.a(new com.tencent.mm.a.f.a() {});
    GMTrace.o(2427998699520L, 18090);
  }
  
  public final void am(Map<String, Bitmap> paramMap)
  {
    GMTrace.i(2427730264064L, 18088);
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Bitmap localBitmap = (Bitmap)paramMap.get(str);
      if (localBitmap != null)
      {
        this.lEb.put(str, localBitmap);
        this.wLX.push(Integer.valueOf(localBitmap.hashCode()));
        w.i("MicroMsg.ImageGalleryLazyLoader", "we got one cache from preload : %s %s", new Object[] { str, Integer.valueOf(localBitmap.hashCode()) });
      }
      else
      {
        w.e("MicroMsg.ImageGalleryLazyLoader", "we got one null cache from preload");
      }
    }
    GMTrace.o(2427730264064L, 18088);
  }
  
  public final boolean b(ImageView paramImageView, int paramInt)
  {
    GMTrace.i(2428938223616L, 18097);
    w.i("MicroMsg.ImageGalleryLazyLoader", "loadThumb position %s", new Object[] { Integer.valueOf(paramInt) });
    Bitmap localBitmap = (Bitmap)this.wLV.get(Integer.valueOf(paramInt));
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      this.wLU.c(paramImageView, localBitmap);
      GMTrace.o(2428938223616L, 18097);
      return true;
    }
    GMTrace.o(2428938223616L, 18097);
    return false;
  }
  
  final void ou(int paramInt)
  {
    GMTrace.i(2428669788160L, 18095);
    if (this.lDZ.get(paramInt) != null)
    {
      String str = (String)this.lDZ.get(paramInt);
      this.lDX.remove(paramInt);
      this.lDZ.remove(paramInt);
      this.lDY.remove(str);
      this.lEa.remove(paramInt);
    }
    GMTrace.o(2428669788160L, 18095);
  }
  
  protected final void t(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(2427596046336L, 18087);
    if (paramBitmap != null)
    {
      long l1 = paramBitmap.getWidth();
      long l2 = paramBitmap.getHeight();
      if ((mScreenHeight == 0) || (mScreenWidth == 0))
      {
        mScreenWidth = ab.getContext().getResources().getDisplayMetrics().widthPixels;
        mScreenHeight = ab.getContext().getResources().getDisplayMetrics().heightPixels;
        wLW = mScreenWidth * wLW;
      }
      if (l1 * l2 <= wLW * 2L) {}
    }
    for (int i = 1; i != 0; i = 0)
    {
      w.i("MicroMsg.ImageGalleryLazyLoader", "file %s too big to cache");
      GMTrace.o(2427596046336L, 18087);
      return;
    }
    this.lEb.m(paramString, paramBitmap);
    if (f.a.wMd.lEb.ba(paramString))
    {
      w.i("MicroMsg.ImageGalleryLazyLoader", "update origCache and preload cache");
      try
      {
        f.a.wMd.lEb.m(paramString, paramBitmap);
        GMTrace.o(2427596046336L, 18087);
        return;
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.ImageGalleryLazyLoader", paramString, "update preload cache failed", new Object[0]);
      }
    }
    GMTrace.o(2427596046336L, 18087);
  }
  
  public static abstract interface a
  {
    public abstract Bitmap Dr(int paramInt);
    
    public abstract Bitmap Ws(String paramString);
    
    public abstract void c(ImageView paramImageView, Bitmap paramBitmap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */