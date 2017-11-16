package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class blw
  extends ayx
{
  public int lSq;
  public int tRC;
  public int tRD;
  public int tRE;
  public azq uVK;
  public azq uVL;
  public int uVM;
  public int uVN;
  public int uVO;
  public int uVP;
  public azp ues;
  
  public blw()
  {
    GMTrace.i(3794066735104L, 28268);
    GMTrace.o(3794066735104L, 28268);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3794200952832L, 28269);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uVK == null) {
        throw new b("Not all required fields were included: ClientMediaId");
      }
      if (this.uVL == null) {
        throw new b("Not all required fields were included: DataMD5");
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uVK != null)
      {
        paramVarArgs.fm(2, this.uVK.aYq());
        this.uVK.a(paramVarArgs);
      }
      if (this.uVL != null)
      {
        paramVarArgs.fm(3, this.uVL.aYq());
        this.uVL.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.tRC);
      paramVarArgs.fk(5, this.tRD);
      paramVarArgs.fk(6, this.tRE);
      if (this.ues != null)
      {
        paramVarArgs.fm(7, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.lSq);
      paramVarArgs.fk(9, this.uVM);
      paramVarArgs.fk(10, this.uVN);
      paramVarArgs.fk(11, this.uVO);
      paramVarArgs.fk(12, this.uVP);
      GMTrace.o(3794200952832L, 28269);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.uVK != null) {
        paramInt = i + b.a.a.a.fj(2, this.uVK.aYq());
      }
      i = paramInt;
      if (this.uVL != null) {
        i = paramInt + b.a.a.a.fj(3, this.uVL.aYq());
      }
      i = i + b.a.a.a.fh(4, this.tRC) + b.a.a.a.fh(5, this.tRD) + b.a.a.a.fh(6, this.tRE);
      paramInt = i;
      if (this.ues != null) {
        paramInt = i + b.a.a.a.fj(7, this.ues.aYq());
      }
      i = b.a.a.a.fh(8, this.lSq);
      int j = b.a.a.a.fh(9, this.uVM);
      int k = b.a.a.a.fh(10, this.uVN);
      int m = b.a.a.a.fh(11, this.uVO);
      int n = b.a.a.a.fh(12, this.uVP);
      GMTrace.o(3794200952832L, 28269);
      return paramInt + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uVK == null) {
        throw new b("Not all required fields were included: ClientMediaId");
      }
      if (this.uVL == null) {
        throw new b("Not all required fields were included: DataMD5");
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3794200952832L, 28269);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      blw localblw = (blw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3794200952832L, 28269);
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
          localblw.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3794200952832L, 28269);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localblw.uVK = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3794200952832L, 28269);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localblw.uVL = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3794200952832L, 28269);
        return 0;
      case 4: 
        localblw.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3794200952832L, 28269);
        return 0;
      case 5: 
        localblw.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3794200952832L, 28269);
        return 0;
      case 6: 
        localblw.tRE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3794200952832L, 28269);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localblw.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3794200952832L, 28269);
        return 0;
      case 8: 
        localblw.lSq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3794200952832L, 28269);
        return 0;
      case 9: 
        localblw.uVM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3794200952832L, 28269);
        return 0;
      case 10: 
        localblw.uVN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3794200952832L, 28269);
        return 0;
      case 11: 
        localblw.uVO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3794200952832L, 28269);
        return 0;
      }
      localblw.uVP = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3794200952832L, 28269);
      return 0;
    }
    GMTrace.o(3794200952832L, 28269);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\blw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */