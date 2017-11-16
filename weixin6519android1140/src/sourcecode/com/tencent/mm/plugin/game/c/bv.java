package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bv
  extends com.tencent.mm.bm.a
{
  public String lRM;
  public String lSA;
  public LinkedList<bw> lSz;
  
  public bv()
  {
    GMTrace.i(12654986919936L, 94287);
    this.lSz = new LinkedList();
    GMTrace.o(12654986919936L, 94287);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12655121137664L, 94288);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.lSz);
      if (this.lRM != null) {
        paramVarArgs.e(2, this.lRM);
      }
      if (this.lSA != null) {
        paramVarArgs.e(3, this.lSA);
      }
      GMTrace.o(12655121137664L, 94288);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.lSz) + 0;
      paramInt = i;
      if (this.lRM != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lRM);
      }
      i = paramInt;
      if (this.lSA != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lSA);
      }
      GMTrace.o(12655121137664L, 94288);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lSz.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(12655121137664L, 94288);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bv localbv = (bv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12655121137664L, 94288);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bw();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbv.lSz.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12655121137664L, 94288);
        return 0;
      case 2: 
        localbv.lRM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12655121137664L, 94288);
        return 0;
      }
      localbv.lSA = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(12655121137664L, 94288);
      return 0;
    }
    GMTrace.o(12655121137664L, 94288);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */