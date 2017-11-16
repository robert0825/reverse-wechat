package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ase
  extends ayx
{
  public String lPl;
  public String lQa;
  public String lRT;
  public at tYT;
  public String uIg;
  public String uIh;
  public String uIi;
  public String uIj;
  public String uIk;
  public String udf;
  public String udg;
  public String udh;
  public String udi;
  public String unE;
  
  public ase()
  {
    GMTrace.i(3850840834048L, 28691);
    GMTrace.o(3850840834048L, 28691);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3850975051776L, 28692);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      if (this.uIg != null) {
        paramVarArgs.e(3, this.uIg);
      }
      if (this.unE != null) {
        paramVarArgs.e(4, this.unE);
      }
      if (this.udf != null) {
        paramVarArgs.e(5, this.udf);
      }
      if (this.uIh != null) {
        paramVarArgs.e(6, this.uIh);
      }
      if (this.udg != null) {
        paramVarArgs.e(7, this.udg);
      }
      if (this.udh != null) {
        paramVarArgs.e(8, this.udh);
      }
      if (this.udi != null) {
        paramVarArgs.e(9, this.udi);
      }
      if (this.uIi != null) {
        paramVarArgs.e(10, this.uIi);
      }
      if (this.tYT != null)
      {
        paramVarArgs.fm(11, this.tYT.aYq());
        this.tYT.a(paramVarArgs);
      }
      if (this.uIj != null) {
        paramVarArgs.e(12, this.uIj);
      }
      if (this.lPl != null) {
        paramVarArgs.e(13, this.lPl);
      }
      if (this.lRT != null) {
        paramVarArgs.e(14, this.lRT);
      }
      if (this.uIk != null) {
        paramVarArgs.e(15, this.uIk);
      }
      GMTrace.o(3850975051776L, 28692);
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
      if (this.lQa != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQa);
      }
      i = paramInt;
      if (this.uIg != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uIg);
      }
      paramInt = i;
      if (this.unE != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.unE);
      }
      i = paramInt;
      if (this.udf != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.udf);
      }
      paramInt = i;
      if (this.uIh != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uIh);
      }
      i = paramInt;
      if (this.udg != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.udg);
      }
      paramInt = i;
      if (this.udh != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.udh);
      }
      i = paramInt;
      if (this.udi != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.udi);
      }
      paramInt = i;
      if (this.uIi != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.uIi);
      }
      i = paramInt;
      if (this.tYT != null) {
        i = paramInt + b.a.a.a.fj(11, this.tYT.aYq());
      }
      paramInt = i;
      if (this.uIj != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.uIj);
      }
      i = paramInt;
      if (this.lPl != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.lPl);
      }
      paramInt = i;
      if (this.lRT != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.lRT);
      }
      i = paramInt;
      if (this.uIk != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.uIk);
      }
      GMTrace.o(3850975051776L, 28692);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3850975051776L, 28692);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ase localase = (ase)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3850975051776L, 28692);
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
          localase.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 2: 
        localase.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 3: 
        localase.uIg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 4: 
        localase.unE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 5: 
        localase.udf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 6: 
        localase.uIh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 7: 
        localase.udg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 8: 
        localase.udh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 9: 
        localase.udi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 10: 
        localase.uIi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new at();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localase.tYT = ((at)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 12: 
        localase.uIj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 13: 
        localase.lPl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      case 14: 
        localase.lRT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3850975051776L, 28692);
        return 0;
      }
      localase.uIk = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3850975051776L, 28692);
      return 0;
    }
    GMTrace.o(3850975051776L, 28692);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */