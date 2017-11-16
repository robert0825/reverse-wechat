package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ajf
  extends azh
{
  public aiy uyc;
  public LinkedList<bnd> uyo;
  public LinkedList<String> uyp;
  
  public ajf()
  {
    GMTrace.i(3697698406400L, 27550);
    this.uyo = new LinkedList();
    this.uyp = new LinkedList();
    GMTrace.o(3697698406400L, 27550);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3697832624128L, 27551);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uyc != null)
      {
        paramVarArgs.fm(2, this.uyc.aYq());
        this.uyc.a(paramVarArgs);
      }
      paramVarArgs.d(3, 8, this.uyo);
      paramVarArgs.d(4, 1, this.uyp);
      GMTrace.o(3697832624128L, 27551);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.uyc != null) {
        i = paramInt + b.a.a.a.fj(2, this.uyc.aYq());
      }
      paramInt = b.a.a.a.c(3, 8, this.uyo);
      int j = b.a.a.a.c(4, 1, this.uyp);
      GMTrace.o(3697832624128L, 27551);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uyo.clear();
      this.uyp.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3697832624128L, 27551);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ajf localajf = (ajf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3697832624128L, 27551);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localajf.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3697832624128L, 27551);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aiy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aiy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localajf.uyc = ((aiy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3697832624128L, 27551);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bnd();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bnd)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localajf.uyo.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3697832624128L, 27551);
        return 0;
      }
      localajf.uyp.add(((b.a.a.a.a)localObject1).yqV.readString());
      GMTrace.o(3697832624128L, 27551);
      return 0;
    }
    GMTrace.o(3697832624128L, 27551);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ajf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */