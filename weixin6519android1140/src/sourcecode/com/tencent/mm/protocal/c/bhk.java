package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bhk
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public int uTq;
  
  public bhk()
  {
    GMTrace.i(3937411268608L, 29336);
    GMTrace.o(3937411268608L, 29336);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3937545486336L, 29337);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi != null) {
        paramVarArgs.e(1, this.jhi);
      }
      paramVarArgs.fk(2, this.uTq);
      GMTrace.o(3937545486336L, 29337);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jhi == null) {
        break label290;
      }
    }
    label290:
    for (paramInt = b.a.a.b.b.a.f(1, this.jhi) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.uTq);
      GMTrace.o(3937545486336L, 29337);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3937545486336L, 29337);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bhk localbhk = (bhk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3937545486336L, 29337);
          return -1;
        case 1: 
          localbhk.jhi = locala.yqV.readString();
          GMTrace.o(3937545486336L, 29337);
          return 0;
        }
        localbhk.uTq = locala.yqV.nj();
        GMTrace.o(3937545486336L, 29337);
        return 0;
      }
      GMTrace.o(3937545486336L, 29337);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bhk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */