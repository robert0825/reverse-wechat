package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aap
  extends ayx
{
  public String jhi;
  public int tRC;
  public int tRD;
  public int urk;
  public int urm;
  public String urn;
  public int uro;
  
  public aap()
  {
    GMTrace.i(3627099881472L, 27024);
    GMTrace.o(3627099881472L, 27024);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3627234099200L, 27025);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      paramVarArgs.fk(3, this.urk);
      paramVarArgs.fk(4, this.urm);
      if (this.urn != null) {
        paramVarArgs.e(5, this.urn);
      }
      paramVarArgs.fk(6, this.tRC);
      paramVarArgs.fk(7, this.tRD);
      paramVarArgs.fk(8, this.uro);
      GMTrace.o(3627234099200L, 27025);
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
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jhi);
      }
      i = i + b.a.a.a.fh(3, this.urk) + b.a.a.a.fh(4, this.urm);
      paramInt = i;
      if (this.urn != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.urn);
      }
      i = b.a.a.a.fh(6, this.tRC);
      int j = b.a.a.a.fh(7, this.tRD);
      int k = b.a.a.a.fh(8, this.uro);
      GMTrace.o(3627234099200L, 27025);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3627234099200L, 27025);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aap localaap = (aap)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3627234099200L, 27025);
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
          localaap.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3627234099200L, 27025);
        return 0;
      case 2: 
        localaap.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3627234099200L, 27025);
        return 0;
      case 3: 
        localaap.urk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3627234099200L, 27025);
        return 0;
      case 4: 
        localaap.urm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3627234099200L, 27025);
        return 0;
      case 5: 
        localaap.urn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3627234099200L, 27025);
        return 0;
      case 6: 
        localaap.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3627234099200L, 27025);
        return 0;
      case 7: 
        localaap.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3627234099200L, 27025);
        return 0;
      }
      localaap.uro = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3627234099200L, 27025);
      return 0;
    }
    GMTrace.o(3627234099200L, 27025);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */