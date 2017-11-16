package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class axh
  extends ayx
{
  public String eSd;
  public int jWT;
  public int scene;
  public String uMj;
  
  public axh()
  {
    GMTrace.i(3930968817664L, 29288);
    GMTrace.o(3930968817664L, 29288);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3931103035392L, 29289);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jWT);
      if (this.uMj != null) {
        paramVarArgs.e(3, this.uMj);
      }
      if (this.eSd != null) {
        paramVarArgs.e(4, this.eSd);
      }
      paramVarArgs.fk(5, this.scene);
      GMTrace.o(3931103035392L, 29289);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWT);
      paramInt = i;
      if (this.uMj != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uMj);
      }
      i = paramInt;
      if (this.eSd != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.eSd);
      }
      paramInt = b.a.a.a.fh(5, this.scene);
      GMTrace.o(3931103035392L, 29289);
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
      GMTrace.o(3931103035392L, 29289);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      axh localaxh = (axh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3931103035392L, 29289);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaxh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3931103035392L, 29289);
        return 0;
      case 2: 
        localaxh.jWT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3931103035392L, 29289);
        return 0;
      case 3: 
        localaxh.uMj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3931103035392L, 29289);
        return 0;
      case 4: 
        localaxh.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3931103035392L, 29289);
        return 0;
      }
      localaxh.scene = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3931103035392L, 29289);
      return 0;
    }
    GMTrace.o(3931103035392L, 29289);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\axh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */