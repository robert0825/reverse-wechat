package com.tencent.mm.aw;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class d
  extends com.tencent.mm.bm.a
{
  public LinkedList<e> gPM;
  public int gPN;
  public int gPO;
  public int gPP;
  public int gPQ;
  public String gPR;
  public String gPS;
  public int gPT;
  public int gPU;
  public int gPV;
  public int maxSize;
  public String name;
  
  public d()
  {
    GMTrace.i(12938991632384L, 96403);
    this.gPM = new LinkedList();
    GMTrace.o(12938991632384L, 96403);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12939125850112L, 96404);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.gPM);
      if (this.name != null) {
        paramVarArgs.e(2, this.name);
      }
      paramVarArgs.fk(3, this.gPN);
      paramVarArgs.fk(4, this.gPO);
      paramVarArgs.fk(5, this.gPP);
      paramVarArgs.fk(6, this.gPQ);
      if (this.gPR != null) {
        paramVarArgs.e(7, this.gPR);
      }
      if (this.gPS != null) {
        paramVarArgs.e(8, this.gPS);
      }
      paramVarArgs.fk(9, this.gPT);
      paramVarArgs.fk(10, this.gPU);
      paramVarArgs.fk(11, this.gPV);
      paramVarArgs.fk(12, this.maxSize);
      GMTrace.o(12939125850112L, 96404);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.gPM) + 0;
      paramInt = i;
      if (this.name != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.name);
      }
      i = paramInt + b.a.a.a.fh(3, this.gPN) + b.a.a.a.fh(4, this.gPO) + b.a.a.a.fh(5, this.gPP) + b.a.a.a.fh(6, this.gPQ);
      paramInt = i;
      if (this.gPR != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.gPR);
      }
      i = paramInt;
      if (this.gPS != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.gPS);
      }
      paramInt = b.a.a.a.fh(9, this.gPT);
      int j = b.a.a.a.fh(10, this.gPU);
      int k = b.a.a.a.fh(11, this.gPV);
      int m = b.a.a.a.fh(12, this.maxSize);
      GMTrace.o(12939125850112L, 96404);
      return i + paramInt + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.gPM.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(12939125850112L, 96404);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12939125850112L, 96404);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new e();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((e)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locald.gPM.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12939125850112L, 96404);
        return 0;
      case 2: 
        locald.name = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12939125850112L, 96404);
        return 0;
      case 3: 
        locald.gPN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12939125850112L, 96404);
        return 0;
      case 4: 
        locald.gPO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12939125850112L, 96404);
        return 0;
      case 5: 
        locald.gPP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12939125850112L, 96404);
        return 0;
      case 6: 
        locald.gPQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12939125850112L, 96404);
        return 0;
      case 7: 
        locald.gPR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12939125850112L, 96404);
        return 0;
      case 8: 
        locald.gPS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12939125850112L, 96404);
        return 0;
      case 9: 
        locald.gPT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12939125850112L, 96404);
        return 0;
      case 10: 
        locald.gPU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12939125850112L, 96404);
        return 0;
      case 11: 
        locald.gPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12939125850112L, 96404);
        return 0;
      }
      locald.maxSize = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(12939125850112L, 96404);
      return 0;
    }
    GMTrace.o(12939125850112L, 96404);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */