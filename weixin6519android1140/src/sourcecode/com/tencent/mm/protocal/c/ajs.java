package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class ajs
  extends ayx
{
  public b jgP;
  public String lQa;
  public String uyB;
  public int uys;
  public int uyt;
  public bvc uyu;
  
  public ajs()
  {
    GMTrace.i(3793529864192L, 28264);
    GMTrace.o(3793529864192L, 28264);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3793664081920L, 28265);
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
      if (this.jgP != null) {
        paramVarArgs.b(3, this.jgP);
      }
      if (this.uyB != null) {
        paramVarArgs.e(4, this.uyB);
      }
      paramVarArgs.fk(5, this.uys);
      paramVarArgs.fk(6, this.uyt);
      if (this.uyu != null)
      {
        paramVarArgs.fm(7, this.uyu.aYq());
        this.uyu.a(paramVarArgs);
      }
      GMTrace.o(3793664081920L, 28265);
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
      if (this.jgP != null) {
        i = paramInt + b.a.a.a.a(3, this.jgP);
      }
      paramInt = i;
      if (this.uyB != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uyB);
      }
      i = paramInt + b.a.a.a.fh(5, this.uys) + b.a.a.a.fh(6, this.uyt);
      paramInt = i;
      if (this.uyu != null) {
        paramInt = i + b.a.a.a.fj(7, this.uyu.aYq());
      }
      GMTrace.o(3793664081920L, 28265);
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
      GMTrace.o(3793664081920L, 28265);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ajs localajs = (ajs)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3793664081920L, 28265);
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
          localajs.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3793664081920L, 28265);
        return 0;
      case 2: 
        localajs.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3793664081920L, 28265);
        return 0;
      case 3: 
        localajs.jgP = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3793664081920L, 28265);
        return 0;
      case 4: 
        localajs.uyB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3793664081920L, 28265);
        return 0;
      case 5: 
        localajs.uys = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3793664081920L, 28265);
        return 0;
      case 6: 
        localajs.uyt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3793664081920L, 28265);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bvc();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bvc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localajs.uyu = ((bvc)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3793664081920L, 28265);
      return 0;
    }
    GMTrace.o(3793664081920L, 28265);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ajs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */