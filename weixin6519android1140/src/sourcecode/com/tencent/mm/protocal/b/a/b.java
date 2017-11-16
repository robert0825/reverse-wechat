package com.tencent.mm.protocal.b.a;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class b
  extends com.tencent.mm.bm.a
{
  public String eCh;
  public int id;
  public LinkedList<a> tLV;
  public String title;
  
  public b()
  {
    GMTrace.i(4079279407104L, 30393);
    this.tLV = new LinkedList();
    GMTrace.o(4079279407104L, 30393);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4079413624832L, 30394);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.id);
      if (this.title != null) {
        paramVarArgs.e(2, this.title);
      }
      if (this.eCh != null) {
        paramVarArgs.e(3, this.eCh);
      }
      paramVarArgs.d(4, 8, this.tLV);
      GMTrace.o(4079413624832L, 30394);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.id) + 0;
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.title);
      }
      i = paramInt;
      if (this.eCh != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eCh);
      }
      paramInt = b.a.a.a.c(4, 8, this.tLV);
      GMTrace.o(4079413624832L, 30394);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tLV.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4079413624832L, 30394);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      b localb = (b)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4079413624832L, 30394);
        return -1;
      case 1: 
        localb.id = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4079413624832L, 30394);
        return 0;
      case 2: 
        localb.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4079413624832L, 30394);
        return 0;
      case 3: 
        localb.eCh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4079413624832L, 30394);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new a();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localb.tLV.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(4079413624832L, 30394);
      return 0;
    }
    GMTrace.o(4079413624832L, 30394);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */