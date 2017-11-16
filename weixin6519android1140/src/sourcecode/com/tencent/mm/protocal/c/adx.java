package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class adx
  extends ayx
{
  public int lPw;
  public String lQJ;
  public LinkedList<azq> lRf;
  public int lRx;
  public int lRy;
  public int utK;
  
  public adx()
  {
    GMTrace.i(4023579049984L, 29978);
    this.lRf = new LinkedList();
    GMTrace.o(4023579049984L, 29978);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4023713267712L, 29979);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.lPw);
      paramVarArgs.fk(3, this.lRx);
      paramVarArgs.fk(4, this.lRy);
      if (this.lQJ != null) {
        paramVarArgs.e(5, this.lQJ);
      }
      paramVarArgs.fk(6, this.utK);
      paramVarArgs.d(7, 8, this.lRf);
      GMTrace.o(4023713267712L, 29979);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.lPw) + b.a.a.a.fh(3, this.lRx) + b.a.a.a.fh(4, this.lRy);
      paramInt = i;
      if (this.lQJ != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.lQJ);
      }
      i = b.a.a.a.fh(6, this.utK);
      int j = b.a.a.a.c(7, 8, this.lRf);
      GMTrace.o(4023713267712L, 29979);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lRf.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4023713267712L, 29979);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      adx localadx = (adx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4023713267712L, 29979);
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
          localadx.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4023713267712L, 29979);
        return 0;
      case 2: 
        localadx.lPw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4023713267712L, 29979);
        return 0;
      case 3: 
        localadx.lRx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4023713267712L, 29979);
        return 0;
      case 4: 
        localadx.lRy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4023713267712L, 29979);
        return 0;
      case 5: 
        localadx.lQJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4023713267712L, 29979);
        return 0;
      case 6: 
        localadx.utK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4023713267712L, 29979);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localadx.lRf.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(4023713267712L, 29979);
      return 0;
    }
    GMTrace.o(4023713267712L, 29979);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\adx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */