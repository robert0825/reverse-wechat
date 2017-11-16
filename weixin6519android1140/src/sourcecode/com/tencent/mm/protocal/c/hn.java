package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class hn
  extends ayx
{
  public int tOG;
  public int tTL;
  public int tVg;
  public int tWr;
  public azp tWs;
  public int tWt;
  public int tWu;
  public int tWv;
  public int tWw;
  
  public hn()
  {
    GMTrace.i(3923989495808L, 29236);
    GMTrace.o(3923989495808L, 29236);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3924123713536L, 29237);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tWs == null) {
        throw new b("Not all required fields were included: ImageBuffer");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tWr);
      if (this.tWs != null)
      {
        paramVarArgs.fm(3, this.tWs.aYq());
        this.tWs.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.tWt);
      paramVarArgs.fk(5, this.tWu);
      paramVarArgs.fk(6, this.tTL);
      paramVarArgs.fk(7, this.tWv);
      paramVarArgs.fk(8, this.tVg);
      paramVarArgs.fk(9, this.tWw);
      paramVarArgs.fk(10, this.tOG);
      GMTrace.o(3924123713536L, 29237);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tWr);
      paramInt = i;
      if (this.tWs != null) {
        paramInt = i + b.a.a.a.fj(3, this.tWs.aYq());
      }
      i = b.a.a.a.fh(4, this.tWt);
      int j = b.a.a.a.fh(5, this.tWu);
      int k = b.a.a.a.fh(6, this.tTL);
      int m = b.a.a.a.fh(7, this.tWv);
      int n = b.a.a.a.fh(8, this.tVg);
      int i1 = b.a.a.a.fh(9, this.tWw);
      int i2 = b.a.a.a.fh(10, this.tOG);
      GMTrace.o(3924123713536L, 29237);
      return paramInt + i + j + k + m + n + i1 + i2;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tWs == null) {
        throw new b("Not all required fields were included: ImageBuffer");
      }
      GMTrace.o(3924123713536L, 29237);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      hn localhn = (hn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3924123713536L, 29237);
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
          localhn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3924123713536L, 29237);
        return 0;
      case 2: 
        localhn.tWr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3924123713536L, 29237);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localhn.tWs = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3924123713536L, 29237);
        return 0;
      case 4: 
        localhn.tWt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3924123713536L, 29237);
        return 0;
      case 5: 
        localhn.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3924123713536L, 29237);
        return 0;
      case 6: 
        localhn.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3924123713536L, 29237);
        return 0;
      case 7: 
        localhn.tWv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3924123713536L, 29237);
        return 0;
      case 8: 
        localhn.tVg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3924123713536L, 29237);
        return 0;
      case 9: 
        localhn.tWw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3924123713536L, 29237);
        return 0;
      }
      localhn.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3924123713536L, 29237);
      return 0;
    }
    GMTrace.o(3924123713536L, 29237);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\hn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */