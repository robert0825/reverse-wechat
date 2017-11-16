package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class r
  extends com.tencent.mm.bm.a
{
  public LinkedList<q> mTh;
  
  public r()
  {
    GMTrace.i(5452326764544L, 40623);
    this.mTh = new LinkedList();
    GMTrace.o(5452326764544L, 40623);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(5452460982272L, 40624);
    if (paramInt == 0)
    {
      ((b.a.a.c.a)paramVarArgs[0]).d(1, 8, this.mTh);
      GMTrace.o(5452460982272L, 40624);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.c(1, 8, this.mTh);
      GMTrace.o(5452460982272L, 40624);
      return paramInt + 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.mTh.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(5452460982272L, 40624);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      r localr = (r)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(5452460982272L, 40624);
        return -1;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      int i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new q();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((q)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localr.mTh.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(5452460982272L, 40624);
      return 0;
    }
    GMTrace.o(5452460982272L, 40624);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */