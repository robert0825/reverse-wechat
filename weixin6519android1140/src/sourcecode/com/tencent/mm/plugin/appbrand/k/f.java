package com.tencent.mm.plugin.appbrand.k;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.c.a;
import java.util.List;

public abstract interface f
  extends a
{
  public abstract b TL();
  
  public abstract void a(Context paramContext, c paramc, String paramString);
  
  public abstract void a(Context paramContext, String paramString, a parama);
  
  public static enum a
  {
    public final String tag;
    
    static
    {
      GMTrace.i(20074140270592L, 149564);
      izt = new a("CLICK", 0, "1");
      izu = new a("SWIPE", 1, "2");
      izv = new a[] { izt, izu };
      GMTrace.o(20074140270592L, 149564);
    }
    
    private a(String paramString)
    {
      GMTrace.i(20074006052864L, 149563);
      this.tag = paramString;
      GMTrace.o(20074006052864L, 149563);
    }
  }
  
  public static final class b
  {
    public String eLQ;
    public List<f.c> gpU;
    public int izw;
    
    public b()
    {
      GMTrace.i(20075348230144L, 149573);
      GMTrace.o(20075348230144L, 149573);
    }
  }
  
  public static final class c
  {
    public String eCQ;
    public int eVc;
    public int hZb;
    public String izx;
    public String username;
    
    public c()
    {
      GMTrace.i(20074274488320L, 149565);
      GMTrace.o(20074274488320L, 149565);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\k\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */