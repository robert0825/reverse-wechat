package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class jy
  extends com.tencent.mm.bm.a
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
  
  public jy()
  {
    GMTrace.i(15234114781184L, 113503);
    GMTrace.o(15234114781184L, 113503);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15234248998912L, 113504);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uaA != null)
      {
        paramVarArgs.fm(1, this.uaA.aYq());
        this.uaA.a(paramVarArgs);
      }
      if (this.uaB != null)
      {
        paramVarArgs.fm(2, this.uaB.aYq());
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
      GMTrace.o(15234248998912L, 113504);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uaA != null) {
        i = b.a.a.a.fj(1, this.uaA.aYq()) + 0;
      }
      paramInt = i;
      if (this.uaB != null) {
        paramInt = i + b.a.a.a.fj(2, this.uaB.aYq());
      }
      i = paramInt;
      if (this.uaC != null) {
        i = paramInt + b.a.a.a.fj(4, this.uaC.aYq());
      }
      paramInt = i;
      if (this.uaD != null) {
        paramInt = i + b.a.a.a.fj(5, this.uaD.aYq());
      }
      i = paramInt;
      if (this.uaE != null) {
        i = paramInt + b.a.a.a.fj(6, this.uaE.aYq());
      }
      paramInt = i;
      if (this.uaF != null) {
        paramInt = i + b.a.a.a.fj(7, this.uaF.aYq());
      }
      i = paramInt + b.a.a.a.fh(8, this.uaG);
      paramInt = i;
      if (this.uaH != null) {
        paramInt = i + b.a.a.a.fj(9, this.uaH.aYq());
      }
      i = paramInt;
      if (this.uaI != null) {
        i = paramInt + b.a.a.a.fj(10, this.uaI.aYq());
      }
      GMTrace.o(15234248998912L, 113504);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(15234248998912L, 113504);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      jy localjy = (jy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 3: 
      default: 
        GMTrace.o(15234248998912L, 113504);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new iy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((iy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjy.uaA = ((iy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15234248998912L, 113504);
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
          for (bool = true; bool; bool = ((iy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjy.uaB = ((iy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15234248998912L, 113504);
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
          for (bool = true; bool; bool = ((iy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjy.uaC = ((iy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15234248998912L, 113504);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjy.uaD = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15234248998912L, 113504);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjy.uaE = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15234248998912L, 113504);
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
          for (bool = true; bool; bool = ((iy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjy.uaF = ((iy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15234248998912L, 113504);
        return 0;
      case 8: 
        localjy.uaG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(15234248998912L, 113504);
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
          for (bool = true; bool; bool = ((ix)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localjy.uaH = ((ix)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15234248998912L, 113504);
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
        for (bool = true; bool; bool = ((ix)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localjy.uaI = ((ix)localObject1);
        paramInt += 1;
      }
      GMTrace.o(15234248998912L, 113504);
      return 0;
    }
    GMTrace.o(15234248998912L, 113504);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\jy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */