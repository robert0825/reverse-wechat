package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ang
  extends ayx
{
  public String gCA;
  public String jhm;
  public String kBg;
  public String kBh;
  public int lQE;
  public int tMZ;
  public ep tSu;
  public String tSv;
  public String tSw;
  public int tSx;
  public String tSy;
  public String tSz;
  public String tWD;
  public String tWE;
  public String uCe;
  public String uCf;
  public String uCg;
  public int uCh;
  public String ugv;
  public String unO;
  
  public ang()
  {
    GMTrace.i(13576660058112L, 101154);
    GMTrace.o(13576660058112L, 101154);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13576794275840L, 101155);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tSu != null)
      {
        paramVarArgs.fm(2, this.tSu.aYq());
        this.tSu.a(paramVarArgs);
      }
      if (this.tSv != null) {
        paramVarArgs.e(3, this.tSv);
      }
      if (this.tSw != null) {
        paramVarArgs.e(4, this.tSw);
      }
      paramVarArgs.fk(5, this.tSx);
      if (this.tSy != null) {
        paramVarArgs.e(6, this.tSy);
      }
      if (this.gCA != null) {
        paramVarArgs.e(7, this.gCA);
      }
      if (this.jhm != null) {
        paramVarArgs.e(8, this.jhm);
      }
      if (this.tSz != null) {
        paramVarArgs.e(9, this.tSz);
      }
      if (this.kBh != null) {
        paramVarArgs.e(10, this.kBh);
      }
      if (this.kBg != null) {
        paramVarArgs.e(11, this.kBg);
      }
      paramVarArgs.fk(13, this.tMZ);
      paramVarArgs.fk(14, this.lQE);
      if (this.tWE != null) {
        paramVarArgs.e(15, this.tWE);
      }
      if (this.tWD != null) {
        paramVarArgs.e(16, this.tWD);
      }
      if (this.uCe != null) {
        paramVarArgs.e(17, this.uCe);
      }
      if (this.ugv != null) {
        paramVarArgs.e(18, this.ugv);
      }
      if (this.unO != null) {
        paramVarArgs.e(19, this.unO);
      }
      if (this.uCf != null) {
        paramVarArgs.e(20, this.uCf);
      }
      if (this.uCg != null) {
        paramVarArgs.e(21, this.uCg);
      }
      paramVarArgs.fk(22, this.uCh);
      GMTrace.o(13576794275840L, 101155);
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
      if (this.tSu != null) {
        paramInt = i + b.a.a.a.fj(2, this.tSu.aYq());
      }
      i = paramInt;
      if (this.tSv != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tSv);
      }
      paramInt = i;
      if (this.tSw != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tSw);
      }
      i = paramInt + b.a.a.a.fh(5, this.tSx);
      paramInt = i;
      if (this.tSy != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tSy);
      }
      i = paramInt;
      if (this.gCA != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.gCA);
      }
      paramInt = i;
      if (this.jhm != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.jhm);
      }
      i = paramInt;
      if (this.tSz != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tSz);
      }
      paramInt = i;
      if (this.kBh != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.kBh);
      }
      i = paramInt;
      if (this.kBg != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.kBg);
      }
      i = i + b.a.a.a.fh(13, this.tMZ) + b.a.a.a.fh(14, this.lQE);
      paramInt = i;
      if (this.tWE != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.tWE);
      }
      i = paramInt;
      if (this.tWD != null) {
        i = paramInt + b.a.a.b.b.a.f(16, this.tWD);
      }
      paramInt = i;
      if (this.uCe != null) {
        paramInt = i + b.a.a.b.b.a.f(17, this.uCe);
      }
      i = paramInt;
      if (this.ugv != null) {
        i = paramInt + b.a.a.b.b.a.f(18, this.ugv);
      }
      paramInt = i;
      if (this.unO != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.unO);
      }
      i = paramInt;
      if (this.uCf != null) {
        i = paramInt + b.a.a.b.b.a.f(20, this.uCf);
      }
      paramInt = i;
      if (this.uCg != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.uCg);
      }
      i = b.a.a.a.fh(22, this.uCh);
      GMTrace.o(13576794275840L, 101155);
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
      GMTrace.o(13576794275840L, 101155);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ang localang = (ang)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 12: 
      default: 
        GMTrace.o(13576794275840L, 101155);
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
          localang.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ep();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ep)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localang.tSu = ((ep)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 3: 
        localang.tSv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 4: 
        localang.tSw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 5: 
        localang.tSx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 6: 
        localang.tSy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 7: 
        localang.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 8: 
        localang.jhm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 9: 
        localang.tSz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 10: 
        localang.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 11: 
        localang.kBg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 13: 
        localang.tMZ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 14: 
        localang.lQE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 15: 
        localang.tWE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 16: 
        localang.tWD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 17: 
        localang.uCe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 18: 
        localang.ugv = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 19: 
        localang.unO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 20: 
        localang.uCf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      case 21: 
        localang.uCg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13576794275840L, 101155);
        return 0;
      }
      localang.uCh = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13576794275840L, 101155);
      return 0;
    }
    GMTrace.o(13576794275840L, 101155);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ang.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */