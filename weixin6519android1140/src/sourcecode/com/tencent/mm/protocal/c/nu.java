package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class nu
  extends com.tencent.mm.bm.a
{
  public LinkedList<Integer> ueA;
  public String uez;
  
  public nu()
  {
    GMTrace.i(4035390210048L, 30066);
    this.ueA = new LinkedList();
    GMTrace.o(4035390210048L, 30066);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4035524427776L, 30067);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uez != null) {
        paramVarArgs.e(1, this.uez);
      }
      paramVarArgs.d(2, 2, this.ueA);
      GMTrace.o(4035524427776L, 30067);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uez == null) {
        break label309;
      }
    }
    label309:
    for (paramInt = b.a.a.b.b.a.f(1, this.uez) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.c(2, 2, this.ueA);
      GMTrace.o(4035524427776L, 30067);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.ueA.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4035524427776L, 30067);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        nu localnu = (nu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4035524427776L, 30067);
          return -1;
        case 1: 
          localnu.uez = locala.yqV.readString();
          GMTrace.o(4035524427776L, 30067);
          return 0;
        }
        localnu.ueA.add(Integer.valueOf(locala.yqV.nj()));
        GMTrace.o(4035524427776L, 30067);
        return 0;
      }
      GMTrace.o(4035524427776L, 30067);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\nu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */