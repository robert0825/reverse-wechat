package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class u
  extends ayx
{
  public int scene;
  public String sign;
  public String tLZ;
  public String tMa;
  public int ver;
  
  public u()
  {
    GMTrace.i(3947074945024L, 29408);
    GMTrace.o(3947074945024L, 29408);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3947209162752L, 29409);
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
      paramVarArgs.fk(3, this.scene);
      if (this.tMa != null) {
        paramVarArgs.e(4, this.tMa);
      }
      if (this.sign != null) {
        paramVarArgs.e(5, this.sign);
      }
      paramVarArgs.fk(6, this.ver);
      GMTrace.o(3947209162752L, 29409);
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
      i += b.a.a.a.fh(3, this.scene);
      paramInt = i;
      if (this.tMa != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tMa);
      }
      i = paramInt;
      if (this.sign != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.sign);
      }
      paramInt = b.a.a.a.fh(6, this.ver);
      GMTrace.o(3947209162752L, 29409);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3947209162752L, 29409);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      u localu = (u)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3947209162752L, 29409);
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
          localu.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3947209162752L, 29409);
        return 0;
      case 2: 
        localu.tLZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3947209162752L, 29409);
        return 0;
      case 3: 
        localu.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3947209162752L, 29409);
        return 0;
      case 4: 
        localu.tMa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3947209162752L, 29409);
        return 0;
      case 5: 
        localu.sign = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3947209162752L, 29409);
        return 0;
      }
      localu.ver = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3947209162752L, 29409);
      return 0;
    }
    GMTrace.o(3947209162752L, 29409);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */