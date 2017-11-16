package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class buu
  extends com.tencent.mm.bm.a
{
  public int tVE;
  public LinkedList<jx> uft;
  public int vdl;
  public String vdm;
  public String vdn;
  public int vdo;
  public cw vdp;
  
  public buu()
  {
    GMTrace.i(3959154540544L, 29498);
    this.uft = new LinkedList();
    GMTrace.o(3959154540544L, 29498);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3959288758272L, 29499);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tVE);
      paramVarArgs.fk(2, this.vdl);
      if (this.vdm != null) {
        paramVarArgs.e(3, this.vdm);
      }
      if (this.vdn != null) {
        paramVarArgs.e(4, this.vdn);
      }
      paramVarArgs.fk(5, this.vdo);
      paramVarArgs.d(6, 8, this.uft);
      if (this.vdp != null)
      {
        paramVarArgs.fm(7, this.vdp.aYq());
        this.vdp.a(paramVarArgs);
      }
      GMTrace.o(3959288758272L, 29499);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tVE) + 0 + b.a.a.a.fh(2, this.vdl);
      paramInt = i;
      if (this.vdm != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.vdm);
      }
      i = paramInt;
      if (this.vdn != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.vdn);
      }
      i = i + b.a.a.a.fh(5, this.vdo) + b.a.a.a.c(6, 8, this.uft);
      paramInt = i;
      if (this.vdp != null) {
        paramInt = i + b.a.a.a.fj(7, this.vdp.aYq());
      }
      GMTrace.o(3959288758272L, 29499);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uft.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3959288758272L, 29499);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      buu localbuu = (buu)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3959288758272L, 29499);
        return -1;
      case 1: 
        localbuu.tVE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959288758272L, 29499);
        return 0;
      case 2: 
        localbuu.vdl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959288758272L, 29499);
        return 0;
      case 3: 
        localbuu.vdm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3959288758272L, 29499);
        return 0;
      case 4: 
        localbuu.vdn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3959288758272L, 29499);
        return 0;
      case 5: 
        localbuu.vdo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959288758272L, 29499);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbuu.uft.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3959288758272L, 29499);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new cw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((cw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbuu.vdp = ((cw)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3959288758272L, 29499);
      return 0;
    }
    GMTrace.o(3959288758272L, 29499);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\buu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */