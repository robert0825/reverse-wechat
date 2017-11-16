package com.tencent.mm.ui.tools.a;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends a
{
  private int mHeight;
  private String mPC;
  public int mSize;
  private int mWidth;
  public int xkh;
  public int xki;
  public int xkj;
  private a xkk;
  
  private b(String paramString)
  {
    GMTrace.i(2035277627392L, 15164);
    this.mSize = 104857600;
    this.mWidth = 2048;
    this.mHeight = 2048;
    this.xkh = 0;
    this.xki = 0;
    this.xkj = 0;
    this.mPC = paramString;
    GMTrace.o(2035277627392L, 15164);
  }
  
  public static b Xa(String paramString)
  {
    GMTrace.i(2035411845120L, 15165);
    paramString = new b(paramString);
    GMTrace.o(2035411845120L, 15165);
    return paramString;
  }
  
  public final b DZ(int paramInt)
  {
    GMTrace.i(2035546062848L, 15166);
    this.mWidth = paramInt;
    this.mHeight = paramInt;
    GMTrace.o(2035546062848L, 15166);
    return this;
  }
  
  protected final int Vk()
  {
    GMTrace.i(2035814498304L, 15168);
    if (bg.nm(this.mPC)) {
      w.w("MicroMsg.ImageBoundaryCheck", "dz[check image but path is null or nil]");
    }
    this.xkh = e.aY(this.mPC);
    String str = this.mPC;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(str, localOptions);
    this.xki = localOptions.outWidth;
    this.xkj = localOptions.outHeight;
    if (this.xkh <= this.mSize)
    {
      if (this.xkh < 0)
      {
        i = 1;
        if (i == 0) {
          break label217;
        }
      }
    }
    else {
      w.d("MicroMsg.ImageBoundaryCheck", "dz[over size] size = %d", new Object[] { Integer.valueOf(this.xkh) });
    }
    label217:
    for (int i = 0;; i = 1)
    {
      if ((this.xki > this.mWidth) || (this.xkj > this.mHeight))
      {
        w.d("MicroMsg.ImageBoundaryCheck", "dz[over width or height] width = %d, height = %d", new Object[] { Integer.valueOf(this.xki), Integer.valueOf(this.xkj) });
        i = 0;
      }
      if (i != 0)
      {
        w.i("MicroMsg.ImageBoundaryCheck", "dz[status ok]");
        GMTrace.o(2035814498304L, 15168);
        return 0;
        i = 0;
        break;
      }
      GMTrace.o(2035814498304L, 15168);
      return 1;
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(2035680280576L, 15167);
    this.xkk = parama;
    bMV();
    GMTrace.o(2035680280576L, 15167);
  }
  
  protected final void bMV()
  {
    GMTrace.i(2035948716032L, 15169);
    if (this.xkk == null)
    {
      w.w("MicroMsg.ImageBoundaryCheck", "dz[callback is null]");
      GMTrace.o(2035948716032L, 15169);
      return;
    }
    switch (Vk())
    {
    }
    for (;;)
    {
      GMTrace.o(2035948716032L, 15169);
      return;
      this.xkk.a(this);
      GMTrace.o(2035948716032L, 15169);
      return;
      this.xkk.aso();
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
    
    public abstract void aso();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */