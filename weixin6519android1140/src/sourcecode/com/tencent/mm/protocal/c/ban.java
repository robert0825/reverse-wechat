package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ban
  extends com.tencent.mm.bm.a
{
  public int tTJ;
  public azp uqp;
  public String uqq;
  public long uqs;
  
  public ban()
  {
    GMTrace.i(3833526747136L, 28562);
    GMTrace.o(3833526747136L, 28562);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3833660964864L, 28563);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uqq == null) {
        throw new b("Not all required fields were included: KeyWord");
      }
      paramVarArgs.fk(1, this.tTJ);
      if (this.uqq != null) {
        paramVarArgs.e(2, this.uqq);
      }
      if (this.uqp != null)
      {
        paramVarArgs.fm(3, this.uqp.aYq());
        this.uqp.a(paramVarArgs);
      }
      paramVarArgs.T(4, this.uqs);
      GMTrace.o(3833660964864L, 28563);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tTJ) + 0;
      paramInt = i;
      if (this.uqq != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uqq);
      }
      i = paramInt;
      if (this.uqp != null) {
        i = paramInt + b.a.a.a.fj(3, this.uqp.aYq());
      }
      paramInt = b.a.a.a.S(4, this.uqs);
      GMTrace.o(3833660964864L, 28563);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uqq == null) {
        throw new b("Not all required fields were included: KeyWord");
      }
      GMTrace.o(3833660964864L, 28563);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ban localban = (ban)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3833660964864L, 28563);
        return -1;
      case 1: 
        localban.tTJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3833660964864L, 28563);
        return 0;
      case 2: 
        localban.uqq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3833660964864L, 28563);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localban.uqp = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3833660964864L, 28563);
        return 0;
      }
      localban.uqs = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3833660964864L, 28563);
      return 0;
    }
    GMTrace.o(3833660964864L, 28563);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ban.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */