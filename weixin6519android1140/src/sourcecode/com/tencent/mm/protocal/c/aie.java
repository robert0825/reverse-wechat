package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class aie
  extends com.tencent.mm.bm.a
{
  public String desc;
  public String title;
  public String uxA;
  public String uxz;
  
  public aie()
  {
    GMTrace.i(3700516978688L, 27571);
    GMTrace.o(3700516978688L, 27571);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3700651196416L, 27572);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(2, this.desc);
      }
      if (this.uxz != null) {
        paramVarArgs.e(3, this.uxz);
      }
      if (this.uxA != null) {
        paramVarArgs.e(4, this.uxA);
      }
      GMTrace.o(3700651196416L, 27572);
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label434;
      }
    }
    label434:
    for (int i = b.a.a.b.b.a.f(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.desc);
      }
      i = paramInt;
      if (this.uxz != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uxz);
      }
      paramInt = i;
      if (this.uxA != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uxA);
      }
      GMTrace.o(3700651196416L, 27572);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3700651196416L, 27572);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aie localaie = (aie)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3700651196416L, 27572);
          return -1;
        case 1: 
          localaie.title = locala.yqV.readString();
          GMTrace.o(3700651196416L, 27572);
          return 0;
        case 2: 
          localaie.desc = locala.yqV.readString();
          GMTrace.o(3700651196416L, 27572);
          return 0;
        case 3: 
          localaie.uxz = locala.yqV.readString();
          GMTrace.o(3700651196416L, 27572);
          return 0;
        }
        localaie.uxA = locala.yqV.readString();
        GMTrace.o(3700651196416L, 27572);
        return 0;
      }
      GMTrace.o(3700651196416L, 27572);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */