package com.tencent.mm.plugin.product.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class f
  extends com.tencent.mm.bm.a
{
  public j nIG;
  public String nIH;
  
  public f()
  {
    GMTrace.i(6039395106816L, 44997);
    GMTrace.o(6039395106816L, 44997);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6039529324544L, 44998);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nIG != null)
      {
        paramVarArgs.fm(1, this.nIG.aYq());
        this.nIG.a(paramVarArgs);
      }
      if (this.nIH != null) {
        paramVarArgs.e(2, this.nIH);
      }
      GMTrace.o(6039529324544L, 44998);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.nIG != null) {
        paramInt = b.a.a.a.fj(1, this.nIG.aYq()) + 0;
      }
      i = paramInt;
      if (this.nIH != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.nIH);
      }
      GMTrace.o(6039529324544L, 44998);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(6039529324544L, 44998);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      f localf = (f)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(6039529324544L, 44998);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new j();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((j)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localf.nIG = ((j)localObject1);
          paramInt += 1;
        }
        GMTrace.o(6039529324544L, 44998);
        return 0;
      }
      localf.nIH = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(6039529324544L, 44998);
      return 0;
    }
    GMTrace.o(6039529324544L, 44998);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */