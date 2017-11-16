package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aes
  extends azh
{
  public String gjb;
  public boolean kCl;
  public LinkedList<uk> tPU;
  public String uuA;
  public String uuB;
  public String uuC;
  public String uuD;
  public boolean uuE;
  public int uuF;
  public String uuG;
  public LinkedList<String> uur;
  public String uus;
  public String uut;
  public boolean uuv;
  public LinkedList<bvp> uuy;
  public LinkedList<bvq> uuz;
  
  public aes()
  {
    GMTrace.i(3696893100032L, 27544);
    this.uuy = new LinkedList();
    this.uuz = new LinkedList();
    this.uur = new LinkedList();
    this.tPU = new LinkedList();
    GMTrace.o(3696893100032L, 27544);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3697027317760L, 27545);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uuA == null) {
        throw new b("Not all required fields were included: championcoverurl");
      }
      if (this.uuB == null) {
        throw new b("Not all required fields were included: championmotto");
      }
      if (this.gjb == null) {
        throw new b("Not all required fields were included: rankid");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.d(2, 8, this.uuy);
      paramVarArgs.d(3, 8, this.uuz);
      paramVarArgs.d(4, 1, this.uur);
      if (this.uuA != null) {
        paramVarArgs.e(5, this.uuA);
      }
      if (this.uuB != null) {
        paramVarArgs.e(6, this.uuB);
      }
      if (this.gjb != null) {
        paramVarArgs.e(7, this.gjb);
      }
      if (this.uuC != null) {
        paramVarArgs.e(8, this.uuC);
      }
      if (this.uus != null) {
        paramVarArgs.e(9, this.uus);
      }
      paramVarArgs.ah(10, this.kCl);
      if (this.uut != null) {
        paramVarArgs.e(11, this.uut);
      }
      paramVarArgs.d(12, 8, this.tPU);
      paramVarArgs.ah(13, this.uuv);
      if (this.uuD != null) {
        paramVarArgs.e(14, this.uuD);
      }
      paramVarArgs.ah(15, this.uuE);
      paramVarArgs.fk(16, this.uuF);
      if (this.uuG != null) {
        paramVarArgs.e(17, this.uuG);
      }
      GMTrace.o(3697027317760L, 27545);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.uuy) + b.a.a.a.c(3, 8, this.uuz) + b.a.a.a.c(4, 1, this.uur);
      paramInt = i;
      if (this.uuA != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uuA);
      }
      i = paramInt;
      if (this.uuB != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uuB);
      }
      paramInt = i;
      if (this.gjb != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.gjb);
      }
      i = paramInt;
      if (this.uuC != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.uuC);
      }
      paramInt = i;
      if (this.uus != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uus);
      }
      i = paramInt + (b.a.a.b.b.a.cK(10) + 1);
      paramInt = i;
      if (this.uut != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.uut);
      }
      i = paramInt + b.a.a.a.c(12, 8, this.tPU) + (b.a.a.b.b.a.cK(13) + 1);
      paramInt = i;
      if (this.uuD != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.uuD);
      }
      i = paramInt + (b.a.a.b.b.a.cK(15) + 1) + b.a.a.a.fh(16, this.uuF);
      paramInt = i;
      if (this.uuG != null) {
        paramInt = i + b.a.a.b.b.a.f(17, this.uuG);
      }
      GMTrace.o(3697027317760L, 27545);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uuy.clear();
      this.uuz.clear();
      this.uur.clear();
      this.tPU.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uuA == null) {
        throw new b("Not all required fields were included: championcoverurl");
      }
      if (this.uuB == null) {
        throw new b("Not all required fields were included: championmotto");
      }
      if (this.gjb == null) {
        throw new b("Not all required fields were included: rankid");
      }
      GMTrace.o(3697027317760L, 27545);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aes localaes = (aes)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3697027317760L, 27545);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaes.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bvp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bvp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaes.uuy.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bvq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bvq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaes.uuz.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 4: 
        localaes.uur.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 5: 
        localaes.uuA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 6: 
        localaes.uuB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 7: 
        localaes.gjb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 8: 
        localaes.uuC = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 9: 
        localaes.uus = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 10: 
        localaes.kCl = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 11: 
        localaes.uut = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new uk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((uk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaes.tPU.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 13: 
        localaes.uuv = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 14: 
        localaes.uuD = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 15: 
        localaes.uuE = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3697027317760L, 27545);
        return 0;
      case 16: 
        localaes.uuF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3697027317760L, 27545);
        return 0;
      }
      localaes.uuG = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3697027317760L, 27545);
      return 0;
    }
    GMTrace.o(3697027317760L, 27545);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\aes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */