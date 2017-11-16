package com.tencent.mm.protocal.a.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class h
  extends com.tencent.mm.bm.a
{
  public int ret;
  public int tLg;
  public int tLh;
  public o tLi;
  public o tLj;
  public int tLk;
  public int tLl;
  public int tLz;
  
  public h()
  {
    GMTrace.i(13103274131456L, 97627);
    GMTrace.o(13103274131456L, 97627);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13103408349184L, 97628);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ret);
      paramVarArgs.fk(2, this.tLg);
      paramVarArgs.fk(3, this.tLh);
      if (this.tLi != null)
      {
        paramVarArgs.fm(4, this.tLi.aYq());
        this.tLi.a(paramVarArgs);
      }
      if (this.tLj != null)
      {
        paramVarArgs.fm(5, this.tLj.aYq());
        this.tLj.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.tLk);
      paramVarArgs.fk(7, this.tLz);
      paramVarArgs.fk(8, this.tLl);
      GMTrace.o(13103408349184L, 97628);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.ret) + 0 + b.a.a.a.fh(2, this.tLg) + b.a.a.a.fh(3, this.tLh);
      paramInt = i;
      if (this.tLi != null) {
        paramInt = i + b.a.a.a.fj(4, this.tLi.aYq());
      }
      i = paramInt;
      if (this.tLj != null) {
        i = paramInt + b.a.a.a.fj(5, this.tLj.aYq());
      }
      paramInt = b.a.a.a.fh(6, this.tLk);
      int j = b.a.a.a.fh(7, this.tLz);
      int k = b.a.a.a.fh(8, this.tLl);
      GMTrace.o(13103408349184L, 97628);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13103408349184L, 97628);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      h localh = (h)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13103408349184L, 97628);
        return -1;
      case 1: 
        localh.ret = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103408349184L, 97628);
        return 0;
      case 2: 
        localh.tLg = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103408349184L, 97628);
        return 0;
      case 3: 
        localh.tLh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103408349184L, 97628);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new o();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((o)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localh.tLi = ((o)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13103408349184L, 97628);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new o();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((o)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localh.tLj = ((o)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13103408349184L, 97628);
        return 0;
      case 6: 
        localh.tLk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103408349184L, 97628);
        return 0;
      case 7: 
        localh.tLz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13103408349184L, 97628);
        return 0;
      }
      localh.tLl = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13103408349184L, 97628);
      return 0;
    }
    GMTrace.o(13103408349184L, 97628);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */