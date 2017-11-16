package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class gp
  extends ayx
{
  public String mac;
  public String tVn;
  public String tVo;
  public long tVp;
  
  public gp()
  {
    GMTrace.i(3875536896000L, 28875);
    GMTrace.o(3875536896000L, 28875);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3875671113728L, 28876);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tVn != null) {
        paramVarArgs.e(2, this.tVn);
      }
      if (this.tVo != null) {
        paramVarArgs.e(3, this.tVo);
      }
      if (this.mac != null) {
        paramVarArgs.e(4, this.mac);
      }
      paramVarArgs.T(5, this.tVp);
      GMTrace.o(3875671113728L, 28876);
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
      if (this.tVn != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tVn);
      }
      i = paramInt;
      if (this.tVo != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tVo);
      }
      paramInt = i;
      if (this.mac != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.mac);
      }
      i = b.a.a.a.S(5, this.tVp);
      GMTrace.o(3875671113728L, 28876);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3875671113728L, 28876);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      gp localgp = (gp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3875671113728L, 28876);
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
          localgp.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3875671113728L, 28876);
        return 0;
      case 2: 
        localgp.tVn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3875671113728L, 28876);
        return 0;
      case 3: 
        localgp.tVo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3875671113728L, 28876);
        return 0;
      case 4: 
        localgp.mac = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3875671113728L, 28876);
        return 0;
      }
      localgp.tVp = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3875671113728L, 28876);
      return 0;
    }
    GMTrace.o(3875671113728L, 28876);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\gp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */