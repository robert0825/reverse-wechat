package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class acx
  extends azh
{
  public azp usU;
  public azp usV;
  public azp usW;
  
  public acx()
  {
    GMTrace.i(3894193160192L, 29014);
    GMTrace.o(3894193160192L, 29014);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3894327377920L, 29015);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.usU == null) {
        throw new b("Not all required fields were included: SongLyric");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.usU != null)
      {
        paramVarArgs.fm(2, this.usU.aYq());
        this.usU.a(paramVarArgs);
      }
      if (this.usV != null)
      {
        paramVarArgs.fm(3, this.usV.aYq());
        this.usV.a(paramVarArgs);
      }
      if (this.usW != null)
      {
        paramVarArgs.fm(4, this.usW.aYq());
        this.usW.a(paramVarArgs);
      }
      GMTrace.o(3894327377920L, 29015);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.usU != null) {
        paramInt = i + b.a.a.a.fj(2, this.usU.aYq());
      }
      i = paramInt;
      if (this.usV != null) {
        i = paramInt + b.a.a.a.fj(3, this.usV.aYq());
      }
      paramInt = i;
      if (this.usW != null) {
        paramInt = i + b.a.a.a.fj(4, this.usW.aYq());
      }
      GMTrace.o(3894327377920L, 29015);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.usU == null) {
        throw new b("Not all required fields were included: SongLyric");
      }
      GMTrace.o(3894327377920L, 29015);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      acx localacx = (acx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3894327377920L, 29015);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localacx.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3894327377920L, 29015);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localacx.usU = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3894327377920L, 29015);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localacx.usV = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3894327377920L, 29015);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localacx.usW = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3894327377920L, 29015);
      return 0;
    }
    GMTrace.o(3894327377920L, 29015);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\acx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */