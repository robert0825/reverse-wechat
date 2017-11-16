package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class buv
  extends ayx
{
  public b tVL;
  public String vdq;
  public String vdr;
  
  public buv()
  {
    GMTrace.i(15344844406784L, 114328);
    GMTrace.o(15344844406784L, 114328);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15344978624512L, 114329);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.vdq != null) {
        paramVarArgs.e(2, this.vdq);
      }
      if (this.tVL != null) {
        paramVarArgs.b(3, this.tVL);
      }
      if (this.vdr != null) {
        paramVarArgs.e(4, this.vdr);
      }
      GMTrace.o(15344978624512L, 114329);
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
      if (this.vdq != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.vdq);
      }
      i = paramInt;
      if (this.tVL != null) {
        i = paramInt + b.a.a.a.a(3, this.tVL);
      }
      paramInt = i;
      if (this.vdr != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.vdr);
      }
      GMTrace.o(15344978624512L, 114329);
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
      GMTrace.o(15344978624512L, 114329);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      buv localbuv = (buv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(15344978624512L, 114329);
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
          localbuv.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344978624512L, 114329);
        return 0;
      case 2: 
        localbuv.vdq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15344978624512L, 114329);
        return 0;
      case 3: 
        localbuv.tVL = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(15344978624512L, 114329);
        return 0;
      }
      localbuv.vdr = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(15344978624512L, 114329);
      return 0;
    }
    GMTrace.o(15344978624512L, 114329);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\buv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */