package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bj
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public LinkedList<bk> lSg;
  public bl lSh;
  
  public bj()
  {
    GMTrace.i(12648276033536L, 94237);
    this.lSg = new LinkedList();
    GMTrace.o(12648276033536L, 94237);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12648410251264L, 94238);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      paramVarArgs.d(2, 8, this.lSg);
      if (this.lSh != null)
      {
        paramVarArgs.fm(3, this.lSh.aYq());
        this.lSh.a(paramVarArgs);
      }
      GMTrace.o(12648410251264L, 94238);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.eBt != null) {
        paramInt = b.a.a.b.b.a.f(1, this.eBt) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.lSg);
      paramInt = i;
      if (this.lSh != null) {
        paramInt = i + b.a.a.a.fj(3, this.lSh.aYq());
      }
      GMTrace.o(12648410251264L, 94238);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.lSg.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      GMTrace.o(12648410251264L, 94238);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bj localbj = (bj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12648410251264L, 94238);
        return -1;
      case 1: 
        localbj.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12648410251264L, 94238);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbj.lSg.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(12648410251264L, 94238);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bl();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((bl)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbj.lSh = ((bl)localObject1);
        paramInt += 1;
      }
      GMTrace.o(12648410251264L, 94238);
      return 0;
    }
    GMTrace.o(12648410251264L, 94238);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */