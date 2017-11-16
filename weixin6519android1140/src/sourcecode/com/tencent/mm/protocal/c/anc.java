package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class anc
  extends com.tencent.mm.bm.a
{
  public String kBh;
  public int tOG;
  public int uBR;
  public all uBS;
  public int uBT;
  public long uBU;
  
  public anc()
  {
    GMTrace.i(3639984783360L, 27120);
    GMTrace.o(3639984783360L, 27120);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3640119001088L, 27121);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tOG);
      paramVarArgs.fk(2, this.uBR);
      if (this.uBS != null)
      {
        paramVarArgs.fm(3, this.uBS.aYq());
        this.uBS.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.uBT);
      if (this.kBh != null) {
        paramVarArgs.e(5, this.kBh);
      }
      paramVarArgs.T(6, this.uBU);
      GMTrace.o(3640119001088L, 27121);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tOG) + 0 + b.a.a.a.fh(2, this.uBR);
      paramInt = i;
      if (this.uBS != null) {
        paramInt = i + b.a.a.a.fj(3, this.uBS.aYq());
      }
      i = paramInt + b.a.a.a.fh(4, this.uBT);
      paramInt = i;
      if (this.kBh != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.kBh);
      }
      i = b.a.a.a.S(6, this.uBU);
      GMTrace.o(3640119001088L, 27121);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3640119001088L, 27121);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      anc localanc = (anc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3640119001088L, 27121);
        return -1;
      case 1: 
        localanc.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3640119001088L, 27121);
        return 0;
      case 2: 
        localanc.uBR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3640119001088L, 27121);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new all();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((all)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localanc.uBS = ((all)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3640119001088L, 27121);
        return 0;
      case 4: 
        localanc.uBT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3640119001088L, 27121);
        return 0;
      case 5: 
        localanc.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3640119001088L, 27121);
        return 0;
      }
      localanc.uBU = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3640119001088L, 27121);
      return 0;
    }
    GMTrace.o(3640119001088L, 27121);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\anc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */