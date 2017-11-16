package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class boy
  extends ayx
{
  public String lSX;
  public String uKB;
  public int uKf;
  public long uXW;
  public bpz uYP;
  public int uYQ;
  public int uhU;
  public long uhV;
  
  public boy()
  {
    GMTrace.i(3621194301440L, 26980);
    GMTrace.o(3621194301440L, 26980);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3621328519168L, 26981);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uYP == null) {
        throw new b("Not all required fields were included: ReportData");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uKB != null) {
        paramVarArgs.e(2, this.uKB);
      }
      paramVarArgs.fk(3, this.uhU);
      paramVarArgs.T(4, this.uhV);
      if (this.lSX != null) {
        paramVarArgs.e(6, this.lSX);
      }
      if (this.uYP != null)
      {
        paramVarArgs.fm(8, this.uYP.aYq());
        this.uYP.a(paramVarArgs);
      }
      paramVarArgs.fk(9, this.uYQ);
      paramVarArgs.T(10, this.uXW);
      paramVarArgs.fk(11, this.uKf);
      GMTrace.o(3621328519168L, 26981);
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
      i = i + b.a.a.a.fh(3, this.uhU) + b.a.a.a.S(4, this.uhV);
      paramInt = i;
      if (this.lSX != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lSX);
      }
      i = paramInt;
      if (this.uYP != null) {
        i = paramInt + b.a.a.a.fj(8, this.uYP.aYq());
      }
      paramInt = b.a.a.a.fh(9, this.uYQ);
      int j = b.a.a.a.S(10, this.uXW);
      int k = b.a.a.a.fh(11, this.uKf);
      GMTrace.o(3621328519168L, 26981);
      return i + paramInt + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uYP == null) {
        throw new b("Not all required fields were included: ReportData");
      }
      GMTrace.o(3621328519168L, 26981);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      boy localboy = (boy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      case 5: 
      case 7: 
      default: 
        GMTrace.o(3621328519168L, 26981);
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
          localboy.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621328519168L, 26981);
        return 0;
      case 2: 
        localboy.uKB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3621328519168L, 26981);
        return 0;
      case 3: 
        localboy.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3621328519168L, 26981);
        return 0;
      case 4: 
        localboy.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3621328519168L, 26981);
        return 0;
      case 6: 
        localboy.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3621328519168L, 26981);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bpz();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bpz)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localboy.uYP = ((bpz)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3621328519168L, 26981);
        return 0;
      case 9: 
        localboy.uYQ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3621328519168L, 26981);
        return 0;
      case 10: 
        localboy.uXW = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3621328519168L, 26981);
        return 0;
      }
      localboy.uKf = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3621328519168L, 26981);
      return 0;
    }
    GMTrace.o(3621328519168L, 26981);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\boy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */