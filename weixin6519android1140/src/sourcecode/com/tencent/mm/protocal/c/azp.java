package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class azp
  extends com.tencent.mm.bm.a
{
  public int uNN;
  private boolean uNO;
  public com.tencent.mm.bm.b uNP;
  public boolean uNQ;
  
  public azp()
  {
    GMTrace.i(14028705366016L, 104522);
    GMTrace.o(14028705366016L, 104522);
  }
  
  private azp Ac(int paramInt)
  {
    GMTrace.i(14028839583744L, 104523);
    this.uNN = paramInt;
    this.uNO = true;
    GMTrace.o(14028839583744L, 104523);
    return this;
  }
  
  private azp bOt()
  {
    GMTrace.i(14029510672384L, 104528);
    if (!this.uNO) {
      throw new b.a.a.b("Not all required fields were included (false = not included in message),  iLen:" + this.uNO);
    }
    GMTrace.o(14029510672384L, 104528);
    return this;
  }
  
  public final void a(b.a.a.c.a parama)
  {
    GMTrace.i(14029913325568L, 104531);
    parama.fk(1, this.uNN);
    if (this.uNQ) {
      parama.b(2, this.uNP);
    }
    GMTrace.o(14029913325568L, 104531);
  }
  
  public final boolean a(b.a.a.a.a parama, com.tencent.mm.bm.a parama1, int paramInt)
  {
    GMTrace.i(14030047543296L, 104532);
    parama1 = (azp)parama1;
    boolean bool = true;
    switch (paramInt)
    {
    default: 
      bool = false;
    }
    for (;;)
    {
      GMTrace.o(14030047543296L, 104532);
      return bool;
      parama1.Ac(parama.yqV.nj());
      continue;
      parama1.b(parama.csV());
    }
  }
  
  public final int aYq()
  {
    GMTrace.i(14029644890112L, 104529);
    int j = b.a.a.a.fh(1, this.uNN) + 0;
    int i = j;
    if (this.uNQ) {
      i = j + b.a.a.a.a(2, this.uNP);
    }
    GMTrace.o(14029644890112L, 104529);
    return i + 0;
  }
  
  public final azp b(com.tencent.mm.bm.b paramb)
  {
    GMTrace.i(14029242236928L, 104526);
    if (paramb == null) {
      be(null);
    }
    this.uNP = paramb;
    this.uNQ = true;
    Ac(this.uNP.tJp.length);
    GMTrace.o(14029242236928L, 104526);
    return this;
  }
  
  public final azp be(byte[] paramArrayOfByte)
  {
    GMTrace.i(14028973801472L, 104524);
    paramArrayOfByte = com.tencent.mm.bm.b.aX(paramArrayOfByte);
    b(paramArrayOfByte);
    Ac(paramArrayOfByte.tJp.length);
    GMTrace.o(14028973801472L, 104524);
    return this;
  }
  
  public final azp bf(byte[] paramArrayOfByte)
  {
    GMTrace.i(14030181761024L, 104533);
    paramArrayOfByte = new b.a.a.a.a(paramArrayOfByte, unknownTagHandler);
    for (int i = a(paramArrayOfByte);; i = a(paramArrayOfByte))
    {
      if (i <= 0)
      {
        paramArrayOfByte = bOt();
        GMTrace.o(14030181761024L, 104533);
        return paramArrayOfByte;
      }
      if (!a(paramArrayOfByte, this, i)) {
        paramArrayOfByte.csW();
      }
    }
  }
  
  public final byte[] toByteArray()
  {
    GMTrace.i(14029779107840L, 104530);
    bOt();
    byte[] arrayOfByte = super.toByteArray();
    GMTrace.o(14029779107840L, 104530);
    return arrayOfByte;
  }
  
  public final String toString()
  {
    GMTrace.i(14029376454656L, 104527);
    String str2 = new StringBuilder(String.valueOf("")).append(getClass().getName()).append("(").toString() + "iLen = " + this.uNN + "   ";
    String str1 = str2;
    if (this.uNQ) {
      str1 = str2 + "Buffer = " + this.uNP + "   ";
    }
    str1 = str1 + ")";
    GMTrace.o(14029376454656L, 104527);
    return str1;
  }
  
  public final azp z(byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(14029108019200L, 104525);
    paramArrayOfByte = com.tencent.mm.bm.b.h(paramArrayOfByte, 0, paramInt);
    b(paramArrayOfByte);
    Ac(paramArrayOfByte.tJp.length);
    GMTrace.o(14029108019200L, 104525);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\azp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */