package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class av
  extends com.tencent.mm.bm.a
{
  public String desc;
  public LinkedList<bc> jBk;
  public String lRJ;
  public String title;
  public String url;
  
  public av()
  {
    GMTrace.i(12652839436288L, 94271);
    this.jBk = new LinkedList();
    GMTrace.o(12652839436288L, 94271);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12652973654016L, 94272);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lRJ != null) {
        paramVarArgs.e(1, this.lRJ);
      }
      if (this.desc != null) {
        paramVarArgs.e(2, this.desc);
      }
      paramVarArgs.d(3, 8, this.jBk);
      if (this.url != null) {
        paramVarArgs.e(4, this.url);
      }
      if (this.title != null) {
        paramVarArgs.e(5, this.title);
      }
      GMTrace.o(12652973654016L, 94272);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lRJ != null) {
        paramInt = b.a.a.b.b.a.f(1, this.lRJ) + 0;
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.desc);
      }
      i += b.a.a.a.c(3, 8, this.jBk);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.url);
      }
      i = paramInt;
      if (this.title != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.title);
      }
      GMTrace.o(12652973654016L, 94272);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jBk.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(12652973654016L, 94272);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      av localav = (av)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12652973654016L, 94272);
        return -1;
      case 1: 
        localav.lRJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12652973654016L, 94272);
        return 0;
      case 2: 
        localav.desc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12652973654016L, 94272);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localav.jBk.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12652973654016L, 94272);
        return 0;
      case 4: 
        localav.url = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12652973654016L, 94272);
        return 0;
      }
      localav.title = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(12652973654016L, 94272);
      return 0;
    }
    GMTrace.o(12652973654016L, 94272);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */