package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class azs
  extends com.tencent.mm.bm.a
{
  public String lPi;
  public int nFd;
  public String tSz;
  public String ufG;
  
  public azs()
  {
    GMTrace.i(13168235511808L, 98111);
    GMTrace.o(13168235511808L, 98111);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13168369729536L, 98112);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPi != null) {
        paramVarArgs.e(1, this.lPi);
      }
      if (this.ufG != null) {
        paramVarArgs.e(2, this.ufG);
      }
      if (this.tSz != null) {
        paramVarArgs.e(3, this.tSz);
      }
      paramVarArgs.fk(4, this.nFd);
      GMTrace.o(13168369729536L, 98112);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPi == null) {
        break label408;
      }
    }
    label408:
    for (int i = b.a.a.b.b.a.f(1, this.lPi) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ufG != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ufG);
      }
      i = paramInt;
      if (this.tSz != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tSz);
      }
      paramInt = b.a.a.a.fh(4, this.nFd);
      GMTrace.o(13168369729536L, 98112);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13168369729536L, 98112);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        azs localazs = (azs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13168369729536L, 98112);
          return -1;
        case 1: 
          localazs.lPi = locala.yqV.readString();
          GMTrace.o(13168369729536L, 98112);
          return 0;
        case 2: 
          localazs.ufG = locala.yqV.readString();
          GMTrace.o(13168369729536L, 98112);
          return 0;
        case 3: 
          localazs.tSz = locala.yqV.readString();
          GMTrace.o(13168369729536L, 98112);
          return 0;
        }
        localazs.nFd = locala.yqV.nj();
        GMTrace.o(13168369729536L, 98112);
        return 0;
      }
      GMTrace.o(13168369729536L, 98112);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\azs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */