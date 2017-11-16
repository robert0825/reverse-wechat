package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ahz
  extends com.tencent.mm.bm.a
{
  public double gSX;
  public String lOv;
  public int major;
  public int minor;
  
  public ahz()
  {
    GMTrace.i(3966670733312L, 29554);
    GMTrace.o(3966670733312L, 29554);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3966804951040L, 29555);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lOv != null) {
        paramVarArgs.e(1, this.lOv);
      }
      paramVarArgs.fk(2, this.major);
      paramVarArgs.fk(3, this.minor);
      paramVarArgs.a(4, this.gSX);
      GMTrace.o(3966804951040L, 29555);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lOv == null) {
        break label390;
      }
    }
    label390:
    for (paramInt = b.a.a.b.b.a.f(1, this.lOv) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.major);
      int j = b.a.a.a.fh(3, this.minor);
      int k = b.a.a.b.b.a.cK(4);
      GMTrace.o(3966804951040L, 29555);
      return paramInt + i + j + (k + 8);
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3966804951040L, 29555);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ahz localahz = (ahz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3966804951040L, 29555);
          return -1;
        case 1: 
          localahz.lOv = locala.yqV.readString();
          GMTrace.o(3966804951040L, 29555);
          return 0;
        case 2: 
          localahz.major = locala.yqV.nj();
          GMTrace.o(3966804951040L, 29555);
          return 0;
        case 3: 
          localahz.minor = locala.yqV.nj();
          GMTrace.o(3966804951040L, 29555);
          return 0;
        }
        localahz.gSX = locala.yqV.readDouble();
        GMTrace.o(3966804951040L, 29555);
        return 0;
      }
      GMTrace.o(3966804951040L, 29555);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ahz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */