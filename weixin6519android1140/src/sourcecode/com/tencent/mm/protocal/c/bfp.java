package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bfp
  extends com.tencent.mm.bm.a
{
  public int uRo;
  public bgq uRp;
  public awm uRq;
  public pk uRr;
  public aul uRs;
  
  public bfp()
  {
    GMTrace.i(3854867365888L, 28721);
    GMTrace.o(3854867365888L, 28721);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3855001583616L, 28722);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uRo);
      if (this.uRp != null)
      {
        paramVarArgs.fm(2, this.uRp.aYq());
        this.uRp.a(paramVarArgs);
      }
      if (this.uRq != null)
      {
        paramVarArgs.fm(3, this.uRq.aYq());
        this.uRq.a(paramVarArgs);
      }
      if (this.uRr != null)
      {
        paramVarArgs.fm(4, this.uRr.aYq());
        this.uRr.a(paramVarArgs);
      }
      if (this.uRs != null)
      {
        paramVarArgs.fm(5, this.uRs.aYq());
        this.uRs.a(paramVarArgs);
      }
      GMTrace.o(3855001583616L, 28722);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uRo) + 0;
      paramInt = i;
      if (this.uRp != null) {
        paramInt = i + b.a.a.a.fj(2, this.uRp.aYq());
      }
      i = paramInt;
      if (this.uRq != null) {
        i = paramInt + b.a.a.a.fj(3, this.uRq.aYq());
      }
      paramInt = i;
      if (this.uRr != null) {
        paramInt = i + b.a.a.a.fj(4, this.uRr.aYq());
      }
      i = paramInt;
      if (this.uRs != null) {
        i = paramInt + b.a.a.a.fj(5, this.uRs.aYq());
      }
      GMTrace.o(3855001583616L, 28722);
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
      GMTrace.o(3855001583616L, 28722);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bfp localbfp = (bfp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3855001583616L, 28722);
        return -1;
      case 1: 
        localbfp.uRo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3855001583616L, 28722);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bgq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bgq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfp.uRp = ((bgq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3855001583616L, 28722);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new awm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((awm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfp.uRq = ((awm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3855001583616L, 28722);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new pk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((pk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbfp.uRr = ((pk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3855001583616L, 28722);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new aul();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((aul)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbfp.uRs = ((aul)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3855001583616L, 28722);
      return 0;
    }
    GMTrace.o(3855001583616L, 28722);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bfp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */