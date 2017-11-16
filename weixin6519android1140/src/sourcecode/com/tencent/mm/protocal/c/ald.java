package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ald
  extends ayx
{
  public String lQa;
  public bud uAg;
  public bve uAh;
  public bva uAi;
  public bvj uAj;
  public bvd uAk;
  public int utx;
  
  public ald()
  {
    GMTrace.i(15344575971328L, 114326);
    GMTrace.o(15344575971328L, 114326);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15344710189056L, 114327);
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
      if (this.uAg != null)
      {
        paramVarArgs.fm(3, this.uAg.aYq());
        this.uAg.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.utx);
      if (this.uAh != null)
      {
        paramVarArgs.fm(5, this.uAh.aYq());
        this.uAh.a(paramVarArgs);
      }
      if (this.uAi != null)
      {
        paramVarArgs.fm(6, this.uAi.aYq());
        this.uAi.a(paramVarArgs);
      }
      if (this.uAj != null)
      {
        paramVarArgs.fm(7, this.uAj.aYq());
        this.uAj.a(paramVarArgs);
      }
      if (this.uAk != null)
      {
        paramVarArgs.fm(8, this.uAk.aYq());
        this.uAk.a(paramVarArgs);
      }
      GMTrace.o(15344710189056L, 114327);
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
      if (this.uAg != null) {
        i = paramInt + b.a.a.a.fj(3, this.uAg.aYq());
      }
      i += b.a.a.a.fh(4, this.utx);
      paramInt = i;
      if (this.uAh != null) {
        paramInt = i + b.a.a.a.fj(5, this.uAh.aYq());
      }
      i = paramInt;
      if (this.uAi != null) {
        i = paramInt + b.a.a.a.fj(6, this.uAi.aYq());
      }
      paramInt = i;
      if (this.uAj != null) {
        paramInt = i + b.a.a.a.fj(7, this.uAj.aYq());
      }
      i = paramInt;
      if (this.uAk != null) {
        i = paramInt + b.a.a.a.fj(8, this.uAk.aYq());
      }
      GMTrace.o(15344710189056L, 114327);
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
      GMTrace.o(15344710189056L, 114327);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ald localald = (ald)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(15344710189056L, 114327);
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
          localald.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 2: 
        localald.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bud();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bud)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localald.uAg = ((bud)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 4: 
        localald.utx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bve();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bve)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localald.uAh = ((bve)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bva();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bva)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localald.uAi = ((bva)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344710189056L, 114327);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bvj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bvj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localald.uAj = ((bvj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15344710189056L, 114327);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bvd();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bvd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localald.uAk = ((bvd)localObject1);
        paramInt += 1;
      }
      GMTrace.o(15344710189056L, 114327);
      return 0;
    }
    GMTrace.o(15344710189056L, 114327);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ald.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */