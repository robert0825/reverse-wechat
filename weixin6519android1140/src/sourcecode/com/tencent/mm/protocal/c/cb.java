package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class cb
  extends com.tencent.mm.bm.a
{
  public String tQp;
  public LinkedList<bhl> tQq;
  public String title;
  
  public cb()
  {
    GMTrace.i(3868826009600L, 28825);
    this.tQq = new LinkedList();
    GMTrace.o(3868826009600L, 28825);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3868960227328L, 28826);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tQp != null) {
        paramVarArgs.e(1, this.tQp);
      }
      paramVarArgs.d(2, 8, this.tQq);
      if (this.title != null) {
        paramVarArgs.e(3, this.title);
      }
      GMTrace.o(3868960227328L, 28826);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tQp != null) {
        paramInt = b.a.a.b.b.a.f(1, this.tQp) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.tQq);
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.title);
      }
      GMTrace.o(3868960227328L, 28826);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tQq.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3868960227328L, 28826);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      cb localcb = (cb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3868960227328L, 28826);
        return -1;
      case 1: 
        localcb.tQp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3868960227328L, 28826);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhl();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bhl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localcb.tQq.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3868960227328L, 28826);
        return 0;
      }
      localcb.title = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3868960227328L, 28826);
      return 0;
    }
    GMTrace.o(3868960227328L, 28826);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */