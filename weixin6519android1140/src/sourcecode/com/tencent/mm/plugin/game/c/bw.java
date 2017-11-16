package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bw
  extends com.tencent.mm.bm.a
{
  public c lPb;
  public String lPf;
  public boolean lPp;
  public LinkedList<String> lPq;
  
  public bw()
  {
    GMTrace.i(12642370453504L, 94193);
    this.lPq = new LinkedList();
    GMTrace.o(12642370453504L, 94193);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12642504671232L, 94194);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPb == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      if (this.lPb != null)
      {
        paramVarArgs.fm(1, this.lPb.aYq());
        this.lPb.a(paramVarArgs);
      }
      if (this.lPf != null) {
        paramVarArgs.e(2, this.lPf);
      }
      paramVarArgs.ah(3, this.lPp);
      paramVarArgs.d(4, 1, this.lPq);
      GMTrace.o(12642504671232L, 94194);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lPb != null) {
        paramInt = b.a.a.a.fj(1, this.lPb.aYq()) + 0;
      }
      i = paramInt;
      if (this.lPf != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPf);
      }
      paramInt = b.a.a.b.b.a.cK(3);
      int j = b.a.a.a.c(4, 1, this.lPq);
      GMTrace.o(12642504671232L, 94194);
      return i + (paramInt + 1) + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lPq.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lPb == null) {
        throw new b("Not all required fields were included: AppItem");
      }
      GMTrace.o(12642504671232L, 94194);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bw localbw = (bw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12642504671232L, 94194);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new c();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((c)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbw.lPb = ((c)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12642504671232L, 94194);
        return 0;
      case 2: 
        localbw.lPf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12642504671232L, 94194);
        return 0;
      case 3: 
        localbw.lPp = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(12642504671232L, 94194);
        return 0;
      }
      localbw.lPq.add(((b.a.a.a.a)localObject1).yqV.readString());
      GMTrace.o(12642504671232L, 94194);
      return 0;
    }
    GMTrace.o(12642504671232L, 94194);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */