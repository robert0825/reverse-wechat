package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class zr
  extends ayx
{
  public int scene;
  public LinkedList<String> uqw;
  
  public zr()
  {
    GMTrace.i(18813567369216L, 140172);
    this.uqw = new LinkedList();
    GMTrace.o(18813567369216L, 140172);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(18813701586944L, 140173);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.d(2, 1, this.uqw);
      paramVarArgs.fk(3, this.scene);
      GMTrace.o(18813701586944L, 140173);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.c(2, 1, this.uqw);
      int j = b.a.a.a.fh(3, this.scene);
      GMTrace.o(18813701586944L, 140173);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uqw.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(18813701586944L, 140173);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      zr localzr = (zr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(18813701586944L, 140173);
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
          localzr.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(18813701586944L, 140173);
        return 0;
      case 2: 
        localzr.uqw.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(18813701586944L, 140173);
        return 0;
      }
      localzr.scene = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(18813701586944L, 140173);
      return 0;
    }
    GMTrace.o(18813701586944L, 140173);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\zr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */