package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bgj
  extends azh
{
  public LinkedList<bfh> tTQ;
  public int uEP;
  public int uQD;
  public int uQE;
  public bfy uQF;
  public azp uQg;
  public String uQz;
  public int uSa;
  public int uSb;
  public LinkedList<ca> uSc;
  public int uSd;
  public LinkedList<axs> uSe;
  
  public bgj()
  {
    GMTrace.i(3977408151552L, 29634);
    this.tTQ = new LinkedList();
    this.uSc = new LinkedList();
    this.uSe = new LinkedList();
    GMTrace.o(3977408151552L, 29634);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3977542369280L, 29635);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uQz != null) {
        paramVarArgs.e(2, this.uQz);
      }
      paramVarArgs.fk(3, this.uEP);
      paramVarArgs.d(4, 8, this.tTQ);
      paramVarArgs.fk(5, this.uSa);
      paramVarArgs.fk(6, this.uQD);
      paramVarArgs.fk(7, this.uQE);
      if (this.uQF != null)
      {
        paramVarArgs.fm(8, this.uQF.aYq());
        this.uQF.a(paramVarArgs);
      }
      paramVarArgs.fk(9, this.uSb);
      paramVarArgs.d(10, 8, this.uSc);
      if (this.uQg != null)
      {
        paramVarArgs.fm(11, this.uQg.aYq());
        this.uQg.a(paramVarArgs);
      }
      paramVarArgs.fk(12, this.uSd);
      paramVarArgs.d(13, 8, this.uSe);
      GMTrace.o(3977542369280L, 29635);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.uQz != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uQz);
      }
      i = i + b.a.a.a.fh(3, this.uEP) + b.a.a.a.c(4, 8, this.tTQ) + b.a.a.a.fh(5, this.uSa) + b.a.a.a.fh(6, this.uQD) + b.a.a.a.fh(7, this.uQE);
      paramInt = i;
      if (this.uQF != null) {
        paramInt = i + b.a.a.a.fj(8, this.uQF.aYq());
      }
      i = paramInt + b.a.a.a.fh(9, this.uSb) + b.a.a.a.c(10, 8, this.uSc);
      paramInt = i;
      if (this.uQg != null) {
        paramInt = i + b.a.a.a.fj(11, this.uQg.aYq());
      }
      i = b.a.a.a.fh(12, this.uSd);
      int j = b.a.a.a.c(13, 8, this.uSe);
      GMTrace.o(3977542369280L, 29635);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tTQ.clear();
      this.uSc.clear();
      this.uSe.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3977542369280L, 29635);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bgj localbgj = (bgj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3977542369280L, 29635);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbgj.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 2: 
        localbgj.uQz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 3: 
        localbgj.uEP = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbgj.tTQ.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 5: 
        localbgj.uSa = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 6: 
        localbgj.uQD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 7: 
        localbgj.uQE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bfy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbgj.uQF = ((bfy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 9: 
        localbgj.uSb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ca();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ca)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbgj.uSc.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbgj.uQg = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3977542369280L, 29635);
        return 0;
      case 12: 
        localbgj.uSd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3977542369280L, 29635);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new axs();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((axs)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localbgj.uSe.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3977542369280L, 29635);
      return 0;
    }
    GMTrace.o(3977542369280L, 29635);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bgj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */