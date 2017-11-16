package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class xz
  extends azh
{
  public iy uaA;
  public iy uaB;
  public iy uaC;
  public azp uaD;
  public azp uaE;
  public iy uaF;
  public int uaG;
  public ix uaH;
  public ix uaI;
  
  public xz()
  {
    GMTrace.i(3877147508736L, 28887);
    GMTrace.o(3877147508736L, 28887);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3877281726464L, 28888);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uaA == null) {
        throw new b("Not all required fields were included: DnsInfo");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uaA != null)
      {
        paramVarArgs.fm(2, this.uaA.aYq());
        this.uaA.a(paramVarArgs);
      }
      if (this.uaB != null)
      {
        paramVarArgs.fm(3, this.uaB.aYq());
        this.uaB.a(paramVarArgs);
      }
      if (this.uaC != null)
      {
        paramVarArgs.fm(4, this.uaC.aYq());
        this.uaC.a(paramVarArgs);
      }
      if (this.uaD != null)
      {
        paramVarArgs.fm(5, this.uaD.aYq());
        this.uaD.a(paramVarArgs);
      }
      if (this.uaE != null)
      {
        paramVarArgs.fm(6, this.uaE.aYq());
        this.uaE.a(paramVarArgs);
      }
      if (this.uaF != null)
      {
        paramVarArgs.fm(7, this.uaF.aYq());
        this.uaF.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.uaG);
      if (this.uaH != null)
      {
        paramVarArgs.fm(9, this.uaH.aYq());
        this.uaH.a(paramVarArgs);
      }
      if (this.uaI != null)
      {
        paramVarArgs.fm(10, this.uaI.aYq());
        this.uaI.a(paramVarArgs);
      }
      GMTrace.o(3877281726464L, 28888);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uaA != null) {
        paramInt = i + b.a.a.a.fj(2, this.uaA.aYq());
      }
      i = paramInt;
      if (this.uaB != null) {
        i = paramInt + b.a.a.a.fj(3, this.uaB.aYq());
      }
      paramInt = i;
      if (this.uaC != null) {
        paramInt = i + b.a.a.a.fj(4, this.uaC.aYq());
      }
      i = paramInt;
      if (this.uaD != null) {
        i = paramInt + b.a.a.a.fj(5, this.uaD.aYq());
      }
      paramInt = i;
      if (this.uaE != null) {
        paramInt = i + b.a.a.a.fj(6, this.uaE.aYq());
      }
      i = paramInt;
      if (this.uaF != null) {
        i = paramInt + b.a.a.a.fj(7, this.uaF.aYq());
      }
      i += b.a.a.a.fh(8, this.uaG);
      paramInt = i;
      if (this.uaH != null) {
        paramInt = i + b.a.a.a.fj(9, this.uaH.aYq());
      }
      i = paramInt;
      if (this.uaI != null) {
        i = paramInt + b.a.a.a.fj(10, this.uaI.aYq());
      }
      GMTrace.o(3877281726464L, 28888);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uaA == null) {
        throw new b("Not all required fields were included: DnsInfo");
      }
      GMTrace.o(3877281726464L, 28888);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      xz localxz = (xz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3877281726464L, 28888);
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
          localxz.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3877281726464L, 28888);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxz.uaA = ((iy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3877281726464L, 28888);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxz.uaB = ((iy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3877281726464L, 28888);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxz.uaC = ((iy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3877281726464L, 28888);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxz.uaD = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3877281726464L, 28888);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxz.uaE = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3877281726464L, 28888);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxz.uaF = ((iy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3877281726464L, 28888);
        return 0;
      case 8: 
        localxz.uaG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3877281726464L, 28888);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ix();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ix)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localxz.uaH = ((ix)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3877281726464L, 28888);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ix();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ix)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localxz.uaI = ((ix)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3877281726464L, 28888);
      return 0;
    }
    GMTrace.o(3877281726464L, 28888);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\xz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */