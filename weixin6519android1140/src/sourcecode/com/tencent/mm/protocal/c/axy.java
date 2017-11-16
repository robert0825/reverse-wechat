package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axy
  extends ayx
{
  public int jib;
  public int lQE;
  public bmv uMu;
  public bjl uMv;
  public String uif;
  
  public axy()
  {
    GMTrace.i(3664680845312L, 27304);
    GMTrace.o(3664680845312L, 27304);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3664815063040L, 27305);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uMu == null) {
        throw new b("Not all required fields were included: UserPosition");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uif != null) {
        paramVarArgs.e(2, this.uif);
      }
      paramVarArgs.fk(3, this.jib);
      if (this.uMu != null)
      {
        paramVarArgs.fm(4, this.uMu.aYq());
        this.uMu.a(paramVarArgs);
      }
      paramVarArgs.fk(5, this.lQE);
      if (this.uMv != null)
      {
        paramVarArgs.fm(6, this.uMv.aYq());
        this.uMv.a(paramVarArgs);
      }
      GMTrace.o(3664815063040L, 27305);
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
      if (this.uif != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uif);
      }
      i += b.a.a.a.fh(3, this.jib);
      paramInt = i;
      if (this.uMu != null) {
        paramInt = i + b.a.a.a.fj(4, this.uMu.aYq());
      }
      i = paramInt + b.a.a.a.fh(5, this.lQE);
      paramInt = i;
      if (this.uMv != null) {
        paramInt = i + b.a.a.a.fj(6, this.uMv.aYq());
      }
      GMTrace.o(3664815063040L, 27305);
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
      if (this.uMu == null) {
        throw new b("Not all required fields were included: UserPosition");
      }
      GMTrace.o(3664815063040L, 27305);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axy localaxy = (axy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3664815063040L, 27305);
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
          localaxy.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3664815063040L, 27305);
        return 0;
      case 2: 
        localaxy.uif = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3664815063040L, 27305);
        return 0;
      case 3: 
        localaxy.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3664815063040L, 27305);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bmv();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bmv)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaxy.uMu = ((bmv)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3664815063040L, 27305);
        return 0;
      case 5: 
        localaxy.lQE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3664815063040L, 27305);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bjl();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bjl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localaxy.uMv = ((bjl)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3664815063040L, 27305);
      return 0;
    }
    GMTrace.o(3664815063040L, 27305);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\axy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */