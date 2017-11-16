package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class buc
  extends com.tencent.mm.bm.a
{
  public String utF;
  public azp utI;
  
  public buc()
  {
    GMTrace.i(13577733799936L, 101162);
    GMTrace.o(13577733799936L, 101162);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13577868017664L, 101163);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.utI == null) {
        throw new b("Not all required fields were included: VerifyBuff");
      }
      if (this.utF != null) {
        paramVarArgs.e(1, this.utF);
      }
      if (this.utI != null)
      {
        paramVarArgs.fm(2, this.utI.aYq());
        this.utI.a(paramVarArgs);
      }
      GMTrace.o(13577868017664L, 101163);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.utF != null) {
        paramInt = b.a.a.b.b.a.f(1, this.utF) + 0;
      }
      i = paramInt;
      if (this.utI != null) {
        i = paramInt + b.a.a.a.fj(2, this.utI.aYq());
      }
      GMTrace.o(13577868017664L, 101163);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.utI == null) {
        throw new b("Not all required fields were included: VerifyBuff");
      }
      GMTrace.o(13577868017664L, 101163);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      buc localbuc = (buc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13577868017664L, 101163);
        return -1;
      case 1: 
        localbuc.utF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13577868017664L, 101163);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbuc.utI = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13577868017664L, 101163);
      return 0;
    }
    GMTrace.o(13577868017664L, 101163);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\buc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */