package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class anj
  extends ayx
{
  public LinkedList<anl> uCk;
  public int uCl;
  public String uCm;
  
  public anj()
  {
    GMTrace.i(4015391768576L, 29917);
    this.uCk = new LinkedList();
    GMTrace.o(4015391768576L, 29917);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4015525986304L, 29918);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.uCk);
      paramVarArgs.fk(3, this.uCl);
      if (this.uCm != null) {
        paramVarArgs.e(4, this.uCm);
      }
      GMTrace.o(4015525986304L, 29918);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.uCk) + b.a.a.a.fh(3, this.uCl);
      paramInt = i;
      if (this.uCm != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uCm);
      }
      GMTrace.o(4015525986304L, 29918);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uCk.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4015525986304L, 29918);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      anj localanj = (anj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4015525986304L, 29918);
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
          localanj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4015525986304L, 29918);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new anl();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((anl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localanj.uCk.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4015525986304L, 29918);
        return 0;
      case 3: 
        localanj.uCl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4015525986304L, 29918);
        return 0;
      }
      localanj.uCm = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4015525986304L, 29918);
      return 0;
    }
    GMTrace.o(4015525986304L, 29918);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\anj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */