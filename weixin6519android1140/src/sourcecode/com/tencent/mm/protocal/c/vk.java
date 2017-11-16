package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class vk
  extends com.tencent.mm.bm.a
{
  public int unG;
  
  public vk()
  {
    GMTrace.i(3707764736000L, 27625);
    GMTrace.o(3707764736000L, 27625);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3707898953728L, 27626);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).fk(1, this.unG);
      GMTrace.o(3707898953728L, 27626);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.unG);
      GMTrace.o(3707898953728L, 27626);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3707898953728L, 27626);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      vk localvk = (vk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3707898953728L, 27626);
        return -1;
      }
      localvk.unG = locala.yqV.nj();
      GMTrace.o(3707898953728L, 27626);
      return 0;
    }
    GMTrace.o(3707898953728L, 27626);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\vk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */