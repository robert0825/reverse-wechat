package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpk
  extends ayx
{
  public String uKB;
  public int uKf;
  public int uSE;
  public bpr uXS;
  public bpr uXT;
  public long uXW;
  public int uYQ;
  public int uZb;
  public LinkedList<azq> uZc;
  public int uZd;
  public int udE;
  public int uhU;
  public long uhV;
  
  public bpk()
  {
    GMTrace.i(3628978929664L, 27038);
    this.uZc = new LinkedList();
    GMTrace.o(3628978929664L, 27038);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3629113147392L, 27039);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uXS == null) {
        throw new b("Not all required fields were included: PeerId");
      }
      if (this.uXT == null) {
        throw new b("Not all required fields were included: CapInfo");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uKB != null) {
        paramVarArgs.e(2, this.uKB);
      }
      paramVarArgs.fk(3, this.uZb);
      paramVarArgs.d(4, 8, this.uZc);
      if (this.uXS != null)
      {
        paramVarArgs.fm(6, this.uXS.aYq());
        this.uXS.a(paramVarArgs);
      }
      if (this.uXT != null)
      {
        paramVarArgs.fm(7, this.uXT.aYq());
        this.uXT.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.udE);
      paramVarArgs.fk(9, this.uSE);
      paramVarArgs.fk(10, this.uhU);
      paramVarArgs.T(11, this.uhV);
      paramVarArgs.fk(12, this.uYQ);
      paramVarArgs.T(13, this.uXW);
      paramVarArgs.fk(14, this.uZd);
      paramVarArgs.fk(15, this.uKf);
      GMTrace.o(3629113147392L, 27039);
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
      if (this.uKB != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uKB);
      }
      i = i + b.a.a.a.fh(3, this.uZb) + b.a.a.a.c(4, 8, this.uZc);
      paramInt = i;
      if (this.uXS != null) {
        paramInt = i + b.a.a.a.fj(6, this.uXS.aYq());
      }
      i = paramInt;
      if (this.uXT != null) {
        i = paramInt + b.a.a.a.fj(7, this.uXT.aYq());
      }
      paramInt = b.a.a.a.fh(8, this.udE);
      int j = b.a.a.a.fh(9, this.uSE);
      int k = b.a.a.a.fh(10, this.uhU);
      int m = b.a.a.a.S(11, this.uhV);
      int n = b.a.a.a.fh(12, this.uYQ);
      int i1 = b.a.a.a.S(13, this.uXW);
      int i2 = b.a.a.a.fh(14, this.uZd);
      int i3 = b.a.a.a.fh(15, this.uKf);
      GMTrace.o(3629113147392L, 27039);
      return i + paramInt + j + k + m + n + i1 + i2 + i3;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uZc.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uXS == null) {
        throw new b("Not all required fields were included: PeerId");
      }
      if (this.uXT == null) {
        throw new b("Not all required fields were included: CapInfo");
      }
      GMTrace.o(3629113147392L, 27039);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpk localbpk = (bpk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 5: 
      default: 
        GMTrace.o(3629113147392L, 27039);
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
          localbpk.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 2: 
        localbpk.uKB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 3: 
        localbpk.uZb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbpk.uZc.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbpk.uXS = ((bpr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbpk.uXT = ((bpr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 8: 
        localbpk.udE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 9: 
        localbpk.uSE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 10: 
        localbpk.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 11: 
        localbpk.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 12: 
        localbpk.uYQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 13: 
        localbpk.uXW = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3629113147392L, 27039);
        return 0;
      case 14: 
        localbpk.uZd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3629113147392L, 27039);
        return 0;
      }
      localbpk.uKf = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3629113147392L, 27039);
      return 0;
    }
    GMTrace.o(3629113147392L, 27039);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */