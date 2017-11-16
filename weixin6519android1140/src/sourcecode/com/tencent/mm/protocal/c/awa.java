package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class awa
  extends com.tencent.mm.bm.a
{
  public String kAX;
  public int uLu;
  public String uja;
  
  public awa()
  {
    GMTrace.i(4014049591296L, 29907);
    GMTrace.o(4014049591296L, 29907);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4014183809024L, 29908);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kAX != null) {
        paramVarArgs.e(1, this.kAX);
      }
      paramVarArgs.fk(2, this.uLu);
      if (this.uja != null) {
        paramVarArgs.e(3, this.uja);
      }
      GMTrace.o(4014183809024L, 29908);
      return 0;
    }
    if (paramInt == 1) {
      if (this.kAX == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = b.a.a.b.b.a.f(1, this.kAX) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.uLu);
      paramInt = i;
      if (this.uja != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uja);
      }
      GMTrace.o(4014183809024L, 29908);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4014183809024L, 29908);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        awa localawa = (awa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4014183809024L, 29908);
          return -1;
        case 1: 
          localawa.kAX = locala.yqV.readString();
          GMTrace.o(4014183809024L, 29908);
          return 0;
        case 2: 
          localawa.uLu = locala.yqV.nj();
          GMTrace.o(4014183809024L, 29908);
          return 0;
        }
        localawa.uja = locala.yqV.readString();
        GMTrace.o(4014183809024L, 29908);
        return 0;
      }
      GMTrace.o(4014183809024L, 29908);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\awa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */