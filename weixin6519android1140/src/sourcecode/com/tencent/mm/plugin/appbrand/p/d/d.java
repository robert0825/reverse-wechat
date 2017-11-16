package com.tencent.mm.plugin.appbrand.p.d;

import com.tencent.gmtrace.GMTrace;
import java.nio.ByteBuffer;

public abstract interface d
{
  public abstract ByteBuffer abO();
  
  public abstract boolean abP();
  
  public abstract boolean abQ();
  
  public abstract a abR();
  
  public abstract void e(d paramd);
  
  public static enum a
  {
    static
    {
      GMTrace.i(10167395549184L, 75753);
      iIj = new a("CONTINUOUS", 0);
      iIk = new a("TEXT", 1);
      iIl = new a("BINARY", 2);
      iIm = new a("PING", 3);
      iIn = new a("PONG", 4);
      iIo = new a("CLOSING", 5);
      iIp = new a[] { iIj, iIk, iIl, iIm, iIn, iIo };
      GMTrace.o(10167395549184L, 75753);
    }
    
    private a()
    {
      GMTrace.i(10167261331456L, 75752);
      GMTrace.o(10167261331456L, 75752);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\p\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */