package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bls
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
  public azp ues;
  
  public bls()
  {
    GMTrace.i(4039416741888L, 30096);
    GMTrace.o(4039416741888L, 30096);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4039550959616L, 30097);
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
      GMTrace.o(4039550959616L, 30097);
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
      GMTrace.o(4039550959616L, 30097);
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
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(4039550959616L, 30097);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bls localbls = (bls)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4039550959616L, 30097);
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
          localbls.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4039550959616L, 30097);
        return 0;
      case 2: 
        localbls.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4039550959616L, 30097);
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
          localbls.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4039550959616L, 30097);
        return 0;
      case 4: 
        localbls.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4039550959616L, 30097);
        return 0;
      case 5: 
        localbls.uVD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4039550959616L, 30097);
        return 0;
      case 6: 
        localbls.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4039550959616L, 30097);
        return 0;
      case 7: 
        localbls.uVE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4039550959616L, 30097);
        return 0;
      case 8: 
        localbls.tRI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4039550959616L, 30097);
        return 0;
      case 9: 
        localbls.uVF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4039550959616L, 30097);
        return 0;
      }
      localbls.tRF = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4039550959616L, 30097);
      return 0;
    }
    GMTrace.o(4039550959616L, 30097);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */