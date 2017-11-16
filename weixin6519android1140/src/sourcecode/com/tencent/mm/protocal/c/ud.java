package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ud
  extends com.tencent.mm.bm.a
{
  public LinkedList<String> ulO;
  public LinkedList<String> ulP;
  
  public ud()
  {
    GMTrace.i(3892314112000L, 29000);
    this.ulO = new LinkedList();
    this.ulP = new LinkedList();
    GMTrace.o(3892314112000L, 29000);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3892448329728L, 29001);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.ulO);
      paramVarArgs.d(2, 1, this.ulP);
      GMTrace.o(3892448329728L, 29001);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 1, this.ulO);
      int i = b.a.a.a.c(2, 1, this.ulP);
      GMTrace.o(3892448329728L, 29001);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ulO.clear();
      this.ulP.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3892448329728L, 29001);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ud localud = (ud)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3892448329728L, 29001);
        return -1;
      case 1: 
        localud.ulO.add(locala.yqV.readString());
        GMTrace.o(3892448329728L, 29001);
        return 0;
      }
      localud.ulP.add(locala.yqV.readString());
      GMTrace.o(3892448329728L, 29001);
      return 0;
    }
    GMTrace.o(3892448329728L, 29001);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */