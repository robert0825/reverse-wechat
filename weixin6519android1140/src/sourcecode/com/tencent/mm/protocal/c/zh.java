package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class zh
  extends ayx
{
  public LinkedList<azq> tTO;
  public int uqd;
  public int uqe;
  public LinkedList<azq> uqf;
  public int uqg;
  public LinkedList<azq> uqh;
  public int uqi;
  public azq uqj;
  
  public zh()
  {
    GMTrace.i(4051496337408L, 30186);
    this.tTO = new LinkedList();
    this.uqf = new LinkedList();
    this.uqh = new LinkedList();
    GMTrace.o(4051496337408L, 30186);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4051630555136L, 30187);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uqd);
      paramVarArgs.d(3, 8, this.tTO);
      paramVarArgs.fk(4, this.uqe);
      paramVarArgs.d(5, 8, this.uqf);
      paramVarArgs.fk(6, this.uqg);
      paramVarArgs.d(7, 8, this.uqh);
      paramVarArgs.fk(8, this.uqi);
      if (this.uqj != null)
      {
        paramVarArgs.fm(9, this.uqj.aYq());
        this.uqj.a(paramVarArgs);
      }
      GMTrace.o(4051630555136L, 30187);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uqd) + b.a.a.a.c(3, 8, this.tTO) + b.a.a.a.fh(4, this.uqe) + b.a.a.a.c(5, 8, this.uqf) + b.a.a.a.fh(6, this.uqg) + b.a.a.a.c(7, 8, this.uqh) + b.a.a.a.fh(8, this.uqi);
      paramInt = i;
      if (this.uqj != null) {
        paramInt = i + b.a.a.a.fj(9, this.uqj.aYq());
      }
      GMTrace.o(4051630555136L, 30187);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTO.clear();
      this.uqf.clear();
      this.uqh.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4051630555136L, 30187);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      zh localzh = (zh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4051630555136L, 30187);
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
          localzh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4051630555136L, 30187);
        return 0;
      case 2: 
        localzh.uqd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4051630555136L, 30187);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localzh.tTO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4051630555136L, 30187);
        return 0;
      case 4: 
        localzh.uqe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4051630555136L, 30187);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localzh.uqf.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4051630555136L, 30187);
        return 0;
      case 6: 
        localzh.uqg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4051630555136L, 30187);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localzh.uqh.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4051630555136L, 30187);
        return 0;
      case 8: 
        localzh.uqi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4051630555136L, 30187);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localzh.uqj = ((azq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4051630555136L, 30187);
      return 0;
    }
    GMTrace.o(4051630555136L, 30187);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */