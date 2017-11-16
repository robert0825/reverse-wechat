package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class bkb
  extends com.tencent.mm.bm.a
{
  public int uUV;
  public int uUW;
  public String uUX;
  public b uUY;
  public int uUZ;
  public int uVa;
  
  public bkb()
  {
    GMTrace.i(3988279787520L, 29715);
    GMTrace.o(3988279787520L, 29715);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3988414005248L, 29716);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uUV);
      paramVarArgs.fk(2, this.uUW);
      if (this.uUX != null) {
        paramVarArgs.e(3, this.uUX);
      }
      if (this.uUY != null) {
        paramVarArgs.b(4, this.uUY);
      }
      paramVarArgs.fk(5, this.uUZ);
      paramVarArgs.fk(6, this.uVa);
      GMTrace.o(3988414005248L, 29716);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uUV) + 0 + b.a.a.a.fh(2, this.uUW);
      paramInt = i;
      if (this.uUX != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uUX);
      }
      i = paramInt;
      if (this.uUY != null) {
        i = paramInt + b.a.a.a.a(4, this.uUY);
      }
      paramInt = b.a.a.a.fh(5, this.uUZ);
      int j = b.a.a.a.fh(6, this.uVa);
      GMTrace.o(3988414005248L, 29716);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3988414005248L, 29716);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bkb localbkb = (bkb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3988414005248L, 29716);
        return -1;
      case 1: 
        localbkb.uUV = locala.yqV.nj();
        GMTrace.o(3988414005248L, 29716);
        return 0;
      case 2: 
        localbkb.uUW = locala.yqV.nj();
        GMTrace.o(3988414005248L, 29716);
        return 0;
      case 3: 
        localbkb.uUX = locala.yqV.readString();
        GMTrace.o(3988414005248L, 29716);
        return 0;
      case 4: 
        localbkb.uUY = locala.csV();
        GMTrace.o(3988414005248L, 29716);
        return 0;
      case 5: 
        localbkb.uUZ = locala.yqV.nj();
        GMTrace.o(3988414005248L, 29716);
        return 0;
      }
      localbkb.uVa = locala.yqV.nj();
      GMTrace.o(3988414005248L, 29716);
      return 0;
    }
    GMTrace.o(3988414005248L, 29716);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bkb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */