package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xv
  extends com.tencent.mm.bm.a
  implements bed
{
  public int tST;
  public int upl;
  public int upm;
  public int upn;
  public LinkedList<azq> upo;
  
  public xv()
  {
    GMTrace.i(3834332053504L, 28568);
    this.upo = new LinkedList();
    GMTrace.o(3834332053504L, 28568);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3834600488960L, 28570);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tST);
      paramVarArgs.fk(2, this.upl);
      paramVarArgs.fk(3, this.upm);
      paramVarArgs.fk(4, this.upn);
      paramVarArgs.d(5, 8, this.upo);
      GMTrace.o(3834600488960L, 28570);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tST);
      i = b.a.a.a.fh(2, this.upl);
      int j = b.a.a.a.fh(3, this.upm);
      int k = b.a.a.a.fh(4, this.upn);
      int m = b.a.a.a.c(5, 8, this.upo);
      GMTrace.o(3834600488960L, 28570);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.upo.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3834600488960L, 28570);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xv localxv = (xv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3834600488960L, 28570);
        return -1;
      case 1: 
        localxv.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3834600488960L, 28570);
        return 0;
      case 2: 
        localxv.upl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3834600488960L, 28570);
        return 0;
      case 3: 
        localxv.upm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3834600488960L, 28570);
        return 0;
      case 4: 
        localxv.upn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3834600488960L, 28570);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localxv.upo.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3834600488960L, 28570);
      return 0;
    }
    GMTrace.o(3834600488960L, 28570);
    return -1;
  }
  
  public final int getRet()
  {
    GMTrace.i(3834466271232L, 28569);
    int i = this.tST;
    GMTrace.o(3834466271232L, 28569);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\xv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */