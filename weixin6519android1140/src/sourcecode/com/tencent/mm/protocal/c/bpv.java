package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpv
  extends ayx
{
  public double tWm;
  public double tWn;
  public int udE;
  public int uhU;
  public long uhV;
  public LinkedList<bgx> uru;
  public long vab;
  public azq vac;
  public azq vad;
  public int vae;
  
  public bpv()
  {
    GMTrace.i(3825473683456L, 28502);
    this.uru = new LinkedList();
    GMTrace.o(3825473683456L, 28502);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3825607901184L, 28503);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vac == null) {
        throw new b("Not all required fields were included: NetName");
      }
      if (this.vad == null) {
        throw new b("Not all required fields were included: WifiName");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.T(2, this.vab);
      paramVarArgs.T(3, this.uhV);
      paramVarArgs.fk(4, this.udE);
      if (this.vac != null)
      {
        paramVarArgs.fm(5, this.vac.aYq());
        this.vac.a(paramVarArgs);
      }
      if (this.vad != null)
      {
        paramVarArgs.fm(6, this.vad.aYq());
        this.vad.a(paramVarArgs);
      }
      paramVarArgs.a(7, this.tWm);
      paramVarArgs.a(8, this.tWn);
      paramVarArgs.fk(9, this.uhU);
      paramVarArgs.fk(10, this.vae);
      paramVarArgs.d(11, 8, this.uru);
      GMTrace.o(3825607901184L, 28503);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.S(2, this.vab) + b.a.a.a.S(3, this.uhV) + b.a.a.a.fh(4, this.udE);
      paramInt = i;
      if (this.vac != null) {
        paramInt = i + b.a.a.a.fj(5, this.vac.aYq());
      }
      i = paramInt;
      if (this.vad != null) {
        i = paramInt + b.a.a.a.fj(6, this.vad.aYq());
      }
      paramInt = b.a.a.b.b.a.cK(7);
      int j = b.a.a.b.b.a.cK(8);
      int k = b.a.a.a.fh(9, this.uhU);
      int m = b.a.a.a.fh(10, this.vae);
      int n = b.a.a.a.c(11, 8, this.uru);
      GMTrace.o(3825607901184L, 28503);
      return i + (paramInt + 8) + (j + 8) + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uru.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.vac == null) {
        throw new b("Not all required fields were included: NetName");
      }
      if (this.vad == null) {
        throw new b("Not all required fields were included: WifiName");
      }
      GMTrace.o(3825607901184L, 28503);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpv localbpv = (bpv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3825607901184L, 28503);
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
          localbpv.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3825607901184L, 28503);
        return 0;
      case 2: 
        localbpv.vab = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3825607901184L, 28503);
        return 0;
      case 3: 
        localbpv.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3825607901184L, 28503);
        return 0;
      case 4: 
        localbpv.udE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3825607901184L, 28503);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbpv.vac = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3825607901184L, 28503);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbpv.vad = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3825607901184L, 28503);
        return 0;
      case 7: 
        localbpv.tWm = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3825607901184L, 28503);
        return 0;
      case 8: 
        localbpv.tWn = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3825607901184L, 28503);
        return 0;
      case 9: 
        localbpv.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3825607901184L, 28503);
        return 0;
      case 10: 
        localbpv.vae = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3825607901184L, 28503);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bgx();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bgx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbpv.uru.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3825607901184L, 28503);
      return 0;
    }
    GMTrace.o(3825607901184L, 28503);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */