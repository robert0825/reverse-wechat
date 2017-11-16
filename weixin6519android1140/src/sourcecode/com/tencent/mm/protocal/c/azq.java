package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class azq
  extends com.tencent.mm.bm.a
{
  public String uNR;
  public boolean uNS;
  
  public azq()
  {
    GMTrace.i(14031926591488L, 104546);
    GMTrace.o(14031926591488L, 104546);
  }
  
  public final azq Rq(String paramString)
  {
    GMTrace.i(14032060809216L, 104547);
    this.uNR = paramString;
    this.uNS = true;
    GMTrace.o(14032060809216L, 104547);
    return this;
  }
  
  public final void a(b.a.a.c.a parama)
  {
    GMTrace.i(14032597680128L, 104551);
    if (this.uNS) {
      parama.e(1, this.uNR);
    }
    GMTrace.o(14032597680128L, 104551);
  }
  
  public final boolean a(b.a.a.a.a parama, com.tencent.mm.bm.a parama1, int paramInt)
  {
    GMTrace.i(14032731897856L, 104552);
    parama1 = (azq)parama1;
    boolean bool = true;
    switch (paramInt)
    {
    default: 
      bool = false;
    }
    for (;;)
    {
      GMTrace.o(14032731897856L, 104552);
      return bool;
      parama1.Rq(parama.yqV.readString());
    }
  }
  
  public final int aYq()
  {
    GMTrace.i(14032329244672L, 104549);
    int i = 0;
    if (this.uNS) {
      i = b.a.a.b.b.a.f(1, this.uNR) + 0;
    }
    GMTrace.o(14032329244672L, 104549);
    return i + 0;
  }
  
  public final byte[] toByteArray()
  {
    GMTrace.i(14032463462400L, 104550);
    byte[] arrayOfByte = super.toByteArray();
    GMTrace.o(14032463462400L, 104550);
    return arrayOfByte;
  }
  
  public final String toString()
  {
    GMTrace.i(14032195026944L, 104548);
    String str = this.uNR;
    GMTrace.o(14032195026944L, 104548);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\azq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */