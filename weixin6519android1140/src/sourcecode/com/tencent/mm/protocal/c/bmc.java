package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bmc
  extends com.tencent.mm.bm.a
{
  public int tMX;
  public LinkedList<String> uWa;
  
  public bmc()
  {
    GMTrace.i(3794335170560L, 28270);
    this.uWa = new LinkedList();
    GMTrace.o(3794335170560L, 28270);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3794469388288L, 28271);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tMX);
      paramVarArgs.d(2, 1, this.uWa);
      GMTrace.o(3794469388288L, 28271);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tMX);
      int i = b.a.a.a.c(2, 1, this.uWa);
      GMTrace.o(3794469388288L, 28271);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uWa.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3794469388288L, 28271);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bmc localbmc = (bmc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3794469388288L, 28271);
        return -1;
      case 1: 
        localbmc.tMX = locala.yqV.nj();
        GMTrace.o(3794469388288L, 28271);
        return 0;
      }
      localbmc.uWa.add(locala.yqV.readString());
      GMTrace.o(3794469388288L, 28271);
      return 0;
    }
    GMTrace.o(3794469388288L, 28271);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bmc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */