package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class so
  extends ayx
{
  public String fjk;
  public String fjl;
  public String kBQ;
  public String uiE;
  public String uiF;
  public long uiG;
  public double uiH;
  public double uiI;
  
  public so()
  {
    GMTrace.i(3969891958784L, 29578);
    GMTrace.o(3969891958784L, 29578);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3970026176512L, 29579);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.kBQ != null) {
        paramVarArgs.e(2, this.kBQ);
      }
      if (this.fjl != null) {
        paramVarArgs.e(3, this.fjl);
      }
      if (this.fjk != null) {
        paramVarArgs.e(4, this.fjk);
      }
      if (this.uiE != null) {
        paramVarArgs.e(5, this.uiE);
      }
      if (this.uiF != null) {
        paramVarArgs.e(6, this.uiF);
      }
      paramVarArgs.T(7, this.uiG);
      paramVarArgs.a(8, this.uiH);
      paramVarArgs.a(9, this.uiI);
      GMTrace.o(3970026176512L, 29579);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.kBQ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.kBQ);
      }
      i = paramInt;
      if (this.fjl != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.fjl);
      }
      paramInt = i;
      if (this.fjk != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.fjk);
      }
      i = paramInt;
      if (this.uiE != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uiE);
      }
      paramInt = i;
      if (this.uiF != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uiF);
      }
      i = b.a.a.a.S(7, this.uiG);
      int j = b.a.a.b.b.a.cK(8);
      int k = b.a.a.b.b.a.cK(9);
      GMTrace.o(3970026176512L, 29579);
      return paramInt + i + (j + 8) + (k + 8);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3970026176512L, 29579);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      so localso = (so)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3970026176512L, 29579);
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
          localso.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3970026176512L, 29579);
        return 0;
      case 2: 
        localso.kBQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3970026176512L, 29579);
        return 0;
      case 3: 
        localso.fjl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3970026176512L, 29579);
        return 0;
      case 4: 
        localso.fjk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3970026176512L, 29579);
        return 0;
      case 5: 
        localso.uiE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3970026176512L, 29579);
        return 0;
      case 6: 
        localso.uiF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3970026176512L, 29579);
        return 0;
      case 7: 
        localso.uiG = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3970026176512L, 29579);
        return 0;
      case 8: 
        localso.uiH = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3970026176512L, 29579);
        return 0;
      }
      localso.uiI = ((b.a.a.a.a)localObject1).yqV.readDouble();
      GMTrace.o(3970026176512L, 29579);
      return 0;
    }
    GMTrace.o(3970026176512L, 29579);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\so.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */