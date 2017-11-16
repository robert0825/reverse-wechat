package com.tencent.mm.ao;

import com.tencent.gmtrace.GMTrace;

public final class e
{
  public static d a(d paramd)
  {
    GMTrace.i(3518115086336L, 26212);
    if (paramd == null)
    {
      GMTrace.o(3518115086336L, 26212);
      return null;
    }
    if (paramd.II())
    {
      d locald = n.IZ().gr(paramd.gHb);
      if (locald == null)
      {
        GMTrace.o(3518115086336L, 26212);
        return paramd;
      }
      GMTrace.o(3518115086336L, 26212);
      return locald;
    }
    GMTrace.o(3518115086336L, 26212);
    return paramd;
  }
  
  public static boolean b(d paramd)
  {
    GMTrace.i(3518249304064L, 26213);
    if (paramd == null)
    {
      GMTrace.o(3518249304064L, 26213);
      return false;
    }
    int j = paramd.offset;
    int i = paramd.gsL;
    long l = paramd.eSf;
    if (paramd.II())
    {
      paramd = n.IZ().gr(paramd.gHb);
      j = paramd.offset;
      i = paramd.gsL;
      l = paramd.eSf;
    }
    if (i == 0)
    {
      GMTrace.o(3518249304064L, 26213);
      return true;
    }
    if (((j == i) && (i != 0)) || (l != 0L))
    {
      GMTrace.o(3518249304064L, 26213);
      return true;
    }
    GMTrace.o(3518249304064L, 26213);
    return false;
  }
  
  public static String c(d paramd)
  {
    GMTrace.i(3518383521792L, 26214);
    if (paramd == null)
    {
      GMTrace.o(3518383521792L, 26214);
      return "";
    }
    if (paramd.II())
    {
      paramd = n.IZ().gr(paramd.gHb);
      if (paramd == null)
      {
        GMTrace.o(3518383521792L, 26214);
        return "";
      }
      paramd = paramd.gGS;
      GMTrace.o(3518383521792L, 26214);
      return paramd;
    }
    paramd = paramd.gGS;
    GMTrace.o(3518383521792L, 26214);
    return paramd;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */