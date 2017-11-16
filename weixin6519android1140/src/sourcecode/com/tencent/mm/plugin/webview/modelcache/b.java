package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  public static enum a
  {
    final int eQl;
    
    static
    {
      GMTrace.i(12350044241920L, 92015);
      rFE = new a("HTTP", 0, 1);
      rFF = new a("HTTPS", 1, 2);
      rFG = new a[] { rFE, rFF };
      GMTrace.o(12350044241920L, 92015);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(12349238935552L, 92009);
      this.eQl = paramInt;
      GMTrace.o(12349238935552L, 92009);
    }
    
    public static String toString(int paramInt)
    {
      GMTrace.i(12349910024192L, 92014);
      String str1;
      if (xu(paramInt))
      {
        str1 = "http";
        if (!xv(paramInt)) {
          break label62;
        }
      }
      label62:
      for (String str2 = "https";; str2 = "-")
      {
        str1 = String.format("[ %s | %s ]", new Object[] { str1, str2 });
        GMTrace.o(12349910024192L, 92014);
        return str1;
        str1 = "-";
        break;
      }
    }
    
    public static boolean xu(int paramInt)
    {
      GMTrace.i(12349373153280L, 92010);
      if ((rFE.eQl & paramInt) > 0)
      {
        GMTrace.o(12349373153280L, 92010);
        return true;
      }
      GMTrace.o(12349373153280L, 92010);
      return false;
    }
    
    public static boolean xv(int paramInt)
    {
      GMTrace.i(12349507371008L, 92011);
      if ((rFF.eQl & paramInt) > 0)
      {
        GMTrace.o(12349507371008L, 92011);
        return true;
      }
      GMTrace.o(12349507371008L, 92011);
      return false;
    }
    
    public static int xw(int paramInt)
    {
      GMTrace.i(12349641588736L, 92012);
      paramInt = rFE.eQl;
      GMTrace.o(12349641588736L, 92012);
      return paramInt | 0x0;
    }
    
    public static int xx(int paramInt)
    {
      GMTrace.i(12349775806464L, 92013);
      int i = rFF.eQl;
      GMTrace.o(12349775806464L, 92013);
      return i | paramInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */