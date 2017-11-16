package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class avi
  extends azh
{
  public int kBk;
  public String kBl;
  public int mjL;
  public String mjM;
  public int mka;
  public int uKC;
  public int uKE;
  public int uKF;
  public int uhU;
  public long uhV;
  
  public avi()
  {
    GMTrace.i(3794872041472L, 28274);
    GMTrace.o(3794872041472L, 28274);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3795006259200L, 28275);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.uhU);
      paramVarArgs.T(4, this.uhV);
      paramVarArgs.fk(5, this.uKE);
      paramVarArgs.fk(6, this.uKC);
      paramVarArgs.fk(7, this.mka);
      paramVarArgs.fk(8, this.uKF);
      paramVarArgs.fk(9, this.kBk);
      if (this.kBl != null) {
        paramVarArgs.e(10, this.kBl);
      }
      paramVarArgs.fk(11, this.mjL);
      if (this.mjM != null) {
        paramVarArgs.e(12, this.mjM);
      }
      GMTrace.o(3795006259200L, 28275);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(3, this.uhU) + b.a.a.a.S(4, this.uhV) + b.a.a.a.fh(5, this.uKE) + b.a.a.a.fh(6, this.uKC) + b.a.a.a.fh(7, this.mka) + b.a.a.a.fh(8, this.uKF) + b.a.a.a.fh(9, this.kBk);
      paramInt = i;
      if (this.kBl != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.kBl);
      }
      i = paramInt + b.a.a.a.fh(11, this.mjL);
      paramInt = i;
      if (this.mjM != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.mjM);
      }
      GMTrace.o(3795006259200L, 28275);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3795006259200L, 28275);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      avi localavi = (avi)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 2: 
      default: 
        GMTrace.o(3795006259200L, 28275);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localavi.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 3: 
        localavi.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 4: 
        localavi.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 5: 
        localavi.uKE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 6: 
        localavi.uKC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 7: 
        localavi.mka = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 8: 
        localavi.uKF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 9: 
        localavi.kBk = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 10: 
        localavi.kBl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      case 11: 
        localavi.mjL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795006259200L, 28275);
        return 0;
      }
      localavi.mjM = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3795006259200L, 28275);
      return 0;
    }
    GMTrace.o(3795006259200L, 28275);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\avi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */