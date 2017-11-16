package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ox
  extends com.tencent.mm.bm.a
{
  public long tQd;
  public int ufC;
  public azq ufy;
  
  public ox()
  {
    GMTrace.i(13342986993664L, 99413);
    GMTrace.o(13342986993664L, 99413);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13343121211392L, 99414);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.ufy != null)
      {
        paramVarArgs.fm(1, this.ufy.aYq());
        this.ufy.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.ufC);
      paramVarArgs.T(3, this.tQd);
      GMTrace.o(13343121211392L, 99414);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ufy != null) {
        paramInt = b.a.a.a.fj(1, this.ufy.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.ufC);
      int j = b.a.a.a.S(3, this.tQd);
      GMTrace.o(13343121211392L, 99414);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ufy == null) {
        throw new b("Not all required fields were included: UserName");
      }
      GMTrace.o(13343121211392L, 99414);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ox localox = (ox)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13343121211392L, 99414);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localox.ufy = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13343121211392L, 99414);
        return 0;
      case 2: 
        localox.ufC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13343121211392L, 99414);
        return 0;
      }
      localox.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(13343121211392L, 99414);
      return 0;
    }
    GMTrace.o(13343121211392L, 99414);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */