package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bhl
  extends com.tencent.mm.bm.a
{
  public String content;
  public String type;
  
  public bhl()
  {
    GMTrace.i(4024921227264L, 29988);
    GMTrace.o(4024921227264L, 29988);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4025055444992L, 29989);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.type == null) {
        throw new b("Not all required fields were included: type");
      }
      if (this.type != null) {
        paramVarArgs.e(1, this.type);
      }
      if (this.content != null) {
        paramVarArgs.e(2, this.content);
      }
      GMTrace.o(4025055444992L, 29989);
      return 0;
    }
    if (paramInt == 1) {
      if (this.type == null) {
        break label342;
      }
    }
    label342:
    for (paramInt = b.a.a.b.b.a.f(1, this.type) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.content != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.content);
      }
      GMTrace.o(4025055444992L, 29989);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.type == null) {
          throw new b("Not all required fields were included: type");
        }
        GMTrace.o(4025055444992L, 29989);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bhl localbhl = (bhl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4025055444992L, 29989);
          return -1;
        case 1: 
          localbhl.type = locala.yqV.readString();
          GMTrace.o(4025055444992L, 29989);
          return 0;
        }
        localbhl.content = locala.yqV.readString();
        GMTrace.o(4025055444992L, 29989);
        return 0;
      }
      GMTrace.o(4025055444992L, 29989);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bhl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */