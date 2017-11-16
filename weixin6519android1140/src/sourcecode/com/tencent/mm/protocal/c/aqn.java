package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aqn
  extends ayx
{
  public int tWr;
  public azp tWs;
  public int tWv;
  public int tWw;
  public String uGL;
  public String uGM;
  
  public aqn()
  {
    GMTrace.i(3621999607808L, 26986);
    GMTrace.o(3621999607808L, 26986);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3622133825536L, 26987);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tWs == null) {
        throw new b("Not all required fields were included: ImageBuffer");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tWr);
      if (this.tWs != null)
      {
        paramVarArgs.fm(3, this.tWs.aYq());
        this.tWs.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.tWv);
      if (this.uGL != null) {
        paramVarArgs.e(5, this.uGL);
      }
      if (this.uGM != null) {
        paramVarArgs.e(6, this.uGM);
      }
      paramVarArgs.fk(7, this.tWw);
      GMTrace.o(3622133825536L, 26987);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tWr);
      paramInt = i;
      if (this.tWs != null) {
        paramInt = i + b.a.a.a.fj(3, this.tWs.aYq());
      }
      i = paramInt + b.a.a.a.fh(4, this.tWv);
      paramInt = i;
      if (this.uGL != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uGL);
      }
      i = paramInt;
      if (this.uGM != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uGM);
      }
      paramInt = b.a.a.a.fh(7, this.tWw);
      GMTrace.o(3622133825536L, 26987);
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
      if (this.tWs == null) {
        throw new b("Not all required fields were included: ImageBuffer");
      }
      GMTrace.o(3622133825536L, 26987);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aqn localaqn = (aqn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3622133825536L, 26987);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaqn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3622133825536L, 26987);
        return 0;
      case 2: 
        localaqn.tWr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3622133825536L, 26987);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaqn.tWs = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3622133825536L, 26987);
        return 0;
      case 4: 
        localaqn.tWv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3622133825536L, 26987);
        return 0;
      case 5: 
        localaqn.uGL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3622133825536L, 26987);
        return 0;
      case 6: 
        localaqn.uGM = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3622133825536L, 26987);
        return 0;
      }
      localaqn.tWw = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3622133825536L, 26987);
      return 0;
    }
    GMTrace.o(3622133825536L, 26987);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */