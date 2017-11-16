package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class pv
  extends com.tencent.mm.bm.a
{
  public String jxI;
  public String title;
  public int ufR;
  public LinkedList<np> ufS;
  
  public pv()
  {
    GMTrace.i(3908420239360L, 29120);
    this.ufS = new LinkedList();
    GMTrace.o(3908420239360L, 29120);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3908554457088L, 29121);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.e(1, this.title);
      }
      if (this.jxI != null) {
        paramVarArgs.e(2, this.jxI);
      }
      paramVarArgs.fk(3, this.ufR);
      paramVarArgs.d(4, 8, this.ufS);
      GMTrace.o(3908554457088L, 29121);
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
      if (this.jxI != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jxI);
      }
      paramInt = b.a.a.a.fh(3, this.ufR);
      int j = b.a.a.a.c(4, 8, this.ufS);
      GMTrace.o(3908554457088L, 29121);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ufS.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3908554457088L, 29121);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      pv localpv = (pv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3908554457088L, 29121);
        return -1;
      case 1: 
        localpv.title = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3908554457088L, 29121);
        return 0;
      case 2: 
        localpv.jxI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3908554457088L, 29121);
        return 0;
      case 3: 
        localpv.ufR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3908554457088L, 29121);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new np();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((np)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localpv.ufS.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3908554457088L, 29121);
      return 0;
    }
    GMTrace.o(3908554457088L, 29121);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\pv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */