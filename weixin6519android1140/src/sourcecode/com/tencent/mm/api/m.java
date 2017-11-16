package com.tencent.mm.api;

import android.content.Context;
import android.graphics.Rect;
import com.tencent.gmtrace.GMTrace;

public abstract class m
{
  public static b eqG;
  public a eqF;
  
  public m()
  {
    GMTrace.i(20212652965888L, 150596);
    GMTrace.o(20212652965888L, 150596);
  }
  
  public abstract void a(j paramj);
  
  public void a(a parama)
  {
    GMTrace.i(20213458272256L, 150602);
    this.eqF = parama;
    GMTrace.o(20213458272256L, 150602);
  }
  
  public abstract b ad(Context paramContext);
  
  public abstract void onDestroy();
  
  public abstract boolean os();
  
  public abstract k ot();
  
  public static final class a
  {
    public int eqH;
    public boolean eqI;
    public boolean eqJ;
    public String path;
    public Rect rect;
    
    public a(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2, Rect paramRect)
    {
      GMTrace.i(20210505482240L, 150580);
      this.eqH = paramInt;
      this.path = paramString;
      this.eqI = paramBoolean1;
      this.eqJ = paramBoolean2;
      this.rect = paramRect;
      GMTrace.o(20210505482240L, 150580);
    }
    
    public static final class a
    {
      public int eqH;
      public boolean eqI;
      public boolean eqK;
      public Rect eqL;
      public String path;
      
      public a()
      {
        GMTrace.i(20209029087232L, 150569);
        this.eqK = true;
        GMTrace.o(20209029087232L, 150569);
      }
      
      public final m.a oG()
      {
        GMTrace.i(20209163304960L, 150570);
        m.a locala = new m.a(this.path, this.eqH, this.eqI, this.eqK, this.eqL);
        GMTrace.o(20209163304960L, 150570);
        return locala;
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract m ou();
  }
  
  public static enum c
  {
    static
    {
      GMTrace.i(20209834393600L, 150575);
      eqM = 1;
      eqN = 2;
      eqO = new int[] { eqM, eqN };
      GMTrace.o(20209834393600L, 150575);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\api\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */