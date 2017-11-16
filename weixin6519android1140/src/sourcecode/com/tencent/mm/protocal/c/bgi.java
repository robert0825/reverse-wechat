package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bgi
  extends ayx
{
  public long uQA;
  public azp uQg;
  public String uQz;
  public long uRW;
  public int uRX;
  public long uRY;
  public int uRZ;
  
  public bgi()
  {
    GMTrace.i(3898488127488L, 29046);
    GMTrace.o(3898488127488L, 29046);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3898622345216L, 29047);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uQz != null) {
        paramVarArgs.e(2, this.uQz);
      }
      paramVarArgs.T(3, this.uQA);
      paramVarArgs.T(4, this.uRW);
      paramVarArgs.fk(5, this.uRX);
      paramVarArgs.T(6, this.uRY);
      if (this.uQg != null)
      {
        paramVarArgs.fm(7, this.uQg.aYq());
        this.uQg.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.uRZ);
      GMTrace.o(3898622345216L, 29047);
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
      if (this.uQz != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uQz);
      }
      i = i + b.a.a.a.S(3, this.uQA) + b.a.a.a.S(4, this.uRW) + b.a.a.a.fh(5, this.uRX) + b.a.a.a.S(6, this.uRY);
      paramInt = i;
      if (this.uQg != null) {
        paramInt = i + b.a.a.a.fj(7, this.uQg.aYq());
      }
      i = b.a.a.a.fh(8, this.uRZ);
      GMTrace.o(3898622345216L, 29047);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3898622345216L, 29047);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bgi localbgi = (bgi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3898622345216L, 29047);
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
          localbgi.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 2: 
        localbgi.uQz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 3: 
        localbgi.uQA = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 4: 
        localbgi.uRW = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 5: 
        localbgi.uRX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 6: 
        localbgi.uRY = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3898622345216L, 29047);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbgi.uQg = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3898622345216L, 29047);
        return 0;
      }
      localbgi.uRZ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3898622345216L, 29047);
      return 0;
    }
    GMTrace.o(3898622345216L, 29047);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bgi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */