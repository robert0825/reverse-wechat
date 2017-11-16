package com.tencent.mm.platformtools;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;

public abstract interface i
{
  public abstract void I(String paramString, boolean paramBoolean);
  
  public abstract b Pl();
  
  public abstract String Pm();
  
  public abstract String Pn();
  
  public abstract String Po();
  
  public abstract String Pp();
  
  public abstract boolean Pq();
  
  public abstract boolean Pr();
  
  public abstract Bitmap Ps();
  
  public abstract void Pt();
  
  public abstract Bitmap a(Bitmap paramBitmap, a parama, String paramString);
  
  public abstract void a(a parama, String paramString);
  
  public static enum a
  {
    static
    {
      GMTrace.i(473922797568L, 3531);
      hiU = new a("NET", 0);
      hiV = new a("DISK", 1);
      hiW = new a[] { hiU, hiV };
      GMTrace.o(473922797568L, 3531);
    }
    
    private a()
    {
      GMTrace.i(473788579840L, 3530);
      GMTrace.o(473788579840L, 3530);
    }
  }
  
  public static abstract interface b
  {
    public abstract Bitmap ne(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */