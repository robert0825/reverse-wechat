package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aij
  extends com.tencent.mm.bm.a
{
  public int key;
  public int length;
  public long uxL;
  public int uxM;
  
  public aij()
  {
    GMTrace.i(3767625842688L, 28071);
    GMTrace.o(3767625842688L, 28071);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3767760060416L, 28072);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.key);
      paramVarArgs.T(2, this.uxL);
      paramVarArgs.fk(3, this.length);
      paramVarArgs.fk(4, this.uxM);
      GMTrace.o(3767760060416L, 28072);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.key);
      int i = b.a.a.a.S(2, this.uxL);
      int j = b.a.a.a.fh(3, this.length);
      int k = b.a.a.a.fh(4, this.uxM);
      GMTrace.o(3767760060416L, 28072);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3767760060416L, 28072);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aij localaij = (aij)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3767760060416L, 28072);
        return -1;
      case 1: 
        localaij.key = locala.yqV.nj();
        GMTrace.o(3767760060416L, 28072);
        return 0;
      case 2: 
        localaij.uxL = locala.yqV.nk();
        GMTrace.o(3767760060416L, 28072);
        return 0;
      case 3: 
        localaij.length = locala.yqV.nj();
        GMTrace.o(3767760060416L, 28072);
        return 0;
      }
      localaij.uxM = locala.yqV.nj();
      GMTrace.o(3767760060416L, 28072);
      return 0;
    }
    GMTrace.o(3767760060416L, 28072);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aij.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */