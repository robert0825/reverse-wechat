package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class arr
  extends com.tencent.mm.bm.a
{
  public String eTJ;
  public String jzv;
  public int uHL;
  public int uHM;
  
  public arr()
  {
    GMTrace.i(18813030498304L, 140168);
    GMTrace.o(18813030498304L, 140168);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18813164716032L, 140169);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eTJ != null) {
        paramVarArgs.e(1, this.eTJ);
      }
      if (this.jzv != null) {
        paramVarArgs.e(2, this.jzv);
      }
      paramVarArgs.fk(3, this.uHL);
      paramVarArgs.fk(4, this.uHM);
      GMTrace.o(18813164716032L, 140169);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eTJ == null) {
        break label396;
      }
    }
    label396:
    for (paramInt = b.a.a.b.b.a.f(1, this.eTJ) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jzv != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jzv);
      }
      paramInt = b.a.a.a.fh(3, this.uHL);
      int j = b.a.a.a.fh(4, this.uHM);
      GMTrace.o(18813164716032L, 140169);
      return i + paramInt + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(18813164716032L, 140169);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        arr localarr = (arr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18813164716032L, 140169);
          return -1;
        case 1: 
          localarr.eTJ = locala.yqV.readString();
          GMTrace.o(18813164716032L, 140169);
          return 0;
        case 2: 
          localarr.jzv = locala.yqV.readString();
          GMTrace.o(18813164716032L, 140169);
          return 0;
        case 3: 
          localarr.uHL = locala.yqV.nj();
          GMTrace.o(18813164716032L, 140169);
          return 0;
        }
        localarr.uHM = locala.yqV.nj();
        GMTrace.o(18813164716032L, 140169);
        return 0;
      }
      GMTrace.o(18813164716032L, 140169);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\arr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */