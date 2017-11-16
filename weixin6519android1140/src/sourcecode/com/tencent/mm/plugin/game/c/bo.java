package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bo
  extends com.tencent.mm.bm.a
{
  public LinkedList<a> lSl;
  public bv lSm;
  public LinkedList<j> lSn;
  public bs lSo;
  public LinkedList<cd> lSp;
  
  public bo()
  {
    GMTrace.i(12655792226304L, 94293);
    this.lSl = new LinkedList();
    this.lSn = new LinkedList();
    this.lSp = new LinkedList();
    GMTrace.o(12655792226304L, 94293);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12655926444032L, 94294);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.lSl);
      if (this.lSm != null)
      {
        paramVarArgs.fm(2, this.lSm.aYq());
        this.lSm.a(paramVarArgs);
      }
      paramVarArgs.d(3, 8, this.lSn);
      if (this.lSo != null)
      {
        paramVarArgs.fm(4, this.lSo.aYq());
        this.lSo.a(paramVarArgs);
      }
      paramVarArgs.d(5, 8, this.lSp);
      GMTrace.o(12655926444032L, 94294);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.lSl) + 0;
      paramInt = i;
      if (this.lSm != null) {
        paramInt = i + b.a.a.a.fj(2, this.lSm.aYq());
      }
      i = paramInt + b.a.a.a.c(3, 8, this.lSn);
      paramInt = i;
      if (this.lSo != null) {
        paramInt = i + b.a.a.a.fj(4, this.lSo.aYq());
      }
      i = b.a.a.a.c(5, 8, this.lSp);
      GMTrace.o(12655926444032L, 94294);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lSl.clear();
      this.lSn.clear();
      this.lSp.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(12655926444032L, 94294);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bo localbo = (bo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12655926444032L, 94294);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new a();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbo.lSl.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12655926444032L, 94294);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbo.lSm = ((bv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12655926444032L, 94294);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new j();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((j)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbo.lSn.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12655926444032L, 94294);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bs();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbo.lSo = ((bs)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12655926444032L, 94294);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new cd();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((cd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbo.lSp.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(12655926444032L, 94294);
      return 0;
    }
    GMTrace.o(12655926444032L, 94294);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */