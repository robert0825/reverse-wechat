package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class p
  extends ayx
{
  public String omN;
  public int scene;
  public String tLZ;
  public String tMa;
  public long tMs;
  public String tMu;
  
  public p()
  {
    GMTrace.i(16870363103232L, 125694);
    GMTrace.o(16870363103232L, 125694);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16870497320960L, 125695);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tLZ != null) {
        paramVarArgs.e(2, this.tLZ);
      }
      paramVarArgs.T(3, this.tMs);
      paramVarArgs.fk(4, this.scene);
      if (this.tMa != null) {
        paramVarArgs.e(5, this.tMa);
      }
      if (this.tMu != null) {
        paramVarArgs.e(6, this.tMu);
      }
      if (this.omN != null) {
        paramVarArgs.e(7, this.omN);
      }
      GMTrace.o(16870497320960L, 125695);
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
      if (this.tLZ != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tLZ);
      }
      i = i + b.a.a.a.S(3, this.tMs) + b.a.a.a.fh(4, this.scene);
      paramInt = i;
      if (this.tMa != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tMa);
      }
      i = paramInt;
      if (this.tMu != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tMu);
      }
      paramInt = i;
      if (this.omN != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.omN);
      }
      GMTrace.o(16870497320960L, 125695);
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
      GMTrace.o(16870497320960L, 125695);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      p localp = (p)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(16870497320960L, 125695);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localp.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16870497320960L, 125695);
        return 0;
      case 2: 
        localp.tLZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16870497320960L, 125695);
        return 0;
      case 3: 
        localp.tMs = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(16870497320960L, 125695);
        return 0;
      case 4: 
        localp.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(16870497320960L, 125695);
        return 0;
      case 5: 
        localp.tMa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16870497320960L, 125695);
        return 0;
      case 6: 
        localp.tMu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16870497320960L, 125695);
        return 0;
      }
      localp.omN = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(16870497320960L, 125695);
      return 0;
    }
    GMTrace.o(16870497320960L, 125695);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */