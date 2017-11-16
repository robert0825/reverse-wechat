package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqc
  extends azh
{
  public LinkedList<aqf> lPH;
  public LinkedList<uq> tQs;
  public int uFX;
  public int uFY;
  
  public aqc()
  {
    GMTrace.i(4003849043968L, 29831);
    this.lPH = new LinkedList();
    this.tQs = new LinkedList();
    GMTrace.o(4003849043968L, 29831);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4003983261696L, 29832);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uFX);
      paramVarArgs.d(3, 8, this.lPH);
      paramVarArgs.fk(4, this.uFY);
      paramVarArgs.d(5, 8, this.tQs);
      GMTrace.o(4003983261696L, 29832);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uFX);
      int j = b.a.a.a.c(3, 8, this.lPH);
      int k = b.a.a.a.fh(4, this.uFY);
      int m = b.a.a.a.c(5, 8, this.tQs);
      GMTrace.o(4003983261696L, 29832);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lPH.clear();
      this.tQs.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(4003983261696L, 29832);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqc localaqc = (aqc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4003983261696L, 29832);
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
          localaqc.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4003983261696L, 29832);
        return 0;
      case 2: 
        localaqc.uFX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4003983261696L, 29832);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aqf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aqf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaqc.lPH.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4003983261696L, 29832);
        return 0;
      case 4: 
        localaqc.uFY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4003983261696L, 29832);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new uq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((uq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localaqc.tQs.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(4003983261696L, 29832);
      return 0;
    }
    GMTrace.o(4003983261696L, 29832);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aqc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */