package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class alw
  extends ayx
{
  public int jhc;
  public LinkedList<agn> jhd;
  public int tXv;
  public int uAP;
  
  public alw()
  {
    GMTrace.i(3928284463104L, 29268);
    this.jhd = new LinkedList();
    GMTrace.o(3928284463104L, 29268);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3928418680832L, 29269);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jhc);
      paramVarArgs.d(3, 8, this.jhd);
      paramVarArgs.fk(4, this.tXv);
      paramVarArgs.fk(5, this.uAP);
      GMTrace.o(3928418680832L, 29269);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.jhc);
      int j = b.a.a.a.c(3, 8, this.jhd);
      int k = b.a.a.a.fh(4, this.tXv);
      int m = b.a.a.a.fh(5, this.uAP);
      GMTrace.o(3928418680832L, 29269);
      return paramInt + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jhd.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3928418680832L, 29269);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      alw localalw = (alw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3928418680832L, 29269);
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
          localalw.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3928418680832L, 29269);
        return 0;
      case 2: 
        localalw.jhc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3928418680832L, 29269);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new agn();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((agn)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localalw.jhd.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3928418680832L, 29269);
        return 0;
      case 4: 
        localalw.tXv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3928418680832L, 29269);
        return 0;
      }
      localalw.uAP = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3928418680832L, 29269);
      return 0;
    }
    GMTrace.o(3928418680832L, 29269);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\alw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */