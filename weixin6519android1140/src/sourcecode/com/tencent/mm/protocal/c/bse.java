package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bse
  extends com.tencent.mm.bm.a
{
  public long vbw;
  public long vbx;
  public String vby;
  public LinkedList<bsf> vbz;
  
  public bse()
  {
    GMTrace.i(4038879870976L, 30092);
    this.vbz = new LinkedList();
    GMTrace.o(4038879870976L, 30092);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4039014088704L, 30093);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vby == null) {
        throw new b("Not all required fields were included: TotalMsg");
      }
      paramVarArgs.T(1, this.vbx);
      paramVarArgs.T(2, this.vbw);
      if (this.vby != null) {
        paramVarArgs.e(3, this.vby);
      }
      paramVarArgs.d(4, 8, this.vbz);
      GMTrace.o(4039014088704L, 30093);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.S(1, this.vbx) + 0 + b.a.a.a.S(2, this.vbw);
      paramInt = i;
      if (this.vby != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.vby);
      }
      i = b.a.a.a.c(4, 8, this.vbz);
      GMTrace.o(4039014088704L, 30093);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vbz.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.vby == null) {
        throw new b("Not all required fields were included: TotalMsg");
      }
      GMTrace.o(4039014088704L, 30093);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bse localbse = (bse)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4039014088704L, 30093);
        return -1;
      case 1: 
        localbse.vbx = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4039014088704L, 30093);
        return 0;
      case 2: 
        localbse.vbw = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4039014088704L, 30093);
        return 0;
      case 3: 
        localbse.vby = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4039014088704L, 30093);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bsf();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bsf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbse.vbz.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(4039014088704L, 30093);
      return 0;
    }
    GMTrace.o(4039014088704L, 30093);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */