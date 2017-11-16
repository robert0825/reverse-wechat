package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qm
  extends com.tencent.mm.bm.a
{
  public azp tSB;
  public int ugt;
  
  public qm()
  {
    GMTrace.i(13574378356736L, 101137);
    GMTrace.o(13574378356736L, 101137);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13574512574464L, 101138);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSB == null) {
        throw new b("Not all required fields were included: Key");
      }
      paramVarArgs.fk(1, this.ugt);
      if (this.tSB != null)
      {
        paramVarArgs.fm(2, this.tSB.aYq());
        this.tSB.a(paramVarArgs);
      }
      GMTrace.o(13574512574464L, 101138);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.ugt) + 0;
      paramInt = i;
      if (this.tSB != null) {
        paramInt = i + b.a.a.a.fj(2, this.tSB.aYq());
      }
      GMTrace.o(13574512574464L, 101138);
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
      if (this.tSB == null) {
        throw new b("Not all required fields were included: Key");
      }
      GMTrace.o(13574512574464L, 101138);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qm localqm = (qm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13574512574464L, 101138);
        return -1;
      case 1: 
        localqm.ugt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13574512574464L, 101138);
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
        localqm.tSB = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13574512574464L, 101138);
      return 0;
    }
    GMTrace.o(13574512574464L, 101138);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */