package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bjh
  extends ayx
{
  public String qpg;
  public String qph;
  public int scene;
  
  public bjh()
  {
    GMTrace.i(20214129360896L, 150607);
    GMTrace.o(20214129360896L, 150607);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20214263578624L, 150608);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.scene);
      if (this.qpg != null) {
        paramVarArgs.e(3, this.qpg);
      }
      if (this.qph != null) {
        paramVarArgs.e(4, this.qph);
      }
      GMTrace.o(20214263578624L, 150608);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.scene);
      paramInt = i;
      if (this.qpg != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.qpg);
      }
      i = paramInt;
      if (this.qph != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.qph);
      }
      GMTrace.o(20214263578624L, 150608);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(20214263578624L, 150608);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bjh localbjh = (bjh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(20214263578624L, 150608);
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
          localbjh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20214263578624L, 150608);
        return 0;
      case 2: 
        localbjh.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20214263578624L, 150608);
        return 0;
      case 3: 
        localbjh.qpg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20214263578624L, 150608);
        return 0;
      }
      localbjh.qph = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(20214263578624L, 150608);
      return 0;
    }
    GMTrace.o(20214263578624L, 150608);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bjh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */