package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class anp
  extends ayx
{
  public int lQc;
  public String nFH;
  public int tYv;
  public int tYw;
  public int uCA;
  public azp uCB;
  public int uCC;
  public int uCD;
  public int uCE;
  public int uCF;
  public int uCG;
  public String uCH;
  public String uCI;
  public String uCJ;
  public String uCs;
  public String uCt;
  public String uCu;
  public int uCv;
  public azp uCw;
  public int uCx;
  public int uCy;
  public int uCz;
  public int usj;
  
  public anp()
  {
    GMTrace.i(4016733945856L, 29927);
    GMTrace.o(4016733945856L, 29927);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4016868163584L, 29928);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uCw == null) {
        throw new b("Not all required fields were included: DataBuffer");
      }
      if (this.uCB == null) {
        throw new b("Not all required fields were included: ThumbData");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uCs != null) {
        paramVarArgs.e(2, this.uCs);
      }
      if (this.uCt != null) {
        paramVarArgs.e(3, this.uCt);
      }
      if (this.uCu != null) {
        paramVarArgs.e(4, this.uCu);
      }
      paramVarArgs.fk(5, this.lQc);
      paramVarArgs.fk(6, this.uCv);
      if (this.uCw != null)
      {
        paramVarArgs.fm(7, this.uCw.aYq());
        this.uCw.a(paramVarArgs);
      }
      paramVarArgs.fk(8, this.uCx);
      paramVarArgs.fk(9, this.uCy);
      paramVarArgs.fk(10, this.uCz);
      paramVarArgs.fk(11, this.uCA);
      if (this.uCB != null)
      {
        paramVarArgs.fm(12, this.uCB.aYq());
        this.uCB.a(paramVarArgs);
      }
      paramVarArgs.fk(13, this.uCC);
      paramVarArgs.fk(14, this.uCD);
      paramVarArgs.fk(15, this.uCE);
      paramVarArgs.fk(16, this.uCF);
      paramVarArgs.fk(17, this.usj);
      paramVarArgs.fk(18, this.uCG);
      if (this.uCH != null) {
        paramVarArgs.e(19, this.uCH);
      }
      if (this.nFH != null) {
        paramVarArgs.e(20, this.nFH);
      }
      paramVarArgs.fk(21, this.tYw);
      paramVarArgs.fk(22, this.tYv);
      if (this.uCI != null) {
        paramVarArgs.e(23, this.uCI);
      }
      if (this.uCJ != null) {
        paramVarArgs.e(24, this.uCJ);
      }
      GMTrace.o(4016868163584L, 29928);
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
      if (this.uCs != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uCs);
      }
      i = paramInt;
      if (this.uCt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uCt);
      }
      paramInt = i;
      if (this.uCu != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uCu);
      }
      i = paramInt + b.a.a.a.fh(5, this.lQc) + b.a.a.a.fh(6, this.uCv);
      paramInt = i;
      if (this.uCw != null) {
        paramInt = i + b.a.a.a.fj(7, this.uCw.aYq());
      }
      i = paramInt + b.a.a.a.fh(8, this.uCx) + b.a.a.a.fh(9, this.uCy) + b.a.a.a.fh(10, this.uCz) + b.a.a.a.fh(11, this.uCA);
      paramInt = i;
      if (this.uCB != null) {
        paramInt = i + b.a.a.a.fj(12, this.uCB.aYq());
      }
      i = paramInt + b.a.a.a.fh(13, this.uCC) + b.a.a.a.fh(14, this.uCD) + b.a.a.a.fh(15, this.uCE) + b.a.a.a.fh(16, this.uCF) + b.a.a.a.fh(17, this.usj) + b.a.a.a.fh(18, this.uCG);
      paramInt = i;
      if (this.uCH != null) {
        paramInt = i + b.a.a.b.b.a.f(19, this.uCH);
      }
      i = paramInt;
      if (this.nFH != null) {
        i = paramInt + b.a.a.b.b.a.f(20, this.nFH);
      }
      i = i + b.a.a.a.fh(21, this.tYw) + b.a.a.a.fh(22, this.tYv);
      paramInt = i;
      if (this.uCI != null) {
        paramInt = i + b.a.a.b.b.a.f(23, this.uCI);
      }
      i = paramInt;
      if (this.uCJ != null) {
        i = paramInt + b.a.a.b.b.a.f(24, this.uCJ);
      }
      GMTrace.o(4016868163584L, 29928);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uCw == null) {
        throw new b("Not all required fields were included: DataBuffer");
      }
      if (this.uCB == null) {
        throw new b("Not all required fields were included: ThumbData");
      }
      GMTrace.o(4016868163584L, 29928);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      anp localanp = (anp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4016868163584L, 29928);
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
          localanp.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 2: 
        localanp.uCs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 3: 
        localanp.uCt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 4: 
        localanp.uCu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 5: 
        localanp.lQc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 6: 
        localanp.uCv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
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
          localanp.uCw = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 8: 
        localanp.uCx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 9: 
        localanp.uCy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 10: 
        localanp.uCz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 11: 
        localanp.uCA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localanp.uCB = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 13: 
        localanp.uCC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 14: 
        localanp.uCD = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 15: 
        localanp.uCE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 16: 
        localanp.uCF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 17: 
        localanp.usj = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 18: 
        localanp.uCG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 19: 
        localanp.uCH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 20: 
        localanp.nFH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 21: 
        localanp.tYw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 22: 
        localanp.tYv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      case 23: 
        localanp.uCI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4016868163584L, 29928);
        return 0;
      }
      localanp.uCJ = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(4016868163584L, 29928);
      return 0;
    }
    GMTrace.o(4016868163584L, 29928);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\anp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */