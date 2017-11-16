package com.tencent.mm.plugin.exdevice.e;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class l
  extends j
{
  public com.tencent.mm.bm.b jgP;
  
  public l()
  {
    GMTrace.i(11110543523840L, 82780);
    GMTrace.o(11110543523840L, 82780);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(11110677741568L, 82781);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kBB == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.kBB != null)
      {
        paramVarArgs.fm(1, this.kBB.aYq());
        this.kBB.a(paramVarArgs);
      }
      if (this.jgP != null) {
        paramVarArgs.b(2, this.jgP);
      }
      GMTrace.o(11110677741568L, 82781);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.kBB != null) {
        paramInt = b.a.a.a.fj(1, this.kBB.aYq()) + 0;
      }
      i = paramInt;
      if (this.jgP != null) {
        i = paramInt + b.a.a.a.a(2, this.jgP);
      }
      GMTrace.o(11110677741568L, 82781);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = j.a(paramVarArgs); paramInt > 0; paramInt = j.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.kBB == null) {
        throw new b.a.a.b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(11110677741568L, 82781);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      l locall = (l)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(11110677741568L, 82781);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, j.a((b.a.a.a.a)localObject2))) {}
          locall.kBB = ((e)localObject1);
          paramInt += 1;
        }
        GMTrace.o(11110677741568L, 82781);
        return 0;
      }
      locall.jgP = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(11110677741568L, 82781);
      return 0;
    }
    GMTrace.o(11110677741568L, 82781);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\e\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */