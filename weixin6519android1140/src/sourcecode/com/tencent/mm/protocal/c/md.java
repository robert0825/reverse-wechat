package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class md
  extends com.tencent.mm.bm.a
{
  public b ucU;
  public LinkedList<b> ucV;
  
  public md()
  {
    GMTrace.i(15346186584064L, 114338);
    this.ucV = new LinkedList();
    GMTrace.o(15346186584064L, 114338);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15346320801792L, 114339);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ucU != null) {
        paramVarArgs.b(1, this.ucU);
      }
      paramVarArgs.d(2, 6, this.ucV);
      GMTrace.o(15346320801792L, 114339);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ucU == null) {
        break label292;
      }
    }
    label292:
    for (paramInt = b.a.a.a.a(1, this.ucU) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.c(2, 6, this.ucV);
      GMTrace.o(15346320801792L, 114339);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.ucV.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(15346320801792L, 114339);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        md localmd = (md)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(15346320801792L, 114339);
          return -1;
        case 1: 
          localmd.ucU = locala.csV();
          GMTrace.o(15346320801792L, 114339);
          return 0;
        }
        localmd.ucV.add(locala.csV());
        GMTrace.o(15346320801792L, 114339);
        return 0;
      }
      GMTrace.o(15346320801792L, 114339);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\md.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */