package com.tencent.mm.plugin.gallery.ui;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.a.f.a;
import com.tencent.mm.a.f.b;
import com.tencent.mm.plugin.gallery.model.j;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MultiTouchImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

final class d
{
  private ar gxv;
  SparseArray<WeakReference<MultiTouchImageView>> lDX;
  public HashMap<String, Integer> lDY;
  SparseArray<String> lDZ;
  public SparseArray<Bitmap> lEa;
  protected f<String, Bitmap> lEb;
  protected SparseIntArray lEc;
  public c lEd;
  public boolean lEe;
  LinkedList<String> sp;
  private int xl;
  
  public d(c paramc)
  {
    GMTrace.i(11925647785984L, 88853);
    this.gxv = new ar(1, "album-image-gallery-lazy-loader");
    this.lDX = new SparseArray();
    this.lDY = new HashMap();
    this.lDZ = new SparseArray();
    this.lEa = new SparseArray();
    this.xl = 0;
    this.lEb = new f(5, new f.b() {});
    this.lEc = new SparseIntArray();
    this.sp = new LinkedList();
    this.lEe = false;
    this.lEd = paramc;
    GMTrace.o(11925647785984L, 88853);
  }
  
  public final void W(int paramInt)
  {
    int j = 0;
    GMTrace.i(11925916221440L, 88855);
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
    GMTrace.o(11925916221440L, 88855);
  }
  
  public final void a(int paramInt, Bitmap paramBitmap)
  {
    GMTrace.i(11926318874624L, 88858);
    if (this.lDX.get(paramInt) == null)
    {
      GMTrace.o(11926318874624L, 88858);
      return;
    }
    MultiTouchImageView localMultiTouchImageView = (MultiTouchImageView)((WeakReference)this.lDX.get(paramInt)).get();
    String str = (String)this.lDZ.get(paramInt);
    if ((paramBitmap != null) && (localMultiTouchImageView != null))
    {
      int i = paramBitmap.hashCode();
      int j = this.lEc.indexOfValue(paramInt);
      if (j >= 0) {
        this.lEc.removeAt(j);
      }
      this.lEc.put(i, paramInt);
    }
    this.lEd.lDG.remove(str);
    if ((paramBitmap != null) && (localMultiTouchImageView != null)) {
      c.a(localMultiTouchImageView, paramBitmap);
    }
    ou(paramInt);
    GMTrace.o(11926318874624L, 88858);
  }
  
  public final boolean aDA()
  {
    GMTrace.i(11926050439168L, 88856);
    if (this.xl == 0)
    {
      GMTrace.o(11926050439168L, 88856);
      return true;
    }
    GMTrace.o(11926050439168L, 88856);
    return false;
  }
  
  public final void aDB()
  {
    GMTrace.i(11926453092352L, 88859);
    if (this.lEe)
    {
      GMTrace.o(11926453092352L, 88859);
      return;
    }
    if (this.sp.size() == 0)
    {
      GMTrace.o(11926453092352L, 88859);
      return;
    }
    final Object localObject = (String)this.sp.removeLast();
    if (!this.lDY.containsKey(localObject))
    {
      GMTrace.o(11926453092352L, 88859);
      return;
    }
    this.lEe = true;
    localObject = new ar.a()
    {
      private Bitmap lEg;
      
      public final boolean Dj()
      {
        GMTrace.i(11962155008000L, 89125);
        if ((d.this.lEd == null) || (TextUtils.isEmpty(localObject)))
        {
          GMTrace.o(11962155008000L, 89125);
          return false;
        }
        String str = localObject;
        long l = bg.Pw();
        Bitmap localBitmap = j.zg(str);
        w.v("MicroMsg.ImageAdapter", "test decode: %d filePath:%s", new Object[] { Long.valueOf(bg.aI(l)), str });
        this.lEg = localBitmap;
        GMTrace.o(11962155008000L, 89125);
        return true;
      }
      
      public final boolean Dk()
      {
        GMTrace.i(11962020790272L, 89124);
        d.this.lEe = false;
        int i;
        if (d.this.lDY.containsKey(localObject))
        {
          i = ((Integer)d.this.lDY.get(localObject)).intValue();
          if (d.this.aDA()) {
            break label119;
          }
          d.this.lEa.put(i, this.lEg);
        }
        for (;;)
        {
          d.this.lEb.m(localObject, this.lEg);
          this.lEg = null;
          d.this.aDB();
          GMTrace.o(11962020790272L, 89124);
          return false;
          label119:
          d.this.a(i, this.lEg);
        }
      }
    };
    this.gxv.c((ar.a)localObject);
    GMTrace.o(11926453092352L, 88859);
  }
  
  final void aDz()
  {
    GMTrace.i(11925782003712L, 88854);
    this.lEb.a(new f.a() {});
    GMTrace.o(11925782003712L, 88854);
  }
  
  final void ou(int paramInt)
  {
    GMTrace.i(11926184656896L, 88857);
    if (this.lDZ.get(paramInt) != null)
    {
      String str = (String)this.lDZ.get(paramInt);
      this.lDX.remove(paramInt);
      this.lDZ.remove(paramInt);
      this.lDY.remove(str);
      this.lEa.remove(paramInt);
    }
    GMTrace.o(11926184656896L, 88857);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */