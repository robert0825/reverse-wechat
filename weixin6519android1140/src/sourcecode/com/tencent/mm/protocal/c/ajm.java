package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ajm
  extends ayx
{
  public String lQa;
  public LinkedList<String> uyr;
  public int uyt;
  public bvc uyu;
  
  public ajm()
  {
    GMTrace.i(4045859192832L, 30144);
    this.uyr = new LinkedList();
    GMTrace.o(4045859192832L, 30144);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4045993410560L, 30145);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      paramVarArgs.d(3, 1, this.uyr);
      paramVarArgs.fk(4, this.uyt);
      if (this.uyu != null)
      {
        paramVarArgs.fm(5, this.uyu.aYq());
        this.uyu.a(paramVarArgs);
      }
      GMTrace.o(4045993410560L, 30145);
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
      if (this.lQa != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lQa);
      }
      i = i + b.a.a.a.c(3, 1, this.uyr) + b.a.a.a.fh(4, this.uyt);
      paramInt = i;
      if (this.uyu != null) {
        paramInt = i + b.a.a.a.fj(5, this.uyu.aYq());
      }
      GMTrace.o(4045993410560L, 30145);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uyr.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4045993410560L, 30145);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ajm localajm = (ajm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4045993410560L, 30145);
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
          localajm.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4045993410560L, 30145);
        return 0;
      case 2: 
        localajm.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4045993410560L, 30145);
        return 0;
      case 3: 
        localajm.uyr.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(4045993410560L, 30145);
        return 0;
      case 4: 
        localajm.uyt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4045993410560L, 30145);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bvc();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bvc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localajm.uyu = ((bvc)localObject1);
        paramInt += 1;
      }
      GMTrace.o(4045993410560L, 30145);
      return 0;
    }
    GMTrace.o(4045993410560L, 30145);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ajm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */