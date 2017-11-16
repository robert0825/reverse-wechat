package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ex
  extends com.tencent.mm.bm.a
{
  public LinkedList<String> tSJ;
  
  public ex()
  {
    GMTrace.i(4006264963072L, 29849);
    this.tSJ = new LinkedList();
    GMTrace.o(4006264963072L, 29849);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4006399180800L, 29850);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 1, this.tSJ);
      GMTrace.o(4006399180800L, 29850);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 1, this.tSJ);
      GMTrace.o(4006399180800L, 29850);
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
      GMTrace.o(4006399180800L, 29850);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ex localex = (ex)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4006399180800L, 29850);
        return -1;
      }
      localex.tSJ.add(locala.yqV.readString());
      GMTrace.o(4006399180800L, 29850);
      return 0;
    }
    GMTrace.o(4006399180800L, 29850);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */