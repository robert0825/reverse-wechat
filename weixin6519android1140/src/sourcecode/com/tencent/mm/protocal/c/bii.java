package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bii
  extends com.tencent.mm.bm.a
{
  public int uPP;
  public LinkedList<akw> uPQ;
  
  public bii()
  {
    GMTrace.i(13582699855872L, 101199);
    this.uPQ = new LinkedList();
    GMTrace.o(13582699855872L, 101199);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13582834073600L, 101200);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uPP);
      paramVarArgs.d(2, 8, this.uPQ);
      GMTrace.o(13582834073600L, 101200);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.uPP);
      i = b.a.a.a.c(2, 8, this.uPQ);
      GMTrace.o(13582834073600L, 101200);
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
      GMTrace.o(13582834073600L, 101200);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bii localbii = (bii)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13582834073600L, 101200);
        return -1;
      case 1: 
        localbii.uPP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13582834073600L, 101200);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new akw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((akw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbii.uPQ.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(13582834073600L, 101200);
      return 0;
    }
    GMTrace.o(13582834073600L, 101200);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */