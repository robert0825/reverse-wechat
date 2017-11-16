package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class brk
  extends com.tencent.mm.bm.a
{
  public String lPj;
  public LinkedList<uh> vbg;
  public String vbh;
  
  public brk()
  {
    GMTrace.i(3749372231680L, 27935);
    this.vbg = new LinkedList();
    GMTrace.o(3749372231680L, 27935);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3749506449408L, 27936);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbh == null) {
        throw new b("Not all required fields were included: Charset");
      }
      paramVarArgs.d(1, 8, this.vbg);
      if (this.vbh != null) {
        paramVarArgs.e(2, this.vbh);
      }
      if (this.lPj != null) {
        paramVarArgs.e(3, this.lPj);
      }
      GMTrace.o(3749506449408L, 27936);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.c(1, 8, this.vbg) + 0;
      paramInt = i;
      if (this.vbh != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.vbh);
      }
      i = paramInt;
      if (this.lPj != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPj);
      }
      GMTrace.o(3749506449408L, 27936);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vbg.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.vbh == null) {
        throw new b("Not all required fields were included: Charset");
      }
      GMTrace.o(3749506449408L, 27936);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      brk localbrk = (brk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3749506449408L, 27936);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new uh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((uh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbrk.vbg.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3749506449408L, 27936);
        return 0;
      case 2: 
        localbrk.vbh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3749506449408L, 27936);
        return 0;
      }
      localbrk.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3749506449408L, 27936);
      return 0;
    }
    GMTrace.o(3749506449408L, 27936);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\brk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */