package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class bds
  extends ayx
{
  public int jhc;
  public int tOG;
  public LinkedList<Integer> tTH;
  public String uPI;
  
  public bds()
  {
    GMTrace.i(4011902107648L, 29891);
    this.tTH = new LinkedList();
    GMTrace.o(4011902107648L, 29891);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4012036325376L, 29892);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uPI != null) {
        paramVarArgs.e(2, this.uPI);
      }
      paramVarArgs.fk(3, this.tOG);
      paramVarArgs.fk(4, this.jhc);
      paramVarArgs.c(5, this.tTH);
      GMTrace.o(4012036325376L, 29892);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.uPI != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uPI);
      }
      paramInt = b.a.a.a.fh(3, this.tOG);
      int j = b.a.a.a.fh(4, this.jhc);
      int k = b.a.a.a.b(5, this.tTH);
      GMTrace.o(4012036325376L, 29892);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTH.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4012036325376L, 29892);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bds localbds = (bds)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4012036325376L, 29892);
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
          localbds.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4012036325376L, 29892);
        return 0;
      case 2: 
        localbds.uPI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4012036325376L, 29892);
        return 0;
      case 3: 
        localbds.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4012036325376L, 29892);
        return 0;
      case 4: 
        localbds.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4012036325376L, 29892);
        return 0;
      }
      localbds.tTH = new b.a.a.a.a(((b.a.a.a.a)localObject1).csV().tJp, unknownTagHandler).csS();
      GMTrace.o(4012036325376L, 29892);
      return 0;
    }
    GMTrace.o(4012036325376L, 29892);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */