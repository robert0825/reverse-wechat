package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ac
  extends com.tencent.mm.bm.a
{
  public String lPF;
  public c lPb;
  public String lPf;
  public LinkedList<ad> lQA;
  
  public ac()
  {
    GMTrace.i(12643175759872L, 94199);
    this.lQA = new LinkedList();
    GMTrace.o(12643175759872L, 94199);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12643309977600L, 94200);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPb == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.lPb != null)
      {
        paramVarArgs.fm(1, this.lPb.aYq());
        this.lPb.a(paramVarArgs);
      }
      if (this.lPf != null) {
        paramVarArgs.e(2, this.lPf);
      }
      paramVarArgs.d(3, 8, this.lQA);
      if (this.lPF != null) {
        paramVarArgs.e(4, this.lPF);
      }
      GMTrace.o(12643309977600L, 94200);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lPb != null) {
        paramInt = b.a.a.a.fj(1, this.lPb.aYq()) + 0;
      }
      i = paramInt;
      if (this.lPf != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPf);
      }
      i += b.a.a.a.c(3, 8, this.lQA);
      paramInt = i;
      if (this.lPF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPF);
      }
      GMTrace.o(12643309977600L, 94200);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lQA.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lPb == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      GMTrace.o(12643309977600L, 94200);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ac localac = (ac)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12643309977600L, 94200);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localac.lPb = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643309977600L, 94200);
        return 0;
      case 2: 
        localac.lPf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12643309977600L, 94200);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ad();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ad)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localac.lQA.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643309977600L, 94200);
        return 0;
      }
      localac.lPF = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(12643309977600L, 94200);
      return 0;
    }
    GMTrace.o(12643309977600L, 94200);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */