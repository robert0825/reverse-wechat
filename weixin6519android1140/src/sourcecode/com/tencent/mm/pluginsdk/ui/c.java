package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;

public final class c
  extends j
  implements d.a
{
  a tsL;
  int tsM;
  
  public c(String paramString)
  {
    this(paramString, (byte)0);
    GMTrace.i(933350080512L, 6954);
    GMTrace.o(933350080512L, 6954);
  }
  
  private c(String paramString, byte paramByte)
  {
    super(new a(a.b.bKI()), paramString, false);
    GMTrace.i(933484298240L, 6955);
    this.tsL = ((a)this.nPm);
    GMTrace.o(933484298240L, 6955);
  }
  
  private static final class a
    implements j.a
  {
    public Bitmap jvJ;
    private j.a nPm;
    
    public a(j.a parama)
    {
      GMTrace.i(1223931461632L, 9119);
      this.jvJ = null;
      this.nPm = parama;
      GMTrace.o(1223931461632L, 9119);
    }
    
    public final void a(j paramj)
    {
      GMTrace.i(1224602550272L, 9124);
      if (this.nPm != null) {
        this.nPm.a(paramj);
      }
      GMTrace.o(1224602550272L, 9124);
    }
    
    public final Bitmap b(String paramString, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(1224065679360L, 9120);
      if (this.nPm != null)
      {
        paramString = this.nPm.b(paramString, paramInt1, paramInt2, paramInt3);
        GMTrace.o(1224065679360L, 9120);
        return paramString;
      }
      GMTrace.o(1224065679360L, 9120);
      return null;
    }
    
    public final Bitmap bw(String paramString)
    {
      GMTrace.i(1224199897088L, 9121);
      if (this.nPm != null)
      {
        paramString = this.nPm.bw(paramString);
        GMTrace.o(1224199897088L, 9121);
        return paramString;
      }
      GMTrace.o(1224199897088L, 9121);
      return null;
    }
    
    public final Bitmap bx(String paramString)
    {
      GMTrace.i(1224334114816L, 9122);
      if (this.nPm != null)
      {
        paramString = this.nPm.bx(paramString);
        GMTrace.o(1224334114816L, 9122);
        return paramString;
      }
      GMTrace.o(1224334114816L, 9122);
      return null;
    }
    
    public final Bitmap oT()
    {
      GMTrace.i(1224468332544L, 9123);
      Bitmap localBitmap;
      if ((this.jvJ != null) && (!this.jvJ.isRecycled()))
      {
        localBitmap = this.jvJ;
        GMTrace.o(1224468332544L, 9123);
        return localBitmap;
      }
      if (this.nPm != null)
      {
        localBitmap = this.nPm.oT();
        GMTrace.o(1224468332544L, 9123);
        return localBitmap;
      }
      GMTrace.o(1224468332544L, 9123);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */