package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bru
  extends com.tencent.mm.bm.a
{
  public LinkedList<String> tSJ;
  
  public bru()
  {
    GMTrace.i(3724139298816L, 27747);
    this.tSJ = new LinkedList();
    GMTrace.o(3724139298816L, 27747);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3724273516544L, 27748);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 1, this.tSJ);
      GMTrace.o(3724273516544L, 27748);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 1, this.tSJ);
      GMTrace.o(3724273516544L, 27748);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSJ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3724273516544L, 27748);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bru localbru = (bru)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3724273516544L, 27748);
        return -1;
      }
      localbru.tSJ.add(locala.yqV.readString());
      GMTrace.o(3724273516544L, 27748);
      return 0;
    }
    GMTrace.o(3724273516544L, 27748);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */