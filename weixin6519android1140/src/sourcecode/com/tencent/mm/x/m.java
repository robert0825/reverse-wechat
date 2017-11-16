package com.tencent.mm.x;

import com.tencent.gmtrace.GMTrace;

public abstract interface m
{
  public abstract int a(f.a parama, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte);
  
  public static final class a
  {
    private static m glK;
    
    static
    {
      GMTrace.i(18729681289216L, 139547);
      glK = null;
      GMTrace.o(18729681289216L, 139547);
    }
    
    public static void a(m paramm)
    {
      GMTrace.i(18729412853760L, 139545);
      glK = paramm;
      GMTrace.o(18729412853760L, 139545);
    }
    
    public static m yz()
    {
      GMTrace.i(18729547071488L, 139546);
      m localm = glK;
      GMTrace.o(18729547071488L, 139546);
      return localm;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\x\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */