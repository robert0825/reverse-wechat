package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class yv
  extends com.tencent.mm.bm.a
{
  public int tQe;
  public azq upI;
  public int upJ;
  public int upK;
  public int upL;
  public int upM;
  
  public yv()
  {
    GMTrace.i(3661862273024L, 27283);
    this.upL = 1;
    GMTrace.o(3661862273024L, 27283);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3661996490752L, 27284);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.upI == null) {
        throw new b("Not all required fields were included: ChatroomId");
      }
      if (this.upI != null)
      {
        paramVarArgs.fm(1, this.upI.aYq());
        this.upI.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tQe);
      paramVarArgs.fk(3, this.upJ);
      paramVarArgs.fk(4, this.upK);
      paramVarArgs.fk(5, this.upL);
      paramVarArgs.fk(6, this.upM);
      GMTrace.o(3661996490752L, 27284);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.upI != null) {
        paramInt = b.a.a.a.fj(1, this.upI.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.tQe);
      int j = b.a.a.a.fh(3, this.upJ);
      int k = b.a.a.a.fh(4, this.upK);
      int m = b.a.a.a.fh(5, this.upL);
      int n = b.a.a.a.fh(6, this.upM);
      GMTrace.o(3661996490752L, 27284);
      return paramInt + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.upI == null) {
        throw new b("Not all required fields were included: ChatroomId");
      }
      GMTrace.o(3661996490752L, 27284);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      yv localyv = (yv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3661996490752L, 27284);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localyv.upI = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3661996490752L, 27284);
        return 0;
      case 2: 
        localyv.tQe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3661996490752L, 27284);
        return 0;
      case 3: 
        localyv.upJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3661996490752L, 27284);
        return 0;
      case 4: 
        localyv.upK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3661996490752L, 27284);
        return 0;
      case 5: 
        localyv.upL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3661996490752L, 27284);
        return 0;
      }
      localyv.upM = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3661996490752L, 27284);
      return 0;
    }
    GMTrace.o(3661996490752L, 27284);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\yv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */