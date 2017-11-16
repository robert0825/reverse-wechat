package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class avs
  extends com.tencent.mm.bm.a
{
  public String data;
  public String jzv;
  
  public avs()
  {
    GMTrace.i(18813298933760L, 140170);
    GMTrace.o(18813298933760L, 140170);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18813433151488L, 140171);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jzv != null) {
        paramVarArgs.e(1, this.jzv);
      }
      if (this.data != null) {
        paramVarArgs.e(2, this.data);
      }
      GMTrace.o(18813433151488L, 140171);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jzv == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.jzv) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.data != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.data);
      }
      GMTrace.o(18813433151488L, 140171);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(18813433151488L, 140171);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        avs localavs = (avs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18813433151488L, 140171);
          return -1;
        case 1: 
          localavs.jzv = locala.yqV.readString();
          GMTrace.o(18813433151488L, 140171);
          return 0;
        }
        localavs.data = locala.yqV.readString();
        GMTrace.o(18813433151488L, 140171);
        return 0;
      }
      GMTrace.o(18813433151488L, 140171);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\avs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */