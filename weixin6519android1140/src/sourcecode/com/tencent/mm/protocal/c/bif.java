package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bif
  extends ayx
{
  public String uTK;
  public int umZ;
  
  public bif()
  {
    GMTrace.i(4045053886464L, 30138);
    GMTrace.o(4045053886464L, 30138);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4045188104192L, 30139);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.umZ);
      if (this.uTK != null) {
        paramVarArgs.e(3, this.uTK);
      }
      GMTrace.o(4045188104192L, 30139);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.umZ);
      paramInt = i;
      if (this.uTK != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uTK);
      }
      GMTrace.o(4045188104192L, 30139);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4045188104192L, 30139);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bif localbif = (bif)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4045188104192L, 30139);
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
          localbif.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4045188104192L, 30139);
        return 0;
      case 2: 
        localbif.umZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4045188104192L, 30139);
        return 0;
      }
      localbif.uTK = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4045188104192L, 30139);
      return 0;
    }
    GMTrace.o(4045188104192L, 30139);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bif.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */