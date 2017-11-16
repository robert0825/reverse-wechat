package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class blq
  extends ayx
{
  public String jhi;
  public int tRC;
  public int tRD;
  public String uVB;
  public azp ues;
  public int uro;
  
  public blq()
  {
    GMTrace.i(3978750328832L, 29644);
    GMTrace.o(3978750328832L, 29644);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3978884546560L, 29645);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tRC);
      paramVarArgs.fk(3, this.tRD);
      paramVarArgs.fk(4, this.uro);
      if (this.ues != null)
      {
        paramVarArgs.fm(5, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      if (this.uVB != null) {
        paramVarArgs.e(6, this.uVB);
      }
      if (this.jhi != null) {
        paramVarArgs.e(7, this.jhi);
      }
      GMTrace.o(3978884546560L, 29645);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tRC) + b.a.a.a.fh(3, this.tRD) + b.a.a.a.fh(4, this.uro);
      paramInt = i;
      if (this.ues != null) {
        paramInt = i + b.a.a.a.fj(5, this.ues.aYq());
      }
      i = paramInt;
      if (this.uVB != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uVB);
      }
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.jhi);
      }
      GMTrace.o(3978884546560L, 29645);
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
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3978884546560L, 29645);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      blq localblq = (blq)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3978884546560L, 29645);
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
          localblq.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3978884546560L, 29645);
        return 0;
      case 2: 
        localblq.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3978884546560L, 29645);
        return 0;
      case 3: 
        localblq.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3978884546560L, 29645);
        return 0;
      case 4: 
        localblq.uro = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3978884546560L, 29645);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localblq.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3978884546560L, 29645);
        return 0;
      case 6: 
        localblq.uVB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3978884546560L, 29645);
        return 0;
      }
      localblq.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3978884546560L, 29645);
      return 0;
    }
    GMTrace.o(3978884546560L, 29645);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\blq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */