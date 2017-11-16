package com.tencent.mm.protocal.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tp;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.bm.a
{
  public String desc;
  public LinkedList<th> glr;
  public String tLW;
  public tp tLX;
  public long tLY;
  public String title;
  
  public c()
  {
    GMTrace.i(4079816278016L, 30397);
    this.glr = new LinkedList();
    GMTrace.o(4079816278016L, 30397);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4079950495744L, 30398);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(2, this.desc);
      }
      paramVarArgs.d(3, 8, this.glr);
      if (this.tLW != null) {
        paramVarArgs.e(4, this.tLW);
      }
      if (this.tLX != null)
      {
        paramVarArgs.fm(5, this.tLX.aYq());
        this.tLX.a(paramVarArgs);
      }
      paramVarArgs.T(6, this.tLY);
      GMTrace.o(4079950495744L, 30398);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.title != null) {
        paramInt = b.a.a.b.b.a.f(1, this.title) + 0;
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.desc);
      }
      i += b.a.a.a.c(3, 8, this.glr);
      paramInt = i;
      if (this.tLW != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tLW);
      }
      i = paramInt;
      if (this.tLX != null) {
        i = paramInt + b.a.a.a.fj(5, this.tLX.aYq());
      }
      paramInt = b.a.a.a.S(6, this.tLY);
      GMTrace.o(4079950495744L, 30398);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.glr.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4079950495744L, 30398);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      c localc = (c)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4079950495744L, 30398);
        return -1;
      case 1: 
        localc.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4079950495744L, 30398);
        return 0;
      case 2: 
        localc.desc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4079950495744L, 30398);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new th();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((th)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localc.glr.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4079950495744L, 30398);
        return 0;
      case 4: 
        localc.tLW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4079950495744L, 30398);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new tp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((tp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localc.tLX = ((tp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4079950495744L, 30398);
        return 0;
      }
      localc.tLY = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(4079950495744L, 30398);
      return 0;
    }
    GMTrace.o(4079950495744L, 30398);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */