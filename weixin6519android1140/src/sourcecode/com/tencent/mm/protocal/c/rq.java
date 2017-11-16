package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class rq
  extends ayx
{
  public String lQa;
  public int oqH;
  public at tYT;
  public String uia;
  
  public rq()
  {
    GMTrace.i(3922647318528L, 29226);
    GMTrace.o(3922647318528L, 29226);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3922781536256L, 29227);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uia != null) {
        paramVarArgs.e(2, this.uia);
      }
      if (this.lQa != null) {
        paramVarArgs.e(3, this.lQa);
      }
      paramVarArgs.fk(4, this.oqH);
      if (this.tYT != null)
      {
        paramVarArgs.fm(5, this.tYT.aYq());
        this.tYT.a(paramVarArgs);
      }
      GMTrace.o(3922781536256L, 29227);
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
      if (this.uia != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uia);
      }
      i = paramInt;
      if (this.lQa != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lQa);
      }
      i += b.a.a.a.fh(4, this.oqH);
      paramInt = i;
      if (this.tYT != null) {
        paramInt = i + b.a.a.a.fj(5, this.tYT.aYq());
      }
      GMTrace.o(3922781536256L, 29227);
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
      GMTrace.o(3922781536256L, 29227);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      rq localrq = (rq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3922781536256L, 29227);
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
          localrq.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3922781536256L, 29227);
        return 0;
      case 2: 
        localrq.uia = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3922781536256L, 29227);
        return 0;
      case 3: 
        localrq.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3922781536256L, 29227);
        return 0;
      case 4: 
        localrq.oqH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3922781536256L, 29227);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new at();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localrq.tYT = ((at)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3922781536256L, 29227);
      return 0;
    }
    GMTrace.o(3922781536256L, 29227);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\rq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */