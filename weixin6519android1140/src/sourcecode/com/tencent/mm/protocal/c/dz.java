package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class dz
  extends com.tencent.mm.bm.a
{
  public ea tSC;
  public dx tSD;
  
  public dz()
  {
    GMTrace.i(13574915227648L, 101141);
    GMTrace.o(13574915227648L, 101141);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13575049445376L, 101142);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSC == null) {
        throw new b("Not all required fields were included: RsaReqData");
      }
      if (this.tSD == null) {
        throw new b("Not all required fields were included: AesReqData");
      }
      if (this.tSC != null)
      {
        paramVarArgs.fm(1, this.tSC.aYq());
        this.tSC.a(paramVarArgs);
      }
      if (this.tSD != null)
      {
        paramVarArgs.fm(2, this.tSD.aYq());
        this.tSD.a(paramVarArgs);
      }
      GMTrace.o(13575049445376L, 101142);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tSC != null) {
        paramInt = b.a.a.a.fj(1, this.tSC.aYq()) + 0;
      }
      i = paramInt;
      if (this.tSD != null) {
        i = paramInt + b.a.a.a.fj(2, this.tSD.aYq());
      }
      GMTrace.o(13575049445376L, 101142);
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
      if (this.tSC == null) {
        throw new b("Not all required fields were included: RsaReqData");
      }
      if (this.tSD == null) {
        throw new b("Not all required fields were included: AesReqData");
      }
      GMTrace.o(13575049445376L, 101142);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      dz localdz = (dz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13575049445376L, 101142);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ea();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ea)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdz.tSC = ((ea)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13575049445376L, 101142);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new dx();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((dx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localdz.tSD = ((dx)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13575049445376L, 101142);
      return 0;
    }
    GMTrace.o(13575049445376L, 101142);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\dz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */