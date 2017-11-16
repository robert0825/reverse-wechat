package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class h
  extends ayx
{
  public int scene;
  public String tMa;
  public LinkedList<j> tMe;
  public at tMf;
  public long tMg;
  public long tMi;
  public String title;
  
  public h()
  {
    GMTrace.i(3935800655872L, 29324);
    this.tMe = new LinkedList();
    GMTrace.o(3935800655872L, 29324);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3935934873600L, 29325);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.title != null) {
        paramVarArgs.e(2, this.title);
      }
      paramVarArgs.T(3, this.tMi);
      paramVarArgs.d(5, 8, this.tMe);
      paramVarArgs.fk(7, this.scene);
      if (this.tMa != null) {
        paramVarArgs.e(8, this.tMa);
      }
      if (this.tMf != null)
      {
        paramVarArgs.fm(9, this.tMf.aYq());
        this.tMf.a(paramVarArgs);
      }
      paramVarArgs.T(10, this.tMg);
      GMTrace.o(3935934873600L, 29325);
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
      if (this.title != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.title);
      }
      i = i + b.a.a.a.S(3, this.tMi) + b.a.a.a.c(5, 8, this.tMe) + b.a.a.a.fh(7, this.scene);
      paramInt = i;
      if (this.tMa != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tMa);
      }
      i = paramInt;
      if (this.tMf != null) {
        i = paramInt + b.a.a.a.fj(9, this.tMf.aYq());
      }
      paramInt = b.a.a.a.S(10, this.tMg);
      GMTrace.o(3935934873600L, 29325);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tMe.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3935934873600L, 29325);
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
      case 4: 
      case 6: 
      default: 
        GMTrace.o(3935934873600L, 29325);
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
          localh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3935934873600L, 29325);
        return 0;
      case 2: 
        localh.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3935934873600L, 29325);
        return 0;
      case 3: 
        localh.tMi = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3935934873600L, 29325);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new j();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((j)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localh.tMe.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3935934873600L, 29325);
        return 0;
      case 7: 
        localh.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3935934873600L, 29325);
        return 0;
      case 8: 
        localh.tMa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3935934873600L, 29325);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new at();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localh.tMf = ((at)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3935934873600L, 29325);
        return 0;
      }
      localh.tMg = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3935934873600L, 29325);
      return 0;
    }
    GMTrace.o(3935934873600L, 29325);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */