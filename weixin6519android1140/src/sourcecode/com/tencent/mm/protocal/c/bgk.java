package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bgk
  extends ayx
{
  public int jib;
  public String lQa;
  public String tPP;
  public int tRC;
  public int tRD;
  public String tRP;
  public azp tTe;
  public int uDk;
  public int uDl;
  public int uEI;
  public bjz uJw;
  public int uSf;
  public int uSg;
  public int udE;
  public String ugH;
  
  public bgk()
  {
    GMTrace.i(3818762797056L, 28452);
    GMTrace.o(3818762797056L, 28452);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3818897014784L, 28453);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jib);
      paramVarArgs.fk(3, this.tRD);
      paramVarArgs.fk(4, this.tRC);
      if (this.tTe != null)
      {
        paramVarArgs.fm(5, this.tTe.aYq());
        this.tTe.a(paramVarArgs);
      }
      if (this.tPP != null) {
        paramVarArgs.e(6, this.tPP);
      }
      paramVarArgs.fk(7, this.uDk);
      paramVarArgs.fk(8, this.uDl);
      if (this.tRP != null) {
        paramVarArgs.e(9, this.tRP);
      }
      paramVarArgs.fk(10, this.uSf);
      paramVarArgs.fk(11, this.udE);
      if (this.uJw != null)
      {
        paramVarArgs.fm(12, this.uJw.aYq());
        this.uJw.a(paramVarArgs);
      }
      if (this.lQa != null) {
        paramVarArgs.e(13, this.lQa);
      }
      paramVarArgs.fk(14, this.uEI);
      if (this.ugH != null) {
        paramVarArgs.e(15, this.ugH);
      }
      paramVarArgs.fk(16, this.uSg);
      GMTrace.o(3818897014784L, 28453);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jib) + b.a.a.a.fh(3, this.tRD) + b.a.a.a.fh(4, this.tRC);
      paramInt = i;
      if (this.tTe != null) {
        paramInt = i + b.a.a.a.fj(5, this.tTe.aYq());
      }
      i = paramInt;
      if (this.tPP != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.tPP);
      }
      i = i + b.a.a.a.fh(7, this.uDk) + b.a.a.a.fh(8, this.uDl);
      paramInt = i;
      if (this.tRP != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.tRP);
      }
      i = paramInt + b.a.a.a.fh(10, this.uSf) + b.a.a.a.fh(11, this.udE);
      paramInt = i;
      if (this.uJw != null) {
        paramInt = i + b.a.a.a.fj(12, this.uJw.aYq());
      }
      i = paramInt;
      if (this.lQa != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.lQa);
      }
      i += b.a.a.a.fh(14, this.uEI);
      paramInt = i;
      if (this.ugH != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.ugH);
      }
      i = b.a.a.a.fh(16, this.uSg);
      GMTrace.o(3818897014784L, 28453);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tTe == null) {
        throw new b("Not all required fields were included: Buffer");
      }
      GMTrace.o(3818897014784L, 28453);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bgk localbgk = (bgk)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3818897014784L, 28453);
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
          localbgk.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 2: 
        localbgk.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 3: 
        localbgk.tRD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 4: 
        localbgk.tRC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbgk.tTe = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 6: 
        localbgk.tPP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 7: 
        localbgk.uDk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 8: 
        localbgk.uDl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 9: 
        localbgk.tRP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 10: 
        localbgk.uSf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 11: 
        localbgk.udE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bjz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bjz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbgk.uJw = ((bjz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 13: 
        localbgk.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 14: 
        localbgk.uEI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      case 15: 
        localbgk.ugH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3818897014784L, 28453);
        return 0;
      }
      localbgk.uSg = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3818897014784L, 28453);
      return 0;
    }
    GMTrace.o(3818897014784L, 28453);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bgk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */