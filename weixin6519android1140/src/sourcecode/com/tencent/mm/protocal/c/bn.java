package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bn
  extends ayx
{
  public String lPM;
  public String lTf;
  public int tMZ;
  public String tNa;
  
  public bn()
  {
    GMTrace.i(3781047615488L, 28171);
    GMTrace.o(3781047615488L, 28171);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3781181833216L, 28172);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lTf != null) {
        paramVarArgs.e(2, this.lTf);
      }
      if (this.lPM != null) {
        paramVarArgs.e(3, this.lPM);
      }
      paramVarArgs.fk(4, this.tMZ);
      if (this.tNa != null) {
        paramVarArgs.e(5, this.tNa);
      }
      GMTrace.o(3781181833216L, 28172);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.lTf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lTf);
      }
      i = paramInt;
      if (this.lPM != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPM);
      }
      i += b.a.a.a.fh(4, this.tMZ);
      paramInt = i;
      if (this.tNa != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tNa);
      }
      GMTrace.o(3781181833216L, 28172);
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
      GMTrace.o(3781181833216L, 28172);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bn localbn = (bn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3781181833216L, 28172);
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
          localbn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3781181833216L, 28172);
        return 0;
      case 2: 
        localbn.lTf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3781181833216L, 28172);
        return 0;
      case 3: 
        localbn.lPM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3781181833216L, 28172);
        return 0;
      case 4: 
        localbn.tMZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3781181833216L, 28172);
        return 0;
      }
      localbn.tNa = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3781181833216L, 28172);
      return 0;
    }
    GMTrace.o(3781181833216L, 28172);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */