package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class asc
  extends com.tencent.mm.bm.a
{
  public azp uIa;
  public int uIb;
  public azp uIc;
  public int uin;
  public int version;
  
  public asc()
  {
    GMTrace.i(3745345699840L, 27905);
    GMTrace.o(3745345699840L, 27905);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3745479917568L, 27906);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.uin);
      paramVarArgs.fk(2, this.version);
      if (this.uIa != null)
      {
        paramVarArgs.fm(3, this.uIa.aYq());
        this.uIa.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.uIb);
      if (this.uIc != null)
      {
        paramVarArgs.fm(5, this.uIc.aYq());
        this.uIc.a(paramVarArgs);
      }
      GMTrace.o(3745479917568L, 27906);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uin) + 0 + b.a.a.a.fh(2, this.version);
      paramInt = i;
      if (this.uIa != null) {
        paramInt = i + b.a.a.a.fj(3, this.uIa.aYq());
      }
      i = paramInt + b.a.a.a.fh(4, this.uIb);
      paramInt = i;
      if (this.uIc != null) {
        paramInt = i + b.a.a.a.fj(5, this.uIc.aYq());
      }
      GMTrace.o(3745479917568L, 27906);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3745479917568L, 27906);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      asc localasc = (asc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3745479917568L, 27906);
        return -1;
      case 1: 
        localasc.uin = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3745479917568L, 27906);
        return 0;
      case 2: 
        localasc.version = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3745479917568L, 27906);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localasc.uIa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3745479917568L, 27906);
        return 0;
      case 4: 
        localasc.uIb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3745479917568L, 27906);
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
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localasc.uIc = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3745479917568L, 27906);
      return 0;
    }
    GMTrace.o(3745479917568L, 27906);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\asc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */