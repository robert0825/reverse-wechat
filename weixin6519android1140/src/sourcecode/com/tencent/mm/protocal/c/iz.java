package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class iz
  extends com.tencent.mm.bm.a
{
  public int tYs;
  public LinkedList<Integer> tYt;
  
  public iz()
  {
    GMTrace.i(13583236726784L, 101203);
    this.tYt = new LinkedList();
    GMTrace.o(13583236726784L, 101203);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13583370944512L, 101204);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tYs);
      paramVarArgs.c(2, this.tYt);
      GMTrace.o(13583370944512L, 101204);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tYs);
      int i = b.a.a.a.b(2, this.tYt);
      GMTrace.o(13583370944512L, 101204);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tYt.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13583370944512L, 101204);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      iz localiz = (iz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13583370944512L, 101204);
        return -1;
      case 1: 
        localiz.tYs = locala.yqV.nj();
        GMTrace.o(13583370944512L, 101204);
        return 0;
      }
      localiz.tYt = new b.a.a.a.a(locala.csV().tJp, unknownTagHandler).csS();
      GMTrace.o(13583370944512L, 101204);
      return 0;
    }
    GMTrace.o(13583370944512L, 101204);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\iz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */