package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bnt
  extends ayx
{
  public String jhi;
  public int tRF;
  public int tRI;
  public int tTL;
  public int tWu;
  public String uVD;
  public int uVE;
  public int uVF;
  public int uXB;
  public int uXC;
  public LinkedList<azq> uXD;
  public LinkedList<azp> uXE;
  public azp ues;
  
  public bnt()
  {
    GMTrace.i(3920768270336L, 29212);
    this.uXD = new LinkedList();
    this.uXE = new LinkedList();
    GMTrace.o(3920768270336L, 29212);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3920902488064L, 29213);
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
      if (this.jhi != null) {
        paramVarArgs.e(2, this.jhi);
      }
      if (this.ues != null)
      {
        paramVarArgs.fm(3, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.tWu);
      if (this.uVD != null) {
        paramVarArgs.e(5, this.uVD);
      }
      paramVarArgs.fk(6, this.tTL);
      paramVarArgs.fk(7, this.uVE);
      paramVarArgs.fk(8, this.tRI);
      paramVarArgs.fk(9, this.uVF);
      paramVarArgs.fk(10, this.tRF);
      paramVarArgs.fk(11, this.uXB);
      paramVarArgs.fk(12, this.uXC);
      paramVarArgs.d(13, 8, this.uXD);
      paramVarArgs.d(14, 8, this.uXE);
      GMTrace.o(3920902488064L, 29213);
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
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhi);
      }
      i = paramInt;
      if (this.ues != null) {
        i = paramInt + b.a.a.a.fj(3, this.ues.aYq());
      }
      i += b.a.a.a.fh(4, this.tWu);
      paramInt = i;
      if (this.uVD != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uVD);
      }
      i = b.a.a.a.fh(6, this.tTL);
      int j = b.a.a.a.fh(7, this.uVE);
      int k = b.a.a.a.fh(8, this.tRI);
      int m = b.a.a.a.fh(9, this.uVF);
      int n = b.a.a.a.fh(10, this.tRF);
      int i1 = b.a.a.a.fh(11, this.uXB);
      int i2 = b.a.a.a.fh(12, this.uXC);
      int i3 = b.a.a.a.c(13, 8, this.uXD);
      int i4 = b.a.a.a.c(14, 8, this.uXE);
      GMTrace.o(3920902488064L, 29213);
      return paramInt + i + j + k + m + n + i1 + i2 + i3 + i4;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uXD.clear();
      this.uXE.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3920902488064L, 29213);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bnt localbnt = (bnt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3920902488064L, 29213);
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
          localbnt.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 2: 
        localbnt.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbnt.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 4: 
        localbnt.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 5: 
        localbnt.uVD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 6: 
        localbnt.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 7: 
        localbnt.uVE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 8: 
        localbnt.tRI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 9: 
        localbnt.uVF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 10: 
        localbnt.tRF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 11: 
        localbnt.uXB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 12: 
        localbnt.uXC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3920902488064L, 29213);
        return 0;
      case 13: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbnt.uXD.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3920902488064L, 29213);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbnt.uXE.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3920902488064L, 29213);
      return 0;
    }
    GMTrace.o(3920902488064L, 29213);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bnt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */