package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bm
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lQf;
  public LinkedList<bq> lSj;
  
  public bm()
  {
    GMTrace.i(12643444195328L, 94201);
    this.lSj = new LinkedList();
    GMTrace.o(12643444195328L, 94201);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12643578413056L, 94202);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lQf == null) {
        throw new b("Not all required fields were included: Detail");
      }
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      paramVarArgs.d(2, 8, this.lSj);
      if (this.lQf != null) {
        paramVarArgs.e(3, this.lQf);
      }
      GMTrace.o(12643578413056L, 94202);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.eBt != null) {
        paramInt = b.a.a.b.b.a.f(1, this.eBt) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.lSj);
      paramInt = i;
      if (this.lQf != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.lQf);
      }
      GMTrace.o(12643578413056L, 94202);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lSj.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lQf == null) {
        throw new b("Not all required fields were included: Detail");
      }
      GMTrace.o(12643578413056L, 94202);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bm localbm = (bm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12643578413056L, 94202);
        return -1;
      case 1: 
        localbm.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12643578413056L, 94202);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbm.lSj.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12643578413056L, 94202);
        return 0;
      }
      localbm.lQf = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(12643578413056L, 94202);
      return 0;
    }
    GMTrace.o(12643578413056L, 94202);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */