package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdz
  extends com.tencent.mm.bm.a
{
  public int uPP;
  public LinkedList<bhs> uPQ;
  
  public bdz()
  {
    GMTrace.i(13580820807680L, 101185);
    this.uPQ = new LinkedList();
    GMTrace.o(13580820807680L, 101185);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13580955025408L, 101186);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uPP);
      paramVarArgs.d(2, 8, this.uPQ);
      GMTrace.o(13580955025408L, 101186);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uPP);
      i = b.a.a.a.c(2, 8, this.uPQ);
      GMTrace.o(13580955025408L, 101186);
      return paramInt + 0 + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uPQ.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13580955025408L, 101186);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdz localbdz = (bdz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13580955025408L, 101186);
        return -1;
      case 1: 
        localbdz.uPP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13580955025408L, 101186);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bhs();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bhs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbdz.uPQ.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(13580955025408L, 101186);
      return 0;
    }
    GMTrace.o(13580955025408L, 101186);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bdz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */