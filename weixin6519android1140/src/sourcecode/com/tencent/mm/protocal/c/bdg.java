package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdg
  extends ayx
{
  public int tQM;
  public int tTL;
  public float tYz;
  public int uPm;
  public float uPn;
  public float uPo;
  public int udE;
  public azp ues;
  public int usS;
  public int usT;
  
  public bdg()
  {
    GMTrace.i(3658909483008L, 27261);
    GMTrace.o(3658909483008L, 27261);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3659043700736L, 27262);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.ues != null)
      {
        paramVarArgs.fm(2, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uPm);
      paramVarArgs.fk(4, this.tTL);
      paramVarArgs.n(5, this.uPn);
      paramVarArgs.fk(6, this.udE);
      paramVarArgs.fk(7, this.tQM);
      paramVarArgs.n(8, this.uPo);
      paramVarArgs.n(9, this.tYz);
      paramVarArgs.fk(10, this.usS);
      paramVarArgs.fk(11, this.usT);
      GMTrace.o(3659043700736L, 27262);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.ues != null) {
        i = paramInt + b.a.a.a.fj(2, this.ues.aYq());
      }
      paramInt = b.a.a.a.fh(3, this.uPm);
      int j = b.a.a.a.fh(4, this.tTL);
      int k = b.a.a.b.b.a.cK(5);
      int m = b.a.a.a.fh(6, this.udE);
      int n = b.a.a.a.fh(7, this.tQM);
      int i1 = b.a.a.b.b.a.cK(8);
      int i2 = b.a.a.b.b.a.cK(9);
      int i3 = b.a.a.a.fh(10, this.usS);
      int i4 = b.a.a.a.fh(11, this.usT);
      GMTrace.o(3659043700736L, 27262);
      return i + paramInt + j + (k + 4) + m + n + (i1 + 4) + (i2 + 4) + i3 + i4;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3659043700736L, 27262);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdg localbdg = (bdg)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3659043700736L, 27262);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbdg.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3659043700736L, 27262);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbdg.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3659043700736L, 27262);
        return 0;
      case 3: 
        localbdg.uPm = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3659043700736L, 27262);
        return 0;
      case 4: 
        localbdg.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3659043700736L, 27262);
        return 0;
      case 5: 
        localbdg.uPn = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3659043700736L, 27262);
        return 0;
      case 6: 
        localbdg.udE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3659043700736L, 27262);
        return 0;
      case 7: 
        localbdg.tQM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3659043700736L, 27262);
        return 0;
      case 8: 
        localbdg.uPo = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3659043700736L, 27262);
        return 0;
      case 9: 
        localbdg.tYz = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3659043700736L, 27262);
        return 0;
      case 10: 
        localbdg.usS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3659043700736L, 27262);
        return 0;
      }
      localbdg.usT = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3659043700736L, 27262);
      return 0;
    }
    GMTrace.o(3659043700736L, 27262);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bdg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */