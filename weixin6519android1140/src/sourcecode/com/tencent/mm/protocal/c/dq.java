package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class dq
  extends com.tencent.mm.bm.a
{
  public String tNn;
  public String tRS;
  public rf tRT;
  
  public dq()
  {
    GMTrace.i(3972576313344L, 29598);
    GMTrace.o(3972576313344L, 29598);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3972710531072L, 29599);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRS == null) {
        throw new b("Not all required fields were included: ProductID");
      }
      if (this.tRT == null) {
        throw new b("Not all required fields were included: Price");
      }
      if (this.tRS != null) {
        paramVarArgs.e(1, this.tRS);
      }
      if (this.tRT != null)
      {
        paramVarArgs.fm(2, this.tRT.aYq());
        this.tRT.a(paramVarArgs);
      }
      if (this.tNn != null) {
        paramVarArgs.e(3, this.tNn);
      }
      GMTrace.o(3972710531072L, 29599);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tRS != null) {
        i = b.a.a.b.b.a.f(1, this.tRS) + 0;
      }
      paramInt = i;
      if (this.tRT != null) {
        paramInt = i + b.a.a.a.fj(2, this.tRT.aYq());
      }
      i = paramInt;
      if (this.tNn != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tNn);
      }
      GMTrace.o(3972710531072L, 29599);
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
      if (this.tRS == null) {
        throw new b("Not all required fields were included: ProductID");
      }
      if (this.tRT == null) {
        throw new b("Not all required fields were included: Price");
      }
      GMTrace.o(3972710531072L, 29599);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      dq localdq = (dq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3972710531072L, 29599);
        return -1;
      case 1: 
        localdq.tRS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3972710531072L, 29599);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new rf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((rf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdq.tRT = ((rf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3972710531072L, 29599);
        return 0;
      }
      localdq.tNn = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3972710531072L, 29599);
      return 0;
    }
    GMTrace.o(3972710531072L, 29599);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */