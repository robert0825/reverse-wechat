package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class r
  extends com.tencent.mm.bm.a
{
  public String ID;
  public int jhC;
  public int jhD;
  public int jhE;
  public long jhF;
  public long jhG;
  public LinkedList<t> jhR;
  public LinkedList<t> jhS;
  public long jhz;
  
  public r()
  {
    GMTrace.i(14836830306304L, 110543);
    this.jhR = new LinkedList();
    this.jhS = new LinkedList();
    GMTrace.o(14836830306304L, 110543);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14836964524032L, 110544);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.e(1, this.ID);
      }
      paramVarArgs.fk(2, this.jhC);
      paramVarArgs.fk(3, this.jhD);
      paramVarArgs.fk(4, this.jhE);
      paramVarArgs.T(5, this.jhz);
      paramVarArgs.T(6, this.jhF);
      paramVarArgs.T(7, this.jhG);
      paramVarArgs.d(8, 8, this.jhR);
      paramVarArgs.d(9, 8, this.jhS);
      GMTrace.o(14836964524032L, 110544);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ID != null) {
        paramInt = b.a.a.b.b.a.f(1, this.ID) + 0;
      }
      i = b.a.a.a.fh(2, this.jhC);
      int j = b.a.a.a.fh(3, this.jhD);
      int k = b.a.a.a.fh(4, this.jhE);
      int m = b.a.a.a.S(5, this.jhz);
      int n = b.a.a.a.S(6, this.jhF);
      int i1 = b.a.a.a.S(7, this.jhG);
      int i2 = b.a.a.a.c(8, 8, this.jhR);
      int i3 = b.a.a.a.c(9, 8, this.jhS);
      GMTrace.o(14836964524032L, 110544);
      return paramInt + i + j + k + m + n + i1 + i2 + i3;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jhR.clear();
      this.jhS.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      GMTrace.o(14836964524032L, 110544);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      r localr = (r)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(14836964524032L, 110544);
        return -1;
      case 1: 
        localr.ID = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(14836964524032L, 110544);
        return 0;
      case 2: 
        localr.jhC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14836964524032L, 110544);
        return 0;
      case 3: 
        localr.jhD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14836964524032L, 110544);
        return 0;
      case 4: 
        localr.jhE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(14836964524032L, 110544);
        return 0;
      case 5: 
        localr.jhz = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(14836964524032L, 110544);
        return 0;
      case 6: 
        localr.jhF = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(14836964524032L, 110544);
        return 0;
      case 7: 
        localr.jhG = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(14836964524032L, 110544);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new t();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((t)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localr.jhR.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(14836964524032L, 110544);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new t();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((t)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localr.jhS.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(14836964524032L, 110544);
      return 0;
    }
    GMTrace.o(14836964524032L, 110544);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\h\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */