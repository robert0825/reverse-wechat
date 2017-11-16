package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aab
  extends ayx
{
  public int tOG;
  public azp tQz;
  public int tTJ;
  public int uqG;
  
  public aab()
  {
    GMTrace.i(3922378883072L, 29224);
    GMTrace.o(3922378883072L, 29224);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3922513100800L, 29225);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tQz != null)
      {
        paramVarArgs.fm(2, this.tQz.aYq());
        this.tQz.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.tTJ);
      paramVarArgs.fk(4, this.tOG);
      paramVarArgs.fk(5, this.uqG);
      GMTrace.o(3922513100800L, 29225);
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
      if (this.tQz != null) {
        i = paramInt + b.a.a.a.fj(2, this.tQz.aYq());
      }
      paramInt = b.a.a.a.fh(3, this.tTJ);
      int j = b.a.a.a.fh(4, this.tOG);
      int k = b.a.a.a.fh(5, this.uqG);
      GMTrace.o(3922513100800L, 29225);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      GMTrace.o(3922513100800L, 29225);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aab localaab = (aab)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3922513100800L, 29225);
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
          localaab.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3922513100800L, 29225);
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
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaab.tQz = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3922513100800L, 29225);
        return 0;
      case 3: 
        localaab.tTJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3922513100800L, 29225);
        return 0;
      case 4: 
        localaab.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3922513100800L, 29225);
        return 0;
      }
      localaab.uqG = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3922513100800L, 29225);
      return 0;
    }
    GMTrace.o(3922513100800L, 29225);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */