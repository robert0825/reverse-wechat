package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aof
  extends com.tencent.mm.bm.a
{
  public String mVJ;
  public LinkedList<String> uEg;
  
  public aof()
  {
    GMTrace.i(18666867392512L, 139079);
    this.uEg = new LinkedList();
    GMTrace.o(18666867392512L, 139079);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18667001610240L, 139080);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.mVJ != null) {
        paramVarArgs.e(1, this.mVJ);
      }
      paramVarArgs.d(2, 1, this.uEg);
      GMTrace.o(18667001610240L, 139080);
      return 0;
    }
    if (paramInt == 1) {
      if (this.mVJ == null) {
        break label298;
      }
    }
    label298:
    for (paramInt = b.a.a.b.b.a.f(1, this.mVJ) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.c(2, 1, this.uEg);
      GMTrace.o(18667001610240L, 139080);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.uEg.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(18667001610240L, 139080);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        aof localaof = (aof)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(18667001610240L, 139080);
          return -1;
        case 1: 
          localaof.mVJ = locala.yqV.readString();
          GMTrace.o(18667001610240L, 139080);
          return 0;
        }
        localaof.uEg.add(locala.yqV.readString());
        GMTrace.o(18667001610240L, 139080);
        return 0;
      }
      GMTrace.o(18667001610240L, 139080);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aof.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */