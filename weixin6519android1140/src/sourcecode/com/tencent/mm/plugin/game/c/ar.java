package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ayx;
import com.tencent.mm.protocal.c.er;
import java.util.LinkedList;

public final class ar
  extends ayx
{
  public String gCG;
  public String lQJ;
  public int lRF;
  public int lRG;
  public int lRx;
  public int lRy;
  
  public ar()
  {
    GMTrace.i(12645591678976L, 94217);
    GMTrace.o(12645591678976L, 94217);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12645725896704L, 94218);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQJ == null) {
        throw new b("Not all required fields were included: Lang");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.lRx);
      paramVarArgs.fk(3, this.lRy);
      if (this.lQJ != null) {
        paramVarArgs.e(4, this.lQJ);
      }
      paramVarArgs.fk(5, this.lRF);
      paramVarArgs.fk(6, this.lRG);
      if (this.gCG != null) {
        paramVarArgs.e(7, this.gCG);
      }
      GMTrace.o(12645725896704L, 94218);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.lRx) + b.a.a.a.fh(3, this.lRy);
      paramInt = i;
      if (this.lQJ != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lQJ);
      }
      i = paramInt + b.a.a.a.fh(5, this.lRF) + b.a.a.a.fh(6, this.lRG);
      paramInt = i;
      if (this.gCG != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.gCG);
      }
      GMTrace.o(12645725896704L, 94218);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lQJ == null) {
        throw new b("Not all required fields were included: Lang");
      }
      GMTrace.o(12645725896704L, 94218);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ar localar = (ar)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(12645725896704L, 94218);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localar.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12645725896704L, 94218);
        return 0;
      case 2: 
        localar.lRx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12645725896704L, 94218);
        return 0;
      case 3: 
        localar.lRy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12645725896704L, 94218);
        return 0;
      case 4: 
        localar.lQJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12645725896704L, 94218);
        return 0;
      case 5: 
        localar.lRF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12645725896704L, 94218);
        return 0;
      case 6: 
        localar.lRG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12645725896704L, 94218);
        return 0;
      }
      localar.gCG = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(12645725896704L, 94218);
      return 0;
    }
    GMTrace.o(12645725896704L, 94218);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */