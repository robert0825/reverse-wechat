package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aau
  extends com.tencent.mm.bm.a
{
  public LinkedList<aat> urs;
  public aas urt;
  
  public aau()
  {
    GMTrace.i(3681458061312L, 27429);
    this.urs = new LinkedList();
    GMTrace.o(3681458061312L, 27429);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3681592279040L, 27430);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.urs);
      if (this.urt != null)
      {
        paramVarArgs.fm(2, this.urt.aYq());
        this.urt.a(paramVarArgs);
      }
      GMTrace.o(3681592279040L, 27430);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.urs) + 0;
      paramInt = i;
      if (this.urt != null) {
        paramInt = i + b.a.a.a.fj(2, this.urt.aYq());
      }
      GMTrace.o(3681592279040L, 27430);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.urs.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3681592279040L, 27430);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aau localaau = (aau)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3681592279040L, 27430);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aat();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aat)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localaau.urs.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3681592279040L, 27430);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new aas();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((aas)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localaau.urt = ((aas)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3681592279040L, 27430);
      return 0;
    }
    GMTrace.o(3681592279040L, 27430);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aau.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */