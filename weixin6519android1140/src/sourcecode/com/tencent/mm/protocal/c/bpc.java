package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpc
  extends com.tencent.mm.bm.a
{
  public int kAW;
  public int oqG;
  public azp tTe;
  public int uei;
  
  public bpc()
  {
    GMTrace.i(3649916895232L, 27194);
    GMTrace.o(3649916895232L, 27194);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3650051112960L, 27195);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      paramVarArgs.fk(1, this.uei);
      paramVarArgs.fk(2, this.kAW);
      paramVarArgs.fk(3, this.oqG);
      if (this.tTe != null)
      {
        paramVarArgs.fm(4, this.tTe.aYq());
        this.tTe.a(paramVarArgs);
      }
      GMTrace.o(3650051112960L, 27195);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.uei) + 0 + b.a.a.a.fh(2, this.kAW) + b.a.a.a.fh(3, this.oqG);
      paramInt = i;
      if (this.tTe != null) {
        paramInt = i + b.a.a.a.fj(4, this.tTe.aYq());
      }
      GMTrace.o(3650051112960L, 27195);
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
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      GMTrace.o(3650051112960L, 27195);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpc localbpc = (bpc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3650051112960L, 27195);
        return -1;
      case 1: 
        localbpc.uei = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3650051112960L, 27195);
        return 0;
      case 2: 
        localbpc.kAW = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3650051112960L, 27195);
        return 0;
      case 3: 
        localbpc.oqG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3650051112960L, 27195);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbpc.tTe = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3650051112960L, 27195);
      return 0;
    }
    GMTrace.o(3650051112960L, 27195);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */