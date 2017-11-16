package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class ane
  extends com.tencent.mm.bm.a
{
  public LinkedList<b> uBX;
  
  public ane()
  {
    GMTrace.i(15344307535872L, 114324);
    this.uBX = new LinkedList();
    GMTrace.o(15344307535872L, 114324);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15344441753600L, 114325);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 6, this.uBX);
      GMTrace.o(15344441753600L, 114325);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 6, this.uBX);
      GMTrace.o(15344441753600L, 114325);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uBX.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(15344441753600L, 114325);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ane localane = (ane)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15344441753600L, 114325);
        return -1;
      }
      localane.uBX.add(locala.csV());
      GMTrace.o(15344441753600L, 114325);
      return 0;
    }
    GMTrace.o(15344441753600L, 114325);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ane.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */