package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aze
  extends com.tencent.mm.bm.a
{
  public int tqo;
  public int uJY;
  public int uNv;
  public int uNx;
  
  public aze()
  {
    GMTrace.i(3755009376256L, 27977);
    GMTrace.o(3755009376256L, 27977);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3755143593984L, 27978);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uJY);
      paramVarArgs.fk(2, this.uNx);
      paramVarArgs.fk(3, this.uNv);
      paramVarArgs.fk(4, this.tqo);
      GMTrace.o(3755143593984L, 27978);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uJY);
      int i = b.a.a.a.fh(2, this.uNx);
      int j = b.a.a.a.fh(3, this.uNv);
      int k = b.a.a.a.fh(4, this.tqo);
      GMTrace.o(3755143593984L, 27978);
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
      GMTrace.o(3755143593984L, 27978);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      aze localaze = (aze)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3755143593984L, 27978);
        return -1;
      case 1: 
        localaze.uJY = locala.yqV.nj();
        GMTrace.o(3755143593984L, 27978);
        return 0;
      case 2: 
        localaze.uNx = locala.yqV.nj();
        GMTrace.o(3755143593984L, 27978);
        return 0;
      case 3: 
        localaze.uNv = locala.yqV.nj();
        GMTrace.o(3755143593984L, 27978);
        return 0;
      }
      localaze.tqo = locala.yqV.nj();
      GMTrace.o(3755143593984L, 27978);
      return 0;
    }
    GMTrace.o(3755143593984L, 27978);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */