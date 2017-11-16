package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class zc
  extends com.tencent.mm.bm.a
  implements bed
{
  public int tST;
  public int udL;
  public int udM;
  public int udN;
  public LinkedList<bhp> udO;
  public LinkedList<bhp> udP;
  public LinkedList<bhp> udQ;
  public int udR;
  public int udS;
  public int udT;
  public ahj udU;
  public int upW;
  public int upX;
  public int upY;
  public LinkedList<bhp> upZ;
  public LinkedList<bhp> uqa;
  public LinkedList<bhp> uqb;
  
  public zc()
  {
    GMTrace.i(13095757938688L, 97571);
    this.udO = new LinkedList();
    this.udP = new LinkedList();
    this.udQ = new LinkedList();
    this.upZ = new LinkedList();
    this.uqa = new LinkedList();
    this.uqb = new LinkedList();
    GMTrace.o(13095757938688L, 97571);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13096026374144L, 97573);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tST);
      paramVarArgs.fk(2, this.udL);
      paramVarArgs.fk(3, this.udM);
      paramVarArgs.fk(4, this.udN);
      paramVarArgs.d(5, 8, this.udO);
      paramVarArgs.d(6, 8, this.udP);
      paramVarArgs.d(7, 8, this.udQ);
      paramVarArgs.fk(8, this.udR);
      paramVarArgs.fk(9, this.udS);
      paramVarArgs.fk(10, this.udT);
      paramVarArgs.fk(11, this.upW);
      paramVarArgs.fk(12, this.upX);
      paramVarArgs.fk(13, this.upY);
      paramVarArgs.d(14, 8, this.upZ);
      paramVarArgs.d(15, 8, this.uqa);
      paramVarArgs.d(16, 8, this.uqb);
      if (this.udU != null)
      {
        paramVarArgs.fm(17, this.udU.aYq());
        this.udU.a(paramVarArgs);
      }
      GMTrace.o(13096026374144L, 97573);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tST) + 0 + b.a.a.a.fh(2, this.udL) + b.a.a.a.fh(3, this.udM) + b.a.a.a.fh(4, this.udN) + b.a.a.a.c(5, 8, this.udO) + b.a.a.a.c(6, 8, this.udP) + b.a.a.a.c(7, 8, this.udQ) + b.a.a.a.fh(8, this.udR) + b.a.a.a.fh(9, this.udS) + b.a.a.a.fh(10, this.udT) + b.a.a.a.fh(11, this.upW) + b.a.a.a.fh(12, this.upX) + b.a.a.a.fh(13, this.upY) + b.a.a.a.c(14, 8, this.upZ) + b.a.a.a.c(15, 8, this.uqa) + b.a.a.a.c(16, 8, this.uqb);
      paramInt = i;
      if (this.udU != null) {
        paramInt = i + b.a.a.a.fj(17, this.udU.aYq());
      }
      GMTrace.o(13096026374144L, 97573);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.udO.clear();
      this.udP.clear();
      this.udQ.clear();
      this.upZ.clear();
      this.uqa.clear();
      this.uqb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13096026374144L, 97573);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      zc localzc = (zc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13096026374144L, 97573);
        return -1;
      case 1: 
        localzc.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 2: 
        localzc.udL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 3: 
        localzc.udM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 4: 
        localzc.udN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localzc.udO.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localzc.udP.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localzc.udQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 8: 
        localzc.udR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 9: 
        localzc.udS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 10: 
        localzc.udT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 11: 
        localzc.upW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 12: 
        localzc.upX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 13: 
        localzc.upY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localzc.upZ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 15: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localzc.uqa.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13096026374144L, 97573);
        return 0;
      case 16: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localzc.uqb.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(13096026374144L, 97573);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ahj();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ahj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localzc.udU = ((ahj)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13096026374144L, 97573);
      return 0;
    }
    GMTrace.o(13096026374144L, 97573);
    return -1;
  }
  
  public final int getRet()
  {
    GMTrace.i(13095892156416L, 97572);
    int i = this.tST;
    GMTrace.o(13095892156416L, 97572);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */