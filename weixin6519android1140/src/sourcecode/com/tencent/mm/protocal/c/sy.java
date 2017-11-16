package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class sy
  extends ayx
{
  public String eSd;
  public String uiQ;
  public long uiU;
  public String uiV;
  public String uiW;
  
  public sy()
  {
    GMTrace.i(3952443654144L, 29448);
    GMTrace.o(3952443654144L, 29448);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3952577871872L, 29449);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eSd != null) {
        paramVarArgs.e(2, this.eSd);
      }
      paramVarArgs.T(3, this.uiU);
      if (this.uiQ != null) {
        paramVarArgs.e(4, this.uiQ);
      }
      if (this.uiV != null) {
        paramVarArgs.e(5, this.uiV);
      }
      if (this.uiW != null) {
        paramVarArgs.e(6, this.uiW);
      }
      GMTrace.o(3952577871872L, 29449);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.eSd != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.eSd);
      }
      i += b.a.a.a.S(3, this.uiU);
      paramInt = i;
      if (this.uiQ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uiQ);
      }
      i = paramInt;
      if (this.uiV != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uiV);
      }
      paramInt = i;
      if (this.uiW != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uiW);
      }
      GMTrace.o(3952577871872L, 29449);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3952577871872L, 29449);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      sy localsy = (sy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3952577871872L, 29449);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localsy.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3952577871872L, 29449);
        return 0;
      case 2: 
        localsy.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3952577871872L, 29449);
        return 0;
      case 3: 
        localsy.uiU = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3952577871872L, 29449);
        return 0;
      case 4: 
        localsy.uiQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3952577871872L, 29449);
        return 0;
      case 5: 
        localsy.uiV = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3952577871872L, 29449);
        return 0;
      }
      localsy.uiW = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3952577871872L, 29449);
      return 0;
    }
    GMTrace.o(3952577871872L, 29449);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\sy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */