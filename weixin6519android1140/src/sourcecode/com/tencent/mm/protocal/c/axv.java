package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axv
  extends com.tencent.mm.bm.a
{
  public int uFY;
  public LinkedList<axu> uMt;
  
  public axv()
  {
    GMTrace.i(3857283284992L, 28739);
    this.uMt = new LinkedList();
    GMTrace.o(3857283284992L, 28739);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3857417502720L, 28740);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uFY);
      paramVarArgs.d(2, 8, this.uMt);
      GMTrace.o(3857417502720L, 28740);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uFY);
      i = b.a.a.a.c(2, 8, this.uMt);
      GMTrace.o(3857417502720L, 28740);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uMt.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3857417502720L, 28740);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axv localaxv = (axv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3857417502720L, 28740);
        return -1;
      case 1: 
        localaxv.uFY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3857417502720L, 28740);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axu();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((axu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localaxv.uMt.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3857417502720L, 28740);
      return 0;
    }
    GMTrace.o(3857417502720L, 28740);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\axv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */