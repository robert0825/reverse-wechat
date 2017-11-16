package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class j
  extends com.tencent.mm.bm.a
{
  public LinkedList<String> jhe;
  public LinkedList<Long> jhf;
  
  public j()
  {
    GMTrace.i(14835756564480L, 110535);
    this.jhe = new LinkedList();
    this.jhf = new LinkedList();
    GMTrace.o(14835756564480L, 110535);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14835890782208L, 110536);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.jhe);
      paramVarArgs.d(2, 3, this.jhf);
      GMTrace.o(14835890782208L, 110536);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 1, this.jhe);
      int i = b.a.a.a.c(2, 3, this.jhf);
      GMTrace.o(14835890782208L, 110536);
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
      GMTrace.o(14835890782208L, 110536);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      j localj = (j)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14835890782208L, 110536);
        return -1;
      case 1: 
        localj.jhe.add(locala.yqV.readString());
        GMTrace.o(14835890782208L, 110536);
        return 0;
      }
      localj.jhf.add(Long.valueOf(locala.yqV.nk()));
      GMTrace.o(14835890782208L, 110536);
      return 0;
    }
    GMTrace.o(14835890782208L, 110536);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */