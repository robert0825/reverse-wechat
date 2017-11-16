package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bud
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public int tVE;
  public int uBK;
  public int uBL;
  public String uBM;
  public int uyt;
  
  public bud()
  {
    GMTrace.i(15349407809536L, 114362);
    GMTrace.o(15349407809536L, 114362);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15349542027264L, 114363);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uyt);
      paramVarArgs.fk(2, this.tVE);
      paramVarArgs.fk(3, this.tOG);
      if (this.uBM != null) {
        paramVarArgs.e(4, this.uBM);
      }
      paramVarArgs.fk(5, this.uBL);
      paramVarArgs.fk(6, this.uBK);
      GMTrace.o(15349542027264L, 114363);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uyt) + 0 + b.a.a.a.fh(2, this.tVE) + b.a.a.a.fh(3, this.tOG);
      paramInt = i;
      if (this.uBM != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uBM);
      }
      i = b.a.a.a.fh(5, this.uBL);
      int j = b.a.a.a.fh(6, this.uBK);
      GMTrace.o(15349542027264L, 114363);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(15349542027264L, 114363);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bud localbud = (bud)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15349542027264L, 114363);
        return -1;
      case 1: 
        localbud.uyt = locala.yqV.nj();
        GMTrace.o(15349542027264L, 114363);
        return 0;
      case 2: 
        localbud.tVE = locala.yqV.nj();
        GMTrace.o(15349542027264L, 114363);
        return 0;
      case 3: 
        localbud.tOG = locala.yqV.nj();
        GMTrace.o(15349542027264L, 114363);
        return 0;
      case 4: 
        localbud.uBM = locala.yqV.readString();
        GMTrace.o(15349542027264L, 114363);
        return 0;
      case 5: 
        localbud.uBL = locala.yqV.nj();
        GMTrace.o(15349542027264L, 114363);
        return 0;
      }
      localbud.uBK = locala.yqV.nj();
      GMTrace.o(15349542027264L, 114363);
      return 0;
    }
    GMTrace.o(15349542027264L, 114363);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */