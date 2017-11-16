package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class h
  extends com.tencent.mm.bm.a
{
  public LinkedList<q> qXA;
  public double qXF;
  public double qXG;
  public int qXH;
  public String qXI;
  public String qXJ;
  public b qXM;
  public String qXN;
  public double qXO;
  public LinkedList<e> qXP;
  public double qXy;
  
  public h()
  {
    GMTrace.i(7698728878080L, 57360);
    this.qXP = new LinkedList();
    this.qXA = new LinkedList();
    GMTrace.o(7698728878080L, 57360);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7698863095808L, 57361);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.qXN != null) {
        paramVarArgs.e(1, this.qXN);
      }
      paramVarArgs.a(2, this.qXO);
      paramVarArgs.a(3, this.qXy);
      paramVarArgs.d(4, 8, this.qXP);
      paramVarArgs.d(5, 8, this.qXA);
      paramVarArgs.a(6, this.qXF);
      paramVarArgs.a(7, this.qXG);
      paramVarArgs.fk(8, this.qXH);
      if (this.qXI != null) {
        paramVarArgs.e(9, this.qXI);
      }
      if (this.qXJ != null) {
        paramVarArgs.e(10, this.qXJ);
      }
      if (this.qXM != null) {
        paramVarArgs.b(11, this.qXM);
      }
      GMTrace.o(7698863095808L, 57361);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.qXN != null) {
        paramInt = b.a.a.b.b.a.f(1, this.qXN) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 8) + (b.a.a.b.b.a.cK(3) + 8) + b.a.a.a.c(4, 8, this.qXP) + b.a.a.a.c(5, 8, this.qXA) + (b.a.a.b.b.a.cK(6) + 8) + (b.a.a.b.b.a.cK(7) + 8) + b.a.a.a.fh(8, this.qXH);
      paramInt = i;
      if (this.qXI != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.qXI);
      }
      i = paramInt;
      if (this.qXJ != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.qXJ);
      }
      paramInt = i;
      if (this.qXM != null) {
        paramInt = i + b.a.a.a.a(11, this.qXM);
      }
      GMTrace.o(7698863095808L, 57361);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.qXP.clear();
      this.qXA.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(7698863095808L, 57361);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      h localh = (h)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(7698863095808L, 57361);
        return -1;
      case 1: 
        localh.qXN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 2: 
        localh.qXO = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 3: 
        localh.qXy = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localh.qXP.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new q();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((q)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localh.qXA.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 6: 
        localh.qXF = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 7: 
        localh.qXG = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 8: 
        localh.qXH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 9: 
        localh.qXI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      case 10: 
        localh.qXJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(7698863095808L, 57361);
        return 0;
      }
      localh.qXM = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(7698863095808L, 57361);
      return 0;
    }
    GMTrace.o(7698863095808L, 57361);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */