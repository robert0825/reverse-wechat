package com.tencent.mm.plugin.talkroom.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bm.a
{
  public LinkedList<a> qwO;
  
  public b()
  {
    GMTrace.i(5208855805952L, 38809);
    this.qwO = new LinkedList();
    GMTrace.o(5208855805952L, 38809);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(5208990023680L, 38810);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 8, this.qwO);
      GMTrace.o(5208990023680L, 38810);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.qwO);
      GMTrace.o(5208990023680L, 38810);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.qwO.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(5208990023680L, 38810);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(5208990023680L, 38810);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new a();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localb.qwO.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(5208990023680L, 38810);
      return 0;
    }
    GMTrace.o(5208990023680L, 38810);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */