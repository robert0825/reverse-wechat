package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class tr
  extends com.tencent.mm.bm.a
{
  public String ugB;
  public String ugy;
  public String ulv;
  
  public tr()
  {
    GMTrace.i(20969640951808L, 156236);
    GMTrace.o(20969640951808L, 156236);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20969775169536L, 156237);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugy != null) {
        paramVarArgs.e(1, this.ugy);
      }
      if (this.ugB != null) {
        paramVarArgs.e(2, this.ugB);
      }
      if (this.ulv != null) {
        paramVarArgs.e(3, this.ulv);
      }
      GMTrace.o(20969775169536L, 156237);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ugy == null) {
        break label361;
      }
    }
    label361:
    for (int i = b.a.a.b.b.a.f(1, this.ugy) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ugB != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ugB);
      }
      i = paramInt;
      if (this.ulv != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ulv);
      }
      GMTrace.o(20969775169536L, 156237);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(20969775169536L, 156237);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        tr localtr = (tr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(20969775169536L, 156237);
          return -1;
        case 1: 
          localtr.ugy = locala.yqV.readString();
          GMTrace.o(20969775169536L, 156237);
          return 0;
        case 2: 
          localtr.ugB = locala.yqV.readString();
          GMTrace.o(20969775169536L, 156237);
          return 0;
        }
        localtr.ulv = locala.yqV.readString();
        GMTrace.o(20969775169536L, 156237);
        return 0;
      }
      GMTrace.o(20969775169536L, 156237);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\tr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */