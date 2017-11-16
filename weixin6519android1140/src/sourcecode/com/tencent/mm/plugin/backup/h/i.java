package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class i
  extends com.tencent.mm.bm.a
{
  public LinkedList<String> jhe;
  public LinkedList<Long> jhf;
  
  public i()
  {
    GMTrace.i(14836293435392L, 110539);
    this.jhe = new LinkedList();
    this.jhf = new LinkedList();
    GMTrace.o(14836293435392L, 110539);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14836427653120L, 110540);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.jhe);
      paramVarArgs.d(2, 3, this.jhf);
      GMTrace.o(14836427653120L, 110540);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 1, this.jhe);
      int i = b.a.a.a.c(2, 3, this.jhf);
      GMTrace.o(14836427653120L, 110540);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jhe.clear();
      this.jhf.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(14836427653120L, 110540);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      i locali = (i)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14836427653120L, 110540);
        return -1;
      case 1: 
        locali.jhe.add(locala.yqV.readString());
        GMTrace.o(14836427653120L, 110540);
        return 0;
      }
      locali.jhf.add(Long.valueOf(locala.yqV.nk()));
      GMTrace.o(14836427653120L, 110540);
      return 0;
    }
    GMTrace.o(14836427653120L, 110540);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */