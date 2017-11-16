package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bnz
  extends ayx
{
  public int tTL;
  public int tWZ;
  public int tWu;
  public azq uNe;
  public String uVD;
  public int uVF;
  public int uXK;
  public LinkedList<azq> uXL;
  public int uXM;
  public azp ues;
  
  public bnz()
  {
    GMTrace.i(3775947341824L, 28133);
    this.uXL = new LinkedList();
    GMTrace.o(3775947341824L, 28133);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3776081559552L, 28134);
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
      if (this.ues != null)
      {
        paramVarArgs.fm(2, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.tWu);
      if (this.uVD != null) {
        paramVarArgs.e(4, this.uVD);
      }
      paramVarArgs.fk(5, this.tTL);
      paramVarArgs.fk(6, this.uVF);
      paramVarArgs.fk(7, this.tWZ);
      paramVarArgs.fk(8, this.uXK);
      paramVarArgs.d(9, 8, this.uXL);
      if (this.uNe != null)
      {
        paramVarArgs.fm(10, this.uNe.aYq());
        this.uNe.a(paramVarArgs);
      }
      paramVarArgs.fk(11, this.uXM);
      GMTrace.o(3776081559552L, 28134);
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
      if (this.ues != null) {
        i = paramInt + b.a.a.a.fj(2, this.ues.aYq());
      }
      i += b.a.a.a.fh(3, this.tWu);
      paramInt = i;
      if (this.uVD != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uVD);
      }
      i = paramInt + b.a.a.a.fh(5, this.tTL) + b.a.a.a.fh(6, this.uVF) + b.a.a.a.fh(7, this.tWZ) + b.a.a.a.fh(8, this.uXK) + b.a.a.a.c(9, 8, this.uXL);
      paramInt = i;
      if (this.uNe != null) {
        paramInt = i + b.a.a.a.fj(10, this.uNe.aYq());
      }
      i = b.a.a.a.fh(11, this.uXM);
      GMTrace.o(3776081559552L, 28134);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uXL.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3776081559552L, 28134);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bnz localbnz = (bnz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3776081559552L, 28134);
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
          localbnz.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3776081559552L, 28134);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbnz.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3776081559552L, 28134);
        return 0;
      case 3: 
        localbnz.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3776081559552L, 28134);
        return 0;
      case 4: 
        localbnz.uVD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3776081559552L, 28134);
        return 0;
      case 5: 
        localbnz.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3776081559552L, 28134);
        return 0;
      case 6: 
        localbnz.uVF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3776081559552L, 28134);
        return 0;
      case 7: 
        localbnz.tWZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3776081559552L, 28134);
        return 0;
      case 8: 
        localbnz.uXK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3776081559552L, 28134);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbnz.uXL.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3776081559552L, 28134);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbnz.uNe = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3776081559552L, 28134);
        return 0;
      }
      localbnz.uXM = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3776081559552L, 28134);
      return 0;
    }
    GMTrace.o(3776081559552L, 28134);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */