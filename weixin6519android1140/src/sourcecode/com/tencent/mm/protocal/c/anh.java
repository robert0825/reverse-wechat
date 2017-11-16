package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class anh
  extends com.tencent.mm.bm.a
{
  public ani uCi;
  public ang uCj;
  
  public anh()
  {
    GMTrace.i(13574646792192L, 101139);
    GMTrace.o(13574646792192L, 101139);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13574781009920L, 101140);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uCi == null) {
        throw new b("Not all required fields were included: RsaReqData");
      }
      if (this.uCj == null) {
        throw new b("Not all required fields were included: AesReqData");
      }
      if (this.uCi != null)
      {
        paramVarArgs.fm(1, this.uCi.aYq());
        this.uCi.a(paramVarArgs);
      }
      if (this.uCj != null)
      {
        paramVarArgs.fm(2, this.uCj.aYq());
        this.uCj.a(paramVarArgs);
      }
      GMTrace.o(13574781009920L, 101140);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uCi != null) {
        paramInt = b.a.a.a.fj(1, this.uCi.aYq()) + 0;
      }
      i = paramInt;
      if (this.uCj != null) {
        i = paramInt + b.a.a.a.fj(2, this.uCj.aYq());
      }
      GMTrace.o(13574781009920L, 101140);
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
      if (this.uCi == null) {
        throw new b("Not all required fields were included: RsaReqData");
      }
      if (this.uCj == null) {
        throw new b("Not all required fields were included: AesReqData");
      }
      GMTrace.o(13574781009920L, 101140);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      anh localanh = (anh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13574781009920L, 101140);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ani();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ani)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localanh.uCi = ((ani)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13574781009920L, 101140);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ang();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ang)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localanh.uCj = ((ang)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13574781009920L, 101140);
      return 0;
    }
    GMTrace.o(13574781009920L, 101140);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\anh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */