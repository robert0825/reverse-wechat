package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bte
  extends com.tencent.mm.bm.a
{
  public int tNf;
  public String ulE;
  public boolean vbZ;
  public String vbv;
  
  public bte()
  {
    GMTrace.i(3656761999360L, 27245);
    GMTrace.o(3656761999360L, 27245);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3656896217088L, 27246);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbv == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.ulE == null) {
        throw new b("Not all required fields were included: Text");
      }
      if (this.vbv != null) {
        paramVarArgs.e(1, this.vbv);
      }
      if (this.ulE != null) {
        paramVarArgs.e(2, this.ulE);
      }
      paramVarArgs.ah(3, this.vbZ);
      paramVarArgs.fk(4, this.tNf);
      GMTrace.o(3656896217088L, 27246);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbv == null) {
        break label467;
      }
    }
    label467:
    for (paramInt = b.a.a.b.b.a.f(1, this.vbv) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.ulE != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.ulE);
      }
      paramInt = b.a.a.b.b.a.cK(3);
      int j = b.a.a.a.fh(4, this.tNf);
      GMTrace.o(3656896217088L, 27246);
      return i + (paramInt + 1) + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.vbv == null) {
          throw new b("Not all required fields were included: Talker");
        }
        if (this.ulE == null) {
          throw new b("Not all required fields were included: Text");
        }
        GMTrace.o(3656896217088L, 27246);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bte localbte = (bte)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3656896217088L, 27246);
          return -1;
        case 1: 
          localbte.vbv = locala.yqV.readString();
          GMTrace.o(3656896217088L, 27246);
          return 0;
        case 2: 
          localbte.ulE = locala.yqV.readString();
          GMTrace.o(3656896217088L, 27246);
          return 0;
        case 3: 
          localbte.vbZ = locala.csU();
          GMTrace.o(3656896217088L, 27246);
          return 0;
        }
        localbte.tNf = locala.yqV.nj();
        GMTrace.o(3656896217088L, 27246);
        return 0;
      }
      GMTrace.o(3656896217088L, 27246);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */