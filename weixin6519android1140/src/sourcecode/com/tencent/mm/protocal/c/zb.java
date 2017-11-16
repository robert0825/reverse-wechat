package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class zb
  extends com.tencent.mm.bm.a
{
  public int udF;
  public int udG;
  public int udH;
  public b udJ;
  public ahi udK;
  public int upW;
  public int upX;
  public int upY;
  
  public zb()
  {
    GMTrace.i(13097502769152L, 97584);
    GMTrace.o(13097502769152L, 97584);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13097636986880L, 97585);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.udF);
      paramVarArgs.fk(2, this.udG);
      paramVarArgs.fk(3, this.udH);
      if (this.udJ != null) {
        paramVarArgs.b(4, this.udJ);
      }
      paramVarArgs.fk(5, this.upW);
      paramVarArgs.fk(6, this.upX);
      paramVarArgs.fk(7, this.upY);
      if (this.udK != null)
      {
        paramVarArgs.fm(8, this.udK.aYq());
        this.udK.a(paramVarArgs);
      }
      GMTrace.o(13097636986880L, 97585);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.udF) + 0 + b.a.a.a.fh(2, this.udG) + b.a.a.a.fh(3, this.udH);
      paramInt = i;
      if (this.udJ != null) {
        paramInt = i + b.a.a.a.a(4, this.udJ);
      }
      i = paramInt + b.a.a.a.fh(5, this.upW) + b.a.a.a.fh(6, this.upX) + b.a.a.a.fh(7, this.upY);
      paramInt = i;
      if (this.udK != null) {
        paramInt = i + b.a.a.a.fj(8, this.udK.aYq());
      }
      GMTrace.o(13097636986880L, 97585);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(13097636986880L, 97585);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      zb localzb = (zb)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13097636986880L, 97585);
        return -1;
      case 1: 
        localzb.udF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13097636986880L, 97585);
        return 0;
      case 2: 
        localzb.udG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13097636986880L, 97585);
        return 0;
      case 3: 
        localzb.udH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13097636986880L, 97585);
        return 0;
      case 4: 
        localzb.udJ = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(13097636986880L, 97585);
        return 0;
      case 5: 
        localzb.upW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13097636986880L, 97585);
        return 0;
      case 6: 
        localzb.upX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13097636986880L, 97585);
        return 0;
      case 7: 
        localzb.upY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13097636986880L, 97585);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ahi();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((ahi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localzb.udK = ((ahi)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13097636986880L, 97585);
      return 0;
    }
    GMTrace.o(13097636986880L, 97585);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */