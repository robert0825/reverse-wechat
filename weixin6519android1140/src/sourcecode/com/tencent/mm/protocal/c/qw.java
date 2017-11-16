package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class qw
  extends com.tencent.mm.bm.a
{
  public rh ugS;
  public qx ugT;
  
  public qw()
  {
    GMTrace.i(3712059703296L, 27657);
    GMTrace.o(3712059703296L, 27657);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3712193921024L, 27658);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ugS == null) {
        throw new b("Not all required fields were included: BannerSummary");
      }
      if (this.ugT == null) {
        throw new b("Not all required fields were included: BannerImg");
      }
      if (this.ugS != null)
      {
        paramVarArgs.fm(1, this.ugS.aYq());
        this.ugS.a(paramVarArgs);
      }
      if (this.ugT != null)
      {
        paramVarArgs.fm(2, this.ugT.aYq());
        this.ugT.a(paramVarArgs);
      }
      GMTrace.o(3712193921024L, 27658);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.ugS != null) {
        paramInt = b.a.a.a.fj(1, this.ugS.aYq()) + 0;
      }
      i = paramInt;
      if (this.ugT != null) {
        i = paramInt + b.a.a.a.fj(2, this.ugT.aYq());
      }
      GMTrace.o(3712193921024L, 27658);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ugS == null) {
        throw new b("Not all required fields were included: BannerSummary");
      }
      if (this.ugT == null) {
        throw new b("Not all required fields were included: BannerImg");
      }
      GMTrace.o(3712193921024L, 27658);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      qw localqw = (qw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3712193921024L, 27658);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new rh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((rh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localqw.ugS = ((rh)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3712193921024L, 27658);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new qx();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((qx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localqw.ugT = ((qx)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3712193921024L, 27658);
      return 0;
    }
    GMTrace.o(3712193921024L, 27658);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\qw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */