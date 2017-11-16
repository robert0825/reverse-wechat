package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class hz
  extends com.tencent.mm.bm.a
{
  public int tWX;
  public int tWY;
  public int tWZ;
  public LinkedList<hy> tXa;
  public LinkedList<hy> tXb;
  
  public hz()
  {
    GMTrace.i(13581357678592L, 101189);
    this.tXa = new LinkedList();
    this.tXb = new LinkedList();
    GMTrace.o(13581357678592L, 101189);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13581491896320L, 101190);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tWX);
      paramVarArgs.fk(2, this.tWY);
      paramVarArgs.fk(5, this.tWZ);
      paramVarArgs.d(3, 8, this.tXa);
      paramVarArgs.d(4, 8, this.tXb);
      GMTrace.o(13581491896320L, 101190);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tWX);
      i = b.a.a.a.fh(2, this.tWY);
      int j = b.a.a.a.fh(5, this.tWZ);
      int k = b.a.a.a.c(3, 8, this.tXa);
      int m = b.a.a.a.c(4, 8, this.tXb);
      GMTrace.o(13581491896320L, 101190);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tXa.clear();
      this.tXb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13581491896320L, 101190);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      hz localhz = (hz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13581491896320L, 101190);
        return -1;
      case 1: 
        localhz.tWX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13581491896320L, 101190);
        return 0;
      case 2: 
        localhz.tWY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13581491896320L, 101190);
        return 0;
      case 5: 
        localhz.tWZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13581491896320L, 101190);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new hy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((hy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localhz.tXa.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13581491896320L, 101190);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new hy();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((hy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localhz.tXb.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(13581491896320L, 101190);
      return 0;
    }
    GMTrace.o(13581491896320L, 101190);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\hz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */