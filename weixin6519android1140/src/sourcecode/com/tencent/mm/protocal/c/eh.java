package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class eh
  extends ayx
{
  public long jhw;
  public int tOG;
  public int tSN;
  public LinkedList<nu> tSO;
  public String tSP;
  public String tSQ;
  public String tSR;
  
  public eh()
  {
    GMTrace.i(3976871280640L, 29630);
    this.tSO = new LinkedList();
    GMTrace.o(3976871280640L, 29630);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3977005498368L, 29631);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tSN);
      paramVarArgs.d(3, 8, this.tSO);
      if (this.tSP != null) {
        paramVarArgs.e(4, this.tSP);
      }
      if (this.tSQ != null) {
        paramVarArgs.e(5, this.tSQ);
      }
      paramVarArgs.fk(6, this.tOG);
      paramVarArgs.T(7, this.jhw);
      if (this.tSR != null) {
        paramVarArgs.e(8, this.tSR);
      }
      GMTrace.o(3977005498368L, 29631);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tSN) + b.a.a.a.c(3, 8, this.tSO);
      paramInt = i;
      if (this.tSP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tSP);
      }
      i = paramInt;
      if (this.tSQ != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tSQ);
      }
      i = i + b.a.a.a.fh(6, this.tOG) + b.a.a.a.S(7, this.jhw);
      paramInt = i;
      if (this.tSR != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tSR);
      }
      GMTrace.o(3977005498368L, 29631);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tSO.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3977005498368L, 29631);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      eh localeh = (eh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3977005498368L, 29631);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localeh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 2: 
        localeh.tSN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nu();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nu)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localeh.tSO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 4: 
        localeh.tSP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 5: 
        localeh.tSQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 6: 
        localeh.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977005498368L, 29631);
        return 0;
      case 7: 
        localeh.jhw = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3977005498368L, 29631);
        return 0;
      }
      localeh.tSR = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3977005498368L, 29631);
      return 0;
    }
    GMTrace.o(3977005498368L, 29631);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */