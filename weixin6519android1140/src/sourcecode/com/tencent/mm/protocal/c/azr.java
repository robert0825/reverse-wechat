package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class azr
  extends com.tencent.mm.bm.a
{
  public int uNT;
  private boolean uNU;
  
  public azr()
  {
    GMTrace.i(14030584414208L, 104536);
    GMTrace.o(14030584414208L, 104536);
  }
  
  private azr bOu()
  {
    GMTrace.i(14030987067392L, 104539);
    if (!this.uNU) {
      throw new b("Not all required fields were included (false = not included in message),  uiVal:" + this.uNU);
    }
    GMTrace.o(14030987067392L, 104539);
    return this;
  }
  
  public final azr Ad(int paramInt)
  {
    GMTrace.i(14030718631936L, 104537);
    this.uNT = paramInt;
    this.uNU = true;
    GMTrace.o(14030718631936L, 104537);
    return this;
  }
  
  public final void a(b.a.a.c.a parama)
  {
    GMTrace.i(14031389720576L, 104542);
    parama.fk(1, this.uNT);
    GMTrace.o(14031389720576L, 104542);
  }
  
  public final boolean a(b.a.a.a.a parama, com.tencent.mm.bm.a parama1, int paramInt)
  {
    GMTrace.i(14031523938304L, 104543);
    parama1 = (azr)parama1;
    boolean bool = true;
    switch (paramInt)
    {
    default: 
      bool = false;
    }
    for (;;)
    {
      GMTrace.o(14031523938304L, 104543);
      return bool;
      parama1.Ad(parama.yqV.nj());
    }
  }
  
  public final int aYq()
  {
    GMTrace.i(14031121285120L, 104540);
    int i = b.a.a.a.fh(1, this.uNT);
    GMTrace.o(14031121285120L, 104540);
    return i + 0 + 0;
  }
  
  public final byte[] toByteArray()
  {
    GMTrace.i(14031255502848L, 104541);
    bOu();
    byte[] arrayOfByte = super.toByteArray();
    GMTrace.o(14031255502848L, 104541);
    return arrayOfByte;
  }
  
  public final String toString()
  {
    GMTrace.i(14030852849664L, 104538);
    String str = new StringBuilder(String.valueOf(new StringBuilder(String.valueOf("")).append(getClass().getName()).append("(").toString())).append("uiVal = ").append(this.uNT).append("   ").toString() + ")";
    GMTrace.o(14030852849664L, 104538);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\azr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */