package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class f
  extends ayx
{
  public int scene;
  public String tMa;
  public int tMc;
  public long tMd;
  public LinkedList<String> tMe;
  public at tMf;
  public long tMg;
  public String title;
  
  public f()
  {
    GMTrace.i(3912178335744L, 29148);
    this.tMe = new LinkedList();
    GMTrace.o(3912178335744L, 29148);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3912312553472L, 29149);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tMc);
      paramVarArgs.T(3, this.tMd);
      if (this.title != null) {
        paramVarArgs.e(4, this.title);
      }
      paramVarArgs.d(5, 1, this.tMe);
      paramVarArgs.fk(6, this.scene);
      if (this.tMa != null) {
        paramVarArgs.e(7, this.tMa);
      }
      if (this.tMf != null)
      {
        paramVarArgs.fm(8, this.tMf.aYq());
        this.tMf.a(paramVarArgs);
      }
      paramVarArgs.T(9, this.tMg);
      GMTrace.o(3912312553472L, 29149);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tMc) + b.a.a.a.S(3, this.tMd);
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.title);
      }
      i = paramInt + b.a.a.a.c(5, 1, this.tMe) + b.a.a.a.fh(6, this.scene);
      paramInt = i;
      if (this.tMa != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tMa);
      }
      i = paramInt;
      if (this.tMf != null) {
        i = paramInt + b.a.a.a.fj(8, this.tMf.aYq());
      }
      paramInt = b.a.a.a.S(9, this.tMg);
      GMTrace.o(3912312553472L, 29149);
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
      GMTrace.o(3912312553472L, 29149);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      f localf = (f)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3912312553472L, 29149);
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
          localf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3912312553472L, 29149);
        return 0;
      case 2: 
        localf.tMc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3912312553472L, 29149);
        return 0;
      case 3: 
        localf.tMd = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3912312553472L, 29149);
        return 0;
      case 4: 
        localf.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3912312553472L, 29149);
        return 0;
      case 5: 
        localf.tMe.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3912312553472L, 29149);
        return 0;
      case 6: 
        localf.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3912312553472L, 29149);
        return 0;
      case 7: 
        localf.tMa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3912312553472L, 29149);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new at();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((at)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localf.tMf = ((at)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3912312553472L, 29149);
        return 0;
      }
      localf.tMg = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3912312553472L, 29149);
      return 0;
    }
    GMTrace.o(3912312553472L, 29149);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */