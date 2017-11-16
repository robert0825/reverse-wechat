package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class agg
  extends com.tencent.mm.bm.a
{
  public String ugZ;
  public String uvV;
  public String uvW;
  
  public agg()
  {
    GMTrace.i(3728165830656L, 27777);
    GMTrace.o(3728165830656L, 27777);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3728300048384L, 27778);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugZ != null) {
        paramVarArgs.e(1, this.ugZ);
      }
      if (this.uvV != null) {
        paramVarArgs.e(2, this.uvV);
      }
      if (this.uvW != null) {
        paramVarArgs.e(3, this.uvW);
      }
      GMTrace.o(3728300048384L, 27778);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ugZ == null) {
        break label370;
      }
    }
    label370:
    for (int i = b.a.a.b.b.a.f(1, this.ugZ) + 0;; i = 0)
    {
      paramInt = i;
      if (this.uvV != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uvV);
      }
      i = paramInt;
      if (this.uvW != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uvW);
      }
      GMTrace.o(3728300048384L, 27778);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3728300048384L, 27778);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        agg localagg = (agg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3728300048384L, 27778);
          return -1;
        case 1: 
          localagg.ugZ = locala.yqV.readString();
          GMTrace.o(3728300048384L, 27778);
          return 0;
        case 2: 
          localagg.uvV = locala.yqV.readString();
          GMTrace.o(3728300048384L, 27778);
          return 0;
        }
        localagg.uvW = locala.yqV.readString();
        GMTrace.o(3728300048384L, 27778);
        return 0;
      }
      GMTrace.o(3728300048384L, 27778);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\agg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */