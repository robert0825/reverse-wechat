package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ec
  extends com.tencent.mm.bm.a
{
  public LinkedList<String> tSJ;
  public int tSK;
  
  public ec()
  {
    GMTrace.i(3742929780736L, 27887);
    this.tSJ = new LinkedList();
    GMTrace.o(3742929780736L, 27887);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3743063998464L, 27888);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.tSJ);
      paramVarArgs.fk(2, this.tSK);
      GMTrace.o(3743063998464L, 27888);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 1, this.tSJ);
      int i = b.a.a.a.fh(2, this.tSK);
      GMTrace.o(3743063998464L, 27888);
      return paramInt + 0 + i;
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
      GMTrace.o(3743063998464L, 27888);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ec localec = (ec)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3743063998464L, 27888);
        return -1;
      case 1: 
        localec.tSJ.add(locala.yqV.readString());
        GMTrace.o(3743063998464L, 27888);
        return 0;
      }
      localec.tSK = locala.yqV.nj();
      GMTrace.o(3743063998464L, 27888);
      return 0;
    }
    GMTrace.o(3743063998464L, 27888);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */