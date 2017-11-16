package com.tencent.mm.plugin.game.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class g
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPD;
  public String lPE;
  public String lPF;
  public String lPG;
  public LinkedList<p> lPH;
  public String lPj;
  
  public g()
  {
    GMTrace.i(12650423517184L, 94253);
    this.lPH = new LinkedList();
    GMTrace.o(12650423517184L, 94253);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12650557734912L, 94254);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.lPj != null) {
        paramVarArgs.e(2, this.lPj);
      }
      if (this.lPD != null) {
        paramVarArgs.e(3, this.lPD);
      }
      if (this.lPE != null) {
        paramVarArgs.e(4, this.lPE);
      }
      if (this.lPF != null) {
        paramVarArgs.e(5, this.lPF);
      }
      if (this.lPG != null) {
        paramVarArgs.e(6, this.lPG);
      }
      paramVarArgs.d(7, 8, this.lPH);
      GMTrace.o(12650557734912L, 94254);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.eBt != null) {
        i = b.a.a.b.b.a.f(1, this.eBt) + 0;
      }
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPj);
      }
      i = paramInt;
      if (this.lPD != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPD);
      }
      paramInt = i;
      if (this.lPE != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPE);
      }
      i = paramInt;
      if (this.lPF != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lPF);
      }
      paramInt = i;
      if (this.lPG != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lPG);
      }
      i = b.a.a.a.c(7, 8, this.lPH);
      GMTrace.o(12650557734912L, 94254);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lPH.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(12650557734912L, 94254);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      g localg = (g)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12650557734912L, 94254);
        return -1;
      case 1: 
        localg.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      case 2: 
        localg.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      case 3: 
        localg.lPD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      case 4: 
        localg.lPE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      case 5: 
        localg.lPF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      case 6: 
        localg.lPG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12650557734912L, 94254);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new p();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((p)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localg.lPH.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(12650557734912L, 94254);
      return 0;
    }
    GMTrace.o(12650557734912L, 94254);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */