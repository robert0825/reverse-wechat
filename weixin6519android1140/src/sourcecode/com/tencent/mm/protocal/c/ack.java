package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ack
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public azp tQz;
  public int uqo;
  
  public ack()
  {
    GMTrace.i(3742661345280L, 27885);
    GMTrace.o(3742661345280L, 27885);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3742795563008L, 27886);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      paramVarArgs.fk(1, this.uqo);
      if (this.tQz != null)
      {
        paramVarArgs.fm(2, this.tQz.aYq());
        this.tQz.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.tOG);
      GMTrace.o(3742795563008L, 27886);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uqo) + 0;
      paramInt = i;
      if (this.tQz != null) {
        paramInt = i + b.a.a.a.fj(2, this.tQz.aYq());
      }
      i = b.a.a.a.fh(3, this.tOG);
      GMTrace.o(3742795563008L, 27886);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      GMTrace.o(3742795563008L, 27886);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ack localack = (ack)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3742795563008L, 27886);
        return -1;
      case 1: 
        localack.uqo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3742795563008L, 27886);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localack.tQz = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3742795563008L, 27886);
        return 0;
      }
      localack.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3742795563008L, 27886);
      return 0;
    }
    GMTrace.o(3742795563008L, 27886);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */