package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class apy
  extends com.tencent.mm.bm.a
{
  public LinkedList<String> uFT;
  public LinkedList<String> uFU;
  public LinkedList<String> uFV;
  public LinkedList<String> uFW;
  
  public apy()
  {
    GMTrace.i(3803730411520L, 28340);
    this.uFT = new LinkedList();
    this.uFU = new LinkedList();
    this.uFV = new LinkedList();
    this.uFW = new LinkedList();
    GMTrace.o(3803730411520L, 28340);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3803864629248L, 28341);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(5, 1, this.uFT);
      paramVarArgs.d(6, 1, this.uFU);
      paramVarArgs.d(7, 1, this.uFV);
      paramVarArgs.d(8, 1, this.uFW);
      GMTrace.o(3803864629248L, 28341);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(5, 1, this.uFT);
      int i = b.a.a.a.c(6, 1, this.uFU);
      int j = b.a.a.a.c(7, 1, this.uFV);
      int k = b.a.a.a.c(8, 1, this.uFW);
      GMTrace.o(3803864629248L, 28341);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uFT.clear();
      this.uFU.clear();
      this.uFV.clear();
      this.uFW.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3803864629248L, 28341);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      apy localapy = (apy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3803864629248L, 28341);
        return -1;
      case 5: 
        localapy.uFT.add(locala.yqV.readString());
        GMTrace.o(3803864629248L, 28341);
        return 0;
      case 6: 
        localapy.uFU.add(locala.yqV.readString());
        GMTrace.o(3803864629248L, 28341);
        return 0;
      case 7: 
        localapy.uFV.add(locala.yqV.readString());
        GMTrace.o(3803864629248L, 28341);
        return 0;
      }
      localapy.uFW.add(locala.yqV.readString());
      GMTrace.o(3803864629248L, 28341);
      return 0;
    }
    GMTrace.o(3803864629248L, 28341);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\apy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */